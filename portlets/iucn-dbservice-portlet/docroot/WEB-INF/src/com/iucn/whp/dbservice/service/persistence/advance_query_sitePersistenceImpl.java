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

package com.iucn.whp.dbservice.service.persistence;

import com.iucn.whp.dbservice.NoSuchadvance_query_siteException;
import com.iucn.whp.dbservice.model.advance_query_site;
import com.iucn.whp.dbservice.model.impl.advance_query_siteImpl;
import com.iucn.whp.dbservice.model.impl.advance_query_siteModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the advance_query_site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see advance_query_sitePersistence
 * @see advance_query_siteUtil
 * @generated
 */
public class advance_query_sitePersistenceImpl extends BasePersistenceImpl<advance_query_site>
	implements advance_query_sitePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link advance_query_siteUtil} to access the advance_query_site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = advance_query_siteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME =
		new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED,
			advance_query_siteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybase_cat_tab_name",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME =
		new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED,
			advance_query_siteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBybase_cat_tab_name", new String[] { String.class.getName() },
			advance_query_siteModelImpl.BASE_TAB_NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BASE_CAT_TAB_NAME = new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBybase_cat_tab_name", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME =
		new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED,
			advance_query_siteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBybase_tab_diplay_name",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME =
		new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED,
			advance_query_siteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBybase_tab_diplay_name",
			new String[] { String.class.getName() },
			advance_query_siteModelImpl.BASE_SEARCH_VAL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BASE_TAB_DIPLAY_NAME = new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBybase_tab_diplay_name",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED,
			advance_query_siteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED,
			advance_query_siteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the advance_query_site in the entity cache if it is enabled.
	 *
	 * @param advance_query_site the advance_query_site
	 */
	public void cacheResult(advance_query_site advance_query_site) {
		EntityCacheUtil.putResult(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteImpl.class, advance_query_site.getPrimaryKey(),
			advance_query_site);

		advance_query_site.resetOriginalValues();
	}

	/**
	 * Caches the advance_query_sites in the entity cache if it is enabled.
	 *
	 * @param advance_query_sites the advance_query_sites
	 */
	public void cacheResult(List<advance_query_site> advance_query_sites) {
		for (advance_query_site advance_query_site : advance_query_sites) {
			if (EntityCacheUtil.getResult(
						advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
						advance_query_siteImpl.class,
						advance_query_site.getPrimaryKey()) == null) {
				cacheResult(advance_query_site);
			}
			else {
				advance_query_site.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all advance_query_sites.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(advance_query_siteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(advance_query_siteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the advance_query_site.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(advance_query_site advance_query_site) {
		EntityCacheUtil.removeResult(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteImpl.class, advance_query_site.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<advance_query_site> advance_query_sites) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (advance_query_site advance_query_site : advance_query_sites) {
			EntityCacheUtil.removeResult(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
				advance_query_siteImpl.class, advance_query_site.getPrimaryKey());
		}
	}

	/**
	 * Creates a new advance_query_site with the primary key. Does not add the advance_query_site to the database.
	 *
	 * @param id the primary key for the new advance_query_site
	 * @return the new advance_query_site
	 */
	public advance_query_site create(long id) {
		advance_query_site advance_query_site = new advance_query_siteImpl();

		advance_query_site.setNew(true);
		advance_query_site.setPrimaryKey(id);

		return advance_query_site;
	}

	/**
	 * Removes the advance_query_site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the advance_query_site
	 * @return the advance_query_site that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site remove(long id)
		throws NoSuchadvance_query_siteException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the advance_query_site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the advance_query_site
	 * @return the advance_query_site that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public advance_query_site remove(Serializable primaryKey)
		throws NoSuchadvance_query_siteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			advance_query_site advance_query_site = (advance_query_site)session.get(advance_query_siteImpl.class,
					primaryKey);

			if (advance_query_site == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchadvance_query_siteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(advance_query_site);
		}
		catch (NoSuchadvance_query_siteException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected advance_query_site removeImpl(
		advance_query_site advance_query_site) throws SystemException {
		advance_query_site = toUnwrappedModel(advance_query_site);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, advance_query_site);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(advance_query_site);

		return advance_query_site;
	}

	@Override
	public advance_query_site updateImpl(
		com.iucn.whp.dbservice.model.advance_query_site advance_query_site,
		boolean merge) throws SystemException {
		advance_query_site = toUnwrappedModel(advance_query_site);

		boolean isNew = advance_query_site.isNew();

		advance_query_siteModelImpl advance_query_siteModelImpl = (advance_query_siteModelImpl)advance_query_site;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, advance_query_site, merge);

			advance_query_site.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !advance_query_siteModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((advance_query_siteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advance_query_siteModelImpl.getOriginalBase_tab_name()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BASE_CAT_TAB_NAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME,
					args);

				args = new Object[] {
						advance_query_siteModelImpl.getBase_tab_name()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BASE_CAT_TAB_NAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME,
					args);
			}

			if ((advance_query_siteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advance_query_siteModelImpl.getOriginalBase_search_val()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BASE_TAB_DIPLAY_NAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME,
					args);

				args = new Object[] {
						advance_query_siteModelImpl.getBase_search_val()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BASE_TAB_DIPLAY_NAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME,
					args);
			}
		}

		EntityCacheUtil.putResult(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
			advance_query_siteImpl.class, advance_query_site.getPrimaryKey(),
			advance_query_site);

		return advance_query_site;
	}

	protected advance_query_site toUnwrappedModel(
		advance_query_site advance_query_site) {
		if (advance_query_site instanceof advance_query_siteImpl) {
			return advance_query_site;
		}

		advance_query_siteImpl advance_query_siteImpl = new advance_query_siteImpl();

		advance_query_siteImpl.setNew(advance_query_site.isNew());
		advance_query_siteImpl.setPrimaryKey(advance_query_site.getPrimaryKey());

		advance_query_siteImpl.setId(advance_query_site.getId());
		advance_query_siteImpl.setBase_search_val(advance_query_site.getBase_search_val());
		advance_query_siteImpl.setBase_tab_name(advance_query_site.getBase_tab_name());
		advance_query_siteImpl.setBase_tab_pk(advance_query_site.getBase_tab_pk());
		advance_query_siteImpl.setBase_tab_field_disp(advance_query_site.getBase_tab_field_disp());
		advance_query_siteImpl.setBase_tab_field_actual(advance_query_site.getBase_tab_field_actual());
		advance_query_siteImpl.setRelate_tab_available(advance_query_site.getRelate_tab_available());
		advance_query_siteImpl.setRelate_table_name(advance_query_site.getRelate_table_name());
		advance_query_siteImpl.setRelate_tab_fk(advance_query_site.getRelate_tab_fk());
		advance_query_siteImpl.setHas_lookup(advance_query_site.getHas_lookup());
		advance_query_siteImpl.setLookup_table_name(advance_query_site.getLookup_table_name());
		advance_query_siteImpl.setLookup_pk(advance_query_site.getLookup_pk());
		advance_query_siteImpl.setLkp_display_field(advance_query_site.getLkp_display_field());
		advance_query_siteImpl.setCustom_sql(advance_query_site.getCustom_sql());
		advance_query_siteImpl.setIsboolean(advance_query_site.getIsboolean());

		return advance_query_siteImpl;
	}

	/**
	 * Returns the advance_query_site with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the advance_query_site
	 * @return the advance_query_site
	 * @throws com.liferay.portal.NoSuchModelException if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public advance_query_site findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the advance_query_site with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchadvance_query_siteException} if it could not be found.
	 *
	 * @param id the primary key of the advance_query_site
	 * @return the advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site findByPrimaryKey(long id)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = fetchByPrimaryKey(id);

		if (advance_query_site == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchadvance_query_siteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return advance_query_site;
	}

	/**
	 * Returns the advance_query_site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the advance_query_site
	 * @return the advance_query_site, or <code>null</code> if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public advance_query_site fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the advance_query_site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the advance_query_site
	 * @return the advance_query_site, or <code>null</code> if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site fetchByPrimaryKey(long id)
		throws SystemException {
		advance_query_site advance_query_site = (advance_query_site)EntityCacheUtil.getResult(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
				advance_query_siteImpl.class, id);

		if (advance_query_site == _nulladvance_query_site) {
			return null;
		}

		if (advance_query_site == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				advance_query_site = (advance_query_site)session.get(advance_query_siteImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (advance_query_site != null) {
					cacheResult(advance_query_site);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(advance_query_siteModelImpl.ENTITY_CACHE_ENABLED,
						advance_query_siteImpl.class, id,
						_nulladvance_query_site);
				}

				closeSession(session);
			}
		}

		return advance_query_site;
	}

	/**
	 * Returns all the advance_query_sites where base_tab_name = &#63;.
	 *
	 * @param base_tab_name the base_tab_name
	 * @return the matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findBybase_cat_tab_name(
		String base_tab_name) throws SystemException {
		return findBybase_cat_tab_name(base_tab_name, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the advance_query_sites where base_tab_name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param base_tab_name the base_tab_name
	 * @param start the lower bound of the range of advance_query_sites
	 * @param end the upper bound of the range of advance_query_sites (not inclusive)
	 * @return the range of matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findBybase_cat_tab_name(
		String base_tab_name, int start, int end) throws SystemException {
		return findBybase_cat_tab_name(base_tab_name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the advance_query_sites where base_tab_name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param base_tab_name the base_tab_name
	 * @param start the lower bound of the range of advance_query_sites
	 * @param end the upper bound of the range of advance_query_sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findBybase_cat_tab_name(
		String base_tab_name, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME;
			finderArgs = new Object[] { base_tab_name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BASE_CAT_TAB_NAME;
			finderArgs = new Object[] {
					base_tab_name,
					
					start, end, orderByComparator
				};
		}

		List<advance_query_site> list = (List<advance_query_site>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (advance_query_site advance_query_site : list) {
				if (!Validator.equals(base_tab_name,
							advance_query_site.getBase_tab_name())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_ADVANCE_QUERY_SITE_WHERE);

			if (base_tab_name == null) {
				query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_1);
			}
			else {
				if (base_tab_name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (base_tab_name != null) {
					qPos.add(base_tab_name);
				}

				list = (List<advance_query_site>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first advance_query_site in the ordered set where base_tab_name = &#63;.
	 *
	 * @param base_tab_name the base_tab_name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site findBybase_cat_tab_name_First(
		String base_tab_name, OrderByComparator orderByComparator)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = fetchBybase_cat_tab_name_First(base_tab_name,
				orderByComparator);

		if (advance_query_site != null) {
			return advance_query_site;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("base_tab_name=");
		msg.append(base_tab_name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchadvance_query_siteException(msg.toString());
	}

	/**
	 * Returns the first advance_query_site in the ordered set where base_tab_name = &#63;.
	 *
	 * @param base_tab_name the base_tab_name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site fetchBybase_cat_tab_name_First(
		String base_tab_name, OrderByComparator orderByComparator)
		throws SystemException {
		List<advance_query_site> list = findBybase_cat_tab_name(base_tab_name,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last advance_query_site in the ordered set where base_tab_name = &#63;.
	 *
	 * @param base_tab_name the base_tab_name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site findBybase_cat_tab_name_Last(
		String base_tab_name, OrderByComparator orderByComparator)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = fetchBybase_cat_tab_name_Last(base_tab_name,
				orderByComparator);

		if (advance_query_site != null) {
			return advance_query_site;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("base_tab_name=");
		msg.append(base_tab_name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchadvance_query_siteException(msg.toString());
	}

	/**
	 * Returns the last advance_query_site in the ordered set where base_tab_name = &#63;.
	 *
	 * @param base_tab_name the base_tab_name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site fetchBybase_cat_tab_name_Last(
		String base_tab_name, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBybase_cat_tab_name(base_tab_name);

		List<advance_query_site> list = findBybase_cat_tab_name(base_tab_name,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the advance_query_sites before and after the current advance_query_site in the ordered set where base_tab_name = &#63;.
	 *
	 * @param id the primary key of the current advance_query_site
	 * @param base_tab_name the base_tab_name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site[] findBybase_cat_tab_name_PrevAndNext(long id,
		String base_tab_name, OrderByComparator orderByComparator)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			advance_query_site[] array = new advance_query_siteImpl[3];

			array[0] = getBybase_cat_tab_name_PrevAndNext(session,
					advance_query_site, base_tab_name, orderByComparator, true);

			array[1] = advance_query_site;

			array[2] = getBybase_cat_tab_name_PrevAndNext(session,
					advance_query_site, base_tab_name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected advance_query_site getBybase_cat_tab_name_PrevAndNext(
		Session session, advance_query_site advance_query_site,
		String base_tab_name, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVANCE_QUERY_SITE_WHERE);

		if (base_tab_name == null) {
			query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_1);
		}
		else {
			if (base_tab_name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (base_tab_name != null) {
			qPos.add(base_tab_name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advance_query_site);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<advance_query_site> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the advance_query_sites where base_search_val = &#63;.
	 *
	 * @param base_search_val the base_search_val
	 * @return the matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findBybase_tab_diplay_name(
		String base_search_val) throws SystemException {
		return findBybase_tab_diplay_name(base_search_val, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the advance_query_sites where base_search_val = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param base_search_val the base_search_val
	 * @param start the lower bound of the range of advance_query_sites
	 * @param end the upper bound of the range of advance_query_sites (not inclusive)
	 * @return the range of matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findBybase_tab_diplay_name(
		String base_search_val, int start, int end) throws SystemException {
		return findBybase_tab_diplay_name(base_search_val, start, end, null);
	}

	/**
	 * Returns an ordered range of all the advance_query_sites where base_search_val = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param base_search_val the base_search_val
	 * @param start the lower bound of the range of advance_query_sites
	 * @param end the upper bound of the range of advance_query_sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findBybase_tab_diplay_name(
		String base_search_val, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME;
			finderArgs = new Object[] { base_search_val };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BASE_TAB_DIPLAY_NAME;
			finderArgs = new Object[] {
					base_search_val,
					
					start, end, orderByComparator
				};
		}

		List<advance_query_site> list = (List<advance_query_site>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (advance_query_site advance_query_site : list) {
				if (!Validator.equals(base_search_val,
							advance_query_site.getBase_search_val())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_ADVANCE_QUERY_SITE_WHERE);

			if (base_search_val == null) {
				query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_1);
			}
			else {
				if (base_search_val.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_3);
				}
				else {
					query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (base_search_val != null) {
					qPos.add(base_search_val);
				}

				list = (List<advance_query_site>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first advance_query_site in the ordered set where base_search_val = &#63;.
	 *
	 * @param base_search_val the base_search_val
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site findBybase_tab_diplay_name_First(
		String base_search_val, OrderByComparator orderByComparator)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = fetchBybase_tab_diplay_name_First(base_search_val,
				orderByComparator);

		if (advance_query_site != null) {
			return advance_query_site;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("base_search_val=");
		msg.append(base_search_val);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchadvance_query_siteException(msg.toString());
	}

	/**
	 * Returns the first advance_query_site in the ordered set where base_search_val = &#63;.
	 *
	 * @param base_search_val the base_search_val
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site fetchBybase_tab_diplay_name_First(
		String base_search_val, OrderByComparator orderByComparator)
		throws SystemException {
		List<advance_query_site> list = findBybase_tab_diplay_name(base_search_val,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last advance_query_site in the ordered set where base_search_val = &#63;.
	 *
	 * @param base_search_val the base_search_val
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site findBybase_tab_diplay_name_Last(
		String base_search_val, OrderByComparator orderByComparator)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = fetchBybase_tab_diplay_name_Last(base_search_val,
				orderByComparator);

		if (advance_query_site != null) {
			return advance_query_site;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("base_search_val=");
		msg.append(base_search_val);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchadvance_query_siteException(msg.toString());
	}

	/**
	 * Returns the last advance_query_site in the ordered set where base_search_val = &#63;.
	 *
	 * @param base_search_val the base_search_val
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advance_query_site, or <code>null</code> if a matching advance_query_site could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site fetchBybase_tab_diplay_name_Last(
		String base_search_val, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBybase_tab_diplay_name(base_search_val);

		List<advance_query_site> list = findBybase_tab_diplay_name(base_search_val,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the advance_query_sites before and after the current advance_query_site in the ordered set where base_search_val = &#63;.
	 *
	 * @param id the primary key of the current advance_query_site
	 * @param base_search_val the base_search_val
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next advance_query_site
	 * @throws com.iucn.whp.dbservice.NoSuchadvance_query_siteException if a advance_query_site with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public advance_query_site[] findBybase_tab_diplay_name_PrevAndNext(
		long id, String base_search_val, OrderByComparator orderByComparator)
		throws NoSuchadvance_query_siteException, SystemException {
		advance_query_site advance_query_site = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			advance_query_site[] array = new advance_query_siteImpl[3];

			array[0] = getBybase_tab_diplay_name_PrevAndNext(session,
					advance_query_site, base_search_val, orderByComparator, true);

			array[1] = advance_query_site;

			array[2] = getBybase_tab_diplay_name_PrevAndNext(session,
					advance_query_site, base_search_val, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected advance_query_site getBybase_tab_diplay_name_PrevAndNext(
		Session session, advance_query_site advance_query_site,
		String base_search_val, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVANCE_QUERY_SITE_WHERE);

		if (base_search_val == null) {
			query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_1);
		}
		else {
			if (base_search_val.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_3);
			}
			else {
				query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (base_search_val != null) {
			qPos.add(base_search_val);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advance_query_site);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<advance_query_site> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the advance_query_sites.
	 *
	 * @return the advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the advance_query_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of advance_query_sites
	 * @param end the upper bound of the range of advance_query_sites (not inclusive)
	 * @return the range of advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the advance_query_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of advance_query_sites
	 * @param end the upper bound of the range of advance_query_sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<advance_query_site> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<advance_query_site> list = (List<advance_query_site>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADVANCE_QUERY_SITE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVANCE_QUERY_SITE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<advance_query_site>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<advance_query_site>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the advance_query_sites where base_tab_name = &#63; from the database.
	 *
	 * @param base_tab_name the base_tab_name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBybase_cat_tab_name(String base_tab_name)
		throws SystemException {
		for (advance_query_site advance_query_site : findBybase_cat_tab_name(
				base_tab_name)) {
			remove(advance_query_site);
		}
	}

	/**
	 * Removes all the advance_query_sites where base_search_val = &#63; from the database.
	 *
	 * @param base_search_val the base_search_val
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBybase_tab_diplay_name(String base_search_val)
		throws SystemException {
		for (advance_query_site advance_query_site : findBybase_tab_diplay_name(
				base_search_val)) {
			remove(advance_query_site);
		}
	}

	/**
	 * Removes all the advance_query_sites from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (advance_query_site advance_query_site : findAll()) {
			remove(advance_query_site);
		}
	}

	/**
	 * Returns the number of advance_query_sites where base_tab_name = &#63;.
	 *
	 * @param base_tab_name the base_tab_name
	 * @return the number of matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int countBybase_cat_tab_name(String base_tab_name)
		throws SystemException {
		Object[] finderArgs = new Object[] { base_tab_name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BASE_CAT_TAB_NAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVANCE_QUERY_SITE_WHERE);

			if (base_tab_name == null) {
				query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_1);
			}
			else {
				if (base_tab_name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (base_tab_name != null) {
					qPos.add(base_tab_name);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BASE_CAT_TAB_NAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of advance_query_sites where base_search_val = &#63;.
	 *
	 * @param base_search_val the base_search_val
	 * @return the number of matching advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int countBybase_tab_diplay_name(String base_search_val)
		throws SystemException {
		Object[] finderArgs = new Object[] { base_search_val };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BASE_TAB_DIPLAY_NAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVANCE_QUERY_SITE_WHERE);

			if (base_search_val == null) {
				query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_1);
			}
			else {
				if (base_search_val.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_3);
				}
				else {
					query.append(_FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (base_search_val != null) {
					qPos.add(base_search_val);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BASE_TAB_DIPLAY_NAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of advance_query_sites.
	 *
	 * @return the number of advance_query_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADVANCE_QUERY_SITE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the advance_query_site persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.advance_query_site")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<advance_query_site>> listenersList = new ArrayList<ModelListener<advance_query_site>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<advance_query_site>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(advance_query_siteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = active_conservation_projectsPersistence.class)
	protected active_conservation_projectsPersistence active_conservation_projectsPersistence;
	@BeanReference(type = advance_query_assessmentPersistence.class)
	protected advance_query_assessmentPersistence advance_query_assessmentPersistence;
	@BeanReference(type = advance_query_sitePersistence.class)
	protected advance_query_sitePersistence advance_query_sitePersistence;
	@BeanReference(type = assessing_threats_currentPersistence.class)
	protected assessing_threats_currentPersistence assessing_threats_currentPersistence;
	@BeanReference(type = assessing_threats_potentialPersistence.class)
	protected assessing_threats_potentialPersistence assessing_threats_potentialPersistence;
	@BeanReference(type = assessment_lang_lkpPersistence.class)
	protected assessment_lang_lkpPersistence assessment_lang_lkpPersistence;
	@BeanReference(type = assessment_lang_versionPersistence.class)
	protected assessment_lang_versionPersistence assessment_lang_versionPersistence;
	@BeanReference(type = assessment_stagesPersistence.class)
	protected assessment_stagesPersistence assessment_stagesPersistence;
	@BeanReference(type = assessment_statusPersistence.class)
	protected assessment_statusPersistence assessment_statusPersistence;
	@BeanReference(type = assessment_validationPersistence.class)
	protected assessment_validationPersistence assessment_validationPersistence;
	@BeanReference(type = assessment_whvaluesPersistence.class)
	protected assessment_whvaluesPersistence assessment_whvaluesPersistence;
	@BeanReference(type = assessment_whvalues_whcriterionPersistence.class)
	protected assessment_whvalues_whcriterionPersistence assessment_whvalues_whcriterionPersistence;
	@BeanReference(type = benefit_checksubtype_lkpPersistence.class)
	protected benefit_checksubtype_lkpPersistence benefit_checksubtype_lkpPersistence;
	@BeanReference(type = benefit_checktype_lkpPersistence.class)
	protected benefit_checktype_lkpPersistence benefit_checktype_lkpPersistence;
	@BeanReference(type = benefit_rating_lkpPersistence.class)
	protected benefit_rating_lkpPersistence benefit_rating_lkpPersistence;
	@BeanReference(type = benefitsPersistence.class)
	protected benefitsPersistence benefitsPersistence;
	@BeanReference(type = benefits_summaryPersistence.class)
	protected benefits_summaryPersistence benefits_summaryPersistence;
	@BeanReference(type = benefits_type_refPersistence.class)
	protected benefits_type_refPersistence benefits_type_refPersistence;
	@BeanReference(type = biodiversity_valuesPersistence.class)
	protected biodiversity_valuesPersistence biodiversity_valuesPersistence;
	@BeanReference(type = boundary_modification_type_lkpPersistence.class)
	protected boundary_modification_type_lkpPersistence boundary_modification_type_lkpPersistence;
	@BeanReference(type = conservation_outlookPersistence.class)
	protected conservation_outlookPersistence conservation_outlookPersistence;
	@BeanReference(type = conservation_outlook_rating_lkpPersistence.class)
	protected conservation_outlook_rating_lkpPersistence conservation_outlook_rating_lkpPersistence;
	@BeanReference(type = contact_categoryPersistence.class)
	protected contact_categoryPersistence contact_categoryPersistence;
	@BeanReference(type = country_lkpPersistence.class)
	protected country_lkpPersistence country_lkpPersistence;
	@BeanReference(type = current_state_trendPersistence.class)
	protected current_state_trendPersistence current_state_trendPersistence;
	@BeanReference(type = current_state_trend_valuesPersistence.class)
	protected current_state_trend_valuesPersistence current_state_trend_valuesPersistence;
	@BeanReference(type = current_threat_assessment_catPersistence.class)
	protected current_threat_assessment_catPersistence current_threat_assessment_catPersistence;
	@BeanReference(type = current_threat_valuesPersistence.class)
	protected current_threat_valuesPersistence current_threat_valuesPersistence;
	@BeanReference(type = danger_list_status_lkpPersistence.class)
	protected danger_list_status_lkpPersistence danger_list_status_lkpPersistence;
	@BeanReference(type = docs_customDataPersistence.class)
	protected docs_customDataPersistence docs_customDataPersistence;
	@BeanReference(type = docs_sitedataPersistence.class)
	protected docs_sitedataPersistence docs_sitedataPersistence;
	@BeanReference(type = effective_prot_mgmt_iothreatsPersistence.class)
	protected effective_prot_mgmt_iothreatsPersistence effective_prot_mgmt_iothreatsPersistence;
	@BeanReference(type = flagship_species_lkpPersistence.class)
	protected flagship_species_lkpPersistence flagship_species_lkpPersistence;
	@BeanReference(type = inscription_criteria_lkpPersistence.class)
	protected inscription_criteria_lkpPersistence inscription_criteria_lkpPersistence;
	@BeanReference(type = inscription_type_lkpPersistence.class)
	protected inscription_type_lkpPersistence inscription_type_lkpPersistence;
	@BeanReference(type = iucn_pa_lkp_categoryPersistence.class)
	protected iucn_pa_lkp_categoryPersistence iucn_pa_lkp_categoryPersistence;
	@BeanReference(type = iucn_regionPersistence.class)
	protected iucn_regionPersistence iucn_regionPersistence;
	@BeanReference(type = iucn_region_countryPersistence.class)
	protected iucn_region_countryPersistence iucn_region_countryPersistence;
	@BeanReference(type = key_conservation_issuesPersistence.class)
	protected key_conservation_issuesPersistence key_conservation_issuesPersistence;
	@BeanReference(type = key_conservation_scale_lkpPersistence.class)
	protected key_conservation_scale_lkpPersistence key_conservation_scale_lkpPersistence;
	@BeanReference(type = mission_lkpPersistence.class)
	protected mission_lkpPersistence mission_lkpPersistence;
	@BeanReference(type = other_designation_lkpPersistence.class)
	protected other_designation_lkpPersistence other_designation_lkpPersistence;
	@BeanReference(type = potential_project_needsPersistence.class)
	protected potential_project_needsPersistence potential_project_needsPersistence;
	@BeanReference(type = potential_threat_assessment_catPersistence.class)
	protected potential_threat_assessment_catPersistence potential_threat_assessment_catPersistence;
	@BeanReference(type = potential_threat_valuesPersistence.class)
	protected potential_threat_valuesPersistence potential_threat_valuesPersistence;
	@BeanReference(type = prot_mgmt_best_practicesPersistence.class)
	protected prot_mgmt_best_practicesPersistence prot_mgmt_best_practicesPersistence;
	@BeanReference(type = prot_mgmt_overallPersistence.class)
	protected prot_mgmt_overallPersistence prot_mgmt_overallPersistence;
	@BeanReference(type = protection_managementPersistence.class)
	protected protection_managementPersistence protection_managementPersistence;
	@BeanReference(type = protection_management_ratings_lkpPersistence.class)
	protected protection_management_ratings_lkpPersistence protection_management_ratings_lkpPersistence;
	@BeanReference(type = protection_mgmt_checklist_lkpPersistence.class)
	protected protection_mgmt_checklist_lkpPersistence protection_mgmt_checklist_lkpPersistence;
	@BeanReference(type = recommendation_type_lkpPersistence.class)
	protected recommendation_type_lkpPersistence recommendation_type_lkpPersistence;
	@BeanReference(type = referencesPersistence.class)
	protected referencesPersistence referencesPersistence;
	@BeanReference(type = reinforced_monitoringPersistence.class)
	protected reinforced_monitoringPersistence reinforced_monitoringPersistence;
	@BeanReference(type = site_assessmentPersistence.class)
	protected site_assessmentPersistence site_assessmentPersistence;
	@BeanReference(type = site_assessment_versionsPersistence.class)
	protected site_assessment_versionsPersistence site_assessment_versionsPersistence;
	@BeanReference(type = sites_thematicPersistence.class)
	protected sites_thematicPersistence sites_thematicPersistence;
	@BeanReference(type = state_lkpPersistence.class)
	protected state_lkpPersistence state_lkpPersistence;
	@BeanReference(type = state_trend_biodivvalsPersistence.class)
	protected state_trend_biodivvalsPersistence state_trend_biodivvalsPersistence;
	@BeanReference(type = state_trend_whvaluesPersistence.class)
	protected state_trend_whvaluesPersistence state_trend_whvaluesPersistence;
	@BeanReference(type = thematic_lkpPersistence.class)
	protected thematic_lkpPersistence thematic_lkpPersistence;
	@BeanReference(type = threat_categories_lkpPersistence.class)
	protected threat_categories_lkpPersistence threat_categories_lkpPersistence;
	@BeanReference(type = threat_rating_lkpPersistence.class)
	protected threat_rating_lkpPersistence threat_rating_lkpPersistence;
	@BeanReference(type = threat_subcategories_lkpPersistence.class)
	protected threat_subcategories_lkpPersistence threat_subcategories_lkpPersistence;
	@BeanReference(type = threat_summary_currentPersistence.class)
	protected threat_summary_currentPersistence threat_summary_currentPersistence;
	@BeanReference(type = threat_summary_overallPersistence.class)
	protected threat_summary_overallPersistence threat_summary_overallPersistence;
	@BeanReference(type = threat_summary_potentialPersistence.class)
	protected threat_summary_potentialPersistence threat_summary_potentialPersistence;
	@BeanReference(type = trend_lkpPersistence.class)
	protected trend_lkpPersistence trend_lkpPersistence;
	@BeanReference(type = unesco_regionPersistence.class)
	protected unesco_regionPersistence unesco_regionPersistence;
	@BeanReference(type = unesco_region_countryPersistence.class)
	protected unesco_region_countryPersistence unesco_region_countryPersistence;
	@BeanReference(type = whp_contactPersistence.class)
	protected whp_contactPersistence whp_contactPersistence;
	@BeanReference(type = whp_criteria_lkpPersistence.class)
	protected whp_criteria_lkpPersistence whp_criteria_lkpPersistence;
	@BeanReference(type = whp_site_danger_listPersistence.class)
	protected whp_site_danger_listPersistence whp_site_danger_listPersistence;
	@BeanReference(type = whp_sitesPersistence.class)
	protected whp_sitesPersistence whp_sitesPersistence;
	@BeanReference(type = whp_sites_boundary_modificationPersistence.class)
	protected whp_sites_boundary_modificationPersistence whp_sites_boundary_modificationPersistence;
	@BeanReference(type = whp_sites_budgetPersistence.class)
	protected whp_sites_budgetPersistence whp_sites_budgetPersistence;
	@BeanReference(type = whp_sites_componentPersistence.class)
	protected whp_sites_componentPersistence whp_sites_componentPersistence;
	@BeanReference(type = whp_sites_contactsPersistence.class)
	protected whp_sites_contactsPersistence whp_sites_contactsPersistence;
	@BeanReference(type = whp_sites_countryPersistence.class)
	protected whp_sites_countryPersistence whp_sites_countryPersistence;
	@BeanReference(type = whp_sites_dsocrPersistence.class)
	protected whp_sites_dsocrPersistence whp_sites_dsocrPersistence;
	@BeanReference(type = whp_sites_external_documentsPersistence.class)
	protected whp_sites_external_documentsPersistence whp_sites_external_documentsPersistence;
	@BeanReference(type = whp_sites_flagship_speciesPersistence.class)
	protected whp_sites_flagship_speciesPersistence whp_sites_flagship_speciesPersistence;
	@BeanReference(type = whp_sites_indigenous_communitiesPersistence.class)
	protected whp_sites_indigenous_communitiesPersistence whp_sites_indigenous_communitiesPersistence;
	@BeanReference(type = whp_sites_inscription_criteriaPersistence.class)
	protected whp_sites_inscription_criteriaPersistence whp_sites_inscription_criteriaPersistence;
	@BeanReference(type = whp_sites_inscription_datePersistence.class)
	protected whp_sites_inscription_datePersistence whp_sites_inscription_datePersistence;
	@BeanReference(type = whp_sites_iucn_pa_categoryPersistence.class)
	protected whp_sites_iucn_pa_categoryPersistence whp_sites_iucn_pa_categoryPersistence;
	@BeanReference(type = whp_sites_iucn_recommendationPersistence.class)
	protected whp_sites_iucn_recommendationPersistence whp_sites_iucn_recommendationPersistence;
	@BeanReference(type = whp_sites_meePersistence.class)
	protected whp_sites_meePersistence whp_sites_meePersistence;
	@BeanReference(type = whp_sites_mgmt_plan_statePersistence.class)
	protected whp_sites_mgmt_plan_statePersistence whp_sites_mgmt_plan_statePersistence;
	@BeanReference(type = whp_sites_missionPersistence.class)
	protected whp_sites_missionPersistence whp_sites_missionPersistence;
	@BeanReference(type = whp_sites_other_designationsPersistence.class)
	protected whp_sites_other_designationsPersistence whp_sites_other_designationsPersistence;
	@BeanReference(type = whp_sites_soc_reportsPersistence.class)
	protected whp_sites_soc_reportsPersistence whp_sites_soc_reportsPersistence;
	@BeanReference(type = whp_sites_soouvPersistence.class)
	protected whp_sites_soouvPersistence whp_sites_soouvPersistence;
	@BeanReference(type = whp_sites_visitorsPersistence.class)
	protected whp_sites_visitorsPersistence whp_sites_visitorsPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ADVANCE_QUERY_SITE = "SELECT advance_query_site FROM advance_query_site advance_query_site";
	private static final String _SQL_SELECT_ADVANCE_QUERY_SITE_WHERE = "SELECT advance_query_site FROM advance_query_site advance_query_site WHERE ";
	private static final String _SQL_COUNT_ADVANCE_QUERY_SITE = "SELECT COUNT(advance_query_site) FROM advance_query_site advance_query_site";
	private static final String _SQL_COUNT_ADVANCE_QUERY_SITE_WHERE = "SELECT COUNT(advance_query_site) FROM advance_query_site advance_query_site WHERE ";
	private static final String _FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_1 =
		"advance_query_site.base_tab_name IS NULL";
	private static final String _FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_2 =
		"advance_query_site.base_tab_name = ?";
	private static final String _FINDER_COLUMN_BASE_CAT_TAB_NAME_BASE_TAB_NAME_3 =
		"(advance_query_site.base_tab_name IS NULL OR advance_query_site.base_tab_name = ?)";
	private static final String _FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_1 =
		"advance_query_site.base_search_val IS NULL";
	private static final String _FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_2 =
		"advance_query_site.base_search_val = ?";
	private static final String _FINDER_COLUMN_BASE_TAB_DIPLAY_NAME_BASE_SEARCH_VAL_3 =
		"(advance_query_site.base_search_val IS NULL OR advance_query_site.base_search_val = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advance_query_site.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No advance_query_site exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No advance_query_site exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(advance_query_sitePersistenceImpl.class);
	private static advance_query_site _nulladvance_query_site = new advance_query_siteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<advance_query_site> toCacheModel() {
				return _nulladvance_query_siteCacheModel;
			}
		};

	private static CacheModel<advance_query_site> _nulladvance_query_siteCacheModel =
		new CacheModel<advance_query_site>() {
			public advance_query_site toEntityModel() {
				return _nulladvance_query_site;
			}
		};
}