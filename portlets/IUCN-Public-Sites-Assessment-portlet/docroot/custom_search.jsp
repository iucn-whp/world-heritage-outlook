<%@page import="com.iucn.whp.dbservice.service.thematic_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.thematic_lkp"%>
<%@page import="com.iucn.whp.dbservice.service.other_designation_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.other_designation_lkp"%>
<%@page import="com.iucn.whp.dbservice.model.threat_subcategories_lkp"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.iucn.whp.dbservice.model.threat_categories_lkp"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.benefit_checktype_lkp"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.threat_rating_lkp"%>
<%@page import="com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp"%>
<%@page import="com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.unesco_region"%>
<%@page import="com.iucn.whp.dbservice.model.inscription_criteria_lkp"%>
<%@page import="com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.whp_sites_inscription_criteria"%>
<%@page import="com.iucn.whp.dbservice.model.iucn_region"%>
<%@page import="com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil"%>
<%@ include file="/init.jsp"%>


<link rel="stylesheet"	href="${pageContext.request.contextPath}/css/jqx.base.css" />

<script type="text/javascript" src="${pageContext.request.contextPath}/js/gettheme.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqxcore.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqxbuttons.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqxscrollbar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqxlistbox.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqxtooltip.js"></script>





<portlet:resourceURL var="customSearchURL">
		<portlet:param name="resetCur" value="true" />
	<portlet:param name="jspPageDiv"
		value="/public_search_resourse.jsp" />
		</portlet:resourceURL>



<portlet:resourceURL var="customSearchURL1">
	
</portlet:resourceURL>






<%
List<unesco_region> unescoRegionList=null;
String region="[";

try{
	unescoRegionList = unesco_regionLocalServiceUtil.getAllRegionNames();
	for (unesco_region objunesco : unescoRegionList) {
		
		region=region+"\""+objunesco.getName()+"\",";
		
		
		 if(objunesco.equals(unescoRegionList.get(unescoRegionList.size()-1)))
		 {
			 region = region.substring(0, region.length()-1);
			 region=region+"];"; 
		 }

		
	}
	
}catch(Exception ex){
	
	ex.printStackTrace();
	
}


String insc_crite="[";


List<inscription_criteria_lkp> lstCiteria=null;
try{
	lstCiteria=inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria();
	
	for (inscription_criteria_lkp objcriteria : lstCiteria) {
		
		
		if(objcriteria.getCriteria().equals("vii")|| objcriteria.getCriteria().equals("viii") || objcriteria.getCriteria().equals("ix")  ||objcriteria.getCriteria().equals("x")) 
		insc_crite=insc_crite+"\""+objcriteria.getCriteria_desc()+"\",";
		
		 if(objcriteria.equals(lstCiteria.get(lstCiteria.size()-1)))
		 {
			 insc_crite = insc_crite.substring(0, insc_crite.length()-1);
			 insc_crite=insc_crite+"];"; 
		 }
		
	}
	
}
catch(Exception ex){

	ex.printStackTrace();
}


String con_issue="[";



