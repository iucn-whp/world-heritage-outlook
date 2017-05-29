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
 * This class is a wrapper for {@link whp_sites_flagship_speciesLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_flagship_speciesLocalService
 * @generated
 */
public class whp_sites_flagship_speciesLocalServiceWrapper
	implements whp_sites_flagship_speciesLocalService,
		ServiceWrapper<whp_sites_flagship_speciesLocalService> {
	public whp_sites_flagship_speciesLocalServiceWrapper(
		whp_sites_flagship_speciesLocalService whp_sites_flagship_speciesLocalService) {
		_whp_sites_flagship_speciesLocalService = whp_sites_flagship_speciesLocalService;
	}

	/**
	* Adds the whp_sites_flagship_species to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_flagship_species the whp_sites_flagship_species
	* @return the whp_sites_flagship_species that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species addwhp_sites_flagship_species(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.addwhp_sites_flagship_species(whp_sites_flagship_species);
	}

	/**
	* Creates a new whp_sites_flagship_species with the primary key. Does not add the whp_sites_flagship_species to the database.
	*
	* @param whp_sites_flagship_species_id the primary key for the new whp_sites_flagship_species
	* @return the new whp_sites_flagship_species
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species createwhp_sites_flagship_species(
		long whp_sites_flagship_species_id) {
		return _whp_sites_flagship_speciesLocalService.createwhp_sites_flagship_species(whp_sites_flagship_species_id);
	}

	/**
	* Deletes the whp_sites_flagship_species with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_flagship_species_id the primary key of the whp_sites_flagship_species
	* @return the whp_sites_flagship_species that was removed
	* @throws PortalException if a whp_sites_flagship_species with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species deletewhp_sites_flagship_species(
		long whp_sites_flagship_species_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.deletewhp_sites_flagship_species(whp_sites_flagship_species_id);
	}

	/**
	* Deletes the whp_sites_flagship_species from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_flagship_species the whp_sites_flagship_species
	* @return the whp_sites_flagship_species that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species deletewhp_sites_flagship_species(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.deletewhp_sites_flagship_species(whp_sites_flagship_species);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_flagship_speciesLocalService.dynamicQuery();
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
		return _whp_sites_flagship_speciesLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_flagship_speciesLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
		return _whp_sites_flagship_speciesLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _whp_sites_flagship_speciesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_flagship_species fetchwhp_sites_flagship_species(
		long whp_sites_flagship_species_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.fetchwhp_sites_flagship_species(whp_sites_flagship_species_id);
	}

	/**
	* Returns the whp_sites_flagship_species with the primary key.
	*
	* @param whp_sites_flagship_species_id the primary key of the whp_sites_flagship_species
	* @return the whp_sites_flagship_species
	* @throws PortalException if a whp_sites_flagship_species with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species getwhp_sites_flagship_species(
		long whp_sites_flagship_species_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.getwhp_sites_flagship_species(whp_sites_flagship_species_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_flagship_specieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_flagship_specieses
	* @param end the upper bound of the range of whp_sites_flagship_specieses (not inclusive)
	* @return the range of whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.getwhp_sites_flagship_specieses(start,
			end);
	}

	/**
	* Returns the number of whp_sites_flagship_specieses.
	*
	* @return the number of whp_sites_flagship_specieses
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_flagship_speciesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.getwhp_sites_flagship_speciesesCount();
	}

	/**
	* Updates the whp_sites_flagship_species in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_flagship_species the whp_sites_flagship_species
	* @return the whp_sites_flagship_species that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species updatewhp_sites_flagship_species(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.updatewhp_sites_flagship_species(whp_sites_flagship_species);
	}

	/**
	* Updates the whp_sites_flagship_species in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_flagship_species the whp_sites_flagship_species
	* @param merge whether to merge the whp_sites_flagship_species with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_flagship_species that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_flagship_species updatewhp_sites_flagship_species(
		com.iucn.whp.dbservice.model.whp_sites_flagship_species whp_sites_flagship_species,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_flagship_speciesLocalService.updatewhp_sites_flagship_species(whp_sites_flagship_species,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_flagship_speciesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_flagship_speciesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_flagship_speciesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_flagship_speciesLocalService getWrappedwhp_sites_flagship_speciesLocalService() {
		return _whp_sites_flagship_speciesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_flagship_speciesLocalService(
		whp_sites_flagship_speciesLocalService whp_sites_flagship_speciesLocalService) {
		_whp_sites_flagship_speciesLocalService = whp_sites_flagship_speciesLocalService;
	}

	public whp_sites_flagship_speciesLocalService getWrappedService() {
		return _whp_sites_flagship_speciesLocalService;
	}

	public void setWrappedService(
		whp_sites_flagship_speciesLocalService whp_sites_flagship_speciesLocalService) {
		_whp_sites_flagship_speciesLocalService = whp_sites_flagship_speciesLocalService;
	}

	private whp_sites_flagship_speciesLocalService _whp_sites_flagship_speciesLocalService;
}