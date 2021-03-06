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

import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;
import com.iucn.whp.dbservice.service.base.benefit_checksubtype_lkpLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The implementation of the benefit_checksubtype_lkp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.benefit_checksubtype_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.benefit_checksubtype_lkpLocalServiceUtil
 */
public class benefit_checksubtype_lkpLocalServiceImpl
	extends benefit_checksubtype_lkpLocalServiceBaseImpl {


	public List<benefit_checksubtype_lkp> findBenefitCheckSubTypeByActiveStatus(boolean active_) throws SystemException {
		List<benefit_checksubtype_lkp> benefitChecksubtypeLkps = benefit_checksubtype_lkpPersistence.findByActiveStatus(active_);
		List<benefit_checksubtype_lkp> sortedList = new ArrayList<benefit_checksubtype_lkp>();
		sortedList.addAll(benefitChecksubtypeLkps);

		Collections.sort(sortedList, new Comparator<benefit_checksubtype_lkp>() {
			@Override
			public int compare(benefit_checksubtype_lkp o1, benefit_checksubtype_lkp o2) {
				return (int) (o1.getSubbenefit_id() - o2.getSubbenefit_id());
			}
		});

		return sortedList;
	}
	

	public List<benefit_checksubtype_lkp> findAll()
	throws PortalException, SystemException {
		
		return benefit_checksubtype_lkpPersistence.findAll();
		
		
	
	}
	
	
}