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

import com.iucn.whp.dbservice.model.current_state_trend_values;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing current_state_trend_values in entity cache.
 *
 * @author alok.sen
 * @see current_state_trend_values
 * @generated
 */
public class current_state_trend_valuesCacheModel implements CacheModel<current_state_trend_values>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vn=");
		sb.append(vn);
		sb.append(", whvalues_id=");
		sb.append(whvalues_id);
		sb.append(", state_trend_id=");
		sb.append(state_trend_id);
		sb.append("}");

		return sb.toString();
	}

	public current_state_trend_values toEntityModel() {
		current_state_trend_valuesImpl current_state_trend_valuesImpl = new current_state_trend_valuesImpl();

		current_state_trend_valuesImpl.setId(id);
		current_state_trend_valuesImpl.setVn(vn);
		current_state_trend_valuesImpl.setWhvalues_id(whvalues_id);
		current_state_trend_valuesImpl.setState_trend_id(state_trend_id);

		current_state_trend_valuesImpl.resetOriginalValues();

		return current_state_trend_valuesImpl;
	}

	public long id;
	public long vn;
	public long whvalues_id;
	public long state_trend_id;
}