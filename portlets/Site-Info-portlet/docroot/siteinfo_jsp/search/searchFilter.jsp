<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<portlet:resourceURL var="updateContent"/>
<portlet:defineObjects />
<div class="accordian">
		<div class="accordianContent">
			<a href="#" class="expandCollapseBtn">expand/collapse</a>
			<p>Search Filter</p>
		</div>
</div>
	

<%-- <portlet:resourceURL var="updateContent">
  <portlet:param name="siteId" value="1"/>
  <portlet:param name="jspPageDiv" value="/siteinfo_jsp/search/search_resourse.jsp" />
  <portlet:param name="resetCur" value="true" />
</portlet:resourceURL>

 --%>

<portlet:resourceURL var="site_searchFilterURL">
  <portlet:param name="siteId" value="1"/>
  <portlet:param name="jspPageDiv" value="/siteinfo_jsp/search/search_resourse.jsp" />
  <portlet:param name="resetCur" value="true" />
</portlet:resourceURL>
	
	
	
<aui:form 
action="<%= site_searchFilterURL %>" 
method="post"
name="fmsearchFilter" id="fmsearchFilter"
onSubmit='<%= liferayPortletResponse.getNamespace() + "submitFormSearch();" %>'
>
<div class="filterBox">
	<div class="filterFormContainer">
		<div class="block1">
		<aui:input
	        name="searchType"
	        id="searchType"
	        value="filterSearch"
	        type="hidden"
	    />
		<div class="rowBlock1">
				<div class="left">
					<label class="lblLeft">Inscription year</label>
					<aui:input style="height: 10px;width:73px;" id="startYear" label="" name="startYear" type="text" />
				</div>
				
				<div class="right">
					<label>To</label>
					<aui:input style="height: 10px; width: 73px;" id="to" label="" name="to" type="text" />
				</div>
				
			<!-- 	<aui:select label="" name="yearOpt" id="yearOpt" cssClass="dropDown" > -->
					<!-- <aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
		</div>
		
			<div class="rowBlock1">
				<div class="left">
					<label class="lblLeft">Criteria</label>
					<aui:input style="height: 10px;width:73px;" id="criteria" label="" name="Criteria" type="text" />
				</div>
			<!-- <aui:select style="top: 100; left: 100;" label="" name="criteriaOpt" id="criteriaOpt" cssClass="dropDown" > -->
			<!-- <aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
			</div>
					
		
			
			<div class="rowBlock1" style="display:none">
				<div class="left">
					<label class="lblLeft">Threat</label>
					<aui:input style="height: 10px;width:73px;" id="threat" label="" name="threat" type="text" />
				</div>
				
			<!-- <aui:select label="" name="threatOpt" id="threatOpt" cssClass="dropDown" > -->
			<!-- <aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
			</div>
		</div>
		
		<div class="block2">
		<div class="rowBlock2">
				
				<!-- <aui:field-wrapper label="Is Serial ?" cssClass="radioHeading">
				<label>Yes</label>
					<aui:input name="serial" type="radio" value="yes" label="" />
					<label>No</label>
					<aui:input name="serial" type="radio" value="no" label=""  />
				</aui:field-wrapper> -->
				
				<span class="radioHeading">Is Serial ?</span>
				 <div class="radioWrapper">
					<label>Yes</label>
					<input type="radio" name="serial" value="true" class="radioBtn"/>
				</div>
				
				<div class="radioWrapper">
					<label>No</label>
					<input type="radio" name="serial" value="false" class="radioBtn"/>
				</div>
			
				<!-- <aui:select cssClass="dropDown" label="" name="serialOpt" id="serialOpt" > -->
				<!-- <aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
		</div>
			
		<div class="rowBlock2">
			<span class="radioHeading">Is Transboundary ?</span>
			<div class="radioWrapper">
			<label>Yes</label>
			<input type="radio" name="transboundary" value="true" class="radioBtn"/>
			</div>
			
			<div class="radioWrapper">
				<label>No</label>
				<input type="radio" name="transboundary" value="false" class="radioBtn"/>	
			</div>
			<!-- <aui:field-wrapper label="Is Transboundary ?" cssClass="radioHeading">
				<label>Yes</label>
					<aui:input name="transboundary" id="transboundary" type="radio" value="yes" label="" />
					<label>No</label>
					<aui:input name="transboundary" id="transboundary" type="radio" value="no" label=""  />
				</aui:field-wrapper> -->
				
				
			<!-- <aui:select label="" name="isTranOpt" id="isTranOpt" cssClass="dropDown" >
					<aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
		</div>
			
			<div class="rowBlock2" style="display:none">
				<label class="labelConservationOutlook">Conservation outlook</label>
				<aui:select label="" name="concernOutlook" id="concernOutlook" cssClass="dropDownConcern" style="margin: 0.1em 0 0 0.4em;" >
		 			<aui:option value="And"><liferay-ui:message key="High Concer" /></aui:option>
		 			<aui:option value="Or"><liferay-ui:message key="Low Concer" /></aui:option>
				</aui:select>
					
					<!-- <aui:select label="" name="isConcern" id="isConcern" cssClass="dropDownsiteInfoDashboard" style="position: absolute; left: 19px;" >
					<aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
			</div>		
		</div>
		<div class="block3">
				<div class="rowBlock3">
				<span class="radioHeading">Is Mixed ?</span>
				
				<div class="radioWrapper">
				<label>Yes</label>
					<input type="radio" name="mixed" value="true" class="radioBtn"/>
				</div>
				
				<div class="radioWrapper">
					<label>No</label>
					<input type="radio" name="mixed" value="false" class="radioBtn"/>
				</div>
				
				 
				 <!-- <aui:field-wrapper label="Is Mixed ?" name="mixed" cssClass="radioHeading">
					<label>Yes</label>
					<aui:input name="mixed" type="radio" value="yes" label=""/>
					<label>No</label>
					<aui:input name="mixed" type="radio" value="no" label=""/>
				</aui:field-wrapper> -->
				
				<aui:select label="" name="isMixedOpt" id="isMixedOpt" cssClass="dropDownsiteInfoDashboard" style="position: absolute; left: 88px;">
				<aui:option value="AND"><liferay-ui:message key="AND" /></aui:option>
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
			</div>
			
			
			
			<div class="rowBlock3">	
				<span class="radioHeading">Is On Endangered List ?</span>
				<div class="radioWrapper">
					<label>Yes</label>
					<input type="radio" name="endangeredList" id="endangeredList" value="true" class="radioBtn"/>
				</div>
				
				<div class="radioWrapper">
					<label>No</label>
					<input type="radio" name="endangeredList" id="endangeredList" value="false" class="radioBtn"/>
				</div>
				
				<!-- <aui:field-wrapper label="Is On Endangered List ?" cssClass="radioHeading">
					<label>Yes</label>
					<aui:input name="endangeredList" id="endangeredList" type="radio" value="yes" inlineLabel="right"  label="yes" />
					<label>No</label>
					<aui:input name="endangeredList" id="endangeredList" type="radio" value="no" label="" />
				</aui:field-wrapper> -->
				
				
				<!-- <aui:select label="" name="isendangeredListOpt" id="isendangeredListOpt" cssClass="dropDownsiteInfoDashboard" style="position: absolute; left: 9px;">
		 			<aui:option value="AND"><liferay-ui:message key="AND" /></aui:option> -->
		 			<!-- <aui:option value="OR"><liferay-ui:message key="OR" /></aui:option>
		 			<aui:option value=""><liferay-ui:message key="NA" /></aui:option> -->
				</aui:select>
			</div>
		</div>
		
			<aui:button name="Reset" type="reset" value="Clear" style="float:right; margin: 1.5em 0.1em 0 0;position: relative;top: 60px;right: -170px;" />
