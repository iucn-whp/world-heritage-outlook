<%@page import="com.iucn.whp.assesment.utils.AssessmentActionUtil" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.documentlibrary.model.DLFolderConstants" %>
<%@ page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.documentlibrary.model.DLFileEntry" %>
<%@ page import="com.liferay.portal.kernel.util.*" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@include file="init.jsp" %>

<portlet:defineObjects/>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css" type="text/css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.jqtransform.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.lightbox_me.js"></script>


<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet"
      type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
<portlet:resourceURL var="updateStatus"/>
<!-- Below file included for save the popup form data and refresh the div -->


<%
    long assessmentId = 0;
    long versionId = 0;
    String mode = "view";
    double previousVersionCode = 0;
    Boolean updateForSAV = ParamUtil.getBoolean(request, "updateForSAV", false);
    try {
        String tempAssementId = String.valueOf(request.getAttribute("assesmentId"));
        String tempmode = String.valueOf(request.getAttribute("mode"));
        String tempVersionId = String.valueOf(request.getAttribute("versionId"));
        if (tempAssementId == null || tempAssementId.equalsIgnoreCase("null")) {
            tempAssementId = ParamUtil.getString(request, "assesmentId");
            tempVersionId = ParamUtil.getString(request, "versionId");
            request.setAttribute("assesmentId", tempAssementId);
            request.setAttribute("versionId", tempVersionId);
        } else {
            request.setAttribute("assesmentId", tempAssementId);
            request.setAttribute("versionId", tempVersionId);
        }
        if (tempmode == null || tempmode.equalsIgnoreCase("null")) {
            tempmode = ParamUtil.getString(request, "mode");
        }
        request.setAttribute("mode", tempmode);
        mode = tempmode;
        assessmentId = Long.parseLong(tempAssementId);
        versionId = Long.parseLong(tempVersionId);

    } catch (Exception ex) {
        ex.printStackTrace();
    }

    site_assessment assesment = site_assessmentLocalServiceUtil.getsite_assessment(assessmentId);
    long site_id = assesment.getSite_id();
    String UserName = "";
    String siteName = whp_sitesLocalServiceUtil.getSiteBySiteId(site_id).getName_en();
    site_assessment_versions assessment_versions = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(versionId);
    Double version_id = assessment_versions.getVersion_code();
    /*fix for correct double format*/
    previousVersionCode = AssessmentActionUtil.getCurrentVersionCodeByAssessmentId(assessmentId) - Double.valueOf("0.1");
    long previousVersionId = 0;
    if (previousVersionCode > 0) {
        List<site_assessment_versions> lstPreviousVersions = site_assessment_versionsLocalServiceUtil.findByPrevAssementCodeId(assessmentId, previousVersionCode);
        if (lstPreviousVersions.size() > 0)
            previousVersionId = lstPreviousVersions.get(0).getAssessment_version_id();
    }
    request.setAttribute("previousVersionId", previousVersionId);
    long userId = assessment_versions.getUserid();
    if (userId > 0) {
        UserName = UserLocalServiceUtil.getUser(userId).getFirstName() + " " + UserLocalServiceUtil.getUser(userId).getLastName();
    }

    String fileUrl = themeDisplay.getURLPortal().concat("/")
            .concat("IUCN-Site-Assessment-portlet/Guidelines_IUCN_Conservation_Outlook_Assessments_Version_2_0_FINAL.pdf");

    request.setAttribute("fileUrl", fileUrl);
%>

<aui:script>
    AUI().ready('aui-tabs', function(A) {
    tabCss();
    var tabs1=new A.TabView({
    boundingBox: '#tabs1',
    listNode: '#docs1',
    contentNode: '#docsContent1'
    });
    tabs1.render();
    });

    $(document).ready(function () {
    $("#tabs1").show();
    $("#loadingDiv").remove();

    <%
        System.out.println("mode" + mode);
        if (mode.equalsIgnoreCase("view")) {%>
    //alert('test');
    $(".hideAdminAction").hide();
    <%} %>
    });
