<%@ page import="java.util.*" %>
<%@ page import="com.iucn.whp.dbservice.service.*" %>
<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <th colspan="2"></th>
        <th colspan="5">Assessment</th>
    </tr>
    <tr>
        <th class="topics">Topics</th>
        <th style="width:30%;">Justification of Assessment</th>
        <th style="background: #92d14f none;">Highly Effective</th>
        <th style="background:#acd373 none;">Mostly Effective</th>
        <th style="background:#ffc000 none;">Some Concern</th>
        <th style="background:#fe0000 none;">Serious Concern</th>
        <th>Data deficient</th>
    </tr>

    <c:forEach items="${assessment.getProtectionManagementDTO().getProtectionManagementDTOs()}" var="element">
        <c:if test="${element.protection_management.getTopic_id() != 15}">
            <tr id="${element.protection_management.getTopic_id()}_TR">
                <td id="${element.protection_management.getTopic_id()}_R_TD">${element.getMgmt_checklist_lkp().getTopic()}</td>
                <td id="${element.protection_management.getTopic_id()}_JS_TD">${element.protection_management.getJustification()}</td>
                <td>
                    <c:choose>
                        <c:when test="${element.getProtection_management_ratings_lkpModel().getId() == 1}">
                            <span class="verylowThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${element.getProtection_management_ratings_lkpModel().getId() == 2}">
                            <span class="lowthreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${element.getProtection_management_ratings_lkpModel().getId() == 3}">
                            <span class="highThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${element.getProtection_management_ratings_lkpModel().getId() == 4}">
                            <span class="veryhighThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${element.getProtection_management_ratings_lkpModel().getId() == 5}">
                            <span class="datadeficientcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:if>
    </c:forEach>

    </tbody>
</table>