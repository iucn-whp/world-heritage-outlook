/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.iucn.whp.dbservice.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the site_assessment local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.site_assessmentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see site_assessmentLocalService
 * @see com.iucn.whp.dbservice.service.base.site_assessmentLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.site_assessmentLocalServiceImpl
 * @generated
 */
public class site_assessmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.site_assessmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the site_assessment to the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @return the site_assessment that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment addsite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addsite_assessment(site_assessment);
	}

	/**
	* Creates a new site_assessment with the primary key. Does not add the site_assessment to the database.
	*
	* @param assessment_id the primary key for the new site_assessment
	* @return the new site_assessment
	*/
	public static com.iucn.whp.dbservice.model.site_assessment createsite_assessment(
		long assessment_id) {
		return getService().createsite_assessment(assessment_id);
	}

	/**
	* Deletes the site_assessment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment that was removed
	* @throws PortalException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment deletesite_assessment(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesite_assessment(assessment_id);
	}

	/**
	* Deletes the site_assessment from the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @return the site_assessment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment deletesite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesite_assessment(site_assessment);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.iucn.whp.dbservice.model.site_assessment fetchsite_assessment(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchsite_assessment(assessment_id);
	}

	/**
	* Returns the site_assessment with the primary key.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment
	* @throws PortalException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment getsite_assessment(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getsite_assessment(assessment_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the site_assessments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of site_assessments
	* @param end the upper bound of the range of site_assessments (not inclusive)
	* @return the range of site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> getsite_assessments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsite_assessments(start, end);
	}

	/**
	* Returns the number of site_assessments.
	*
	* @return the number of site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public static int getsite_assessmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsite_assessmentsCount();
	}

	/**
	* Updates the site_assessment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @return the site_assessment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment updatesite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesite_assessment(site_assessment);
	}

	/**
	* Updates the site_assessment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @param merge whether to merge the site_assessment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the site_assessment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.site_assessment updatesite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesite_assessment(site_assessment, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> getAllActiveSiteAssessment() {
		return getService().getAllActiveSiteAssessment();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.state_lkp> getAllStates()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllStates();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.trend_lkp> getAllTrends()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllTrends();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getBiodiversityValuesByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBiodiversityValuesByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.current_state_trend> getCurrent_state_trendByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrent_state_trendByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.threat_categories_lkp> getAllThreatCategories()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllThreatCategories();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.threat_rating_lkp> getAllThreatRating()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllThreatRating();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> getAllThreatSubCategories()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllThreatSubCategories();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> getAssessment_whvaluesByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessment_whvaluesByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getStatetrendbiodivvalsByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatetrendbiodivvalsByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> getState_trend_whvaluesByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getState_trend_whvaluesByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getAssessingThreatsCurrentByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessingThreatsCurrentByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> getAssessingThreatsPotentialByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessingThreatsPotentialByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getThreatSummaryCurrentByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getThreatSummaryCurrentByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getThreatSummaryOverallByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getThreatSummaryOverallByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getThreatSummaryPotentialByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getThreatSummaryPotentialByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getCurrentThreatAssessmentCatByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrentThreatAssessmentCatByThreatId(threat_id);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getPotentialThreatAssessmentCatByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPotentialThreatAssessmentCatByThreatId(threat_id);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getPotentialThreatValuesByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPotentialThreatValuesByThreatId(threat_id);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.current_threat_values> getCurrentlThreatValuesByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrentlThreatValuesByThreatId(threat_id);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> getActiveAssessmentBySiteId(
		long siteid) {
		return getService().getActiveAssessmentBySiteId(siteid);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> getActiveAssessmentByUserId(
		long current_userid) {
		return getService().getActiveAssessmentByUserId(current_userid);
	}

	public static long getPublishedSiteAssessmentEntry(long siteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublishedSiteAssessmentEntry(siteId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> getAllActiveSiteAssessment(
		java.lang.String query, int begin, int end) {
		return getService().getAllActiveSiteAssessment(query, begin, end);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.site_assessment> siteAssessmentByFlag(
		boolean active, boolean archived) {
		return getService().siteAssessmentByFlag(active, archived);
	}

	public static void clearService() {
		_service = null;
	}

	public static site_assessmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					site_assessmentLocalService.class.getName());

			if (invokableLocalService instanceof site_assessmentLocalService) {
				_service = (site_assessmentLocalService)invokableLocalService;
			}
			else {
				_service = new site_assessmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(site_assessmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(site_assessmentLocalService service) {
	}

	private static site_assessmentLocalService _service;
}