List<conservation_outlook_rating_lkp> lstratinglkp=null;
try{
	lstratinglkp = conservation_outlookLocalServiceUtil.getconservationoutlookrating();
	
	for (conservation_outlook_rating_lkp objrating : lstratinglkp) {
		
		con_issue=con_issue+"\""+objrating.getCo_rating()+"\",";
		
		 if(objrating.equals(lstratinglkp.get(lstratinglkp.size()-1)))
		 {
			 con_issue = con_issue.substring(0, con_issue.length()-1);

			 con_issue=con_issue+"];"; 
		 }
		 
	}
	
	}catch(Exception ex){
	
	ex.printStackTrace();
	
}
	
	/* String threat_cat="[";
	
	List<threat_categories_lkp> lstThreatcategories = null;

	try{
		lstThreatcategories = site_assessmentLocalServiceUtil.getAllThreatCategories();
		
		for (threat_categories_lkp objthreat : lstThreatcategories) {
			
			
			threat_cat=threat_cat+"\""+objthreat.getThreat_category()+"\",";
			
			 if(objthreat.equals(lstThreatcategories.get(lstThreatcategories.size()-1)))
			 {
				 threat_cat = threat_cat.substring(0, threat_cat.length()-1);

				 threat_cat=threat_cat+"];"; 
			 }
			
		}

	}catch(Exception e)
	{
		e.printStackTrace();
	}
 */
	
	
	String threat_subcat="[";
	
	List<threat_subcategories_lkp> lstThreatSubCategory = null;
	
	try
	{
		lstThreatSubCategory = site_assessmentLocalServiceUtil.getAllThreatSubCategories();
		
		for(threat_subcategories_lkp objsubthreat:lstThreatSubCategory)
		{
			threat_subcat=threat_subcat+"\""+objsubthreat.getThreat_sub_category()+"\",";
			
			if(objsubthreat.equals(lstThreatSubCategory.get(lstThreatSubCategory.size()-1)))
			{
				threat_subcat = threat_subcat.substring(0, threat_subcat.length()-1);
				threat_subcat=threat_subcat+"]";
			}
			
		}
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}

	
	
	 List<other_designation_lkp> lstother_designation= other_designation_lkpLocalServiceUtil.getAllOtherDesignation();
	 String designation="[";
	 
	 for(other_designation_lkp objdesignation:lstother_designation)
		{
		 designation=designation+"\""+objdesignation.getDesignation()+"\",";
			
			if(objdesignation.equals(lstother_designation.get(lstother_designation.size()-1)))
			{
				designation = designation.substring(0, designation.length()-1);
				designation=designation+"]";
			}
			
		}
	 
	 
	
	String benefitstr="[";
	
	
	List<benefit_checktype_lkp> lstbenefit =null;
	try
	{
		 lstbenefit=benefit_checktype_lkpLocalServiceUtil.findAll();
		 
		 for (benefit_checktype_lkp objbenefit : lstbenefit) {
			 
			 
			 benefitstr=benefitstr+"\""+objbenefit.getBenefit_checktype()+"\",";
				
			 if(objbenefit.equals(lstbenefit.get(lstbenefit.size()-1)))
			 {
				 benefitstr = benefitstr.substring(0, benefitstr.length()-1);

				 benefitstr=benefitstr+"];"; 
			 }
			 
		 }
		
	}catch(Exception e )
	{
		e.printStackTrace();
	}
	
	
    
String thematic="[";
	
	
	List<thematic_lkp> lstthematic_lkp =null;
	try
	{
		lstthematic_lkp=thematic_lkpLocalServiceUtil.getAllThematic();
		 
		 for (thematic_lkp objthematic : lstthematic_lkp) {
			 
			 
			 thematic=thematic+"\""+objthematic.getThematic()+"\",";
				
			 if(objthematic.equals(lstthematic_lkp.get(lstthematic_lkp.size()-1)))
			 {
				 thematic = thematic.substring(0, thematic.length()-1);

				 thematic=thematic+"];"; 
			 }
			 
		 }
		
	}catch(Exception e )
	{
		e.printStackTrace();
	}
	
	
	
	
	
	
	
%>


<div class="multiSelectContainer">

<span class="multiSelectHeader">Find sites by choosing from the categories below:</span>






<div class="multiSelectBoxOuterContainer">
<span class="HeadingMultiselect">Region</span>
<div class="multiselectHolder multiselectHolder1">
        <div id='region'>
        </div>
		</div>

</div>








<div class="multiSelectBoxOuterContainer">
<span class="HeadingMultiselect">Criteria</span>
<div class="multiselectHolder multiselectHolder2">
        <div id='criteria'>
        </div>
		</div>

</div>



<div class="multiSelectBoxOuterContainer">
<span class="HeadingMultiselect">Rating</span>
<div class="multiselectHolder multiselectHolder3">
        <div id='rating'>
        </div>
		</div>
</div>


		
		
		
<div class="multiSelectBoxOuterContainer">
<span class="HeadingMultiselect">Threat</span>
<div class="multiselectHolder multiselectHolder4">
        <div id='threat'>
        </div>
		</div>
