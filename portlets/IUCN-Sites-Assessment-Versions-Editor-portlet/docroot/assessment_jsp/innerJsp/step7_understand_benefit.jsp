<%@include file="../../init.jsp" %>

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
    </tr>

    <c:forEach items="${assessment.benefitsDTO.understandBenefitsDTOList}" var="understandingbenefit"
               varStatus="status">
        <c:set var="benefitchecksubtypeListSize" value="${understandingbenefit.benefitchecksubtypelkp.size()}"/>
        <c:forEach items="${understandingbenefit.benefitchecksubtypelkp}" var="subtype" varStatus="status">
            <c:if test="${status.count eq 1}">
                <%--
                    This "if" need for disabled benefit "Nature conservation values". This is is static value and be equesl on all db.
                --%>
                <c:if test="${understandingbenefit.getObjbenefits().getSelected_benefit() != 1}">
                    <tr id="${understandingbenefit.objbenefits.getBenefits_id()}_TR">
                        <td rowspan="${benefitchecksubtypeListSize}"><c:out value="${status.count}"/></td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}CTY_TD">
                            <c:out value="${understandingbenefit.getBenefitchecktypelkp().getBenefit_checktype()}"/>
                        </td>

                        <td id="${understandingbenefit.objbenefits.getBenefits_id()}_${subtype.getSubbenefit_id() }_SUB_TD"
                            style="width:200px;">
                            <c:out value="${subtype.getBenefit_checksubtype()}"/>
                        </td>

                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}DD_TD">
                            <c:out value="${understandingbenefit.getDatadeficent()}"/>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}SM_TD">
                            <c:out value="${understandingbenefit.getObjbenefits().getSummary()}"/>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}HC">
                            <c:if test="${understandingbenefit.objbenefits.habitatChangeLevel gt 0}">
                                <span>Impact level - ${understandingbenefit.negativeLevelsMap[understandingbenefit.objbenefits.habitatChangeLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.habitatChangeTrend gt 0}">
                                <span>Trend - ${understandingbenefit.trendsMap[understandingbenefit.objbenefits.habitatChangeTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}P">
                            <c:if test="${understandingbenefit.objbenefits.pollutionLevel gt 0}">
                                <span>Impact level - ${understandingbenefit.negativeLevelsMap[understandingbenefit.objbenefits.pollutionLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.pollutionTrend gt 0}">
                                <span>Trend - ${understandingbenefit.trendsMap[understandingbenefit.objbenefits.pollutionTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}OE">
                            <c:if test="${understandingbenefit.objbenefits.overExploitationLevel gt 0}">
                                <span>Impact level - ${understandingbenefit.negativeLevelsMap[understandingbenefit.objbenefits.overExploitationLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.overExploitationTrend gt 0}">
                                <span>Trend - ${understandingbenefit.trendsMap[understandingbenefit.objbenefits.overExploitationTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}CC">
                            <c:if test="${understandingbenefit.objbenefits.climateChangeLevel gt 0}">
                                <span>Impact level - ${understandingbenefit.negativeLevelsMap[understandingbenefit.objbenefits.climateChangeLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.climateChangeTrend gt 0}">
                                <span>Trend - ${understandingbenefit.trendsMap[understandingbenefit.objbenefits.climateChangeTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.objbenefits.getBenefits_id()}IS">
                            <c:if test="${understandingbenefit.objbenefits.invasiveSpeciesLevel gt 0}">
                                <span>Impact level - ${understandingbenefit.negativeLevelsMap[understandingbenefit.objbenefits.invasiveSpeciesLevel]};</span>
                                <br/>
                            </c:if>
                            <c:if test="${understandingbenefit.objbenefits.invasiveSpeciesTrend gt 0}">
                                <span>Trend - ${understandingbenefit.trendsMap[understandingbenefit.objbenefits.invasiveSpeciesTrend]};</span>
                            </c:if>
                        </td>
                        <td rowspan="${benefitchecksubtypeListSize}"
                            id="${understandingbenefit.getObjbenefits().getBenefits_id()}C">
                            <c:out value="${understandingbenefit.objbenefits.comment}"/>
                        </td>

                    </tr>
                </c:if>
            </c:if>
            <c:if test="${status.count >1}">
                <c:if test="${understandingbenefit.getObjbenefits().getSelected_benefit() != 1}">
                    <TR>
                        <td id="${understandingbenefit.objbenefits.getBenefits_id()}_${subtype.getSubbenefit_id() }_SUB_TD"
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