<%-- 			<aui:button name="search" type="submit"  value="search" onclick="javascript:submitFormSearch();" style = "float:right; margin: 1.5em 0.1em 0 0;position: relative;top: 60px;right: -175px;"  />
 --%>		
 <input type="button" name="" value="Search" onClick='<%= liferayPortletResponse.getNamespace() + "submitFormSearch();" %>'  style = "float:right; margin: 1.5em 0.1em 0 0;position: relative;top: -23px;right: -300px;" >
		<!-- <input type="button" class="searchBtn" value="Search"/> -->
		<%-- <%= liferayPortletResponse.getNamespace() + "FilterSiteSearch();" %> --%>
		<!-- <aui:button name="saveButton" type="submit" cssClass="searchBtn" value="Search"/> -->
		
	</div>
</div>

</aui:form>


	
	<script>
		$(document).ready(function(){
			$('.dropDown').css('float','right');
			$('.dropDownsiteInfoDashboard').css('position','absolute');
			$('.aui-field-content, .aui-button-holder').css('display','inline-block');
			$('#aui_3_4_0_1_659').css('margin-top','0.4em');
			$('.labelConservationOutlook').css({'margin-top':'0em', 'padding-left':'0'});
			$(':text').css('margin-left','0.4em');
		});
	</script>
	

<script language="javascript" type="text/javascript">
  
  
  function <portlet:namespace />submitFormSearch()  {
		
	  
	   
	   AUI().use('aui-io-request', function(A) {
	   A.io.request('<%= site_searchFilterURL %>', {
	      data: {
		         	  searchType:'filterSearch',
		    		  serial:$("input[type='radio'][name='serial']:checked").val() ,
		    		  transboundary: $("input[type='radio'][name='transboundary']:checked").val(),
		    		  mixed:  $("input[type='radio'][name='mixed']:checked").val(),
		    		  endangeredList: $("input[type='radio'][name='endangeredList']:checked").val() ,
		    		  startYear:$('#<portlet:namespace/>startYear').val(),
		    		  to:$('#<portlet:namespace/>to').val(),
		    		  criteria:$('#<portlet:namespace/>criteria').val(),
		  },
	      method: 'POST',
	      on: {
	          success : function() { 
	        	//alert("hello");
	        	  parent.$('#siteDashboardDiv').html(this.get('responseData')); 
	        	 
	        	 
	          }
	      }
	    });
	  });
	}</script>
	