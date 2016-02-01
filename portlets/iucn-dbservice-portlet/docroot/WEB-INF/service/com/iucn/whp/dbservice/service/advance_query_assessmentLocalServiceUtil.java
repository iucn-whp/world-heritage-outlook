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
 * The utility for the advance_query_assessment local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.advance_query_assessmentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see advance_query_assessmentLocalService
 * @see com.iucn.whp.dbservice.service.base.advance_query_assessmentLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.advance_query_assessmentLocalServiceImpl
 * @generated
 */
public class advance_query_assessmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.advance_query_assessmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the advance_query_assessment to the database. Also notifies the appropriate model listeners.
	*
	* @param advance_query_assessment the advance_query_assessment
	* @return the advance_query_assessment that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment addadvance_query_assessment(
		com.iucn.whp.dbservice.model.advance_query_assessment advance_query_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addadvance_query_assessment(advance_query_assessment);
	}

	/**
	* Creates a new advance_query_assessment with the primary key. Does not add the advance_query_assessment to the database.
	*
	* @param id the primary key for the new advance_query_assessment
	* @return the new advance_query_assessment
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment createadvance_query_assessment(
		long id) {
		return getService().createadvance_query_assessment(id);
	}

	/**
	* Deletes the advance_query_assessment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the advance_query_assessment
	* @return the advance_query_assessment that was removed
	* @throws PortalException if a advance_query_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment deleteadvance_query_assessment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteadvance_query_assessment(id);
	}

	/**
	* Deletes the advance_query_assessment from the database. Also notifies the appropriate model listeners.
	*
	* @param advance_query_assessment the advance_query_assessment
	* @return the advance_query_assessment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment deleteadvance_query_assessment(
		com.iucn.whp.dbservice.model.advance_query_assessment advance_query_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteadvance_query_assessment(advance_query_assessment);
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

	public static com.iucn.whp.dbservice.model.advance_query_assessment fetchadvance_query_assessment(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchadvance_query_assessment(id);
	}

	/**
	* Returns the advance_query_assessment with the primary key.
	*
	* @param id the primary key of the advance_query_assessment
	* @return the advance_query_assessment
	* @throws PortalException if a advance_query_assessment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment getadvance_query_assessment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getadvance_query_assessment(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the advance_query_assessments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of advance_query_assessments
	* @param end the upper bound of the range of advance_query_assessments (not inclusive)
	* @return the range of advance_query_assessments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_assessment> getadvance_query_assessments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getadvance_query_assessments(start, end);
	}

	/**
	* Returns the number of advance_query_assessments.
	*
	* @return the number of advance_query_assessments
	* @throws SystemException if a system exception occurred
	*/
	public static int getadvance_query_assessmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getadvance_query_assessmentsCount();
	}

	/**
	* Updates the advance_query_assessment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advance_query_assessment the advance_query_assessment
	* @return the advance_query_assessment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment updateadvance_query_assessment(
		com.iucn.whp.dbservice.model.advance_query_assessment advance_query_assessment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateadvance_query_assessment(advance_query_assessment);
	}

	/**
	* Updates the advance_query_assessment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advance_query_assessment the advance_query_assessment
	* @param merge whether to merge the advance_query_assessment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the advance_query_assessment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.advance_query_assessment updateadvance_query_assessment(
		com.iucn.whp.dbservice.model.advance_query_assessment advance_query_assessment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateadvance_query_assessment(advance_query_assessment,
			merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_assessment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_assessment> findBybase_cat_tab_name(
		java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBybase_cat_tab_name(base_tab_name);
	}

	public static com.iucn.whp.dbservice.model.advance_query_assessment findBybase_cat_tab_name(
		long id)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_assessmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBybase_cat_tab_name(id);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.advance_query_assessment> findBybase_tab_diplay_name(
		java.lang.String base_search_val)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_assessmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBybase_tab_diplay_name(base_search_val);
	}

	public static void clearService() {
		_service = null;
	}

	public static advance_query_assessmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					advance_query_assessmentLocalService.class.getName());

			if (invokableLocalService instanceof advance_query_assessmentLocalService) {
				_service = (advance_query_assessmentLocalService)invokableLocalService;
			}
			else {
				_service = new advance_query_assessmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(advance_query_assessmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(advance_query_assessmentLocalService service) {
	}

	private static advance_query_assessmentLocalService _service;
}