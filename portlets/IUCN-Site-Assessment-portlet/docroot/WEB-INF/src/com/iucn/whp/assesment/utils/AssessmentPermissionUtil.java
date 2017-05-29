package com.iucn.whp.assesment.utils;

import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class AssessmentPermissionUtil {

	public static boolean checkPermission(long assessment_id, long loggedInUserId, String actionLink) throws PortalException, SystemException {
		boolean isVisible = false;

		if (loggedInUserId > 0 && assessment_id > 0) {
			long assementCurrentUserId = 0;
			site_assessment objsite_assessment = null;
			List<String> roleList = new ArrayList<String>();

			try {
				objsite_assessment = site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (objsite_assessment == null) {
				return false;
			}

			User currentUser = UserLocalServiceUtil.getUser(loggedInUserId);
			assementCurrentUserId = objsite_assessment.getCurrent_userid();

			for (Role role : currentUser.getRoles()) {
				roleList.add(role.getName());
			}

			//admin and whp_staff has all permission
			if (roleList.contains(AssessmentContstant.ADMIN_ROLE) || roleList.contains(AssessmentContstant.WHP_STAFF_ROLE) || roleList.contains(AssessmentContstant.COORDINATOR_ROLE)) {
				return true;
			}

			if (AssessmentContstant.ACTION_FILLASSESSMENT.equalsIgnoreCase(actionLink) || AssessmentContstant.ACTION_REVIEW.equalsIgnoreCase(actionLink)) {
				//if(roleList.contains(AssessmentContstant.ASSESSOR_ROLEID)){
				isVisible = assementCurrentUserId == loggedInUserId;
				//}
			} else if (AssessmentContstant.ACTION_TRANSLATE.equalsIgnoreCase(actionLink)) {
				if (roleList.contains(AssessmentContstant.REVIEWER_ROLE) || roleList.contains(AssessmentContstant.ASSESSOR_ROLE)) {
					isVisible = assementCurrentUserId == loggedInUserId;
				}
			} else if (AssessmentContstant.ACTION_VIEW_DIFFERENCES.equalsIgnoreCase(actionLink)
					|| AssessmentContstant.ACTION_CLEAR_HIGHLIGHTS.equalsIgnoreCase(actionLink)
					|| AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION.equalsIgnoreCase(actionLink)) {

				// TODO Revert changes
//				if (roleList.contains(AssessmentContstant.ASSESSOR_ROLE)) {
//					isVisible = false;
					isVisible = true;
//				}

			} else {
				//only WHP_STAFF has permission of other links
				isVisible = false;
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
	
	public static boolean isAdminOrWhpStaffUser(long userId) {
		boolean isSuperUser = false;

		try{
			User currentUser = UserLocalServiceUtil.getUser(userId);
			//admin and whp_staff has all permission
			String[] roleNames = new String[]{AssessmentContstant.ADMIN_ROLE, AssessmentContstant.WHP_STAFF_ROLE, AssessmentContstant.COORDINATOR_ROLE};
			isSuperUser = RoleLocalServiceUtil.hasUserRoles(currentUser.getUserId(), currentUser.getCompanyId(), roleNames, true);
		}catch(Exception ex){
			ex.printStackTrace();
		}

		return isSuperUser;
	}

}
