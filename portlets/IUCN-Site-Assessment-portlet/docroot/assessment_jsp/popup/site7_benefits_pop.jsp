<%@ include file="/init.jsp" %>
<%
    long assessmentVersionId = 0;

    benefits benefitsobj = new benefitsClp();
    benefits_type_ref benefits_typeobj = new benefits_type_refClp();

    List<benefit_checktype_lkp> lstbenefitchktyp_lkp = null;
    List<benefits_type_ref> lstbenefits_type_ref = null;

    List<negative_factors_level_impact> negativeLevels = new ArrayList<negative_factors_level_impact>();
    List<negative_factors_trend> trends = new ArrayList<negative_factors_trend>();
    List<Long> lstsubtype = new ArrayList<Long>();

    try {

        String selectedPkey = request.getParameter("keyVal").toString();
        assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));

        lstbenefitchktyp_lkp = benefit_checktype_lkpLocalServiceUtil.findBenefitCheckTypeByActiveStatus(true);

        negativeLevels = negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impacts(-1, -1);
        trends = negative_factors_trendLocalServiceUtil.getnegative_factors_trends(-1, -1);

        if (selectedPkey != null && !selectedPkey.isEmpty()) {
            lstbenefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(Long.parseLong(selectedPkey));
            benefitsobj = benefitsLocalServiceUtil.getbenefits(Long.parseLong(selectedPkey));

            for (benefits_type_ref obj : lstbenefits_type_ref) {
                lstsubtype.add(obj.getBenefit_checksubtype());
            }

        } else {
            benefitsobj.setData_deficient(false);
            benefitsobj.setCommunity_within_site(0);
            benefitsobj.setCommunity_outside_site(0);
            benefitsobj.setWider_community(0);
            benefitsobj.setSummary("");
            benefitsobj.setAssessment_version_id(assessmentVersionId);
            benefitsobj.setSelected_benefit(0);
            benefits_typeobj.setBenefit_checksubtype(0);
            benefits_typeobj.setBenefit_checksubtype(0);
        }
    } catch (Exception ex) {
    }
%>

<portlet:defineObjects/>

<portlet:actionURL name="understandingBenefit" var="step7"/>

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step7 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step7_understand_benefit.jsp"/>
<c:set var="benefitsobj" value="<%= benefitsobj %>"/>
<c:set var="negativeLevels" value="<%= negativeLevels %>"/>
<c:set var="trends" value="<%= trends %>"/>

