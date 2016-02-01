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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link advance_query_site}.
 * </p>
 *
 * @author    alok.sen
 * @see       advance_query_site
 * @generated
 */
public class advance_query_siteWrapper implements advance_query_site,
	ModelWrapper<advance_query_site> {
	public advance_query_siteWrapper(advance_query_site advance_query_site) {
		_advance_query_site = advance_query_site;
	}

	public Class<?> getModelClass() {
		return advance_query_site.class;
	}

	public String getModelClassName() {
		return advance_query_site.class.getName();
	}

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

	/**
	* Returns the primary key of this advance_query_site.
	*
	* @return the primary key of this advance_query_site
	*/
	public long getPrimaryKey() {
		return _advance_query_site.getPrimaryKey();
	}

	/**
	* Sets the primary key of this advance_query_site.
	*
	* @param primaryKey the primary key of this advance_query_site
	*/
	public void setPrimaryKey(long primaryKey) {
		_advance_query_site.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this advance_query_site.
	*
	* @return the ID of this advance_query_site
	*/
	public long getId() {
		return _advance_query_site.getId();
	}

	/**
	* Sets the ID of this advance_query_site.
	*
	* @param id the ID of this advance_query_site
	*/
	public void setId(long id) {
		_advance_query_site.setId(id);
	}

	/**
	* Returns the base_search_val of this advance_query_site.
	*
	* @return the base_search_val of this advance_query_site
	*/
	public java.lang.String getBase_search_val() {
		return _advance_query_site.getBase_search_val();
	}

	/**
	* Sets the base_search_val of this advance_query_site.
	*
	* @param base_search_val the base_search_val of this advance_query_site
	*/
	public void setBase_search_val(java.lang.String base_search_val) {
		_advance_query_site.setBase_search_val(base_search_val);
	}

	/**
	* Returns the base_tab_name of this advance_query_site.
	*
	* @return the base_tab_name of this advance_query_site
	*/
	public java.lang.String getBase_tab_name() {
		return _advance_query_site.getBase_tab_name();
	}

	/**
	* Sets the base_tab_name of this advance_query_site.
	*
	* @param base_tab_name the base_tab_name of this advance_query_site
	*/
	public void setBase_tab_name(java.lang.String base_tab_name) {
		_advance_query_site.setBase_tab_name(base_tab_name);
	}

	/**
	* Returns the base_tab_pk of this advance_query_site.
	*
	* @return the base_tab_pk of this advance_query_site
	*/
	public java.lang.String getBase_tab_pk() {
		return _advance_query_site.getBase_tab_pk();
	}

	/**
	* Sets the base_tab_pk of this advance_query_site.
	*
	* @param base_tab_pk the base_tab_pk of this advance_query_site
	*/
	public void setBase_tab_pk(java.lang.String base_tab_pk) {
		_advance_query_site.setBase_tab_pk(base_tab_pk);
	}

	/**
	* Returns the base_tab_field_disp of this advance_query_site.
	*
	* @return the base_tab_field_disp of this advance_query_site
	*/
	public java.lang.String getBase_tab_field_disp() {
		return _advance_query_site.getBase_tab_field_disp();
	}

	/**
	* Sets the base_tab_field_disp of this advance_query_site.
	*
	* @param base_tab_field_disp the base_tab_field_disp of this advance_query_site
	*/
	public void setBase_tab_field_disp(java.lang.String base_tab_field_disp) {
		_advance_query_site.setBase_tab_field_disp(base_tab_field_disp);
	}

	/**
	* Returns the base_tab_field_actual of this advance_query_site.
	*
	* @return the base_tab_field_actual of this advance_query_site
	*/
	public java.lang.String getBase_tab_field_actual() {
		return _advance_query_site.getBase_tab_field_actual();
	}

	/**
	* Sets the base_tab_field_actual of this advance_query_site.
	*
	* @param base_tab_field_actual the base_tab_field_actual of this advance_query_site
	*/
	public void setBase_tab_field_actual(java.lang.String base_tab_field_actual) {
		_advance_query_site.setBase_tab_field_actual(base_tab_field_actual);
	}

	/**
	* Returns the relate_tab_available of this advance_query_site.
	*
	* @return the relate_tab_available of this advance_query_site
	*/
	public java.lang.String getRelate_tab_available() {
		return _advance_query_site.getRelate_tab_available();
	}

	/**
	* Sets the relate_tab_available of this advance_query_site.
	*
	* @param relate_tab_available the relate_tab_available of this advance_query_site
	*/
	public void setRelate_tab_available(java.lang.String relate_tab_available) {
		_advance_query_site.setRelate_tab_available(relate_tab_available);
	}

	/**
	* Returns the relate_table_name of this advance_query_site.
	*
	* @return the relate_table_name of this advance_query_site
	*/
	public java.lang.String getRelate_table_name() {
		return _advance_query_site.getRelate_table_name();
	}

	/**
	* Sets the relate_table_name of this advance_query_site.
	*
	* @param relate_table_name the relate_table_name of this advance_query_site
	*/
	public void setRelate_table_name(java.lang.String relate_table_name) {
		_advance_query_site.setRelate_table_name(relate_table_name);
	}

	/**
	* Returns the relate_tab_fk of this advance_query_site.
	*
	* @return the relate_tab_fk of this advance_query_site
	*/
	public java.lang.String getRelate_tab_fk() {
		return _advance_query_site.getRelate_tab_fk();
	}

	/**
	* Sets the relate_tab_fk of this advance_query_site.
	*
	* @param relate_tab_fk the relate_tab_fk of this advance_query_site
	*/
	public void setRelate_tab_fk(java.lang.String relate_tab_fk) {
		_advance_query_site.setRelate_tab_fk(relate_tab_fk);
	}

	/**
	* Returns the has_lookup of this advance_query_site.
	*
	* @return the has_lookup of this advance_query_site
	*/
	public java.lang.String getHas_lookup() {
		return _advance_query_site.getHas_lookup();
	}

	/**
	* Sets the has_lookup of this advance_query_site.
	*
	* @param has_lookup the has_lookup of this advance_query_site
	*/
	public void setHas_lookup(java.lang.String has_lookup) {
		_advance_query_site.setHas_lookup(has_lookup);
	}

	/**
	* Returns the lookup_table_name of this advance_query_site.
	*
	* @return the lookup_table_name of this advance_query_site
	*/
	public java.lang.String getLookup_table_name() {
		return _advance_query_site.getLookup_table_name();
	}

	/**
	* Sets the lookup_table_name of this advance_query_site.
	*
	* @param lookup_table_name the lookup_table_name of this advance_query_site
	*/
	public void setLookup_table_name(java.lang.String lookup_table_name) {
		_advance_query_site.setLookup_table_name(lookup_table_name);
	}

	/**
	* Returns the lookup_pk of this advance_query_site.
	*
	* @return the lookup_pk of this advance_query_site
	*/
	public java.lang.String getLookup_pk() {
		return _advance_query_site.getLookup_pk();
	}

	/**
	* Sets the lookup_pk of this advance_query_site.
	*
	* @param lookup_pk the lookup_pk of this advance_query_site
	*/
	public void setLookup_pk(java.lang.String lookup_pk) {
		_advance_query_site.setLookup_pk(lookup_pk);
	}

	/**
	* Returns the lkp_display_field of this advance_query_site.
	*
	* @return the lkp_display_field of this advance_query_site
	*/
	public java.lang.String getLkp_display_field() {
		return _advance_query_site.getLkp_display_field();
	}

	/**
	* Sets the lkp_display_field of this advance_query_site.
	*
	* @param lkp_display_field the lkp_display_field of this advance_query_site
	*/
	public void setLkp_display_field(java.lang.String lkp_display_field) {
		_advance_query_site.setLkp_display_field(lkp_display_field);
	}

	/**
	* Returns the custom_sql of this advance_query_site.
	*
	* @return the custom_sql of this advance_query_site
	*/
	public java.lang.String getCustom_sql() {
		return _advance_query_site.getCustom_sql();
	}

	/**
	* Sets the custom_sql of this advance_query_site.
	*
	* @param custom_sql the custom_sql of this advance_query_site
	*/
	public void setCustom_sql(java.lang.String custom_sql) {
		_advance_query_site.setCustom_sql(custom_sql);
	}

	/**
	* Returns the isboolean of this advance_query_site.
	*
	* @return the isboolean of this advance_query_site
	*/
	public java.lang.String getIsboolean() {
		return _advance_query_site.getIsboolean();
	}

	/**
	* Sets the isboolean of this advance_query_site.
	*
	* @param isboolean the isboolean of this advance_query_site
	*/
	public void setIsboolean(java.lang.String isboolean) {
		_advance_query_site.setIsboolean(isboolean);
	}

	public boolean isNew() {
		return _advance_query_site.isNew();
	}

	public void setNew(boolean n) {
		_advance_query_site.setNew(n);
	}

	public boolean isCachedModel() {
		return _advance_query_site.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_advance_query_site.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _advance_query_site.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _advance_query_site.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_advance_query_site.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _advance_query_site.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_advance_query_site.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new advance_query_siteWrapper((advance_query_site)_advance_query_site.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site) {
		return _advance_query_site.compareTo(advance_query_site);
	}

	@Override
	public int hashCode() {
		return _advance_query_site.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.advance_query_site> toCacheModel() {
		return _advance_query_site.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.advance_query_site toEscapedModel() {
		return new advance_query_siteWrapper(_advance_query_site.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _advance_query_site.toString();
	}

	public java.lang.String toXmlString() {
		return _advance_query_site.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_advance_query_site.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public advance_query_site getWrappedadvance_query_site() {
		return _advance_query_site;
	}

	public advance_query_site getWrappedModel() {
		return _advance_query_site;
	}

	public void resetOriginalValues() {
		_advance_query_site.resetOriginalValues();
	}

	private advance_query_site _advance_query_site;
}