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

import com.iucn.whp.dbservice.model.state_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing state_lkp in entity cache.
 *
 * @author alok.sen
 * @see state_lkp
 * @generated
 */
public class state_lkpCacheModel implements CacheModel<state_lkp>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{state_id=");
		sb.append(state_id);
		sb.append(", state=");
		sb.append(state);
		sb.append("}");

		return sb.toString();
	}

	public state_lkp toEntityModel() {
		state_lkpImpl state_lkpImpl = new state_lkpImpl();

		state_lkpImpl.setState_id(state_id);

		if (state == null) {
			state_lkpImpl.setState(StringPool.BLANK);
		}
		else {
			state_lkpImpl.setState(state);
		}

		state_lkpImpl.resetOriginalValues();

		return state_lkpImpl;
	}

	public long state_id;
	public String state;
}