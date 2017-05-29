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
 * The utility for the key_conservation_issues local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.key_conservation_issuesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see key_conservation_issuesLocalService
 * @see com.iucn.whp.dbservice.service.base.key_conservation_issuesLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.key_conservation_issuesLocalServiceImpl
 * @generated
 */
public class key_conservation_issuesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.key_conservation_issuesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the key_conservation_issues to the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @return the key_conservation_issues that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues addkey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addkey_conservation_issues(key_conservation_issues);
	}

	/**
	* Creates a new key_conservation_issues with the primary key. Does not add the key_conservation_issues to the database.
	*
	* @param key_conservation_issues_id the primary key for the new key_conservation_issues
	* @return the new key_conservation_issues
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues createkey_conservation_issues(
		long key_conservation_issues_id) {
		return getService()
				   .createkey_conservation_issues(key_conservation_issues_id);
	}

	/**
	* Deletes the key_conservation_issues with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues that was removed
	* @throws PortalException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues deletekey_conservation_issues(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletekey_conservation_issues(key_conservation_issues_id);
	}

	/**
	* Deletes the key_conservation_issues from the database. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @return the key_conservation_issues that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues deletekey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deletekey_conservation_issues(key_conservation_issues);
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

	public static com.iucn.whp.dbservice.model.key_conservation_issues fetchkey_conservation_issues(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchkey_conservation_issues(key_conservation_issues_id);
	}

	/**
	* Returns the key_conservation_issues with the primary key.
	*
	* @param key_conservation_issues_id the primary key of the key_conservation_issues
	* @return the key_conservation_issues
	* @throws PortalException if a key_conservation_issues with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues getkey_conservation_issues(
		long key_conservation_issues_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getkey_conservation_issues(key_conservation_issues_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the key_conservation_issueses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of key_conservation_issueses
	* @param end the upper bound of the range of key_conservation_issueses (not inclusive)
	* @return the range of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getkey_conservation_issueses(start, end);
	}

	/**
	* Returns the number of key_conservation_issueses.
	*
	* @return the number of key_conservation_issueses
	* @throws SystemException if a system exception occurred
	*/
	public static int getkey_conservation_issuesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getkey_conservation_issuesesCount();
	}

	/**
	* Updates the key_conservation_issues in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @return the key_conservation_issues that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues updatekey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatekey_conservation_issues(key_conservation_issues);
	}

	/**
	* Updates the key_conservation_issues in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param key_conservation_issues the key_conservation_issues
	* @param merge whether to merge the key_conservation_issues with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the key_conservation_issues that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.key_conservation_issues updatekey_conservation_issues(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatekey_conservation_issues(key_conservation_issues, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conversionissueByVersion(
		long versionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getkey_conversionissueByVersion(versionId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.key_conservation_scale_lkp> getAllconversionScale()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllconversionScale();
	}

	public static void clearService() {
		_service = null;
	}

	public static key_conservation_issuesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					key_conservation_issuesLocalService.class.getName());

			if (invokableLocalService instanceof key_conservation_issuesLocalService) {
				_service = (key_conservation_issuesLocalService)invokableLocalService;
			}
			else {
				_service = new key_conservation_issuesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(key_conservation_issuesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(key_conservation_issuesLocalService service) {
	}

	private static key_conservation_issuesLocalService _service;
}