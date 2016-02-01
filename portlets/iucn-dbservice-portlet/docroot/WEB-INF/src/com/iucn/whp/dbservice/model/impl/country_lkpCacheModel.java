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

package com.iucn.whp.dbservice.model.impl;

import com.iucn.whp.dbservice.model.country_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing country_lkp in entity cache.
 *
 * @author alok.sen
 * @see country_lkp
 * @generated
 */
public class country_lkpCacheModel implements CacheModel<country_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{countryid=");
		sb.append(countryid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", a2=");
		sb.append(a2);
		sb.append(", a3=");
		sb.append(a3);
		sb.append(", number=");
		sb.append(number);
		sb.append(", idd=");
		sb.append(idd);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", ziprequired=");
		sb.append(ziprequired);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	public country_lkp toEntityModel() {
		country_lkpImpl country_lkpImpl = new country_lkpImpl();

		country_lkpImpl.setCountryid(countryid);

		if (name == null) {
			country_lkpImpl.setName(StringPool.BLANK);
		}
		else {
			country_lkpImpl.setName(name);
		}

		if (a2 == null) {
			country_lkpImpl.setA2(StringPool.BLANK);
		}
		else {
			country_lkpImpl.setA2(a2);
		}

		if (a3 == null) {
			country_lkpImpl.setA3(StringPool.BLANK);
		}
		else {
			country_lkpImpl.setA3(a3);
		}

		if (number == null) {
			country_lkpImpl.setNumber(StringPool.BLANK);
		}
		else {
			country_lkpImpl.setNumber(number);
		}

		if (idd == null) {
			country_lkpImpl.setIdd(StringPool.BLANK);
		}
		else {
			country_lkpImpl.setIdd(idd);
		}

		if (currency == null) {
			country_lkpImpl.setCurrency(StringPool.BLANK);
		}
		else {
			country_lkpImpl.setCurrency(currency);
		}

		country_lkpImpl.setZiprequired(ziprequired);
		country_lkpImpl.setActive(active);

		country_lkpImpl.resetOriginalValues();

		return country_lkpImpl;
	}

	public int countryid;
	public String name;
	public String a2;
	public String a3;
	public String number;
	public String idd;
	public String currency;
	public boolean ziprequired;
	public boolean active;
}