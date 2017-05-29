package com.iucn.whp.portlet.portlet;

import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.iucn.whp.portlet.dto.SiteAssessmentDTO;
import com.iucn.whp.portlet.dto.ThreatsRating;
import com.iucn.whp.portlet.dto.step.assessingvalues.AssessingValueDTOTrend;
import com.iucn.whp.portlet.dto.step.assessingvalues.AssessingValuesDTO;
import com.iucn.whp.portlet.dto.step.assessingvalues.AssessingValuesDTOStateTrend;
import com.iucn.whp.portlet.dto.step.assessingvalues.AssessingValuesDTOStateTrendBio;
import com.iucn.whp.portlet.dto.step.benefits.BenefitsDTO;
import com.iucn.whp.portlet.dto.step.benefits.BenefitsSummaryDTO;
import com.iucn.whp.portlet.dto.step.benefits.UnderstandBenefitsDTO;
import com.iucn.whp.portlet.dto.step.conservation.AssessmentOfConservationOutlookDTO;
import com.iucn.whp.portlet.dto.step.conservation.ConservationOutlookDTO;
import com.iucn.whp.portlet.dto.step.conservation.SummaryOfAssessmentsDTO;
import com.iucn.whp.portlet.dto.step.projects.ConservationProjectDTO;
import com.iucn.whp.portlet.dto.step.projects.PotentialProjectsNeedsDTO;
import com.iucn.whp.portlet.dto.step.projects.ProjectsDTO;
import com.iucn.whp.portlet.dto.step.protectionmanagement.ProtectionManagementDTO;
import com.iucn.whp.portlet.dto.step.protectionmanagement.ProtectionManagementDTOImpl;
import com.iucn.whp.portlet.dto.step.references.ReferenceValueDTO;
import com.iucn.whp.portlet.dto.step.references.ReferencesDTO;
import com.iucn.whp.portlet.dto.step.threats.*;
import com.iucn.whp.portlet.dto.step.values.BiodiversityValuesDTO;
import com.iucn.whp.portlet.dto.step.values.ValuesDTO;
import com.iucn.whp.portlet.dto.step.values.WhValuesDTO;
import com.iucn.whp.portlet.util.PortalUtils;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.apache.commons.lang.StringUtils;

import javax.portlet.*;
import java.io.IOException;
import java.util.*;

public class SitesAssessmentVersionsEditorPortlet extends MVCPortlet {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        Long siteId = ParamUtil.getLong(renderRequest, "siteId");

        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        Long userId = themeDisplay.getUserId();

        List<SiteAssessmentDTO> siteAssessmentDTOList = new ArrayList<>();

        String siteName = "";

