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

import com.iucn.whp.dbservice.NoSuchsites_thematicException;
import com.iucn.whp.dbservice.model.impl.sites_thematicImpl;
import com.iucn.whp.dbservice.model.impl.sites_thematicModelImpl;
import com.iucn.whp.dbservice.model.sites_thematic;

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
 * The persistence implementation for the sites_thematic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see sites_thematicPersistence
 * @see sites_thematicUtil
 * @generated
 */
public class sites_thematicPersistenceImpl extends BasePersistenceImpl<sites_thematic>
	implements sites_thematicPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link sites_thematicUtil} to access the sites_thematic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = sites_thematicImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEID = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED,
			sites_thematicImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBysiteId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID =
		new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED,
			sites_thematicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBysiteId",
			new String[] { Long.class.getName() },
			sites_thematicModelImpl.SITE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITEID = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysiteId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_THEMATICID = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED,
			sites_thematicImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythematicId", new String[] { Long.class.getName() },
			sites_thematicModelImpl.THEMATICID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THEMATICID = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythematicId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED,
			sites_thematicImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED,
			sites_thematicImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the sites_thematic in the entity cache if it is enabled.
	 *
	 * @param sites_thematic the sites_thematic
	 */
	public void cacheResult(sites_thematic sites_thematic) {
		EntityCacheUtil.putResult(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicImpl.class, sites_thematic.getPrimaryKey(),
			sites_thematic);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THEMATICID,
			new Object[] { Long.valueOf(sites_thematic.getThematicid()) },
			sites_thematic);

		sites_thematic.resetOriginalValues();
	}

	/**
	 * Caches the sites_thematics in the entity cache if it is enabled.
	 *
	 * @param sites_thematics the sites_thematics
	 */
	public void cacheResult(List<sites_thematic> sites_thematics) {
		for (sites_thematic sites_thematic : sites_thematics) {
			if (EntityCacheUtil.getResult(
						sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
						sites_thematicImpl.class, sites_thematic.getPrimaryKey()) == null) {
				cacheResult(sites_thematic);
			}
			else {
				sites_thematic.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sites_thematics.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(sites_thematicImpl.class.getName());
		}

		EntityCacheUtil.clearCache(sites_thematicImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sites_thematic.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sites_thematic sites_thematic) {
		EntityCacheUtil.removeResult(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicImpl.class, sites_thematic.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(sites_thematic);
	}

	@Override
	public void clearCache(List<sites_thematic> sites_thematics) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (sites_thematic sites_thematic : sites_thematics) {
			EntityCacheUtil.removeResult(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
				sites_thematicImpl.class, sites_thematic.getPrimaryKey());

			clearUniqueFindersCache(sites_thematic);
		}
	}

	protected void clearUniqueFindersCache(sites_thematic sites_thematic) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THEMATICID,
			new Object[] { Long.valueOf(sites_thematic.getThematicid()) });
	}

	/**
	 * Creates a new sites_thematic with the primary key. Does not add the sites_thematic to the database.
	 *
	 * @param sitethematicid the primary key for the new sites_thematic
	 * @return the new sites_thematic
	 */
	public sites_thematic create(long sitethematicid) {
		sites_thematic sites_thematic = new sites_thematicImpl();

		sites_thematic.setNew(true);
		sites_thematic.setPrimaryKey(sitethematicid);

		return sites_thematic;
	}

	/**
	 * Removes the sites_thematic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sitethematicid the primary key of the sites_thematic
	 * @return the sites_thematic that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic remove(long sitethematicid)
		throws NoSuchsites_thematicException, SystemException {
		return remove(Long.valueOf(sitethematicid));
	}

	/**
	 * Removes the sites_thematic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sites_thematic
	 * @return the sites_thematic that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sites_thematic remove(Serializable primaryKey)
		throws NoSuchsites_thematicException, SystemException {
		Session session = null;

		try {
			session = openSession();

			sites_thematic sites_thematic = (sites_thematic)session.get(sites_thematicImpl.class,
					primaryKey);

			if (sites_thematic == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsites_thematicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sites_thematic);
		}
		catch (NoSuchsites_thematicException nsee) {
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
	protected sites_thematic removeImpl(sites_thematic sites_thematic)
		throws SystemException {
		sites_thematic = toUnwrappedModel(sites_thematic);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, sites_thematic);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(sites_thematic);

		return sites_thematic;
	}

	@Override
	public sites_thematic updateImpl(
		com.iucn.whp.dbservice.model.sites_thematic sites_thematic,
		boolean merge) throws SystemException {
		sites_thematic = toUnwrappedModel(sites_thematic);

		boolean isNew = sites_thematic.isNew();

		sites_thematicModelImpl sites_thematicModelImpl = (sites_thematicModelImpl)sites_thematic;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, sites_thematic, merge);

			sites_thematic.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !sites_thematicModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((sites_thematicModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(sites_thematicModelImpl.getOriginalSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);

				args = new Object[] {
						Long.valueOf(sites_thematicModelImpl.getSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);
			}
		}

		EntityCacheUtil.putResult(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
			sites_thematicImpl.class, sites_thematic.getPrimaryKey(),
			sites_thematic);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THEMATICID,
				new Object[] { Long.valueOf(sites_thematic.getThematicid()) },
				sites_thematic);
		}
		else {
			if ((sites_thematicModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THEMATICID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(sites_thematicModelImpl.getOriginalThematicid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THEMATICID,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THEMATICID,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THEMATICID,
					new Object[] { Long.valueOf(sites_thematic.getThematicid()) },
					sites_thematic);
			}
		}

		return sites_thematic;
	}

	protected sites_thematic toUnwrappedModel(sites_thematic sites_thematic) {
		if (sites_thematic instanceof sites_thematicImpl) {
			return sites_thematic;
		}

		sites_thematicImpl sites_thematicImpl = new sites_thematicImpl();

		sites_thematicImpl.setNew(sites_thematic.isNew());
		sites_thematicImpl.setPrimaryKey(sites_thematic.getPrimaryKey());

		sites_thematicImpl.setSitethematicid(sites_thematic.getSitethematicid());
		sites_thematicImpl.setSite_id(sites_thematic.getSite_id());
		sites_thematicImpl.setThematicid(sites_thematic.getThematicid());

		return sites_thematicImpl;
	}

	/**
	 * Returns the sites_thematic with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sites_thematic
	 * @return the sites_thematic
	 * @throws com.liferay.portal.NoSuchModelException if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sites_thematic findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sites_thematic with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsites_thematicException} if it could not be found.
	 *
	 * @param sitethematicid the primary key of the sites_thematic
	 * @return the sites_thematic
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic findByPrimaryKey(long sitethematicid)
		throws NoSuchsites_thematicException, SystemException {
		sites_thematic sites_thematic = fetchByPrimaryKey(sitethematicid);

		if (sites_thematic == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sitethematicid);
			}

			throw new NoSuchsites_thematicException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				sitethematicid);
		}

		return sites_thematic;
	}

	/**
	 * Returns the sites_thematic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sites_thematic
	 * @return the sites_thematic, or <code>null</code> if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sites_thematic fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sites_thematic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sitethematicid the primary key of the sites_thematic
	 * @return the sites_thematic, or <code>null</code> if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic fetchByPrimaryKey(long sitethematicid)
		throws SystemException {
		sites_thematic sites_thematic = (sites_thematic)EntityCacheUtil.getResult(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
				sites_thematicImpl.class, sitethematicid);

		if (sites_thematic == _nullsites_thematic) {
			return null;
		}

		if (sites_thematic == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				sites_thematic = (sites_thematic)session.get(sites_thematicImpl.class,
						Long.valueOf(sitethematicid));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (sites_thematic != null) {
					cacheResult(sites_thematic);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(sites_thematicModelImpl.ENTITY_CACHE_ENABLED,
						sites_thematicImpl.class, sitethematicid,
						_nullsites_thematic);
				}

				closeSession(session);
			}
		}

		return sites_thematic;
	}

	/**
	 * Returns all the sites_thematics where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the matching sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public List<sites_thematic> findBysiteId(long site_id)
		throws SystemException {
		return findBysiteId(site_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sites_thematics where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of sites_thematics
	 * @param end the upper bound of the range of sites_thematics (not inclusive)
	 * @return the range of matching sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public List<sites_thematic> findBysiteId(long site_id, int start, int end)
		throws SystemException {
		return findBysiteId(site_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sites_thematics where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of sites_thematics
	 * @param end the upper bound of the range of sites_thematics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public List<sites_thematic> findBysiteId(long site_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID;
			finderArgs = new Object[] { site_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEID;
			finderArgs = new Object[] { site_id, start, end, orderByComparator };
		}

		List<sites_thematic> list = (List<sites_thematic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (sites_thematic sites_thematic : list) {
				if ((site_id != sites_thematic.getSite_id())) {
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

			query.append(_SQL_SELECT_SITES_THEMATIC_WHERE);

			query.append(_FINDER_COLUMN_SITEID_SITE_ID_2);

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

				qPos.add(site_id);

				list = (List<sites_thematic>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first sites_thematic in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sites_thematic
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic findBysiteId_First(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuchsites_thematicException, SystemException {
		sites_thematic sites_thematic = fetchBysiteId_First(site_id,
				orderByComparator);

		if (sites_thematic != null) {
			return sites_thematic;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsites_thematicException(msg.toString());
	}

	/**
	 * Returns the first sites_thematic in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic fetchBysiteId_First(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		List<sites_thematic> list = findBysiteId(site_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sites_thematic in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sites_thematic
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic findBysiteId_Last(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuchsites_thematicException, SystemException {
		sites_thematic sites_thematic = fetchBysiteId_Last(site_id,
				orderByComparator);

		if (sites_thematic != null) {
			return sites_thematic;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsites_thematicException(msg.toString());
	}

	/**
	 * Returns the last sites_thematic in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic fetchBysiteId_Last(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBysiteId(site_id);

		List<sites_thematic> list = findBysiteId(site_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sites_thematics before and after the current sites_thematic in the ordered set where site_id = &#63;.
	 *
	 * @param sitethematicid the primary key of the current sites_thematic
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sites_thematic
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a sites_thematic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic[] findBysiteId_PrevAndNext(long sitethematicid,
		long site_id, OrderByComparator orderByComparator)
		throws NoSuchsites_thematicException, SystemException {
		sites_thematic sites_thematic = findByPrimaryKey(sitethematicid);

		Session session = null;

		try {
			session = openSession();

			sites_thematic[] array = new sites_thematicImpl[3];

			array[0] = getBysiteId_PrevAndNext(session, sites_thematic,
					site_id, orderByComparator, true);

			array[1] = sites_thematic;

			array[2] = getBysiteId_PrevAndNext(session, sites_thematic,
					site_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected sites_thematic getBysiteId_PrevAndNext(Session session,
		sites_thematic sites_thematic, long site_id,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITES_THEMATIC_WHERE);

		query.append(_FINDER_COLUMN_SITEID_SITE_ID_2);

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

		qPos.add(site_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sites_thematic);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<sites_thematic> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the sites_thematic where thematicid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchsites_thematicException} if it could not be found.
	 *
	 * @param thematicid the thematicid
	 * @return the matching sites_thematic
	 * @throws com.iucn.whp.dbservice.NoSuchsites_thematicException if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic findBythematicId(long thematicid)
		throws NoSuchsites_thematicException, SystemException {
		sites_thematic sites_thematic = fetchBythematicId(thematicid);

		if (sites_thematic == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thematicid=");
			msg.append(thematicid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchsites_thematicException(msg.toString());
		}

		return sites_thematic;
	}

	/**
	 * Returns the sites_thematic where thematicid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thematicid the thematicid
	 * @return the matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic fetchBythematicId(long thematicid)
		throws SystemException {
		return fetchBythematicId(thematicid, true);
	}

	/**
	 * Returns the sites_thematic where thematicid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thematicid the thematicid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching sites_thematic, or <code>null</code> if a matching sites_thematic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic fetchBythematicId(long thematicid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thematicid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THEMATICID,
					finderArgs, this);
		}

		if (result instanceof sites_thematic) {
			sites_thematic sites_thematic = (sites_thematic)result;

			if ((thematicid != sites_thematic.getThematicid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_SITES_THEMATIC_WHERE);

			query.append(_FINDER_COLUMN_THEMATICID_THEMATICID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thematicid);

				List<sites_thematic> list = q.list();

				result = list;

				sites_thematic sites_thematic = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THEMATICID,
						finderArgs, list);
				}
				else {
					sites_thematic = list.get(0);

					cacheResult(sites_thematic);

					if ((sites_thematic.getThematicid() != thematicid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THEMATICID,
							finderArgs, sites_thematic);
					}
				}

				return sites_thematic;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THEMATICID,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (sites_thematic)result;
			}
		}
	}

	/**
	 * Returns all the sites_thematics.
	 *
	 * @return the sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public List<sites_thematic> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sites_thematics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sites_thematics
	 * @param end the upper bound of the range of sites_thematics (not inclusive)
	 * @return the range of sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public List<sites_thematic> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sites_thematics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sites_thematics
	 * @param end the upper bound of the range of sites_thematics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public List<sites_thematic> findAll(int start, int end,
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

		List<sites_thematic> list = (List<sites_thematic>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SITES_THEMATIC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SITES_THEMATIC;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<sites_thematic>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<sites_thematic>)QueryUtil.list(q,
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
	 * Removes all the sites_thematics where site_id = &#63; from the database.
	 *
	 * @param site_id the site_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBysiteId(long site_id) throws SystemException {
		for (sites_thematic sites_thematic : findBysiteId(site_id)) {
			remove(sites_thematic);
		}
	}

	/**
	 * Removes the sites_thematic where thematicid = &#63; from the database.
	 *
	 * @param thematicid the thematicid
	 * @return the sites_thematic that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public sites_thematic removeBythematicId(long thematicid)
		throws NoSuchsites_thematicException, SystemException {
		sites_thematic sites_thematic = findBythematicId(thematicid);

		return remove(sites_thematic);
	}

	/**
	 * Removes all the sites_thematics from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (sites_thematic sites_thematic : findAll()) {
			remove(sites_thematic);
		}
	}

	/**
	 * Returns the number of sites_thematics where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the number of matching sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public int countBysiteId(long site_id) throws SystemException {
		Object[] finderArgs = new Object[] { site_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SITEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITES_THEMATIC_WHERE);

			query.append(_FINDER_COLUMN_SITEID_SITE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(site_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SITEID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of sites_thematics where thematicid = &#63;.
	 *
	 * @param thematicid the thematicid
	 * @return the number of matching sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public int countBythematicId(long thematicid) throws SystemException {
		Object[] finderArgs = new Object[] { thematicid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_THEMATICID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITES_THEMATIC_WHERE);

			query.append(_FINDER_COLUMN_THEMATICID_THEMATICID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thematicid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THEMATICID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of sites_thematics.
	 *
	 * @return the number of sites_thematics
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SITES_THEMATIC);

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
	 * Initializes the sites_thematic persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.sites_thematic")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<sites_thematic>> listenersList = new ArrayList<ModelListener<sites_thematic>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<sites_thematic>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(sites_thematicImpl.class.getName());
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
	private static final String _SQL_SELECT_SITES_THEMATIC = "SELECT sites_thematic FROM sites_thematic sites_thematic";
	private static final String _SQL_SELECT_SITES_THEMATIC_WHERE = "SELECT sites_thematic FROM sites_thematic sites_thematic WHERE ";
	private static final String _SQL_COUNT_SITES_THEMATIC = "SELECT COUNT(sites_thematic) FROM sites_thematic sites_thematic";
	private static final String _SQL_COUNT_SITES_THEMATIC_WHERE = "SELECT COUNT(sites_thematic) FROM sites_thematic sites_thematic WHERE ";
	private static final String _FINDER_COLUMN_SITEID_SITE_ID_2 = "sites_thematic.site_id = ?";
	private static final String _FINDER_COLUMN_THEMATICID_THEMATICID_2 = "sites_thematic.thematicid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sites_thematic.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No sites_thematic exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No sites_thematic exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(sites_thematicPersistenceImpl.class);
	private static sites_thematic _nullsites_thematic = new sites_thematicImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<sites_thematic> toCacheModel() {
				return _nullsites_thematicCacheModel;
			}
		};

	private static CacheModel<sites_thematic> _nullsites_thematicCacheModel = new CacheModel<sites_thematic>() {
			public sites_thematic toEntityModel() {
				return _nullsites_thematic;
			}
		};
}