<aui:form id="step7Form" name="step7Form" action="" method="post">

    <table class="formBlock">
        <aui:input name="benefitid" id="benefitid" value="<%=benefitsobj.getBenefits_id()%>" type="hidden"/>
        <aui:input name="assessmentVersionId" id="assessmentVersionId" value="<%=assessmentVersionId%>" type="hidden"/>

        <tr>
            <td class="lblTD">
                <label class="popuplbl"> Select Benefit type: </label>
            </td>
            <td>
                <select id="benefittype" name="benefittype" style="width:400px;">
                    <option value="">Select Benefit type</option>
                    <%
                        for (int i = 0; i < lstbenefitchktyp_lkp.size(); i++) {
                            benefit_checktype_lkp benefit_checktypelkp = lstbenefitchktyp_lkp.get(i);

                            if (benefit_checktypelkp.getBenefit_id() == benefitsobj.getSelected_benefit()) {

                    %>
                    <aui:option selected="true" value="<%=benefit_checktypelkp.getBenefit_id() %>">
                        <%=benefit_checktypelkp.getBenefit_checktype() %>
                    </aui:option>
                    <%} else { %>
                    <aui:option value="<%=benefit_checktypelkp.getBenefit_id() %>">
                        <%=benefit_checktypelkp.getBenefit_checktype() %>
                    </aui:option>
                    <%
                            }
                        }
                    %>
                </select>
            </td>
        </tr>

        <tr>
            <td class="lblTD"><label class="popuplbl">Select specific benefits: </label></td>
            <td>
                <!-- 	<select id="benefitSubtype" name="benefitSubtype" multiple  size="6"   style="width:400px;" >
                 -->
                <div class="checkboxList" id="subtype">
                    <%
                        List<benefit_checksubtype_lkp> lstchksubtyp = benefit_checksubtype_lkpLocalServiceUtil.findBenefitCheckSubTypeByActiveStatus(true);

                        for (int i = 0; i < lstchksubtyp.size(); i++) {
                            if (lstchksubtyp.get(i).getSubbenefit_id() == 27 ||
                                    lstchksubtyp.get(i).getSubbenefit_id() == 28) {

                                lstchksubtyp.remove(i);
                                i--;
                            }
                        }

                        for (int i = 0; i < lstchksubtyp.size(); i++) {
                            benefit_checksubtype_lkp tempbenefit_checksubtype_lkp = lstchksubtyp.get(i);
                            long tempParentid = tempbenefit_checksubtype_lkp.getParent_id();

                            if (tempParentid == benefitsobj.getSelected_benefit()) {
                                if (lstsubtype.contains(tempbenefit_checksubtype_lkp.getSubbenefit_id())) {
                    %>

                    <input type="checkbox" name="benefitSubtype" id="benefitSubtype" checked
                           value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>"><%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%>
                    <br>
                        <%-- aui:option selected="true"	value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>">
                                <%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%>
                            </aui:option> --%>
                    <%} else { %>
                        <%-- <aui:option value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>">
                            <%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%>
                        </aui:option> --%>
                    <input type="checkbox" name="benefitSubtype" id="benefitSubtype"
                           value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>"><%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%>
                    <br>
                    <%
                                }
                            }
                        }
                    %>
                    <!--  </select> -->
                </div>
            </td>
        </tr>

        <tr>
            <td class="lblTD"><label class="popuplbl"> Write Summary: </label></td>
            <td spellcheck="true" class="valueTD">
                <aui:input type="textarea" label="" id="summary" name="summary" value="<%=benefitsobj.getSummary()%>"/>
            </td>
        </tr>

        <tr>
            <td class="lblTD" colspan="2"><label class="popuplbl">Factors negatively affecting provision of selected
                benefit:</label></td>
        </tr>

        <tr>
            <td></td>
            <td>
                <div>
                    <div class="negative-factors-table">Level of impact</div>
                    <div class="negative-factors-table">Trend</div>
                </div>
            </td>
        </tr>

        <tr>
            <td class="lblTD"><label class="popuplbl">Habitat change (land use change)</label></td>
            <td>
                <div>
                    <aui:select label="" id="habitatChangeLevel" name="habitatChangeLevel"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${negativeLevels}" var="negativeFactorLevel">
                            <aui:option selected="${negativeFactorLevel.level_id eq benefitsobj.habitatChangeLevel}"
                                        value="${negativeFactorLevel.level_id}">${negativeFactorLevel.level_impact}</aui:option>
                        </c:forEach>
                    </aui:select>
                    <aui:select label="" id="habitatChangeTrend" name="habitatChangeTrend"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${trends}" var="negativeFactorTrend">
                            <aui:option selected="${negativeFactorTrend.trend_id eq benefitsobj.habitatChangeTrend}"
                                        value="${negativeFactorTrend.trend_id}">${negativeFactorTrend.trend}</aui:option>
                        </c:forEach>
                    </aui:select>
                </div>
            </td>
        </tr>
        <tr>
            <td class="lblTD"><label class="popuplbl">Pollution</label></td>
            <td>
                <div>
                    <aui:select label="" id="pollutionLevel" name="pollutionLevel" cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${negativeLevels}" var="negativeFactorLevel">
                            <aui:option selected="${negativeFactorLevel.level_id eq benefitsobj.pollutionLevel}"
                                        value="${negativeFactorLevel.level_id}">${negativeFactorLevel.level_impact}</aui:option>
                        </c:forEach>
                    </aui:select>
                    <aui:select label="" id="pollutionTrend" name="pollutionTrend" cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${trends}" var="negativeFactorTrend">
                            <aui:option selected="${negativeFactorTrend.trend_id eq benefitsobj.pollutionTrend}"
                                        value="${negativeFactorTrend.trend_id}">${negativeFactorTrend.trend}</aui:option>
                        </c:forEach>
                    </aui:select>
                </div>
            </td>
        </tr>
        <tr>
            <td class="lblTD"><label class="popuplbl">Over exploitation</label></td>
            <td>
                <div>
                    <aui:select label="" id="overExploitationLevel" name="overExploitationLevel"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${negativeLevels}" var="negativeFactorLevel">
                            <aui:option selected="${negativeFactorLevel.level_id eq benefitsobj.overExploitationLevel}"
                                        value="${negativeFactorLevel.level_id}">${negativeFactorLevel.level_impact}</aui:option>
                        </c:forEach>
                    </aui:select>
                    <aui:select label="" id="overExploitationTrend" name="overExploitationTrend"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${trends}" var="negativeFactorTrend">
                            <aui:option selected="${negativeFactorTrend.trend_id eq benefitsobj.overExploitationTrend}"
                                        value="${negativeFactorTrend.trend_id}">${negativeFactorTrend.trend}</aui:option>
                        </c:forEach>
                    </aui:select>
                </div>
            </td>
        </tr>
        <tr>
            <td class="lblTD"><label class="popuplbl">Climate change</label></td>
            <td>
                <div>
                    <aui:select label="" id="climateChangeLevel" name="climateChangeLevel"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${negativeLevels}" var="negativeFactorLevel">
                            <aui:option selected="${negativeFactorLevel.level_id eq benefitsobj.climateChangeLevel}"
                                        value="${negativeFactorLevel.level_id}">${negativeFactorLevel.level_impact}</aui:option>
                        </c:forEach>
                    </aui:select>
                    <aui:select label="" id="climateChangeTrend" name="climateChangeTrend"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${trends}" var="negativeFactorTrend">
                            <aui:option selected="${negativeFactorTrend.trend_id eq benefitsobj.climateChangeTrend}"
                                        value="${negativeFactorTrend.trend_id}">${negativeFactorTrend.trend}</aui:option>
                        </c:forEach>
                    </aui:select>
                </div>
            </td>
        </tr>
        <tr>
            <td class="lblTD"><label class="popuplbl">Invasive species</label></td>
            <td>
                <div>
                    <aui:select label="" id="invasiveSpeciesLevel" name="invasiveSpeciesLevel"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${negativeLevels}" var="negativeFactorLevel">
                            <aui:option selected="${negativeFactorLevel.level_id eq benefitsobj.invasiveSpeciesLevel}"
                                        value="${negativeFactorLevel.level_id}">${negativeFactorLevel.level_impact}</aui:option>
                        </c:forEach>
                    </aui:select>
                    <aui:select label="" id="invasiveSpeciesTrend" name="invasiveSpeciesTrend"
                                cssClass="negative-factors-table">
                        <aui:option value="0">Select</aui:option>
                        <c:forEach items="${trends}" var="negativeFactorTrend">
                            <aui:option selected="${negativeFactorTrend.trend_id eq benefitsobj.invasiveSpeciesTrend}"
                                        value="${negativeFactorTrend.trend_id}">${negativeFactorTrend.trend}</aui:option>
                        </c:forEach>
                    </aui:select>
                </div>
            </td>
        </tr>

        <tr>
            <td class="lblTD">
                <label class="popuplbl"> Comments on factors: </label>
            </td>
            <td spellcheck="true" class="valueTD">
                <aui:input type="textarea" label="" id="comment" name="comment" value="<%=benefitsobj.getComment()%>"/>
            </td>
        </tr>

        <tr>
            <td class="btnTD" colspan="2">
                <aui:button type="button" value="Submit" onclick="javascript:validatestep7Form();"/>
                <aui:button name="cancelButton" type="button" value="Cancel"
                            onclick="javascript:top.document.getElementById('closethick').click();"/>
            </td>
        </tr>
    </table>