        String roleName = "";
        try {

            SiteAssessmentDTO siteAssessmentDTO = null;

            whp_sites site = whp_sitesLocalServiceUtil.fetchwhp_sites(siteId);
            siteName = site.getName_en();

            List<site_assessment> siteAssessments = site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(siteId);

            for (site_assessment assessment : siteAssessments) {
                List<site_assessment_versions> site_assessment_versions = site_assessment_versionsLocalServiceUtil
                        .findByAssessmentId(assessment.getAssessment_id());

                for (site_assessment_versions version : site_assessment_versions) {
                    siteAssessmentDTO = new SiteAssessmentDTO();

                    User user = UserLocalServiceUtil.fetchUser(version.getUserid());
                    roleName = PortalUtils.getUserRoleName(user);

                    siteAssessmentDTO.setSiteId(siteId);
                    siteAssessmentDTO.setAssessmentId(assessment.getAssessment_id());
                    siteAssessmentDTO.setVersionId(version.getAssessment_version_id());

                    /*step 1*/
                    siteAssessmentDTO.setValuesDTO(populateValuesTab(version, user.getUserId(),
                            user.getFullName(), roleName));
                    /*step2*/
                    siteAssessmentDTO.setThreatsDTO(populateThreatsTab(version, user.getUserId(), user.getFullName(),
                            roleName));
                    /*step 3*/
                    siteAssessmentDTO.setProtectionManagementDTO(populateProtectionAndManagement(version,
                            user.getUserId(), roleName));
                    /*step 4*/
                    siteAssessmentDTO.setAssessingValuesDTO(populateAssessingValues(version, userId, roleName));
                    /*step 5*/
                    siteAssessmentDTO.setConservationOutlookDTO(populateConservationOutlookTab(version, user.getUserId(),
                            user.getFullName(), roleName));
                    /*step 6*/
                    siteAssessmentDTO.setBenefitsDTO(populateBenefitsTab(version, user.getUserId(), user.getFullName(),
                            roleName));
                    /*step 7*/
                    siteAssessmentDTO.setProjectsDTO(populateProjectsTab(version, user.getUserId(), user.getFullName(),
                            roleName));
                    /*step8*/
                    siteAssessmentDTO.setReferencesDTO(populateReferencesTab(version, user.getUserId(),
                            user.getFullName(), roleName));

                    siteAssessmentDTO.setStatus(assessment.getStatus_id());
                    siteAssessmentDTO.setStage(assessment.getCurrent_stageid());

                    siteAssessmentDTOList.add(siteAssessmentDTO);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Role roleCoordinator = null;
        Role roleAdmin = null;
        boolean hasCoordinatorRole = false;
        boolean hasAdminRole = false;
        try {
            roleCoordinator = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), "Coordinator");
            roleAdmin = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), "Administrator");
            hasCoordinatorRole = RoleLocalServiceUtil.hasUserRole(themeDisplay.getUserId(), roleCoordinator.getRoleId());
            hasAdminRole = RoleLocalServiceUtil.hasUserRole(themeDisplay.getUserId(), roleAdmin.getRoleId());
        } catch (Exception e) {
            System.out.println("Error getting role" + e.getStackTrace());
        }

        renderRequest.setAttribute("assessments", siteAssessmentDTOList);
        renderRequest.setAttribute("hasCoordinatorRole", hasCoordinatorRole);
        renderRequest.setAttribute("hasAdminRole", hasAdminRole);
        renderRequest.setAttribute("siteName", siteName);
        renderRequest.setAttribute("siteId", siteId);

        super.doView(renderRequest, renderResponse);
    }

    /* STEP 1 */
    private ValuesDTO populateValuesTab(site_assessment_versions version, Long userId, String fullName, String roleName) {
        ValuesDTO valuesDTO = new ValuesDTO();
        try {
            List<assessment_whvalues> whValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(version.getAssessment_version_id());

            WhValuesDTO whValuesDTO = null;

            // Get all values of World Heritage site
            List<assessment_whvalues_whcriterion> whValuesCriterion = new ArrayList<>();
            List<WhValuesDTO> whValuesDTOList = new ArrayList<>();
            List<String> criterias = new ArrayList<>();

            for (assessment_whvalues whValue : whValues) {
                whValuesCriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(whValue.getWhvalues_id());

                for (assessment_whvalues_whcriterion criterion : whValuesCriterion) {
                    inscription_criteria_lkp inscriptionCriteria = inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp((int) criterion.getCriterion());
                    criterias.add(inscriptionCriteria.getCriteria());
                }

                Collections.sort(criterias);

                whValuesDTO = new WhValuesDTO();
                whValuesDTO.setValueId(whValue.getWhvalues_id());
                whValuesDTO.setValues(whValue.getValues());
                whValuesDTO.setDescription(whValue.getDescription());
                whValuesDTO.setWhCriteria(StringUtils.join(criterias, ","));

                whValuesDTOList.add(whValuesDTO);
            }

            // Get all other important biodiversity values

            List<biodiversity_values> biodiversityValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(version.getAssessment_version_id());
            List<BiodiversityValuesDTO> biodiversityValuesDTOList = new ArrayList<>();
            BiodiversityValuesDTO biodiversityValuesDTO = null;

            for (biodiversity_values biodiversityValue : biodiversityValues) {
                biodiversityValuesDTO = new BiodiversityValuesDTO();
                biodiversityValuesDTO.setBiodiversityValueId(biodiversityValue.getId());
                biodiversityValuesDTO.setValues(biodiversityValue.getValue());
                biodiversityValuesDTO.setDescription(biodiversityValue.getDescription());

                biodiversityValuesDTOList.add(biodiversityValuesDTO);
            }

            valuesDTO.setAssessmentVersionId(version.getAssessment_version_id());
            valuesDTO.setUserId(userId);
            valuesDTO.setUserFullName(fullName);
            valuesDTO.setRoleName(roleName);
            valuesDTO.setVersion(String.valueOf(version.getVersion_code()));
            valuesDTO.setWhValuesDTOList(whValuesDTOList);
            valuesDTO.setBiodiversityValuesDTOList(biodiversityValuesDTOList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return valuesDTO;
    }

    /* STEP 2 */
    private ThreatsDTO populateThreatsTab(site_assessment_versions version, Long userId, String fullName, String roleName)
            throws SystemException, PortalException {
        ThreatsDTO threatsDTO = new ThreatsDTO();

        CurrentThreatsDTO currentThreatsDTO = null;
        PotentialThreatsDTO potentialThreatsDTO = null;
        OverallAssessmentOfThreatsDTO overallAssessmentOfThreatsDTO = null;

        List<CurrentThreatsDTO> currentThreatsDTOList = new ArrayList<>();
        List<PotentialThreatsDTO> potentialThreatsDTOList = new ArrayList<>();
        List<OverallAssessmentOfThreatsDTO> overallAssessmentOfThreatsDTOList = new ArrayList<>();

        ThreatsRating threatRating = null;
        String ratingName = "";
        String valuesAffected = "";

        List<CategoryDTO> categories = new ArrayList<>();

        // Get all current threats
        List<assessing_threats_current> currentThreats = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(version.getAssessment_version_id());
        Collections.sort(currentThreats);
        for (assessing_threats_current current : currentThreats) {
            currentThreatsDTO = new CurrentThreatsDTO();

            ratingName = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(current.getThreat_rating_id()).getRating();
            threatRating = new ThreatsRating();
            threatRating.setCssClass(current.getThreat_rating_id());
            threatRating.setRating(current.getThreat_rating_id());
            threatRating.setThreatRatingName(ratingName);

            valuesAffected = getCurrentThreatValuesAffected(current.getCurrent_threat_id());

            categories = getCurrentThreatCategories(current);

            currentThreatsDTO.setCurrentThreatId(current.getCurrent_threat_id());
            currentThreatsDTO.setCurrentThreatName(current.getCurrent_threat());
            currentThreatsDTO.setJustification(current.getJustification());
            currentThreatsDTO.setThreatExtentValue(current.getThreadExtentValue());
            currentThreatsDTO.setThreatRating(threatRating);
            currentThreatsDTO.setInsideSite(current.getInside_site());
            currentThreatsDTO.setOutsideSite(current.getOutside_site());
            currentThreatsDTO.setValuesAffected(valuesAffected);
            currentThreatsDTO.setCategoryDTOList(categories);

            currentThreatsDTOList.add(currentThreatsDTO);
        }

        // Get all potential threats
        List<assessing_threats_potential> potentialThreats = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(version.getAssessment_version_id());
        Collections.sort(potentialThreats);
        for (assessing_threats_potential potentialThreat : potentialThreats) {
            potentialThreatsDTO = new PotentialThreatsDTO();

            ratingName = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(potentialThreat.getThreat_rating()).getRating();
            threatRating = new ThreatsRating();
            threatRating.setCssClass(potentialThreat.getThreat_rating());
            threatRating.setRating(potentialThreat.getThreat_rating());
            threatRating.setThreatRatingName(ratingName);

            valuesAffected = getPotentialThreatValuesAffected(potentialThreat.getPotential_threat_id());

            categories = getPotentialThreatCategories(potentialThreat);

            potentialThreatsDTO.setPotentialThreatId(potentialThreat.getPotential_threat_id());
            potentialThreatsDTO.setPotentialThreatName(potentialThreat.getPotential_threat());
            potentialThreatsDTO.setJustification(potentialThreat.getJustification());
            potentialThreatsDTO.setThreatExtentValue(potentialThreat.getThreadExtentValue());
            potentialThreatsDTO.setThreatRating(threatRating);
            potentialThreatsDTO.setInsideSite(potentialThreat.getInside_site());
            potentialThreatsDTO.setOutsideSite(potentialThreat.getOutside_site());
            potentialThreatsDTO.setValuesAffected(valuesAffected);
            potentialThreatsDTO.setCategoryDTOList(categories);

            potentialThreatsDTOList.add(potentialThreatsDTO);
        }


        // Get Overall Assessment of Threats
        List<threat_summary_current> currentThreatList = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(version.getAssessment_version_id());
        List<threat_summary_potential> potentialThreatList = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(version.getAssessment_version_id());
        List<threat_summary_overall> overallThreatList = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(version.getAssessment_version_id());

        overallAssessmentOfThreatsDTO = new OverallAssessmentOfThreatsDTO();

        threat_summary_current threatSummaryCurrent = currentThreatList.size() > 0 ? currentThreatList.get(0) : null;
        threat_summary_potential threatSummaryPotential = potentialThreatList.size() > 0 ? potentialThreatList.get(0) : null;
        threat_summary_overall threatSummaryOverall = overallThreatList.size() > 0 ? overallThreatList.get(0) : null;

        if (threatSummaryCurrent != null && threatSummaryCurrent.getThreat_rating() > 0) {
            ratingName = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatSummaryCurrent.getThreat_rating()).getRating();

            ThreatsRating currentThreatRating = new ThreatsRating();
            currentThreatRating.setRating(threatSummaryCurrent.getThreat_rating());
            currentThreatRating.setThreatRatingName(ratingName);
            currentThreatRating.setCssClass(threatSummaryCurrent.getThreat_rating());

            overallAssessmentOfThreatsDTO.setCurrentRating(currentThreatRating);
            overallAssessmentOfThreatsDTO.setThreatSumCurrentId(threatSummaryCurrent.getThreat_sum_cur_id());
            overallAssessmentOfThreatsDTO.setOverallCurrent(threatSummaryCurrent.getOverall_current());
        }

        if (threatSummaryPotential != null && threatSummaryPotential.getThreat_rating() > 0) {
            ratingName = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatSummaryPotential.getThreat_rating()).getRating();

            ThreatsRating potentialThreatRating = new ThreatsRating();
            potentialThreatRating.setRating(threatSummaryPotential.getThreat_rating());
            potentialThreatRating.setThreatRatingName(ratingName);
            potentialThreatRating.setCssClass(threatSummaryPotential.getThreat_rating());

            overallAssessmentOfThreatsDTO.setPotentialRating(potentialThreatRating);
            overallAssessmentOfThreatsDTO.setThreatSumPotentialId(threatSummaryPotential.getThreat_sum_potential_id());
            overallAssessmentOfThreatsDTO.setOverallPotential(threatSummaryPotential.getOverall_potential());
        }

        if (threatSummaryOverall != null && threatSummaryOverall.getThreat_rating() > 0) {
            ratingName = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatSummaryOverall.getThreat_rating()).getRating();

            ThreatsRating overallThreatRating = new ThreatsRating();
            overallThreatRating.setRating(threatSummaryOverall.getThreat_rating());
            overallThreatRating.setThreatRatingName(ratingName);
            overallThreatRating.setCssClass(threatSummaryOverall.getThreat_rating());

            overallAssessmentOfThreatsDTO.setThreatRating(overallThreatRating);
            overallAssessmentOfThreatsDTO.setThreatSumOverallId(threatSummaryOverall.getThreat_sum_overall_id());
            overallAssessmentOfThreatsDTO.setOverallThreat(threatSummaryOverall.getOverall_threat());
        }

        overallAssessmentOfThreatsDTOList.add(overallAssessmentOfThreatsDTO);

        threatsDTO.setAssessmentVersionId(version.getAssessment_version_id());
        threatsDTO.setUserId(userId);
        threatsDTO.setUserFullName(fullName);
        threatsDTO.setRoleName(roleName);
        threatsDTO.setVersion(String.valueOf(version.getVersion_code()));