</aui:script>
<script>

    var tabnum = 0;
    function validateStep(step) {

        <%



        System.out.println("mode"+mode);
        if(!mode.equalsIgnoreCase("view")) {%>

        var versionId = <c:out value="${versionId}"/>;
        if (step != 8) {
            tabnum = step;
            tabnum++;
            jQuery.get('<%=updateStatus %>&ACTION_CMD=stepStatusUpdate&STEP_NO=' + step + '&VersionId=' + versionId,
                    function (data) {
                        var parsedJSONObject = jQuery.parseJSON(data);
                        var result = parsedJSONObject.rows;
                        var steps = result[0].Step;

                        var stepslst = steps.split(",");
                        var stepsInComp = result[0].incompleteSteps;
                        var stepsArr = stepsInComp.split(",");
                        var stepsComp = result[0].completeSteps;
                        var stepsCompArr = stepsComp.split(",");
                        var CurrentStep = result[0].CurrentStep;

                        var stepSelector = CurrentStep > 5 ? "#step" + (parseInt(CurrentStep) + 1) : "#step" + parseInt(CurrentStep);
                        var index = 0;

                        for (var i = 0; i < stepsCompArr.length; i++) {
                            index = stepsCompArr[i] > 5 ? (parseInt(stepsCompArr[i]) + 1) : stepsCompArr[i];
                            $("#step" + index).addClass('aui-state-complete');
                        }

                        for (var i = 0; i < stepsArr.length; i++) {
                            index = stepsArr[i] > 5 ? (parseInt(stepsArr[i]) + 1) : stepsArr[i];
                            $("#step" + index).removeClass('aui-state-complete');
                            $("#step" + index).addClass('aui-state-default');
                        }

                        $(stepSelector).removeClass('aui-state-complete');

                        for (var i = 0; i < stepslst.length; i++) {
                            if (stepslst[i] == CurrentStep) {
                                $(stepSelector).click();
                            }
                        }

                        if (result[0].isStatusUpdated == false) {

                            if (stepsArr.length == 8 && result[0].stepNum == 0) {
                                return true;
                            }

                            if (steps != "") {
                                var text = stepslst.length == 1 ? "step " : "steps ";
                                alert("Please review and make necessary changes to this " +
                                        "worksheet before proceeding to worksheet " + (Number(steps) + 1));
//                                alert("Please complete " + text + steps + " of assessment questionnaire.");
                            }

                            return false;
                        }
                    });
        }
        <% } %>

    }

    function validatehelp() {
        if (tabnum > 0) {
            var url = "help#ws" + tabnum;
            window.open(url, "_blank");
            window.focus();
        }
    }

    function submitForReview() {
        var versionId = <c:out value="${versionId}"/>;
        jQuery.get('<%=updateStatus %>&ACTION_CMD=stepStatusUpdate&STEP_NO=9&VersionId=' + versionId,
                function (data) {

                    var parsedJSONObject = jQuery.parseJSON(data);
                    var result = parsedJSONObject.rows;

                    if (result[0].isStatusUpdated == false) {
                        var steps = result[0].Step;
                        var CurrentStep = result[0].CurrentStep;
                        if (steps.length == 1)
                            alert("Please review and make necessary changes to this " +
                                    "worksheet before proceeding to worksheet" + steps+1);
//                            alert("Please complete step " + steps + " of assessment questionnaire.");
                        else
                            alert("Please review and make necessary changes to this " +
                                    "worksheet before proceeding to worksheet" + steps+1);
//                            alert("Please complete step " + steps + " of assessment questionnaire.");

                        $("#step" + CurrentStep).click();
                        return false;
                    } else
                        alert("Submitted for Review");

                });

    }

    /*this function for select don't complete step*/
    function tabCss() {
        var versionId = <c:out value="${versionId}"/>;
        jQuery.get('<%=updateStatus %>&ACTION_CMD=stepStatusUpdate&STEP_NO=10&VersionId=' + versionId,
                function (data) {

                    var parsedJSONObject = jQuery.parseJSON(data);
                    var result = parsedJSONObject.rows;
                    var stepsInComp = result[0].incompleteSteps;
                    var stepsArr = stepsInComp.split(",");
                    var CurrentStep = result[0].CurrentStep;
                    var stepsComp = result[0].completeSteps;
                    var stepsCompArr = stepsComp.split(",");
                    tabnum = CurrentStep;
                    var index = 0;

                    for (var i = 0; i < stepsCompArr.length; i++) {
                        index = stepsCompArr[i] > 5 ? (parseInt(stepsCompArr[i]) + 1) : stepsCompArr[i];
                        $("#step" + index).addClass('aui-state-complete');

                    }

                    for (var i = 0; i < stepsArr.length; i++) {
                        index = stepsArr[i] > 5 ? (parseInt(stepsArr[i]) + 1) : stepsArr[i];
                        $("#step" + index).removeClass('aui-state-complete');
                        $("#step" + index).addClass('aui-state-default');
                    }

                    var stepSelector = CurrentStep > 5 ? "#step" + (parseInt(CurrentStep) + 1) : "#step" + parseInt(CurrentStep);

                    $('#step1').click();

//                    comment this, because need altime in reload view step1.
//                    $(stepSelector).click();
                    return false;

                });

    }
</script>
<!-- <div class="loading-animation" id="loadingDiv"></div> -->
<liferay-ui:error key="error-assessment" message="There is a probleam. Please try again!"/>

<div class="headingBTN">
    <h2 class="floatHeading siteAssessmentPageHeading">Site Assessment</h2>

    <div class="headerLinks">
        <a href="/web/iucn/manage-assessment" class="roundedwhiteBTN" style="float:right"><span><p>Back</p></span></a>


<%--        <a href="#" onclick="javascript:validatehelp();" class="roundedwhiteBTN" style="float:right"><span><p
                class="help">Help</p></span></a>--%>

    </div>

