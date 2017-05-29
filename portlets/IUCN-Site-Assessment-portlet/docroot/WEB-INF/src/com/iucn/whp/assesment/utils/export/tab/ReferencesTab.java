package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.references;
import com.iucn.whp.dbservice.service.referencesLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class ReferencesTab extends AssessmentTabBuilder {

    private final static String REFERENCES_TAB_TITLE = GetterUtil.getString(PortletProps.get("references.tab.title"));
    private final static String REFERENCES_TAB_DESCRIPTION = GetterUtil.getString(PortletProps.get("references.table.description"));

    private static final Logger _logger = Logger.getLogger(ReferencesTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public ReferencesTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), REFERENCES_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), REFERENCES_TAB_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createReferencesTable();
    }

    private void createReferencesTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);

        // First Column
        // Create first column header title (contains superscript text)
        XWPFTableCell tableCell = tableRow.getCell(0);
        CTTc ctTc = tableCell.getCTTc();
        CTVerticalJc ctVerticalJc = ctTc.addNewTcPr().addNewVAlign();
        ctVerticalJc.setVal(STVerticalJc.CENTER);

        XWPFParagraph paragraph = tableCell.getParagraphs().get(0);
        XWPFRun run = paragraph.createRun();
        run.setBold(true);
        run.setText("Rn");

        run = paragraph.createRun();
        run.setBold(true);
        run.setSubscript(VerticalAlign.SUPERSCRIPT);
        run.setText("0");

        // Second Column
        createTableHeaderColumn(tableRow, "References", false);

        try {
            List<references> referenceList = referencesLocalServiceUtil.findByAssessmentId(versionId);

            if (referenceList == null || referenceList.isEmpty()) {
                tableRow = table.createRow();
                addTableCell(tableRow.getCell(0), " - ", true, true);
                addTableCell(tableRow.getCell(1), " - ", true, true);

                return;
            }

            Collections.sort(referenceList);

            int index = 1;

            for (references reference : referenceList) {
                tableRow = table.createRow();

                addTableCell(tableRow.getCell(0), String.valueOf(index), true, false);
                addTableCell(tableRow.getCell(1), reference.getReferences(), true, false);

                index++;
            }
        } catch (SystemException e) {
            _logger.error("Error creating References table, cause " + e.getMessage(), e);
        }
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
