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
public class referencesSoap implements Serializable {
	public static referencesSoap toSoapModel(references model) {
		referencesSoap soapModel = new referencesSoap();

		soapModel.setReference_id(model.getReference_id());
		soapModel.setAssessment_version_id(model.getAssessment_version_id());
		soapModel.setRn(model.getRn());
		soapModel.setReferences(model.getReferences());

		return soapModel;
	}

	public static referencesSoap[] toSoapModels(references[] models) {
		referencesSoap[] soapModels = new referencesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static referencesSoap[][] toSoapModels(references[][] models) {
		referencesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new referencesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new referencesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static referencesSoap[] toSoapModels(List<references> models) {
		List<referencesSoap> soapModels = new ArrayList<referencesSoap>(models.size());

		for (references model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new referencesSoap[soapModels.size()]);
	}

	public referencesSoap() {
	}

	public long getPrimaryKey() {
		return _reference_id;
	}

	public void setPrimaryKey(long pk) {
		setReference_id(pk);
	}

	public long getReference_id() {
		return _reference_id;
	}

	public void setReference_id(long reference_id) {
		_reference_id = reference_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getRn() {
		return _rn;
	}

	public void setRn(long rn) {
		_rn = rn;
	}

	public String getReferences() {
		return _references;
	}

	public void setReferences(String references) {
		_references = references;
	}

	private long _reference_id;
	private long _assessment_version_id;
	private long _rn;
	private String _references;
}