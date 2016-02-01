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

import com.iucn.whp.dbservice.model.current_threat_values;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing current_threat_values in entity cache.
 *
 * @author alok.sen
 * @see current_threat_values
 * @generated
 */
public class current_threat_valuesCacheModel implements CacheModel<current_threat_values>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{current_threat_values_id=");
		sb.append(current_threat_values_id);
		sb.append(", current_threat_id=");
		sb.append(current_threat_id);
		sb.append(", whvalues_id=");
		sb.append(whvalues_id);
		sb.append(", is_biodiv_whval=");
		sb.append(is_biodiv_whval);
		sb.append("}");

		return sb.toString();
	}

	public current_threat_values toEntityModel() {
		current_threat_valuesImpl current_threat_valuesImpl = new current_threat_valuesImpl();

		current_threat_valuesImpl.setCurrent_threat_values_id(current_threat_values_id);
		current_threat_valuesImpl.setCurrent_threat_id(current_threat_id);
		current_threat_valuesImpl.setWhvalues_id(whvalues_id);
		current_threat_valuesImpl.setIs_biodiv_whval(is_biodiv_whval);

		current_threat_valuesImpl.resetOriginalValues();

		return current_threat_valuesImpl;
	}

	public long current_threat_values_id;
	public long current_threat_id;
	public long whvalues_id;
	public boolean is_biodiv_whval;
}