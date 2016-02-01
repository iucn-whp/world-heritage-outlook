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

import com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing protection_mgmt_checklist_lkp in entity cache.
 *
 * @author alok.sen
 * @see protection_mgmt_checklist_lkp
 * @generated
 */
public class protection_mgmt_checklist_lkpCacheModel implements CacheModel<protection_mgmt_checklist_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{topic_id=");
		sb.append(topic_id);
		sb.append(", topic=");
		sb.append(topic);
		sb.append("}");

		return sb.toString();
	}

	public protection_mgmt_checklist_lkp toEntityModel() {
		protection_mgmt_checklist_lkpImpl protection_mgmt_checklist_lkpImpl = new protection_mgmt_checklist_lkpImpl();

		protection_mgmt_checklist_lkpImpl.setTopic_id(topic_id);

		if (topic == null) {
			protection_mgmt_checklist_lkpImpl.setTopic(StringPool.BLANK);
		}
		else {
			protection_mgmt_checklist_lkpImpl.setTopic(topic);
		}

		protection_mgmt_checklist_lkpImpl.resetOriginalValues();

		return protection_mgmt_checklist_lkpImpl;
	}

	public long topic_id;
	public String topic;
}