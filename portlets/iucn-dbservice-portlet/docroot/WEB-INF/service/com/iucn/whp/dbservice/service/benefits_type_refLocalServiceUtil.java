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
 * The utility for the benefits_type_ref local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.benefits_type_refLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see benefits_type_refLocalService
 * @see com.iucn.whp.dbservice.service.base.benefits_type_refLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.benefits_type_refLocalServiceImpl
 * @generated
 */
public class benefits_type_refLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.benefits_type_refLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the benefits_type_ref to the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @return the benefits_type_ref that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref addbenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addbenefits_type_ref(benefits_type_ref);
	}

	/**
	* Creates a new benefits_type_ref with the primary key. Does not add the benefits_type_ref to the database.
	*
	* @param benefits_type_ref_id the primary key for the new benefits_type_ref
	* @return the new benefits_type_ref
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref createbenefits_type_ref(
		long benefits_type_ref_id) {
		return getService().createbenefits_type_ref(benefits_type_ref_id);
	}

	/**
	* Deletes the benefits_type_ref with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref that was removed
	* @throws PortalException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref deletebenefits_type_ref(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebenefits_type_ref(benefits_type_ref_id);
	}

	/**
	* Deletes the benefits_type_ref from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @return the benefits_type_ref that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref deletebenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletebenefits_type_ref(benefits_type_ref);
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

	public static com.iucn.whp.dbservice.model.benefits_type_ref fetchbenefits_type_ref(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchbenefits_type_ref(benefits_type_ref_id);
	}

	/**
	* Returns the benefits_type_ref with the primary key.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref
	* @throws PortalException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref getbenefits_type_ref(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefits_type_ref(benefits_type_ref_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the benefits_type_refs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of benefits_type_refs
	* @param end the upper bound of the range of benefits_type_refs (not inclusive)
	* @return the range of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> getbenefits_type_refs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefits_type_refs(start, end);
	}

	/**
	* Returns the number of benefits_type_refs.
	*
	* @return the number of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public static int getbenefits_type_refsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getbenefits_type_refsCount();
	}

	/**
	* Updates the benefits_type_ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @return the benefits_type_ref that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref updatebenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebenefits_type_ref(benefits_type_ref);
	}

	/**
	* Updates the benefits_type_ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @param merge whether to merge the benefits_type_ref with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefits_type_ref that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.benefits_type_ref updatebenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatebenefits_type_ref(benefits_type_ref, merge);
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

	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByBenefitsId(
		long BenefitsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByBenefitsId(BenefitsId);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByBenefitsIdAnBenefits_type_refs(
		long BenefitsId, long BenefitsTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByBenefitsIdAnBenefits_type_refs(BenefitsId,
			BenefitsTypeId);
	}

	public static void clearService() {
		_service = null;
	}

	public static benefits_type_refLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					benefits_type_refLocalService.class.getName());

			if (invokableLocalService instanceof benefits_type_refLocalService) {
				_service = (benefits_type_refLocalService)invokableLocalService;
			}
			else {
				_service = new benefits_type_refLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(benefits_type_refLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(benefits_type_refLocalService service) {
	}

	private static benefits_type_refLocalService _service;
}