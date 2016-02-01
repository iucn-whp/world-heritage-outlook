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

import com.iucn.whp.dbservice.model.whp_sites_budget;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites_budget in entity cache.
 *
 * @author alok.sen
 * @see whp_sites_budget
 * @generated
 */
public class whp_sites_budgetCacheModel implements CacheModel<whp_sites_budget>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{whp_sites_budget_id=");
		sb.append(whp_sites_budget_id);
		sb.append(", site_id=");
		sb.append(site_id);
		sb.append(", currency_local=");
		sb.append(currency_local);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", currency_usd=");
		sb.append(currency_usd);
		sb.append(", date=");
		sb.append(date);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites_budget toEntityModel() {
		whp_sites_budgetImpl whp_sites_budgetImpl = new whp_sites_budgetImpl();

		whp_sites_budgetImpl.setWhp_sites_budget_id(whp_sites_budget_id);
		whp_sites_budgetImpl.setSite_id(site_id);
		whp_sites_budgetImpl.setCurrency_local(currency_local);

		if (currency == null) {
			whp_sites_budgetImpl.setCurrency(StringPool.BLANK);
		}
		else {
			whp_sites_budgetImpl.setCurrency(currency);
		}

		whp_sites_budgetImpl.setCurrency_usd(currency_usd);

		if (date == Long.MIN_VALUE) {
			whp_sites_budgetImpl.setDate(null);
		}
		else {
			whp_sites_budgetImpl.setDate(new Date(date));
		}

		whp_sites_budgetImpl.resetOriginalValues();

		return whp_sites_budgetImpl;
	}

	public long whp_sites_budget_id;
	public long site_id;
	public double currency_local;
	public String currency;
	public double currency_usd;
	public long date;
}