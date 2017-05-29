<%@page import="com.iucn.whp.dto.BenefitDTO" %>
<%@include file="/init_import.jsp" %>

<%
    List<benefits> lstbenefit = null;
    List<BenefitDTO> lstclassBenefit = new ArrayList<BenefitDTO>();

    List<negative_factors_level_impact> negativeLevels = new ArrayList<negative_factors_level_impact>();
    List<negative_factors_trend> trends = new ArrayList<negative_factors_trend>();

    Map<Long, String> negativeLevelsMap = new HashMap<Long, String>();
    Map<Long, String> trendsMap = new HashMap<Long, String>();

    try {
        long assesmentVersionId = Long.parseLong(request.getAttribute("versionId").toString());
        lstbenefit = benefitsLocalServiceUtil.getbenefitByVersion(assesmentVersionId);

        int i = 1;

        if (lstbenefit.size() > 0) {

            negativeLevels = negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impacts(-1, -1);
            trends = negative_factors_trendLocalServiceUtil.getnegative_factors_trends(-1, -1);

            for (negative_factors_level_impact level : negativeLevels) {
                negativeLevelsMap.put(level.getLevel_id(), level.getLevel_impact());
            }

            for (negative_factors_trend trend : trends) {
                trendsMap.put(trend.getTrend_id(), trend.getTrend());
            }

            Collections.sort(lstbenefit, new Comparator<benefits>() {
                @Override
                public int compare(benefits o1, benefits o2) {
                    return Long.compare(o1.getBenefits_id(), o2.getBenefits_id());
                }
            });

            for (benefits lst_benefits : lstbenefit) {

                BenefitDTO objbenefit = new BenefitDTO();

                List<benefit_checksubtype_lkp> objSubTypelkp = new ArrayList<benefit_checksubtype_lkp>();

                //getting subtype list
                List<benefits_type_ref> objbenefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(lst_benefits.getBenefits_id());
                long benefitType = 0;

                for (benefits_type_ref benefits_type_refTemp : objbenefits_type_ref) {

                    benefitType = benefits_type_refTemp.getBenefit_checktype();

                    long subType = benefits_type_refTemp.getBenefit_checksubtype();

                    objSubTypelkp.add(benefit_checksubtype_lkpLocalServiceUtil.getbenefit_checksubtype_lkp(subType));
                }
                objbenefit.setObjbenefits(lst_benefits);
                objbenefit.setCount(i);
                i++;

                //set type
                if (benefitType > 0) {
                    objbenefit.setBenefitchecktypelkp(benefit_checktype_lkpLocalServiceUtil.getbenefit_checktype_lkp(benefitType));
                }

                //set subtype
                if (lst_benefits != null) {
                    objbenefit.setBenefitchecksubtypelkp(objSubTypelkp);

                    if (lst_benefits.getCommunity_outside_site() > 0) {
                        objbenefit.setBenefitratingOutside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getCommunity_outside_site()));
                    }

                    if (lst_benefits.getCommunity_within_site() > 0) {
                        objbenefit.setBenefitratingInside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getCommunity_within_site()));
                    }

                    if (lst_benefits.getWider_community() > 0) {
                        objbenefit.setBenefitratingWider(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getWider_community()));
                    }

                    objbenefit.setObjbenefits(lst_benefits);
                    lstclassBenefit.add(objbenefit);

                    if (objbenefit.getObjbenefits().getData_deficient()) {
                        objbenefit.setDatadeficent("Data deficient");
                    } else {
                        objbenefit.setDatadeficent("Present");
                    }
                }
            }

        }

    } catch (Exception e) {
    }
%>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/site7_benefits_pop.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step7_understand_benefit.jsp"/>
<c:set var="currentDiv" value="step7Div"/>
<c:set var="negativeLevelsMap" value="<%= negativeLevelsMap %>"/>
<c:set var="trendsMap" value="<%= trendsMap %>"/>

