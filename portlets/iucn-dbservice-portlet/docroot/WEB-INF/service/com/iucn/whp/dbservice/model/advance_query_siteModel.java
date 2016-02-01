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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the advance_query_site service. Represents a row in the &quot;whp_advance_query_site&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.advance_query_siteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.advance_query_siteImpl}.
 * </p>
 *
 * @author alok.sen
 * @see advance_query_site
 * @see com.iucn.whp.dbservice.model.impl.advance_query_siteImpl
 * @see com.iucn.whp.dbservice.model.impl.advance_query_siteModelImpl
 * @generated
 */
public interface advance_query_siteModel extends BaseModel<advance_query_site> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a advance_query_site model instance should use the {@link advance_query_site} interface instead.
	 */

	/**
	 * Returns the primary key of this advance_query_site.
	 *
	 * @return the primary key of this advance_query_site
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this advance_query_site.
	 *
	 * @param primaryKey the primary key of this advance_query_site
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this advance_query_site.
	 *
	 * @return the ID of this advance_query_site
	 */
	public long getId();

	/**
	 * Sets the ID of this advance_query_site.
	 *
	 * @param id the ID of this advance_query_site
	 */
	public void setId(long id);

	/**
	 * Returns the base_search_val of this advance_query_site.
	 *
	 * @return the base_search_val of this advance_query_site
	 */
	@AutoEscape
	public String getBase_search_val();

	/**
	 * Sets the base_search_val of this advance_query_site.
	 *
	 * @param base_search_val the base_search_val of this advance_query_site
	 */
	public void setBase_search_val(String base_search_val);

	/**
	 * Returns the base_tab_name of this advance_query_site.
	 *
	 * @return the base_tab_name of this advance_query_site
	 */
	@AutoEscape
	public String getBase_tab_name();

	/**
	 * Sets the base_tab_name of this advance_query_site.
	 *
	 * @param base_tab_name the base_tab_name of this advance_query_site
	 */
	public void setBase_tab_name(String base_tab_name);

	/**
	 * Returns the base_tab_pk of this advance_query_site.
	 *
	 * @return the base_tab_pk of this advance_query_site
	 */
	@AutoEscape
	public String getBase_tab_pk();

	/**
	 * Sets the base_tab_pk of this advance_query_site.
	 *
	 * @param base_tab_pk the base_tab_pk of this advance_query_site
	 */
	public void setBase_tab_pk(String base_tab_pk);

	/**
	 * Returns the base_tab_field_disp of this advance_query_site.
	 *
	 * @return the base_tab_field_disp of this advance_query_site
	 */
	@AutoEscape
	public String getBase_tab_field_disp();

	/**
	 * Sets the base_tab_field_disp of this advance_query_site.
	 *
	 * @param base_tab_field_disp the base_tab_field_disp of this advance_query_site
	 */
	public void setBase_tab_field_disp(String base_tab_field_disp);

	/**
	 * Returns the base_tab_field_actual of this advance_query_site.
	 *
	 * @return the base_tab_field_actual of this advance_query_site
	 */
	@AutoEscape
	public String getBase_tab_field_actual();

	/**
	 * Sets the base_tab_field_actual of this advance_query_site.
	 *
	 * @param base_tab_field_actual the base_tab_field_actual of this advance_query_site
	 */
	public void setBase_tab_field_actual(String base_tab_field_actual);

	/**
	 * Returns the relate_tab_available of this advance_query_site.
	 *
	 * @return the relate_tab_available of this advance_query_site
	 */
	@AutoEscape
	public String getRelate_tab_available();

	/**
	 * Sets the relate_tab_available of this advance_query_site.
	 *
	 * @param relate_tab_available the relate_tab_available of this advance_query_site
	 */
	public void setRelate_tab_available(String relate_tab_available);

	/**
	 * Returns the relate_table_name of this advance_query_site.
	 *
	 * @return the relate_table_name of this advance_query_site
	 */
	@AutoEscape
	public String getRelate_table_name();

	/**
	 * Sets the relate_table_name of this advance_query_site.
	 *
	 * @param relate_table_name the relate_table_name of this advance_query_site
	 */
	public void setRelate_table_name(String relate_table_name);

	/**
	 * Returns the relate_tab_fk of this advance_query_site.
	 *
	 * @return the relate_tab_fk of this advance_query_site
	 */
	@AutoEscape
	public String getRelate_tab_fk();

	/**
	 * Sets the relate_tab_fk of this advance_query_site.
	 *
	 * @param relate_tab_fk the relate_tab_fk of this advance_query_site
	 */
	public void setRelate_tab_fk(String relate_tab_fk);

	/**
	 * Returns the has_lookup of this advance_query_site.
	 *
	 * @return the has_lookup of this advance_query_site
	 */
	@AutoEscape
	public String getHas_lookup();

	/**
	 * Sets the has_lookup of this advance_query_site.
	 *
	 * @param has_lookup the has_lookup of this advance_query_site
	 */
	public void setHas_lookup(String has_lookup);

	/**
	 * Returns the lookup_table_name of this advance_query_site.
	 *
	 * @return the lookup_table_name of this advance_query_site
	 */
	@AutoEscape
	public String getLookup_table_name();

	/**
	 * Sets the lookup_table_name of this advance_query_site.
	 *
	 * @param lookup_table_name the lookup_table_name of this advance_query_site
	 */
	public void setLookup_table_name(String lookup_table_name);

	/**
	 * Returns the lookup_pk of this advance_query_site.
	 *
	 * @return the lookup_pk of this advance_query_site
	 */
	@AutoEscape
	public String getLookup_pk();

	/**
	 * Sets the lookup_pk of this advance_query_site.
	 *
	 * @param lookup_pk the lookup_pk of this advance_query_site
	 */
	public void setLookup_pk(String lookup_pk);

	/**
	 * Returns the lkp_display_field of this advance_query_site.
	 *
	 * @return the lkp_display_field of this advance_query_site
	 */
	@AutoEscape
	public String getLkp_display_field();

	/**
	 * Sets the lkp_display_field of this advance_query_site.
	 *
	 * @param lkp_display_field the lkp_display_field of this advance_query_site
	 */
	public void setLkp_display_field(String lkp_display_field);

	/**
	 * Returns the custom_sql of this advance_query_site.
	 *
	 * @return the custom_sql of this advance_query_site
	 */
	@AutoEscape
	public String getCustom_sql();

	/**
	 * Sets the custom_sql of this advance_query_site.
	 *
	 * @param custom_sql the custom_sql of this advance_query_site
	 */
	public void setCustom_sql(String custom_sql);

	/**
	 * Returns the isboolean of this advance_query_site.
	 *
	 * @return the isboolean of this advance_query_site
	 */
	@AutoEscape
	public String getIsboolean();

	/**
	 * Sets the isboolean of this advance_query_site.
	 *
	 * @param isboolean the isboolean of this advance_query_site
	 */
	public void setIsboolean(String isboolean);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(advance_query_site advance_query_site);

	public int hashCode();

	public CacheModel<advance_query_site> toCacheModel();

	public advance_query_site toEscapedModel();

	public String toString();

	public String toXmlString();
}