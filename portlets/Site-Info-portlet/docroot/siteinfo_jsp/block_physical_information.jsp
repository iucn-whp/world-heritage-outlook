<!--mainBlock Starts Here-->
<div class="mainBlockContainer01">
<%-- <h2 class="pageHeading"><c:out value="${objwhp_sites.getName_en()}" /></h2> --%>
		
		<div class="floatLeftBlock">
		<div class="tableWrapper">
		<div id="physicalInfoDiv"  class="borderWrapper">
		<jsp:include page="/siteinfo_jsp/innerJSP/physical_info.jsp"></jsp:include>
		</div>
		
		
		<div id="physicalComponentDiv" class="borderWrapper">
		<jsp:include page="/siteinfo_jsp/innerJSP/physical_component.jsp"></jsp:include>
		</div>
		</div>
		</div>
				
		<div class="floatRightBlock">
		<div class="linksBlock">
		<p class="docLinksHeading">Values Assessment </p>
		<jsp:include page="/siteinfo_jsp/innerJSP/physical_assessment_value.jsp"></jsp:include>
		</div>
		</div>
		
</div>
