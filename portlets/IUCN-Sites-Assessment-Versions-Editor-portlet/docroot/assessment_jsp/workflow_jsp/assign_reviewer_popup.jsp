<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.service.*" %>
<%@page import="com.liferay.portal.model.*" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>

<%
long roleId=10165;

	List<User> assessorUserList= new ArrayList<User>();
	long assessmentVersionId=0;
	 long assessmentId=0;
	 
	try{
		String selectedPkey=request.getParameter("keyVal");
		String user_type=request.getParameter("assigne_type");
		if(user_type.equalsIgnoreCase(AssessmentContstant.ACTION_ASSIGN_ASSESSOR)){
			//roleId=17005;
			roleId = AssessmentContstant.ASSESSOR_ROLEID;
		}else if(user_type.equalsIgnoreCase(AssessmentContstant.ACTION_ASSIGN_REVIEWER)){
			//roleId=38002;
			roleId = AssessmentContstant.REVIEWER_ROLEID;
		}else{
			roleId=0;
			assessmentVersionId=Long.parseLong(request.getParameter("versionValue"));
		}
		
		List<User> tempUserList = new ArrayList<User>();
		if(roleId>0)
			tempUserList= UserLocalServiceUtil.getRoleUsers(roleId);
		else
			tempUserList= UserLocalServiceUtil.getUsers(0,100);/* roleId=17005;
		//assessorUserList= UserLocalServiceUtil.getRoleUsers(roleId);
		
		assessorUserList=UserLocalServiceUtil.getUsers(0,100);
	    assessmentId=Long.parseLong(selectedPkey);
	    //assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal")); */
		
	    
	    /// added by Sonil 
	    
	    assessmentId=Long.parseLong(selectedPkey);
		/* List<User> reviewerUserList = UserLocalServiceUtil.getRoleUsers(AssessmentContstant.REVIEWER_ROLEID);
		List<User> whpstaffUserList = UserLocalServiceUtil.getRoleUsers(AssessmentContstant.WHP_STAFF_ROLEID);
		List<User> adminUserList = UserLocalServiceUtil.getRoleUsers(AssessmentContstant.ADMIN_ROLEID);
		List<User> validWHPUserList = new ArrayList<User>();
		
		for(User userWHPObj : adminUserList){
	    	boolean boolfound = false;
	    	for(User userAssessObj : reviewerUserList){
	    		if(userAssessObj.getUserId() == userWHPObj.getUserId()){
	    			boolfound = true;
	    			break;
	    		}
	    	}
	    	if(!boolfound){
	    		validWHPUserList.add(UserLocalServiceUtil.getUserById(userWHPObj.getUserId()));
	    	}
	    }
		
		for(User userWHPObj : whpstaffUserList){
	    	boolean boolfound = false;
	    	for(User userAssessObj : reviewerUserList){
	    		if(userAssessObj.getUserId() == userWHPObj.getUserId()){
	    			boolfound = true;
	    			break;
	    		}
	    	}
	    	if(!boolfound){
	    		validWHPUserList.add(UserLocalServiceUtil.getUserById(userWHPObj.getUserId()));
	    	}
	    }
		
		assessorUserList.addAll(reviewerUserList);
		assessorUserList.addAll(validWHPUserList); */
		// Code Changed by Anurag
	    List<User> validWHPUserList = new ArrayList<User>();
		List<User> adminUserList = UserLocalServiceUtil.getRoleUsers(AssessmentContstant.ADMIN_ROLEID);
	    List<User> whpstaffUserList = UserLocalServiceUtil.getRoleUsers(AssessmentContstant.WHP_STAFF_ROLEID);
	    for(User userWHPObj : whpstaffUserList){
	    	boolean boolfound = false;
	    	for(User userAssessObj : tempUserList){
	    		if(userAssessObj.getUserId() == userWHPObj.getUserId()){
	    			boolfound = true;
	    			break;
	    		}
	    	}
	    	if(!boolfound){
	    		validWHPUserList.add(UserLocalServiceUtil.getUserById(userWHPObj.getUserId()));
	    	}
	    }
	    for(User userWHPObj : adminUserList){
	    	boolean boolfound = false;
	    	for(User userAssessObj : validWHPUserList){
	    		if(userAssessObj.getUserId() == userWHPObj.getUserId()){
	    			boolfound = true;
	    			break;
	    		}
	    	}
	    	if(!boolfound){
	    		validWHPUserList.add(UserLocalServiceUtil.getUserById(userWHPObj.getUserId()));
	    	}
	    }
	    assessorUserList.addAll(tempUserList);
	    assessorUserList.addAll(validWHPUserList);
		
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}


%>
<portlet:defineObjects /> 
   
<portlet:actionURL name="updateReviewer" var="updateReviewerURL" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=updateReviewerURL %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step1_ind.jsp"/>

<aui:form 
    id="baseLangForm" 
	name="baseLangForm" 
	action="<%=updateReviewerURL %>"
	method="post"
>
		
	<table class="formBlock" >
	
	    <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
	    
	    <aui:input
	        name="assessmentId"
	        id="assessmentId"
	        value="<%= assessmentId %>"
	        type="hidden"
	    />
	
	
	<tr>
	<td>
		<label class="popuplbl">Select Reviewer : </label>
	</td>
	<td>
		
		<select  name="assessorId" id="assessorId" style="width:250px;">
		<option  value=="" >Please Select </option>
			<%
			
			for(int i=0;i<assessorUserList.size();i++){
				User tempUser= assessorUserList.get(i);
				%>
			
			<option  id="<%=tempUser.getUserId() %>" value=="<%=tempUser.getUserId() %>" >
				<%=tempUser.getFullName() %>
			</option>
			<%} %>
		</select>
	</td>
	
	</tr>
	<tr ><td></td>
	<td style="text-align:right;" >
		<aui:button type="Submit" value="Assign" />
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>

<script>

	function validateForm(){
	
	var isValid = true;
	//var type = $('#<portlet:namespace/>type').val();

	if(isValid){
		//submitPopupForm('${versionId }','${RefreshUrl}','indDiv','step1Form','${UpdateUrl }');
		document.getElementById('baseLangForm').submit();
        return false;
	}
}
</script>
