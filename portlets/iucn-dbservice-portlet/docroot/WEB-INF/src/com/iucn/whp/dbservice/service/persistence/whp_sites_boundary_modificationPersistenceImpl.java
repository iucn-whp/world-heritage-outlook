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

import com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException;
import com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl;
import com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl;
import com.iucn.whp.dbservice.model.whp_sites_boundary_modification;

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
 * The persistence implementation for the whp_sites_boundary_modification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_boundary_modificationPersistence
 * @see whp_sites_boundary_modificationUtil
 * @generated
 */
public class whp_sites_boundary_modificationPersistenceImpl
	extends BasePersistenceImpl<whp_sites_boundary_modification>
	implements whp_sites_boundary_modificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link whp_sites_boundary_modificationUtil} to access the whp_sites_boundary_modification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = whp_sites_boundary_modificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_BMTYPE = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBybmtype",
			new String[] { Integer.class.getName() },
			whp_sites_boundary_modificationModelImpl.BMID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BMTYPE = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBybmtype", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEID = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySiteId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID =
		new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySiteId",
			new String[] { Long.class.getName() },
			whp_sites_boundary_modificationModelImpl.SITE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITEID = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySiteId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the whp_sites_boundary_modification in the entity cache if it is enabled.
	 *
	 * @param whp_sites_boundary_modification the whp_sites_boundary_modification
	 */
	public void cacheResult(
		whp_sites_boundary_modification whp_sites_boundary_modification) {
		EntityCacheUtil.putResult(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			whp_sites_boundary_modification.getPrimaryKey(),
			whp_sites_boundary_modification);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BMTYPE,
			new Object[] {
				Integer.valueOf(whp_sites_boundary_modification.getBmid())
			}, whp_sites_boundary_modification);

		whp_sites_boundary_modification.resetOriginalValues();
	}

	/**
	 * Caches the whp_sites_boundary_modifications in the entity cache if it is enabled.
	 *
	 * @param whp_sites_boundary_modifications the whp_sites_boundary_modifications
	 */
	public void cacheResult(
		List<whp_sites_boundary_modification> whp_sites_boundary_modifications) {
		for (whp_sites_boundary_modification whp_sites_boundary_modification : whp_sites_boundary_modifications) {
			if (EntityCacheUtil.getResult(
						whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
						whp_sites_boundary_modificationImpl.class,
						whp_sites_boundary_modification.getPrimaryKey()) == null) {
				cacheResult(whp_sites_boundary_modification);
			}
			else {
				whp_sites_boundary_modification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all whp_sites_boundary_modifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(whp_sites_boundary_modificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(whp_sites_boundary_modificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the whp_sites_boundary_modification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		whp_sites_boundary_modification whp_sites_boundary_modification) {
		EntityCacheUtil.removeResult(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			whp_sites_boundary_modification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(whp_sites_boundary_modification);
	}

	@Override
	public void clearCache(
		List<whp_sites_boundary_modification> whp_sites_boundary_modifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (whp_sites_boundary_modification whp_sites_boundary_modification : whp_sites_boundary_modifications) {
			EntityCacheUtil.removeResult(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
				whp_sites_boundary_modificationImpl.class,
				whp_sites_boundary_modification.getPrimaryKey());

			clearUniqueFindersCache(whp_sites_boundary_modification);
		}
	}

	protected void clearUniqueFindersCache(
		whp_sites_boundary_modification whp_sites_boundary_modification) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BMTYPE,
			new Object[] {
				Integer.valueOf(whp_sites_boundary_modification.getBmid())
			});
	}

	/**
	 * Creates a new whp_sites_boundary_modification with the primary key. Does not add the whp_sites_boundary_modification to the database.
	 *
	 * @param whp_sites_boundary_modification_id the primary key for the new whp_sites_boundary_modification
	 * @return the new whp_sites_boundary_modification
	 */
	public whp_sites_boundary_modification create(
		long whp_sites_boundary_modification_id) {
		whp_sites_boundary_modification whp_sites_boundary_modification = new whp_sites_boundary_modificationImpl();

		whp_sites_boundary_modification.setNew(true);
		whp_sites_boundary_modification.setPrimaryKey(whp_sites_boundary_modification_id);

		return whp_sites_boundary_modification;
	}

	/**
	 * Removes the whp_sites_boundary_modification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param whp_sites_boundary_modification_id the primary key of the whp_sites_boundary_modification
	 * @return the whp_sites_boundary_modification that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification remove(
		long whp_sites_boundary_modification_id)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		return remove(Long.valueOf(whp_sites_boundary_modification_id));
	}

	/**
	 * Removes the whp_sites_boundary_modification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the whp_sites_boundary_modification
	 * @return the whp_sites_boundary_modification that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_boundary_modification remove(Serializable primaryKey)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			whp_sites_boundary_modification whp_sites_boundary_modification = (whp_sites_boundary_modification)session.get(whp_sites_boundary_modificationImpl.class,
					primaryKey);

			if (whp_sites_boundary_modification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_sites_boundary_modificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(whp_sites_boundary_modification);
		}
		catch (NoSuch_sites_boundary_modificationException nsee) {
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
	protected whp_sites_boundary_modification removeImpl(
		whp_sites_boundary_modification whp_sites_boundary_modification)
		throws SystemException {
		whp_sites_boundary_modification = toUnwrappedModel(whp_sites_boundary_modification);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, whp_sites_boundary_modification);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(whp_sites_boundary_modification);

		return whp_sites_boundary_modification;
	}

	@Override
	public whp_sites_boundary_modification updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_boundary_modification whp_sites_boundary_modification,
		boolean merge) throws SystemException {
		whp_sites_boundary_modification = toUnwrappedModel(whp_sites_boundary_modification);

		boolean isNew = whp_sites_boundary_modification.isNew();

		whp_sites_boundary_modificationModelImpl whp_sites_boundary_modificationModelImpl =
			(whp_sites_boundary_modificationModelImpl)whp_sites_boundary_modification;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, whp_sites_boundary_modification,
				merge);

			whp_sites_boundary_modification.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!whp_sites_boundary_modificationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((whp_sites_boundary_modificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(whp_sites_boundary_modificationModelImpl.getOriginalSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);

				args = new Object[] {
						Long.valueOf(whp_sites_boundary_modificationModelImpl.getSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);
			}
		}

		EntityCacheUtil.putResult(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_boundary_modificationImpl.class,
			whp_sites_boundary_modification.getPrimaryKey(),
			whp_sites_boundary_modification);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BMTYPE,
				new Object[] {
					Integer.valueOf(whp_sites_boundary_modification.getBmid())
				}, whp_sites_boundary_modification);
		}
		else {
			if ((whp_sites_boundary_modificationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BMTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(whp_sites_boundary_modificationModelImpl.getOriginalBmid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BMTYPE, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BMTYPE, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BMTYPE,
					new Object[] {
						Integer.valueOf(
							whp_sites_boundary_modification.getBmid())
					}, whp_sites_boundary_modification);
			}
		}

		return whp_sites_boundary_modification;
	}

	protected whp_sites_boundary_modification toUnwrappedModel(
		whp_sites_boundary_modification whp_sites_boundary_modification) {
		if (whp_sites_boundary_modification instanceof whp_sites_boundary_modificationImpl) {
			return whp_sites_boundary_modification;
		}

		whp_sites_boundary_modificationImpl whp_sites_boundary_modificationImpl = new whp_sites_boundary_modificationImpl();

		whp_sites_boundary_modificationImpl.setNew(whp_sites_boundary_modification.isNew());
		whp_sites_boundary_modificationImpl.setPrimaryKey(whp_sites_boundary_modification.getPrimaryKey());

		whp_sites_boundary_modificationImpl.setWhp_sites_boundary_modification_id(whp_sites_boundary_modification.getWhp_sites_boundary_modification_id());
		whp_sites_boundary_modificationImpl.setSite_id(whp_sites_boundary_modification.getSite_id());
		whp_sites_boundary_modificationImpl.setBmid(whp_sites_boundary_modification.getBmid());
		whp_sites_boundary_modificationImpl.setDescription(whp_sites_boundary_modification.getDescription());
		whp_sites_boundary_modificationImpl.setMod_date(whp_sites_boundary_modification.getMod_date());

		return whp_sites_boundary_modificationImpl;
	}

	/**
	 * Returns the whp_sites_boundary_modification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites_boundary_modification
	 * @return the whp_sites_boundary_modification
	 * @throws com.liferay.portal.NoSuchModelException if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_boundary_modification findByPrimaryKey(
		Serializable primaryKey) throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites_boundary_modification with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException} if it could not be found.
	 *
	 * @param whp_sites_boundary_modification_id the primary key of the whp_sites_boundary_modification
	 * @return the whp_sites_boundary_modification
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification findByPrimaryKey(
		long whp_sites_boundary_modification_id)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = fetchByPrimaryKey(whp_sites_boundary_modification_id);

		if (whp_sites_boundary_modification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					whp_sites_boundary_modification_id);
			}

			throw new NoSuch_sites_boundary_modificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				whp_sites_boundary_modification_id);
		}

		return whp_sites_boundary_modification;
	}

	/**
	 * Returns the whp_sites_boundary_modification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites_boundary_modification
	 * @return the whp_sites_boundary_modification, or <code>null</code> if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_boundary_modification fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites_boundary_modification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param whp_sites_boundary_modification_id the primary key of the whp_sites_boundary_modification
	 * @return the whp_sites_boundary_modification, or <code>null</code> if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification fetchByPrimaryKey(
		long whp_sites_boundary_modification_id) throws SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = (whp_sites_boundary_modification)EntityCacheUtil.getResult(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
				whp_sites_boundary_modificationImpl.class,
				whp_sites_boundary_modification_id);

		if (whp_sites_boundary_modification == _nullwhp_sites_boundary_modification) {
			return null;
		}

		if (whp_sites_boundary_modification == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				whp_sites_boundary_modification = (whp_sites_boundary_modification)session.get(whp_sites_boundary_modificationImpl.class,
						Long.valueOf(whp_sites_boundary_modification_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (whp_sites_boundary_modification != null) {
					cacheResult(whp_sites_boundary_modification);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
						whp_sites_boundary_modificationImpl.class,
						whp_sites_boundary_modification_id,
						_nullwhp_sites_boundary_modification);
				}

				closeSession(session);
			}
		}

		return whp_sites_boundary_modification;
	}

	/**
	 * Returns the whp_sites_boundary_modification where bmid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException} if it could not be found.
	 *
	 * @param bmid the bmid
	 * @return the matching whp_sites_boundary_modification
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification findBybmtype(int bmid)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = fetchBybmtype(bmid);

		if (whp_sites_boundary_modification == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("bmid=");
			msg.append(bmid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sites_boundary_modificationException(msg.toString());
		}

		return whp_sites_boundary_modification;
	}

	/**
	 * Returns the whp_sites_boundary_modification where bmid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param bmid the bmid
	 * @return the matching whp_sites_boundary_modification, or <code>null</code> if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification fetchBybmtype(int bmid)
		throws SystemException {
		return fetchBybmtype(bmid, true);
	}

	/**
	 * Returns the whp_sites_boundary_modification where bmid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param bmid the bmid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites_boundary_modification, or <code>null</code> if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification fetchBybmtype(int bmid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { bmid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BMTYPE,
					finderArgs, this);
		}

		if (result instanceof whp_sites_boundary_modification) {
			whp_sites_boundary_modification whp_sites_boundary_modification = (whp_sites_boundary_modification)result;

			if ((bmid != whp_sites_boundary_modification.getBmid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE);

			query.append(_FINDER_COLUMN_BMTYPE_BMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bmid);

				List<whp_sites_boundary_modification> list = q.list();

				result = list;

				whp_sites_boundary_modification whp_sites_boundary_modification = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BMTYPE,
						finderArgs, list);
				}
				else {
					whp_sites_boundary_modification = list.get(0);

					cacheResult(whp_sites_boundary_modification);

					if ((whp_sites_boundary_modification.getBmid() != bmid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BMTYPE,
							finderArgs, whp_sites_boundary_modification);
					}
				}

				return whp_sites_boundary_modification;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BMTYPE,
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
				return (whp_sites_boundary_modification)result;
			}
		}
	}

	/**
	 * Returns all the whp_sites_boundary_modifications where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the matching whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_boundary_modification> findBySiteId(long site_id)
		throws SystemException {
		return findBySiteId(site_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_sites_boundary_modifications where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of whp_sites_boundary_modifications
	 * @param end the upper bound of the range of whp_sites_boundary_modifications (not inclusive)
	 * @return the range of matching whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_boundary_modification> findBySiteId(long site_id,
		int start, int end) throws SystemException {
		return findBySiteId(site_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_boundary_modifications where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of whp_sites_boundary_modifications
	 * @param end the upper bound of the range of whp_sites_boundary_modifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_boundary_modification> findBySiteId(long site_id,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<whp_sites_boundary_modification> list = (List<whp_sites_boundary_modification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (whp_sites_boundary_modification whp_sites_boundary_modification : list) {
				if ((site_id != whp_sites_boundary_modification.getSite_id())) {
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

			query.append(_SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE);

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

				list = (List<whp_sites_boundary_modification>)QueryUtil.list(q,
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
	 * Returns the first whp_sites_boundary_modification in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites_boundary_modification
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification findBySiteId_First(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = fetchBySiteId_First(site_id,
				orderByComparator);

		if (whp_sites_boundary_modification != null) {
			return whp_sites_boundary_modification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sites_boundary_modificationException(msg.toString());
	}

	/**
	 * Returns the first whp_sites_boundary_modification in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites_boundary_modification, or <code>null</code> if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification fetchBySiteId_First(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		List<whp_sites_boundary_modification> list = findBySiteId(site_id, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last whp_sites_boundary_modification in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites_boundary_modification
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification findBySiteId_Last(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = fetchBySiteId_Last(site_id,
				orderByComparator);

		if (whp_sites_boundary_modification != null) {
			return whp_sites_boundary_modification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sites_boundary_modificationException(msg.toString());
	}

	/**
	 * Returns the last whp_sites_boundary_modification in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites_boundary_modification, or <code>null</code> if a matching whp_sites_boundary_modification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification fetchBySiteId_Last(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySiteId(site_id);

		List<whp_sites_boundary_modification> list = findBySiteId(site_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the whp_sites_boundary_modifications before and after the current whp_sites_boundary_modification in the ordered set where site_id = &#63;.
	 *
	 * @param whp_sites_boundary_modification_id the primary key of the current whp_sites_boundary_modification
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next whp_sites_boundary_modification
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_boundary_modificationException if a whp_sites_boundary_modification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification[] findBySiteId_PrevAndNext(
		long whp_sites_boundary_modification_id, long site_id,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = findByPrimaryKey(whp_sites_boundary_modification_id);

		Session session = null;

		try {
			session = openSession();

			whp_sites_boundary_modification[] array = new whp_sites_boundary_modificationImpl[3];

			array[0] = getBySiteId_PrevAndNext(session,
					whp_sites_boundary_modification, site_id,
					orderByComparator, true);

			array[1] = whp_sites_boundary_modification;

			array[2] = getBySiteId_PrevAndNext(session,
					whp_sites_boundary_modification, site_id,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected whp_sites_boundary_modification getBySiteId_PrevAndNext(
		Session session,
		whp_sites_boundary_modification whp_sites_boundary_modification,
		long site_id, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(whp_sites_boundary_modification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<whp_sites_boundary_modification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the whp_sites_boundary_modifications.
	 *
	 * @return the whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_boundary_modification> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_sites_boundary_modifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_sites_boundary_modifications
	 * @param end the upper bound of the range of whp_sites_boundary_modifications (not inclusive)
	 * @return the range of whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_boundary_modification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_boundary_modifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_sites_boundary_modifications
	 * @param end the upper bound of the range of whp_sites_boundary_modifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_boundary_modification> findAll(int start, int end,
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

		List<whp_sites_boundary_modification> list = (List<whp_sites_boundary_modification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<whp_sites_boundary_modification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<whp_sites_boundary_modification>)QueryUtil.list(q,
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
	 * Removes the whp_sites_boundary_modification where bmid = &#63; from the database.
	 *
	 * @param bmid the bmid
	 * @return the whp_sites_boundary_modification that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_boundary_modification removeBybmtype(int bmid)
		throws NoSuch_sites_boundary_modificationException, SystemException {
		whp_sites_boundary_modification whp_sites_boundary_modification = findBybmtype(bmid);

		return remove(whp_sites_boundary_modification);
	}

	/**
	 * Removes all the whp_sites_boundary_modifications where site_id = &#63; from the database.
	 *
	 * @param site_id the site_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySiteId(long site_id) throws SystemException {
		for (whp_sites_boundary_modification whp_sites_boundary_modification : findBySiteId(
				site_id)) {
			remove(whp_sites_boundary_modification);
		}
	}

	/**
	 * Removes all the whp_sites_boundary_modifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (whp_sites_boundary_modification whp_sites_boundary_modification : findAll()) {
			remove(whp_sites_boundary_modification);
		}
	}

	/**
	 * Returns the number of whp_sites_boundary_modifications where bmid = &#63;.
	 *
	 * @param bmid the bmid
	 * @return the number of matching whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public int countBybmtype(int bmid) throws SystemException {
		Object[] finderArgs = new Object[] { bmid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BMTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE);

			query.append(_FINDER_COLUMN_BMTYPE_BMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bmid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BMTYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_sites_boundary_modifications where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the number of matching whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySiteId(long site_id) throws SystemException {
		Object[] finderArgs = new Object[] { site_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SITEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE);

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
	 * Returns the number of whp_sites_boundary_modifications.
	 *
	 * @return the number of whp_sites_boundary_modifications
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WHP_SITES_BOUNDARY_MODIFICATION);

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
	 * Initializes the whp_sites_boundary_modification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.whp_sites_boundary_modification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<whp_sites_boundary_modification>> listenersList =
					new ArrayList<ModelListener<whp_sites_boundary_modification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<whp_sites_boundary_modification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(whp_sites_boundary_modificationImpl.class.getName());
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
	private static final String _SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION = "SELECT whp_sites_boundary_modification FROM whp_sites_boundary_modification whp_sites_boundary_modification";
	private static final String _SQL_SELECT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE =
		"SELECT whp_sites_boundary_modification FROM whp_sites_boundary_modification whp_sites_boundary_modification WHERE ";
	private static final String _SQL_COUNT_WHP_SITES_BOUNDARY_MODIFICATION = "SELECT COUNT(whp_sites_boundary_modification) FROM whp_sites_boundary_modification whp_sites_boundary_modification";
	private static final String _SQL_COUNT_WHP_SITES_BOUNDARY_MODIFICATION_WHERE =
		"SELECT COUNT(whp_sites_boundary_modification) FROM whp_sites_boundary_modification whp_sites_boundary_modification WHERE ";
	private static final String _FINDER_COLUMN_BMTYPE_BMID_2 = "whp_sites_boundary_modification.bmid = ?";
	private static final String _FINDER_COLUMN_SITEID_SITE_ID_2 = "whp_sites_boundary_modification.site_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "whp_sites_boundary_modification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No whp_sites_boundary_modification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No whp_sites_boundary_modification exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(whp_sites_boundary_modificationPersistenceImpl.class);
	private static whp_sites_boundary_modification _nullwhp_sites_boundary_modification =
		new whp_sites_boundary_modificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<whp_sites_boundary_modification> toCacheModel() {
				return _nullwhp_sites_boundary_modificationCacheModel;
			}
		};

	private static CacheModel<whp_sites_boundary_modification> _nullwhp_sites_boundary_modificationCacheModel =
		new CacheModel<whp_sites_boundary_modification>() {
			public whp_sites_boundary_modification toEntityModel() {
				return _nullwhp_sites_boundary_modification;
			}
		};
}