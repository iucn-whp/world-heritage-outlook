<%@page import="java.util.ArrayList"%>
<%@include file="/siteinfo_jsp/init.jsp" %>
<liferay-theme:defineObjects />
<portlet:resourceURL var="siteSearchURL">
	<portlet:param name="jspPageDiv"
		value="/siteinfo_jsp/search/search_resourse.jsp" />
	<portlet:param name="resetCur" value="true" />
</portlet:resourceURL>

<%
//Getting values from the 
List<advance_query_site> allFieldlst=
	advance_query_siteLocalServiceUtil.findAll();


List<String> categoryDisplayList=new ArrayList<String>();

for(advance_query_site objField:allFieldlst){
	
	String tempbase_search_val=objField.getBase_search_val();
	
	if(!categoryDisplayList.contains(tempbase_search_val)){
		categoryDisplayList.add(tempbase_search_val);
	}
	
}
%>


  <div id="queryBuilderWrapper">
	
	
	<div class="queryBuilderContent">
	<div class="fields contentBlocks">
		<span class="fieldTxt">Select Site Category</span>
		
		<select name = "searchCategory" id ="searchCategory"  class="optionBox"
					size="8">
					
					
					<%
					
					for(String cat:categoryDisplayList){
						
					%>
					<option title = "<%=cat %>" id="<%=cat %>" value="<%=cat %>"><%=cat %></option>
					
					<%} %>
					</select>
	</div>

	
	<div class="subAttributes contentBlocks">
		<span class="fieldTxt">Select Site Sub-Category</span>
		
		<select name ="searchSubCategory" id ="searchSubCategory"  class="optionBox"
					size="8">
					
		</select>
	</div>
	
	<div class="operators contentBlocks">
		<span class="fieldTxt">Operators</span>
		<div class="optionBoxButton">
			<input type="button" id="optEqual" value="&nbsp;&nbsp;&nbsp;=&nbsp;&nbsp;&nbsp;" />
			<input type="button" id="optNotEqual" value="&nbsp;&nbsp;!=&nbsp;&nbsp;&nbsp;" /><br>
			<input type="button" id="optGreaterthan" value="&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp;&nbsp;" />
			<input type="button" id="optLessthan" value="&nbsp;&nbsp;&nbsp;&lt;&nbsp;&nbsp;&nbsp;" /><br>
			<input type="button" id="optGreaterOrEqual" value="&nbsp;&nbsp;>=&nbsp;&nbsp;" />
			<input type="button" id="optLessOrEqual" value="&nbsp;&nbsp;<=&nbsp;&nbsp;" /><br>
			<input type="button" id="optLike" value="LIKE" />
		</div>
	</div>
	
	<div class="value contentBlocks">
		<span class="fieldTxt">Select/Edit Value</span>
		<div class="inputContainer">
			<input class="txtInputValue" id="txtValue" type="text" />
			<!-- <textarea class="selectEditValueTextArea" rows="" cols=""></textarea> -->
		
		</div>
	
	</div>
	
	<div class="value contentBlocks">
	<select name ="selectEditValueTextArea" id ="selectEditValueTextArea"  class="optionBoxValue"
					size="8">
					
		</select>
	</div>

		
		
		<div class="QueryBtnsWrapper">
			<input type="button" value="ADD" id="addBtn""/>
			<input type="button" value="AND" id="andBtn" />
			<input type="button" value="OR" id="orBtn"/>
		</div>
		
			<textarea class="queryFooterTextarea" id="querybox" rows="" cols="" readonly></textarea>
		<div class = "executeQueryButton">
		<input type="button" value="CLEAR" id="btnReset" />
		<input type="button" value="EXECUTE QUERY" id="btnRun"/>
		</div>
  </div>
  </div>
  
  
<portlet:resourceURL var="advanceSearchURL">
  <portlet:param name="jspPageDiv" value="/siteinfo_jsp/search/search_resourse.jsp" />
  <portlet:param name="resetCur" value="true" />
</portlet:resourceURL>
  
<script type="text/javascript">
  var optType=null;
  var lstWhereClause = new Array();
  document.getElementById('queryBuilderWrapper').ondblclick = function() { return false; }
