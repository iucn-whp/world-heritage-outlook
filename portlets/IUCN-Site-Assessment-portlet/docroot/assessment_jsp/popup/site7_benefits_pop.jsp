<%@ include file="/init.jsp" %>
<%

long assessmentVersionId=0;

List<benefit_rating_lkp> benefitratinglkp=null;

benefits  benefitsobj = new benefitsClp();
benefits_type_ref  benefits_typeobj= new benefits_type_refClp();

List<benefit_checktype_lkp> lstbenefitchktyp_lkp =null;

List<benefit_checksubtype_lkp>  lstbenefitsubtyp_lkp=null;


List<benefits_type_ref> lstbenefits_type_ref=null;


List<benefits_type_ref> objbenefitstyperef = new ArrayList<benefits_type_ref>();

List<Long> lstsubtype= new ArrayList<Long>();



try{
	

	
	String selectedPkey=request.getParameter("keyVal").toString();
    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
    

	 benefitratinglkp = benefit_rating_lkpLocalServiceUtil.findAll();
	
	 lstbenefitchktyp_lkp =benefit_checktype_lkpLocalServiceUtil.findAll();
	 
	 lstbenefitsubtyp_lkp=benefit_checksubtype_lkpLocalServiceUtil.findAll();
 
 
  
  
 
    if(selectedPkey!=null && !selectedPkey.isEmpty())
    {
	    lstbenefits_type_ref=benefits_type_refLocalServiceUtil.findByBenefitsId(Long.parseLong(selectedPkey));	
	    benefitsobj=benefitsLocalServiceUtil.getbenefits(Long.parseLong(selectedPkey));
	    objbenefitstyperef=benefits_type_refLocalServiceUtil.findByBenefitsId(Long.parseLong(selectedPkey));
    
	    
	    for(  benefits_type_ref obj :lstbenefits_type_ref)
	    {
	    	
	    	lstsubtype.add(obj.getBenefit_checksubtype());
	    }

    }
    
    else
    {
    	
    	
    	
    	benefitsobj.setData_deficient(false);
    	benefitsobj.setCommunity_within_site(0);
    	benefitsobj.setCommunity_outside_site(0);
    	benefitsobj.setWider_community(0);
    	benefitsobj.setSummary("");
    	benefitsobj.setAssessment_version_id(assessmentVersionId);
    	benefitsobj.setSelected_benefit(0);   
    	benefits_typeobj.setBenefit_checksubtype(0);
    	benefits_typeobj.setBenefit_checksubtype(0);
    	
    	
    	
    }
    
	
}catch(Exception ex )
{
    out.println("Ex------------"+ex.getMessage());

}

%>


	
<portlet:defineObjects /> 
   
    <portlet:actionURL name="understandingBenefit" var="step7" />
    
    <c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step7 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step7_understand_benefit.jsp"/>


<aui:form 
    id="step7Form" 
	name="step7Form" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="benefitid"
	        id="benefitid"
	        value="<%=benefitsobj.getBenefits_id()%>"
	        type="hidden"
	    />
	    
	        <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%=assessmentVersionId%>"
	        type="hidden"
	    />
	    
	    
	    
		<tr>
	<td class="lblTD">
		<label class="popuplbl"> Select Benefit type:   </label>
	</td>
	
	<td>
	<select  id="benefittype" name="benefittype" style="width:400px;" >
			<option value="">Select Benefit type</option>
			
			
			<%
			for(int i=0;i<lstbenefitchktyp_lkp.size();i++)
			{
				
			benefit_checktype_lkp	 benefit_checktypelkp =lstbenefitchktyp_lkp.get(i);
				
				if(benefit_checktypelkp.getBenefit_id()==benefitsobj.getSelected_benefit()){
		
					%>
					<aui:option selected="true"	value="<%=benefit_checktypelkp.getBenefit_id() %>">
					<%=benefit_checktypelkp.getBenefit_checktype() %>
				</aui:option>
					<%} else { %> 
				
				<aui:option value="<%=benefit_checktypelkp.getBenefit_id() %>">
					<%=benefit_checktypelkp.getBenefit_checktype() %>
				</aui:option>
			
			<%}} %>
		
			
		</select>
	</td>
	</tr>
	    
	    
	 
	 
	     	<tr>
	<td class="lblTD">
		<label class="popuplbl">Select Checklist of benefits: </label>
	</td>
	
	<td>
