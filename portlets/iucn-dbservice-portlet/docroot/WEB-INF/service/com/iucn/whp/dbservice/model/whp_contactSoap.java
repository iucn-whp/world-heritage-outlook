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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    alok.sen
 * @generated
 */
public class whp_contactSoap implements Serializable {
	public static whp_contactSoap toSoapModel(whp_contact model) {
		whp_contactSoap soapModel = new whp_contactSoap();

		soapModel.setContact_id(model.getContact_id());
		soapModel.setPrefix(model.getPrefix());
		soapModel.setLast_name(model.getLast_name());
		soapModel.setFirst_name(model.getFirst_name());
		soapModel.setEmail(model.getEmail());
		soapModel.setPosition(model.getPosition());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setAddress(model.getAddress());
		soapModel.setTelephone(model.getTelephone());
		soapModel.setLast_updated(model.getLast_updated());
		soapModel.setCategoryid(model.getCategoryid());

		return soapModel;
	}

	public static whp_contactSoap[] toSoapModels(whp_contact[] models) {
		whp_contactSoap[] soapModels = new whp_contactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_contactSoap[][] toSoapModels(whp_contact[][] models) {
		whp_contactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_contactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_contactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_contactSoap[] toSoapModels(List<whp_contact> models) {
		List<whp_contactSoap> soapModels = new ArrayList<whp_contactSoap>(models.size());

		for (whp_contact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_contactSoap[soapModels.size()]);
	}

	public whp_contactSoap() {
	}

	public int getPrimaryKey() {
		return _contact_id;
	}

	public void setPrimaryKey(int pk) {
		setContact_id(pk);
	}

	public int getContact_id() {
		return _contact_id;
	}

	public void setContact_id(int contact_id) {
		_contact_id = contact_id;
	}

	public String getPrefix() {
		return _prefix;
	}

	public void setPrefix(String prefix) {
		_prefix = prefix;
	}

	public String getLast_name() {
		return _last_name;
	}

	public void setLast_name(String last_name) {
		_last_name = last_name;
	}

	public String getFirst_name() {
		return _first_name;
	}

	public void setFirst_name(String first_name) {
		_first_name = first_name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getTelephone() {
		return _telephone;
	}

	public void setTelephone(String telephone) {
		_telephone = telephone;
	}

	public Date getLast_updated() {
		return _last_updated;
	}

	public void setLast_updated(Date last_updated) {
		_last_updated = last_updated;
	}

	public int getCategoryid() {
		return _categoryid;
	}

	public void setCategoryid(int categoryid) {
		_categoryid = categoryid;
	}

	private int _contact_id;
	private String _prefix;
	private String _last_name;
	private String _first_name;
	private String _email;
	private String _position;
	private String _organization;
	private String _address;
	private String _telephone;
	private Date _last_updated;
	private int _categoryid;
}