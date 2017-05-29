package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.assesment.utils.export.ThreatsCategory;
import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;

import java.math.BigInteger;
import java.util.*;

public class ThreatsTab extends AssessmentTabBuilder {

    private final static String THREATS_TAB_TITLE = GetterUtil.getString(PortletProps.get("threats.tab.title"));
    private final static String CURRENT_THREATS_TABLE_HEADER = GetterUtil.getString(PortletProps.get("current.threats.table.header"));
    private final static String CURRENT_THREATS_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("current.threats.table.description"));
    private final static String POTENTIAL_THREATS_TABLE_HEADER = GetterUtil.getString(PortletProps.get("potential.threats.table.header"));
    private final static String OVERALL_ASSESSMENT_TABLE_HEADER = GetterUtil.getString(PortletProps.get("overall.assessment.of.threats.table.header"));

    private static final Logger _logger = Logger.getLogger(ThreatsTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public ThreatsTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), THREATS_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), CURRENT_THREATS_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), CURRENT_THREATS_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createCurrentThreatTable();

        row = createDocumentRow(document.createParagraph(), POTENTIAL_THREATS_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        createPotentialThreatTable();

        row = createDocumentRow(document.createParagraph(), OVERALL_ASSESSMENT_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        createOverallAssessmentOfThreatsTable();

        addBreak(document.createParagraph());
    }

    private void createCurrentThreatTable() {

        XWPFTable table = document.createTable();

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Specific Threat", true);
        createTableHeaderColumn(tableRow, "Category", false);
        createTableHeaderColumn(tableRow, "Sub-Category", false);
        createTableHeaderColumn(tableRow, "Values Affected", false);
        createTableHeaderColumn(tableRow, "Inside ", "Throughout (>50%) / Widespread (15-50%) / Scattered (5-15%) / Localised (<5%) / Extent of threat not known / Not applicable");
        createTableHeaderColumn(tableRow, "Outside", false);
        createTableHeaderColumn(tableRow, "Justification", false);
        createTableHeaderColumn(tableRow, "Assessment ", "Very Low Threat/ Low Threat/ High Threat/ Very High Threat/Data Deficient");

        List<assessing_threats_current> assessingThreatsCurrentList = null;

        try {
            assessingThreatsCurrentList = assessing_threats_currentLocalServiceUtil.getEntriesByAssessment_versionId(versionId);

            if (assessingThreatsCurrentList != null && assessingThreatsCurrentList.size() > 0) {

                Collections.sort(assessingThreatsCurrentList);

                int fromCell = 1;
                int toCell = 0;

                for (assessing_threats_current assessingThreatsCurrent : assessingThreatsCurrentList) {
                    List<current_threat_assessment_cat> currentThreatAssessmentCatList =
                            current_threat_assessment_catLocalServiceUtil
                                    .getEntriesByCurrent_threat_id(assessingThreatsCurrent.getCurrent_threat_id());

                    List<current_threat_values> lstthreat_values = site_assessmentLocalServiceUtil.
                            getCurrentlThreatValuesByThreatId(assessingThreatsCurrent.getCurrent_threat_id());

                    String strwhValues = "";

                    for (current_threat_values threatValue : lstthreat_values) {
                        if (!threatValue.getIs_biodiv_whval()) {
                            if (strwhValues.isEmpty())
                                strwhValues = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue
                                        .getWhvalues_id()).getValues();
                            else strwhValues = strwhValues + " , " + assessment_whvaluesLocalServiceUtil
                                    .getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
                        }
                    }

                    for (current_threat_values threatValue : lstthreat_values) {

                        if (threatValue.getIs_biodiv_whval()) {
                            if (strwhValues.isEmpty())
                                strwhValues = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue
                                        .getWhvalues_id()).getValue();
                            else strwhValues = strwhValues + " , " + biodiversity_valuesLocalServiceUtil
                                    .getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
                        }
                    }

                    Collections.sort(currentThreatAssessmentCatList, new Comparator<current_threat_assessment_cat>() {
                        @Override
                        public int compare(current_threat_assessment_cat o1, current_threat_assessment_cat o2) {
                            return Long.compare(o1.getCur_threat_cat_id(), o2.getCur_threat_cat_id());
                        }
                    });

                    Map<Long, ThreatsCategory> categories = new HashMap<>();

                    ThreatsCategory threatsCategory = null;

                    for (current_threat_assessment_cat threatAssessmentCat : currentThreatAssessmentCatList) {
                        long categoryId = threatAssessmentCat.getCategory_id();

                        threat_categories_lkp threatCategoriesLkp = threat_categories_lkpLocalServiceUtil.getthreat_categories_lkp(categoryId);

                        threatsCategory = categories.containsKey(categoryId)
                                ? categories.get(categoryId)
                                : new ThreatsCategory();

                        threatsCategory.setCategory(threatCategoriesLkp.getThreat_category());

                        if (threatAssessmentCat.getSub_cat_id() > 0) {
                            threat_subcategories_lkp obj_curr_threat_subcategories_lkp = threat_subcategories_lkpLocalServiceUtil
                                    .getthreat_subcategories_lkp(threatAssessmentCat.getSub_cat_id());

                            threatsCategory.getSubcategories().add(obj_curr_threat_subcategories_lkp.getThreat_sub_category());
                        }

                        categories.put(categoryId, threatsCategory);
                    }

                    toCell += currentThreatAssessmentCatList.size();

                    populateCurrentThreatsRow(table, categories, assessingThreatsCurrent, strwhValues, fromCell, toCell);

                    fromCell += currentThreatAssessmentCatList.size();
                }
            }
        } catch (Exception e) {
            _logger.error("Error populating Current Threats information" + e.getMessage(), e);
        }

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();
    }

    private void createPotentialThreatTable() {

        XWPFTable table = document.createTable();

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "Specific Threat", true);
        createTableHeaderColumn(tableRow, "Category", false);
        createTableHeaderColumn(tableRow, "Sub-Category", false);
        createTableHeaderColumn(tableRow, "Values Affected", false);
        createTableHeaderColumn(tableRow, "Inside ", "Throughout (>50%) / Widespread (15-50%) / Scattered (5-15%) / Localised (<5%) / Extent of threat not known / Not applicable");
        createTableHeaderColumn(tableRow, "Outside", false);
        createTableHeaderColumn(tableRow, "Justification", false);
        createTableHeaderColumn(tableRow, "Assessment ", "Very Low Threat/ Low Threat/ High Threat/ Very High Threat/Data Deficient");

        try {

            List<assessing_threats_potential> assessingThreatsPotentialList = assessing_threats_potentialLocalServiceUtil
                    .getEntriesByAssessmentVersionId(versionId);

            if (assessingThreatsPotentialList != null && assessingThreatsPotentialList.size() > 0) {

                Collections.sort(assessingThreatsPotentialList);

                int fromCell = 1;
                int toCell = 0;

                for (assessing_threats_potential assessingThreatsPotential : assessingThreatsPotentialList) {

                    List<potential_threat_values> lstthreat_values = site_assessmentLocalServiceUtil
                            .getPotentialThreatValuesByThreatId(assessingThreatsPotential.getPotential_threat_id());

                    String strwhValues = "";

                    for (potential_threat_values threatValue : lstthreat_values) {
                        if (!threatValue.getIs_biodiv_whval()) {
                            if (strwhValues.isEmpty())
                                strwhValues = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
                            else
                                strwhValues = strwhValues + " , " + assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
                        }
                    }

                    for (potential_threat_values threatValue : lstthreat_values) {

                        if (threatValue.getIs_biodiv_whval()) {
                            if (strwhValues.isEmpty())
                                strwhValues = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
                            else
                                strwhValues = strwhValues + " , " + biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
                        }
                    }

                    List<potential_threat_assessment_cat> potentialThreatAssessmentCategories = potential_threat_assessment_catLocalServiceUtil
                            .getEntriesByPotential_threat_id(assessingThreatsPotential.getPotential_threat_id());

                    Map<Long, ThreatsCategory> categories = new HashMap<>();

                    ThreatsCategory threatsCategory = null;

                    for (potential_threat_assessment_cat threatAssessmentCategory : potentialThreatAssessmentCategories) {
                        long categoryId = threatAssessmentCategory.getCategory_id();

                        threat_categories_lkp threatCategoriesLkp = threat_categories_lkpLocalServiceUtil.getthreat_categories_lkp(categoryId);

                        threatsCategory = categories.containsKey(categoryId)
                                ? categories.get(categoryId)
                                : new ThreatsCategory();

                        threatsCategory.setCategory(threatCategoriesLkp.getThreat_category());

                        if (threatAssessmentCategory.getSub_cat_id() > 0) {
                            threat_subcategories_lkp obj_pot_threat_subcategories_lkp = threat_subcategories_lkpLocalServiceUtil
                                    .fetchthreat_subcategories_lkp(threatAssessmentCategory.getSub_cat_id());

                            threatsCategory.getSubcategories().add(obj_pot_threat_subcategories_lkp.getThreat_sub_category());
                        }

                        categories.put(categoryId, threatsCategory);
                    }

                    toCell += potentialThreatAssessmentCategories.size();

                    populatePotentialThreatsRow(table, categories, assessingThreatsPotential, strwhValues, fromCell, toCell);

                    fromCell += potentialThreatAssessmentCategories.size();
                }
            }
        } catch (Exception e) {
            _logger.error("Error populating Potential Threats information" + e.getMessage(), e);
        }

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();
    }

    private void populateCurrentThreatsRow(XWPFTable table,
                                           Map<Long, ThreatsCategory> categories,
                                           assessing_threats_current assessingThreatsCurrent,
                                           String strwhValues,
                                           int fromCell, int toCell) throws SystemException {

        String threatRating = "";

        if (assessingThreatsCurrent.getThreat_rating_id() > 0) {
            threat_rating_lkp obj_curr_threat_rating_lkp = threat_rating_lkpLocalServiceUtil
                    .fetchthreat_rating_lkp(assessingThreatsCurrent.getThreat_rating_id());

            threatRating = obj_curr_threat_rating_lkp.getRating();
        }

        String inside = assessingThreatsCurrent.getInside_site()
                ? "Yes".concat(", ".concat(assessingThreatsCurrent.getThreadExtentValue()))
                : "No";

        String outside = assessingThreatsCurrent.getOutside_site() ? "Yes" : "No";

        String currentThreat = assessingThreatsCurrent.getCurrent_threat();
        String justification = assessingThreatsCurrent.getJustification();

        populateCell(table, categories, strwhValues, threatRating, inside, outside, currentThreat, justification, fromCell);

        mergeCellVertically(table, 0, fromCell, toCell);
        mergeCellVertically(table, 3, fromCell, toCell);
        mergeCellVertically(table, 4, fromCell, toCell);
        mergeCellVertically(table, 5, fromCell, toCell);
        mergeCellVertically(table, 6, fromCell, toCell);
        mergeCellVertically(table, 7, fromCell, toCell);
    }

    private void populatePotentialThreatsRow(XWPFTable table,
                                           Map<Long, ThreatsCategory> categories,
                                           assessing_threats_potential assessingThreatsPotential,
                                           String strwhValues, int fromCell, int toCell) throws SystemException {

        String threatPotentialRating = "";

        if (assessingThreatsPotential.getThreat_rating() > 0) {
            threat_rating_lkp obj_pot_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.fetchthreat_rating_lkp(assessingThreatsPotential.getThreat_rating());
            threatPotentialRating = obj_pot_threat_rating_lkp.getRating();
        }

        String inside = assessingThreatsPotential.getInside_site()
                ? "Yes".concat(", ".concat(assessingThreatsPotential.getThreadExtentValue()))
                : "No";

        String outside = assessingThreatsPotential.getOutside_site() ? "Yes" : "No";

        String potentialThreat = assessingThreatsPotential.getPotential_threat();
        String justification = assessingThreatsPotential.getJustification();

        populateCell(table, categories, strwhValues, threatPotentialRating, inside, outside, potentialThreat, justification, fromCell);

        mergeCellVertically(table, 0, fromCell, toCell);
        mergeCellVertically(table, 3, fromCell, toCell);
        mergeCellVertically(table, 4, fromCell, toCell);
        mergeCellVertically(table, 5, fromCell, toCell);
        mergeCellVertically(table, 6, fromCell, toCell);
        mergeCellVertically(table, 7, fromCell, toCell);
    }

    private void populateCell(XWPFTable table, Map<Long, ThreatsCategory> categories, String strwhValues,
                              String threatRating, String inside, String outside, String currentThreat, String justification, int fromCategoryCell) {

        for(Map.Entry<Long, ThreatsCategory> category: categories.entrySet()) {

            List<String> subcategories = category.getValue().getSubcategories();

            String categoryName = category.getValue().getCategory();

            for (String subCategory : subcategories) {
                XWPFTableRow tableRow = table.createRow();

                addTableCell(tableRow.getCell(0), currentThreat, true, false);
                addTableCell(tableRow.getCell(1), categoryName, true, false);
                addTableCell(tableRow.getCell(2), subCategory, true, false);
                addTableCell(tableRow.getCell(3), strwhValues, true, false);
                addTableCell(tableRow.getCell(4), inside, true, false);
                addTableCell(tableRow.getCell(5), outside, true, false);
                addTableCell(tableRow.getCell(6), justification, true, false);
                addTableCell(tableRow.getCell(7), threatRating, true, false);

                categoryName = "";
                currentThreat = "";
                strwhValues = "";
                inside = "";
                outside = "";
                justification = "";
                threatRating = "";
            }

            if (subcategories.size() > 1) {
                int toCategoryCell = fromCategoryCell + subcategories.size() - 1;

                mergeCellVertically(table, 1, fromCategoryCell, toCategoryCell);
            }

            fromCategoryCell += subcategories.size();
        }
    }

    private void createOverallAssessmentOfThreatsTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(4000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(10000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(3000));
        //create first row
        XWPFTableRow tableRowOne = table.getRow(0);
        createTableHeaderColumn(tableRowOne, "Values", true);
        createTableHeaderColumn(tableRowOne, "Justification", false);
        createTableHeaderColumn(tableRowOne, "Assessment ", "Very Low Threat/ Low Threat/ High Threat/ Very High Threat/Data Deficient");

        threat_summary_current threat = getCurrentThreat();
        threat_summary_potential potentialThreat = getPotentialThreat();
        threat_summary_overall overallThreat = getOverallThreat();

        String overallCurrent = "";
        String overallPotential = "";
        String overallThreatValue = "";

        long currentThreatRating = 0;
        long potentialThreatRating = 0;
        long overallThreatRating = 0;

        if (threat != null) {
            overallCurrent = threat.getOverall_current();
            currentThreatRating = threat.getThreat_rating();
        }

        if (potentialThreat != null) {
            overallPotential = potentialThreat.getOverall_potential();
            potentialThreatRating = potentialThreat.getThreat_rating();
        }

        if (overallThreat != null) {
            overallThreatValue = overallThreat.getOverall_threat();
            overallThreatRating = overallThreat.getThreat_rating();
        }

        XWPFTableRow tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Overall Assessment of Current Threats", false, false);
        addTableCell(tableRow.getCell(1), overallCurrent, true, false);
        addTableCell(tableRow.getCell(2), getRating(currentThreatRating), true, false);

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Overall Assessment of Potential Threats", false, false);
        addTableCell(tableRow.getCell(1), overallPotential, true, false);
        addTableCell(tableRow.getCell(2), getRating(potentialThreatRating), true, false);

        tableRow = table.createRow();
        addTableCell(tableRow.getCell(0), "Overall Assessment of Threats", false, false);
        addTableCell(tableRow.getCell(1), overallThreatValue, true, false);
        addTableCell(tableRow.getCell(2), getRating(overallThreatRating), true, false);
    }

    private threat_summary_current getCurrentThreat() {

        threat_summary_current threat = null;

        try {
            List<threat_summary_current> currentThreats = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(versionId);

            if (currentThreats != null && !currentThreats.isEmpty()) {
                threat = currentThreats.get(0);
            }

        } catch (Exception e) {
            _logger.error(e.getMessage(), e);
        }

        return threat;
    }

    private threat_summary_potential getPotentialThreat() {

        threat_summary_potential threat = null;

        try {
            List<threat_summary_potential> currentThreats = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(versionId);

            if (currentThreats != null && !currentThreats.isEmpty()) {
                threat = currentThreats.get(0);
            }

        } catch (Exception e) {
            _logger.error(e.getMessage(), e);
        }

        return threat;
    }

    private threat_summary_overall getOverallThreat() {

        threat_summary_overall threat = null;

        try {
            List<threat_summary_overall> currentThreats = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(versionId);

            if (currentThreats != null && !currentThreats.isEmpty()) {
                threat = currentThreats.get(0);
            }

        } catch (Exception e) {
            _logger.error(e.getMessage(), e);
        }

        return threat;
    }

    private String getRating(long threatRating) {

        String rating = "-";

        if (threatRating > 0) {
            try {
                rating = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatRating).getRating();
            } catch (Exception e) {
                _logger.error(e.getMessage(), e);
            }
        }

        return rating;
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
