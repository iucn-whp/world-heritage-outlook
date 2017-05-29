<%@page import="com.iucn.whp.dto.AssessmentValueCssClass" %>
<%@page import="com.iucn.whp.dto.SiteAssessment_PotectionMgtDTO" %>
<%@include file="/init_import.jsp" %>
<%
    List<protection_mgmt_checklist_lkp> listProtection_mgmt_checklist_lkp = protection_mgmt_checklist_lkpLocalServiceUtil.findAll();
    //sort by topic_sort column
    Collections.sort(listProtection_mgmt_checklist_lkp, new Comparator<protection_mgmt_checklist_lkp>() {
        @Override
        public int compare(protection_mgmt_checklist_lkp o1, protection_mgmt_checklist_lkp o2) {
            return o1.getTopic_sort() - o2.getTopic_sort();
        }
    });

    AssessmentValueCssClass threatRating = new AssessmentValueCssClass();
    long assessment_versionId = 1;
    assessment_versionId = Long.parseLong(request.getAttribute("versionId").toString());

    List<protection_management> listprotection_management = new ArrayList<protection_management>();

    Set<protection_management> temp = new TreeSet<protection_management>();

    temp.addAll(protection_managementLocalServiceUtil.findByAssessementVersionId(assessment_versionId));

    listprotection_management.addAll(temp);

//System.out.println("listprotection_management"+listprotection_management);

    List<protection_management_ratings_lkp> protection_management_ratings_lkpList = protection_management_ratings_lkpLocalServiceUtil.findAll();
    //protection_mgmt_checklist_lkpLocalServiceUtil
    List<SiteAssessment_PotectionMgtDTO> objSiteAssessment_PotectionMgtDTO = new ArrayList<SiteAssessment_PotectionMgtDTO>();

    if (listprotection_management != null && !listprotection_management.isEmpty()) {
        for (protection_mgmt_checklist_lkp templistProtection_mgmt_checklist_lkp : listProtection_mgmt_checklist_lkp) {

            long mgmt_checklistId = templistProtection_mgmt_checklist_lkp.getTopic_id();
            SiteAssessment_PotectionMgtDTO tempSiteAssessment_PotectionMgtDTO = new SiteAssessment_PotectionMgtDTO();
            for (protection_management tempprotection_management : listprotection_management) {
                if (tempprotection_management.getTopic_id() == mgmt_checklistId) {
                    tempSiteAssessment_PotectionMgtDTO.setProtection_management(tempprotection_management);
                    if (tempprotection_management.getRating() > 0) {
                        for (protection_management_ratings_lkp tempProtection_management_ratings_lkp : protection_management_ratings_lkpList) {
                            if (tempprotection_management.getRating() == tempProtection_management_ratings_lkp.getId()) {
                                tempSiteAssessment_PotectionMgtDTO.setStrprotection_management_ratings(tempProtection_management_ratings_lkp.getPm_rating());
                                break;
                            }
                        }
                    }
                    tempSiteAssessment_PotectionMgtDTO.setProtection_mgmt_checklist(templistProtection_mgmt_checklist_lkp.getTopic());
                    tempSiteAssessment_PotectionMgtDTO.setTopicId(mgmt_checklistId);
                    objSiteAssessment_PotectionMgtDTO.add(tempSiteAssessment_PotectionMgtDTO);
                    break;
                }
            }
        }
    }

    Collections.sort(objSiteAssessment_PotectionMgtDTO);
    prot_mgmt_best_practices objbest_practices = null;

    List<prot_mgmt_best_practices> prot_best_practicelList = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(assessment_versionId);
    if (prot_best_practicelList != null && prot_best_practicelList.size() > 0) {
        objbest_practices = prot_best_practicelList.get(0);
    }
%>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/editstep3_protection_mgt.jsp"/>


<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <th colspan="2"></th>
        <th colspan="5">Assessment</th>
        <th rowspan="2" class="editIcons hideAdminAction">Edit</th>
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
    <%
        if (objSiteAssessment_PotectionMgtDTO.isEmpty()) {
    %>
    <tr>
        <td colspan=8 align="center"><span class="blankCellStyle">Add Protection and Management</span></td>


    </tr>
    <script>
        $("#step3").removeClass('aui-state-complete');
    </script>
    <%

        }

        for (SiteAssessment_PotectionMgtDTO tempSiteAssessment_PotectionMgtDTO : objSiteAssessment_PotectionMgtDTO) {
            long rating = 0;
            String assessment = "";

            //this topic_id identified in  db_changed.sql and  it is an static.
            if (tempSiteAssessment_PotectionMgtDTO.getTopicId() == 15){
                continue;
            }
            if (tempSiteAssessment_PotectionMgtDTO.getStrprotection_management_ratings() != null) {
                rating = tempSiteAssessment_PotectionMgtDTO.getProtection_management().getRating();
                assessment = tempSiteAssessment_PotectionMgtDTO.getStrprotection_management_ratings();
            }
            threatRating.setCssClass(rating);
    %>
    <tr id="<%=tempSiteAssessment_PotectionMgtDTO.getTopicId()%>_TR">
        <td id="<%=tempSiteAssessment_PotectionMgtDTO.getTopicId()%>_R_TD"><%= tempSiteAssessment_PotectionMgtDTO.getProtection_mgmt_checklist()%>
        </td>
        <td id="<%=tempSiteAssessment_PotectionMgtDTO.getTopicId()%>_JS_TD"><%= tempSiteAssessment_PotectionMgtDTO.getProtection_management() != null ? tempSiteAssessment_PotectionMgtDTO.getProtection_management().getJustification() : "" %>
        </td>
        <td><%= rating == 1 ? "<span class=" + threatRating.getCssClass() + "></span>" : "" %>
        </td>
        <td><%= rating == 2 ? "<span class=" + threatRating.getCssClass() + "></span>" : "" %>
        </td>
        <td><%= rating == 3 ? "<span class=" + threatRating.getCssClass() + "></span>" : "" %>
        </td>
        <td><%= rating == 4 ? "<span class=" + threatRating.getCssClass() + "></span>" : "" %>
        </td>
        <td><%= rating == 5 ? "<span class=" + threatRating.getCssClass() + "></span>" : "" %>
        </td>
        <td class="editIcons hideAdminAction">
            <div class="editDelete">
                <a href="#"
                   onclick="javascript:dynamicPopup('${UpdateUrl}','<%=tempSiteAssessment_PotectionMgtDTO.getProtection_management() !=null ? tempSiteAssessment_PotectionMgtDTO.getProtection_management().getPrimaryKey() : "-"+tempSiteAssessment_PotectionMgtDTO.getTopicId() %>','Assessing Protection and management',event); return false;"
                   class="edit">edit</a>
                <!-- <a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${whValues.getWhvalues().getWhvalues_id()}','Assessment');" class="delete">delete</a>-->
            </div>
        </td>
    </tr>


    <%
        }
    %>

    </tbody>
</table>