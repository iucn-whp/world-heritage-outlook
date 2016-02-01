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
 * This class is a wrapper for {@link benefits_type_refLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefits_type_refLocalService
 * @generated
 */
public class benefits_type_refLocalServiceWrapper
	implements benefits_type_refLocalService,
		ServiceWrapper<benefits_type_refLocalService> {
	public benefits_type_refLocalServiceWrapper(
		benefits_type_refLocalService benefits_type_refLocalService) {
		_benefits_type_refLocalService = benefits_type_refLocalService;
	}

	/**
	* Adds the benefits_type_ref to the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @return the benefits_type_ref that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref addbenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.addbenefits_type_ref(benefits_type_ref);
	}

	/**
	* Creates a new benefits_type_ref with the primary key. Does not add the benefits_type_ref to the database.
	*
	* @param benefits_type_ref_id the primary key for the new benefits_type_ref
	* @return the new benefits_type_ref
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref createbenefits_type_ref(
		long benefits_type_ref_id) {
		return _benefits_type_refLocalService.createbenefits_type_ref(benefits_type_ref_id);
	}

	/**
	* Deletes the benefits_type_ref with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref that was removed
	* @throws PortalException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref deletebenefits_type_ref(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.deletebenefits_type_ref(benefits_type_ref_id);
	}

	/**
	* Deletes the benefits_type_ref from the database. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @return the benefits_type_ref that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref deletebenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.deletebenefits_type_ref(benefits_type_ref);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _benefits_type_refLocalService.dynamicQuery();
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
		return _benefits_type_refLocalService.dynamicQuery(dynamicQuery);
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
		return _benefits_type_refLocalService.dynamicQuery(dynamicQuery, start,
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
		return _benefits_type_refLocalService.dynamicQuery(dynamicQuery, start,
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
		return _benefits_type_refLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.benefits_type_ref fetchbenefits_type_ref(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.fetchbenefits_type_ref(benefits_type_ref_id);
	}

	/**
	* Returns the benefits_type_ref with the primary key.
	*
	* @param benefits_type_ref_id the primary key of the benefits_type_ref
	* @return the benefits_type_ref
	* @throws PortalException if a benefits_type_ref with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref getbenefits_type_ref(
		long benefits_type_ref_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.getbenefits_type_ref(benefits_type_ref_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> getbenefits_type_refs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.getbenefits_type_refs(start, end);
	}

	/**
	* Returns the number of benefits_type_refs.
	*
	* @return the number of benefits_type_refs
	* @throws SystemException if a system exception occurred
	*/
	public int getbenefits_type_refsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.getbenefits_type_refsCount();
	}

	/**
	* Updates the benefits_type_ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @return the benefits_type_ref that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref updatebenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.updatebenefits_type_ref(benefits_type_ref);
	}

	/**
	* Updates the benefits_type_ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param benefits_type_ref the benefits_type_ref
	* @param merge whether to merge the benefits_type_ref with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the benefits_type_ref that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.benefits_type_ref updatebenefits_type_ref(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.updatebenefits_type_ref(benefits_type_ref,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _benefits_type_refLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_benefits_type_refLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _benefits_type_refLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByBenefitsId(
		long BenefitsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.findByBenefitsId(BenefitsId);
	}

	public java.util.List<com.iucn.whp.dbservice.model.benefits_type_ref> findByBenefitsIdAnBenefits_type_refs(
		long BenefitsId, long BenefitsTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _benefits_type_refLocalService.findByBenefitsIdAnBenefits_type_refs(BenefitsId,
			BenefitsTypeId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public benefits_type_refLocalService getWrappedbenefits_type_refLocalService() {
		return _benefits_type_refLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedbenefits_type_refLocalService(
		benefits_type_refLocalService benefits_type_refLocalService) {
		_benefits_type_refLocalService = benefits_type_refLocalService;
	}

	public benefits_type_refLocalService getWrappedService() {
		return _benefits_type_refLocalService;
	}

	public void setWrappedService(
		benefits_type_refLocalService benefits_type_refLocalService) {
		_benefits_type_refLocalService = benefits_type_refLocalService;
	}

	private benefits_type_refLocalService _benefits_type_refLocalService;
}