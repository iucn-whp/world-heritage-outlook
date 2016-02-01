package com.iucn.whp.assesment.utils;

public interface AssessmentContstant {
	
	long STAGE_ASSSEMENT=1;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("stage.assessment"));
	long STAGE_REVIEW=2;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("stage.review"));
	long STAGE_APPROVE=3;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("stage.approve"));
	long STAGE_PUBLISHED=4;
	long STAGE_TRANSLATION=5;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("stage.published"));
	long STAGE_ARCHIVED=6;
	
	
	long STATUS_INITIATED=1;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("assessment.stage.initiated"));
	long STATUS_INPROGRESS=2;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("assessment.stage.inprogess"));
	long STATUS_COMPLETED=3;//Long.parseLong(com.liferay.util.portlet.PortletProps.get("assessment.stage.compleated"));
	
	long ASSESSOR_ROLEID=17005;//com.liferay.util.portlet.PortletProps.get("assessor.roleid");
	long REVIEWER_ROLEID=38002;//com.liferay.util.portlet.PortletProps.get("reviewer.roleid");
	long WHP_STAFF_ROLEID=38001;//com.liferay.util.portlet.PortletProps.get("whp.staff.roleid");
	long ADMIN_ROLEID=10161;//com.liferay.util.portlet.PortletProps.get("admin.roleid");
	
	String ACTION_FILLASSESSMENT="Fill Assessment";
	String ACTION_ASSIGN_ASSESSOR="Assign Assessor";
	String ACTION_ASSIGN_REVIEWER="Assign Reviewer";
	String ACTION_REVIEW="Review Assessment";
	String ACTION_APPROVE="Approve";
	String ACTION_PUBLISH="Publish";
	String ACTION_UNPUBLISH="UnPublish";   //Action unpublish added by kamal 
	
	String ACTION_TRANSLATE="Translate";
	String ACTION_EDIT_PUBLISHED="Edit";
	String ACTION_VIEW_VERSION="View Versions";
	String ACTION_ASSIGN_TRANSLATOR="Assign Translator";
	
	String ACTION_SUBMIT_ASSESSMENT="Submit for Review";
	String ACTION_SUBMIT_REVIEW="Review Completed";
	String ACTION_SUBMIT_TRANSLATION="Translation Completed";
	
	String ACTION_VIEW_PREVIOUS_VERSION="View Previous Version";
	
	String ACTION_DELETE_ASSESSMENT="Delete Assessment";
	
	
	 
	

}
