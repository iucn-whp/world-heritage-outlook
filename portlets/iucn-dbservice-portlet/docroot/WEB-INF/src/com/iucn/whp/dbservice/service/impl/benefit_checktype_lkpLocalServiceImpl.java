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

import com.iucn.whp.dbservice.model.benefit_checktype_lkp;
import com.iucn.whp.dbservice.service.base.benefit_checktype_lkpLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The implementation of the benefit_checktype_lkp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.benefit_checktype_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil
 */
public class benefit_checktype_lkpLocalServiceImpl
	extends benefit_checktype_lkpLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil} to access the benefit_checktype_lkp local service.
	 */


	public List<benefit_checktype_lkp> findBenefitCheckTypeByActiveStatus(boolean active_) throws SystemException {
		List<benefit_checktype_lkp> benefitChecktypeLkpList = benefit_checktype_lkpPersistence.findByActiveStatus(active_);

		List<benefit_checktype_lkp> sortedList = new ArrayList<benefit_checktype_lkp>();
		sortedList.addAll(benefitChecktypeLkpList);

		Collections.sort(sortedList, new Comparator<benefit_checktype_lkp>() {
			@Override
			public int compare(benefit_checktype_lkp o1, benefit_checktype_lkp o2) {
				return (int) (o1.getBenefit_id() - o2.getBenefit_id());
			}
		});

		return sortedList;
	}
	
	public List<benefit_checktype_lkp> findAll()
	throws PortalException, SystemException {
		
		return benefit_checktype_lkpPersistence.findAll();
		
		
	
	}
	
	
	
}