<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <th colspan="5"></th>
        <th colspan="6">Factors negatively affecting provision of selected benefits</th>
        <th colspan="1"></th>
    </tr>

    <tr>
        <th>No</th>
        <th>Benefit Type</th>
        <th>Specific benefits</th>
        <th>State</th>
        <th>Summary</th>
        <th>Habitat change (land use change)</th>
        <th>Pollution</th>
        <th>Over exploitation</th>
        <th>Climate change</th>
        <th>Invasive species</th>
        <th>Comments on factors</th>
        <th>Edit / Delete</th>
    </tr>
    <%
        if (lstclassBenefit.isEmpty()) {
    %>
    <tr>
        <td colspan=11 align="center"><span class="blankCellStyle">Add  Benefits</span></td>
    </tr>
    <script>
        $("#step6").removeClass('aui-state-complete');
    </script>
    <%
        }
    %>

    <c:forEach items="<%=lstclassBenefit%>" var="understandingbenefit" varStatus="status">
        <%
            BenefitDTO benefitDTO = (BenefitDTO) pageContext.getAttribute("understandingbenefit");
            List<benefit_checksubtype_lkp> lstBenifitSub = benefitDTO.getBenefitchecksubtypelkp();
            int lstSize = lstBenifitSub.size();

        %>
        <c:forEach items="${understandingbenefit.getBenefitchecksubtypelkp()}" var="subtype" varStatus="status">
            <%-- <c:out value="${status.count)"/>
             --%>
            <c:if test="${understandingbenefit.getObjbenefits().getSelected_benefit() == 1}">
                <c:set var="countCheck" value="true"/>
            </c:if >

            <c:if test="${status.count eq 1}">
                <c:set var="understandingbenefit" value="${understandingbenefit}"/>
                <%--
                    This "if" need for disabled benefit "Nature conservation values". This is is static value and be equesl on all db.
                --%>
                <c:if test="${understandingbenefit.getObjbenefits().getSelected_benefit() != 1}">
                    <tr id="${understandingbenefit.getObjbenefits().getBenefits_id()}_TR">
                        <td rowspan="<%=lstSize %>">
                            <c:if test="${countCheck}">
                                <c:out value="${understandingbenefit.getCount()-1}"/>
                            </c:if>
                            <c:if test="${!countCheck}" >
                                <c:out value="${understandingbenefit.getCount()}"/>
                            </c:if>
                        </td>
                        <td rowspan="<%=lstSize %>"
                            id="${understandingbenefit.getObjbenefits().getBenefits_id()}CTY_TD">
                            <c:out value="${understandingbenefit.getBenefitchecktypelkp().getBenefit_checktype()}"/>
                        </td>

                        <td id="${understandingbenefit.getObjbenefits().getBenefits_id()}_${subtype.getSubbenefit_id() }_SUB_TD"
                            style="width:200px;">
                            <c:out value="${subtype.getBenefit_checksubtype()}"/>
                        </td>

                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}DD_TD">
                            <c:out value="${understandingbenefit.getDatadeficent()}"/>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}SM_TD">
                            <c:out value="${understandingbenefit.getObjbenefits().getSummary()}"/>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}HC">
                            <c:if test="${understandingbenefit.objbenefits.habitatChangeLevel gt 0}">
                                <span>Impact level - ${negativeLevelsMap[understandingbenefit.objbenefits.habitatChangeLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.habitatChangeTrend gt 0}">
                                <span>Trend - ${trendsMap[understandingbenefit.objbenefits.habitatChangeTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}P">
                            <c:if test="${understandingbenefit.objbenefits.pollutionLevel gt 0}">
                                <span>Impact level - ${negativeLevelsMap[understandingbenefit.objbenefits.pollutionLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.pollutionTrend gt 0}">
                                <span>Trend - ${trendsMap[understandingbenefit.objbenefits.pollutionTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}OE">
                            <c:if test="${understandingbenefit.objbenefits.overExploitationLevel gt 0}">
                                <span>Impact level - ${negativeLevelsMap[understandingbenefit.objbenefits.overExploitationLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.overExploitationTrend gt 0}">
                                <span>Trend - ${trendsMap[understandingbenefit.objbenefits.overExploitationTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}CC">
                            <c:if test="${understandingbenefit.objbenefits.climateChangeLevel gt 0}">
                                <span>Impact level - ${negativeLevelsMap[understandingbenefit.objbenefits.climateChangeLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.climateChangeTrend gt 0}">
                                <span>Trend - ${trendsMap[understandingbenefit.objbenefits.climateChangeTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}IS">
                            <c:if test="${understandingbenefit.objbenefits.invasiveSpeciesLevel gt 0}">
                                <span>Impact level - ${negativeLevelsMap[understandingbenefit.objbenefits.invasiveSpeciesLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.invasiveSpeciesTrend gt 0}">
                                <span>Trend - ${trendsMap[understandingbenefit.objbenefits.invasiveSpeciesTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}C">
                            <c:out value="${understandingbenefit.getObjbenefits().getComment()}"/>
                        </td>

                        <td rowspan="<%=lstSize %>" class="editIcons hideAdminAction">
                            <div class="editDelete">
                                <a href="#"
                                   onclick="javascript:dynamicPopup('${UpdateUrl}','${understandingbenefit.getObjbenefits().getBenefits_id()}','Understanding Benefits..',event); return false;"
                                   class="edit">edit</a>
                                <a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${understandingbenefit.getObjbenefits().getBenefits_id()}','Understanding Benefits');"
                                   class="delete">delete</a>
                            </div>
                        </td>
                    </tr>
                </c:if>
            </c:if>
            <c:if test="${status.count >1}">
                <c:if test="${understandingbenefit.getObjbenefits().getSelected_benefit() != 1}">
                    <TR>
                        <td id="${understandingbenefit.getObjbenefits().getBenefits_id()}_${subtype.getSubbenefit_id() }_SUB_TD"
                            style="width:200px;">
                            <c:out value="${subtype.getBenefit_checksubtype()}"/>
                        </td>
                    </TR>
                </c:if>
            </c:if>
        </c:forEach>
    </c:forEach>
    </tbody>
</table>

 