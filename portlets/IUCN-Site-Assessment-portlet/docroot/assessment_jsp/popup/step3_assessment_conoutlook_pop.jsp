<%-- <%@ include file="/init.jsp" %>


<%

long assessmentVersionId=0;

List<protection_management_ratings_lkp> lstprotectionlkp=null;

effective_prot_mgmt_iothreats effective_protobj = new  effective_prot_mgmt_iothreatsClp();






try{
	
	String selectedPkey=request.getParameter("keyVal");
    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
    
    
    lstprotectionlkp= effective_prot_mgmt_iothreatsLocalServiceUtil.getprotectingmanagmentrating();
    

	  if(selectedPkey!=null && !selectedPkey.isEmpty())
	    {
	    
		  effective_protobj= effective_prot_mgmt_iothreatsLocalServiceUtil.geteffective_prot_mgmt_iothreats(Long.parseLong(selectedPkey));
 	   }
	 
    
	
}catch(Exception ex )
{
	
    out.println("Ex------------"+ex.getMessage());

	
}






%>




<portlet:defineObjects /> 
   
    <portlet:actionURL name="" var="step3" />
    
    <c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step3 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step3_overall.jsp"/>




<aui:form 
    id="step5Form" 
	name="step5Form" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="conservation_id"
	        id="conservation_id"
	        value=""
	        type="hidden"
	    />
	    
	        <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">  Justification of Assessment : </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="justification" 
			name= "justification" 
			value= ""
			/>
	</td>
	</tr>
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Assessment: </label>
	</td>
	
	<td>
	<aui:select label="" id="assessment" name= "assessment" style="width:200px;" >
			<aui:option value="">Select Assessment</aui:option>
		<%
		
		for(int i=0;i<lstconservationratinglkp.size();i++)
		{
		
		conservation_outlook_rating_lkp outlook_rating_lkp =lstconservationratinglkp.get(i);
		
		if(outlook_rating_lkp.getCo_rating_id()==conservation_obj.getRating()){
		
		%>
		
			<aui:option selected="true"	value="<%=outlook_rating_lkp.getCo_rating_id() %>">
					<%=outlook_rating_lkp.getCo_rating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=outlook_rating_lkp.getCo_rating_id() %>">
					<%=outlook_rating_lkp.getCo_rating() %>
				</aui:option>
		
		
			<%}} %>
			
		</aui:select>
	</td>
	</tr>
	
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep3Form();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>




 --%>