</aui:form>

<script type="text/javascript">

    jQuery(function () {

        jQuery("#benefittype").change(function () {
            jQuery("#subtype").empty();

            var firsttyp = jQuery("#benefittype").val();

            <%

            List<benefit_checksubtype_lkp> chksubtyplst = benefit_checksubtype_lkpLocalServiceUtil.findAll();


                           for (int i = 0; i < chksubtyplst.size(); i++){
                               if (chksubtyplst.get(i).getSubbenefit_id() == 27 || chksubtyplst.get(i).getSubbenefit_id() == 28){
                                   chksubtyplst.remove(i);
                                   i--;
                               }
                           }

            Collections.sort(chksubtyplst, new Comparator<benefit_checksubtype_lkp>() {
               @Override
               public int compare(benefit_checksubtype_lkp o1, benefit_checksubtype_lkp o2) {
                   return (int) (o1.getPosition() - o2.getPosition());
               }
           });

           for(int i=0;i<chksubtyplst.size();i++) {
                benefit_checksubtype_lkp tempbenefit_checksubtype_lkp=chksubtyplst.get(i);
                long tempParentid=tempbenefit_checksubtype_lkp.getParent_id();
            %>
            var pid =<%=tempParentid%>;

            if (firsttyp == pid) {
                /* 				 alert("tempbenefit_checksubtype_lkp"+pid);
                 */
                <%--  jQuery("#selectedbenefit").append(jQuery("<option><option/>").attr("value",'<%=tempbenefit_checksubtype_lkp.getSubbenefit_id()%>')
                            .text('<%=tempbenefit_checksubtype_lkp.getSubbenefit_id()%>')); --%>
                jQuery("#subtype").append('<input type="checkbox" id = "benefitSubtype" name = "benefitSubtype" value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id()%>" onclick="javascript:disableSummary();"> <%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype() %><br>');

            }
            <%}	%>

        });
    });

</script>
<script>
    function validatestep7Form() {
        var isValid = true;
        var commoutside = $('#<portlet:namespace/>commoutside').val();
        var commwithin = $('#<portlet:namespace/>commwithin').val();
        var commwider = $('#<portlet:namespace/>commwider').val();
        var summary = $('#<portlet:namespace/>summary').val();
        var benefittype = $("#benefittype option:selected").val();

        if (benefittype == 0) {
            isValid = false;
            alert("Please select at least one specific benefit.");
        }

        else if ($('#subtype').find('input[type=checkbox]:checked').length == 0) {
            isValid = false;
            alert('Please select at least one specific benefit');
        }

        else if (summary == "") {
            isValid = false;
            alert("Summary is required.");
        }

        if (isValid) {
            $("input[type=button]").attr("disabled", "disabled");
            submitPopupForm('${versionId }', '${RefreshUrl}', 'step7Div', 'step7Form', '${UpdateUrl }', 7);
        }
    }
</script>