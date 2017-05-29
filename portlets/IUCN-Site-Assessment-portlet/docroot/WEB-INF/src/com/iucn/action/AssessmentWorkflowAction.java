package com.iucn.action;

import com.iucn.whp.assesment.utils.AssessmentActionUtil;
import com.iucn.whp.assesment.utils.AssessmentContstant;
import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author Saurabh.Mehta
 */
public class AssessmentWorkflowAction {

    /**
     * @param request
     * @param response
     * @throws Exception
     * @author Saurabh.Mehta
     */
    public static void fillAssessmentAction(ActionRequest request,
                                            ActionResponse response) throws Exception {

        long assessment_id = ParamUtil.getLong(request, "assessment_id");

        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessment_id);
        long assessment_verId = 0;// ParamUtil.getLong(request,
        // "assessment_verId");

        long versionId = AssessmentActionUtil.getWoarkingVersion(assessment_id);

        if (versionId == 0) {
            site_assessment_versions objsite_assessment_versions = site_assessment_versionsLocalServiceUtil
                    .createsite_assessment_versions(CounterLocalServiceUtil
                            .increment(site_assessment_versions.class.getName()));
            objsite_assessment_versions.setAssessment_id(site_assessment
                    .getAssessment_id());
            objsite_assessment_versions.setInitiation_date(site_assessment
                    .getInitiation_date());

            objsite_assessment_versions.setLanguage(site_assessment
                    .getBase_langid());
            objsite_assessment_versions.setStage_id(site_assessment
                    .getCurrent_stageid());
            objsite_assessment_versions.setStart_date(new Date());
            objsite_assessment_versions.setUserid(site_assessment
                    .getCurrent_userid());
            objsite_assessment_versions.setVersion_code(0.1);
            site_assessment_versions newsite_assessment_versions = site_assessment_versionsLocalServiceUtil
                    .addsite_assessment_versions(objsite_assessment_versions);
            versionId = newsite_assessment_versions.getAssessment_version_id();

            // creating lang ver record
            List<assessment_lang_version> temp = assessment_lang_versionLocalServiceUtil
                    .findByAssessmentIdAndLangId(
                            site_assessment.getAssessment_id(),
                            site_assessment.getBase_langid());

            assessment_lang_version objassessment_lang_version = assessment_lang_versionLocalServiceUtil
                    .createassessment_lang_version(CounterLocalServiceUtil
                            .increment(assessment_lang_version.class.getName()));
            objassessment_lang_version.setAssessmentid(site_assessment
                    .getAssessment_id());
            objassessment_lang_version.setAssessment_version_id(versionId);
            objassessment_lang_version.setLanguageid(site_assessment
                    .getBase_langid());
            objassessment_lang_version.setPublished(false);
            objassessment_lang_version.setPublished_date(null);
            assessment_lang_versionLocalServiceUtil
                    .addassessment_lang_version(objassessment_lang_version);

        }
        System.out.println("versionId::" + versionId);
        response.setRenderParameter("jspPage", "/view.jsp");
        response.setRenderParameter("versionId", versionId + "");
        response.setRenderParameter("assesmentId", assessment_id + "");
        response.setRenderParameter("mode", "edit");
        response.setWindowState(LiferayWindowState.NORMAL);

		/*
         * if(site_assessment.getCurrent_stageid()==1){ String
		 * mode=ParamUtil.getString(request, "mode");
		 * List<site_assessment_versions>
		 * site_assessment_versionsList=site_assessment_versionsLocalServiceUtil
		 * .findByAssessmentId(assessment_id);
		 * 
		 * if(site_assessment_versionsList!=null &&
		 * site_assessment_versionsList.size()>0){
		 * Collections.sort(site_assessment_versionsList, new
		 * Comparator<site_assessment_versions>(){ public int
		 * compare(site_assessment_versions one, site_assessment_versions other)
		 * { return
		 * String.valueOf(other.getAssessment_version_id()).compareTo(String
		 * .valueOf(one.getAssessment_version_id())); } });
		 * 
		 * }
		 * 
		 * request.setAttribute("assessment_id", assessment_id); //
		 * request.setAttribute("assessment_verId", assessment_verId);
		 * request.setAttribute("mode", mode);
		 * response.setRenderParameter("jspPage", "/view.jsp"); }
		 */

