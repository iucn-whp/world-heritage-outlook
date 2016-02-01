package com.iucn.whp.assesment.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

public class AssessmentActionUtil {
	
	public static boolean isInitiated(long assessment_id){
		
		boolean isInitiated=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long status=objsite_assessment.getStatus_id();
			
			if(status==AssessmentContstant.STATUS_INITIATED){
				isInitiated=true;
			}
		}catch(Exception ex){
			isInitiated=false;
			ex.printStackTrace();
		}
		return isInitiated;
	}
	
	public static boolean isAssessorAssigned(long assessment_id){
		boolean isAssessorAssigned=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long userId=objsite_assessment.getCurrent_userid();
			if(userId>0){
				isAssessorAssigned=true;
			}else{
				isAssessorAssigned=false;
			}
		}catch(Exception ex){
			isAssessorAssigned=false;
			ex.printStackTrace();
		}
		return isAssessorAssigned;
	}
	
	public static boolean hasBaseLang(long assessment_id){
		boolean baseLang=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long langid=objsite_assessment.getBase_langid();
			if(langid>0){
				baseLang=true;
			}else{
				baseLang=false;
			}
		}catch(Exception ex){
			baseLang=false;
			ex.printStackTrace();
		}
		return baseLang;
	}
	
	public static long getWoarkingVersion(long assessment_id){
		long woarkingVersion=0;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			List<site_assessment_versions> site_assessment_versionsList=site_assessment_versionsLocalServiceUtil.findByAssessmentId(assessment_id);
	    	if(site_assessment_versionsList!=null && site_assessment_versionsList.size()>0){
	    		
	        	if(site_assessment_versionsList!=null && site_assessment_versionsList.size()>0){
	    			Collections.sort(site_assessment_versionsList, new Comparator<site_assessment_versions>(){
	    			    public int compare(site_assessment_versions one, site_assessment_versions other) {
	    			        return String.valueOf(other.getAssessment_version_id()).compareTo(String.valueOf(one.getAssessment_version_id()));
	    			    }
	    			});
	    		}
	        	
	        	//to be change
	        	for(int i=0;i<site_assessment_versionsList.size();i++){
	        		site_assessment_versions site_assessment_versionstemp=site_assessment_versionsList.get(i);
	        		if(site_assessment_versionstemp.getIs_translated()==false){
	        			woarkingVersion=site_assessment_versionstemp.getAssessment_version_id();
	        			break;
	        		}
	        	}
	        	
	        }else{
	        	woarkingVersion=0;
	        }
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return woarkingVersion;
	}
	
	public static String getUserName(long assessment_id){
		String userName="";
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long userid=objsite_assessment.getCurrent_userid();
			
			if(userid>0){
				com.liferay.portal.model.User objUser=UserLocalServiceUtil.getUserById(userid);
				//RoleLocalServiceUtil.get
				userName=objUser.getFullName();
			}
			
		}catch(Exception ex){			
			ex.printStackTrace();
		}
		return userName;
	}
	
	public static boolean isLoggedUserIsCurrentUser(long assessment_id,long loggedinUserId){
		
		boolean isLoggedUserIsCurrentUser=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long currentUser=objsite_assessment.getCurrent_userid();
			if(currentUser==loggedinUserId){
				isLoggedUserIsCurrentUser=true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return isLoggedUserIsCurrentUser;
	}

	
	public static boolean isLoggedUserIsCurrentUser_(long assessment_id,long loggedinUserId){
		
		boolean isLoggedUserIsCurrentUser=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long currentUser=objsite_assessment.getCurrent_userid();
			if(currentUser==loggedinUserId){
				isLoggedUserIsCurrentUser=true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return isLoggedUserIsCurrentUser;
	}
	
	public static String getUserNameByUserId(long userid){
		String userName="";
		try{
			if(userid>0){
				com.liferay.portal.model.User objUser=UserLocalServiceUtil.getUserById(userid);
				userName=objUser.getFullName();
			}
			
		}catch(Exception ex){			
			ex.printStackTrace();
		}
		return userName;
	}
	
	public static boolean isReviewerAssigned(long assessment_id){
		boolean isReviewerAssigned=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long userId=objsite_assessment.getCurrent_userid();
			if(userId>0){
				isReviewerAssigned=true;
			}else{
				isReviewerAssigned=false;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return isReviewerAssigned;
	}
	
	public static boolean isReviewStage(long assessment_id){
		boolean isReviewerAssigned=false;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			long userId=objsite_assessment.getCurrent_userid();
			if(userId>0){
				isReviewerAssigned=true;
			}else{
				isReviewerAssigned=false;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return isReviewerAssigned;
	}
	
	public static long getStage(long assessment_id){
		long stage=0;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			if(objsite_assessment!=null)
			stage=objsite_assessment.getCurrent_stageid();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return stage;
	}
	
	public static long getStatus(long assessment_id){
		long status=0;
		try{
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
			if(objsite_assessment!=null)
			status=objsite_assessment.getStatus_id();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return status;
	}
	
	public static boolean hasLinkVisible(long assessment_id,long currentUserId,String actionLink){
		boolean isVisible=false;
		long currentStageId=0, currentStatusId=0;
		
		 
		//check user has the permission for the link or not
		try{
			boolean isUserHasPermission=AssessmentPermissionUtil.checkPermission(assessment_id, currentUserId, actionLink);
			if(!isUserHasPermission){
	        	return isVisible;
	        }
		}catch(Exception ex){
			ex.printStackTrace();
		}
        
        
        
        
		site_assessment objsite_assessment=null;
		try {
			objsite_assessment = site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(objsite_assessment!=null){
			currentStageId=objsite_assessment.getCurrent_stageid();
			currentStatusId=objsite_assessment.getStatus_id();
		}
			
		
		
		if(AssessmentContstant.ACTION_FILLASSESSMENT.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_ASSSEMENT==currentStageId){
				if(AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
					isVisible=true;
				}
			}			
		}else if(AssessmentContstant.ACTION_ASSIGN_ASSESSOR.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_ASSSEMENT==currentStageId){
				if(AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
					isVisible=true;
				}
			}
		}else if(AssessmentContstant.ACTION_ASSIGN_REVIEWER.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_ASSSEMENT==currentStageId && AssessmentContstant.STATUS_COMPLETED==currentStatusId){
					isVisible=true;
			}
			if(AssessmentContstant.STAGE_REVIEW==currentStageId){
				//if(AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
					isVisible=true;
				//}
			}
			
			
		}else if(AssessmentContstant.ACTION_REVIEW.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_REVIEW==currentStageId){
				if(AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
					isVisible=true;
				}
			}
		}else if(AssessmentContstant.ACTION_APPROVE.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_REVIEW==currentStageId && AssessmentContstant.STATUS_COMPLETED==currentStatusId){
				isVisible=true;
			}
			/*if(AssessmentContstant.STAGE_APPROVE==currentStageId){
				isVisible=true;
			}*/
		}else if(AssessmentContstant.ACTION_PUBLISH.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_APPROVE==currentStageId && AssessmentContstant.STATUS_COMPLETED==currentStatusId){
				isVisible=true;
			}
			if(AssessmentContstant.STAGE_PUBLISHED==currentStageId){ //&& AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
				isVisible=true;
			}
			if(AssessmentContstant.STAGE_TRANSLATION==currentStageId && AssessmentContstant.STATUS_COMPLETED==currentStatusId){
				isVisible=true;
			}
		}else if(AssessmentContstant.ACTION_TRANSLATE.equalsIgnoreCase(actionLink)){
			if(AssessmentContstant.STAGE_PUBLISHED==currentStageId || AssessmentContstant.STAGE_APPROVE==currentStageId ){
				isVisible=true;
			}
			if(AssessmentContstant.STAGE_TRANSLATION==currentStageId){
				isVisible=true;
			}
		}
		
		//permission to delete an assessment added by kamal on 8 Aug 2013 
		
		else if(AssessmentContstant.ACTION_DELETE_ASSESSMENT.equalsIgnoreCase(actionLink))
		{
			isVisible=true;
		}
		
		return isVisible;
		
	}
	
	
	public static boolean hasButtonVisible(long assessment_id,long currentUserId,String actionButton){
		boolean isVisible=false;
		long currentStageId=0, currentStatusId=0;
		
		 
		site_assessment objsite_assessment=null;
		try {
			objsite_assessment = site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(objsite_assessment!=null){
			currentStageId=objsite_assessment.getCurrent_stageid();
			currentStatusId=objsite_assessment.getStatus_id();
		}
		
		if(AssessmentContstant.ACTION_SUBMIT_ASSESSMENT.equalsIgnoreCase(actionButton)){
			if(AssessmentContstant.STAGE_ASSSEMENT==currentStageId){
				if(AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
					isVisible=true;
				}
			}			
		}else if(AssessmentContstant.ACTION_SUBMIT_REVIEW.equalsIgnoreCase(actionButton)){
			if(AssessmentContstant.STAGE_REVIEW==currentStageId){
				if(AssessmentContstant.STATUS_COMPLETED!=currentStatusId){
					isVisible=true;
				}
			}
		}else if(AssessmentContstant.ACTION_SUBMIT_TRANSLATION.equalsIgnoreCase(actionButton)){
			if(AssessmentContstant.STAGE_TRANSLATION==currentStageId){
					isVisible=true;
			}
			
		}
		
		return isVisible;
		
	}
	
	
	
	public static List<site_assessment> getSiteAssessmentByUserId(long userid) throws PortalException, SystemException{
		
		List<site_assessment> site_assessmenList=null;
		List<Long> roleList=new ArrayList<Long>();
		if(userid>0){
				com.liferay.portal.model.User objUser=UserLocalServiceUtil.getUserById(userid);
				long[] roleIds=objUser.getRoleIds();
				int rolesize=roleIds.length;
				for(int i=0;i<rolesize;i++){
					roleList.add(roleIds[i]);
				}
				if(roleList!=null && roleList.size()>0){
					if(roleList.contains(AssessmentContstant.ADMIN_ROLEID) || roleList.contains(AssessmentContstant.WHP_STAFF_ROLEID)){
						site_assessmenList=site_assessmentLocalServiceUtil.getAllActiveSiteAssessment();
					}else{
						site_assessmenList=site_assessmentLocalServiceUtil.getActiveAssessmentByUserId(userid);
					}
				}
				
		}
		return site_assessmenList;
	}
	
	public static long getAssessentCurrTranslationVersion(long assessmentId) throws PortalException, SystemException{
		
		long curr_assessment_lang_versionId=0;
		List<assessment_lang_version> assessment_lang_versionList=null;
		
		assessment_lang_versionList=assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessmentId);
		
		if(assessment_lang_versionList!=null){
			if(assessment_lang_versionList!=null && assessment_lang_versionList.size()>0){
    			Collections.sort(assessment_lang_versionList, new Comparator<assessment_lang_version>(){
    			    public int compare(assessment_lang_version one, assessment_lang_version other) {
    			        return String.valueOf(other.getAssessment_version_id()).compareTo(String.valueOf(one.getAssessment_version_id()));
    			    }
    			});
    		}
			
			site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessmentId);
			if(objsite_assessment.getCurrent_stageid()==AssessmentContstant.STAGE_TRANSLATION && 
					objsite_assessment.getStatus_id()== AssessmentContstant.STATUS_INPROGRESS){
				if(objsite_assessment.getBase_langid()!=assessment_lang_versionList.get(0).getLanguageid()){
					curr_assessment_lang_versionId=assessment_lang_versionList.get(0).getAssessment_version_id();
				}
			}
		}
		return curr_assessment_lang_versionId;
     }
	
	public static boolean isAllTranslated(long assessmentId){
		boolean isAllTranslated=false;
		try{
			List<assessment_lang_version> assessment_lang_versionList=null;
			assessment_lang_versionList=assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessmentId);
			if(assessment_lang_versionList.size()==3){
				isAllTranslated=true;
			}
			for(assessment_lang_version ogjassessment_lang_version:assessment_lang_versionList){
				if(!ogjassessment_lang_version.isPublished())
					isAllTranslated=false;
			}
		}catch(Exception ex){
			isAllTranslated=false;
			ex.printStackTrace();
		}
		return isAllTranslated;
	}
	

	public static double roundDouble(double d, int decimalPlace) {
	    BigDecimal bd = new BigDecimal(d);
	    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
	    return bd.doubleValue();
	}
	
public static double getCurrentVersionCodeByAssessmentId(long assessment_id) throws PortalException, SystemException{
		
	double version_code=0;
	try{
		site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);
		List<site_assessment_versions> site_assessment_versionsList=site_assessment_versionsLocalServiceUtil.findByAssessmentId(assessment_id);
    	if(site_assessment_versionsList!=null && site_assessment_versionsList.size()>0){
    		
        	if(site_assessment_versionsList!=null && site_assessment_versionsList.size()>0){
    			Collections.sort(site_assessment_versionsList, new Comparator<site_assessment_versions>(){
    			    public int compare(site_assessment_versions one, site_assessment_versions other) {
    			        return String.valueOf(other.getVersion_code()).compareTo(String.valueOf(one.getVersion_code()));
    			    }
    			});
    		}
        		site_assessment_versions site_assessment_versionstemp=site_assessment_versionsList.get(0);
        		version_code=site_assessment_versionstemp.getVersion_code();
        	
        }else{
        	version_code=0;
        }
	}catch(Exception ex){
		ex.printStackTrace();
	}
	return version_code;
     }

}
