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
 * The utility for the benefit_checktype_lkp local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.benefit_checktype_lkpLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see benefit_checktype_lkpLocalService
 * @see com.iucn.whp.dbservice.service.base.benefit_checktype_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.benefit_checktype_lkpLocalServiceImpl
 * @generated
 */
public class benefit_checktype_lkpLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.benefit_checktype_lkpLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the benefit_checktype_lkp to the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp addbenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addbenefit_checktype_lkp(benefit_checktype_lkp);
	}

	/**
	* Creates a new benefit_checktype_lkp with the primary key. Does not add the benefit_checktype_lkp to the database.
	*
	* @param benefit_id the primary key for the new benefit_checktype_lkp
	* @return the new benefit_checktype_lkp
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp createbenefit_checktype_lkp(
		long benefit_id) {
		return getService().createbenefit_checktype_lkp(benefit_id);
	}

	/**
	* Deletes the benefit_checktype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was removed
	* @throws PortalException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp deletebenefit_checktype_lkp(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebenefit_checktype_lkp(benefit_id);
	}

	/**
	* Deletes the benefit_checktype_lkp from the database. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp deletebenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebenefit_checktype_lkp(benefit_checktype_lkp);
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

	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp fetchbenefit_checktype_lkp(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchbenefit_checktype_lkp(benefit_id);
	}

	/**
	* Returns the benefit_checktype_lkp with the primary key.
	*
	* @param benefit_id the primary key of the benefit_checktype_lkp
	* @return the benefit_checktype_lkp
	* @throws PortalException if a benefit_checktype_lkp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp getbenefit_checktype_lkp(
		long benefit_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefit_checktype_lkp(benefit_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefit_checktype_lkps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefit_checktype_lkps
	* @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	* @return the range of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> getbenefit_checktype_lkps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefit_checktype_lkps(start, end);
	}

	/**
	* Returns the number of benefit_checktype_lkps.
	*
	* @return the number of benefit_checktype_lkps
	* @throws SystemException if a system exception occurred
	*/
	public static int getbenefit_checktype_lkpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefit_checktype_lkpsCount();
	}

	/**
	* Updates the benefit_checktype_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @return the benefit_checktype_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp updatebenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebenefit_checktype_lkp(benefit_checktype_lkp);
	}

	/**
	* Updates the benefit_checktype_lkp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefit_checktype_lkp the benefit_checktype_lkp
	* @param merge whether to merge the benefit_checktype_lkp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefit_checktype_lkp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefit_checktype_lkp updatebenefit_checktype_lkp(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatebenefit_checktype_lkp(benefit_checktype_lkp, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.benefit_checktype_lkp> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static void clearService() {
		_service = null;
	}

	public static benefit_checktype_lkpLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					benefit_checktype_lkpLocalService.class.getName());

			if (invokableLocalService instanceof benefit_checktype_lkpLocalService) {
				_service = (benefit_checktype_lkpLocalService)invokableLocalService;
			}
			else {
				_service = new benefit_checktype_lkpLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(benefit_checktype_lkpLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(benefit_checktype_lkpLocalService service) {
	}

	private static benefit_checktype_lkpLocalService _service;
}