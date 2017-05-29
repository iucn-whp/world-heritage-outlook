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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link site_assessmentLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       site_assessmentLocalService
 * @generated
 */
public class site_assessmentLocalServiceWrapper
	implements site_assessmentLocalService,
		ServiceWrapper<site_assessmentLocalService> {
	public site_assessmentLocalServiceWrapper(
		site_assessmentLocalService site_assessmentLocalService) {
		_site_assessmentLocalService = site_assessmentLocalService;
	}

	/**
	* Adds the site_assessment to the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @return the site_assessment that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment addsite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.addsite_assessment(site_assessment);
	}

	/**
	* Creates a new site_assessment with the primary key. Does not add the site_assessment to the database.
	*
	* @param assessment_id the primary key for the new site_assessment
	* @return the new site_assessment
	*/
	public com.iucn.whp.dbservice.model.site_assessment createsite_assessment(
		long assessment_id) {
		return _site_assessmentLocalService.createsite_assessment(assessment_id);
	}

	/**
	* Deletes the site_assessment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment that was removed
	* @throws PortalException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment deletesite_assessment(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.deletesite_assessment(assessment_id);
	}

	/**
	* Deletes the site_assessment from the database. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @return the site_assessment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment deletesite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.deletesite_assessment(site_assessment);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _site_assessmentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.site_assessment fetchsite_assessment(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.fetchsite_assessment(assessment_id);
	}

	/**
	* Returns the site_assessment with the primary key.
	*
	* @param assessment_id the primary key of the site_assessment
	* @return the site_assessment
	* @throws PortalException if a site_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment getsite_assessment(
		long assessment_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getsite_assessment(assessment_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> getsite_assessments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getsite_assessments(start, end);
	}

	/**
	* Returns the number of site_assessments.
	*
	* @return the number of site_assessments
	* @throws SystemException if a system exception occurred
	*/
	public int getsite_assessmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getsite_assessmentsCount();
	}

	/**
	* Updates the site_assessment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @return the site_assessment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment updatesite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.updatesite_assessment(site_assessment);
	}

	/**
	* Updates the site_assessment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param site_assessment the site_assessment
	* @param merge whether to merge the site_assessment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the site_assessment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.site_assessment updatesite_assessment(
		com.iucn.whp.dbservice.model.site_assessment site_assessment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.updatesite_assessment(site_assessment,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _site_assessmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_site_assessmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _site_assessmentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> getAllActiveSiteAssessment() {
		return _site_assessmentLocalService.getAllActiveSiteAssessment();
	}

	public java.util.List<com.iucn.whp.dbservice.model.state_lkp> getAllStates()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAllStates();
	}

	public java.util.List<com.iucn.whp.dbservice.model.trend_lkp> getAllTrends()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAllTrends();
	}

	public java.util.List<com.iucn.whp.dbservice.model.biodiversity_values> getBiodiversityValuesByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getBiodiversityValuesByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.current_state_trend> getCurrent_state_trendByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getCurrent_state_trendByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_categories_lkp> getAllThreatCategories()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAllThreatCategories();
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_rating_lkp> getAllThreatRating()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAllThreatRating();
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> getAllThreatSubCategories()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAllThreatSubCategories();
	}

	public java.util.List<com.iucn.whp.dbservice.model.assessment_whvalues> getAssessment_whvaluesByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAssessment_whvaluesByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getStatetrendbiodivvalsByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getStatetrendbiodivvalsByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.state_trend_whvalues> getState_trend_whvaluesByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getState_trend_whvaluesByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_current> getAssessingThreatsCurrentByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAssessingThreatsCurrentByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.assessing_threats_potential> getAssessingThreatsPotentialByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getAssessingThreatsPotentialByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_current> getThreatSummaryCurrentByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getThreatSummaryCurrentByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_overall> getThreatSummaryOverallByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getThreatSummaryOverallByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.threat_summary_potential> getThreatSummaryPotentialByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getThreatSummaryPotentialByVersion(versionId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getCurrentThreatAssessmentCatByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getCurrentThreatAssessmentCatByThreatId(threat_id);
	}

	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getPotentialThreatAssessmentCatByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getPotentialThreatAssessmentCatByThreatId(threat_id);
	}

	public java.util.List<com.iucn.whp.dbservice.model.potential_threat_values> getPotentialThreatValuesByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getPotentialThreatValuesByThreatId(threat_id);
	}

	public java.util.List<com.iucn.whp.dbservice.model.current_threat_values> getCurrentlThreatValuesByThreatId(
		long threat_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getCurrentlThreatValuesByThreatId(threat_id);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> getActiveAssessmentBySiteId(
		long siteid) {
		return _site_assessmentLocalService.getActiveAssessmentBySiteId(siteid);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> getActiveAssessmentByUserId(
		long current_userid) {
		return _site_assessmentLocalService.getActiveAssessmentByUserId(current_userid);
	}

	public long getPublishedSiteAssessmentEntry(long siteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _site_assessmentLocalService.getPublishedSiteAssessmentEntry(siteId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> getAllActiveSiteAssessment(
		java.lang.String query, int begin, int end) {
		return _site_assessmentLocalService.getAllActiveSiteAssessment(query,
			begin, end);
	}

	public java.util.List<com.iucn.whp.dbservice.model.site_assessment> siteAssessmentByFlag(
		boolean active, boolean archived) {
		return _site_assessmentLocalService.siteAssessmentByFlag(active,
			archived);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public site_assessmentLocalService getWrappedsite_assessmentLocalService() {
		return _site_assessmentLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedsite_assessmentLocalService(
		site_assessmentLocalService site_assessmentLocalService) {
		_site_assessmentLocalService = site_assessmentLocalService;
	}

	public site_assessmentLocalService getWrappedService() {
		return _site_assessmentLocalService;
	}

	public void setWrappedService(
		site_assessmentLocalService site_assessmentLocalService) {
		_site_assessmentLocalService = site_assessmentLocalService;
	}

	private site_assessmentLocalService _site_assessmentLocalService;
}