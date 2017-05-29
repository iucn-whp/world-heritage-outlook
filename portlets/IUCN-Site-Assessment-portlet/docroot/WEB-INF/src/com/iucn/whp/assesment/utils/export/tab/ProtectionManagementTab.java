package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.math.BigInteger;
import java.util.*;

public class ProtectionManagementTab extends AssessmentTabBuilder {

    private final static String PROTECTION_MANAGEMENT_TAB_TITLE = GetterUtil.getString(PortletProps.get("protection.management.tab.title"));
    private final static String PROTECTION_MANAGEMENT_TABLE_HEADER = GetterUtil.getString(PortletProps.get("protection.management.table.header"));
    private final static String PROTECTION_MANAGEMENT_DESCRIPTION = GetterUtil.getString(PortletProps.get("protection.management.table.description"));
    private final static String OVERALL_ASSESSMENT_PROTECTION_TABLE_HEADER = GetterUtil.getString(PortletProps.get("overall.assessment.protection.table.header"));

    private static final Logger _logger = Logger.getLogger(ProtectionManagementTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public ProtectionManagementTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), PROTECTION_MANAGEMENT_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), PROTECTION_MANAGEMENT_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), PROTECTION_MANAGEMENT_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createProtectionManagementTable();

        row = createDocumentRow(document.createParagraph(), OVERALL_ASSESSMENT_PROTECTION_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        createOverallAssessmentOfProtectionTable();

        addBreak(document.createParagraph());
    }

    private void createProtectionManagementTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(3000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(7000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Topics", true);
        createTableHeaderColumn(tableRow, "Justification of Assessment", false);
        createTableHeaderColumn(tableRow, "Highly Effective", false);
        createTableHeaderColumn(tableRow, "Mostly Effective", false);
        createTableHeaderColumn(tableRow, "Some Concern", false);
        createTableHeaderColumn(tableRow, "Serious Concern", false);
        createTableHeaderColumn(tableRow, "Data deficient", false);

        String topic = "";

        try {

            Set<protection_management> protection_managements = new TreeSet<>();

            protection_managements.addAll(protection_managementLocalServiceUtil.findByAssessementVersionId(versionId));

            List<protection_management> testList = new ArrayList<>();

            testList.addAll(protection_managements);

            if (testList.size() > 0) {

                for (protection_management protectionManagement : testList) {

                    if (protectionManagement.getTopic_id() == 15) continue;

                    if (protectionManagement.getTopic_id() > 0) {
                        protection_mgmt_checklist_lkp protectionManagementCheckLists = protection_mgmt_checklist_lkpLocalServiceUtil
                                .fetchprotection_mgmt_checklist_lkp(protectionManagement.getTopic_id());

                        topic = protectionManagementCheckLists.getTopic();
                    }

                    tableRow = table.createRow();

                    addTableCell(tableRow.getCell(0), topic, false, false);
                    addTableCell(tableRow.getCell(1), protectionManagement.getJustification(), true, false);
                    addTableCell(tableRow.getCell(2), protectionManagement.getRating() == 1 ? "x" : "", true, true);
                    addTableCell(tableRow.getCell(3), protectionManagement.getRating() == 2 ? "x" : "", true, true);
                    addTableCell(tableRow.getCell(4), protectionManagement.getRating() == 3 ? "x" : "", true, true);
                    addTableCell(tableRow.getCell(5), protectionManagement.getRating() == 4 ? "x" : "", true, true);
                    addTableCell(tableRow.getCell(6), protectionManagement.getRating() == 5 ? "x" : "", true, true);

                }
            }
        } catch (SystemException e) {
            _logger.error("Error populating Protection and management values information" + e.getMessage(), e);
        }


        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();

    }

    private void createOverallAssessmentOfProtectionTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(4000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(9000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Topics", true);
        createTableHeaderColumn(tableRow, "Justification of Assessment", false);
        createTableHeaderColumn(tableRow, "Assessment ", "Highly effective/mostly effective/some concern/serious concern/data deficient");

        String pmRating = "";
        String effectivePmJustification = "";

        try {
            List<effective_prot_mgmt_iothreats> effectiveProtectionManagementThreatsList = effective_prot_mgmt_iothreatsLocalServiceUtil
                    .geteffectivemanagthreatByVersion(versionId);

            if (effectiveProtectionManagementThreatsList != null && effectiveProtectionManagementThreatsList.size() > 0) {

                effective_prot_mgmt_iothreats effectiveProtectionManagementThreat = effectiveProtectionManagementThreatsList.get(0);

                if (effectiveProtectionManagementThreat.getRating() > 0) {
                    protection_management_ratings_lkp protectionManagementRatings = protection_management_ratings_lkpLocalServiceUtil
                            .getRatingByProtRating(effectiveProtectionManagementThreat.getRating());

                    pmRating = protectionManagementRatings.getPm_rating();
                }

                effectivePmJustification = effectiveProtectionManagementThreat.getJustification();
            }

        } catch (PortalException | SystemException e) {
            _logger.error("Error populating Assessment of the effectiveness of protection and management information" + e.getMessage(), e);
        }

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Assessment of the effectiveness of protection and management in addressing threats outside the site", false, false);
        addTableCell(tableRow.getCell(1), effectivePmJustification, true, false);
        addTableCell(tableRow.getCell(2), pmRating, true, false);

        String rating = "";
        String justification = "";

        try {

            prot_mgmt_overall objoverall = null;

            List<prot_mgmt_overall> prot_overallList = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(versionId);

            if (prot_overallList != null && prot_overallList.size() > 0) {
                objoverall = prot_overallList.get(0);

                Map<Long, String> ratingMap = new HashMap<Long, String>();

                List<protection_management_ratings_lkp> protection_management_ratings_lkpList = protection_management_ratings_lkpLocalServiceUtil.findAll();
                for (protection_management_ratings_lkp protection_management_ratings_lkptemp : protection_management_ratings_lkpList) {
                    ratingMap.put(protection_management_ratings_lkptemp.getId(), protection_management_ratings_lkptemp.getPm_rating());
                }

                rating = ratingMap.get(objoverall.getRating());
                justification = objoverall.getJustification();
            }

        } catch (Exception e) {
            _logger.error("Error populating Overall assessment of protection and management information" + e.getMessage(), e);
        }

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Overall assessment of protection and management", false, false);
        addTableCell(tableRow.getCell(1), justification, true, false);
        addTableCell(tableRow.getCell(2), rating, true, false);

        String description = "";

        try {
            List<prot_mgmt_best_practices> bestPracticesList = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(versionId);

            if (bestPracticesList != null && bestPracticesList.size() > 0) {
                prot_mgmt_best_practices bestPractice = bestPracticesList.get(0);

                description = bestPractice.getDescription().isEmpty() ? "No Justification available" : bestPractice.getDescription();
            }

        } catch (SystemException e) {
            _logger.error("Error populating best practice information cause : " + e.getMessage(), e);
        }

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Best practice Examples", false, false);
        addTableCell(tableRow.getCell(1), description, true, false);
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
