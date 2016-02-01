
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">


<script type="text/javascript">
	$(document).ready(function(){
		$('tr:even').css('background-color','#f2fafc');
		$('tr:odd').css('background-color','#fff');
		$('.breadCrumb li:last a').css('color','#868686');
	
	//-----------accordian script starts here---------------
	
	$('.accordian').click(function () {
		if ($(".filterBox").is(":hidden")) {
		$(".filterBox").slideDown("fast");
		$('.expandCollapseBtn').css("background-image","url('${pageContext.request.contextPath}/images/aero_down.png')");
		} else {
		$(".filterBox").slideUp("fast");
		$('.expandCollapseBtn').css("background-image","url('${pageContext.request.contextPath}/images/aero_right.png')");
		}
		});
	$('.advancedsearchBox').focus(function(){
		$(this).val('').css('color','#212121');
	});
	
	//-----------accordian script ends here---------------
		
	//-----------breadCrumb script starts here---------------
	
	$('.breadCrumb ul li a').css('color','#0e2d64');
	$('.breadCrumb ul li:last').find('a').css('color','#868686');
	$("<li><span></span></li>").insertAfter(".breadCrumb ul li").addClass('spanStyle');
	$('.breadCrumb ul li:last').find('span').remove();
	
	
	//-----------breadCrumb script ends here---------------
	
	$('label').css({'float':'left','padding':'0.3em 0 0 0.5em'});
	
	$('label').click(function(){
		$(this).next('input').focus();
		$(this).next('input:radio').checked();
	});
	
	$('.home').click(function(){
		$('.breadCrumb li:first').nextAll().remove();
	});
	
	$('.about').click(function(){
	//alert('hi');
	$('.breadCrumb ul li:last').find('a').text('About Us');
	});
});
</script>


<portlet:resourceURL var="ajaxResourceURL">
	<portlet:param name="ACTION_CMD" value="AUTOCOMPLETE"/>
</portlet:resourceURL>	


<portlet:resourceURL var="site_searchURL">
  <portlet:param name="jspPageDiv" value="/siteinfo_jsp/search/search_resourse.jsp" />
  <portlet:param name="resetCur" value="true" />
</portlet:resourceURL>


<portlet:resourceURL var="site_namesearchURL">
  <portlet:param name="jspPageDiv" value="/siteinfo_jsp/search/search_resourse.jsp" />
  <portlet:param name="resetCur" value="true" />
</portlet:resourceURL>
<div class="topBar">
	<!-- ------------------Search Start Here------------ -->
	<div class="" id="<portlet:namespace />SiteSearchContainer">
		<aui:form action="<%= site_searchURL.toString() %>" method="post"
			name="fmsitesearch" id="fmsitesearch"
			onSubmit="javascript:simpleSiteSearch();">


	<aui:input
	        name="searchType"
	        id="searchType"
	        type="hidden"
	    />

			<aui:layout>
			
			
			
			<aui:column columnWidth="30" style="width:220px; margin-top:0.5em;">
				<%-- <aui:input label="Site Name" name="sitename" id="sitename" placeholder="Enter Site Name"/> --%>
				<div id="autoComplete">
<!-- 				 <input id="sitename" name="sitename" placeholder="Enter Site Name"/>
 -->
               <aui:input type="text" name="sitename" id="sitename" label="Site Name" style="width:108px"/>
               
 
 				 </div>
				</aui:column>
				
				
				<aui:column columnWidth="30" style="width:266px; margin-top:0.5em;">
					<!-- aui:input cssClass="keywords lfr-search-combobox-item"
						id="SiteName" label="SiteName" name="SiteName" type="text" /-->
						<aui:select label="Region : " id="iucnRegionId" name="iucnRegionId" style="width:200px; margin-left:3px;" onChange="javascript:onRegionselectionChange();">
						<aui:option value="">Select Region</aui:option>

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
				</aui:select>
					
						
						
				</aui:column>

				<aui:column columnWidth="30" style="width:269px; margin-top:0.5em;">
					<aui:select label="Country : " id="countryID" name="countryID"
						style="width:200px; margin-left: 1px;">
						<aui:option value="">Select Country</aui:option>
						
<%
List<country_lkp> lstcountry_lkp=null;

