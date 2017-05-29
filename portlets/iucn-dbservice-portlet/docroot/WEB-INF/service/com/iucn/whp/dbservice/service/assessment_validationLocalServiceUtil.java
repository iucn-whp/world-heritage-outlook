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
 * The utility for the assessment_validation local service. This utility wraps {@link com.iucn.whp.dbservice.service.impl.assessment_validationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see assessment_validationLocalService
 * @see com.iucn.whp.dbservice.service.base.assessment_validationLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.impl.assessment_validationLocalServiceImpl
 * @generated
 */
public class assessment_validationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.iucn.whp.dbservice.service.impl.assessment_validationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the assessment_validation to the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_validation the assessment_validation
	* @return the assessment_validation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation addassessment_validation(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addassessment_validation(assessment_validation);
	}

	/**
	* Creates a new assessment_validation with the primary key. Does not add the assessment_validation to the database.
	*
	* @param assessment_ver_val_id the primary key for the new assessment_validation
	* @return the new assessment_validation
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation createassessment_validation(
		long assessment_ver_val_id) {
		return getService().createassessment_validation(assessment_ver_val_id);
	}

	/**
	* Deletes the assessment_validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation that was removed
	* @throws PortalException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation deleteassessment_validation(
		long assessment_ver_val_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteassessment_validation(assessment_ver_val_id);
	}

	/**
	* Deletes the assessment_validation from the database. Also notifies the appropriate model listeners.
	*
	* @param assessment_validation the assessment_validation
	* @return the assessment_validation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation deleteassessment_validation(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteassessment_validation(assessment_validation);
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

	public static com.iucn.whp.dbservice.model.assessment_validation fetchassessment_validation(
		long assessment_ver_val_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchassessment_validation(assessment_ver_val_id);
	}

	/**
	* Returns the assessment_validation with the primary key.
	*
	* @param assessment_ver_val_id the primary key of the assessment_validation
	* @return the assessment_validation
	* @throws PortalException if a assessment_validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation getassessment_validation(
		long assessment_ver_val_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessment_validation(assessment_ver_val_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment_validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of assessment_validations
	* @param end the upper bound of the range of assessment_validations (not inclusive)
	* @return the range of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> getassessment_validations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessment_validations(start, end);
	}

	/**
	* Returns the number of assessment_validations.
	*
	* @return the number of assessment_validations
	* @throws SystemException if a system exception occurred
	*/
	public static int getassessment_validationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getassessment_validationsCount();
	}

	/**
	* Updates the assessment_validation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_validation the assessment_validation
	* @return the assessment_validation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation updateassessment_validation(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateassessment_validation(assessment_validation);
	}

	/**
	* Updates the assessment_validation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessment_validation the assessment_validation
	* @param merge whether to merge the assessment_validation with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the assessment_validation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.iucn.whp.dbservice.model.assessment_validation updateassessment_validation(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateassessment_validation(assessment_validation, merge);
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

	public static com.iucn.whp.dbservice.model.assessment_validation getStepValidationStatus(
		java.lang.Long versionId, long stepNum)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStepValidationStatus(versionId, stepNum);
	}

	public static java.util.List<com.iucn.whp.dbservice.model.assessment_validation> getAssessmentValbyVersionId(
		long assessment_version_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentValbyVersionId(assessment_version_id);
	}

	public static void clearService() {
		_service = null;
	}

	public static assessment_validationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					assessment_validationLocalService.class.getName());

			if (invokableLocalService instanceof assessment_validationLocalService) {
				_service = (assessment_validationLocalService)invokableLocalService;
			}
			else {
				_service = new assessment_validationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(assessment_validationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(assessment_validationLocalService service) {
	}

	private static assessment_validationLocalService _service;
}