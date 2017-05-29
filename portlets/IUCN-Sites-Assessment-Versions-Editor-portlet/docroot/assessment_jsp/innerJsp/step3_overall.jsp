<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.iucn.whp.dbservice.model.prot_mgmt_best_practices" %>
<%@ page import="com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalServiceUtil" %>
<%@ page import="java.util.List" %>

<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
        <tr>
            <th class="topics">Topics</th>
            <th class="justificationOfassessment">Justification Of Assessment</th>
            <th class="assessment">Assessment </th>
        </tr>

        <tr>
            <td>Assessment of the effectiveness of protection and management in addressing threats outside the site</td>
            <td id="BP_TD">${assessment.getProtectionManagementDTO().getEffective_prot_mgmt_iothreats().getJustification()}
            </td>
            <td>
                <c:choose>
                    <c:when test="${assessment.getProtectionManagementDTO().getEffective_prot_mgmt_iothreats().getRating() == 1}">
                        <span class="verylowThreatcell">Highly Effective</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getEffective_prot_mgmt_iothreats().getRating() == 2}">
                        <span class="lowthreatcell">Effective</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getEffective_prot_mgmt_iothreats().getRating() == 3}">
                        <span class="highThreatcell">Some Concern</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getEffective_prot_mgmt_iothreats().getRating() == 4}">
                        <span class="veryhighThreatcell">Serious Concern</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getEffective_prot_mgmt_iothreats().getRating() == 5}">
                        <span class="datadeficientcell">Data Deficient</span>
                    </c:when>
                    <c:otherwise>
                        <span class=""></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>

        <tr>
            <td>Overall assessment of protection and management</td>
            <td id="${assessment.getProtectionManagementDTO().getProt_mgmt_overall().getPmo_id()}BP_TD">${assessment
                .getProtectionManagementDTO().getProt_mgmt_overall().getJustification()}
            </td>
            <td>
                <c:choose>
                    <c:when test="${assessment.getProtectionManagementDTO().getProt_mgmt_overall().getRating() == 1}">
                        <span class="verylowThreatcell">Highly Effective</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getProt_mgmt_overall().getRating() == 2}">
                        <span class="lowthreatcell">Effective</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getProt_mgmt_overall().getRating() == 3}">
                        <span class="highThreatcell">Some Concern</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getProt_mgmt_overall().getRating() == 4}">
                        <span class="veryhighThreatcell">Serious Concern</span>
                    </c:when>

                    <c:when test="${assessment.getProtectionManagementDTO().getProt_mgmt_overall().getRating() == 5}">
                        <span class="datadeficientcell">Data Deficient</span>
                    </c:when>
                    <c:otherwise>
                        <span class=""></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        <tr>
            <td>Best Practice Examples</td>
            <td id="${assessment.getProtectionManagementDTO().getProtMgmtBestPractices().getBest_practice_id()}BP_TD" colspan="2">${assessment
                .getProtectionManagementDTO().getProtMgmtBestPractices().getDescription()}</td>
        </tr>
    </tbody>
</table>