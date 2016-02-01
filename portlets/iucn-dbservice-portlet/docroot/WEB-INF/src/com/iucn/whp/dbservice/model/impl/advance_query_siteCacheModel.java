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

import com.iucn.whp.dbservice.model.advance_query_site;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing advance_query_site in entity cache.
 *
 * @author alok.sen
 * @see advance_query_site
 * @generated
 */
public class advance_query_siteCacheModel implements CacheModel<advance_query_site>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", base_search_val=");
		sb.append(base_search_val);
		sb.append(", base_tab_name=");
		sb.append(base_tab_name);
		sb.append(", base_tab_pk=");
		sb.append(base_tab_pk);
		sb.append(", base_tab_field_disp=");
		sb.append(base_tab_field_disp);
		sb.append(", base_tab_field_actual=");
		sb.append(base_tab_field_actual);
		sb.append(", relate_tab_available=");
		sb.append(relate_tab_available);
		sb.append(", relate_table_name=");
		sb.append(relate_table_name);
		sb.append(", relate_tab_fk=");
		sb.append(relate_tab_fk);
		sb.append(", has_lookup=");
		sb.append(has_lookup);
		sb.append(", lookup_table_name=");
		sb.append(lookup_table_name);
		sb.append(", lookup_pk=");
		sb.append(lookup_pk);
		sb.append(", lkp_display_field=");
		sb.append(lkp_display_field);
		sb.append(", custom_sql=");
		sb.append(custom_sql);
		sb.append(", isboolean=");
		sb.append(isboolean);
		sb.append("}");

		return sb.toString();
	}

	public advance_query_site toEntityModel() {
		advance_query_siteImpl advance_query_siteImpl = new advance_query_siteImpl();

		advance_query_siteImpl.setId(id);

		if (base_search_val == null) {
			advance_query_siteImpl.setBase_search_val(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setBase_search_val(base_search_val);
		}

		if (base_tab_name == null) {
			advance_query_siteImpl.setBase_tab_name(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setBase_tab_name(base_tab_name);
		}

		if (base_tab_pk == null) {
			advance_query_siteImpl.setBase_tab_pk(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setBase_tab_pk(base_tab_pk);
		}

		if (base_tab_field_disp == null) {
			advance_query_siteImpl.setBase_tab_field_disp(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setBase_tab_field_disp(base_tab_field_disp);
		}

		if (base_tab_field_actual == null) {
			advance_query_siteImpl.setBase_tab_field_actual(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setBase_tab_field_actual(base_tab_field_actual);
		}

		if (relate_tab_available == null) {
			advance_query_siteImpl.setRelate_tab_available(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setRelate_tab_available(relate_tab_available);
		}

		if (relate_table_name == null) {
			advance_query_siteImpl.setRelate_table_name(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setRelate_table_name(relate_table_name);
		}

		if (relate_tab_fk == null) {
			advance_query_siteImpl.setRelate_tab_fk(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setRelate_tab_fk(relate_tab_fk);
		}

		if (has_lookup == null) {
			advance_query_siteImpl.setHas_lookup(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setHas_lookup(has_lookup);
		}

		if (lookup_table_name == null) {
			advance_query_siteImpl.setLookup_table_name(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setLookup_table_name(lookup_table_name);
		}

		if (lookup_pk == null) {
			advance_query_siteImpl.setLookup_pk(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setLookup_pk(lookup_pk);
		}

		if (lkp_display_field == null) {
			advance_query_siteImpl.setLkp_display_field(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setLkp_display_field(lkp_display_field);
		}

		if (custom_sql == null) {
			advance_query_siteImpl.setCustom_sql(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setCustom_sql(custom_sql);
		}

		if (isboolean == null) {
			advance_query_siteImpl.setIsboolean(StringPool.BLANK);
		}
		else {
			advance_query_siteImpl.setIsboolean(isboolean);
		}

		advance_query_siteImpl.resetOriginalValues();

		return advance_query_siteImpl;
	}

	public long id;
	public String base_search_val;
	public String base_tab_name;
	public String base_tab_pk;
	public String base_tab_field_disp;
	public String base_tab_field_actual;
	public String relate_tab_available;
	public String relate_table_name;
	public String relate_tab_fk;
	public String has_lookup;
	public String lookup_table_name;
	public String lookup_pk;
	public String lkp_display_field;
	public String custom_sql;
	public String isboolean;
}