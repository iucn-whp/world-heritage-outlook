<%@include file="init.jsp" %>
<!--mainBlock Starts Here-->
<div class="mainBlockContainer01">
		<div class="floatLeftBlock">
		
		
		<div class="borderWrapper">
		
		<div class="tableWrapper">
		<div class="header01">
		<h3 class="basicInfoPageTitle">Management Information</h3>
		</div>
		<div id="mgmtBudgetDiv">
		<jsp:include page="/siteinfo_jsp/innerJSP/mgmt_budget.jsp"></jsp:include>
		</div>
		
		<div id="mgmtStaffDiv">
		<jsp:include page="/siteinfo_jsp/innerJSP/mgmt_staff.jsp"></jsp:include>
		</div>
		
		<div id="mgmtVisitorDiv">
		<jsp:include page="/siteinfo_jsp/innerJSP/mgmt_visitor.jsp"></jsp:include>
		</div>
		
		<div id="mgmtIndeCommDiv">
		<jsp:include page="/siteinfo_jsp/innerJSP/mgmt_indeginious_communities.jsp"></jsp:include>
		</div>
		
		<div id="mgmtpopulationDiv">
		<jsp:include page="/siteinfo_jsp/innerJSP/mgmt_population.jsp"></jsp:include>
		</div>
		
		</div>
		
		
		
		</div>
		
		
		
		</div>
		
		
				<div class="floatRightBlock">
				<div class="linksBlock firstLinksBlock">
				<p class="docLinksHeading">Management Plan</p>
				<c:forEach items="${lstMgmt_plan_states}" var="SiteMgmt_plan" varStatus="status">
				<div class="linksContainer">
				<div class="links" style="word-wrap:break-word;">
				<span>Date - <fmt:formatDate pattern="dd/MM/yyyy" value="${SiteMgmt_plan.getDate_published()}" /> </span>
				<a href="<c:out value="${SiteMgmt_plan.getDocument_link()}"></c:out>" target="_blank"><c:out value="${SiteMgmt_plan.getDocument_link()}"></c:out></a>
				
				</div>
				</div>
				</c:forEach>
				</div>
				
				<div class="linksBlock">
				<p class="docLinksHeading">MEE</p>
				<c:forEach items="${lstMees}" var="SiteMee" varStatus="status">
				<div class="linksContainer">
				<div class="links" style="word-wrap:break-word;">
				<span>Date - <fmt:formatDate pattern="dd/MM/yyyy" value="${SiteMee.getDate_published()}" /> </span>
				<a href="<c:out value="${SiteMee.getDocument_link()}"></c:out>" target="_blank"><c:out value="${SiteMee.getDocument_link()}"></c:out></a>
				
				</div>
				</div>
				</c:forEach>
				</div>
				
				
				<div class="linksBlock">
				<p class="docLinksHeading">Benefit Type</p>
				<div class="linksContainer">
				<div class="links">
				<table class="siteInfoRightBlock">
				
				
					<c:forEach items="${lstchecktype_lkp}" var="subtype" varStatus="status">
					<tr><td><c:out value="${subtype}"></c:out></td></tr>
					</c:forEach>
				
				
				</table>
				</div>
				</div>
				</div>
				
				<div class="linksBlock">
				<p class="docLinksHeading">Current Threats</p>
				<div class="linksContainer">
				<div class="links">
					<table class="siteInfoRightBlock">
					<c:forEach items="${lstcurrent_value}" var="currentvalue" varStatus="status">
					<tr><td><c:out value="${currentvalue.getCurrent_threat()}"></c:out></td></tr>
					</c:forEach>
					</table>
				</div>
				</div>
				</div>
				
				<div class="linksBlock">
				<p class="docLinksHeading">Potential Threats</p>
				<div class="linksContainer">
				<div class="links">
				<table class="siteInfoRightBlock">
				 <c:forEach items="${lstpotential_value}" var="potentialvalue" varStatus="status">
				<tr><td><c:out value="${potentialvalue.getPotential_threat()}"></c:out></td></tr>
				</c:forEach>
				</table>
				</div>
				</div>
				</div>
				</div>
</div>

<!-- Accordion script starts here -->

<script type="text/javascript">
	$(document).ready(function(){
		$('.docLinksHeading').parent('.linksBlock').children('.linksContainer').hide();
			$('.docLinksHeading').click(function(){
			
			var $linksBlock = $(this).parent('.linksBlock');
				$linksBlock.children('.linksContainer').slideToggle('1000');
				$(this).toggleClass("accordionVisited");
				$linksBlock.prevAll('.linksBlock').children('.linksContainer').slideUp();
				$linksBlock.nextAll('.linksBlock').children('.linksContainer').slideUp();
				$linksBlock.prevAll('.linksBlock').children('.docLinksHeading').removeClass('accordionVisited').addClass('docLinksHeading');
				$linksBlock.nextAll('.linksBlock').children('.docLinksHeading').removeClass('accordionVisited').addClass('docLinksHeading');
			});
			
			$('.docLinksHeading').hover(function(){
				$(this).toggleClass('hoverAccordion');
			});
	});
</script>

<!-- Accordion script ends here -->