        // check for stage of assessment
        /*
         * if(AssessmentActionUtil.isInitiated(assessment_id)){
		 * if(!AssessmentActionUtil.isAssessorAssigned(assessment_id)){
		 * request.setAttribute("assessment_id", assessment_id); String
		 * select_lang_jsp="/assessment_jsp/workflow_jsp/baseLang_popup.jsp";
		 * response.setRenderParameter("jspPage",select_lang_jsp );
		 * response.setWindowState(LiferayWindowState.POP_UP); }else{
		 * 
		 * }
		 * 
		 * }
		 */
    }

    // Assign assessor

    /**
     * @param request
     * @param response
     * @throws Exception functon for assigning assessor
     * @author Saurabh.Mehta
     */
    public static void assigneAssessor(ActionRequest request,
                                       ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        // long assessmentVersionId=ParamUtil.getLong(request,
        // "assessmentVersionId");
        long assessorId = ParamUtil.getLong(request, "assessorId");

        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setCurrent_userid(assessorId);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);

        long currentVersionId = AssessmentActionUtil
                .getWoarkingVersion(assessmentId);

        if (currentVersionId > 0) {
            site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(currentVersionId);
            site_assessment_versionsTemp.setUserid(assessorId);
            site_assessment_versionsLocalServiceUtil
                    .addsite_assessment_versions(site_assessment_versionsTemp);
        }

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    // update base language
    public static void baseLanguageAction(ActionRequest request,
                                          ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        // long assessmentVersionId=ParamUtil.getLong(request,
        // "assessmentVersionId");
        long baseLangId = ParamUtil.getLong(request, "baseLangId");

        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setBase_langid(baseLangId);
        site_assessment.setStatus_id(AssessmentContstant.STATUS_INPROGRESS);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);

        long currentVersionId = AssessmentActionUtil
                .getWoarkingVersion(assessmentId);

        if (currentVersionId > 0) {
            site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(currentVersionId);
            site_assessment_versionsTemp.setLanguage(baseLangId);
            site_assessment_versionsLocalServiceUtil
                    .addsite_assessment_versions(site_assessment_versionsTemp);

        } else if (currentVersionId == 0) {
            site_assessment_versions objsite_assessment_versions = site_assessment_versionsLocalServiceUtil
                    .createsite_assessment_versions(CounterLocalServiceUtil
                            .increment(site_assessment_versions.class.getName()));
            objsite_assessment_versions.setAssessment_id(site_assessment
                    .getAssessment_id());
            objsite_assessment_versions.setInitiation_date(site_assessment
                    .getInitiation_date());

            objsite_assessment_versions.setLanguage(site_assessment
                    .getBase_langid());
            objsite_assessment_versions.setStage_id(site_assessment
                    .getCurrent_stageid());
            objsite_assessment_versions.setStart_date(new Date());
            objsite_assessment_versions.setUserid(site_assessment
                    .getCurrent_userid());
            objsite_assessment_versions.setVersion_code(0.1);
            site_assessment_versions newsite_assessment_versions = site_assessment_versionsLocalServiceUtil
                    .addsite_assessment_versions(objsite_assessment_versions);
            currentVersionId = newsite_assessment_versions
                    .getAssessment_version_id();

            // adding data into assessmet_lang_ver table
            assessment_lang_version objassessment_lang_version = assessment_lang_versionLocalServiceUtil
                    .createassessment_lang_version(CounterLocalServiceUtil
                            .increment(assessment_lang_version.class.getName()));
            objassessment_lang_version.setAssessmentid(site_assessment
                    .getAssessment_id());
            objassessment_lang_version
                    .setAssessment_version_id(newsite_assessment_versions
                            .getAssessment_version_id());
            objassessment_lang_version.setLanguageid(site_assessment
                    .getBase_langid());
            objassessment_lang_version.setPublished(false);
            objassessment_lang_version.setPublished_date(null);
            assessment_lang_versionLocalServiceUtil
                    .addassessment_lang_version(objassessment_lang_version);

        }

        response.setRenderParameter("jspPage", "/view.jsp");
        response.setRenderParameter("versionId", currentVersionId + "");
        response.setRenderParameter("assesmentId", assessmentId + "");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static void assigneReviewer(ActionRequest request,
                                       ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        // long assessmentVersionId=ParamUtil.getLong(request,
        // "assessmentVersionId");
        long assessorId = ParamUtil.getLong(request, "assessorId");

        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setCurrent_userid(assessorId);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        long currentVersionId = AssessmentActionUtil
                .getWoarkingVersion(assessmentId);
        site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                .getsite_assessment_versions(currentVersionId);

        long currentStatusId = site_assessment.getStatus_id();
        long currentStageId = site_assessment.getCurrent_stageid();
        if (AssessmentContstant.STATUS_COMPLETED == currentStatusId
                && AssessmentContstant.STAGE_REVIEW == currentStageId) {
            site_assessment.setStatus_id(AssessmentContstant.STATUS_INITIATED);
            site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        }
        if (AssessmentContstant.STATUS_COMPLETED == currentStatusId
                && AssessmentContstant.STAGE_ASSSEMENT == currentStageId) {
            site_assessment.setStatus_id(AssessmentContstant.STATUS_INITIATED);
            site_assessment
                    .setCurrent_stageid(AssessmentContstant.STAGE_REVIEW);
            site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        }

        if (AssessmentContstant.STATUS_INPROGRESS == currentStatusId
                && AssessmentContstant.STAGE_REVIEW == currentStageId) {
            site_assessment_versionsTemp.setUserid(assessorId);
            site_assessment_versionsLocalServiceUtil
                    .updatesite_assessment_versions(site_assessment_versionsTemp);
        }

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static void reviewAssessmentAction(ActionRequest request,
                                              ActionResponse response) throws Exception {
        long assessment_id = ParamUtil.getLong(request, "assessmentId");
        long userId = ParamUtil.getLong(request, "userId");
        long currentVersionId = AssessmentActionUtil
                .getWoarkingVersion(assessment_id);
        long assessment_version_id = 0;
        if (currentVersionId > 0) {
            site_assessment_versions objsite_assessment_versions = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(currentVersionId);

            site_assessment objsite_assessment = null;
            try {
                objsite_assessment = site_assessmentLocalServiceUtil
                        .getsite_assessment(assessment_id);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            long currentStatusId = 0, currentStageId = 0;
            double currVersionCode = 0;
            if (objsite_assessment != null) {
                currentStageId = objsite_assessment.getCurrent_stageid();
                currentStatusId = objsite_assessment.getStatus_id();
                currVersionCode = objsite_assessment_versions.getVersion_code();
                assessment_version_id = objsite_assessment_versions
                        .getAssessment_version_id();
            }

            if (AssessmentContstant.STAGE_REVIEW == currentStageId) {
                long currAssessment_version_id = 0;

                if (AssessmentContstant.STATUS_INITIATED == currentStatusId) {
                    objsite_assessment
                            .setStatus_id(AssessmentContstant.STATUS_INPROGRESS);
                    site_assessmentLocalServiceUtil
                            .updatesite_assessment(objsite_assessment);

                    // creating new assessment version
                    double newVersionCode = getNewVersionCodeAsDouble(currVersionCode);

                    // sending stage id for new created version
                    currAssessment_version_id = createNewAssessmentVersion(
                            assessment_id, assessment_version_id, userId,
                            newVersionCode, 0);
                    try {
                        // setting new assessment version id
                        long langid = objsite_assessment_versions.getLanguage();
                        List<assessment_lang_version> lstassessment_lang_version = assessment_lang_versionLocalServiceUtil
                                .findByAssessmentIdAndLangId(assessment_id,
                                        langid);
                        if (lstassessment_lang_version != null
                                && lstassessment_lang_version.size() > 0) {
                            assessment_lang_version objassessment_lang_version = lstassessment_lang_version
                                    .get(0);
                            objassessment_lang_version
                                    .setAssessmentid(assessment_id);
                            objassessment_lang_version
                                    .setAssessment_version_id(currAssessment_version_id);
                            objassessment_lang_version.setLanguageid(langid);
                            objassessment_lang_version.setPublished(false);
                            objassessment_lang_version.setPublished_date(null);
                            assessment_lang_versionLocalServiceUtil
                                    .updateassessment_lang_version(objassessment_lang_version);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                } else if (AssessmentContstant.STATUS_INPROGRESS == currentStatusId) {
                    currAssessment_version_id = assessment_version_id;
                } else if (AssessmentContstant.STATUS_COMPLETED == currentStatusId) {

                }

                response.setRenderParameter("jspPage", "/view.jsp");
                response.setRenderParameter("versionId",
                        currAssessment_version_id + "");
                response.setRenderParameter("assesmentId", assessment_id + "");
                response.setWindowState(LiferayWindowState.NORMAL);
            }
        }
    }

    public static void approveAssessmentAction(ActionRequest request,
                                               ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long userId = ParamUtil.getLong(request, "userId");

        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setStatus_id(AssessmentContstant.STATUS_COMPLETED);
        site_assessment.setCurrent_stageid(AssessmentContstant.STAGE_APPROVE);
        site_assessment.setCurrent_userid(userId);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        long currentVersionId = AssessmentActionUtil
                .getWoarkingVersion(assessmentId);

        site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                .getsite_assessment_versions(currentVersionId);
        // site_assessment_versionsTemp.setStage_id(AssessmentContstant.STAGE_APPROVE);

        double vcod = site_assessment_versionsTemp.getVersion_code();
        // double a=Double.

        // creating new assessment version
        double newVersionCode = getNewVersionCodeAsDouble(vcod);
        long currAssessment_version_id = createNewAssessmentVersion(
                assessmentId, currentVersionId, userId, newVersionCode, 0);

        try {
            // setting new assessment version id
            long langid = site_assessment_versionsTemp.getLanguage();
            List<assessment_lang_version> lstassessment_lang_version = assessment_lang_versionLocalServiceUtil
                    .findByAssessmentIdAndLangId(assessmentId, langid);
            if (lstassessment_lang_version != null
                    && lstassessment_lang_version.size() > 0) {
                assessment_lang_version objassessment_lang_version = lstassessment_lang_version
                        .get(0);
                objassessment_lang_version.setAssessmentid(assessmentId);
                objassessment_lang_version
                        .setAssessment_version_id(currAssessment_version_id);
                objassessment_lang_version.setLanguageid(langid);
                objassessment_lang_version.setPublished(false);
                objassessment_lang_version.setPublished_date(null);
                assessment_lang_versionLocalServiceUtil
                        .updateassessment_lang_version(objassessment_lang_version);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // site_assessment_versionsLocalServiceUtil.addsite_assessment_versions(site_assessment_versionsTemp);

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static void publishAssessmentAction(ActionRequest request,
                                               ActionResponse response) throws Exception {

        long userId = ParamUtil.getLong(request, "userId");
        long lang_ver_id = ParamUtil.getLong(request, "lang_ver_id");
        assessment_lang_version objAssessment = assessment_lang_versionLocalServiceUtil
                .getassessment_lang_version(lang_ver_id);

        if (objAssessment != null && !objAssessment.isPublished()) {
            site_assessment site_assessmenttemp = site_assessmentLocalServiceUtil
                    .getsite_assessment(objAssessment.getAssessmentid());

            long siteId = site_assessmenttemp.getSite_id();
            List<site_assessment> site_assessmentlst = site_assessmentLocalServiceUtil
                    .getActiveAssessmentBySiteId(siteId);

            for (site_assessment objsite_assessment : site_assessmentlst) {
                try {
                    if (objsite_assessment.getAssessment_id() != objAssessment.getAssessmentid()) {
                        objsite_assessment.setArchived(true);
                        objsite_assessment.setCurrent_stageid(AssessmentContstant.STAGE_ARCHIVED);
                        List<assessment_lang_version> lstassessment_lang_version = assessment_lang_versionLocalServiceUtil
                                .findByAssessmentId(objsite_assessment.getAssessment_id());

                        for (assessment_lang_version tempassessment_lang_version : lstassessment_lang_version) {
                            tempassessment_lang_version.setPublished(false);
                            assessment_lang_versionLocalServiceUtil.updateassessment_lang_version(tempassessment_lang_version);
                        }

                        site_assessmentLocalServiceUtil
                                .updatesite_assessment(objsite_assessment);
                    }

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

            }

            try {
                site_assessment site_assessment = site_assessmentLocalServiceUtil
                        .getsite_assessment(objAssessment.getAssessmentid());
                site_assessment
                        .setStatus_id(AssessmentContstant.STATUS_COMPLETED);
                site_assessment
                        .setCurrent_stageid(AssessmentContstant.STAGE_PUBLISHED);
                site_assessment.setCurrent_userid(0);
                site_assessment.setArchived(false);
                site_assessment.setIs_active(false);
                site_assessmentLocalServiceUtil
                        .updatesite_assessment(site_assessment);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            // getting this version
            site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(objAssessment
                            .getAssessment_version_id());

            // getting new version code as a whole number
            if (site_assessment_versionsTemp != null) {
                // if(objAssessment.getLanguageid()==site_assessment.getBase_langid()){
                double currAssessmentCode = AssessmentActionUtil.getCurrentVersionCodeByAssessmentId(objAssessment.getAssessmentid());
                if (currAssessmentCode == 0) {
                    currAssessmentCode = site_assessment_versionsTemp.getVersion_code();
                }
                double newVersionCode = getNewVersionCodeAsNumber(currAssessmentCode);
                site_assessment_versionsTemp.setVersion_code(newVersionCode);
                // }

                site_assessment_versionsTemp
                        .setStage_id(AssessmentContstant.STAGE_PUBLISHED);
                site_assessment_versionsTemp.setEnd_date(new Date());
                site_assessment_versionsLocalServiceUtil
                        .updatesite_assessment_versions(site_assessment_versionsTemp);
            }

            // setting value of
            /*
             * long langid=site_assessment_versionsTemp.getLanguage();
			 * List<assessment_lang_version>
			 * listassessment_lang_version=assessment_lang_versionLocalServiceUtil
			 * . findByAssessmentIdAndLangId(assessmentId, langid);
			 * if(listassessment_lang_version!=null){
			 */
            assessment_lang_version objAssessment_lang_version = assessment_lang_versionLocalServiceUtil
                    .getassessment_lang_version(lang_ver_id);

            objAssessment_lang_version.setPublished(true);
            objAssessment_lang_version.setPublished_date(new Date());
            assessment_lang_versionLocalServiceUtil
                    .updateassessment_lang_version(objAssessment_lang_version);

            // Remove notification (site information is updating)
            whp_sites whp_sites = whp_sitesLocalServiceUtil.getwhp_sites(siteId);
            whp_sites.setInformation_updating(false);
            whp_sitesLocalServiceUtil.updatewhp_sites(whp_sites);

            // }
        }

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }


    // kamal  code change to unpublish Assessment

    public static void unPublishAssessmentAction(ActionRequest request,
                                                 ActionResponse response) throws Exception {

        long userId = ParamUtil.getLong(request, "userId");
        long lang_ver_id = ParamUtil.getLong(request, "lang_ver_id");

        long assessment_id = ParamUtil.getLong(request, "Assess_id");

		
		
	/*	assessment_lang_version objAssessment_lang_version = assessment_lang_versionLocalServiceUtil
				.getassessment_lang_version(lang_ver_id);

		if (objAssessment_lang_version != null) {
			
			// getting this version
			site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
					.getsite_assessment_versions(objAssessment_lang_version.getAssessment_version_id());

			// getting new version code as a whole number
			if (site_assessment_versionsTemp != null) {
				site_assessment_versionsTemp
						.setStage_id(AssessmentContstant.STAGE_APPROVE);
				//site_assessment_versionsTemp.setEnd_date(new Date());
				site_assessment_versionsLocalServiceUtil
						.addsite_assessment_versions(site_assessment_versionsTemp);
			}
			
			
			objAssessment_lang_version.setPublished(false);
			objAssessment_lang_version.setPublished_date(null);
			assessment_lang_versionLocalServiceUtil
					.addassessment_lang_version(objAssessment_lang_version);

			// }
		}
*/

        //getting all assessment version

        List<assessment_lang_version> lstassessment_lang_version = assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessment_id);

        if (lstassessment_lang_version != null && !lstassessment_lang_version.isEmpty()) {
            for (assessment_lang_version objassessment_lang_version : lstassessment_lang_version) {
                objassessment_lang_version.setPublished(false);
                objassessment_lang_version.setPublished_date(null);
                assessment_lang_versionLocalServiceUtil
                        .addassessment_lang_version(objassessment_lang_version);
                // getting this version
                site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                        .getsite_assessment_versions(objassessment_lang_version.getAssessment_version_id());

                // getting new version code as a whole number
                if (site_assessment_versionsTemp != null) {
                    site_assessment_versionsTemp
                            .setStage_id(AssessmentContstant.STAGE_APPROVE);
                    //site_assessment_versionsTemp.setEnd_date(new Date());
                    site_assessment_versionsLocalServiceUtil
                            .updatesite_assessment_versions(site_assessment_versionsTemp);
                }

            }

        }


        site_assessment objsite_assessment = site_assessmentLocalServiceUtil.getsite_assessment(assessment_id);

        if (objsite_assessment != null) {
            objsite_assessment.setCurrent_stageid(AssessmentContstant.STAGE_APPROVE);
            site_assessmentLocalServiceUtil.updatesite_assessment(objsite_assessment);
        }

        assessment_lang_version objAssessment_lang_version = assessment_lang_versionLocalServiceUtil
                .getassessment_lang_version(lang_ver_id);


        site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                .getsite_assessment_versions(objAssessment_lang_version.getAssessment_version_id());

        // getting new version code as a whole number
        if (site_assessment_versionsTemp != null) {
            site_assessment_versionsTemp
                    .setStage_id(AssessmentContstant.STAGE_APPROVE);
            //site_assessment_versionsTemp.setEnd_date(new Date());
            site_assessment_versionsLocalServiceUtil
                    .updatesite_assessment_versions(site_assessment_versionsTemp);
        }


        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);


    }

    public static void submitForReviewAction(ActionRequest request,
                                             ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long userId = ParamUtil.getLong(request, "userId");
        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setStatus_id(AssessmentContstant.STATUS_COMPLETED);
        site_assessment.setCurrent_userid(0);
        // site_assessment.setCurrent_stageid(AssessmentContstant.STAGE_PUBLISHED);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        long currentVersionId = ParamUtil.getLong(request, "versionId");
        ;// AssessmentActionUtil.getWoarkingVersion(assessmentId);
        // getting this version
        site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                .getsite_assessment_versions(currentVersionId);

        site_assessment_versionsTemp
                .setStage_id(AssessmentContstant.STAGE_ASSSEMENT);
        site_assessment_versionsTemp.setEnd_date(new Date());
        // site_assessment_versionsTemp.setUserid(userId);
        site_assessment_versionsLocalServiceUtil
                .updatesite_assessment_versions(site_assessment_versionsTemp);

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static void reviewCompletedAction(ActionRequest request,
                                             ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long userId = ParamUtil.getLong(request, "userId");
        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setStatus_id(AssessmentContstant.STATUS_COMPLETED);
        site_assessment.setCurrent_userid(0);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        long currentVersionId = ParamUtil.getLong(request, "versionId");
        ;// AssessmentActionUtil.getWoarkingVersion(assessmentId);
        // getting this version
        site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                .getsite_assessment_versions(currentVersionId);

        site_assessment_versionsTemp
                .setStage_id(AssessmentContstant.STAGE_REVIEW);
        site_assessment_versionsTemp.setUserid(userId);
        site_assessment_versionsTemp.setEnd_date(new Date());
        site_assessment_versionsLocalServiceUtil
                .updatesite_assessment_versions(site_assessment_versionsTemp);

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static void translationStartAction(ActionRequest request,
                                              ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long langId = ParamUtil.getLong(request, "langId");
        long userId = ParamUtil.getLong(request, "userId");
        long versionId = ParamUtil.getLong(request, "versionId");
        if (langId > 0) {
            site_assessment site_assessment = site_assessmentLocalServiceUtil
                    .getsite_assessment(assessmentId);
            site_assessment.setStatus_id(AssessmentContstant.STATUS_INPROGRESS);
            site_assessment.setCurrent_userid(userId);
            site_assessment
                    .setCurrent_stageid(AssessmentContstant.STAGE_TRANSLATION);
            site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
            long currentVersionId = AssessmentActionUtil
                    .getWoarkingVersion(assessmentId);

            site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(currentVersionId);

            // creating new assessment version
            double newVersionCode = getNewVersionCodeAsDouble(site_assessment_versionsTemp
                    .getVersion_code());
            // newVersionCode=newVersionCode+Double.parseDouble("0.0"+langId);

            // sending stage id for new created version
            long newAssessment_version_id = createNewAssessmentVersion(
                    assessmentId, currentVersionId, userId, newVersionCode,
                    currentVersionId);

            // updating new language
            site_assessment_versions newAssessment_version = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(newAssessment_version_id);
            newAssessment_version.setLanguage(langId);
            site_assessment_versionsLocalServiceUtil
                    .updatesite_assessment_versions(newAssessment_version);

            // getting this version
			/*
			 * site_assessment_versions
			 * site_assessment_versionsTemp=site_assessment_versionsLocalServiceUtil
			 * . getsite_assessment_versions(currentVersionId);
			 * 
			 * site_assessment_versionsTemp.setStage_id(AssessmentContstant.
			 * STAGE_REVIEW); site_assessment_versionsTemp.setUserid(userId);
			 * site_assessment_versionsLocalServiceUtil
			 * .addsite_assessment_versions(site_assessment_versionsTemp);
			 */

            assessment_lang_version objassessment_lang_version = assessment_lang_versionLocalServiceUtil
                    .createassessment_lang_version(CounterLocalServiceUtil
                            .increment(assessment_lang_version.class.getName()));
            objassessment_lang_version.setAssessmentid(site_assessment
                    .getAssessment_id());
            objassessment_lang_version
                    .setAssessment_version_id(newAssessment_version_id);
            objassessment_lang_version.setLanguageid(langId);
            objassessment_lang_version.setPublished(false);
            objassessment_lang_version.setPublished_date(null);
            assessment_lang_versionLocalServiceUtil
                    .addassessment_lang_version(objassessment_lang_version);

            response.setRenderParameter("jspPage", "/view.jsp");
            response.setRenderParameter("versionId", newAssessment_version_id
                    + "");
            response.setRenderParameter("assesmentId", assessmentId + "");
            response.setWindowState(LiferayWindowState.NORMAL);
        }

    }

    public static void translateAssessmentAction(ActionRequest request,
                                                 ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long userId = ParamUtil.getLong(request, "userId");
        long versionId = ParamUtil.getLong(request, "versionId");
        if (versionId > 0) {
            site_assessment site_assessment = site_assessmentLocalServiceUtil
                    .getsite_assessment(assessmentId);
            site_assessment.setStatus_id(AssessmentContstant.STATUS_INPROGRESS);
            site_assessment.setCurrent_userid(userId);
            site_assessment
                    .setCurrent_stageid(AssessmentContstant.STAGE_TRANSLATION);
            site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);

            response.setRenderParameter("jspPage", "/view.jsp");
            response.setRenderParameter("versionId", versionId + "");
            response.setRenderParameter("assesmentId", assessmentId + "");
            response.setWindowState(LiferayWindowState.NORMAL);
        }

    }

    public static void assigneTranslator(ActionRequest request,
                                         ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long assessmentVersionId = ParamUtil.getLong(request,
                "assessmentVersionId");
        long translatorId = ParamUtil.getLong(request, "assessorId");
        // long langId=ParamUtil.getLong(request, "langId");

        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setCurrent_userid(translatorId);
        site_assessmentLocalServiceUtil.addsite_assessment(site_assessment);

        if (assessmentVersionId > 0) {
            site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(assessmentVersionId);
            site_assessment_versionsTemp.setUserid(translatorId);
            site_assessment_versionsLocalServiceUtil
                    .addsite_assessment_versions(site_assessment_versionsTemp);
        }

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static void translationCompleateAction(ActionRequest request,
                                                  ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long userId = ParamUtil.getLong(request, "userId");
        site_assessment site_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);
        site_assessment.setStatus_id(AssessmentContstant.STATUS_COMPLETED);
        site_assessment.setCurrent_userid(0);
        site_assessmentLocalServiceUtil.updatesite_assessment(site_assessment);
        long currentVersionId = ParamUtil.getLong(request, "versionId");
        ;// AssessmentActionUtil.getWoarkingVersion(assessmentId);
        // getting this version
        site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                .getsite_assessment_versions(currentVersionId);

        site_assessment_versionsTemp
                .setStage_id(AssessmentContstant.STAGE_TRANSLATION);
        site_assessment_versionsTemp.setUserid(userId);
        site_assessment_versionsTemp.setEnd_date(new Date());
        site_assessment_versionsLocalServiceUtil
                .updatesite_assessment_versions(site_assessment_versionsTemp);

        response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);

    }

    public static double getNewVersionCodeAsNumber(double currVersion) {
        int no = (int) currVersion;
        int newVersionNo = no + 1;
        return newVersionNo;
    }

    public static double getNewVersionCodeAsDouble(double currVersion) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        double newVersionNo = currVersion + 0.1;
        DecimalFormat df = new DecimalFormat("#.#");
        if (df.format(newVersionNo).contains(".0")) {
            newVersionNo = newVersionNo + 0.1;
        }

        return AssessmentActionUtil.roundDouble(newVersionNo, 1);
    }

    public static void viewAssessmentAction(ActionRequest request,
                                            ActionResponse response) throws Exception {

        long assessment_id = ParamUtil.getLong(request, "assessment_id");
        long versionId = AssessmentActionUtil.getWoarkingVersion(assessment_id);
        response.setRenderParameter("jspPage", "/view.jsp");
        response.setRenderParameter("versionId", versionId + "");
        response.setRenderParameter("assesmentId", assessment_id + "");
        response.setRenderParameter("mode", "view");
        response.setWindowState(LiferayWindowState.NORMAL);
    }

    public static void editPublishesAssessmentAction(ActionRequest request,
                                                     ActionResponse response) throws Exception {

        long versionId = ParamUtil.getLong(request, "versionId");
        long assesmentId = ParamUtil.getLong(request, "assesmentId");
        boolean updateForSAV = ParamUtil.getBoolean(request, "updateForSAV", false);
        String siteId = ParamUtil.getString(request, "siteId", "");

        if (!siteId.isEmpty()) {
            ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
            versionId = createAndFill(assesmentId, versionId, themeDisplay.getUserId());
            //to do approve new version or add edit menu for coordinator.
        }

        response.setRenderParameter("jspPage", "/view.jsp");
        response.setRenderParameter("siteId", siteId);
        response.setRenderParameter("versionId", versionId + "");
        response.setRenderParameter("assesmentId", assesmentId + "");
        response.setRenderParameter("updateForSAV", String.valueOf(updateForSAV));
        response.setRenderParameter("mode", "edit");
        response.setWindowState(LiferayWindowState.NORMAL);

    }


    public static void fillFromPrevAssessmentAction(ActionRequest request,
                                                    ActionResponse response) throws Exception {

        long assessmentId = ParamUtil.getLong(request, "assessmentId");
        long pversionId = ParamUtil.getLong(request, "pversionId");
        long assessmentVersionId = ParamUtil.getLong(request, "assessmentVersionId");
        long userId = ((ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY)).getUserId();

        if (assessmentId > 0) {
            site_assessment site_assessment = site_assessmentLocalServiceUtil
                    .getsite_assessment(assessmentId);

            site_assessment_versions site_assessment_versionsTemp = site_assessment_versionsLocalServiceUtil
                    .getsite_assessment_versions(pversionId);

            //getting new version code
            double currAssessmentCode = AssessmentActionUtil.getCurrentVersionCodeByAssessmentId(assessmentId);

            // creating new assessment version
            //double newVersionCode = getNewVersionCodeAsDouble(currAssessmentCode);
//            long userId = site_assessment_versionsTemp.getUserid();

            // sending stage id for new created version
            long newAssessment_version_id = createNewAssessmentVersion(
                    assessmentId, pversionId, userId, new BigDecimal(currAssessmentCode + 0.1d).setScale(2, RoundingMode.DOWN).doubleValue(),pversionId);

            List<assessment_lang_version> assessmentLangVersions = assessment_lang_versionLocalServiceUtil
                    .findByAssessmentIdByAssessmentVersionId(assessmentVersionId);

            // https://redmine.aimprosoft.com/issues/37357
            // We need to update assessment_lang_version data if we fill assessment from previous version
            if (assessmentLangVersions != null && assessmentLangVersions.size() > 0) {
                for (assessment_lang_version langVersion : assessmentLangVersions) {
                    if (langVersion.getAssessmentid() == site_assessment.getAssessment_id()) {
                        langVersion.setAssessment_version_id(newAssessment_version_id);
                        assessment_lang_versionLocalServiceUtil.updateassessment_lang_version(langVersion);
                    }
                }
            }

            response.setRenderParameter("jspPage", "/view.jsp");
            response.setRenderParameter("versionId", newAssessment_version_id
                    + "");
            response.setRenderParameter("assesmentId", assessmentId + "");
            response.setWindowState(LiferayWindowState.NORMAL);
        }

    }

    // Creating new version of a assessment
    public static long createNewAssessmentVersion(long assessmentId, long assessment_version_id, long userId, double assessmentVerCode, long parent_assessment_versionid) throws Exception {
        site_assessment objSite_assessment = site_assessmentLocalServiceUtil
                .getsite_assessment(assessmentId);

        long newAssessmetVersionId = 0;
        if (objSite_assessment != null) {
            try {
                // BatchSessionUtil.setEnabled(true);
                long prevoiusVersionId = assessment_version_id;
                site_assessment_versions objSite_assessment_versions = site_assessment_versionsLocalServiceUtil
                        .getsite_assessment_versions(assessment_version_id);
                site_assessment_versions newSite_assessment_versions = new site_assessment_versionsClp();
                // site_assessment_versionsLocalServiceUtil.
                // createsite_assessment_versions(CounterLocalServiceUtil.increment(site_assessment_versions.class.getName()));

                newSite_assessment_versions = objSite_assessment_versions;
                newSite_assessment_versions
                        .setPrimaryKey(CounterLocalServiceUtil
                                .increment(site_assessment_versions.class
                                        .getName()));
                newSite_assessment_versions.setVersion_code(assessmentVerCode);
                newSite_assessment_versions.setStage_id(objSite_assessment
                        .getCurrent_stageid());
                newSite_assessment_versions.setStart_date(new Date());
                newSite_assessment_versions.setEnd_date(null);
                newSite_assessment_versions.setUserid(userId);
                newSite_assessment_versions.setAssessment_id(assessmentId);
				/*if (parent_assessment_versionid > 0) {
					newSite_assessment_versions
							.setParent_assessment_versionid(parent_assessment_versionid);
					newSite_assessment_versions.setIs_translated(true);
				}*/

                site_assessment_versions tempSite_assessment_versions = site_assessment_versionsLocalServiceUtil
                        .addsite_assessment_versions(newSite_assessment_versions);

                newAssessmetVersionId = tempSite_assessment_versions
                        .getAssessment_version_id();

                // setting end date
                objSite_assessment_versions.setEnd_date(new Date());
                site_assessment_versionsLocalServiceUtil
                        .addsite_assessment_versions(objSite_assessment_versions);

                if (newAssessmetVersionId > 0) {
                    // step1
                    List<assessment_whvalues> lstwhValues = site_assessmentLocalServiceUtil
                            .getAssessment_whvaluesByVersion(prevoiusVersionId);

                    // for step4
                    List<current_state_trend> lstcurrent_state_trend = site_assessmentLocalServiceUtil
                            .getCurrent_state_trendByVersion(prevoiusVersionId);

                    if (lstwhValues != null) {
                        for (assessment_whvalues objwhValues : lstwhValues) {
                            long whValueId = objwhValues.getWhvalues_id();
                            assessment_whvalues newassessment_whvalues = objwhValues;
                            newassessment_whvalues
                                    .setAssessment_version_id(newAssessmetVersionId);
                            newassessment_whvalues
                                    .setWhvalues_id(CounterLocalServiceUtil
                                            .increment(assessment_whvalues.class
                                                    .getName()));
                            assessment_whvalues neassessment_whvalues = assessment_whvaluesLocalServiceUtil
                                    .addassessment_whvalues(newassessment_whvalues);

                            List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = null;
                            lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil
                                    .getAssessment_whvalues_whcriterionsBywhValue(whValueId);

                            // adding critria
                            if (lstwhvalues_whcriterion != null
                                    && lstwhvalues_whcriterion.size() > 0) {
                                for (assessment_whvalues_whcriterion objassessment_whvalues_whcriterion : lstwhvalues_whcriterion) {
                                    assessment_whvalues_whcriterion newwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil
                                            .createassessment_whvalues_whcriterion(CounterLocalServiceUtil
                                                    .increment(assessment_whvalues_whcriterion.class
                                                            .getName()));
                                    newwhvalues_whcriterion
                                            .setWhvalues_id(neassessment_whvalues
                                                    .getWhvalues_id());
                                    newwhvalues_whcriterion
                                            .setCriterion(objassessment_whvalues_whcriterion
                                                    .getCriterion());
                                    assessment_whvalues_whcriterionLocalServiceUtil
                                            .addassessment_whvalues_whcriterion(newwhvalues_whcriterion);
                                }
                            }

                            // for step 4
                            long newVnId = neassessment_whvalues
                                    .getWhvalues_id();
                            if (lstcurrent_state_trend != null) {
                                for (current_state_trend obj : lstcurrent_state_trend) {
                                    if (obj.getVn() == whValueId) {
                                        current_state_trend newObj = obj;
                                        newObj.setAssessment_version_id(newAssessmetVersionId);
                                        newObj.setVn(newVnId);
                                        newObj.setPrimaryKey(CounterLocalServiceUtil
                                                .increment(current_state_trend.class
                                                        .getName()));
                                        current_state_trendLocalServiceUtil
                                                .addcurrent_state_trend(newObj);
                                    }

                                }
                            }
                            // -----------------

							/*
							 * objcurrent_state_trend.setVn(objassessment_whvalues
							 * .getWhvalues_id());
							 * objcurrent_state_trend.setAssessment_version_id
							 * (assessmentVersionId);
							 * current_state_trendLocalServiceUtil
							 * .addcurrent_state_trend(objcurrent_state_trend);
							 */
                        }
                    }

                    List<biodiversity_values> lstbioValues = site_assessmentLocalServiceUtil
                            .getBiodiversityValuesByVersion(prevoiusVersionId);

                    if (lstbioValues != null) {
                        for (biodiversity_values objbiodiversity_values : lstbioValues) {
                            biodiversity_values newbiodiversity_values = objbiodiversity_values;
                            newbiodiversity_values
                                    .setAssessment_version_id(newAssessmetVersionId);
                            newbiodiversity_values
                                    .setId(CounterLocalServiceUtil
                                            .increment(biodiversity_values.class
                                                    .getName()));
                            biodiversity_valuesLocalServiceUtil
                                    .addbiodiversity_values(newbiodiversity_values);
                        }
                    }

                    // step 4 ctatv

                    List<state_trend_whvalues> lststate_trendWH = site_assessmentLocalServiceUtil
                            .getState_trend_whvaluesByVersion(prevoiusVersionId);


                    //sorting list


                    Collections.sort(lststate_trendWH, new Comparator<state_trend_whvalues>() {
                        public int compare(state_trend_whvalues one, state_trend_whvalues other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lststate_trendWH);


                    List<state_trend_biodivvals> lstBiodivvals = site_assessmentLocalServiceUtil
                            .getStatetrendbiodivvalsByVersion(prevoiusVersionId);


                    //sorting list


                    Collections.sort(lstBiodivvals, new Comparator<state_trend_biodivvals>() {
                        public int compare(state_trend_biodivvals one, state_trend_biodivvals other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstBiodivvals);


                    if (lststate_trendWH != null) {
                        for (state_trend_whvalues obj : lststate_trendWH) {
                            state_trend_whvalues newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(state_trend_whvalues.class
                                            .getName()));
                            state_trend_whvaluesLocalServiceUtil
                                    .addstate_trend_whvalues(newObj);
                        }
                    }
                    if (lstBiodivvals != null) {
                        for (state_trend_biodivvals obj : lstBiodivvals) {
                            state_trend_biodivvals newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(state_trend_biodivvals.class
                                            .getName()));
                            state_trend_biodivvalsLocalServiceUtil
                                    .addstate_trend_biodivvals(newObj);
                        }
                    }

                    // step 2

                    List<assessing_threats_current> lstthreats_current = site_assessmentLocalServiceUtil
                            .getAssessingThreatsCurrentByVersion(prevoiusVersionId);

                    if (lstthreats_current != null) {
                        for (assessing_threats_current obj : lstthreats_current) {
                            long current_id = obj.getCurrent_threat_id();

                            assessing_threats_current newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(assessing_threats_current.class
                                            .getName()));
                            assessing_threats_current addedObj = assessing_threats_currentLocalServiceUtil
                                    .addassessing_threats_current(newObj);

                            long newThreatId = addedObj.getCurrent_threat_id();
                            if (addedObj != null) {
                                List<current_threat_assessment_cat> listcurrent_threat_assessment_cat = site_assessmentLocalServiceUtil
                                        .getCurrentThreatAssessmentCatByThreatId(current_id);

                                for (current_threat_assessment_cat objcurrent_threat_assessment_cat : listcurrent_threat_assessment_cat) {
                                    objcurrent_threat_assessment_cat
                                            .setPrimaryKey(CounterLocalServiceUtil
                                                    .increment(current_threat_assessment_cat.class
                                                            .getName()));
                                    objcurrent_threat_assessment_cat
                                            .setCurrent_threat_id(newThreatId);
                                    current_threat_assessment_catLocalServiceUtil
                                            .addcurrent_threat_assessment_cat(objcurrent_threat_assessment_cat);

                                }

                                List<current_threat_values> listcurrent_threat_values = site_assessmentLocalServiceUtil
                                        .getCurrentlThreatValuesByThreatId(current_id);
                                for (current_threat_values objcurrent_threat_values : listcurrent_threat_values) {
                                    objcurrent_threat_values
                                            .setPrimaryKey(CounterLocalServiceUtil
                                                    .increment(current_threat_values.class
                                                            .getName()));
                                    objcurrent_threat_values
                                            .setCurrent_threat_id(newThreatId);
                                    // objcurrent_threat_values.s
                                    current_threat_valuesLocalServiceUtil
                                            .addcurrent_threat_values(objcurrent_threat_values);

                                }

                            }
                        }
                    }

                    // ------------------Step 2 Potential
                    // Threat------------------

                    List<assessing_threats_potential> lstthreats_potential = site_assessmentLocalServiceUtil
                            .getAssessingThreatsPotentialByVersion(prevoiusVersionId);

                    //sorting list
                    Collections.sort(lstthreats_potential, new Comparator<assessing_threats_potential>() {
                        public int compare(assessing_threats_potential one, assessing_threats_potential other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstthreats_potential);


                    if (lstthreats_potential != null) {

                        for (assessing_threats_potential objthreat : lstthreats_potential) {
                            long oldThreat = objthreat.getPotential_threat_id();
                            assessing_threats_potential newObj = objthreat;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(assessing_threats_potential.class
                                            .getName()));
                            assessing_threats_potential addedObj = assessing_threats_potentialLocalServiceUtil
                                    .addassessing_threats_potential(newObj);

                            long potentialThreatId = addedObj
                                    .getPotential_threat_id();
                            List<potential_threat_assessment_cat> lstthreat_assessment_cat = site_assessmentLocalServiceUtil
                                    .getPotentialThreatAssessmentCatByThreatId(oldThreat);

                            // sorting list

                            Collections.sort(lstthreat_assessment_cat, new Comparator<potential_threat_assessment_cat>() {
                                public int compare(potential_threat_assessment_cat one, potential_threat_assessment_cat other) {
                                    return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                                }
                            });

                            Collections.reverse(lstthreat_assessment_cat);


                            for (potential_threat_assessment_cat objpotential_threat_assessment_cat : lstthreat_assessment_cat) {
                                objpotential_threat_assessment_cat
                                        .setPot_threat_cat_id(CounterLocalServiceUtil
                                                .increment(potential_threat_assessment_cat.class
                                                        .getName()));
                                objpotential_threat_assessment_cat
                                        .setPotential_threat_id(potentialThreatId);
                                potential_threat_assessment_catLocalServiceUtil
                                        .addpotential_threat_assessment_cat(objpotential_threat_assessment_cat);

                            }

                            List<potential_threat_values> lstthreat_values = site_assessmentLocalServiceUtil
                                    .getPotentialThreatValuesByThreatId(oldThreat);


                            // sorting list


                            Collections.sort(lstthreat_values, new Comparator<potential_threat_values>() {
                                public int compare(potential_threat_values one, potential_threat_values other) {
                                    return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                                }
                            });

                            Collections.reverse(lstthreat_values);


                            for (potential_threat_values objpotential_threat_values : lstthreat_values) {
                                objpotential_threat_values
                                        .setPotential_threat_values_id(CounterLocalServiceUtil
                                                .increment(potential_threat_values.class
                                                        .getName()));
                                objpotential_threat_values
                                        .setPotential_threat_id(potentialThreatId);
                                // objpotential_threat_values.setWhvalues_id(whVal);
                                potential_threat_valuesLocalServiceUtil
                                        .addpotential_threat_values(objpotential_threat_values);

                            }

                        }
                    }

                    // -------------------------------------------------------------

                    // ------Step2 -Threat Summary

                    List<threat_summary_current> lstthreat_summary_currentt = null;
                    List<threat_summary_potential> lstthreat_summary_potential = null;
                    List<threat_summary_overall> lstthreat_summary_overall = null;

                    lstthreat_summary_currentt = site_assessmentLocalServiceUtil
                            .getThreatSummaryCurrentByVersion(prevoiusVersionId);

                    // sorting list

                    Collections.sort(lstthreat_summary_currentt, new Comparator<threat_summary_current>() {
                        public int compare(threat_summary_current one, threat_summary_current other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstthreat_summary_currentt);

                    lstthreat_summary_potential = site_assessmentLocalServiceUtil
                            .getThreatSummaryPotentialByVersion(prevoiusVersionId);


                    // sorting list

                    Collections.sort(lstthreat_summary_potential, new Comparator<threat_summary_potential>() {
                        public int compare(threat_summary_potential one, threat_summary_potential other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstthreat_summary_potential);


                    lstthreat_summary_overall = site_assessmentLocalServiceUtil
                            .getThreatSummaryOverallByVersion(prevoiusVersionId);


                    // sorting List

                    Collections.sort(lstthreat_summary_overall, new Comparator<threat_summary_overall>() {
                        public int compare(threat_summary_overall one, threat_summary_overall other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstthreat_summary_overall);


                    if (lstthreat_summary_currentt != null) {

                        for (threat_summary_current obj : lstthreat_summary_currentt) {
                            threat_summary_current newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(threat_summary_current.class
                                            .getName()));
                            threat_summary_currentLocalServiceUtil
                                    .addthreat_summary_current(newObj);
                        }

                    }
                    if (lstthreat_summary_potential != null) {
                        for (threat_summary_potential obj : lstthreat_summary_potential) {
                            threat_summary_potential newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(threat_summary_potential.class
                                            .getName()));
                            threat_summary_potentialLocalServiceUtil
                                    .addthreat_summary_potential(newObj);
                        }
                    }
                    if (lstthreat_summary_overall != null) {
                        for (threat_summary_overall obj : lstthreat_summary_overall) {
                            threat_summary_overall newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(threat_summary_overall.class
                                            .getName()));
                            threat_summary_overallLocalServiceUtil
                                    .addthreat_summary_overall(newObj);
                        }
                    }

                    // step 3
                    List<protection_management> listprotection_management = protection_managementLocalServiceUtil
                            .findByAssessementVersionId(prevoiusVersionId);

                    List<protection_mgmt_checklist_lkp> mgmt_checklist_lkps = protection_mgmt_checklist_lkpLocalServiceUtil.findAll();

                    if (listprotection_management != null) {

                        for (protection_mgmt_checklist_lkp lkp : mgmt_checklist_lkps) {
                            boolean containsCheck = false;
                            protection_management newprotection_management = null;
                            protection_management temp = null;
                            for (protection_management objprotection_management : listprotection_management) {
                                if (objprotection_management.getTopic_id() == lkp.getTopic_id()) {
                                    containsCheck = true;
                                    temp = objprotection_management;
                                    break;
                                }
                            }
                            if (containsCheck) {
                                newprotection_management = temp;
                                newprotection_management
                                        .setPrimaryKey(CounterLocalServiceUtil
                                                .increment(protection_management.class
                                                        .getName()));
                            } else {
                                newprotection_management = protection_managementLocalServiceUtil
                                        .createprotection_management(CounterLocalServiceUtil.increment(protection_management.class.getName()));
                                newprotection_management.setTopic_id(lkp.getTopic_id());
                            }
                            newprotection_management
                                    .setAssessment_version_id(newAssessmetVersionId);

                            protection_managementLocalServiceUtil
                                    .addprotection_management(newprotection_management);
                        }

                    }
                    // step 3_out
                    long assessmentVersionId = prevoiusVersionId;
                    List<effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatsList = effective_prot_mgmt_iothreatsLocalServiceUtil
                            .geteffectivemanagthreatByVersion(assessmentVersionId);

                    // sorting list

                    Collections.sort(effective_prot_mgmt_iothreatsList, new Comparator<effective_prot_mgmt_iothreats>() {
                        public int compare(effective_prot_mgmt_iothreats one, effective_prot_mgmt_iothreats other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(effective_prot_mgmt_iothreatsList);


                    List<prot_mgmt_overall> prot_overallList = prot_mgmt_overallLocalServiceUtil
                            .getprotmgmtoverallByVersion(assessmentVersionId);


                    //sorting list

                    Collections.sort(prot_overallList, new Comparator<prot_mgmt_overall>() {
                        public int compare(prot_mgmt_overall one, prot_mgmt_overall other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(prot_overallList);


                    List<prot_mgmt_best_practices> prot_best_practicelList = prot_mgmt_best_practicesLocalServiceUtil
                            .getBestpractEntriesByAssessmentId(assessmentVersionId);

                    //sorting list

                    Collections.sort(prot_best_practicelList, new Comparator<prot_mgmt_best_practices>() {
                        public int compare(prot_mgmt_best_practices one, prot_mgmt_best_practices other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(prot_best_practicelList);


                    if (effective_prot_mgmt_iothreatsList != null) {
                        for (effective_prot_mgmt_iothreats objeffective_prot_mgmt_iothreatsList : effective_prot_mgmt_iothreatsList) {
                            effective_prot_mgmt_iothreats neweffective_prot_mgmt_iothreats = objeffective_prot_mgmt_iothreatsList;
                            neweffective_prot_mgmt_iothreats
                                    .setAssessment_version_id(newAssessmetVersionId);
                            neweffective_prot_mgmt_iothreats
                                    .setPrimaryKey(CounterLocalServiceUtil
                                            .increment(effective_prot_mgmt_iothreats.class
                                                    .getName()));
                            effective_prot_mgmt_iothreatsLocalServiceUtil
                                    .addeffective_prot_mgmt_iothreats(neweffective_prot_mgmt_iothreats);
                        }
                    }

                    if (prot_overallList != null) {
                        for (prot_mgmt_overall objprot_overall : prot_overallList) {
                            prot_mgmt_overall newprot_overall = objprot_overall;
                            newprot_overall
                                    .setAssessment_version_id(newAssessmetVersionId);
                            newprot_overall
                                    .setPrimaryKey(CounterLocalServiceUtil
                                            .increment(prot_mgmt_overall.class
                                                    .getName()));
                            prot_mgmt_overallLocalServiceUtil
                                    .addprot_mgmt_overall(newprot_overall);
                        }
                    }

                    if (prot_best_practicelList != null) {
                        for (prot_mgmt_best_practices obj : prot_best_practicelList) {
                            prot_mgmt_best_practices newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(prot_mgmt_best_practices.class
                                            .getName()));
                            prot_mgmt_best_practicesLocalServiceUtil
                                    .addprot_mgmt_best_practices(newObj);
                        }
                    }


                    // step5
                    List<conservation_outlook> lstconservation_out = conservation_outlookLocalServiceUtil
                            .getconservationOutllokByVersion(assessmentVersionId);


                    // sorting list

                    Collections.sort(lstconservation_out, new Comparator<conservation_outlook>() {
                        public int compare(conservation_outlook one, conservation_outlook other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });
                    Collections.reverse(lstconservation_out);

                    if (lstconservation_out != null) {
                        for (conservation_outlook obj : lstconservation_out) {
                            conservation_outlook newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(conservation_outlook.class
                                            .getName()));
                            conservation_outlookLocalServiceUtil
                                    .addconservation_outlook(newObj);
                        }
                    }

                    // step6
                    List<key_conservation_issues> lstKey_conservationIssues = key_conservation_issuesLocalServiceUtil
                            .getkey_conversionissueByVersion(assessmentVersionId);


                    //sorting list

                    Collections.sort(lstKey_conservationIssues, new Comparator<key_conservation_issues>() {
                        public int compare(key_conservation_issues one, key_conservation_issues other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstKey_conservationIssues);

                    if (lstKey_conservationIssues != null) {
                        for (key_conservation_issues obj : lstKey_conservationIssues) {
                            key_conservation_issues newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(key_conservation_issues.class
                                            .getName()));
                            key_conservation_issuesLocalServiceUtil
                                    .addkey_conservation_issues(newObj);
                        }
                    }

                    // step7
                    List<benefits> lstbenefit = benefitsLocalServiceUtil
                            .getbenefitByVersion(assessmentVersionId);


                    //sorting list

                    Collections.sort(lstbenefit, new Comparator<benefits>() {
                        public int compare(benefits one, benefits other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstbenefit);

                    for (benefits obj : lstbenefit) {
                        long oldBenefitId = obj.getBenefits_id();
                        benefits newObj = obj;
                        newObj.setAssessment_version_id(newAssessmetVersionId);
                        newObj.setPrimaryKey(CounterLocalServiceUtil
                                .increment(benefits.class.getName()));
                        benefits newbenefits = benefitsLocalServiceUtil
                                .addbenefits(newObj);
                        // getting subtype list
                        List<benefits_type_ref> lstbenefits_type_ref = benefits_type_refLocalServiceUtil
                                .findByBenefitsId(oldBenefitId);


                        //sorting list

                        Collections.sort(lstbenefits_type_ref, new Comparator<benefits_type_ref>() {
                            public int compare(benefits_type_ref one, benefits_type_ref other) {
                                return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                            }
                        });

                        Collections.reverse(lstbenefits_type_ref);


                        if (lstbenefits_type_ref != null) {
                            for (benefits_type_ref objbenefits_type_ref : lstbenefits_type_ref) {
                                benefits_type_ref newbenefits_type_ref = objbenefits_type_ref;
                                newbenefits_type_ref.setBenefits_id(newbenefits
                                        .getBenefits_id());
                                newbenefits_type_ref
                                        .setPrimaryKey(CounterLocalServiceUtil
                                                .increment(benefits_type_ref.class
                                                        .getName()));
                                benefits_type_refLocalServiceUtil
                                        .addbenefits_type_ref(newbenefits_type_ref);
                            }
                        }
                    }


                    // step 7 benefit summary  added by kamal

                    List<benefits_summary> lstbenefitsumm = benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(assessment_version_id);


                    if (lstbenefitsumm != null && !lstbenefitsumm.isEmpty()) {
                        for (benefits_summary obj : lstbenefitsumm) {
                            benefits_summary newobj = obj;
                            newobj.setAssessment_version_id(newAssessmetVersionId);
                            newobj.setPrimaryKey(CounterLocalServiceUtil.increment(benefits_summary.class.getName()));
                            benefits_summaryLocalServiceUtil.addbenefits_summary(newobj);
                        }
                    }

                    // step 8
                    List<active_conservation_projects> lstactive_projects = active_conservation_projectsLocalServiceUtil
                            .getactive_conservation_projectsByVersion(assessmentVersionId);

                    // sorting list

                    Collections.sort(lstactive_projects, new Comparator<active_conservation_projects>() {
                        public int compare(active_conservation_projects one, active_conservation_projects other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstactive_projects);

                    if (lstactive_projects != null) {
                        for (active_conservation_projects obj : lstactive_projects) {
                            active_conservation_projects newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(active_conservation_projects.class
                                            .getName()));
                            active_conservation_projectsLocalServiceUtil
                                    .addactive_conservation_projects(newObj);
                        }
                    }

                    List<potential_project_needs> lstpotential_project = potential_project_needsLocalServiceUtil
                            .getpotential_projectsByVersion(assessmentVersionId);

                    //sorting list

                    Collections.sort(lstpotential_project, new Comparator<potential_project_needs>() {
                        public int compare(potential_project_needs one, potential_project_needs other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(lstactive_projects);


                    if (lstpotential_project != null) {
                        for (potential_project_needs obj : lstpotential_project) {
                            potential_project_needs newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(potential_project_needs.class
                                            .getName()));
                            potential_project_needsLocalServiceUtil
                                    .addpotential_project_needs(newObj);
                        }
                    }

                    // step9
                    List<references> whpreferences = referencesLocalServiceUtil
                            .findByAssessmentId(assessmentVersionId);


                    // sorting list

                    Collections.sort(whpreferences, new Comparator<references>() {
                        public int compare(references one, references other) {
                            return String.valueOf(other.getPrimaryKey()).compareTo(String.valueOf(one.getPrimaryKey()));
                        }
                    });

                    Collections.reverse(whpreferences);

                    if (whpreferences != null) {
                        for (references obj : whpreferences) {
                            references newObj = obj;
                            newObj.setAssessment_version_id(newAssessmetVersionId);
                            newObj.setPrimaryKey(CounterLocalServiceUtil
                                    .increment(references.class.getName()));
                            referencesLocalServiceUtil.addreferences(newObj);
                        }
                    }

                }
            } catch (Exception ex) {
                // ex.printStackTrace();
                System.out.println(ex.getMessage());
            } finally {
                // BatchSessionUtil.setEnabled(false);
            }

        }
        return newAssessmetVersionId;

    }

    private static long createAndFill(Long assessmentId, Long pversionId, Long userID) throws Exception {

        float currAssessmentCode = (float) AssessmentActionUtil.getCurrentVersionCodeByAssessmentId(assessmentId);

        double newVersionCode = new Double(Float.toString(currAssessmentCode + 0.1F));

        return createNewAssessmentVersion(assessmentId, pversionId, userID, newVersionCode, 0);
    }

}