<!-- 	<select id="benefitSubtype" name="benefitSubtype" multiple  size="6"   style="width:400px;" >
 -->	
	<div class="checkboxList" id="subtype">
<% 
	
List<benefit_checksubtype_lkp> lstchksubtyp = benefit_checksubtype_lkpLocalServiceUtil.findAll();
	 	
	 
	 	for(int i=0;i<lstchksubtyp.size();i++)
	  	{
	 		benefit_checksubtype_lkp tempbenefit_checksubtype_lkp=lstchksubtyp.get(i);
	 		long tempParentid=tempbenefit_checksubtype_lkp.getParent_id();
	  	
	 	
	 	
	 		 		
			if(tempParentid==benefitsobj.getSelected_benefit()){
				if(lstsubtype.contains(tempbenefit_checksubtype_lkp.getSubbenefit_id())){
		%>
		
				<input type="checkbox" name = "benefitSubtype" id = "benefitSubtype" checked value = "<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>" > 
				 <%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%><br>
			<%-- aui:option selected="true"	value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>">
					<%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%>
				</aui:option> --%>
					<%} else { %> 
					
				<%-- <aui:option value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>">
					<%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%>
				</aui:option> --%>

				<input type="checkbox" name = "benefitSubtype" id = "benefitSubtype"  value = "<%=tempbenefit_checksubtype_lkp.getSubbenefit_id() %>" >
				<%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype()%><br>
		
		
			<%}}} %>	 
				
	 						  
    <!--  </select> -->
    </div>
	</td>
	</tr>
		
	<tr>
	<td class="lblTD">
		<label class="popuplbl"> Write Summary: </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="summary" 
			name= "summary" 
			value= "<%=benefitsobj.getSummary()%>"
			
			
			/>
	</td>
	</tr>    
  
    <tr>
	<td class="lblTD">
		<label class="popuplbl">State: </label>
	</td>
	<td>
 	<%
 	if(benefitsobj.getData_deficient()){
 	
 	%>
 	
 	<input type="radio" name="state" value="Present" id="state" >
     Present&nbsp;
     
  
    <input type="radio" name="state" value="datadeficient" checked id="state">
    &nbsp; Data deficient 
	<%} else{%>
	<input type="radio" name="state" value="Present" checked id="state" >
     Present &nbsp;
     
  
    <input type="radio" name="state" value="datadeficient" id="state">
    &nbsp; Data deficient 
	<%} %>
	</td>
	</tr>
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Community within site:  </label>
	</td>
	
	<td>
	<aui:select label="" id="commwithin" name= "commwithin" style="width:400px;" >
			<aui:option value="">Select</aui:option>
			
			<% 
		for(int i=0;i<benefitratinglkp.size();i++)
		{
		
		benefit_rating_lkp  benefitrating_lkp =benefitratinglkp.get(i);
		
		if(benefitrating_lkp.getId()==benefitsobj.getCommunity_within_site()){
		
		%>
		
			<aui:option selected="true"	value="<%=benefitrating_lkp.getId() %>">
					<%=benefitrating_lkp.getRating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=benefitrating_lkp.getId() %>">
					<%=benefitrating_lkp.getRating() %>
				</aui:option>
		
		
			<%}} %>
					</aui:select>
	</td>
	</tr>
	
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Community outside site:   </label>
	</td>
	
	<td>
	<aui:select label="" id="commoutside" name="commoutside" style="width:400px;" >
			<aui:option value="">Select </aui:option>
			
			<% 
		for(int i=0;i<benefitratinglkp.size();i++)
		{
		
		benefit_rating_lkp  benefitrating_lkp =benefitratinglkp.get(i);
		
		if(benefitrating_lkp.getId()==benefitsobj.getCommunity_outside_site()){
		
		%>
		
			<aui:option selected="true"	value="<%=benefitrating_lkp.getId() %>">
					<%=benefitrating_lkp.getRating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=benefitrating_lkp.getId() %>">
					<%=benefitrating_lkp.getRating() %>
				</aui:option>
		
		
			<%}} %>
					</aui:select>
	
	</td>
	</tr>
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Wider Community:   </label>
	</td>
	
	<td>
	<aui:select label="" id="commwider" name="commwider" style="width:400px;" >
			<aui:option value="">Select </aui:option>
			
		<% 
		for(int i=0;i<benefitratinglkp.size();i++)
		{
		
		benefit_rating_lkp  benefitrating_lkp =benefitratinglkp.get(i);
		
		if(benefitrating_lkp.getId()==benefitsobj.getWider_community()){
		
		%>
		
			<aui:option selected="true"	value="<%=benefitrating_lkp.getId() %>">
					<%=benefitrating_lkp.getRating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=benefitrating_lkp.getId() %>">
					<%= benefitrating_lkp.getRating() %>
				</aui:option>
		
		
			<%}} %>
			
					</aui:select>
	</td>
	</tr>
	
	
	
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep7Form();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
 	</table>
