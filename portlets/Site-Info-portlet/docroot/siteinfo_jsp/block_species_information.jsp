<%-- <%@include file="init.jsp" %> --%>
<div class="mainBlock">
<%-- <h2 class="pageHeading"><c:out value="${objwhp_sites.getName_en()}" /></h2> --%>
<div class="infoWrapperBorder">
<div class="header01">
<h3 class="basicInfoPageTitle">Designations & species</h3>
</div>
<div id="speciesPaCategoryDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/species_iucn_pacategory.jsp"></jsp:include> 
</div>

<div id="speciesOtherDesigDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/species_other_designation.jsp"></jsp:include>
</div>

<div id="speciesFlagshipDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/species_flagship.jsp"></jsp:include>
</div>
</div>


<div id="sitesThematicsDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/sites_thematic.jsp"></jsp:include>
</div>




</div>