</div>	
	
	
	
	<div class="multiSelectBoxOuterContainer">
	<span class="HeadingMultiselect">Benefit</span>
    <div class="multiselectHolder multiselectHolder5">
        <div id='benefit'>
        </div>
		</div>
   </div>
	
	
	<div class="multiSelectBoxOuterContainer">
	<span class="HeadingMultiselect">Designation</span>
    <div class="multiselectHolder multiselectHolder5">
        <div id='designation'>
        </div>
		</div>
   </div>
	
	
	<div class="multiSelectBoxOuterContainer">
	<span class="HeadingMultiselect">Theme</span>
    <div class="multiselectHolder multiselectHolder5">
        <div id='thematic'>
        </div>
		</div>
   </div>
   
	
	</div>	
	
	
			
		
 <script type="text/javascript">
            $(document).ready(function () {
                var theme = getDemoTheme();
               
				         
           var region1 =<%=region%>;
              
           var criteria1=<%=insc_crite%>;
           var  rating1=<%=con_issue%>;
           var threat1=<%=threat_subcat%>;
           var benefit1=<%=benefitstr%>;
            
           var designation1=<%=designation%>;
           
           var thematic1=<%=thematic%>

        
			    
	             $("#region").jqxListBox({ source: region1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
				
	           
	             
	             $("#criteria").jqxListBox({ source: criteria1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
	             
	            
	            
	                       
	             $("#rating").jqxListBox({ source: rating1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
	             
	             
	           
	             
	             $("#threat").jqxListBox({ source: threat1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
	             
	             
	            
	             
	             
	             $("#benefit").jqxListBox({ source: benefit1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
	            
	             
	             $("#designation").jqxListBox({ source: designation1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
	             
	             
	             $("#thematic").jqxListBox({ source: thematic1, multiple: true, width: 129, height: 181, theme: theme, scrollBarSize: 8, itemHeight: 36 }
	             );
	             
	            
	            
	            var max = $('#verticalScrollBarregion').jqxScrollBar('max');
	     		$('#verticalScrollBarregion').jqxScrollBar({ max: 90 });
	     		
	     		
	     		
	     		
	     	   	var max = $('#verticalScrollBarthreat').jqxScrollBar('max');
	     		$('#verticalScrollBarthreat').jqxScrollBar({ max: 1550 });
	     		
	     		
	     		var max = $('#verticalScrollBarbenefit').jqxScrollBar('max');
	     		$('#verticalScrollBarbenefit').jqxScrollBar({ max: 109 });
	     		
	     		
	     		var max = $('#verticalScrollBardesignation').jqxScrollBar('max');
	     		$('#verticalScrollBardesignation').jqxScrollBar({ max: 150 });
	     		
	     		
	     		var max = $('#verticalScrollBarthematic').jqxScrollBar('max');
	     		$('#verticalScrollBarthematic').jqxScrollBar({ max: 150 })
	     		
	     		
	     		
	     		
	     		
	     		 $('.jqx-listitem-element').mouseover(function() {
	     		   
	     			 
	     		   
	     		  var  divname=this.id;
	     		   
	     		 if(divname.indexOf("region")>-1){
	     			
	     			 var regiontxt=$("#"+divname).children("span").text(); 
	     			
	     			var content = "<span style='font-weight:bold;'>"+regiontxt+" </span><br />";
            		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
            		 $("#"+divname).jqxTooltip('open');
            		$f_curToolTip =  $("#"+divname);
            		
	     		}
	     		 
	     		else if(divname.indexOf("criteria")>-1)
	     		{
	     			 var criteriatxt=$("#"+divname).children("span").text(); 
	     			var content;	
	     			 
	     			if(divname.indexOf("0")>-1)
	     			{
	     		      content = "<span style='font-weight:bold;'>"+"Criterion vii: Superlative natural phenomena or beauty and aesthetic importance"+" </span><br />";	
	     			}
	     			else if(divname.indexOf("1")>-1)
	     			{
	     				  content = "<span style='font-weight:bold;'>"+"Criterion viii: Earth history and geological features"+" </span><br />";
	     			}
	     			else if(divname.indexOf("2")>-1)
	     			{
	     				  content = "<span style='font-weight:bold;'>"+"Criterion ix: Ecological and biological processes in the evolution of ecosystems"+" </span><br />";
	     			}
	     			else if(divname.indexOf("3")>-1)
	     			{
	     				  content = "<span style='font-weight:bold;'>"+"Criterion x: Biodiversity and threatened species"+" </span><br />";	
	     			}
	     			

	     			
           		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
           		 $("#"+divname).jqxTooltip('open');
           		$f_curToolTip =  $("#"+divname);
           		
	     		}
	     		else if(divname.indexOf("rating")>-1)
	     		{
	     			
	     			 var ratingtxt=$("#"+divname).children("span").text(); 
		     			
		     			var content = "<span style='font-weight:bold;'>"+ratingtxt+" </span><br />";
	           		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
	           		 $("#"+divname).jqxTooltip('open');
	           		$f_curToolTip =  $("#"+divname);
	           		
	     			
	     		}else if(divname.indexOf("threat")>-1)
	     		{
	     		
	     			 var threattxt=$("#"+divname).children("span").text(); 
		     			
	     			
	     			
	     			 
		     			var content = "<span style='font-weight:bold;'>"+threattxt+" </span><br />";
	           		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
	           		 $("#"+divname).jqxTooltip('open');
	           		$f_curToolTip =  $("#"+divname);
	           		
	     			
	     		}else if(divname.indexOf("benefit")>-1)
	     		{
	     			
	     			 var benefittxt=$("#"+divname).children("span").text(); 
		     			
		     			var content = "<span style='font-weight:bold;'>"+benefittxt+" </span><br />";
	           		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
	           		 $("#"+divname).jqxTooltip('open');
	           		$f_curToolTip =  $("#"+divname);
	           		
	     			
	     		}
	     		else if(divname.indexOf("designation")>-1)
	     		{
	     			
	     			 var designationtxt=$("#"+divname).children("span").text(); 
		     			
		     			var content = "<span style='font-weight:bold;'>"+designationtxt+" </span><br />";
	           		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
	           		 $("#"+divname).jqxTooltip('open');
	           		$f_curToolTip =  $("#"+divname);
	           		
	     			
	     		}
	     		else if(divname.indexOf("thematic")>-1)
	     		{
	     			
	     			 var thematictxt=$("#"+divname).children("span").text(); 
		     			
		     			var content = "<span style='font-weight:bold;'>"+thematictxt+" </span><br />";
	           		 $("#"+divname).jqxTooltip({ content: content, position: 'bottom', name: 'listBoxTooltip'});	
	           		 $("#"+divname).jqxTooltip('open');
	           		$f_curToolTip =  $("#"+divname);
	           		
	     			
	     		}
	     		 
	     		 
	     		 
	     		
	     		
	     		
	     		   
	     		}); 
	     		
	     		
	     		 
            });
			
</script>

<script>

jQuery(function () {
	
$("#region").on('change', function () {
    
	
	 var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
     var region = "";
     if(items.length>0){
     for (var i = 0; i < items.length; i++) {
   	  
     		if(typeof(items[i].label)  === "undefined"){
     		}
     		else
     			{
   	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
   	  
     		}
     }
       }

     
     var items1 = $("#criteria").jqxListBox('getSelectedItems');
     var critria = "";
     if(items1.length>0){
     for (var i = 0; i < items1.length; i++) {
   		if(typeof(items1[i].label)  === "undefined"){
     		}
     		else
     			{
     	
   	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
     }
     
     }
     }
     
    
     
     var items2 = $("#rating").jqxListBox('getSelectedItems');
     var rating = "";
     
     if(items2.length>0){
     for (var i = 0; i < items2.length; i++) {
   		if(typeof(items2[i].label)  === "undefined"){
     		}
     		else
     			{
     	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
     }
     }
     }
     
     
     var items3 = $("#threat").jqxListBox('getSelectedItems');
     var threat = "";
     if(items3.length>0){
     for (var i = 0; i < items3.length; i++) {
   		if(typeof(items3[i].label)  === "undefined"){
     		}
     		else
     			{
     	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
     }
     
     }
     }
     
     
   
     
     
     var items4 = $("#benefit").jqxListBox('getSelectedItems');
     var benefit = "";
     if(items4.length>0){

     for (var i = 0; i < items4.length; i++) {
     	if(typeof(items4[i].label)  === "undefined"){
 		}
 		else
 			{
     	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
     	
     	 
     	
 			}
     }
     
     }
   
     
     var items5 = $("#designation").jqxListBox('getSelectedItems');
     var designation = "";
     if(items5.length>0){

     for (var i = 0; i < items5.length; i++) {
     	if(typeof(items5[i].label)  === "undefined"){
 		}
 		else
 			{
 			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
     	
     	 
     	
 			}
     }
     
     }
     
     
     var items6 = $("#thematic").jqxListBox('getSelectedItems');
     var thematic = "";
     if(items6.length>0){

     for (var i = 0; i < items6.length; i++) {
     	if(typeof(items6[i].label)  === "undefined"){
 		}
 		else
 			{
 			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
     	
     	 
     	
 			}
     }
     
     }
     
     
     
    
		
    jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 	
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});
       
       
$("#benefit").on('change', function () {
    
	
	 var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
    var region = "";
    if(items.length>0){
    for (var i = 0; i < items.length; i++) {
  	
    		if(typeof(items[i].label)  === "undefined"){
    		}
    		else
    			{
  	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
  	  
    		}
    }
      }

    
    var items1 = $("#criteria").jqxListBox('getSelectedItems');
    var critria = "";
    if(items1.length>0){
    for (var i = 0; i < items1.length; i++) {
  		if(typeof(items1[i].label)  === "undefined"){
    		}
    		else
    			{
    	
  	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
    }
    
    }
    }
    
   
    
    var items2 = $("#rating").jqxListBox('getSelectedItems');
    var rating = "";
    
    if(items2.length>0){
    for (var i = 0; i < items2.length; i++) {
  		if(typeof(items2[i].label)  === "undefined"){
    		}
    		else
    			{
    	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
    }
    }
    }
    
    
    var items3 = $("#threat").jqxListBox('getSelectedItems');
    var threat = "";
    if(items3.length>0){
    for (var i = 0; i < items3.length; i++) {
  		if(typeof(items3[i].label)  === "undefined"){
    		}
    		else
    			{
    	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
    }
    
    }
    }
    
    
  
    
    
    var items4 = $("#benefit").jqxListBox('getSelectedItems');
    var benefit = "";
    if(items4.length>0){

    for (var i = 0; i < items4.length; i++) {
    	if(typeof(items4[i].label)  === "undefined"){
		}
		else
			{
    	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
    
    var items5 = $("#designation").jqxListBox('getSelectedItems');
    var designation = "";
    if(items5.length>0){

    for (var i = 0; i < items5.length; i++) {
    	if(typeof(items5[i].label)  === "undefined"){
		}
		else
			{
			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
    var items6 = $("#thematic").jqxListBox('getSelectedItems');
    var thematic = "";
    if(items6.length>0){

    for (var i = 0; i < items6.length; i++) {
    	if(typeof(items6[i].label)  === "undefined"){
		}
		else
			{
			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
  

    
  
    
   
		
    jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 		
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});


$("#rating").on('change', function () {
    
	
	
	  var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
      var region = "";
      if(items.length>0){
      for (var i = 0; i < items.length; i++) {
    	  
      		if(typeof(items[i].label)  === "undefined"){
      		}
      		else
      			{
    	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
    	  
      		}
      }
        }
 
      
      var items1 = $("#criteria").jqxListBox('getSelectedItems');
      var critria = "";
      if(items1.length>0){
      for (var i = 0; i < items1.length; i++) {
    		if(typeof(items1[i].label)  === "undefined"){
      		}
      		else
      			{
      	
    	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
      }
      
      }
      }
      
     
      
      var items2 = $("#rating").jqxListBox('getSelectedItems');
      var rating = "";
      
      if(items2.length>0){
      for (var i = 0; i < items2.length; i++) {
    		if(typeof(items2[i].label)  === "undefined"){
      		}
      		else
      			{
      	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
      }
      }
      }
      
      
      var items3 = $("#threat").jqxListBox('getSelectedItems');
      var threat = "";
      if(items3.length>0){
      for (var i = 0; i < items3.length; i++) {
    		if(typeof(items3[i].label)  === "undefined"){
      		}
      		else
      			{
      	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
      }
      
      }
      }
      
      
    
      
      
      var items4 = $("#benefit").jqxListBox('getSelectedItems');
      var benefit = "";
      if(items4.length>0){

      for (var i = 0; i < items4.length; i++) {
      	if(typeof(items4[i].label)  === "undefined"){
  		}
  		else
  			{
      	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
      	
      	 
      	
  			}
      }
      
      }
 
      var items5 = $("#designation").jqxListBox('getSelectedItems');
      var designation = "";
      if(items5.length>0){

      for (var i = 0; i < items5.length; i++) {
      	if(typeof(items5[i].label)  === "undefined"){
  		}
  		else
  			{
  			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
      	
      	 
      	
  			}
      }
      
      }
      
      
      var items6 = $("#thematic").jqxListBox('getSelectedItems');
      var thematic = "";
      if(items6.length>0){

      for (var i = 0; i < items6.length; i++) {
      	if(typeof(items6[i].label)  === "undefined"){
  		}
  		else
  			{
  			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
      	
      	 
      	
  			}
      }
      
      }
      
      
   
  
		
      jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 		
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});
     

	
	
$("#criteria").on('change', function () {
    
	
	 var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
    var region = "";
    if(items.length>0){
    for (var i = 0; i < items.length; i++) {
  	  
    		if(typeof(items[i].label)  === "undefined"){
    		}
    		else
    			{
  	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
  	  
    		}
    }
      }

    
    var items1 = $("#criteria").jqxListBox('getSelectedItems');
    var critria = "";
    if(items1.length>0){
    for (var i = 0; i < items1.length; i++) {
  		if(typeof(items1[i].label)  === "undefined"){
    		}
    		else
    			{
    	
  	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
    }
    
    }
    }
    
   
    
    var items2 = $("#rating").jqxListBox('getSelectedItems');
    var rating = "";
    
    if(items2.length>0){
    for (var i = 0; i < items2.length; i++) {
  		if(typeof(items2[i].label)  === "undefined"){
    		}
    		else
    			{
    	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
    }
    }
    }
    
    
    var items3 = $("#threat").jqxListBox('getSelectedItems');
    var threat = "";
    if(items3.length>0){
    for (var i = 0; i < items3.length; i++) {
  		if(typeof(items3[i].label)  === "undefined"){
    		}
    		else
    			{
    	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
    }
    
    }
    }
    
    
  
    
    var items4 = $("#benefit").jqxListBox('getSelectedItems');
    var benefit = "";
    if(items4.length>0){

    for (var i = 0; i < items4.length; i++) {
    	if(typeof(items4[i].label)  === "undefined"){
		}
		else
			{
    	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
  
    var items5 = $("#designation").jqxListBox('getSelectedItems');
    var designation = "";
    if(items5.length>0){

    for (var i = 0; i < items5.length; i++) {
    	if(typeof(items5[i].label)  === "undefined"){
		}
		else
			{
			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
    var items6 = $("#thematic").jqxListBox('getSelectedItems');
    var thematic = "";
    if(items6.length>0){

    for (var i = 0; i < items6.length; i++) {
    	if(typeof(items6[i].label)  === "undefined"){
		}
		else
			{
			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
   
		
    jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 		
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});




$("#threat").on('change', function () {
    
	
	 var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
    var region = "";
    if(items.length>0){
    for (var i = 0; i < items.length; i++) {
  	  
    		if(typeof(items[i].label)  === "undefined"){
    		}
    		else
    			{
  	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
  	  
    		}
    }
      }

    
    var items1 = $("#criteria").jqxListBox('getSelectedItems');
    var critria = "";
    if(items1.length>0){
    for (var i = 0; i < items1.length; i++) {
  		if(typeof(items1[i].label)  === "undefined"){
    		}
    		else
    			{
    	
  	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
    }
    
    }
    }
    
   
    
    var items2 = $("#rating").jqxListBox('getSelectedItems');
    var rating = "";
    
    if(items2.length>0){
    for (var i = 0; i < items2.length; i++) {
  		if(typeof(items2[i].label)  === "undefined"){
    		}
    		else
    			{
    	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
    }
    }
    }
    
    
    var items3 = $("#threat").jqxListBox('getSelectedItems');
    var threat = "";
    if(items3.length>0){
    for (var i = 0; i < items3.length; i++) {
  		if(typeof(items3[i].label)  === "undefined"){
    		}
    		else
    			{
    	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
    }
    
    }
    }
    
    
  
    
    
    var items4 = $("#benefit").jqxListBox('getSelectedItems');
    var benefit = "";
    if(items4.length>0){

    for (var i = 0; i < items4.length; i++) {
    	if(typeof(items4[i].label)  === "undefined"){
		}
		else
			{
    	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
  
    
    var items5 = $("#designation").jqxListBox('getSelectedItems');
    var designation = "";
    if(items5.length>0){

    for (var i = 0; i < items5.length; i++) {
    	if(typeof(items5[i].label)  === "undefined"){
		}
		else
			{
			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
    var items6 = $("#thematic").jqxListBox('getSelectedItems');
    var thematic = "";
    if(items6.length>0){

    for (var i = 0; i < items6.length; i++) {
    	if(typeof(items6[i].label)  === "undefined"){
		}
		else
			{
			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
   
		
    jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 		
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});


//degination change

$("#designation").on('change', function () {
    
	
	 var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
    var region = "";
    if(items.length>0){
    for (var i = 0; i < items.length; i++) {
  	  
    		if(typeof(items[i].label)  === "undefined"){
    		}
    		else
    			{
  	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
  	  
    		}
    }
      }

    
    var items1 = $("#criteria").jqxListBox('getSelectedItems');
    var critria = "";
    if(items1.length>0){
    for (var i = 0; i < items1.length; i++) {
  		if(typeof(items1[i].label)  === "undefined"){
    		}
    		else
    			{
    	
  	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
    }
    
    }
    }
    
   
    
    var items2 = $("#rating").jqxListBox('getSelectedItems');
    var rating = "";
    
    if(items2.length>0){
    for (var i = 0; i < items2.length; i++) {
  		if(typeof(items2[i].label)  === "undefined"){
    		}
    		else
    			{
    	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
    }
    }
    }
    
    
    var items3 = $("#threat").jqxListBox('getSelectedItems');
    var threat = "";
    if(items3.length>0){
    for (var i = 0; i < items3.length; i++) {
  		if(typeof(items3[i].label)  === "undefined"){
    		}
    		else
    			{
    	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
    }
    
    }
    }
    
    
  
    
    
    var items4 = $("#benefit").jqxListBox('getSelectedItems');
    var benefit = "";
    if(items4.length>0){

    for (var i = 0; i < items4.length; i++) {
    	if(typeof(items4[i].label)  === "undefined"){
		}
		else
			{
    	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
  
    
    var items5 = $("#designation").jqxListBox('getSelectedItems');
    var designation = "";
    if(items5.length>0){

    for (var i = 0; i < items5.length; i++) {
    	if(typeof(items5[i].label)  === "undefined"){
		}
		else
			{
			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
    var items6 = $("#thematic").jqxListBox('getSelectedItems');
    var thematic = "";
    if(items6.length>0){

    for (var i = 0; i < items6.length; i++) {
    	if(typeof(items6[i].label)  === "undefined"){
		}
		else
			{
			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
   
		
    jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 		
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});



//Thematic change 


$("#thematic").on('change', function () {
    
	
	 var items = $("#region").jqxListBox('getSelectedItems');
	  
	 
	  
    var region = "";
    if(items.length>0){
    for (var i = 0; i < items.length; i++) {
  	  
    		if(typeof(items[i].label)  === "undefined"){
    		}
    		else
    			{
  	  region = region + items[i].label + (i < items.length - 1 ? ", " : "");
  	  
    		}
    }
      }

    
    var items1 = $("#criteria").jqxListBox('getSelectedItems');
    var critria = "";
    if(items1.length>0){
    for (var i = 0; i < items1.length; i++) {
  		if(typeof(items1[i].label)  === "undefined"){
    		}
    		else
    			{
    	
  	  critria += items1[i].label + (i < items1.length - 1 ? ", " : "");
    }
    
    }
    }
    
   
    
    var items2 = $("#rating").jqxListBox('getSelectedItems');
    var rating = "";
    
    if(items2.length>0){
    for (var i = 0; i < items2.length; i++) {
  		if(typeof(items2[i].label)  === "undefined"){
    		}
    		else
    			{
    	rating += items2[i].label + (i < items2.length - 1 ? ", " : "");
    }
    }
    }
    
    
    var items3 = $("#threat").jqxListBox('getSelectedItems');
    var threat = "";
    if(items3.length>0){
    for (var i = 0; i < items3.length; i++) {
  		if(typeof(items3[i].label)  === "undefined"){
    		}
    		else
    			{
    	threat += items3[i].label + (i < items3.length - 1 ? ", " : "");
    }
    
    }
    }
    
    
  
    
    
    var items4 = $("#benefit").jqxListBox('getSelectedItems');
    var benefit = "";
    if(items4.length>0){

    for (var i = 0; i < items4.length; i++) {
    	if(typeof(items4[i].label)  === "undefined"){
		}
		else
			{
    	benefit += items4[i].label + (i < items4.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
  
    
    var items5 = $("#designation").jqxListBox('getSelectedItems');
    var designation = "";
    if(items5.length>0){

    for (var i = 0; i < items5.length; i++) {
    	if(typeof(items5[i].label)  === "undefined"){
		}
		else
			{
			designation += items5[i].label + (i < items5.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
    
    var items6 = $("#thematic").jqxListBox('getSelectedItems');
    var thematic = "";
    if(items6.length>0){

    for (var i = 0; i < items6.length; i++) {
    	if(typeof(items6[i].label)  === "undefined"){
		}
		else
			{
			thematic += items6[i].label + (i < items6.length - 1 ? ", " : "");
    	
    	 
    	
			}
    }
    
    }
    
   
		
    jQuery.get('<%=customSearchURL %>&ACTION_CMD=GETSITE&REGION='+region+ '&CRITERIA='+critria+'&RATING='+rating+ '&THREAT='+threat+'&BENEFIT='+benefit+'&DESIGNATION='+designation+'&THEMATIC='+thematic,   
				function(data) {  
			
			
			var parsedJSONObject = jQuery.parseJSON(data);  
			 AllsiteList= parsedJSONObject.search_result;  

			 if(AllsiteList=="no record found.")
				 {
			 		
			 var siteIds = new Array();
			 	siteSearch(siteIds);
				 }
		 	else
		 		{
		 		var result= parsedJSONObject.rows;
			 	var siteIds = result[0].result;
			 	var strSiteNames = result[0].strSiteNames;
			 	var idList = strSiteNames.split(",");
			 	var siteNames = "Site Names are- ";
			 	if(strSiteNames!=""){
				 	for(var i=0;i<idList.length;i++){
				 		siteNames = siteNames+"\n"+idList[i];
				 	}		
				 	}
		 		  	
			 	
			 	siteSearch(siteIds);
			 	
		 		}
				
		});
});



});



	function siteSearch(siteIds) {
		
	
	AUI().use('aui-io-request', function(A) {
		
	   A.io.request('<%=customSearchURL %>', {
	      method: 'POST',
	      data:{
	    	  ACTION_CMD:'advanceSearch',
	     	 siteIds:siteIds,
	     	 searchType:'advanceSearch'
	      },
	      on: {
	          success : function() { 
	       
	         	$('#listViewDiv').html(this.get('responseData'));
	          }
	      }
	    });
	  });
	
	
	}
</script>



