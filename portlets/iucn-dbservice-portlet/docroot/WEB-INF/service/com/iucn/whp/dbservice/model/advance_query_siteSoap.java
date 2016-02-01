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
public class advance_query_siteSoap implements Serializable {
	public static advance_query_siteSoap toSoapModel(advance_query_site model) {
		advance_query_siteSoap soapModel = new advance_query_siteSoap();

		soapModel.setId(model.getId());
		soapModel.setBase_search_val(model.getBase_search_val());
		soapModel.setBase_tab_name(model.getBase_tab_name());
		soapModel.setBase_tab_pk(model.getBase_tab_pk());
		soapModel.setBase_tab_field_disp(model.getBase_tab_field_disp());
		soapModel.setBase_tab_field_actual(model.getBase_tab_field_actual());
		soapModel.setRelate_tab_available(model.getRelate_tab_available());
		soapModel.setRelate_table_name(model.getRelate_table_name());
		soapModel.setRelate_tab_fk(model.getRelate_tab_fk());
		soapModel.setHas_lookup(model.getHas_lookup());
		soapModel.setLookup_table_name(model.getLookup_table_name());
		soapModel.setLookup_pk(model.getLookup_pk());
		soapModel.setLkp_display_field(model.getLkp_display_field());
		soapModel.setCustom_sql(model.getCustom_sql());
		soapModel.setIsboolean(model.getIsboolean());

		return soapModel;
	}

	public static advance_query_siteSoap[] toSoapModels(
		advance_query_site[] models) {
		advance_query_siteSoap[] soapModels = new advance_query_siteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static advance_query_siteSoap[][] toSoapModels(
		advance_query_site[][] models) {
		advance_query_siteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new advance_query_siteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new advance_query_siteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static advance_query_siteSoap[] toSoapModels(
		List<advance_query_site> models) {
		List<advance_query_siteSoap> soapModels = new ArrayList<advance_query_siteSoap>(models.size());

		for (advance_query_site model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new advance_query_siteSoap[soapModels.size()]);
	}

	public advance_query_siteSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getBase_search_val() {
		return _base_search_val;
	}

	public void setBase_search_val(String base_search_val) {
		_base_search_val = base_search_val;
	}

	public String getBase_tab_name() {
		return _base_tab_name;
	}

	public void setBase_tab_name(String base_tab_name) {
		_base_tab_name = base_tab_name;
	}

	public String getBase_tab_pk() {
		return _base_tab_pk;
	}

	public void setBase_tab_pk(String base_tab_pk) {
		_base_tab_pk = base_tab_pk;
	}

	public String getBase_tab_field_disp() {
		return _base_tab_field_disp;
	}

	public void setBase_tab_field_disp(String base_tab_field_disp) {
		_base_tab_field_disp = base_tab_field_disp;
	}

	public String getBase_tab_field_actual() {
		return _base_tab_field_actual;
	}

	public void setBase_tab_field_actual(String base_tab_field_actual) {
		_base_tab_field_actual = base_tab_field_actual;
	}

	public String getRelate_tab_available() {
		return _relate_tab_available;
	}

	public void setRelate_tab_available(String relate_tab_available) {
		_relate_tab_available = relate_tab_available;
	}

	public String getRelate_table_name() {
		return _relate_table_name;
	}

	public void setRelate_table_name(String relate_table_name) {
		_relate_table_name = relate_table_name;
	}

	public String getRelate_tab_fk() {
		return _relate_tab_fk;
	}

	public void setRelate_tab_fk(String relate_tab_fk) {
		_relate_tab_fk = relate_tab_fk;
	}

	public String getHas_lookup() {
		return _has_lookup;
	}

	public void setHas_lookup(String has_lookup) {
		_has_lookup = has_lookup;
	}

	public String getLookup_table_name() {
		return _lookup_table_name;
	}

	public void setLookup_table_name(String lookup_table_name) {
		_lookup_table_name = lookup_table_name;
	}

	public String getLookup_pk() {
		return _lookup_pk;
	}

	public void setLookup_pk(String lookup_pk) {
		_lookup_pk = lookup_pk;
	}

	public String getLkp_display_field() {
		return _lkp_display_field;
	}

	public void setLkp_display_field(String lkp_display_field) {
		_lkp_display_field = lkp_display_field;
	}

	public String getCustom_sql() {
		return _custom_sql;
	}

	public void setCustom_sql(String custom_sql) {
		_custom_sql = custom_sql;
	}

	public String getIsboolean() {
		return _isboolean;
	}

	public void setIsboolean(String isboolean) {
		_isboolean = isboolean;
	}

	private long _id;
	private String _base_search_val;
	private String _base_tab_name;
	private String _base_tab_pk;
	private String _base_tab_field_disp;
	private String _base_tab_field_actual;
	private String _relate_tab_available;
	private String _relate_table_name;
	private String _relate_tab_fk;
	private String _has_lookup;
	private String _lookup_table_name;
	private String _lookup_pk;
	private String _lkp_display_field;
	private String _custom_sql;
	private String _isboolean;
}