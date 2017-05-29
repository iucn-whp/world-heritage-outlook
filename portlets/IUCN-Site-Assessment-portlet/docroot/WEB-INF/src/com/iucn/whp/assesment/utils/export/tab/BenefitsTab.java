package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.iucn.whp.dto.BenefitDTO;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;

import java.math.BigInteger;
import java.util.*;

public class BenefitsTab extends AssessmentTabBuilder {

    private final static String BENEFITS_TAB_TITLE = GetterUtil.getString(PortletProps.get("benefits.tab.title"));
    private final static String UNDERSTANDING_BENEFITS_TABLE_HEADER = GetterUtil.getString(PortletProps.get("understanding.benefits.table.header"));
    private final static String UNDERSTANDING_BENEFITS_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("understanding.benefits.table.description"));
    private final static String SUMMARY_BENEFITS_TABLE_HEADER = GetterUtil.getString(PortletProps.get("summary.of.benefits.table.header"));
    private final static String SUMMARY_BENEFITS_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("summary.of.benefits.table.description"));

    private static final Logger _logger = Logger.getLogger(BenefitsTab.class);

    private Map<Long, String> negativeLevelsMap = new HashMap<Long, String>();
    private Map<Long, String> trendsMap = new HashMap<Long, String>();

    private CustomXWPFDocument document;

    private long versionId;

    public BenefitsTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), BENEFITS_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), UNDERSTANDING_BENEFITS_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), UNDERSTANDING_BENEFITS_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createUnderstandingBenefitsTable();

        row = createDocumentRow(document.createParagraph(), SUMMARY_BENEFITS_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), SUMMARY_BENEFITS_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createSummaryOfBenefitsTable();

        addBreak(document.createParagraph());
    }

    private void createUnderstandingBenefitsTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);

        createTableHeaderColumn(tableRow, "No.", true);
        createTableHeaderColumn(tableRow, "Benefit Type", false);
        createTableHeaderColumn(tableRow, "Specific benefits", false);
        createTableHeaderColumn(tableRow, "State", false);
        createTableHeaderColumn(tableRow, "Summary", false);
        createTableHeaderColumn(tableRow, "Factors negatively affecting provision of selected benefits", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "", false);
        createTableHeaderColumn(tableRow, "Comments on factors", false);

        mergeCellHorizontally(tableRow, 5, 9);

        tableRow = table.createRow();

        addTableCell(tableRow.getCell(0), "", false, false, true);
        addTableCell(tableRow.getCell(1), "", false, false, true);
        addTableCell(tableRow.getCell(2), "", false, false, true);
        addTableCell(tableRow.getCell(3), "", false, false, true);
        addTableCell(tableRow.getCell(4), "", false, false, true);
        addTableCell(tableRow.getCell(5), "Habitat change (land use change)", false, false, true);
        addTableCell(tableRow.getCell(6), "Pollution", false, false, true);
        addTableCell(tableRow.getCell(7), "Over exploitation", false, false, true);
        addTableCell(tableRow.getCell(8), "Climate change", false, false, true);
        addTableCell(tableRow.getCell(9), "Invasive species", false, false, true);
        addTableCell(tableRow.getCell(10), "", false, false, true);

        mergeCellVertically(table, 0, 0, 1);
        mergeCellVertically(table, 1, 0, 1);
        mergeCellVertically(table, 2, 0, 1);
        mergeCellVertically(table, 3, 0, 1);
        mergeCellVertically(table, 4, 0, 1);
        mergeCellVertically(table, 10, 0, 1);

        List<BenefitDTO> benefitDTOs = getBenefits();

        int index = 1;

        for (BenefitDTO benefit : benefitDTOs) {

            List<String> specificBenefits = new ArrayList<>();

            for (benefit_checksubtype_lkp subType : benefit.getBenefitchecksubtypelkp()) {
                specificBenefits.add(subType.getBenefit_checksubtype());
            }

            //  This "if" need for disabled benefit "Nature conservation values". This is is static value and be equesl on all db.
            if (benefit.getObjbenefits().getSelected_benefit() != 1) {
                tableRow = table.createRow();
                addTableCell(tableRow.getCell(0), String.valueOf(index), true, false);
                addTableCell(tableRow.getCell(1), benefit.getBenefitchecktypelkp().getBenefit_checktype(), true, false);
                addTableCell(tableRow.getCell(2), specificBenefits, true);
                addTableCell(tableRow.getCell(3), benefit.getDatadeficent(), true, false);
                addTableCell(tableRow.getCell(4), benefit.getObjbenefits().getSummary(), true, false);

                String habitatChangeValue = getNegativeFactorsValue(benefit.getObjbenefits().getHabitatChangeLevel(), benefit.getObjbenefits().getHabitatChangeTrend());
                String pollution = getNegativeFactorsValue(benefit.getObjbenefits().getPollutionLevel(), benefit.getObjbenefits().getPollutionTrend());
                String overExploitation = getNegativeFactorsValue(benefit.getObjbenefits().getOverExploitationLevel(), benefit.getObjbenefits().getOverExploitationTrend());
                String climateChange = getNegativeFactorsValue(benefit.getObjbenefits().getClimateChangeLevel(), benefit.getObjbenefits().getClimateChangeTrend());
                String invasiveSpecies = getNegativeFactorsValue(benefit.getObjbenefits().getInvasiveSpeciesLevel(), benefit.getObjbenefits().getInvasiveSpeciesTrend());

                addTableCell(tableRow.getCell(5), habitatChangeValue, true, false);
                addTableCell(tableRow.getCell(6), pollution, true, false);
                addTableCell(tableRow.getCell(7), overExploitation, true, false);
                addTableCell(tableRow.getCell(8), climateChange, true, false);
                addTableCell(tableRow.getCell(9), invasiveSpecies, true, false);
                addTableCell(tableRow.getCell(10), benefit.getObjbenefits().getComment(), true, false);

                index++;
            }
        }

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();
    }

    private List<BenefitDTO> getBenefits() {

        List<BenefitDTO> benefitDTOs = new ArrayList<BenefitDTO>();

        List<negative_factors_level_impact> negativeLevels = new ArrayList<negative_factors_level_impact>();
        List<negative_factors_trend> trends = new ArrayList<negative_factors_trend>();

        try {

            List<benefits> benefits = benefitsLocalServiceUtil.getbenefitByVersion(versionId);

            int i = 1;

            if (benefits.size() > 0) {

                negativeLevels = negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impacts(-1, -1);
                trends = negative_factors_trendLocalServiceUtil.getnegative_factors_trends(-1, -1);

                for (negative_factors_level_impact level : negativeLevels) {
                    negativeLevelsMap.put(level.getLevel_id(), level.getLevel_impact());
                }

                for (negative_factors_trend trend : trends) {
                    trendsMap.put(trend.getTrend_id(), trend.getTrend());
                }

                Collections.sort(benefits, new Comparator<benefits>() {
                    @Override
                    public int compare(benefits o1, benefits o2) {
                        return Long.compare(o1.getBenefits_id(), o2.getBenefits_id());
                    }
                });

                for (benefits benefit : benefits) {

                    BenefitDTO objBenefit = new BenefitDTO();

                    List<benefit_checksubtype_lkp> objSubTypelkp = new ArrayList<benefit_checksubtype_lkp>();

                    //getting subtype list
                    List<benefits_type_ref> objbenefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(benefit.getBenefits_id());
                    long benefitType = 0;

                    for (benefits_type_ref benefits_type_refTemp : objbenefits_type_ref) {

                        benefitType = benefits_type_refTemp.getBenefit_checktype();

                        long subType = benefits_type_refTemp.getBenefit_checksubtype();

                        objSubTypelkp.add(benefit_checksubtype_lkpLocalServiceUtil.getbenefit_checksubtype_lkp(subType));
                    }
                    objBenefit.setObjbenefits(benefit);
                    objBenefit.setCount(i);
                    i++;

                    //set type
                    if (benefitType > 0) {
                        objBenefit.setBenefitchecktypelkp(benefit_checktype_lkpLocalServiceUtil.getbenefit_checktype_lkp(benefitType));
                    }

                    //set subtype
                    objBenefit.setBenefitchecksubtypelkp(objSubTypelkp);

                    if (benefit.getCommunity_outside_site() > 0) {
                        objBenefit.setBenefitratingOutside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(benefit.getCommunity_outside_site()));
                    }

                    if (benefit.getCommunity_within_site() > 0) {
                        objBenefit.setBenefitratingInside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(benefit.getCommunity_within_site()));
                    }

                    if (benefit.getWider_community() > 0) {
                        objBenefit.setBenefitratingWider(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(benefit.getWider_community()));
                    }

                    objBenefit.setObjbenefits(benefit);

                    if (objBenefit.getObjbenefits().getData_deficient()) {
                        objBenefit.setDatadeficent("Data deficient");
                    } else {
                        objBenefit.setDatadeficent("Present");
                    }

                    benefitDTOs.add(objBenefit);
                }

            }

        } catch (Exception e) {
            _logger.error("Error occurs during getting Understanding benefits: " + e.getMessage(), e);
        }

        return benefitDTOs;
    }

    private String getNegativeFactorsValue(long habitatChangeLevel, long habitatChangeTrend) {
        String habitatChangeValue = "";

        if (habitatChangeLevel > 0) {
            habitatChangeValue += "Impact level - " + negativeLevelsMap.get(habitatChangeLevel) + "; ";
        }

        if (habitatChangeTrend > 0) {
            habitatChangeValue += "Trend - " + trendsMap.get(habitatChangeTrend);
        }

        return habitatChangeValue;
    }

    private void createSummaryOfBenefitsTable() {

        XWPFTable table = document.createTable();

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Summary of benefits", true);

        String summaryBenefits = "";

        try {

            List<benefits_summary> benefits = benefits_summaryLocalServiceUtil
                    .getEntriesFromAssessmentId(versionId);

            if (benefits != null && benefits.size() > 0) {
                summaryBenefits = benefits.get(0).getSummary();
            }

        } catch (SystemException e) {
            _logger.error("Error occurs during getting Summary of Benefits: " + e.getMessage(), e);
        }

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), summaryBenefits, true, false);
    }

    public Map<Long, String> getNegativeLevelsMap() {
        return negativeLevelsMap;
    }

    public void setNegativeLevelsMap(Map<Long, String> negativeLevelsMap) {
        this.negativeLevelsMap = negativeLevelsMap;
    }

    public Map<Long, String> getTrendsMap() {
        return trendsMap;
    }

    public void setTrendsMap(Map<Long, String> trendsMap) {
        this.trendsMap = trendsMap;
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
