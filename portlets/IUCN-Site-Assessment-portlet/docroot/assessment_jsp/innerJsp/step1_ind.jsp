<%@page import="com.iucn.whp.dto.SiteAssessmentValues" %>
<%@include file="/init_import.jsp" %>

<%
    List<assessment_whvalues> lstwhValues = null;
    String assesmentVersionId = "0";
    List<SiteAssessmentValues> lstSiteAssessment = new ArrayList<SiteAssessmentValues>();
    try {
        assesmentVersionId = request.getAttribute("versionId").toString();
        lstwhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(Long.parseLong(assesmentVersionId));
        Collections.sort(lstwhValues);
        SiteAssessmentValues siteAssessmentValues = null;
        for (int i = 0; i < lstwhValues.size(); i++) {
            try {

                siteAssessmentValues = new SiteAssessmentValues();

                siteAssessmentValues.setWhvalues(lstwhValues.get(i));

                List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(lstwhValues.get(i).getWhvalues_id());
                String str = null;
                for (int j = 0; j < lstwhvalues_whcriterion.size(); j++) {
                    long criteriaTemp = lstwhvalues_whcriterion.get(j).getCriterion();
                    inscription_criteria_lkp insCriteria = inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(Integer.parseInt(criteriaTemp + ""));
                    String strCriteria = insCriteria.getCriteria();
                    if (str == null) str = strCriteria;
                    else str = str + "," + strCriteria;
                }

                siteAssessmentValues.setStrwhvalues_whcriterion(str);
                siteAssessmentValues.setSno(i + 1);
                lstSiteAssessment.add(siteAssessmentValues);

                Collections.sort(lstSiteAssessment, new Comparator<SiteAssessmentValues>() {
                    @Override
                    public int compare(SiteAssessmentValues o1, SiteAssessmentValues o2) {
                        return o1.getWhvalues().getWhvalues_id() == o2.getWhvalues().getWhvalues_id() ? 1 : 0;
                    }

                });

            } catch (Exception ex) {
                System.out.println("EXCEPTION:" + ex.getStackTrace() + "------" + ex.getStackTrace());
            }

        }

    } catch (Exception ex) {

    }

%>
<portlet:actionURL name="deleteCurrentRecordFromWhValues" var="deleteRecord"/>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/site1_ind_popup.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step1_ind.jsp"/>
<c:set var="DeleteUrl" value="<%=deleteRecord %>"/>
<c:set var="currentDiv" value="indDiv"/>
<c:set var="versionId" value="<%=assesmentVersionId %>"/>

<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <th class="number">No.</th>
        <th class="values">Values</th>
        <th class="description">Description</th>
        <th class="whCriterion">WH Criteria</th>
        <th class="editIcons hideAdminAction">Edit / Delete</th>
    </tr>
    <%
        if (lstSiteAssessment.size() == 0) {
    %>
    <tr>
        <td colspan=5 style="text-align:center"><span
                class="blankCellStyle"> Add Identifying And Describing Values</span></td>


    </tr>
    <%
        }
    %>
    <c:forEach items="<%=lstSiteAssessment %>" var="whValues" varStatus="status">


        <tr id="${whValues.getWhvalues().getWhvalues_id()}_WH_TR">
            <td class="dataHeading"><c:out value="${whValues.getSno()}"/></td>
            <td class="dataHeading"><c:out value="${whValues.getWhvalues().getValues()}"/></td>
            <td id="${whValues.getWhvalues().getWhvalues_id()}_CRT_TD">
                <span colspan="4" id="${whValues.getWhvalues().getWhvalues_id()}_DES_TD"><c:out
                        value="${whValues.getWhvalues().getDescription()}"/> </span>
            </td>

            <td class="dataHeading" id="${whValues.getWhvalues().getWhvalues_id()}_CRT_TD">Criteria: <c:out
                    value="${whValues.getStrwhvalues_whcriterion()}"/></td>
            <td class="editIcons hideAdminAction dataHeading">
                <div class="editDelete">
                    <a href="#"
                       onclick="javascript:dynamicPopup('${UpdateUrl}','${whValues.getWhvalues().getWhvalues_id()}','Identifying And Describing Values',event); return false;"
                       class="edit">edit</a>
                    <a href="javascript:validateDelete('${versionId}','${RefreshUrl}','${currentDiv}','${whValues.getWhvalues().getWhvalues_id()}','whValue');"
                       class="delete">delete</a>
                </div>
            </td>


        </tr>
    </c:forEach>

    </tbody>
</table>
