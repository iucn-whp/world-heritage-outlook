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

import com.iucn.whp.dbservice.service.advance_query_siteLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class advance_query_siteClp extends BaseModelImpl<advance_query_site>
	implements advance_query_site {
	public advance_query_siteClp() {
	}

	public Class<?> getModelClass() {
		return advance_query_site.class;
	}

	public String getModelClassName() {
		return advance_query_site.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("base_search_val", getBase_search_val());
		attributes.put("base_tab_name", getBase_tab_name());
		attributes.put("base_tab_pk", getBase_tab_pk());
		attributes.put("base_tab_field_disp", getBase_tab_field_disp());
		attributes.put("base_tab_field_actual", getBase_tab_field_actual());
		attributes.put("relate_tab_available", getRelate_tab_available());
		attributes.put("relate_table_name", getRelate_table_name());
		attributes.put("relate_tab_fk", getRelate_tab_fk());
		attributes.put("has_lookup", getHas_lookup());
		attributes.put("lookup_table_name", getLookup_table_name());
		attributes.put("lookup_pk", getLookup_pk());
		attributes.put("lkp_display_field", getLkp_display_field());
		attributes.put("custom_sql", getCustom_sql());
		attributes.put("isboolean", getIsboolean());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String base_search_val = (String)attributes.get("base_search_val");

		if (base_search_val != null) {
			setBase_search_val(base_search_val);
		}

		String base_tab_name = (String)attributes.get("base_tab_name");

		if (base_tab_name != null) {
			setBase_tab_name(base_tab_name);
		}

		String base_tab_pk = (String)attributes.get("base_tab_pk");

		if (base_tab_pk != null) {
			setBase_tab_pk(base_tab_pk);
		}

		String base_tab_field_disp = (String)attributes.get(
				"base_tab_field_disp");

		if (base_tab_field_disp != null) {
			setBase_tab_field_disp(base_tab_field_disp);
		}

		String base_tab_field_actual = (String)attributes.get(
				"base_tab_field_actual");

		if (base_tab_field_actual != null) {
			setBase_tab_field_actual(base_tab_field_actual);
		}

		String relate_tab_available = (String)attributes.get(
				"relate_tab_available");

		if (relate_tab_available != null) {
			setRelate_tab_available(relate_tab_available);
		}

		String relate_table_name = (String)attributes.get("relate_table_name");

		if (relate_table_name != null) {
			setRelate_table_name(relate_table_name);
		}

		String relate_tab_fk = (String)attributes.get("relate_tab_fk");

		if (relate_tab_fk != null) {
			setRelate_tab_fk(relate_tab_fk);
		}

		String has_lookup = (String)attributes.get("has_lookup");

		if (has_lookup != null) {
			setHas_lookup(has_lookup);
		}

		String lookup_table_name = (String)attributes.get("lookup_table_name");

		if (lookup_table_name != null) {
			setLookup_table_name(lookup_table_name);
		}

		String lookup_pk = (String)attributes.get("lookup_pk");

		if (lookup_pk != null) {
			setLookup_pk(lookup_pk);
		}

		String lkp_display_field = (String)attributes.get("lkp_display_field");

		if (lkp_display_field != null) {
			setLkp_display_field(lkp_display_field);
		}

		String custom_sql = (String)attributes.get("custom_sql");

		if (custom_sql != null) {
			setCustom_sql(custom_sql);
		}

		String isboolean = (String)attributes.get("isboolean");

		if (isboolean != null) {
			setIsboolean(isboolean);
		}
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

	public BaseModel<?> getadvance_query_siteRemoteModel() {
		return _advance_query_siteRemoteModel;
	}

	public void setadvance_query_siteRemoteModel(
		BaseModel<?> advance_query_siteRemoteModel) {
		_advance_query_siteRemoteModel = advance_query_siteRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			advance_query_siteLocalServiceUtil.addadvance_query_site(this);
		}
		else {
			advance_query_siteLocalServiceUtil.updateadvance_query_site(this);
		}
	}

	@Override
	public advance_query_site toEscapedModel() {
		return (advance_query_site)Proxy.newProxyInstance(advance_query_site.class.getClassLoader(),
			new Class[] { advance_query_site.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		advance_query_siteClp clone = new advance_query_siteClp();

		clone.setId(getId());
		clone.setBase_search_val(getBase_search_val());
		clone.setBase_tab_name(getBase_tab_name());
		clone.setBase_tab_pk(getBase_tab_pk());
		clone.setBase_tab_field_disp(getBase_tab_field_disp());
		clone.setBase_tab_field_actual(getBase_tab_field_actual());
		clone.setRelate_tab_available(getRelate_tab_available());
		clone.setRelate_table_name(getRelate_table_name());
		clone.setRelate_tab_fk(getRelate_tab_fk());
		clone.setHas_lookup(getHas_lookup());
		clone.setLookup_table_name(getLookup_table_name());
		clone.setLookup_pk(getLookup_pk());
		clone.setLkp_display_field(getLkp_display_field());
		clone.setCustom_sql(getCustom_sql());
		clone.setIsboolean(getIsboolean());

		return clone;
	}

	public int compareTo(advance_query_site advance_query_site) {
		long primaryKey = advance_query_site.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		advance_query_siteClp advance_query_site = null;

		try {
			advance_query_site = (advance_query_siteClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = advance_query_site.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", base_search_val=");
		sb.append(getBase_search_val());
		sb.append(", base_tab_name=");
		sb.append(getBase_tab_name());
		sb.append(", base_tab_pk=");
		sb.append(getBase_tab_pk());
		sb.append(", base_tab_field_disp=");
		sb.append(getBase_tab_field_disp());
		sb.append(", base_tab_field_actual=");
		sb.append(getBase_tab_field_actual());
		sb.append(", relate_tab_available=");
		sb.append(getRelate_tab_available());
		sb.append(", relate_table_name=");
		sb.append(getRelate_table_name());
		sb.append(", relate_tab_fk=");
		sb.append(getRelate_tab_fk());
		sb.append(", has_lookup=");
		sb.append(getHas_lookup());
		sb.append(", lookup_table_name=");
		sb.append(getLookup_table_name());
		sb.append(", lookup_pk=");
		sb.append(getLookup_pk());
		sb.append(", lkp_display_field=");
		sb.append(getLkp_display_field());
		sb.append(", custom_sql=");
		sb.append(getCustom_sql());
		sb.append(", isboolean=");
		sb.append(getIsboolean());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.advance_query_site");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_search_val</column-name><column-value><![CDATA[");
		sb.append(getBase_search_val());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_tab_name</column-name><column-value><![CDATA[");
		sb.append(getBase_tab_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_tab_pk</column-name><column-value><![CDATA[");
		sb.append(getBase_tab_pk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_tab_field_disp</column-name><column-value><![CDATA[");
		sb.append(getBase_tab_field_disp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_tab_field_actual</column-name><column-value><![CDATA[");
		sb.append(getBase_tab_field_actual());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relate_tab_available</column-name><column-value><![CDATA[");
		sb.append(getRelate_tab_available());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relate_table_name</column-name><column-value><![CDATA[");
		sb.append(getRelate_table_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relate_tab_fk</column-name><column-value><![CDATA[");
		sb.append(getRelate_tab_fk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>has_lookup</column-name><column-value><![CDATA[");
		sb.append(getHas_lookup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lookup_table_name</column-name><column-value><![CDATA[");
		sb.append(getLookup_table_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lookup_pk</column-name><column-value><![CDATA[");
		sb.append(getLookup_pk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lkp_display_field</column-name><column-value><![CDATA[");
		sb.append(getLkp_display_field());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>custom_sql</column-name><column-value><![CDATA[");
		sb.append(getCustom_sql());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isboolean</column-name><column-value><![CDATA[");
		sb.append(getIsboolean());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _advance_query_siteRemoteModel;
}