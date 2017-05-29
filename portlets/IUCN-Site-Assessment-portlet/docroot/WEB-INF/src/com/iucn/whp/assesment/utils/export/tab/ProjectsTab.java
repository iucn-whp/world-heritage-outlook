package com.iucn.whp.assesment.utils.export.tab;

import com.iucn.whp.assesment.utils.CustomXWPFDocument;
import com.iucn.whp.assesment.utils.export.AssessmentTabBuilder;
import com.iucn.whp.dbservice.model.active_conservation_projects;
import com.iucn.whp.dbservice.model.potential_project_needs;
import com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil;
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
import java.util.Collections;
import java.util.List;

public class ProjectsTab extends AssessmentTabBuilder {

    private final static String PROJECTS_TAB_TITLE = GetterUtil.getString(PortletProps.get("projects.tab.title"));
    private final static String ACTIVE_CONSERVATION_PROJECTS_TABLE_HEADER = GetterUtil.getString(PortletProps.get("active.conservation.projects.table.header"));
    private final static String ACTIVE_CONSERVATION_PROJECTS_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("active.conservation.projects.table.description"));
    private final static String POTENTIAL_SITE_NEEDS_TABLE_HEADER = GetterUtil.getString(PortletProps.get("potential.site.needs.table.header"));
    private final static String POTENTIAL_SITE_NEEDS_TABLE_DESCRIPTION = GetterUtil.getString(PortletProps.get("potential.site.needs.table.description"));

    private static final Logger _logger = Logger.getLogger(ProjectsTab.class);

    private CustomXWPFDocument document;

    private long versionId;

    public ProjectsTab(CustomXWPFDocument document, long versionId) {
        this.document = document;
        this.versionId = versionId;
    }

    @Override
    public void populateTab() {

        XWPFRun row = createDocumentRow(document.createParagraph(), PROJECTS_TAB_TITLE, LARGE_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), ACTIVE_CONSERVATION_PROJECTS_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), ACTIVE_CONSERVATION_PROJECTS_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createActiveConservationProjectTable();

        row = createDocumentRow(document.createParagraph(), POTENTIAL_SITE_NEEDS_TABLE_HEADER, MEDIUM_TEXT_FONT_SIZE, true, false);
        row.addBreak();

        row = createDocumentRow(document.createParagraph(), POTENTIAL_SITE_NEEDS_TABLE_DESCRIPTION, TEXT_FONT_SIZE, false, true);
        row.addBreak();

        createPotentialSiteNeedsTable();

        addBreak(document.createParagraph());

    }

    private void createActiveConservationProjectTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(3000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(8000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "No.", true);
        createTableHeaderColumn(tableRow, "Organisation/individuals", false);
        createTableHeaderColumn(tableRow, "Project duration", false);
        createTableHeaderColumn(tableRow, "Brief Description of Active Projects", false);
        createTableHeaderColumn(tableRow, "Contact details", false);

        try {

            List<active_conservation_projects> activeConservationProjects = active_conservation_projectsLocalServiceUtil
                    .getactive_conservation_projectsByVersion(versionId);

            if (activeConservationProjects == null || activeConservationProjects.isEmpty()) {
                tableRow = table.createRow();
                addTableCell(tableRow.getCell(0), " - ", true, true);
                addTableCell(tableRow.getCell(1), " - ", true, true);
                addTableCell(tableRow.getCell(2), " - ", true, true);
                addTableCell(tableRow.getCell(3), " - ", true, true);
                addTableCell(tableRow.getCell(4), " - ", true, true);

                return;
            }

            int id = 1;

            Collections.sort(activeConservationProjects);

            for (active_conservation_projects activeConservationProject : activeConservationProjects) {

                String projectDuration = activeConservationProject.getProjectDurationFrom().concat(" - ")
                        .concat(activeConservationProject.getProjectDurationTo());

                tableRow = table.createRow();

                addTableCell(tableRow.getCell(0), String.valueOf(id), true, false);
                addTableCell(tableRow.getCell(1), activeConservationProject.getOrganization_individual(), true, false);
                addTableCell(tableRow.getCell(2), projectDuration, true, false);
                addTableCell(tableRow.getCell(3), activeConservationProject.getDescription(), true, false);
                addTableCell(tableRow.getCell(4), activeConservationProject.getContact_details(), true, false);

                id++;
            }

        } catch (PortalException | SystemException e) {
            _logger.error("Error creating Active Conservation Projects table, cause " + e.getMessage(), e);
        }

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun paragraphRun = paragraph.createRun();

        paragraphRun.addBreak();
    }

    private void createPotentialSiteNeedsTable() {

        XWPFTable table = document.createTable();
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(3000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(10000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(3000));

        //create first row
        XWPFTableRow tableRow = table.getRow(0);
        createTableHeaderColumn(tableRow, "No.", true);
        createTableHeaderColumn(tableRow, "Site need title", false);
        createTableHeaderColumn(tableRow, "Brief description of potential site needs", false);
        createTableHeaderColumn(tableRow, "Support needed for following years", false);

        try {
            List<potential_project_needs> potentialProjectNeeds = potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(versionId);

            if (potentialProjectNeeds == null || potentialProjectNeeds.isEmpty()) {
                tableRow = table.createRow();
                addTableCell(tableRow.getCell(0), "1", false, false);
                addTableCell(tableRow.getCell(1), " - ", true, true);
                addTableCell(tableRow.getCell(2), " - ", true, true);
                addTableCell(tableRow.getCell(3), " - ", true, true);

                return;
            }

            int index = 1;

            Collections.sort(potentialProjectNeeds);

            for (potential_project_needs potentialProject : potentialProjectNeeds) {

                String projectDurationFrom = potentialProject.getProjectDurationFrom();
                String projectDurationTo =projectDurationFrom.isEmpty()
                        ? potentialProject.getProjectDurationTo()
                        : "-" + potentialProject.getProjectDurationTo();

                tableRow = table.createRow();

                addTableCell(tableRow.getCell(0), String.valueOf(index), true, false);
                addTableCell(tableRow.getCell(1), potentialProject.getOrganization_individual(), true, false);
                addTableCell(tableRow.getCell(2), potentialProject.getDescription(), true, false);
                addTableCell(tableRow.getCell(3), projectDurationFrom.concat(projectDurationTo), true, false);

                index++;
            }
        } catch (PortalException | SystemException e) {
            _logger.error("Error creating Potential Projects table, cause " + e.getMessage(), e);
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
