package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.prot_mgmt_overall;
import com.iucn.whp.dbservice.model.state_trend_whvalues;
import com.iucn.whp.dbservice.model.threat_summary_overall;
import com.iucn.whp.dbservice.service.*;
import com.iucn.whp.dto.Conservationoutlook;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ConservationOutlookTab extends AssessmentTabBuilder {

    private final static String CONSERVATION_OUTLOOK_TAB_TITLE = GetterUtil.getString(PortletProps.get("conservation.outlook.tab.title"));
    private final static String CONSERVATION_OUTLOOK_TABLE_HEADER = GetterUtil.getString(PortletProps.get("conservation.outlook.table.header"));
    private final static String CONSERVATION_OUTLOOK_TAB_DESCRIPTION = GetterUtil.getString(PortletProps.get("conservation.outlook.table.description"));

    private static final Logger _logger = Logger.getLogger(ConservationOutlookTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public ConservationOutlookTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), CONSERVATION_OUTLOOK_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), CONSERVATION_OUTLOOK_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), CONSERVATION_OUTLOOK_TAB_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createConservationOutlookTable();

        addBreak(document.createParagraph());
    }

    private void createConservationOutlookTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(4000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(10000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Topics", true);
        createTableHeaderColumn(tableRow, "Justification of Assessment", false);
        createTableHeaderColumn(tableRow, "Assessment", false);

        String stateWh = "";
        String justificationWh = "";

        String justificationOverallThreat = "";
        String stateOverall = "";

        String justificationMgmOverall = "";
        String stateMgmOverall = "";

        String justification = "";
        String assessment = "";

        List<state_trend_whvalues> stateTrendWhList = new ArrayList<>();
        List<threat_summary_overall> threatOverallList = new ArrayList<>();
        List<prot_mgmt_overall> protectionOverallList = new ArrayList<>();
        List<Conservationoutlook> conservationOutlookList = new ArrayList<>();

        try {

            stateTrendWhList = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(versionId);

            if (stateTrendWhList != null && stateTrendWhList.size() > 0) {
                justificationWh = stateTrendWhList.get(0).getJustification();

                long state = stateTrendWhList.get(0).getState_id();

                if (state > 0) {
                    stateWh = state_lkpLocalServiceUtil.getstate_lkp(state).getState();
                }
            }

            threatOverallList = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(versionId);

            if (threatOverallList != null && threatOverallList.size() > 0) {
                justificationOverallThreat = threatOverallList.get(0).getOverall_threat();

                long threatRating = threatOverallList.get(0).getThreat_rating();

                if (threatRating > 0) {
                    stateOverall = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatRating).getRating();
                }
            }

            protectionOverallList = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(versionId);

            if (protectionOverallList != null && protectionOverallList.size() > 0) {
                justificationMgmOverall = protectionOverallList.get(0).getJustification();

                long rating = protectionOverallList.get(0).getRating();

                if (rating > 0) {
                    stateMgmOverall = protection_management_ratings_lkpLocalServiceUtil
                            .getprotection_management_ratings_lkp(rating).getPm_rating();
                }
            }

            List<conservation_outlook> conservationOutlooks = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(versionId);

            for (conservation_outlook conservation_out : conservationOutlooks) {
                Conservationoutlook conservationOutlookObj = new Conservationoutlook();
                conservationOutlookObj.setConservationoutlook(conservation_out);
                conservationOutlookObj.setConservationoutlookrating(conservation_outlook_rating_lkpLocalServiceUtil.getconservation_outlook_rating_lkp(conservation_out.getRating()));

                conservationOutlookList.add(conservationOutlookObj);
            }

            int i = 0;

            for (Conservationoutlook conservationoutlook : conservationOutlookList) {
                justification = justification.concat(conservationoutlook.getConservationoutlook().getJustification());
                assessment = assessment.concat(conservationoutlook.getConservationoutlookrating().getCo_rating());

                if (i != 0) {
                    justification = "/".concat(justification);
                    assessment = "/".concat(assessment);
                }

                i++;
            }

        } catch (Exception e) {
            _logger.error("Error occurs during getting Conservation Outlook Values: " + e.getMessage(), e);
        }

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Current State Trend of World Heritage values", false, false);
        addTableCell(tableRow.getCell(1), justificationWh, true, false);
        addTableCell(tableRow.getCell(2), stateWh, true, false);

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Overall threats", false, false);
        addTableCell(tableRow.getCell(1), justificationOverallThreat, true, false);
        addTableCell(tableRow.getCell(2), stateOverall, true, false);

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Overall protection and management", false, false);
        addTableCell(tableRow.getCell(1), justificationMgmOverall, true, false);
        addTableCell(tableRow.getCell(2), stateMgmOverall, true, false);

        tableRow = table.createRow();
        addConservationOutlookRow(tableRow.getCell(0), "Assessment of Conservation Outlook", false, false);
        addConservationOutlookRow(tableRow.getCell(1), justification, true, false);
        addConservationOutlookRow(tableRow.getCell(2), assessment, true, false);
    }

    private XWPFTableCell addConservationOutlookRow(XWPFTableCell tableCell, String value, boolean dynamic, boolean center) {

        XWPFParagraph paragraph = tableCell.getParagraphs().get(0);

        if (center) {
            paragraph.setAlignment(ParagraphAlignment.CENTER);
        }

        // create a run to contain the content
        XWPFRun run = paragraph.createRun();
        run.setText(value);
        run.setBold(true);

        if (dynamic) {
            run.setColor(BLUE);
        }

        tableCell.setColor(GREY);

        return tableCell;

    }

    public CustomXWPFDocument getDocument() {
        return document;
    }

    public void setDocument(CustomXWPFDocument document) {
        this.document = document;
    }

    public long getVersionId() {
        return versionId;
    }

    public void setVersionId(long versionId) {
        this.versionId = versionId;
    }
}
