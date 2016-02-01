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
 * This class is a wrapper for {@link iucn_region_countryLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       iucn_region_countryLocalService
 * @generated
 */
public class iucn_region_countryLocalServiceWrapper
	implements iucn_region_countryLocalService,
		ServiceWrapper<iucn_region_countryLocalService> {
	public iucn_region_countryLocalServiceWrapper(
		iucn_region_countryLocalService iucn_region_countryLocalService) {
		_iucn_region_countryLocalService = iucn_region_countryLocalService;
	}

	/**
	* Adds the iucn_region_country to the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_country the iucn_region_country
	* @return the iucn_region_country that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country addiucn_region_country(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.addiucn_region_country(iucn_region_country);
	}

	/**
	* Creates a new iucn_region_country with the primary key. Does not add the iucn_region_country to the database.
	*
	* @param whp_iucn_region_country_id the primary key for the new iucn_region_country
	* @return the new iucn_region_country
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country createiucn_region_country(
		int whp_iucn_region_country_id) {
		return _iucn_region_countryLocalService.createiucn_region_country(whp_iucn_region_country_id);
	}

	/**
	* Deletes the iucn_region_country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param whp_iucn_region_country_id the primary key of the iucn_region_country
	* @return the iucn_region_country that was removed
	* @throws PortalException if a iucn_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country deleteiucn_region_country(
		int whp_iucn_region_country_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.deleteiucn_region_country(whp_iucn_region_country_id);
	}

	/**
	* Deletes the iucn_region_country from the database. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_country the iucn_region_country
	* @return the iucn_region_country that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country deleteiucn_region_country(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.deleteiucn_region_country(iucn_region_country);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _iucn_region_countryLocalService.dynamicQuery();
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
		return _iucn_region_countryLocalService.dynamicQuery(dynamicQuery);
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
		return _iucn_region_countryLocalService.dynamicQuery(dynamicQuery,
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
		return _iucn_region_countryLocalService.dynamicQuery(dynamicQuery,
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
		return _iucn_region_countryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.iucn_region_country fetchiucn_region_country(
		int whp_iucn_region_country_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.fetchiucn_region_country(whp_iucn_region_country_id);
	}

	/**
	* Returns the iucn_region_country with the primary key.
	*
	* @param whp_iucn_region_country_id the primary key of the iucn_region_country
	* @return the iucn_region_country
	* @throws PortalException if a iucn_region_country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country getiucn_region_country(
		int whp_iucn_region_country_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.getiucn_region_country(whp_iucn_region_country_id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the iucn_region_countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of iucn_region_countries
	* @param end the upper bound of the range of iucn_region_countries (not inclusive)
	* @return the range of iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.iucn_region_country> getiucn_region_countries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.getiucn_region_countries(start,
			end);
	}

	/**
	* Returns the number of iucn_region_countries.
	*
	* @return the number of iucn_region_countries
	* @throws SystemException if a system exception occurred
	*/
	public int getiucn_region_countriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.getiucn_region_countriesCount();
	}

	/**
	* Updates the iucn_region_country in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_country the iucn_region_country
	* @return the iucn_region_country that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country updateiucn_region_country(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.updateiucn_region_country(iucn_region_country);
	}

	/**
	* Updates the iucn_region_country in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iucn_region_country the iucn_region_country
	* @param merge whether to merge the iucn_region_country with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the iucn_region_country that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.iucn_region_country updateiucn_region_country(
		com.iucn.whp.dbservice.model.iucn_region_country iucn_region_country,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iucn_region_countryLocalService.updateiucn_region_country(iucn_region_country,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _iucn_region_countryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_iucn_region_countryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _iucn_region_countryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public int getTotalCountriesCount() {
		return _iucn_region_countryLocalService.getTotalCountriesCount();
	}

	public java.util.List<java.lang.String> getCountryName(int region_id) {
		return _iucn_region_countryLocalService.getCountryName(region_id);
	}

	public java.util.List<com.iucn.whp.dbservice.model.country_lkp> getCountryObject(
		int region_id) {
		return _iucn_region_countryLocalService.getCountryObject(region_id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public iucn_region_countryLocalService getWrappediucn_region_countryLocalService() {
		return _iucn_region_countryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappediucn_region_countryLocalService(
		iucn_region_countryLocalService iucn_region_countryLocalService) {
		_iucn_region_countryLocalService = iucn_region_countryLocalService;
	}

	public iucn_region_countryLocalService getWrappedService() {
		return _iucn_region_countryLocalService;
	}

	public void setWrappedService(
		iucn_region_countryLocalService iucn_region_countryLocalService) {
		_iucn_region_countryLocalService = iucn_region_countryLocalService;
	}

	private iucn_region_countryLocalService _iucn_region_countryLocalService;
}