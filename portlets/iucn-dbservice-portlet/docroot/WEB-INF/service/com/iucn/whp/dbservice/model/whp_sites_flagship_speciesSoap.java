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
public class whp_sites_flagship_speciesSoap implements Serializable {
	public static whp_sites_flagship_speciesSoap toSoapModel(
		whp_sites_flagship_species model) {
		whp_sites_flagship_speciesSoap soapModel = new whp_sites_flagship_speciesSoap();

		soapModel.setWhp_sites_flagship_species_id(model.getWhp_sites_flagship_species_id());
		soapModel.setSite_id(model.getSite_id());
		soapModel.setFlagship_species_id(model.getFlagship_species_id());

		return soapModel;
	}

	public static whp_sites_flagship_speciesSoap[] toSoapModels(
		whp_sites_flagship_species[] models) {
		whp_sites_flagship_speciesSoap[] soapModels = new whp_sites_flagship_speciesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_flagship_speciesSoap[][] toSoapModels(
		whp_sites_flagship_species[][] models) {
		whp_sites_flagship_speciesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sites_flagship_speciesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sites_flagship_speciesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sites_flagship_speciesSoap[] toSoapModels(
		List<whp_sites_flagship_species> models) {
		List<whp_sites_flagship_speciesSoap> soapModels = new ArrayList<whp_sites_flagship_speciesSoap>(models.size());

		for (whp_sites_flagship_species model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sites_flagship_speciesSoap[soapModels.size()]);
	}

	public whp_sites_flagship_speciesSoap() {
	}

	public long getPrimaryKey() {
		return _whp_sites_flagship_species_id;
	}

	public void setPrimaryKey(long pk) {
		setWhp_sites_flagship_species_id(pk);
	}

	public long getWhp_sites_flagship_species_id() {
		return _whp_sites_flagship_species_id;
	}

	public void setWhp_sites_flagship_species_id(
		long whp_sites_flagship_species_id) {
		_whp_sites_flagship_species_id = whp_sites_flagship_species_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getFlagship_species_id() {
		return _flagship_species_id;
	}

	public void setFlagship_species_id(int flagship_species_id) {
		_flagship_species_id = flagship_species_id;
	}

	private long _whp_sites_flagship_species_id;
	private long _site_id;
	private int _flagship_species_id;
}