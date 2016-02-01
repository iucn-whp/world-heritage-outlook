package com.iucn.whp.assesment.utils;

import java.util.ArrayList;
import java.util.List;

import com.iucn.whp.dbservice.model.references;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class AssessmentPermissionUtil {
	
	public static boolean checkPermission(long assessment_id,long loggedInUserId,String actionLink) throws PortalException, SystemException{
		boolean isVisible=false;
		if(loggedInUserId>0 && assessment_id>0){
		long assementCurrentUserId=0;
		site_assessment objsite_assessment=null;
		List<Long> roleList=new ArrayList<Long>();
		try {
			objsite_assessment = site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(objsite_assessment!=null){
			
			User currentUser=UserLocalServiceUtil.getUser(loggedInUserId);
			assementCurrentUserId=objsite_assessment.getCurrent_userid();
			long[] roleIds=currentUser.getRoleIds();
			int rolesize=roleIds.length;
			for(int i=0;i<rolesize;i++){
				roleList.add(roleIds[i]);
			}
			
		}else{
			return false;
		}
			
		//admin and whp_staff has all permission
		if(roleList.contains(AssessmentContstant.ADMIN_ROLEID) || roleList.contains(AssessmentContstant.WHP_STAFF_ROLEID)){
			isVisible=true; 
		}else{
			if(AssessmentContstant.ACTION_FILLASSESSMENT.equalsIgnoreCase(actionLink)){
				//if(roleList.contains(AssessmentContstant.ASSESSOR_ROLEID)){
					if(assementCurrentUserId==loggedInUserId){
						isVisible=true;
					}else{
						isVisible=false;
					}
					
				//}
			}else if(AssessmentContstant.ACTION_REVIEW.equalsIgnoreCase(actionLink)){
				if(assementCurrentUserId==loggedInUserId){
					isVisible=true;
				}else{
					isVisible=false;
				}
			}
			else if(AssessmentContstant.ACTION_TRANSLATE.equalsIgnoreCase(actionLink)){
				if(roleList.contains(AssessmentContstant.REVIEWER_ROLEID) || roleList.contains(AssessmentContstant.ASSESSOR_ROLEID)){
					if(assementCurrentUserId==loggedInUserId){
						isVisible=true;
					}else{
						isVisible=false;
					}
				}
			}else{
				//only WHP_STAFF has permission of other links
				isVisible=false;
			}
			/*else if(AssessmentContstant.ACTION_ASSIGN_ASSESSOR.equalsIgnoreCase(actionLink)){
				//only WHP_STAFF has permission
				isVisible=false;
			}else if(AssessmentContstant.ACTION_ASSIGN_REVIEWER.equalsIgnoreCase(actionLink)){
				//only WHP_STAFF has permission
				isVisible=false;
				
			}
			else if(AssessmentContstant.ACTION_APPROVE.equalsIgnoreCase(actionLink)){
				//only WHP_STAFF has permission
				isVisible=false;
			}else if(AssessmentContstant.ACTION_PUBLISH.equalsIgnoreCase(actionLink)){
				//only WHP_STAFF has permission
				isVisible=false;
			}*/
			
		}
		
		}
		return isVisible;
		
	}
	
	public static boolean isRoleExits(List<Long> roleList,long roleId){
		
		boolean isRoleExits=false;
		int size=roleList.size();
		for(int i=0;i<size;i++){
			long tempRole=roleList.get(i);
			if(tempRole==roleId){
				isRoleExits=true;
				break;
			}
		}
		return isRoleExits;
	}
	
	public static boolean isAdminOrWhpStaffUser(long userId){
		boolean isSuperUser=false;
		List<Long> roleList=new ArrayList<Long>();
		try{
			if(userId>0){
				User currentUser=UserLocalServiceUtil.getUser(userId);
				long[] roleIds=currentUser.getRoleIds();
				int rolesize=roleIds.length;
				for(int i=0;i<rolesize;i++){
					roleList.add(roleIds[i]);
				}
				
			}else{
				isSuperUser=false; 
			}
				
			//admin and whp_staff has all permission
			if(roleList.contains(AssessmentContstant.ADMIN_ROLEID) || roleList.contains(AssessmentContstant.WHP_STAFF_ROLEID)){
				isSuperUser=true; 
			}
		}catch(Exception ex){
			isSuperUser=false; 
			ex.printStackTrace();
		}
		return isSuperUser;
	}

}
