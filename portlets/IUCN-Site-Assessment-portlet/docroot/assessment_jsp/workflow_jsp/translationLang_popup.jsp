<%@ include file="/init.jsp" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />


<%
	List<assessment_lang_lkp> assessment_lang_lkpList=assessment_lang_lkpLocalServiceUtil.findAll();
	List<assessment_lang_lkp> availableLanguage=new ArrayList<assessment_lang_lkp>();
	String assessmentId="";
	
	 List<Long> assementlangIdList=new ArrayList<Long>();
	try{
	    assessmentId=request.getParameter("keyVal");
	    List<assessment_lang_version> lstassessment_lang_version=
	    	assessment_lang_versionLocalServiceUtil.findByAssessmentId(Long.parseLong(assessmentId));
	   
	    if(lstassessment_lang_version!=null && lstassessment_lang_version.size()>0){
	    	for(assessment_lang_version objassessment_lang_version:lstassessment_lang_version){
	    		assementlangIdList.add(objassessment_lang_version.getLanguageid());
	    	}
	    }
	    
	    for(int i=0;i<assessment_lang_lkpList.size();i++){
			assessment_lang_lkp tempassessment_lang_lkp= assessment_lang_lkpList.get(i);
			if(!assementlangIdList.contains(tempassessment_lang_lkp.getLanguageid())){
				availableLanguage.add(tempassessment_lang_lkp);
			}
		} 
	   
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}

if(availableLanguage!=null && availableLanguage.size()>0){
%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="translationStartAction" var="translateAssessmentURL" />

<aui:form 
    id="translateLangForm" 
	name="translateLangForm" 
	action="<%=translateAssessmentURL %>"
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="assessmentId"
	        id="assessmentId"
	        value="<%=assessmentId %>"
	        type="hidden"
	    />
	    
	    <aui:input
	        name="userId"
	        id="userId"
	        value="<%=user.getUserId() %>"
	        type="hidden"
	    />
	
	
	<tr>
	<td>
		<label class="popuplbl">Translation Language: </label>
	</td>
	
	<td>
	
		<select  name="langId" id="langId" style="width:200px;">
			<%
			for(int i=0;i<availableLanguage.size();i++){
				assessment_lang_lkp tempassessment_lang_lkp= availableLanguage.get(i);
				//if(!assementlangIdList.contains(tempassessment_lang_lkp.getLanguageid())){
				%>
			
			<option  id="<%=tempassessment_lang_lkp.getLanguageid() %>" value="<%=tempassessment_lang_lkp.getLanguageid() %>">
				<%=tempassessment_lang_lkp.getLanguagename() %>
			</option>
			<%
			//}
			} %>
		</select>
	</td>
	
	</tr>
	<tr ><td></td>
	<td style="text-align:right;" >
		<aui:button type="Submit" value="Submit" />
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>
<% }%>