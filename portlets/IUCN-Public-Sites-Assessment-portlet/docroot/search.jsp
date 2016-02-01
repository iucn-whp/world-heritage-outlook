<%@page import="java.util.ArrayList"%>
<%@ include file="/init.jsp"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page
	import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page
	import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.sites.utils"%>
<%@ page import="com.iucn.whp.dbservice.model.country_lkp"%>
<%@ page import="com.iucn.whp.dbservice.model.whp_sites"%>


 
 	 <script language="javascript" type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script> 
	
   <script language="javascript" type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>

		
<script>

<liferay-portlet:renderURL var="linkURL" portletName="Attribute_Viewer_WAR_Attribute_Viewerportlet" windowState="maximized"   />
   
    

jQuery(document).ready(function(){
		
		/*var searchAutoSuggestVisible = $('.ui-autocomplete').is(":visible");
		if(searchAutoSuggestVisible)
			{
				$(this).css('width','394px');
			}*/
			
			
			jQuery('.ui-autocomplete').addClass('autoCompleteBoxWidth');
	});
</script>	
	

	


<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui.css"> 
 

<liferay-theme:defineObjects />
<portlet:resourceURL var="assessmentSearchURL">
	<portlet:param name="jspPage"
		value="/public_search_resourse.jsp" />
	<portlet:param name="resetCur" value="true" />
</portlet:resourceURL>

<portlet:resourceURL var="resourceUrl"></portlet:resourceURL>
 <div class="search-wrapper">
      <span class="see-all">Search all Natural Sites</span>
      <label>Search Species, Conservation Status, Locations, Habitats or Threats</label>
     <aui:form action="<%= assessmentSearchURL.toString() %>" method="post"  name="fmassessmentsearch" id="fmassessmentsearch"	onSubmit="javascript:assessmentSearch();" >
      <div class="search-box">
        <span><input type="text" name="siteName" id="siteName"  value="" class="mousetrap" placeholder="Enter site or country name"></span>
        <input type="button" name="" value="Search" onClick="javascript:assessmentSearch();">
        
      </div>
      <div class="autocomplete"></div>
      
      </aui:form>
      <div class="exploreMap">
      	<span class="exploreMapIcon"></span>
      	<a href="/web/iucn/home" target="_self">Explore Map</a>
      </div>
      
      
</div> 

<style>
	.ui-autocomplete-category {
		font-weight: bold;
		padding: .2em .4em;
		margin: .8em 0 .2em;
		line-height: 1.5;
	}
	</style>
	


<%
List<whp_sites> lst_whpsites = null;
 

lst_whpsites=whp_sitesLocalServiceUtil.getAllActiveSites();

ArrayList<String> sitelist=new ArrayList<String>();
String str1=""; 

for(int j=0;j<lst_whpsites.size();j++)
{

	 str1=str1+"{ label: \""+lst_whpsites.get(j).getName_en()+"\",";
	 str1=str1+"category: \"Site\" }";
	 
	 if(j<=lst_whpsites.size()-1){
		 
		 str1=str1+",";
	 }

	
}

System.out.println(str1);

%>
 <%
List<country_lkp> lstcountry_lkp1 = null;
lstcountry_lkp1 = country_lkpLocalServiceUtil.getAllCountries();

ArrayList<String> cntlist=new ArrayList<String>();
String str2=""; 
for( int i=0;i<lstcountry_lkp1.size();i++)
 {
	
	 str2=str2+"{ label: \""+lstcountry_lkp1.get(i).getName()+"\",";
	 str2=str2+"category: \"Country\" }";
	 
	 if(i<lstcountry_lkp1.size()-1){
		 
		 str2=str2+",";
	 }
	String finalstr=str1+str2;
	
 }

String finalstr=str1+str2;
%>


 <script>
	$.widget( "custom.catcomplete", $.ui.autocomplete, {
		_renderMenu: function( ul, items ) {
			var that = this,
				currentCategory = "";
			$.each( items, function( index, item ) {
				if ( item.category != currentCategory ) {
					ul.append( "<li class='ui-autocomplete-category'>" + item.category + "</li>" );
					currentCategory = item.category;
				}
				that._renderItemData( ul, item );
			});
		}
	});
	</script>
	
  <script>
 
  jQuery(function() {
		var data = [
		            <%=finalstr%>
		         		];
		
 
		jQuery( "#siteName" ).catcomplete({
			
            width:400,
			minLength:1,
			source: data
			
			
		});
	});
	</script>  
		
	
    
 <script>
	function assessmentSearch() {
		
	AUI().use('aui-io-request', function(A) {
	   A.io.request('<%=assessmentSearchURL %>', {
	      method: 'POST',
	      data:{
        	 ACTION_CMD:'keysearch',
	    	 siteName: document.getElementById("siteName").value,
	     	 searchType:'keywordSearch'
	      },
	      on: {
	          success : function() { 
	          //alert(this.get('responseData'));
	         	$('#listViewDiv').html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}
</script>   
<script>
$(document).keypress(function(e) {
	  if(e.which == 13) {
   
/* 		  alert("hi hi hi hih i");
 */		  
		  assessmentSearch();
	  }
	})
</script> 