//        Collections.reverse(currentThreatsDTOList);
        threatsDTO.setCurrentThreatsDTOList(currentThreatsDTOList);
//        Collections.reverse(potentialThreatsDTOList);
        threatsDTO.setPotentialThreatsDTOList(potentialThreatsDTOList);
        threatsDTO.setOverallAssessmentOfThreatsDTOList(overallAssessmentOfThreatsDTOList);

        return threatsDTO;
    }

    /**
     * STEP 3
     * Populate values for Protection and management tab.
     *
     * @return Protection and management population value.
     */
    private ProtectionManagementDTO populateProtectionAndManagement(site_assessment_versions version, Long userId,
                                                                    String roleName) throws SystemException, PortalException {

        ProtectionManagementDTO protectionManagementDTO = new ProtectionManagementDTO();

        List<effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatsList = effective_prot_mgmt_iothreatsLocalServiceUtil
                .geteffectivemanagthreatByVersion(version.getAssessment_version_id());
        if (effective_prot_mgmt_iothreatsList != null && effective_prot_mgmt_iothreatsList.size() > 0) {
            protectionManagementDTO.setEffective_prot_mgmt_iothreats(effective_prot_mgmt_iothreatsList.get(0));
        }

        List<prot_mgmt_overall> prot_overallList = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(version
                .getAssessment_version_id());

        if (prot_overallList != null && prot_overallList.size() > 0) {
            protectionManagementDTO.setProt_mgmt_overall(prot_overallList.get(0));
        }

        List<protection_management> protection_managements = protection_managementLocalServiceUtil
                .findByAssessementVersionId(version.getAssessment_version_id());

        /* 15 is static value for db. customer wanted ignore and hide him*/
        Collections.reverse(protection_managements);
        for (protection_management management : protection_managements) {
            if (management.getTopic_id() != 15) {

                ProtectionManagementDTOImpl managementDTOImpl = new ProtectionManagementDTOImpl();

                managementDTOImpl.setProtection_management(management);

                try {
                    managementDTOImpl.setProtection_management_ratings_lkpModel(protection_management_ratings_lkpLocalServiceUtil
                            .getprotection_management_ratings_lkp(management.getRating()));
                } catch (Exception e) {
                    e.printStackTrace();
                }


                try {
                    managementDTOImpl.setMgmt_checklist_lkp(protection_mgmt_checklist_lkpLocalServiceUtil
                            .getprotection_mgmt_checklist_lkp(management.getTopic_id()));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                protectionManagementDTO.add(managementDTOImpl);
            }
        }
        try {
            protectionManagementDTO.setProtMgmtBestPractices(prot_mgmt_best_practicesLocalServiceUtil
                    .getBestpractEntriesByAssessmentId(version.getAssessment_version_id()).get(0));
        } catch (Exception e) {
        }
        return protectionManagementDTO;
    }

    /**
     * STEP 4
     *
     * @param version  - version assessing
     * @param userId   - user id from version assessing
     * @param roleName - role user's
     * @return assessing values for view state_trend on page
     * @throws SystemException
     * @throws PortalException
     */
    private AssessingValuesDTO populateAssessingValues(site_assessment_versions version, Long userId,
                                                       String roleName) throws SystemException, PortalException {

        List<AssessingValueDTOTrend> isBioVal = new ArrayList<AssessingValueDTOTrend>();
        List<AssessingValueDTOTrend> noBioVal = new ArrayList<AssessingValueDTOTrend>();

        AssessingValuesDTO assessingValuesDTO = new AssessingValuesDTO();

        long versionId = version.getAssessment_version_id();

        List<current_state_trend> lstcurrent_state_trend = new ArrayList<>();
        List<state_trend_whvalues> lststate_trendWH = new ArrayList<>();
        List<state_trend_biodivvals> lstBiodivvals = new ArrayList<>();

        lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(versionId);
        lststate_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(versionId);

        AssessingValueDTOTrend assessmentTrends = null;
        int countBio = 0;
        int countNotBio = 0;
        for (current_state_trend aLstcurrent_state_trend : lstcurrent_state_trend) {
            try {
                if (!aLstcurrent_state_trend.getIs_biodiv_whval()) {
                    countNotBio++;
                    assessmentTrends = new AssessingValueDTOTrend();
                    assessmentTrends.setCurrentstatetrend(aLstcurrent_state_trend);
                    if (aLstcurrent_state_trend.getState_id() > 0 && aLstcurrent_state_trend.getTrend_id() > 0) {
                        assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(aLstcurrent_state_trend.getState_id()));
                        assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(aLstcurrent_state_trend.getTrend_id()));
                    }
                    long valueId = aLstcurrent_state_trend.getVn();
                    assessmentTrends.setWhvalue(assessment_whvaluesLocalServiceUtil.getassessment_whvalues(valueId).getValues());
                    assessmentTrends.setCount(countNotBio);
                    assessmentTrends.setIs_Biodiv_value(false);
                    noBioVal.add(assessmentTrends);
                } else {
                    countBio++;
                    assessmentTrends = new AssessingValueDTOTrend();
                    assessmentTrends.setCurrentstatetrend(aLstcurrent_state_trend);
                    if (aLstcurrent_state_trend.getState_id() > 0 && aLstcurrent_state_trend.getTrend_id() > 0) {
                        assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(aLstcurrent_state_trend.getState_id()));
                        assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(aLstcurrent_state_trend.getTrend_id()));
                    }
                    long valueId = aLstcurrent_state_trend.getVn();
                    assessmentTrends.setWhvalue(biodiversity_valuesLocalServiceUtil.getbiodiversity_values(valueId).getValue());
                    assessmentTrends.setCount(countBio);
                    assessmentTrends.setIs_Biodiv_value(true);
                    isBioVal.add(assessmentTrends);
                }
            } catch (Exception ex) {
            }
        }

        AssessingValuesDTOStateTrend valuesDTOStateTrend = new AssessingValuesDTOStateTrend();
        AssessingValuesDTOStateTrendBio assessingValuesDTOStateTrendBio = new AssessingValuesDTOStateTrendBio();

        try {
            state_trend_whvalues stateTrendWhvalues = lststate_trendWH == null || lststate_trendWH.isEmpty()
                    ? new state_trend_whvaluesClp()
                    : lststate_trendWH.get(0);

            valuesDTOStateTrend.setTrendWhValue(stateTrendWhvalues);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            valuesDTOStateTrend.setTrend_lkp(trend_lkpLocalServiceUtil.gettrend_lkp(valuesDTOStateTrend.getTrendWhValue()
                    .getTrend_id()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            List<state_trend_biodivvals> stateTrendBiodivValsByVersion = site_assessmentLocalServiceUtil
                    .getStatetrendbiodivvalsByVersion(versionId);

            state_trend_biodivvals trendBiodivvals = stateTrendBiodivValsByVersion == null || stateTrendBiodivValsByVersion.isEmpty()
                    ?  new state_trend_biodivvalsClp()
                    : stateTrendBiodivValsByVersion.get(0);

            assessingValuesDTOStateTrendBio.setState_trend_biodivvals(trendBiodivvals);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            assessingValuesDTOStateTrendBio.setTrend_lkp(trend_lkpLocalServiceUtil
                    .gettrend_lkp(assessingValuesDTOStateTrendBio.getState_trend_biodivvals().getTrend_id()));
        } catch (Exception e) {
        }

        assessingValuesDTO.setBioVal(isBioVal);
        assessingValuesDTO.setNotBioVal(noBioVal);
        assessingValuesDTO.setAssessingValuesDTOStateTrend(valuesDTOStateTrend);
        assessingValuesDTO.setAssessingValuesDTOStateTrendBio(assessingValuesDTOStateTrendBio);

        return assessingValuesDTO;
    }

    /* STEP 5 */
    private ConservationOutlookDTO populateConservationOutlookTab(site_assessment_versions version, Long userId, String fullName, String roleName) throws SystemException, PortalException {
        ConservationOutlookDTO conservationOutlookDTO = new ConservationOutlookDTO();

        // Get summary of assessments values, threats, protection and management
        SummaryOfAssessmentsDTO summaryOfAssessmentsDTO = new SummaryOfAssessmentsDTO();

        state_lkp state = null;
        threat_rating_lkp threatRatingLkp = null;
        protection_management_ratings_lkp protectionManagementRating = null;

        List<state_trend_whvalues> stateTrendWhValues = site_assessmentLocalServiceUtil
                .getState_trend_whvaluesByVersion(version.getAssessment_version_id());

        if (stateTrendWhValues != null && !stateTrendWhValues.isEmpty()) {
            long stateId = stateTrendWhValues.get(0).getState_id();

            if (stateId > 0) {
                state = state_lkpLocalServiceUtil.getstate_lkp(stateId);

                if (state != null) {
                    ThreatsRating currentStateTrendWhRating = new ThreatsRating();
                    currentStateTrendWhRating.setThreatRatingName(state.getState());
                    currentStateTrendWhRating.setRating(stateId);
                    currentStateTrendWhRating.setCssClass(stateId);

                    summaryOfAssessmentsDTO.setCurrentStateTrendWhId(stateTrendWhValues.get(0).getState_trend_whval_id());
                    summaryOfAssessmentsDTO.setCurrentStateTrendWhRating(currentStateTrendWhRating);
                    summaryOfAssessmentsDTO.setCurrentStateTrendWhJustification(stateTrendWhValues.get(0).getJustification());
                }
            }
        }

        List<state_trend_biodivvals> currentStateBioValues = site_assessmentLocalServiceUtil
                .getStatetrendbiodivvalsByVersion(version.getAssessment_version_id());

        if (currentStateBioValues != null && !currentStateBioValues.isEmpty()) {
            long stateId = currentStateBioValues.get(0).getState_id();

            if (stateId > 0) {
                state = state_lkpLocalServiceUtil.getstate_lkp(stateId);

                if (state != null) {
                    ThreatsRating currentStateTrendBioRating = new ThreatsRating();
                    currentStateTrendBioRating.setThreatRatingName(state.getState());
                    currentStateTrendBioRating.setRating(stateId);
                    currentStateTrendBioRating.setCssClass(stateId);

                    summaryOfAssessmentsDTO.setCurrentStateTrendBioId(currentStateBioValues.get(0).getState_trend_biodivvals_id());
                    summaryOfAssessmentsDTO.setCurrentStateTrendBioRating(currentStateTrendBioRating);
                    summaryOfAssessmentsDTO.setCurrentStateTrendBioJustification(currentStateBioValues.get(0).getJustification());
                }
            }
        }

        List<threat_summary_current> threatSummaryCurrentList = site_assessmentLocalServiceUtil
                .getThreatSummaryCurrentByVersion(version.getAssessment_version_id());

        if (threatSummaryCurrentList != null && !threatSummaryCurrentList.isEmpty()) {
            long threatRating = threatSummaryCurrentList.get(0).getThreat_rating();

            if (threatRating > 0) {
                threatRatingLkp = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatRating);

                if (threatRatingLkp != null) {
                    ThreatsRating currentThreatsRating = new ThreatsRating();
                    currentThreatsRating.setThreatRatingName(threatRatingLkp.getRating());
                    currentThreatsRating.setRating(threatRating);
                    currentThreatsRating.setCssClass(threatRating);

                    summaryOfAssessmentsDTO.setCurrentThreatsId(threatSummaryCurrentList.get(0).getThreat_sum_cur_id());
                    summaryOfAssessmentsDTO.setCurrentThreatsRating(currentThreatsRating);
                    summaryOfAssessmentsDTO.setCurrentThreatsJustification(threatSummaryCurrentList.get(0).getOverall_current());
                }
            }
        }

        List<threat_summary_potential> threatPotentialList = site_assessmentLocalServiceUtil
                .getThreatSummaryPotentialByVersion(version.getAssessment_version_id());

        if (threatPotentialList != null && !threatPotentialList.isEmpty()) {
            long threatRating = threatPotentialList.get(0).getThreat_rating();

            if (threatRating > 0) {
                threatRatingLkp = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatRating);
                if (threatRatingLkp != null) {
                    ThreatsRating potentialThreatsRating = new ThreatsRating();
                    potentialThreatsRating.setThreatRatingName(threatRatingLkp.getRating());
                    potentialThreatsRating.setRating(threatRating);
                    potentialThreatsRating.setCssClass(threatRating);

                    summaryOfAssessmentsDTO.setPotentialThreatsId(threatPotentialList.get(0).getThreat_sum_potential_id());
                    summaryOfAssessmentsDTO.setPotentialThreatsRating(potentialThreatsRating);
                    summaryOfAssessmentsDTO.setPotentialThreatsJustification(threatPotentialList.get(0).getOverall_potential());
                }
            }
        }

        List<threat_summary_overall> threatSummaryOverallList = site_assessmentLocalServiceUtil
                .getThreatSummaryOverallByVersion(version.getAssessment_version_id());

        if (threatSummaryOverallList != null && !threatSummaryOverallList.isEmpty()) {
            long threatRating = threatSummaryOverallList.get(0).getThreat_rating();

            if (threatRating > 0) {
                threatRatingLkp = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(threatRating);

                if (threatRatingLkp != null) {
                    ThreatsRating overallThreatsRating = new ThreatsRating();
                    overallThreatsRating.setThreatRatingName(threatRatingLkp.getRating());
                    overallThreatsRating.setRating(threatRating);
                    overallThreatsRating.setCssClass(threatRating);

                    summaryOfAssessmentsDTO.setOverallThreatsId(threatSummaryOverallList.get(0).getThreat_sum_overall_id());
                    summaryOfAssessmentsDTO.setOverallThreatsRating(overallThreatsRating);
                    summaryOfAssessmentsDTO.setOverallThreatsJustification(threatSummaryOverallList.get(0).getOverall_threat());
                }
            }
        }

        List<effective_prot_mgmt_iothreats> effectiveThreatsList = effective_prot_mgmt_iothreatsLocalServiceUtil
                .geteffectivemanagthreatByVersion(version.getAssessment_version_id());

        if (effectiveThreatsList != null && !effectiveThreatsList.isEmpty()) {
            long rating = effectiveThreatsList.get(0).getRating();

            if (rating > 0) {
                protectionManagementRating = protection_management_ratings_lkpLocalServiceUtil.getprotection_management_ratings_lkp(rating);

                if (protectionManagementRating != null) {
                    ThreatsRating effectiveProtectionAndManagementRating = new ThreatsRating();
                    effectiveProtectionAndManagementRating.setThreatRatingName(protectionManagementRating.getPm_rating());
                    effectiveProtectionAndManagementRating.setRating(rating);
                    effectiveProtectionAndManagementRating.setCssClass(rating);

                    summaryOfAssessmentsDTO.setEffectiveProtectionAndManagementId(effectiveThreatsList.get(0).getId());
                    summaryOfAssessmentsDTO.setEffectiveProtectionAndManagementRating(effectiveProtectionAndManagementRating);
                    summaryOfAssessmentsDTO.setEffectiveProtectionAndManagementJustification(effectiveThreatsList.get(0).getJustification());
                }
            }
        }

        List<prot_mgmt_overall> overallProtectionList = prot_mgmt_overallLocalServiceUtil
                .getprotmgmtoverallByVersion(version.getAssessment_version_id());

        if (overallProtectionList != null && !overallProtectionList.isEmpty()) {
            protectionManagementRating = protection_management_ratings_lkpLocalServiceUtil.getprotection_management_ratings_lkp(overallProtectionList.get(0).getRating());

            if (protectionManagementRating != null) {
                ThreatsRating protectionAndManagementRating = new ThreatsRating();
                protectionAndManagementRating.setThreatRatingName(protectionManagementRating.getPm_rating());
                protectionAndManagementRating.setRating(overallProtectionList.get(0).getRating());
                protectionAndManagementRating.setCssClass(overallProtectionList.get(0).getRating());

                summaryOfAssessmentsDTO.setProtectionAndManagementId(overallProtectionList.get(0).getPmo_id());
                summaryOfAssessmentsDTO.setProtectionAndManagementRating(protectionAndManagementRating);
                summaryOfAssessmentsDTO.setProtectionAndManagementJustification(overallProtectionList.get(0).getJustification());
            }
        }

        ThreatsRating threatRating = null;
        conservation_outlook_rating_lkp outlookRating = null;

        // Get all assessments of conservation outlook
        List<conservation_outlook> conservationOutlookList = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(version.getAssessment_version_id());
        AssessmentOfConservationOutlookDTO assessmentOfConservationOutlookDTO = null;
        List<AssessmentOfConservationOutlookDTO> assessmentOfConservationOutlookDTOList = new ArrayList<>();

        for (conservation_outlook conservationOutlook : conservationOutlookList) {
            assessmentOfConservationOutlookDTO = new AssessmentOfConservationOutlookDTO();
            assessmentOfConservationOutlookDTO.setConservationOutlookId(conservationOutlook.getConservation_outlook_id());
            assessmentOfConservationOutlookDTO.setJustification(conservationOutlook.getJustification());

            outlookRating = conservation_outlook_rating_lkpLocalServiceUtil.getconservation_outlook_rating_lkp(conservationOutlook.getRating());

            threatRating = new ThreatsRating();
            threatRating.setRating(conservationOutlook.getRating());
            threatRating.setThreatRatingName(outlookRating.getCo_rating());
            threatRating.setCssClass(conservationOutlook.getRating());

            assessmentOfConservationOutlookDTO.setThreatRating(threatRating);

            assessmentOfConservationOutlookDTOList.add(assessmentOfConservationOutlookDTO);
        }

        Collections.sort(assessmentOfConservationOutlookDTOList, new Comparator<AssessmentOfConservationOutlookDTO>() {
            @Override
            public int compare(AssessmentOfConservationOutlookDTO o1, AssessmentOfConservationOutlookDTO o2) {
                return Long.compare(o1.getConservationOutlookId(), o2.getConservationOutlookId());
            }
        });

        conservationOutlookDTO.setAssessmentVersionId(version.getAssessment_version_id());
        conservationOutlookDTO.setUserId(userId);
        conservationOutlookDTO.setUserFullName(fullName);
        conservationOutlookDTO.setRoleName(roleName);
        conservationOutlookDTO.setVersion(String.valueOf(version.getVersion_code()));
        conservationOutlookDTO.setSummaryOfAssessmentsDTO(summaryOfAssessmentsDTO);
        conservationOutlookDTO.setConservationOutlookDTOList(assessmentOfConservationOutlookDTOList);

        return conservationOutlookDTO;
    }

    /* STEP 6 */
    private BenefitsDTO populateBenefitsTab(site_assessment_versions version, Long userId, String fullName, String roleName) throws SystemException, PortalException {
        BenefitsDTO benefitsDTO = new BenefitsDTO();

        // get understanding benefits
        List<benefits> benefitsList = benefitsLocalServiceUtil.getbenefitByVersion(version.getAssessment_version_id());
        List<UnderstandBenefitsDTO> understandBenefitsDTOList = new ArrayList<UnderstandBenefitsDTO>();

        List<negative_factors_level_impact> negativeLevels = negative_factors_level_impactLocalServiceUtil.getnegative_factors_level_impacts(-1, -1);
        List<negative_factors_trend> trends = negative_factors_trendLocalServiceUtil.getnegative_factors_trends(-1, -1);

        Map<Long, String> negativeLevelsMap = new HashMap<Long, String>();
        Map<Long, String> trendsMap = new HashMap<Long, String>();

        for (negative_factors_level_impact level : negativeLevels) {
            negativeLevelsMap.put(level.getLevel_id(), level.getLevel_impact());
        }

        for (negative_factors_trend trend : trends) {
            trendsMap.put(trend.getTrend_id(), trend.getTrend());
        }

        for (benefits lst_benefits : benefitsList) {
            UnderstandBenefitsDTO understandBenefitsDTO = new UnderstandBenefitsDTO();

            List<benefit_checksubtype_lkp> objSubTypelkp = new ArrayList<benefit_checksubtype_lkp>();

            //getting subtype list
            List<benefits_type_ref> objbenefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(lst_benefits.getBenefits_id());
            long benefitType = 0;

            for (benefits_type_ref benefits_type_refTemp : objbenefits_type_ref) {

                benefitType = benefits_type_refTemp.getBenefit_checktype();

                long subType = benefits_type_refTemp.getBenefit_checksubtype();

                objSubTypelkp.add(benefit_checksubtype_lkpLocalServiceUtil.getbenefit_checksubtype_lkp(subType));
            }
            understandBenefitsDTO.setObjbenefits(lst_benefits);

            //set type
            if (benefitType > 0) {
                understandBenefitsDTO.setBenefitchecktypelkp(benefit_checktype_lkpLocalServiceUtil.getbenefit_checktype_lkp(benefitType));
            }

            //set subtype
            understandBenefitsDTO.setBenefitchecksubtypelkp(objSubTypelkp);

            if (lst_benefits.getCommunity_outside_site() > 0) {
                understandBenefitsDTO.setBenefitratingOutside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getCommunity_outside_site()));
            }

            if (lst_benefits.getCommunity_within_site() > 0) {
                understandBenefitsDTO.setBenefitratingInside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getCommunity_within_site()));
            }

            if (lst_benefits.getWider_community() > 0) {
                understandBenefitsDTO.setBenefitratingWider(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getWider_community()));
            }

            understandBenefitsDTO.setNegativeLevelsMap(negativeLevelsMap);
            understandBenefitsDTO.setTrendsMap(trendsMap);
            understandBenefitsDTO.setObjbenefits(lst_benefits);

            if (understandBenefitsDTO.getObjbenefits().getData_deficient()) {
                understandBenefitsDTO.setDatadeficent("Data deficient");
            } else {
                understandBenefitsDTO.setDatadeficent("Present");
            }

            understandBenefitsDTOList.add(understandBenefitsDTO);
        }

        Collections.sort(understandBenefitsDTOList, new Comparator<UnderstandBenefitsDTO>() {
            @Override
            public int compare(UnderstandBenefitsDTO o1, UnderstandBenefitsDTO o2) {
                return Long.compare(o1.getObjbenefits().getBenefits_id(), o2.getObjbenefits().getBenefits_id());
            }
        });

        // Get all benefit summary
        List<benefits_summary> benefitsSummary = benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(version.getAssessment_version_id());
        BenefitsSummaryDTO benefitsSummaryDTO = null;
        List<BenefitsSummaryDTO> benefitsSummaryDTOList = new ArrayList<>();

        for (benefits_summary summary : benefitsSummary) {
            benefitsSummaryDTO = new BenefitsSummaryDTO();
            benefitsSummaryDTO.setBenefitsSummaryId(summary.getBenefits_summary_id());
            benefitsSummaryDTO.setSummary(summary.getSummary());

            benefitsSummaryDTOList.add(benefitsSummaryDTO);
        }

        Collections.sort(benefitsSummaryDTOList, new Comparator<BenefitsSummaryDTO>() {
            @Override
            public int compare(BenefitsSummaryDTO o1, BenefitsSummaryDTO o2) {
                return o1.getBenefitsSummaryId().compareTo(o2.getBenefitsSummaryId());
            }
        });

        benefitsDTO.setAssessmentVersionId(version.getAssessment_version_id());
        benefitsDTO.setUserId(userId);
        benefitsDTO.setUserFullName(fullName);
        benefitsDTO.setRoleName(roleName);
        benefitsDTO.setVersion(String.valueOf(version.getVersion_code()));
        benefitsDTO.setUnderstandBenefitsDTOList(understandBenefitsDTOList);
        benefitsDTO.setBenefitsSummaryDTOList(benefitsSummaryDTOList);

        return benefitsDTO;
    }

    /* STEP 7 */
    private ProjectsDTO populateProjectsTab(site_assessment_versions version, Long userId, String fullName, String roleName) throws SystemException, PortalException {
        ProjectsDTO projectsDTO = new ProjectsDTO();

        // Get all conservation projects
        List<active_conservation_projects> conservationProjects = active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(version.getAssessment_version_id());
        ConservationProjectDTO conservationProjectDTO = null;
        List<ConservationProjectDTO> conservationProjectDTOList = new ArrayList<>();

        for (active_conservation_projects activeConservationProject : conservationProjects) {
            conservationProjectDTO = new ConservationProjectDTO();
            conservationProjectDTO.setConservationId(activeConservationProject.getAcpid());
            conservationProjectDTO.setOrganizationIndividual(activeConservationProject.getOrganization_individual());
            conservationProjectDTO.setConservationDetails(activeConservationProject.getContact_details());
            conservationProjectDTO.setConservationDescription(activeConservationProject.getDescription());
            conservationProjectDTO.setProjectDurationFrom(activeConservationProject.getProjectDurationFrom());
            conservationProjectDTO.setProjectDurationTo(activeConservationProject.getProjectDurationTo());

            conservationProjectDTOList.add(conservationProjectDTO);
        }

        Collections.sort(conservationProjectDTOList, new Comparator<ConservationProjectDTO>() {
            @Override
            public int compare(ConservationProjectDTO o1, ConservationProjectDTO o2) {
                return o1.getConservationId().compareTo(o2.getConservationId());
            }
        });

        // Get all potential project needs
        List<potential_project_needs> projectNeedsList = potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(version.getAssessment_version_id());
        List<PotentialProjectsNeedsDTO> potentialProjectsNeedsDTOList = new ArrayList<>();
        PotentialProjectsNeedsDTO potentialProjectsNeedsDTO = null;

        for (potential_project_needs projectNeeds : projectNeedsList) {
            potentialProjectsNeedsDTO = new PotentialProjectsNeedsDTO();
            potentialProjectsNeedsDTO.setPpnId(projectNeeds.getPpn_id());
            potentialProjectsNeedsDTO.setOrganizationIndividual(projectNeeds.getOrganization_individual());
            potentialProjectsNeedsDTO.setDescription(projectNeeds.getDescription());

            potentialProjectsNeedsDTOList.add(potentialProjectsNeedsDTO);
        }

        Collections.sort(potentialProjectsNeedsDTOList, new Comparator<PotentialProjectsNeedsDTO>() {
            @Override
            public int compare(PotentialProjectsNeedsDTO o1, PotentialProjectsNeedsDTO o2) {
                return o1.getPpnId().compareTo(o2.getPpnId());
            }
        });

        projectsDTO.setAssessmentVersionId(version.getAssessment_version_id());
        projectsDTO.setUserId(userId);
        projectsDTO.setUserFullName(fullName);
        projectsDTO.setRoleName(roleName);
        projectsDTO.setVersion(String.valueOf(version.getVersion_code()));
        projectsDTO.setConservationProjectDTOList(conservationProjectDTOList);
        projectsDTO.setPotentialProjectsNeedsDTOList(potentialProjectsNeedsDTOList);

        return projectsDTO;
    }

    /* STEP 8 */
    private ReferencesDTO populateReferencesTab(site_assessment_versions version, Long userId, String fullName, String roleName) throws Exception {
        ReferencesDTO referencesDTO = new ReferencesDTO();

        List<references> whpReferences = referencesLocalServiceUtil.findByAssessmentId(version.getAssessment_version_id());

        // Get all references of World Heritage site
        ReferenceValueDTO referenceValue = null;
        List<ReferenceValueDTO> referencesDTOList = new ArrayList<>();

        for (references reference : whpReferences) {
            referenceValue = new ReferenceValueDTO();
            referenceValue.setReferenceId(reference.getReference_id());
            referenceValue.setReferences(reference.getReferences());

            referencesDTOList.add(referenceValue);
        }

        referencesDTO.setAssessmentVersionId(version.getAssessment_version_id());
        referencesDTO.setUserId(userId);
        referencesDTO.setUserFullName(fullName);
        referencesDTO.setRoleName(roleName);
        referencesDTO.setVersion(String.valueOf(version.getVersion_code()));
        referencesDTO.setReferenceValues(referencesDTOList);

        return referencesDTO;
    }

    private String getCurrentThreatValuesAffected(long threatId) throws SystemException, PortalException {
        String values = "";

        List<current_threat_values> threatValues = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(threatId);

        // TODO improve this code. do not use forEach
//        Collections.reverse(threatValues);
        for (current_threat_values threatValue : threatValues) {
            if (values.isEmpty()) {
                values = threatValue.getIs_biodiv_whval()
                        ? biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue()
                        : assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
            } else {
                values = values + ", " + (threatValue.getIs_biodiv_whval()
                        ? biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue()
                        : assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues());
            }
        }

        return values;
    }

    private String getPotentialThreatValuesAffected(long threatId) throws SystemException, PortalException {
        String values = "";

        List<potential_threat_values> threatValues = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(threatId);

        // TODO improve this code. do not use forEach
//        Collections.reverse(threatValues);
        for (potential_threat_values threatValue : threatValues) {
            if (values.isEmpty()) {
                values = threatValue.getIs_biodiv_whval()
                        ? biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue()
                        : assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
            } else {
                values = values + ", " + (threatValue.getIs_biodiv_whval()
                        ? biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue()
                        : assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues());
            }
        }

        return values;
    }

    private List<CategoryDTO> getCurrentThreatCategories(assessing_threats_current current)
            throws SystemException, PortalException {
        Set<CategoryDTO> categories = new TreeSet<>();
        Set<SubCategoryDTO> subCategories = new TreeSet<>();

        CategoryDTO category = null;
        SubCategoryDTO subCategoryDTO = null;

        String categoryName = "";
        String subCategoryName = "";

        List<current_threat_assessment_cat> threatAssessmentCategories = site_assessmentLocalServiceUtil
                .getCurrentThreatAssessmentCatByThreatId(current.getCurrent_threat_id());

        List<current_threat_assessment_cat> subCategoryList = new ArrayList<>();

        for (current_threat_assessment_cat threatCategory : threatAssessmentCategories) {
            categoryName = threat_categories_lkpLocalServiceUtil
                    .getthreat_categories_lkp(threatCategory.getCategory_id()).getThreat_category();

            subCategoryList = current_threat_assessment_catLocalServiceUtil
                    .getCurrentThreatAssessmentSubCategories(current.getCurrent_threat_id(), threatCategory.getCategory_id());

            category = new CategoryDTO();
            category.setCategoryId(threatCategory.getCategory_id());
            category.setCategoryName(categoryName);

            Collections.sort(subCategoryList, new Comparator<current_threat_assessment_cat>() {
                @Override
                public int compare(current_threat_assessment_cat o1, current_threat_assessment_cat o2) {
                    return Long.compare(o1.getCur_threat_cat_id(), o2.getCur_threat_cat_id());
                }
            });

            for (current_threat_assessment_cat subCategory : subCategoryList) {
                subCategoryDTO = new SubCategoryDTO();

                subCategoryName = threat_subcategories_lkpLocalServiceUtil
                        .getthreat_subcategories_lkp(subCategory.getSub_cat_id()).getThreat_sub_category();

                subCategoryDTO.setSubCategoryId(subCategory.getSub_cat_id());
                subCategoryDTO.setSubCategoryName(subCategoryName);

                subCategories.add(subCategoryDTO);
            }
            List<SubCategoryDTO> list = new ArrayList<>(subCategories);
//            Collections.reverse(list);

            category.setSubCategoryDTOList(list);

            categories.add(category);
        }

        List<CategoryDTO> temp = new ArrayList<>(categories);
//        Collections.reverse(temp);
        return temp;
    }

    private List<CategoryDTO> getPotentialThreatCategories(assessing_threats_potential potentialThreat)
            throws SystemException, PortalException {
        Set<CategoryDTO> categories = new TreeSet<>();
        Set<SubCategoryDTO> subCategories = new TreeSet<>();

        CategoryDTO category = null;
        SubCategoryDTO subCategoryDTO = null;

        String categoryName = "";
        String subCategoryName = "";

        List<potential_threat_assessment_cat> threatAssessmentCategories = site_assessmentLocalServiceUtil
                .getPotentialThreatAssessmentCatByThreatId(potentialThreat.getPotential_threat_id());

        Collections.sort(threatAssessmentCategories, new Comparator<potential_threat_assessment_cat>() {
            @Override
            public int compare(potential_threat_assessment_cat o1, potential_threat_assessment_cat o2) {
                return Long.compare(o1.getCategory_id(), o2.getCategory_id());
            }
        });

        List<potential_threat_assessment_cat> subCategoryList = new ArrayList<>();

        for (potential_threat_assessment_cat threatCategory : threatAssessmentCategories) {
            categoryName = threat_categories_lkpLocalServiceUtil
                    .getthreat_categories_lkp(threatCategory.getCategory_id()).getThreat_category();

            subCategoryList = potential_threat_assessment_catLocalServiceUtil
                    .getPotentialThreatSubCategories(potentialThreat.getPotential_threat_id(), threatCategory.getCategory_id());

            category = new CategoryDTO();
            category.setCategoryId(threatCategory.getCategory_id());
            category.setCategoryName(categoryName);

            for (potential_threat_assessment_cat subCategory : subCategoryList) {
                subCategoryDTO = new SubCategoryDTO();

                subCategoryName = threat_subcategories_lkpLocalServiceUtil
                        .getthreat_subcategories_lkp(subCategory.getSub_cat_id()).getThreat_sub_category();

                subCategoryDTO.setSubCategoryId(subCategory.getSub_cat_id());
                subCategoryDTO.setSubCategoryName(subCategoryName);

                subCategories.add(subCategoryDTO);
            }

            List<SubCategoryDTO> list = new ArrayList<SubCategoryDTO>(subCategories);
//            Collections.reverse(list);
            category.setSubCategoryDTOList(list);

            categories.add(category);
        }
        List<CategoryDTO> temp = new ArrayList<>(categories);
//        Collections.reverse(temp);
        return temp;
    }

    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
        super.serveResource(resourceRequest, resourceResponse);
    }
}
