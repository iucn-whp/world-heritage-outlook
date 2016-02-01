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
public class assessment_lang_lkpSoap implements Serializable {
	public static assessment_lang_lkpSoap toSoapModel(assessment_lang_lkp model) {
		assessment_lang_lkpSoap soapModel = new assessment_lang_lkpSoap();

		soapModel.setLanguageid(model.getLanguageid());
		soapModel.setLanguagecode(model.getLanguagecode());
		soapModel.setLanguagename(model.getLanguagename());

		return soapModel;
	}

	public static assessment_lang_lkpSoap[] toSoapModels(
		assessment_lang_lkp[] models) {
		assessment_lang_lkpSoap[] soapModels = new assessment_lang_lkpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static assessment_lang_lkpSoap[][] toSoapModels(
		assessment_lang_lkp[][] models) {
		assessment_lang_lkpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new assessment_lang_lkpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new assessment_lang_lkpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static assessment_lang_lkpSoap[] toSoapModels(
		List<assessment_lang_lkp> models) {
		List<assessment_lang_lkpSoap> soapModels = new ArrayList<assessment_lang_lkpSoap>(models.size());

		for (assessment_lang_lkp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new assessment_lang_lkpSoap[soapModels.size()]);
	}

	public assessment_lang_lkpSoap() {
	}

	public long getPrimaryKey() {
		return _languageid;
	}

	public void setPrimaryKey(long pk) {
		setLanguageid(pk);
	}

	public long getLanguageid() {
		return _languageid;
	}

	public void setLanguageid(long languageid) {
		_languageid = languageid;
	}

	public String getLanguagecode() {
		return _languagecode;
	}

	public void setLanguagecode(String languagecode) {
		_languagecode = languagecode;
	}

	public String getLanguagename() {
		return _languagename;
	}

	public void setLanguagename(String languagename) {
		_languagename = languagename;
	}

	private long _languageid;
	private String _languagecode;
	private String _languagename;
}