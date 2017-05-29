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

package com.iucn.whp.dbservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class protection_mgmt_checklist_lkpSoap implements Serializable {
	public static protection_mgmt_checklist_lkpSoap toSoapModel(
		protection_mgmt_checklist_lkp model) {
		protection_mgmt_checklist_lkpSoap soapModel = new protection_mgmt_checklist_lkpSoap();

		soapModel.setTopic_id(model.getTopic_id());
		soapModel.setTopic(model.getTopic());
		soapModel.setTopic_sort(model.getTopic_sort());

		return soapModel;
	}

	public static protection_mgmt_checklist_lkpSoap[] toSoapModels(
		protection_mgmt_checklist_lkp[] models) {
		protection_mgmt_checklist_lkpSoap[] soapModels = new protection_mgmt_checklist_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static protection_mgmt_checklist_lkpSoap[][] toSoapModels(
		protection_mgmt_checklist_lkp[][] models) {
		protection_mgmt_checklist_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new protection_mgmt_checklist_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new protection_mgmt_checklist_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static protection_mgmt_checklist_lkpSoap[] toSoapModels(
		List<protection_mgmt_checklist_lkp> models) {
		List<protection_mgmt_checklist_lkpSoap> soapModels = new ArrayList<protection_mgmt_checklist_lkpSoap>(models.size());

		for (protection_mgmt_checklist_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new protection_mgmt_checklist_lkpSoap[soapModels.size()]);
	}

	public protection_mgmt_checklist_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _topic_id;
	}

	public void setPrimaryKey(long pk) {
		setTopic_id(pk);
	}

	public long getTopic_id() {
		return _topic_id;
	}

	public void setTopic_id(long topic_id) {
		_topic_id = topic_id;
	}

	public String getTopic() {
		return _topic;
	}

	public void setTopic(String topic) {
		_topic = topic;
	}

	public int getTopic_sort() {
		return _topic_sort;
	}

	public void setTopic_sort(int topic_sort) {
		_topic_sort = topic_sort;
	}

	private long _topic_id;
	private String _topic;
	private int _topic_sort;
}