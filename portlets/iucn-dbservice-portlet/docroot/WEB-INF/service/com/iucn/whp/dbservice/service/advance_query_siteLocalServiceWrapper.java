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
 * This class is a wrapper for {@link advance_query_siteLocalService}.
 * </p>
 *
 * @author    alok.sen
 * @see       advance_query_siteLocalService
 * @generated
 */
public class advance_query_siteLocalServiceWrapper
	implements advance_query_siteLocalService,
		ServiceWrapper<advance_query_siteLocalService> {
	public advance_query_siteLocalServiceWrapper(
		advance_query_siteLocalService advance_query_siteLocalService) {
		_advance_query_siteLocalService = advance_query_siteLocalService;
	}

	/**
	* Adds the advance_query_site to the database. Also notifies the appropriate model listeners.
	*
	* @param advance_query_site the advance_query_site
	* @return the advance_query_site that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site addadvance_query_site(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.addadvance_query_site(advance_query_site);
	}

	/**
	* Creates a new advance_query_site with the primary key. Does not add the advance_query_site to the database.
	*
	* @param id the primary key for the new advance_query_site
	* @return the new advance_query_site
	*/
	public com.iucn.whp.dbservice.model.advance_query_site createadvance_query_site(
		long id) {
		return _advance_query_siteLocalService.createadvance_query_site(id);
	}

	/**
	* Deletes the advance_query_site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site that was removed
	* @throws PortalException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site deleteadvance_query_site(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.deleteadvance_query_site(id);
	}

	/**
	* Deletes the advance_query_site from the database. Also notifies the appropriate model listeners.
	*
	* @param advance_query_site the advance_query_site
	* @return the advance_query_site that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site deleteadvance_query_site(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.deleteadvance_query_site(advance_query_site);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advance_query_siteLocalService.dynamicQuery();
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
		return _advance_query_siteLocalService.dynamicQuery(dynamicQuery);
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
		return _advance_query_siteLocalService.dynamicQuery(dynamicQuery,
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
		return _advance_query_siteLocalService.dynamicQuery(dynamicQuery,
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
		return _advance_query_siteLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.iucn.whp.dbservice.model.advance_query_site fetchadvance_query_site(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.fetchadvance_query_site(id);
	}

	/**
	* Returns the advance_query_site with the primary key.
	*
	* @param id the primary key of the advance_query_site
	* @return the advance_query_site
	* @throws PortalException if a advance_query_site with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site getadvance_query_site(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.getadvance_query_site(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the advance_query_sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of advance_query_sites
	* @param end the upper bound of the range of advance_query_sites (not inclusive)
	* @return the range of advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> getadvance_query_sites(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.getadvance_query_sites(start, end);
	}

	/**
	* Returns the number of advance_query_sites.
	*
	* @return the number of advance_query_sites
	* @throws SystemException if a system exception occurred
	*/
	public int getadvance_query_sitesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.getadvance_query_sitesCount();
	}

	/**
	* Updates the advance_query_site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advance_query_site the advance_query_site
	* @return the advance_query_site that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site updateadvance_query_site(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.updateadvance_query_site(advance_query_site);
	}

	/**
	* Updates the advance_query_site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advance_query_site the advance_query_site
	* @param merge whether to merge the advance_query_site with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the advance_query_site that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.iucn.whp.dbservice.model.advance_query_site updateadvance_query_site(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.updateadvance_query_site(advance_query_site,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _advance_query_siteLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_advance_query_siteLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _advance_query_siteLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.findAll();
	}

	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_cat_tab_name(
		java.lang.String base_tab_name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.findBybase_cat_tab_name(base_tab_name);
	}

	public com.iucn.whp.dbservice.model.advance_query_site findBybase_cat_tab_name(
		long id)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.findBybase_cat_tab_name(id);
	}

	public java.util.List<com.iucn.whp.dbservice.model.advance_query_site> findBybase_tab_diplay_name(
		java.lang.String base_search_val)
		throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advance_query_siteLocalService.findBybase_tab_diplay_name(base_search_val);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public advance_query_siteLocalService getWrappedadvance_query_siteLocalService() {
		return _advance_query_siteLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedadvance_query_siteLocalService(
		advance_query_siteLocalService advance_query_siteLocalService) {
		_advance_query_siteLocalService = advance_query_siteLocalService;
	}

	public advance_query_siteLocalService getWrappedService() {
		return _advance_query_siteLocalService;
	}

	public void setWrappedService(
		advance_query_siteLocalService advance_query_siteLocalService) {
		_advance_query_siteLocalService = advance_query_siteLocalService;
	}

	private advance_query_siteLocalService _advance_query_siteLocalService;
}