</aui:form>


<script  type="text/javascript">



jQuery(function(){
	
	

	
		jQuery("#benefittype").change(function(){
			 
		jQuery("#subtype").empty();
		
	 	var firsttyp= jQuery("#benefittype").val();
	 	
/* 	 	alert("firsttyp"+firsttyp);
 */
	 	<%
	 		
	 	List<benefit_checksubtype_lkp> chksubtyplst = benefit_checksubtype_lkpLocalServiceUtil.findAll();
	 	
	 	
	 	for(int i=0;i<chksubtyplst.size();i++)
	 	{
	 		benefit_checksubtype_lkp tempbenefit_checksubtype_lkp=chksubtyplst.get(i);
	 		long tempParentid=tempbenefit_checksubtype_lkp.getParent_id();
	 	%>
	 		var pid=<%=tempParentid%>;
	 	
				if(firsttyp==pid)
				{
/* 				 alert("tempbenefit_checksubtype_lkp"+pid);
 */ 			<%--  jQuery("#selectedbenefit").append(jQuery("<option><option/>").attr("value",'<%=tempbenefit_checksubtype_lkp.getSubbenefit_id()%>')
						 .text('<%=tempbenefit_checksubtype_lkp.getSubbenefit_id()%>')); --%>
				 jQuery("#subtype").append('<input type="checkbox" id = "benefitSubtype" name = "benefitSubtype" value="<%=tempbenefit_checksubtype_lkp.getSubbenefit_id()%>" onclick="javascript:disableSummary();"> <%=tempbenefit_checksubtype_lkp.getBenefit_checksubtype() %><br>');
				
				}
	 	<% 	}	%>
			
		});
	});
	
	


</script>
<script>





/* function disableSummary(){
	var isChecked=false;
	//$('input[name="cbenefitSubtype"]').each(function(){
	//	alert("test alert");
		if (!$('input[name="cbenefitSubtype"]').is(':checked'))  {
			isChecked=true;
			
	    }
		
		
 
	if (isChecked) {
	    
		$('#<portlet:namespace/>summary').removeAttr("readonly");
	
	}
	
} */
	function validatestep7Form(){
	  
		

	var isValid = true;
	
	var commoutside = $('#<portlet:namespace/>commoutside').val();	
	var commwithin = $('#<portlet:namespace/>commwithin').val();	
	var commwider = $('#<portlet:namespace/>commwider').val();	
	var summary = $('#<portlet:namespace/>summary').val();
		
	var benefittype = $("#benefittype option:selected").val();
	
	
 
	
	
	if(benefittype==0)
	{
	isValid =false;
		alert("Benefit type is required.");
	}

	else if($('#subtype').find('input[type=checkbox]:checked').length == 0)
	{	     
		 isValid =false;
		 alert('Please select atleast one subtype');
	}
	else if(summary=="")
	{
		isValid =false;
		alert("Summary is required.");
	}
	
	

	if(isValid){
   		
		$("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','step7Div','step7Form','${UpdateUrl }',7);
	}
}
</script>

<script>
	/* $( document).ready(function(){
		if (!$('input[name="cbenefitSubtype"]').is(':checked')) {
		    
		    alert("hi hi");
			    
			}
	}); */
</script>

