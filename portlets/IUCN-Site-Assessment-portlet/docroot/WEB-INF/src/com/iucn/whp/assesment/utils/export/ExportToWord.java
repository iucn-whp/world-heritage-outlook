package com.iucn.whp.assesment.utils.export;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.tab.*;
import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

public class ExportToWord {

    private static final Logger _logger = Logger.getLogger(ExportToWord.class);

    private final static int DEFAULT_FONT_SIZE = 11;

    // see https://www.gnu.org/software/gv/manual/html_node/Paper-Keywords-and-paper-size-in-points.html
    // BigIntegers are representative of 1/20 Point
    private final static BigInteger LANDSCAPE_PAGE_WIDTH = BigInteger.valueOf(16840);
    private final static BigInteger LANDSCAPE_PAGE_HEIGHT = BigInteger.valueOf(11900);

    // TODO: Refactor this code!!! Use template instead of creating row, tables etc in Java
    public static void exportToWordDocument(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
            throws SystemException, PortalException, IOException {
        long siteId = ParamUtil.getLong(resourceRequest, "SITE_ID");
        long versionId = ParamUtil.getLong(resourceRequest, "VERSION_ID");
        String initiationDate = ParamUtil.getString(resourceRequest, "INITIATION_DATE");

        ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

        try {

            whp_sites objSite = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);

            CustomXWPFDocument document = new CustomXWPFDocument();

            CTBody body = document.getDocument().getBody();

            if (!body.isSetSectPr()) {
                body.addNewSectPr();
            }

            CTSectPr section = body.getSectPr();

            if(!section.isSetPgSz()) {
                section.addNewPgSz();
            }

            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz pgSz = section.getPgSz();
            pgSz.setW(LANDSCAPE_PAGE_WIDTH);
            pgSz.setH(LANDSCAPE_PAGE_HEIGHT);
            pgSz.setOrient(STPageOrientation.LANDSCAPE);

            createDocumentHeader(document, objSite.getName_en(), initiationDate);

            ValueTab valueTab = new ValueTab(document, versionId);
            valueTab.populateTab();

            ThreatsTab threatsTab = new ThreatsTab(document, versionId);
            threatsTab.populateTab();

            ProtectionManagementTab protectionManagementTab = new ProtectionManagementTab(document, versionId);
            protectionManagementTab.populateTab();

            AssessingValuesTab assessingValuesTab = new AssessingValuesTab(document, versionId);
            assessingValuesTab.populateTab();

            ConservationOutlookTab conservationOutlookTab = new ConservationOutlookTab(document, versionId);
            conservationOutlookTab.populateTab();

            BenefitsTab benefitsTab = new BenefitsTab(document, versionId);
            benefitsTab.populateTab();

            ProjectsTab projectsTab = new ProjectsTab(document, versionId);
            projectsTab.populateTab();

            ReferencesTab referencesTab = new ReferencesTab(document, versionId);
            referencesTab.populateTab();

            String fileName = objSite.getName_en().replaceAll("[^A-Za-z0-9]", " ");

            resourceResponse.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
            resourceResponse.addProperty("Content-Disposition", "attachment;filename=" + fileName + ".doc");

            OutputStream outputStream = resourceResponse.getPortletOutputStream();
            document.write(outputStream);
            outputStream.close();
        } catch (Exception ex) {
            _logger.error("Error download Word document cause: " + ex.getMessage(), ex);
        }

    }

    private static void createDocumentHeader(CustomXWPFDocument document, String siteName, String dateAssessed) {

        XWPFRun row = null;

        // 1. Site Name and Date assessed
        XWPFParagraph siteNameParagraph = document.createParagraph();
        row = setRowText(siteNameParagraph, "Site Name: ", siteName, DEFAULT_FONT_SIZE);
        row.addBreak();

        row = setRowText(siteNameParagraph, "Date assessed: ", dateAssessed, DEFAULT_FONT_SIZE);
        row.addBreak();

        siteNameParagraph = document.createParagraph();
        row = createRowLabel(siteNameParagraph, "2017 Conservation Outlook Assessment", 20);
        row.addBreak();
    }

    /* Utils methods */

    private static XWPFRun createRowLabel(XWPFParagraph paragraph, String text, int fontSize) {
        XWPFRun run = paragraph.createRun();
        run.setText(text);
        run.setBold(true);
        run.setFontFamily("Arial");
        run.setFontSize(fontSize);

        return run;
    }

    private static XWPFRun setRowText(XWPFParagraph paragraph, String title, String value, int fontSize) {

        XWPFRun run = paragraph.createRun();
        run.setText(title);
        run.setBold(false);
        run.setFontFamily("Arial");
        run.setFontSize(fontSize);

        run = paragraph.createRun();
        run.setText(value);
        run.setFontFamily("Arial");
        run.setFontSize(fontSize);
        run.setColor("0000FF");

        return run;
    }

    private static void setRun(XWPFRun run, String fontFamily, int fontSize, String text, boolean bold) {
        run.setFontFamily(fontFamily);
        run.setFontSize(fontSize);
        run.setText(text);
        run.setBold(bold);
    }

    private static FileEntry getFileEntryByThumbnailId(long thumbnailId) {
        FileEntry fileEntry = null;

        try {
            fileEntry = DLAppServiceUtil.getFileEntry(thumbnailId);
        } catch (PortalException | SystemException e) {
            e.printStackTrace();
        }

        return fileEntry;
    }

    private static void setFonts(XWPFParagraph paragraph) {
        for (XWPFRun run : paragraph.getRuns()) {
            run.setFontFamily("Times New Roman");
            run.setFontSize(DEFAULT_FONT_SIZE);
        }
    }

}