try{
	lstcountry_lkp=country_lkpLocalServiceUtil.getAllCountries();
	
}catch(Exception ex){
	System.out.print("EX: "+ ex.getMessage());
}


 for (country_lkp currData : lstcountry_lkp) {
					 %>

						<aui:option label="<%=  currData.getName() %>"  value="<%=currData.getCountryid() %>" />

					<%
					}
					%> 
				</aui:select>
			
					
				</aui:column>
				
				
				
				<aui:column columnWidth="40" style="width:132px; height:30px; margin:1.6em 0.5em 0 0; float:right;">
					<input type="button" value="Advance Search" class="advanceSearchBtn" onClick="javascript:advanceSearchPopup('Site Information Query Builder');"/>
				</aui:column>
				<aui:column columnWidth="25" style="width:60px; margin:1.6em 0.5em 0 0; float:right;">
					<%-- <aui:button name="search" onClick='<%= liferayPortletResponse.getNamespace() + "simpleSiteSearch();" %>' value="search" /> --%>
					
					<aui:button name="search" onClick="javascript:simpleSiteSearch();"  value="search" />
					
					
				</aui:column>
			</aui:layout>
		</aui:form>

	</div>

	<!-- ------------------Search END Here------------ -->
	
	<%
	
	/* List<whp_sites> lst_whpsites = null;

	String sitename="";
	
	lst_whpsites=whp_sitesLocalServiceUtil.getAllActiveSites();
	for(int i=0;i<lst_whpsites.size();i++)
	{
		whp_sites currData=lst_whpsites.get(i);
		
		sitename=sitename+ "\""+currData.getName_en()+"\",";

		
		
	}
	
	sitename=sitename.substring(0,sitename.length()-1);
	
 	System.out.println(sitename);
 */ 	%>
<script>
	/* function <portlet:namespace />simpleSiteSearch() { */
		function simpleSiteSearch() {
	
		
	AUI().use('aui-io-request', function(A) {
/* 		alert(document.getElementById("<portlet:namespace/>sitename").value);
 */	   A.io.request('<%=site_searchURL %>', {
	      // autoLoad: false,
	      //dataType: 'json',
	      method: 'GET',
	      //form: { id: '<portlet:namespace />'+fmsitesearch},
	      data:{
	    	  
	    	 
	         iucnRegionId: document.getElementById("<portlet:namespace/>iucnRegionId").value,
	    	 countryID:  document.getElementById("<portlet:namespace/>countryID").value,
	    	 sitename:  document.getElementById("<portlet:namespace/>sitename").value
	      },
	      on: {
	          success : function() { 
	          //alert(this.get('responseData'));
	        	 $('#siteDashboardDiv').html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}
	

	function onRegionselectionChange(){
			//alert('inside fillContaryList');
		var iucnId=document.getElementById("<portlet:namespace/>iucnRegionId").value;
		var countrySelection = document.getElementById("<portlet:namespace/>countryID");
		jQuery.get('<%=site_searchURL %>&ACTION_CMD=CountryList&iucnRegionId='+iucnId,  
		//countrySelection.options.length=0;
		//countrySelection.options[0] =new Option('Select','');
		function(data) {  
		var parsedJSONObject = jQuery.parseJSON(data);  
		var countryList= new Array();
		countryList= parsedJSONObject.rows;
		    countrySelection.length=0;
		    var option = document.createElement("OPTION");  
		    option.text = 'Select Country';  
		    option.value = '';   
		    countrySelection.options.add(option); 
		  for (var i =0; i < countryList.length; i++){  
			    var option = document.createElement("OPTION");  
			    option.text = ''+(countryList[i].name);  
			    option.value = ''+(countryList[i].countryid);   
			    countrySelection.options.add(option);   
		    }  
		}
	  );
	}
		</script>
		
		
	
<script type="text/javascript">

AUI().use('aui-autocomplete', function(A) {
		var dataSource = new A.DataSource.IO(
		    {
		        source: '<%=ajaxResourceURL %>'
		    }
		);
		
		var autoComplete = new A.AutoComplete(
		    {
		        dataSource: dataSource,
		        delimChar: '',
		        contentBox: '#autoComplete',
		        input:'#<portlet:namespace/>sitename',
		        matchKey: 'name',
		        schema: {
		            resultListLocator: 'response',
		            resultFields: ['key','name','description', 'type', 'wdpaId']
		        },
		        uniqueName:'keyword',
		        schemaType:'json',
		        typeAhead: false,
		        cssClass: 'ac_input'
		    }
		 );
		
		autoComplete.generateRequest = function(query) {
		    return {
		    	
		        request: '&keys=' + query
		    };
		}
		
		autoComplete.on('itemSelect',function(event,data) {   
				
			sitenameSearch();
		});
		
		autoComplete.render();
		
	
});
</script>


<script>
$(document).keypress(function(e) {
	  if(e.which == 13) {
   
/* 		  alert("hi hi hi hih i");
 */		  
 sitenameSearch();
	  }
	})
</script> 


<script>

function sitenameSearch() {
	

AUI().use('aui-io-request', function(A) {
	/* 		alert(document.getElementById("<portlet:namespace/>sitename").value);
	 */	   A.io.request('<%=site_searchURL %>', {
		       method: 'GET',
		       data:{
		    	   searchType:'sitenameSearch',
		    	   sitename:  document.getElementById("<portlet:namespace/>sitename").value
		      },
		      on: {
		          success : function() { 
		          //alert(this.get('responseData'));
		        	 $('#siteDashboardDiv').html(this.get('responseData'));
		          }
		      }
		    });
		  });
		}
	
</script>