</div>


<div id="tabs1" style="display:none;">


    <ul class="aui-tabview-list" id="docs1">
        <li class="aui-tab yui3-widget aui-component" id="step1" onclick="javascript:validateStep(0);" style="">

            <a class="aui-tab-label ie7fix" href="javascript:;">1.&nbsp;Values</a>

        </li>

        <li class="aui-tab yui3-widget aui-component" id="step2" onclick="javascript:validateStep(1);" style="">

            <a id="step2a" class="aui-tab-label ie7fix" href="javascript:;">2.&nbsp;Threats</a>

        </li>

        <li class="aui-tab yui3-widget aui-component" id="step3" onclick="javascript:validateStep(2);" style="">

            <a class="aui-tab-label" id="step3a" href="javascript:validateStep(2);">3.&nbsp;Protection & <br>&nbsp;&nbsp;&nbsp;Management</a>

        </li>

        <li class="aui-tab yui3-widget aui-component" id="step4" onclick="javascript:validateStep(3);" style="">

            <a class="aui-tab-label" id="step4a" href="javascript:;">4.&nbsp;Assessing <br>&nbsp;&nbsp;&nbsp;Values</a>

        </li>
        <li class="aui-tab yui3-widget aui-component" id="step5" onclick="javascript:validateStep(4);" style="">

            <a class="aui-tab-label" href="javascript:;">5.&nbsp;Conservation <br>&nbsp;&nbsp;&nbsp;Outlook</a>

        </li>

        <%--<li class="aui-tab yui3-widget aui-component" id="step6" onclick="javascript:validateStep(5);" style="">--%>

            <%--<a class="aui-tab-label" href="javascript:;">--%>
                <%--6.&nbsp;Conservation <br>&nbsp;&nbsp;&nbsp;Issues</a>--%>

        <%--</li>--%>

        <li class="aui-tab yui3-widget aui-component" id="step7" onclick="javascript:validateStep(5);" style="">

            <a class="aui-tab-label  ie7fix" href="javascript:;">6. Benefits</a>

        </li>

        <li class="aui-tab yui3-widget aui-component" id="step8" onclick="javascript:validateStep(6);" style="">

            <a class="aui-tab-label" href="javascript:;">7. Projects</a>

        </li>
        <li class="aui-tab yui3-widget aui-component" id="step9" onclick="javascript:validateStep(7);" style="">

            <a class="aui-tab-label  ie7fix" href="javascript:;">8.&nbsp;References</a>

        </li>
    </ul>


    <div class="topBarGrey">
        <p class="siteNameP">Site Name: <span><%=siteName %></span></p>
        <p class="siteDateP">Date: <span><fmt:formatDate pattern="dd/MM/yyyy"
                                                         value="<%=assesment.getInitiation_date() %>"/></span></p>
        <p class="AssessorP">Assessor: <span><%=UserName %></span></p>
        <p class="versionP">Version: <span><%= version_id%></span></p>
        <p style="margin-left: 76px">
            <liferay-portlet:renderURL var="test" varImpl="manage-assessment"/>
            <%
                if (updateForSAV){
            %>
            <span class="aui-button">
                        <span class="aui-button-content">
                            <a class="aui-button-input" href="${test}">
                                <input class="aui-button-input" type="button" value="Save">
                            </a>
                        </span>
                    </span>
            <%
                }
            %>

        </p>
    </div>


    <div class="aui-tabview-content aui-widget-bd" id="docsContent1">


        <div id="divStep1" class="aui-tabview-content-item">
            <jsp:include page="/assessment_jsp/tab_step1.jsp"/>
        </div>

        <div id="divStep2" class="aui-tabview-content-item">

            <jsp:include page="/assessment_jsp/tab_step2.jsp"/>
        </div>

        <div id="divStep3" class="aui-tabview-content-item">

            <jsp:include page="/assessment_jsp/tab_step3.jsp"/>
        </div>

        <div id="divStep4" class="aui-tabview-content-item">

            <jsp:include page="/assessment_jsp/tab_step4.jsp"/>
        </div>

        <div id="divStep5" class="aui-tabview-content-item">

            <jsp:include page="/assessment_jsp/tab_step5.jsp"/>
        </div>

        <%--<div id="divStep6" class="aui-tabview-content-item">--%>
            <%--<jsp:include page="/assessment_jsp/tab_step6.jsp"/>--%>
        <%--</div>--%>

        <div id="divStep7" class="aui-tabview-content-item">

            <jsp:include page="/assessment_jsp/tab_step7.jsp"/>
        </div>
        <div id="divStep8" class="aui-tabview-content-item">
            <jsp:include page="/assessment_jsp/tab_step8.jsp"/>
        </div>
        <div id="divStep9" class="aui-tabview-content-item">
            <jsp:include page="/assessment_jsp/tab_step9.jsp"/>
        </div>
    </div>
</div>
