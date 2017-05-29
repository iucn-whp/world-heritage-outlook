package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.current_state_trend;
import com.iucn.whp.dbservice.model.state_trend_biodivvals;
import com.iucn.whp.dbservice.model.state_trend_whvalues;
import com.iucn.whp.dbservice.model.trend_lkp;
import com.iucn.whp.dbservice.service.*;
import com.iucn.whp.dto.AssessmentTrends;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssessingValuesTab extends AssessmentTabBuilder {

    private final static String ASSESSING_TAB_TITLE = GetterUtil.getString(PortletProps.get("assessing.tab.title"));
    private final static String ASSESSING_CURRENT_STATE_TABLE_HEADER = GetterUtil.getString(PortletProps.get("assessing.current.state.table.header"));
    private final static String ASSESSING_CURRENT_STATE_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("assessing.current.state.table.description"));
    private final static String ASSESSING_SUMMARY_VALUES_TABLE_HEADER = GetterUtil.getString(PortletProps.get("assessing.summary.values.table.header"));


    private static final Logger _logger = Logger.getLogger(AssessingValuesTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public AssessingValuesTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), ASSESSING_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), ASSESSING_CURRENT_STATE_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), ASSESSING_CURRENT_STATE_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createCurrentStateAndTrendTable();

        row = createDocumentRow(document.createParagraph(), ASSESSING_SUMMARY_VALUES_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        createSummaryValuesTable();

        addBreak(document.createParagraph());
    }

    private void createCurrentStateAndTrendTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2500));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(6000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "World Heritage Values", true);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "Assessment", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "Trend (Improving/stable/deteriorating/data deficient)", false);

        mergeCellHorizontally(tableRow, 0, 2);
        mergeCellHorizontally(tableRow, 3, 7);

        tableRow = table.createRow();

        addTableCell(tableRow.getCell(0), "No.", false, false, true);
        addTableCell(tableRow.getCell(1), "Values", false, false, true);
        addTableCell(tableRow.getCell(2), "Justification of Assessment", false, false, true);
        addTableCell(tableRow.getCell(3), "Good", false, false, true);
        addTableCell(tableRow.getCell(4), "Low Concern", false, false, true);
        addTableCell(tableRow.getCell(5), "High Concern", false, false, true);
        addTableCell(tableRow.getCell(6), "Critical", false, false, true);
        addTableCell(tableRow.getCell(7), "Data deficient", false, false, true);
        addTableCell(tableRow.getCell(8), "", false, false, true);

        mergeCellVertically(table, 8, 0, 1);

        List<AssessmentTrends> assessingValues = getAssessingValues();

        int bioDivValuesCount = 0;

        for (AssessmentTrends assessmentTrends : assessingValues) {

            if (assessmentTrends.isIs_Biodiv_value()) {
                bioDivValuesCount++;
            } else {
                tableRow = table.createRow();

                addTableCell(tableRow.getCell(0), String.valueOf(assessmentTrends.getCount()), true, false);
                addTableCell(tableRow.getCell(1), assessmentTrends.getWhvalue(), true, false);
                addTableCell(tableRow.getCell(2), assessmentTrends.getCurrentstatetrend().getJustification(), true, false);

                addTableCell(tableRow.getCell(3), 1 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(tableRow.getCell(4), 2 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(tableRow.getCell(5), 3 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(tableRow.getCell(6), 4 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(tableRow.getCell(7), 5 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);

                trend_lkp trend = assessmentTrends.getTrend();
                String trendValue = trend == null ? "" : trend.getTrend();

                addTableCell(tableRow.getCell(8), trendValue, true, false);
            }
        }

        if (bioDivValuesCount > 0) {
            createOtherImportantBioDivValuesTable(assessingValues);
        }

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();
    }

    private void createOtherImportantBioDivValuesTable(List<AssessmentTrends> assessingValues) {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2500));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(6000));

        //create first row
        XWPFTableRow row = table.getRow(0);

        createTableHeaderColumn(row, "No.", true);
        createTableHeaderColumn(row, "Other Important Biodiversity Values", false);
        createTableHeaderColumn(row, "Justification of Assessment", false);
        createTableHeaderColumn(row, "Good", false);
        createTableHeaderColumn(row, "Low Concern", false);
        createTableHeaderColumn(row, "High Concern", false);
        createTableHeaderColumn(row, "Critical", false);
        createTableHeaderColumn(row, "Data deficient", false);
        createTableHeaderColumn(row, "Trend (Improving/stable/deteriorating/data deficient)", false);

        for (AssessmentTrends assessmentTrends : assessingValues) {
            if (assessmentTrends.isIs_Biodiv_value()) {

                trend_lkp trend = assessmentTrends.getTrend();
                String trendValue = trend == null ? "" : trend.getTrend();

                row = table.createRow();

                addTableCell(row.getCell(0), String.valueOf(assessmentTrends.getCount()), true, false);
                addTableCell(row.getCell(1), assessmentTrends.getWhvalue(), true, false);
                addTableCell(row.getCell(2), assessmentTrends.getCurrentstatetrend().getJustification(), true, false);

                addTableCell(row.getCell(3), 1 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(row.getCell(4), 2 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(row.getCell(5), 3 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(row.getCell(6), 4 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);
                addTableCell(row.getCell(7), 5 == assessmentTrends.getCurrentstatetrend().getState_id() ? "x" : "", true, true);

                addTableCell(row.getCell(8), trendValue, true, false);
            }
        }
    }

    private List<AssessmentTrends> getAssessingValues() {

        List<current_state_trend> currentStateTrends = null;
        List<AssessmentTrends> lstData = new ArrayList<AssessmentTrends>();

        int whCount = 0;
        int bioDivCount = 0;

        try {

            currentStateTrends = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(versionId);

            AssessmentTrends assessmentTrends = null;

            Collections.sort(currentStateTrends);

            for (current_state_trend aLstcurrent_state_trend : currentStateTrends) {

                whCount++;

                assessmentTrends = new AssessmentTrends();
                assessmentTrends.setCurrentstatetrend(aLstcurrent_state_trend);

                boolean isBioDivValue = aLstcurrent_state_trend.getIs_biodiv_whval();

                try {
                    if (aLstcurrent_state_trend.getState_id() > 0 && aLstcurrent_state_trend.getTrend_id() > 0) {
                        assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(aLstcurrent_state_trend.getState_id()));
                        assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(aLstcurrent_state_trend.getTrend_id()));
                    }

                    long valueId = aLstcurrent_state_trend.getVn();

                    String whValue = isBioDivValue
                            ? biodiversity_valuesLocalServiceUtil.getbiodiversity_values(valueId).getValue()
                            : assessment_whvaluesLocalServiceUtil.getassessment_whvalues(valueId).getValues();

                    if (isBioDivValue) {
                        bioDivCount ++;
                    }

                    assessmentTrends.setWhvalue(whValue);
                    assessmentTrends.setCount(isBioDivValue ? bioDivCount : whCount);
                    assessmentTrends.setIs_Biodiv_value(isBioDivValue);
                    lstData.add(assessmentTrends);
                } catch (Exception e) {
                    _logger.error(e.getMessage(), e);
                }
            }

        } catch (Exception e) {
            _logger.error(e.getMessage(), e);
        }

        return lstData;
    }

    private void createSummaryValuesTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(4000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(8000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Values", true);
        createTableHeaderColumn(tableRow, "Justification of Assessment", false);
        createTableHeaderColumn(tableRow, "Assessment ", "Good/low concern/ high concern/ critical/ data deficient");
        createTableHeaderColumn(tableRow, "Trend ", "Improving/stable/deteriorating/data deficient");

        List<state_trend_whvalues> lststate_trendWH = null;
        List<state_trend_biodivvals> bioDivValues = null;

        String trendWh = "";
        String stateWh = "";
        String justificationWh = "";

        String trendBio = "";
        String stateBio = "";
        String justificationBio = "";

        try {

            lststate_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(versionId);

            if (lststate_trendWH.size() > 0) {
                state_trend_whvalues stateTrendWhValue = lststate_trendWH.get(0);

                if (stateTrendWhValue.getState_id() > 0) {
                    stateWh = state_lkpLocalServiceUtil.getstate_lkp(stateTrendWhValue.getState_id()).getState();
                    trendWh = trend_lkpLocalServiceUtil.gettrend_lkp(stateTrendWhValue.getTrend_id()).getTrend();
                    justificationWh = stateTrendWhValue.getJustification();
                }
            }

            bioDivValues = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(versionId);

            if (bioDivValues != null && bioDivValues.size() > 0) {
                state_trend_biodivvals stateTrendBioDivVal = bioDivValues.get(0);

                if (stateTrendBioDivVal.getState_id() > 0) {
                    stateBio = state_lkpLocalServiceUtil.getstate_lkp(stateTrendBioDivVal.getState_id()).getState();
                    trendBio = trend_lkpLocalServiceUtil.gettrend_lkp(stateTrendBioDivVal.getTrend_id()).getTrend();
                    justificationBio = stateTrendBioDivVal.getJustification();
                }
            }


        } catch (Exception e) {
            _logger.error("Error getting Summary Values: " + e.getMessage(), e);
        }

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Assessment of the current state and trend of World Heritage values", false, false);
        addTableCell(tableRow.getCell(1), justificationWh, true, false);
        addTableCell(tableRow.getCell(2), stateWh, true, false);
        addTableCell(tableRow.getCell(3), trendWh, true, false);

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Assessment of the current state and trend of other important biodiversity values (if applicable)", false, false);
        addTableCell(tableRow.getCell(1), justificationBio, true, false);
        addTableCell(tableRow.getCell(2), stateBio, true, false);
        addTableCell(tableRow.getCell(3), trendBio, true, false);
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
