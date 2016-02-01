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
public class sites_thematicSoap implements Serializable {
	public static sites_thematicSoap toSoapModel(sites_thematic model) {
		sites_thematicSoap soapModel = new sites_thematicSoap();

		soapModel.setSitethematicid(model.getSitethematicid());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setThematicid(model.getThematicid());

		return soapModel;
	}

	public static sites_thematicSoap[] toSoapModels(sites_thematic[] models) {
		sites_thematicSoap[] soapModels = new sites_thematicSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static sites_thematicSoap[][] toSoapModels(sites_thematic[][] models) {
		sites_thematicSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new sites_thematicSoap[models.length][models[0].length];
		}
		else {
			soapModels = new sites_thematicSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static sites_thematicSoap[] toSoapModels(List<sites_thematic> models) {
		List<sites_thematicSoap> soapModels = new ArrayList<sites_thematicSoap>(models.size());

		for (sites_thematic model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new sites_thematicSoap[soapModels.size()]);
	}

	public sites_thematicSoap() {
	}

	public long getPrimaryKey() {
		return _sitethematicid;
	}

	public void setPrimaryKey(long pk) {
		setSitethematicid(pk);
	}

	public long getSitethematicid() {
		return _sitethematicid;
	}

	public void setSitethematicid(long sitethematicid) {
		_sitethematicid = sitethematicid;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getThematicid() {
		return _thematicid;
	}

	public void setThematicid(long thematicid) {
		_thematicid = thematicid;
	}

	private long _sitethematicid;
	private long _site_id;
	private long _thematicid;
}