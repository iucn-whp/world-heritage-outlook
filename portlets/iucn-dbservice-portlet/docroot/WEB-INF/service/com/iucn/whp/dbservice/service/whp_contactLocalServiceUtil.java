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
 * The utility for the whp_contact local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.whp_contactLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see whp_contactLocalService
 * @see com.iucn.whp.dbservice.service.base.whp_contactLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.whp_contactLocalServiceImpl
 * @generated
 */
public class whp_contactLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.whp_contactLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the whp_contact to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_contact the whp_contact
	* @return the whp_contact that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact addwhp_contact(
		com.iucn.whp.dbservice.model.whp_contact whp_contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addwhp_contact(whp_contact);
	}

	/**
	* Creates a new whp_contact with the primary key. Does not add the whp_contact to the database.
	*
	* @param contact_id the primary key for the new whp_contact
	* @return the new whp_contact
	*/
	public static com.iucn.whp.dbservice.model.whp_contact createwhp_contact(
		int contact_id) {
		return getService().createwhp_contact(contact_id);
	}

	/**
	* Deletes the whp_contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact that was removed
	* @throws PortalException if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact deletewhp_contact(
		int contact_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_contact(contact_id);
	}

	/**
	* Deletes the whp_contact from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_contact the whp_contact
	* @return the whp_contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact deletewhp_contact(
		com.iucn.whp.dbservice.model.whp_contact whp_contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletewhp_contact(whp_contact);
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

	public static com.iucn.whp.dbservice.model.whp_contact fetchwhp_contact(
		int contact_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchwhp_contact(contact_id);
	}

	/**
	* Returns the whp_contact with the primary key.
	*
	* @param contact_id the primary key of the whp_contact
	* @return the whp_contact
	* @throws PortalException if a whp_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact getwhp_contact(
		int contact_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_contact(contact_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_contacts
	* @param end the upper bound of the range of whp_contacts (not inclusive)
	* @return the range of whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_contact> getwhp_contacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_contacts(start, end);
	}

	/**
	* Returns the number of whp_contacts.
	*
	* @return the number of whp_contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int getwhp_contactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getwhp_contactsCount();
	}

	/**
	* Updates the whp_contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_contact the whp_contact
	* @return the whp_contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact updatewhp_contact(
		com.iucn.whp.dbservice.model.whp_contact whp_contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_contact(whp_contact);
	}

	/**
	* Updates the whp_contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_contact the whp_contact
	* @param merge whether to merge the whp_contact with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.whp_contact updatewhp_contact(
		com.iucn.whp.dbservice.model.whp_contact whp_contact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatewhp_contact(whp_contact, merge);
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

	/**
	* Mee
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.whp_contact> getAllContact()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllContact();
	}

	public static void clearService() {
		_service = null;
	}

	public static whp_contactLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					whp_contactLocalService.class.getName());

			if (invokableLocalService instanceof whp_contactLocalService) {
				_service = (whp_contactLocalService)invokableLocalService;
			}
			else {
				_service = new whp_contactLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(whp_contactLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(whp_contactLocalService service) {
	}

	private static whp_contactLocalService _service;
}