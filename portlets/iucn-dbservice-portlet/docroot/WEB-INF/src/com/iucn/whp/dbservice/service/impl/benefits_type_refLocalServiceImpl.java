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

package com.iucn.whp.dbservice.service.impl;

import java.util.List;

import com.iucn.whp.dbservice.model.benefits_type_ref;
import com.iucn.whp.dbservice.service.base.benefits_type_refLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.benefits_type_refUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the benefits_type_ref local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.benefits_type_refLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.benefits_type_refLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.benefits_type_refLocalServiceUtil
 */
public class benefits_type_refLocalServiceImpl
	extends benefits_type_refLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.benefits_type_refLocalServiceUtil} to access the benefits_type_ref local service.
	 */
	
	public List<benefits_type_ref> findByBenefitsId(long BenefitsId) throws SystemException{
		return benefits_type_refUtil.findByByBenefits_id(BenefitsId);
	}
	
	public List<benefits_type_ref> findByBenefitsIdAnBenefits_type_refs(long BenefitsId,long BenefitsTypeId) throws SystemException{
		return benefits_type_refUtil.findBytypeId(BenefitsId, BenefitsTypeId);
	}
	
	
}