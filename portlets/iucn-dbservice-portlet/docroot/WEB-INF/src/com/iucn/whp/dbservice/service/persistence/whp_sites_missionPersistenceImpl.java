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

import com.iucn.whp.dbservice.NoSuch_sites_missionException;
import com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl;
import com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl;
import com.iucn.whp.dbservice.model.whp_sites_mission;

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
 * The persistence implementation for the whp_sites_mission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_missionPersistence
 * @see whp_sites_missionUtil
 * @generated
 */
public class whp_sites_missionPersistenceImpl extends BasePersistenceImpl<whp_sites_mission>
	implements whp_sites_missionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link whp_sites_missionUtil} to access the whp_sites_mission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = whp_sites_missionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_MISSIONTYPE = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_missionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBymissiontype", new String[] { Integer.class.getName() },
			whp_sites_missionModelImpl.MISSIONTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MISSIONTYPE = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymissiontype",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_FILEID = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_missionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByfileId", new String[] { Long.class.getName() },
			whp_sites_missionModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEID = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfileId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEID = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_missionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySiteId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID =
		new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_missionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySiteId",
			new String[] { Long.class.getName() },
			whp_sites_missionModelImpl.SITE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITEID = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySiteId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_missionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_missionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the whp_sites_mission in the entity cache if it is enabled.
	 *
	 * @param whp_sites_mission the whp_sites_mission
	 */
	public void cacheResult(whp_sites_mission whp_sites_mission) {
		EntityCacheUtil.putResult(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionImpl.class, whp_sites_mission.getPrimaryKey(),
			whp_sites_mission);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
			new Object[] { Integer.valueOf(whp_sites_mission.getMissiontype()) },
			whp_sites_mission);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
			new Object[] { Long.valueOf(whp_sites_mission.getFileentryid()) },
			whp_sites_mission);

		whp_sites_mission.resetOriginalValues();
	}

	/**
	 * Caches the whp_sites_missions in the entity cache if it is enabled.
	 *
	 * @param whp_sites_missions the whp_sites_missions
	 */
	public void cacheResult(List<whp_sites_mission> whp_sites_missions) {
		for (whp_sites_mission whp_sites_mission : whp_sites_missions) {
			if (EntityCacheUtil.getResult(
						whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
						whp_sites_missionImpl.class,
						whp_sites_mission.getPrimaryKey()) == null) {
				cacheResult(whp_sites_mission);
			}
			else {
				whp_sites_mission.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all whp_sites_missions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(whp_sites_missionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(whp_sites_missionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the whp_sites_mission.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(whp_sites_mission whp_sites_mission) {
		EntityCacheUtil.removeResult(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionImpl.class, whp_sites_mission.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(whp_sites_mission);
	}

	@Override
	public void clearCache(List<whp_sites_mission> whp_sites_missions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (whp_sites_mission whp_sites_mission : whp_sites_missions) {
			EntityCacheUtil.removeResult(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
				whp_sites_missionImpl.class, whp_sites_mission.getPrimaryKey());

			clearUniqueFindersCache(whp_sites_mission);
		}
	}

	protected void clearUniqueFindersCache(whp_sites_mission whp_sites_mission) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
			new Object[] { Integer.valueOf(whp_sites_mission.getMissiontype()) });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEID,
			new Object[] { Long.valueOf(whp_sites_mission.getFileentryid()) });
	}

	/**
	 * Creates a new whp_sites_mission with the primary key. Does not add the whp_sites_mission to the database.
	 *
	 * @param whp_sites_mission_id the primary key for the new whp_sites_mission
	 * @return the new whp_sites_mission
	 */
	public whp_sites_mission create(long whp_sites_mission_id) {
		whp_sites_mission whp_sites_mission = new whp_sites_missionImpl();

		whp_sites_mission.setNew(true);
		whp_sites_mission.setPrimaryKey(whp_sites_mission_id);

		return whp_sites_mission;
	}

	/**
	 * Removes the whp_sites_mission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param whp_sites_mission_id the primary key of the whp_sites_mission
	 * @return the whp_sites_mission that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission remove(long whp_sites_mission_id)
		throws NoSuch_sites_missionException, SystemException {
		return remove(Long.valueOf(whp_sites_mission_id));
	}

	/**
	 * Removes the whp_sites_mission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the whp_sites_mission
	 * @return the whp_sites_mission that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_mission remove(Serializable primaryKey)
		throws NoSuch_sites_missionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			whp_sites_mission whp_sites_mission = (whp_sites_mission)session.get(whp_sites_missionImpl.class,
					primaryKey);

			if (whp_sites_mission == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_sites_missionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(whp_sites_mission);
		}
		catch (NoSuch_sites_missionException nsee) {
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
	protected whp_sites_mission removeImpl(whp_sites_mission whp_sites_mission)
		throws SystemException {
		whp_sites_mission = toUnwrappedModel(whp_sites_mission);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, whp_sites_mission);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(whp_sites_mission);

		return whp_sites_mission;
	}

	@Override
	public whp_sites_mission updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_mission whp_sites_mission,
		boolean merge) throws SystemException {
		whp_sites_mission = toUnwrappedModel(whp_sites_mission);

		boolean isNew = whp_sites_mission.isNew();

		whp_sites_missionModelImpl whp_sites_missionModelImpl = (whp_sites_missionModelImpl)whp_sites_mission;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, whp_sites_mission, merge);

			whp_sites_mission.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !whp_sites_missionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((whp_sites_missionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(whp_sites_missionModelImpl.getOriginalSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);

				args = new Object[] {
						Long.valueOf(whp_sites_missionModelImpl.getSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);
			}
		}

		EntityCacheUtil.putResult(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_missionImpl.class, whp_sites_mission.getPrimaryKey(),
			whp_sites_mission);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
				new Object[] { Integer.valueOf(
						whp_sites_mission.getMissiontype()) }, whp_sites_mission);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
				new Object[] { Long.valueOf(whp_sites_mission.getFileentryid()) },
				whp_sites_mission);
		}
		else {
			if ((whp_sites_missionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MISSIONTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(whp_sites_missionModelImpl.getOriginalMissiontype())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MISSIONTYPE,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
					new Object[] {
						Integer.valueOf(whp_sites_mission.getMissiontype())
					}, whp_sites_mission);
			}

			if ((whp_sites_missionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(whp_sites_missionModelImpl.getOriginalFileentryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEID, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEID, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
					new Object[] {
						Long.valueOf(whp_sites_mission.getFileentryid())
					}, whp_sites_mission);
			}
		}

		return whp_sites_mission;
	}

	protected whp_sites_mission toUnwrappedModel(
		whp_sites_mission whp_sites_mission) {
		if (whp_sites_mission instanceof whp_sites_missionImpl) {
			return whp_sites_mission;
		}

		whp_sites_missionImpl whp_sites_missionImpl = new whp_sites_missionImpl();

		whp_sites_missionImpl.setNew(whp_sites_mission.isNew());
		whp_sites_missionImpl.setPrimaryKey(whp_sites_mission.getPrimaryKey());

		whp_sites_missionImpl.setWhp_sites_mission_id(whp_sites_mission.getWhp_sites_mission_id());
		whp_sites_missionImpl.setSite_id(whp_sites_mission.getSite_id());
		whp_sites_missionImpl.setMissiontype(whp_sites_mission.getMissiontype());
		whp_sites_missionImpl.setDate_published(whp_sites_mission.getDate_published());
		whp_sites_missionImpl.setDocument_link(whp_sites_mission.getDocument_link());
		whp_sites_missionImpl.setFileentryid(whp_sites_mission.getFileentryid());
		whp_sites_missionImpl.setDoc_name(whp_sites_mission.getDoc_name());

		return whp_sites_missionImpl;
	}

	/**
	 * Returns the whp_sites_mission with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites_mission
	 * @return the whp_sites_mission
	 * @throws com.liferay.portal.NoSuchModelException if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_mission findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites_mission with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_missionException} if it could not be found.
	 *
	 * @param whp_sites_mission_id the primary key of the whp_sites_mission
	 * @return the whp_sites_mission
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission findByPrimaryKey(long whp_sites_mission_id)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = fetchByPrimaryKey(whp_sites_mission_id);

		if (whp_sites_mission == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					whp_sites_mission_id);
			}

			throw new NoSuch_sites_missionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				whp_sites_mission_id);
		}

		return whp_sites_mission;
	}

	/**
	 * Returns the whp_sites_mission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites_mission
	 * @return the whp_sites_mission, or <code>null</code> if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_mission fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites_mission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param whp_sites_mission_id the primary key of the whp_sites_mission
	 * @return the whp_sites_mission, or <code>null</code> if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchByPrimaryKey(long whp_sites_mission_id)
		throws SystemException {
		whp_sites_mission whp_sites_mission = (whp_sites_mission)EntityCacheUtil.getResult(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
				whp_sites_missionImpl.class, whp_sites_mission_id);

		if (whp_sites_mission == _nullwhp_sites_mission) {
			return null;
		}

		if (whp_sites_mission == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				whp_sites_mission = (whp_sites_mission)session.get(whp_sites_missionImpl.class,
						Long.valueOf(whp_sites_mission_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (whp_sites_mission != null) {
					cacheResult(whp_sites_mission);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
						whp_sites_missionImpl.class, whp_sites_mission_id,
						_nullwhp_sites_mission);
				}

				closeSession(session);
			}
		}

		return whp_sites_mission;
	}

	/**
	 * Returns the whp_sites_mission where missiontype = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_missionException} if it could not be found.
	 *
	 * @param missiontype the missiontype
	 * @return the matching whp_sites_mission
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission findBymissiontype(int missiontype)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = fetchBymissiontype(missiontype);

		if (whp_sites_mission == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("missiontype=");
			msg.append(missiontype);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sites_missionException(msg.toString());
		}

		return whp_sites_mission;
	}

	/**
	 * Returns the whp_sites_mission where missiontype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param missiontype the missiontype
	 * @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchBymissiontype(int missiontype)
		throws SystemException {
		return fetchBymissiontype(missiontype, true);
	}

	/**
	 * Returns the whp_sites_mission where missiontype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param missiontype the missiontype
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchBymissiontype(int missiontype,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { missiontype };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
					finderArgs, this);
		}

		if (result instanceof whp_sites_mission) {
			whp_sites_mission whp_sites_mission = (whp_sites_mission)result;

			if ((missiontype != whp_sites_mission.getMissiontype())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_WHP_SITES_MISSION_WHERE);

			query.append(_FINDER_COLUMN_MISSIONTYPE_MISSIONTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(missiontype);

				List<whp_sites_mission> list = q.list();

				result = list;

				whp_sites_mission whp_sites_mission = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
						finderArgs, list);
				}
				else {
					whp_sites_mission = list.get(0);

					cacheResult(whp_sites_mission);

					if ((whp_sites_mission.getMissiontype() != missiontype)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
							finderArgs, whp_sites_mission);
					}
				}

				return whp_sites_mission;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MISSIONTYPE,
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
				return (whp_sites_mission)result;
			}
		}
	}

	/**
	 * Returns the whp_sites_mission where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_missionException} if it could not be found.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching whp_sites_mission
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission findByfileId(long fileentryid)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = fetchByfileId(fileentryid);

		if (whp_sites_mission == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fileentryid=");
			msg.append(fileentryid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sites_missionException(msg.toString());
		}

		return whp_sites_mission;
	}

	/**
	 * Returns the whp_sites_mission where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchByfileId(long fileentryid)
		throws SystemException {
		return fetchByfileId(fileentryid, true);
	}

	/**
	 * Returns the whp_sites_mission where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchByfileId(long fileentryid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FILEID,
					finderArgs, this);
		}

		if (result instanceof whp_sites_mission) {
			whp_sites_mission whp_sites_mission = (whp_sites_mission)result;

			if ((fileentryid != whp_sites_mission.getFileentryid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_WHP_SITES_MISSION_WHERE);

			query.append(_FINDER_COLUMN_FILEID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				List<whp_sites_mission> list = q.list();

				result = list;

				whp_sites_mission whp_sites_mission = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
						finderArgs, list);
				}
				else {
					whp_sites_mission = list.get(0);

					cacheResult(whp_sites_mission);

					if ((whp_sites_mission.getFileentryid() != fileentryid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
							finderArgs, whp_sites_mission);
					}
				}

				return whp_sites_mission;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEID,
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
				return (whp_sites_mission)result;
			}
		}
	}

	/**
	 * Returns all the whp_sites_missions where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the matching whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_mission> findBySiteId(long site_id)
		throws SystemException {
		return findBySiteId(site_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_sites_missions where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of whp_sites_missions
	 * @param end the upper bound of the range of whp_sites_missions (not inclusive)
	 * @return the range of matching whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_mission> findBySiteId(long site_id, int start, int end)
		throws SystemException {
		return findBySiteId(site_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_missions where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of whp_sites_missions
	 * @param end the upper bound of the range of whp_sites_missions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_mission> findBySiteId(long site_id, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<whp_sites_mission> list = (List<whp_sites_mission>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (whp_sites_mission whp_sites_mission : list) {
				if ((site_id != whp_sites_mission.getSite_id())) {
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

			query.append(_SQL_SELECT_WHP_SITES_MISSION_WHERE);

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

				list = (List<whp_sites_mission>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first whp_sites_mission in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites_mission
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission findBySiteId_First(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = fetchBySiteId_First(site_id,
				orderByComparator);

		if (whp_sites_mission != null) {
			return whp_sites_mission;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sites_missionException(msg.toString());
	}

	/**
	 * Returns the first whp_sites_mission in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchBySiteId_First(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		List<whp_sites_mission> list = findBySiteId(site_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last whp_sites_mission in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites_mission
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission findBySiteId_Last(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = fetchBySiteId_Last(site_id,
				orderByComparator);

		if (whp_sites_mission != null) {
			return whp_sites_mission;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sites_missionException(msg.toString());
	}

	/**
	 * Returns the last whp_sites_mission in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites_mission, or <code>null</code> if a matching whp_sites_mission could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission fetchBySiteId_Last(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySiteId(site_id);

		List<whp_sites_mission> list = findBySiteId(site_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the whp_sites_missions before and after the current whp_sites_mission in the ordered set where site_id = &#63;.
	 *
	 * @param whp_sites_mission_id the primary key of the current whp_sites_mission
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next whp_sites_mission
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_missionException if a whp_sites_mission with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission[] findBySiteId_PrevAndNext(
		long whp_sites_mission_id, long site_id,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = findByPrimaryKey(whp_sites_mission_id);

		Session session = null;

		try {
			session = openSession();

			whp_sites_mission[] array = new whp_sites_missionImpl[3];

			array[0] = getBySiteId_PrevAndNext(session, whp_sites_mission,
					site_id, orderByComparator, true);

			array[1] = whp_sites_mission;

			array[2] = getBySiteId_PrevAndNext(session, whp_sites_mission,
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

	protected whp_sites_mission getBySiteId_PrevAndNext(Session session,
		whp_sites_mission whp_sites_mission, long site_id,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WHP_SITES_MISSION_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(whp_sites_mission);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<whp_sites_mission> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the whp_sites_missions.
	 *
	 * @return the whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_mission> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_sites_missions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_sites_missions
	 * @param end the upper bound of the range of whp_sites_missions (not inclusive)
	 * @return the range of whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_mission> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_missions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_sites_missions
	 * @param end the upper bound of the range of whp_sites_missions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_mission> findAll(int start, int end,
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

		List<whp_sites_mission> list = (List<whp_sites_mission>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WHP_SITES_MISSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WHP_SITES_MISSION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<whp_sites_mission>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<whp_sites_mission>)QueryUtil.list(q,
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
	 * Removes the whp_sites_mission where missiontype = &#63; from the database.
	 *
	 * @param missiontype the missiontype
	 * @return the whp_sites_mission that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission removeBymissiontype(int missiontype)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = findBymissiontype(missiontype);

		return remove(whp_sites_mission);
	}

	/**
	 * Removes the whp_sites_mission where fileentryid = &#63; from the database.
	 *
	 * @param fileentryid the fileentryid
	 * @return the whp_sites_mission that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_mission removeByfileId(long fileentryid)
		throws NoSuch_sites_missionException, SystemException {
		whp_sites_mission whp_sites_mission = findByfileId(fileentryid);

		return remove(whp_sites_mission);
	}

	/**
	 * Removes all the whp_sites_missions where site_id = &#63; from the database.
	 *
	 * @param site_id the site_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySiteId(long site_id) throws SystemException {
		for (whp_sites_mission whp_sites_mission : findBySiteId(site_id)) {
			remove(whp_sites_mission);
		}
	}

	/**
	 * Removes all the whp_sites_missions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (whp_sites_mission whp_sites_mission : findAll()) {
			remove(whp_sites_mission);
		}
	}

	/**
	 * Returns the number of whp_sites_missions where missiontype = &#63;.
	 *
	 * @param missiontype the missiontype
	 * @return the number of matching whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public int countBymissiontype(int missiontype) throws SystemException {
		Object[] finderArgs = new Object[] { missiontype };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MISSIONTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_MISSION_WHERE);

			query.append(_FINDER_COLUMN_MISSIONTYPE_MISSIONTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(missiontype);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MISSIONTYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_sites_missions where fileentryid = &#63;.
	 *
	 * @param fileentryid the fileentryid
	 * @return the number of matching whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfileId(long fileentryid) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_MISSION_WHERE);

			query.append(_FINDER_COLUMN_FILEID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILEID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_sites_missions where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the number of matching whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySiteId(long site_id) throws SystemException {
		Object[] finderArgs = new Object[] { site_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SITEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_MISSION_WHERE);

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
	 * Returns the number of whp_sites_missions.
	 *
	 * @return the number of whp_sites_missions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WHP_SITES_MISSION);

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
	 * Initializes the whp_sites_mission persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.whp_sites_mission")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<whp_sites_mission>> listenersList = new ArrayList<ModelListener<whp_sites_mission>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<whp_sites_mission>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(whp_sites_missionImpl.class.getName());
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
	private static final String _SQL_SELECT_WHP_SITES_MISSION = "SELECT whp_sites_mission FROM whp_sites_mission whp_sites_mission";
	private static final String _SQL_SELECT_WHP_SITES_MISSION_WHERE = "SELECT whp_sites_mission FROM whp_sites_mission whp_sites_mission WHERE ";
	private static final String _SQL_COUNT_WHP_SITES_MISSION = "SELECT COUNT(whp_sites_mission) FROM whp_sites_mission whp_sites_mission";
	private static final String _SQL_COUNT_WHP_SITES_MISSION_WHERE = "SELECT COUNT(whp_sites_mission) FROM whp_sites_mission whp_sites_mission WHERE ";
	private static final String _FINDER_COLUMN_MISSIONTYPE_MISSIONTYPE_2 = "whp_sites_mission.missiontype = ?";
	private static final String _FINDER_COLUMN_FILEID_FILEENTRYID_2 = "whp_sites_mission.fileentryid = ?";
	private static final String _FINDER_COLUMN_SITEID_SITE_ID_2 = "whp_sites_mission.site_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "whp_sites_mission.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No whp_sites_mission exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No whp_sites_mission exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(whp_sites_missionPersistenceImpl.class);
	private static whp_sites_mission _nullwhp_sites_mission = new whp_sites_missionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<whp_sites_mission> toCacheModel() {
				return _nullwhp_sites_missionCacheModel;
			}
		};

	private static CacheModel<whp_sites_mission> _nullwhp_sites_missionCacheModel =
		new CacheModel<whp_sites_mission>() {
			public whp_sites_mission toEntityModel() {
				return _nullwhp_sites_mission;
			}
		};
}