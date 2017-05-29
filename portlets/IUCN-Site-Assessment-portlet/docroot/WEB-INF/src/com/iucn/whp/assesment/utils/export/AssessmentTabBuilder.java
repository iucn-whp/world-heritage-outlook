package com.iucn.whp.assesment.utils.export;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.util.List;

public abstract class AssessmentTabBuilder {

    // Default text size in the document
    protected final static int TEXT_FONT_SIZE = 11;

    // Use for table headers
    protected final static int MEDIUM_TEXT_FONT_SIZE = 16;

    // Use for tab titles
    protected final static int LARGE_TEXT_FONT_SIZE = 20;

    protected final static String FONT_FAMILY = "Arial";

    protected final static String BLUE = "0000FF";

    protected final static String GREY = "b2b2b2";

    protected XWPFRun createDocumentRow(XWPFParagraph paragraph, String text, int fontSize, boolean bold, boolean italic) {
        XWPFRun run = paragraph.createRun();
        run.setText(text);
        run.setBold(bold);
        run.setItalic(italic);
        run.setFontFamily(FONT_FAMILY);
        run.setFontSize(fontSize);

        return run;
    }

    protected void addBreak(XWPFParagraph paragraph) {
        XWPFRun run = paragraph.createRun();

        run.addBreak(BreakType.PAGE);
    }

    protected XWPFTableCell createTableHeaderColumn(XWPFTableRow tableRow, String text, boolean first) {

        XWPFTableCell tableCell = first ? tableRow.getCell(0) : tableRow.addNewTableCell();
        CTTc ctTc = tableCell.getCTTc();
        CTVerticalJc ctVerticalJc = ctTc.addNewTcPr().addNewVAlign();
        ctVerticalJc.setVal(STVerticalJc.CENTER);

        XWPFParagraph paragraph = tableCell.getParagraphs().get(0);
        // create a run to contain the content
        XWPFRun run = paragraph.createRun();
        run.setBold(true);
        run.setText(text);

        return tableCell;
    }

    protected XWPFTableCell createTableHeaderColumn(XWPFTableRow tableRow, String boldText, String text) {

        XWPFTableCell tableCell = tableRow.addNewTableCell();
        CTTc ctTc = tableCell.getCTTc();
        CTVerticalJc ctVerticalJc = ctTc.addNewTcPr().addNewVAlign();
        ctVerticalJc.setVal(STVerticalJc.CENTER);

        XWPFParagraph paragraph = tableCell.getParagraphs().get(0);
        // create a run to contain the content
        XWPFRun run = paragraph.createRun();
        run.setBold(true);
        run.setText(boldText);

        if (text != null && text.length() > 0) {
            run = paragraph.createRun();
            run.addBreak();
            run.setText(text);
        }

        return tableCell;
    }

    protected XWPFTableCell addTableCell(XWPFTableCell tableCell, List<String> textValues, boolean dynamic) {
        XWPFParagraph paragraph = tableCell.getParagraphs().get(0);
        // create a run to contain the content
        XWPFRun run = paragraph.createRun();

        for(String text : textValues) {
            if (dynamic) {
                run.setColor(BLUE);
            }

            run.setText(text + ";");
            run = paragraph.createRun();
            run.addBreak();
            run.addBreak();
        }

        return tableCell;
    }

    protected XWPFTableCell addTableCell(XWPFTableCell tableCell, String value, boolean dynamic, boolean center) {
        return addTableCell(tableCell, value, dynamic, center, false);
    }

    protected XWPFTableCell addTableCell(XWPFTableCell tableCell, String value, boolean dynamic, boolean center, boolean bold) {

        XWPFParagraph paragraph = tableCell.getParagraphs().get(0);

        if (center) {
            paragraph.setAlignment(ParagraphAlignment.CENTER);
        }

        // create a run to contain the content
        XWPFRun run = paragraph.createRun();
        run.setText(value);

        if (dynamic) {
            run.setColor(BLUE);
        }

        if (bold) {
            run.setBold(true);
        }

        return tableCell;

    }

    protected void mergeCellVertically(XWPFTable table, int column, int fromRow, int toRow) {
        CTVMerge vMerge = null;

        for(int rowIndex = fromRow; rowIndex <= toRow; rowIndex++){
            vMerge = CTVMerge.Factory.newInstance();

            if(rowIndex == fromRow){
                // The first merged cell is set with RESTART merge value
                vMerge.setVal(STMerge.RESTART);
            } else {
                // Cells which join (merge) the first one, are set with CONTINUE
                vMerge.setVal(STMerge.CONTINUE);
            }

            XWPFTableCell cell = table.getRow(rowIndex).getCell(column);
            // Try getting the TcPr. Not simply setting an new one every time.
            CTTcPr tcPr = cell.getCTTc().getTcPr();
            if (tcPr != null) {
                tcPr.setVMerge(vMerge);
            } else {
                // only set an new TcPr if there is not one already
                tcPr = CTTcPr.Factory.newInstance();
                tcPr.setVMerge(vMerge);
                cell.getCTTc().setTcPr(tcPr);
            }
        }
    }

    protected void mergeCellHorizontally(XWPFTableRow tableRow, int fromColumn, int toColumn) {
        CTHMerge hMerge = null;

        for(int colIndex = fromColumn; colIndex <= toColumn; colIndex++){
            hMerge = CTHMerge.Factory.newInstance();
            if(colIndex == fromColumn){
                // The first merged cell is set with RESTART merge value
                hMerge.setVal(STMerge.RESTART);
            } else {
                // Cells which join (merge) the first one, are set with CONTINUE
                hMerge.setVal(STMerge.CONTINUE);
            }
            XWPFTableCell cell = tableRow.getCell(colIndex);
            // Try getting the TcPr. Not simply setting an new one every time.
            CTTcPr tcPr = cell.getCTTc().getTcPr();
            if (tcPr != null) {
                tcPr.setHMerge(hMerge);
            } else {
                // only set an new TcPr if there is not one already
                tcPr = CTTcPr.Factory.newInstance();
                tcPr.setHMerge(hMerge);
                cell.getCTTc().setTcPr(tcPr);
            }
        }
    }

    public abstract void populateTab();

}
