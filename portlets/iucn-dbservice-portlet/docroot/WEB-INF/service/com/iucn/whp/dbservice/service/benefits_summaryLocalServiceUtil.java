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
 * The utility for the benefits_summary local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.benefits_summaryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see benefits_summaryLocalService
 * @see com.iucn.whp.dbservice.service.base.benefits_summaryLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.benefits_summaryLocalServiceImpl
 * @generated
 */
public class benefits_summaryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.benefits_summaryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the benefits_summary to the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @return the benefits_summary that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary addbenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addbenefits_summary(benefits_summary);
	}

	/**
	* Creates a new benefits_summary with the primary key. Does not add the benefits_summary to the database.
	*
	* @param benefits_summary_id the primary key for the new benefits_summary
	* @return the new benefits_summary
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary createbenefits_summary(
		long benefits_summary_id) {
		return getService().createbenefits_summary(benefits_summary_id);
	}

	/**
	* Deletes the benefits_summary with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary that was removed
	* @throws PortalException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary deletebenefits_summary(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebenefits_summary(benefits_summary_id);
	}

	/**
	* Deletes the benefits_summary from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @return the benefits_summary that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary deletebenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebenefits_summary(benefits_summary);
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

	public static com.iucn.whp.dbservice.model.benefits_summary fetchbenefits_summary(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchbenefits_summary(benefits_summary_id);
	}

	/**
	* Returns the benefits_summary with the primary key.
	*
	* @param benefits_summary_id the primary key of the benefits_summary
	* @return the benefits_summary
	* @throws PortalException if a benefits_summary with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary getbenefits_summary(
		long benefits_summary_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefits_summary(benefits_summary_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefits_summaries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_summaries
	* @param end the upper bound of the range of benefits_summaries (not inclusive)
	* @return the range of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefits_summaries(start, end);
	}

	/**
	* Returns the number of benefits_summaries.
	*
	* @return the number of benefits_summaries
	* @throws SystemException if a system exception occurred
	*/
	public static int getbenefits_summariesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefits_summariesCount();
	}

	/**
	* Updates the benefits_summary in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @return the benefits_summary that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary updatebenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebenefits_summary(benefits_summary);
	}

	/**
	* Updates the benefits_summary in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_summary the benefits_summary
	* @param merge whether to merge the benefits_summary with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefits_summary that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_summary updatebenefits_summary(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebenefits_summary(benefits_summary, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.benefits_summary> getEntriesFromAssessmentId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntriesFromAssessmentId(assessment_version_id);
	}

	public static void clearService() {
		_service = null;
	}

	public static benefits_summaryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					benefits_summaryLocalService.class.getName());

			if (invokableLocalService instanceof benefits_summaryLocalService) {
				_service = (benefits_summaryLocalService)invokableLocalService;
			}
			else {
				_service = new benefits_summaryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(benefits_summaryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(benefits_summaryLocalService service) {
	}

	private static benefits_summaryLocalService _service;
}