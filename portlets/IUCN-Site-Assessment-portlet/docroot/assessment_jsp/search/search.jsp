<%@ include file="/init.jsp"%>
<liferay-theme:defineObjects />
<portlet:resourceURL var="assessmentSearchURL">
	<portlet:param name="jspPageDiv"
		value="/assessment_jsp/search/search_resourse.jsp" />
	<portlet:param name="resetCur" value="true" />
</portlet:resourceURL>
<aui:form action="<%= assessmentSearchURL.toString() %>" method="post"
	name="fmassessmentsearch" id="fmassessmentsearch"
	onSubmit="javascript:assessmentSearch();" >
	<div class="topBar">
		<div class="topBarContent">
			<div class="advancedSearch">
			<span>Site Name</span>
				<input type="text"	name="siteName" id="siteName" placeholder="Enter Site Name"/> 
					<!-- <input type="button" class="advancedsearchBtn" /> -->
			</div>
			<%-- <div class="searchBarLabel">
				<span>Country</span> <select id="countryID" name="countryID">

					<aui:option value="">Select Country</aui:option>

					<%
						List<country_lkp> lstcountry_lkp = null;

							try {
								lstcountry_lkp = country_lkpLocalServiceUtil
										.getAllCountries();

							} catch (Exception ex) {
								System.out.print("EX: " + ex.getMessage());
							}

							for (country_lkp currData : lstcountry_lkp) {
					%>

					<option value="<%=currData.getCountryid()%>"><%=currData.getName()%></option>

					<%
						}
					%>

				</select>

			</div> --%>
						
					<div class="searchBarLabel">
					<span>Region</span> <select id="iucnRegionId" name="iucnRegionId"> 
					    <option value="">Select Region</option>
					

           <%
            List<unesco_region> unescoRegionList=null;
            try{
	         unescoRegionList = unesco_regionLocalServiceUtil.getAllRegionNames();
           }catch(Exception ex){
	       System.out.print("EX: "+ ex.getMessage());
           }
               for (unesco_region tempIucn : unescoRegionList) {
					%>
						<aui:option label="<%=  tempIucn.getName() %>"  value="<%=tempIucn.getUnesco_region_id() %>" />
					<%
					}
					%>
				</select>
			</div>
		
			
			<div class="searchBarLabel">
				<span>Stage</span> <select id="stageID" name="stageID">
					<option value="">Select Stage</option>

					<%
						List<assessment_stages> assessment_stagesList = null;

							try {
								assessment_stagesList = assessment_stagesLocalServiceUtil
										.findAll();

							} catch (Exception ex) {
								System.out.print("EX: " + ex.getMessage());
							}

							for (assessment_stages currData : assessment_stagesList) {
					%>

					<option value="<%=currData.getStageid()%>"><%=currData.getStage()%></option>

					<%
						}
					%>

				</select>
			</div>

			<div class="searchBarLabel">
				<span>Status</span> <select id="statusID" name="statusID">
					<option value="">Select Status</option>

					<%
						List<assessment_status> assessment_statusList = null;

							try {
								assessment_statusList = assessment_statusLocalServiceUtil
										.findAll();

							} catch (Exception ex) {
								System.out.print("EX: " + ex.getMessage());
							}

							for (assessment_status currData : assessment_statusList) {
					%>

					<option value="<%=currData.getStatusid()%>"><%=currData.getStatus() %></option>

					<%
						}
					%>

				</select>
			</div>
			<div class="searchBarbutton">
				<input type="button" value="Search" onClick="javascript:assessmentSearch();" />
				<input name="Reset" type="reset"  value="Reset" />
				<input type="button" value="Advance Search"  onClick="javascript:advanceSearchPopup('Assessment Query Builder');"/>
			</div>
		</div>
	</div>
</aui:form>

<script>
	function assessmentSearch() {
		
		//alert('Search');
	AUI().use('aui-io-request', function(A) {
		
	   A.io.request('<%=assessmentSearchURL %>', {
	      method: 'POST',
	      data:{
	    	 ACTION_CMD:'search',
	    	 siteName: document.getElementById("siteName").value,
			 statusID: document.getElementById("statusID").value,
             stageID: document.getElementById("stageID").value,
             userId: '<%=user.getUserId()%>',
             iucnRegionId:  document.getElementById("iucnRegionId").value
	      },
	      on: {
	          success : function() { 
	          //alert(this.get('responseData'));
	         	$('#siteAssessmentDashboardDiv').html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}
</script>