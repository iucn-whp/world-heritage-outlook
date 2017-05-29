package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;
import com.iucn.whp.dbservice.model.biodiversity_values;
import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.service.assessment_whvalues_whcriterionLocalServiceUtil;
import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dto.SiteAssessmentValues;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ValueTab extends AssessmentTabBuilder {

    private final static String TAB_TITLE = GetterUtil.getString(PortletProps.get("values.tab.title"));
    private final static String TAB_HEADER = GetterUtil.getString(PortletProps.get("values.table.header"));
    private final static String TAB_DESCRIPTION = GetterUtil.getString(PortletProps.get("values.table.description"));

    private final static String IMPORTANT_BIODIVERSITY_VALUES_TABLE_TITLE = GetterUtil.getString(PortletProps.get("important.biodiversity.values.table.title"));
    private final static String IMPORTANT_BIODIVERSITY_VALUES_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("important.biodiversity.values.table.description"));

    private static final Logger _logger = Logger.getLogger(ValueTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public ValueTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), TAB_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), TAB_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createTable();

        row = createDocumentRow(document.createParagraph(), IMPORTANT_BIODIVERSITY_VALUES_TABLE_TITLE, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), IMPORTANT_BIODIVERSITY_VALUES_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createImportantBiodiversityValuesTable();

        addBreak(document.createParagraph());
    }

    private void createTable() {

        List<SiteAssessmentValues> siteAssessmentValues = getAssessmentValues();

        if (siteAssessmentValues.isEmpty()) {
            return;
        }

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(5000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(9000));
        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "No.", true);
        createTableHeaderColumn(tableRow, "Values", false);
        createTableHeaderColumn(tableRow, "Description", false);
        createTableHeaderColumn(tableRow, "WH Criteria", false);

        for (SiteAssessmentValues assessmentValue: siteAssessmentValues) {
            tableRow = table.createRow();

            addTableCell(tableRow.getCell(0), String.valueOf(assessmentValue.getSno()), true, false);
            addTableCell(tableRow.getCell(1), assessmentValue.getWhvalues().getValues(), true, false);
            addTableCell(tableRow.getCell(2), assessmentValue.getWhvalues().getDescription(), true, false);
            addTableCell(tableRow.getCell(3), assessmentValue.getStrwhvalues_whcriterion(), true, false);
        }

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();
    }

    private void createImportantBiodiversityValuesTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(5000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "No.", true);
        createTableHeaderColumn(tableRow, "Values", false);
        createTableHeaderColumn(tableRow, "Description", false);

        List<biodiversity_values> biodiversityValues = getBiodiversityValues();

        int index = 0;

        for (biodiversity_values biodiversityValue : biodiversityValues) {
            index ++;

            tableRow = table.createRow();

            addTableCell(tableRow.getCell(0), String.valueOf(index), true, false);
            addTableCell(tableRow.getCell(1), biodiversityValue.getValue(), true, false);
            addTableCell(tableRow.getCell(2), biodiversityValue.getDescription(), true, false);
        }

    }

    private List<SiteAssessmentValues> getAssessmentValues() {
        List<assessment_whvalues> whValues = new ArrayList<assessment_whvalues>();
        List<SiteAssessmentValues> siteAssessmentValues = new ArrayList<SiteAssessmentValues>();

        try {
            whValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(versionId);
            Collections.sort(whValues);
        } catch (Exception e) {
            _logger.error("Error getting Assessment WhValues By Version: " + e.getMessage(), e);
        }

        SiteAssessmentValues siteAssessmentValue = null;

        int index = 0;

        for (assessment_whvalues whValue : whValues) {

            index ++;

            try {
                siteAssessmentValue = new SiteAssessmentValues();


                List<assessment_whvalues_whcriterion> whCriterionsByWhValue = assessment_whvalues_whcriterionLocalServiceUtil
                        .getAssessment_whvalues_whcriterionsBywhValue(whValue.getWhvalues_id());

                String str = null;

                for (assessment_whvalues_whcriterion whCriterion : whCriterionsByWhValue) {

                    long criteriaTemp = whCriterion.getCriterion();

                    inscription_criteria_lkp insCriteria = inscription_criteria_lkpLocalServiceUtil
                            .getinscription_criteria_lkp(Integer.parseInt(criteriaTemp + ""));

                    str = str == null ? insCriteria.getCriteria() : str + "," + insCriteria.getCriteria();
                }

                siteAssessmentValue.setWhvalues(whValue);
                siteAssessmentValue.setStrwhvalues_whcriterion(str);
                siteAssessmentValue.setSno(index);

                siteAssessmentValues.add(siteAssessmentValue);

                Collections.sort(siteAssessmentValues, new Comparator<SiteAssessmentValues>() {
                    @Override
                    public int compare(SiteAssessmentValues o1, SiteAssessmentValues o2) {
                        return o1.getWhvalues().getWhvalues_id() == o2.getWhvalues().getWhvalues_id() ? 1 : 0;
                    }

                });

            } catch (Exception e) {
                _logger.error(e.getMessage(), e);
            }
        }

        return siteAssessmentValues;
    }

    private List<biodiversity_values> getBiodiversityValues() {
        List<biodiversity_values> biodiversityValues = new ArrayList<>();

        try {
            biodiversityValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(versionId);
            Collections.sort(biodiversityValues);
        } catch (Exception e) {
            _logger.error("Error getting Biodiversity WhValues By Version: " + e.getMessage(), e);
        }

        return biodiversityValues;
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