jQuery(function () {
	jQuery("#searchCategory").change(function() {
				
		jQuery("#searchSubCategory").empty();
		var catname = $("#searchCategory").val();
		//getting data from server
		var subCatSelection = jQuery("#searchSubCategory");
		jQuery.get('<%=advanceSearchURL %>&ACTION_CMD=GETSUBCAT&SubCat&CATNAME='+catname,  
		function(data) {  
		var parsedJSONObject = jQuery.parseJSON(data);  
		var subCategoryList= new Array();
		subCategoryList= parsedJSONObject.rows;
		subCatSelection.length=0;	
		  for (var i =0; i < subCategoryList.length; i++){  
			  jQuery("#searchSubCategory").append('<option value='+subCategoryList[i].id+' title = '+subCategoryList[i].name+'>'+subCategoryList[i].name+'</option>');
		    }  
		}
		
	  );
 });
	
	
	
	function getLkpValues(){
		jQuery("#selectEditValueTextArea").empty();
		var catname = $("#searchSubCategory").val();
		//getting data from server
		var subCatSelection = jQuery("#selectEditValueTextArea");
		jQuery.get('<%=advanceSearchURL %>&ACTION_CMD=GETUNIQUEVALUES&UID='+catname,  
		function(data) {  
		var parsedJSONObject = jQuery.parseJSON(data);  
		var subCategoryList= new Array();
		subCategoryList= parsedJSONObject.rows;
		
		if(subCategoryList!=""){
			if(optType=="like"){
				jAlert("You have choosen wrong operator. Please choose other than 'LIKE'.");
				return false;
			}
			$("#txtValue").attr("disabled", "disabled"); 
		}
		else 
			$("#txtValue").removeAttr("disabled"); 
		subCatSelection.length=0;
		  for (var i =0; i < subCategoryList.length; i++){ 
			  
			  jQuery("#selectEditValueTextArea").append('<option value='+subCategoryList[i].id+' title = '+subCategoryList[i].name+'>'+subCategoryList[i].name+'</option>');
		    }  
		}

	  );
	}
		
	
	    jQuery("#selectEditValueTextArea").change(function() {
			jQuery("#txtValue").empty();
			var value = $("#selectEditValueTextArea :selected").text();
			jQuery("#txtValue").val(value);
		});
		

		//button events
		jQuery("#andBtn").click(function() {
			addWhereClause('AND');
		});
		jQuery("#addBtn").click(function() {
			addWhereClause('ADD');
		});
		jQuery("#orBtn").click(function() {
			addWhereClause('OR');
		});
		jQuery("#btnReset").click(function() {
			resetForm();
		});

		jQuery("#btnRun").click(function() {
			runQuery();
		});
		 jQuery("#optNotEqual").click(function() {
			optType = '!=';
			getLkpValues();
		}); 
		jQuery("#optEqual").click(function() {
			optType = '=';
			getLkpValues();
		});
		 jQuery("#optGreaterthan").click(function() {
			optType = '>';
			getLkpValues();
		});
		jQuery("#optLessthan").click(function() {
			optType = '<';
			getLkpValues();
		});
		jQuery("#optgreaterOrEqual").click(function() {
			optType = '>=';
			getLkpValues();
		});
		jQuery("#optLessOrEqual").click(function() {
			optType = '<=';
			getLkpValues();
		}); 
		jQuery("#optLike").click(function() {
			optType = 'like';
			getLkpValues();
		});

		function addWhereClause(_optType) {

			var catname = $("#searchCategory").val();
			var subCatgory = $("#searchSubCategory").val();
			var subCatgoryText = $("#searchSubCategory :selected").text();
			var subCatgoryTextValue= $("#selectEditValueTextArea :selected").text();
			var subCatgoryValue= $("#selectEditValueTextArea :selected").val();
			var textValue=jQuery("#txtValue").val();
			var operatorType = optType;
			if(subCatgoryTextValue==""){
				subCatgoryTextValue=textValue;
			}
			else{
				textValue = subCatgoryValue;
			}
			var sqlString = catname + "." + subCatgoryText + " " + operatorType
					+ "  '" + subCatgoryTextValue + "'";

			var previousCriteria = $("#querybox").val();
			var whereSql ="";
			 if(previousCriteria==""){
				whereSql=sqlString;
				createWhereClause(operatorType, subCatgory, textValue, _optType);
			}
			else if(_optType!="ADD"){
				whereSql = previousCriteria + " \n"+_optType+"- " + sqlString;
			 	createWhereClause(operatorType, subCatgory, textValue, _optType);
			}
			else {
				jAlert("Not a valid Operator, Please select Valid Orerator");
				return false;
			}
			
			$("#querybox").val(whereSql);

		}

		function createWhereClause(operator, uid, value, optANDOR) {

			var l = lstWhereClause.length;
			var query = uid + ";;" + operator + ";;" + value + ";;" + optANDOR;
			lstWhereClause[l] = query;
			return lstWhereClause;
		}

		function runQuery() {
			if(lstWhereClause==""){
				jAlert("Please add valid query.");
				return false;
			}
				
			jQuery.get(
					'<%=advanceSearchURL %>&ACTION_CMD=RUNQUERY&lstWhereClause='+lstWhereClause,  
				  			function(data) {
				   
				    var parsedJSONObject = jQuery.parseJSON(data);  
				 	subCategoryList= parsedJSONObject.search_result; 
				 	if(subCategoryList=="no record found.")
				 		jAlert("No Sites found. ");
				 	else{
					 	var result= parsedJSONObject.rows;
					 	var siteIds = result[0].result;
					 	var strSiteNames = result[0].strSiteNames;
					 	var idList = strSiteNames.split(",");
					 	
					 	
					 	// Previous code :
					 		
					 	/* var siteNames = "Site Names are- "; 
					 	if(strSiteNames!=""){
						 	for(var i=0;i<idList.length;i++){
						 		siteNames = siteNames+"\n"+idList[i];
						 			
						 	}
						 	
							jConfirm(siteNames+'<strong>\n Press OK to View on Dashboard. </strong>','Please verify Results.', function(result) {
								
								if(result){
									top.document.getElementById('closethick').click();	
									advanceSearch(siteIds);
								 }
								 
							});
					 	} */
					 	
					 	/// Coded on 23rdAug2013
					 	
					 	/* var alertMsg = "Query returned successfully with"; 
					 	if(strSiteNames!=""){
					 		var tempstr = "";
					 		for(var i=0;i<idList.length;i++){
						 		if(idList[i]!=""){
						 			if(tempstr==""){
						 				tempstr = idList[i];
						 			}else{
						 				tempstr = tempstr + ";" + idList[i];
						 			}
						 		}
						 	}
					 		
					 		//var substr_tempstr = tempstr.substring(0, tempstr.length-1);
					 		var arrytempstr = substr_tempstr.split(";");
					 		alertMsg = alertMsg + " " + arrytempstr.length + " number of results";
						 							 	
							jConfirm(alertMsg+'<strong>\n Press OK to view on Dashboard. </strong>','Please verify results.', function(result) {
								
								if(result){
									top.document.getElementById('closethick').click();	
									advanceSearch(siteIds);
								 }
								 
							}).css({height:"350px", overflow:"auto"});
					 	} */
				 	
					 	if(strSiteNames!=""){
					 		
					 		var alertMsg = "Query processed successfully";
							jConfirm(alertMsg+'<strong>\n Press OK to view results on Dashboard. </strong>','Please verify results.', function(result) {
								if(result){
									top.document.getElementById('closethick').click();	
									advanceSearch(siteIds);
								 }
							});
					 	}
				 	
				 	}
				});
			 }
		});
  
function resetForm() {

	document.getElementById('selectEditValueTextArea').selectedIndex = -1;
	document.getElementById('querybox').value="";
	document.getElementById('txtValue').value="";
	lstWhereClause = new Array();
}
function advanceSearch(siteIds) {
	//alert('Search');
AUI().use('aui-io-request', function(A) {
	
   A.io.request('<%=siteSearchURL %>', {
      method: 'POST',
      data:{
    	 ACTION_CMD:'advanceSearch',
    	 siteIds:siteIds,searchType:'advanceSearch'
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
	
