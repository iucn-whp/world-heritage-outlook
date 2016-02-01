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
 * This class is a wrapper for {@link whp_sites_countryLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_countryLocalService
 * @generated
 */
public class whp_sites_countryLocalServiceWrapper
	implements whp_sites_countryLocalService,
		ServiceWrapper<whp_sites_countryLocalService> {
	public whp_sites_countryLocalServiceWrapper(
		whp_sites_countryLocalService whp_sites_countryLocalService) {
		_whp_sites_countryLocalService = whp_sites_countryLocalService;
	}

	/**
	* Adds the whp_sites_country to the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country the whp_sites_country
	* @return the whp_sites_country that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country addwhp_sites_country(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.addwhp_sites_country(whp_sites_country);
	}

	/**
	* Creates a new whp_sites_country with the primary key. Does not add the whp_sites_country to the database.
	*
	* @param whp_sites_country_id the primary key for the new whp_sites_country
	* @return the new whp_sites_country
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country createwhp_sites_country(
		long whp_sites_country_id) {
		return _whp_sites_countryLocalService.createwhp_sites_country(whp_sites_country_id);
	}

	/**
	* Deletes the whp_sites_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country that was removed
	* @throws PortalException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country deletewhp_sites_country(
		long whp_sites_country_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.deletewhp_sites_country(whp_sites_country_id);
	}

	/**
	* Deletes the whp_sites_country from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country the whp_sites_country
	* @return the whp_sites_country that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country deletewhp_sites_country(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.deletewhp_sites_country(whp_sites_country);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _whp_sites_countryLocalService.dynamicQuery();
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
		return _whp_sites_countryLocalService.dynamicQuery(dynamicQuery);
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
		return _whp_sites_countryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_sites_countryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _whp_sites_countryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.whp_sites_country fetchwhp_sites_country(
		long whp_sites_country_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.fetchwhp_sites_country(whp_sites_country_id);
	}

	/**
	* Returns the whp_sites_country with the primary key.
	*
	* @param whp_sites_country_id the primary key of the whp_sites_country
	* @return the whp_sites_country
	* @throws PortalException if a whp_sites_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country getwhp_sites_country(
		long whp_sites_country_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.getwhp_sites_country(whp_sites_country_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the whp_sites_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of whp_sites_countries
	* @param end the upper bound of the range of whp_sites_countries (not inclusive)
	* @return the range of whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.getwhp_sites_countries(start, end);
	}

	/**
	* Returns the number of whp_sites_countries.
	*
	* @return the number of whp_sites_countries
	* @throws SystemException if a system exception occurred
	*/
	public int getwhp_sites_countriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.getwhp_sites_countriesCount();
	}

	/**
	* Updates the whp_sites_country in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country the whp_sites_country
	* @return the whp_sites_country that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country updatewhp_sites_country(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.updatewhp_sites_country(whp_sites_country);
	}

	/**
	* Updates the whp_sites_country in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param whp_sites_country the whp_sites_country
	* @param merge whether to merge the whp_sites_country with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the whp_sites_country that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.whp_sites_country updatewhp_sites_country(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.updatewhp_sites_country(whp_sites_country,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _whp_sites_countryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_whp_sites_countryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _whp_sites_countryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the Countries associated with the siteID.
	*
	* @param
	* @return
	* @throws
	* @throws
	*/
	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> getCountryBySiteCountryList(
		java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> siteCountries)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites_countryLocalService.getCountryBySiteCountryList(siteCountries);
	}

	public int getTotalSites(int countryid) {
		return _whp_sites_countryLocalService.getTotalSites(countryid);
	}

	public java.util.List<com.iucn.whp.dbservice.model.whp_sites_country> getSitesbyCountryId(
		int countryId) {
		return _whp_sites_countryLocalService.getSitesbyCountryId(countryId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public whp_sites_countryLocalService getWrappedwhp_sites_countryLocalService() {
		return _whp_sites_countryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedwhp_sites_countryLocalService(
		whp_sites_countryLocalService whp_sites_countryLocalService) {
		_whp_sites_countryLocalService = whp_sites_countryLocalService;
	}

	public whp_sites_countryLocalService getWrappedService() {
		return _whp_sites_countryLocalService;
	}

	public void setWrappedService(
		whp_sites_countryLocalService whp_sites_countryLocalService) {
		_whp_sites_countryLocalService = whp_sites_countryLocalService;
	}

	private whp_sites_countryLocalService _whp_sites_countryLocalService;
}