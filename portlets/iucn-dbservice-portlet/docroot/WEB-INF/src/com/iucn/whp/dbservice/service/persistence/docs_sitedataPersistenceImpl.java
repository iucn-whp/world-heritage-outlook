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

import com.iucn.whp.dbservice.NoSuchdocs_sitedataException;
import com.iucn.whp.dbservice.model.docs_sitedata;
import com.iucn.whp.dbservice.model.impl.docs_sitedataImpl;
import com.iucn.whp.dbservice.model.impl.docs_sitedataModelImpl;

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
 * The persistence implementation for the docs_sitedata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see docs_sitedataPersistence
 * @see docs_sitedataUtil
 * @generated
 */
public class docs_sitedataPersistenceImpl extends BasePersistenceImpl<docs_sitedata>
	implements docs_sitedataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link docs_sitedataUtil} to access the docs_sitedata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = docs_sitedataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_FILEID = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED,
			docs_sitedataImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByfileid",
			new String[] { Long.class.getName() },
			docs_sitedataModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEID = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfileid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEID = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED,
			docs_sitedataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBysiteid",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID =
		new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED,
			docs_sitedataImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBysiteid", new String[] { Long.class.getName() },
			docs_sitedataModelImpl.SITEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITEID = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysiteid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED,
			docs_sitedataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED,
			docs_sitedataImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the docs_sitedata in the entity cache if it is enabled.
	 *
	 * @param docs_sitedata the docs_sitedata
	 */
	public void cacheResult(docs_sitedata docs_sitedata) {
		EntityCacheUtil.putResult(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataImpl.class, docs_sitedata.getPrimaryKey(),
			docs_sitedata);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
			new Object[] { Long.valueOf(docs_sitedata.getFileentryid()) },
			docs_sitedata);

		docs_sitedata.resetOriginalValues();
	}

	/**
	 * Caches the docs_sitedatas in the entity cache if it is enabled.
	 *
	 * @param docs_sitedatas the docs_sitedatas
	 */
	public void cacheResult(List<docs_sitedata> docs_sitedatas) {
		for (docs_sitedata docs_sitedata : docs_sitedatas) {
			if (EntityCacheUtil.getResult(
						docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
						docs_sitedataImpl.class, docs_sitedata.getPrimaryKey()) == null) {
				cacheResult(docs_sitedata);
			}
			else {
				docs_sitedata.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all docs_sitedatas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(docs_sitedataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(docs_sitedataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the docs_sitedata.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(docs_sitedata docs_sitedata) {
		EntityCacheUtil.removeResult(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataImpl.class, docs_sitedata.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(docs_sitedata);
	}

	@Override
	public void clearCache(List<docs_sitedata> docs_sitedatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (docs_sitedata docs_sitedata : docs_sitedatas) {
			EntityCacheUtil.removeResult(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
				docs_sitedataImpl.class, docs_sitedata.getPrimaryKey());

			clearUniqueFindersCache(docs_sitedata);
		}
	}

	protected void clearUniqueFindersCache(docs_sitedata docs_sitedata) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEID,
			new Object[] { Long.valueOf(docs_sitedata.getFileentryid()) });
	}

	/**
	 * Creates a new docs_sitedata with the primary key. Does not add the docs_sitedata to the database.
	 *
	 * @param docs_sitedataId the primary key for the new docs_sitedata
	 * @return the new docs_sitedata
	 */
	public docs_sitedata create(long docs_sitedataId) {
		docs_sitedata docs_sitedata = new docs_sitedataImpl();

		docs_sitedata.setNew(true);
		docs_sitedata.setPrimaryKey(docs_sitedataId);

		return docs_sitedata;
	}

	/**
	 * Removes the docs_sitedata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docs_sitedataId the primary key of the docs_sitedata
	 * @return the docs_sitedata that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata remove(long docs_sitedataId)
		throws NoSuchdocs_sitedataException, SystemException {
		return remove(Long.valueOf(docs_sitedataId));
	}

	/**
	 * Removes the docs_sitedata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the docs_sitedata
	 * @return the docs_sitedata that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public docs_sitedata remove(Serializable primaryKey)
		throws NoSuchdocs_sitedataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			docs_sitedata docs_sitedata = (docs_sitedata)session.get(docs_sitedataImpl.class,
					primaryKey);

			if (docs_sitedata == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdocs_sitedataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(docs_sitedata);
		}
		catch (NoSuchdocs_sitedataException nsee) {
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
	protected docs_sitedata removeImpl(docs_sitedata docs_sitedata)
		throws SystemException {
		docs_sitedata = toUnwrappedModel(docs_sitedata);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, docs_sitedata);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(docs_sitedata);

		return docs_sitedata;
	}

	@Override
	public docs_sitedata updateImpl(
		com.iucn.whp.dbservice.model.docs_sitedata docs_sitedata, boolean merge)
		throws SystemException {
		docs_sitedata = toUnwrappedModel(docs_sitedata);

		boolean isNew = docs_sitedata.isNew();

		docs_sitedataModelImpl docs_sitedataModelImpl = (docs_sitedataModelImpl)docs_sitedata;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, docs_sitedata, merge);

			docs_sitedata.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !docs_sitedataModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((docs_sitedataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(docs_sitedataModelImpl.getOriginalSiteid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);

				args = new Object[] {
						Long.valueOf(docs_sitedataModelImpl.getSiteid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID,
					args);
			}
		}

		EntityCacheUtil.putResult(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
			docs_sitedataImpl.class, docs_sitedata.getPrimaryKey(),
			docs_sitedata);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
				new Object[] { Long.valueOf(docs_sitedata.getFileentryid()) },
				docs_sitedata);
		}
		else {
			if ((docs_sitedataModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(docs_sitedataModelImpl.getOriginalFileentryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEID, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEID, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
					new Object[] { Long.valueOf(docs_sitedata.getFileentryid()) },
					docs_sitedata);
			}
		}

		return docs_sitedata;
	}

	protected docs_sitedata toUnwrappedModel(docs_sitedata docs_sitedata) {
		if (docs_sitedata instanceof docs_sitedataImpl) {
			return docs_sitedata;
		}

		docs_sitedataImpl docs_sitedataImpl = new docs_sitedataImpl();

		docs_sitedataImpl.setNew(docs_sitedata.isNew());
		docs_sitedataImpl.setPrimaryKey(docs_sitedata.getPrimaryKey());

		docs_sitedataImpl.setDocs_sitedataId(docs_sitedata.getDocs_sitedataId());
		docs_sitedataImpl.setFileentryid(docs_sitedata.getFileentryid());
		docs_sitedataImpl.setFileversionid(docs_sitedata.getFileversionid());
		docs_sitedataImpl.setSiteid(docs_sitedata.getSiteid());
		docs_sitedataImpl.setDate_published(docs_sitedata.getDate_published());
		docs_sitedataImpl.setDoc_name(docs_sitedata.getDoc_name());
		docs_sitedataImpl.setDocument_link(docs_sitedata.getDocument_link());

		return docs_sitedataImpl;
	}

	/**
	 * Returns the docs_sitedata with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the docs_sitedata
	 * @return the docs_sitedata
	 * @throws com.liferay.portal.NoSuchModelException if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public docs_sitedata findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the docs_sitedata with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_sitedataException} if it could not be found.
	 *
	 * @param docs_sitedataId the primary key of the docs_sitedata
	 * @return the docs_sitedata
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata findByPrimaryKey(long docs_sitedataId)
		throws NoSuchdocs_sitedataException, SystemException {
		docs_sitedata docs_sitedata = fetchByPrimaryKey(docs_sitedataId);

		if (docs_sitedata == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + docs_sitedataId);
			}

			throw new NoSuchdocs_sitedataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				docs_sitedataId);
		}

		return docs_sitedata;
	}

	/**
	 * Returns the docs_sitedata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the docs_sitedata
	 * @return the docs_sitedata, or <code>null</code> if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public docs_sitedata fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the docs_sitedata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docs_sitedataId the primary key of the docs_sitedata
	 * @return the docs_sitedata, or <code>null</code> if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata fetchByPrimaryKey(long docs_sitedataId)
		throws SystemException {
		docs_sitedata docs_sitedata = (docs_sitedata)EntityCacheUtil.getResult(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
				docs_sitedataImpl.class, docs_sitedataId);

		if (docs_sitedata == _nulldocs_sitedata) {
			return null;
		}

		if (docs_sitedata == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				docs_sitedata = (docs_sitedata)session.get(docs_sitedataImpl.class,
						Long.valueOf(docs_sitedataId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (docs_sitedata != null) {
					cacheResult(docs_sitedata);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(docs_sitedataModelImpl.ENTITY_CACHE_ENABLED,
						docs_sitedataImpl.class, docs_sitedataId,
						_nulldocs_sitedata);
				}

				closeSession(session);
			}
		}

		return docs_sitedata;
	}

	/**
	 * Returns the docs_sitedata where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_sitedataException} if it could not be found.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching docs_sitedata
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata findByfileid(long fileentryid)
		throws NoSuchdocs_sitedataException, SystemException {
		docs_sitedata docs_sitedata = fetchByfileid(fileentryid);

		if (docs_sitedata == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fileentryid=");
			msg.append(fileentryid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchdocs_sitedataException(msg.toString());
		}

		return docs_sitedata;
	}

	/**
	 * Returns the docs_sitedata where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata fetchByfileid(long fileentryid)
		throws SystemException {
		return fetchByfileid(fileentryid, true);
	}

	/**
	 * Returns the docs_sitedata where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata fetchByfileid(long fileentryid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FILEID,
					finderArgs, this);
		}

		if (result instanceof docs_sitedata) {
			docs_sitedata docs_sitedata = (docs_sitedata)result;

			if ((fileentryid != docs_sitedata.getFileentryid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_DOCS_SITEDATA_WHERE);

			query.append(_FINDER_COLUMN_FILEID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				List<docs_sitedata> list = q.list();

				result = list;

				docs_sitedata docs_sitedata = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
						finderArgs, list);
				}
				else {
					docs_sitedata = list.get(0);

					cacheResult(docs_sitedata);

					if ((docs_sitedata.getFileentryid() != fileentryid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEID,
							finderArgs, docs_sitedata);
					}
				}

				return docs_sitedata;
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
				return (docs_sitedata)result;
			}
		}
	}

	/**
	 * Returns all the docs_sitedatas where siteid = &#63;.
	 *
	 * @param siteid the siteid
	 * @return the matching docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_sitedata> findBysiteid(long siteid)
		throws SystemException {
		return findBysiteid(siteid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the docs_sitedatas where siteid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param siteid the siteid
	 * @param start the lower bound of the range of docs_sitedatas
	 * @param end the upper bound of the range of docs_sitedatas (not inclusive)
	 * @return the range of matching docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_sitedata> findBysiteid(long siteid, int start, int end)
		throws SystemException {
		return findBysiteid(siteid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_sitedatas where siteid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param siteid the siteid
	 * @param start the lower bound of the range of docs_sitedatas
	 * @param end the upper bound of the range of docs_sitedatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_sitedata> findBysiteid(long siteid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEID;
			finderArgs = new Object[] { siteid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEID;
			finderArgs = new Object[] { siteid, start, end, orderByComparator };
		}

		List<docs_sitedata> list = (List<docs_sitedata>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (docs_sitedata docs_sitedata : list) {
				if ((siteid != docs_sitedata.getSiteid())) {
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

			query.append(_SQL_SELECT_DOCS_SITEDATA_WHERE);

			query.append(_FINDER_COLUMN_SITEID_SITEID_2);

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

				qPos.add(siteid);

				list = (List<docs_sitedata>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first docs_sitedata in the ordered set where siteid = &#63;.
	 *
	 * @param siteid the siteid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_sitedata
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata findBysiteid_First(long siteid,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_sitedataException, SystemException {
		docs_sitedata docs_sitedata = fetchBysiteid_First(siteid,
				orderByComparator);

		if (docs_sitedata != null) {
			return docs_sitedata;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("siteid=");
		msg.append(siteid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_sitedataException(msg.toString());
	}

	/**
	 * Returns the first docs_sitedata in the ordered set where siteid = &#63;.
	 *
	 * @param siteid the siteid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata fetchBysiteid_First(long siteid,
		OrderByComparator orderByComparator) throws SystemException {
		List<docs_sitedata> list = findBysiteid(siteid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last docs_sitedata in the ordered set where siteid = &#63;.
	 *
	 * @param siteid the siteid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_sitedata
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata findBysiteid_Last(long siteid,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_sitedataException, SystemException {
		docs_sitedata docs_sitedata = fetchBysiteid_Last(siteid,
				orderByComparator);

		if (docs_sitedata != null) {
			return docs_sitedata;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("siteid=");
		msg.append(siteid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_sitedataException(msg.toString());
	}

	/**
	 * Returns the last docs_sitedata in the ordered set where siteid = &#63;.
	 *
	 * @param siteid the siteid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_sitedata, or <code>null</code> if a matching docs_sitedata could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata fetchBysiteid_Last(long siteid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBysiteid(siteid);

		List<docs_sitedata> list = findBysiteid(siteid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the docs_sitedatas before and after the current docs_sitedata in the ordered set where siteid = &#63;.
	 *
	 * @param docs_sitedataId the primary key of the current docs_sitedata
	 * @param siteid the siteid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next docs_sitedata
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_sitedataException if a docs_sitedata with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata[] findBysiteid_PrevAndNext(long docs_sitedataId,
		long siteid, OrderByComparator orderByComparator)
		throws NoSuchdocs_sitedataException, SystemException {
		docs_sitedata docs_sitedata = findByPrimaryKey(docs_sitedataId);

		Session session = null;

		try {
			session = openSession();

			docs_sitedata[] array = new docs_sitedataImpl[3];

			array[0] = getBysiteid_PrevAndNext(session, docs_sitedata, siteid,
					orderByComparator, true);

			array[1] = docs_sitedata;

			array[2] = getBysiteid_PrevAndNext(session, docs_sitedata, siteid,
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

	protected docs_sitedata getBysiteid_PrevAndNext(Session session,
		docs_sitedata docs_sitedata, long siteid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCS_SITEDATA_WHERE);

		query.append(_FINDER_COLUMN_SITEID_SITEID_2);

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

		qPos.add(siteid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docs_sitedata);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<docs_sitedata> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the docs_sitedatas.
	 *
	 * @return the docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_sitedata> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the docs_sitedatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of docs_sitedatas
	 * @param end the upper bound of the range of docs_sitedatas (not inclusive)
	 * @return the range of docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_sitedata> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_sitedatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of docs_sitedatas
	 * @param end the upper bound of the range of docs_sitedatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_sitedata> findAll(int start, int end,
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

		List<docs_sitedata> list = (List<docs_sitedata>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCS_SITEDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCS_SITEDATA;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<docs_sitedata>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<docs_sitedata>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes the docs_sitedata where fileentryid = &#63; from the database.
	 *
	 * @param fileentryid the fileentryid
	 * @return the docs_sitedata that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public docs_sitedata removeByfileid(long fileentryid)
		throws NoSuchdocs_sitedataException, SystemException {
		docs_sitedata docs_sitedata = findByfileid(fileentryid);

		return remove(docs_sitedata);
	}

	/**
	 * Removes all the docs_sitedatas where siteid = &#63; from the database.
	 *
	 * @param siteid the siteid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBysiteid(long siteid) throws SystemException {
		for (docs_sitedata docs_sitedata : findBysiteid(siteid)) {
			remove(docs_sitedata);
		}
	}

	/**
	 * Removes all the docs_sitedatas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (docs_sitedata docs_sitedata : findAll()) {
			remove(docs_sitedata);
		}
	}

	/**
	 * Returns the number of docs_sitedatas where fileentryid = &#63;.
	 *
	 * @param fileentryid the fileentryid
	 * @return the number of matching docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfileid(long fileentryid) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_SITEDATA_WHERE);

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
	 * Returns the number of docs_sitedatas where siteid = &#63;.
	 *
	 * @param siteid the siteid
	 * @return the number of matching docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public int countBysiteid(long siteid) throws SystemException {
		Object[] finderArgs = new Object[] { siteid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SITEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_SITEDATA_WHERE);

			query.append(_FINDER_COLUMN_SITEID_SITEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(siteid);

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
	 * Returns the number of docs_sitedatas.
	 *
	 * @return the number of docs_sitedatas
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCS_SITEDATA);

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
	 * Initializes the docs_sitedata persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.docs_sitedata")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<docs_sitedata>> listenersList = new ArrayList<ModelListener<docs_sitedata>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<docs_sitedata>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(docs_sitedataImpl.class.getName());
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
	private static final String _SQL_SELECT_DOCS_SITEDATA = "SELECT docs_sitedata FROM docs_sitedata docs_sitedata";
	private static final String _SQL_SELECT_DOCS_SITEDATA_WHERE = "SELECT docs_sitedata FROM docs_sitedata docs_sitedata WHERE ";
	private static final String _SQL_COUNT_DOCS_SITEDATA = "SELECT COUNT(docs_sitedata) FROM docs_sitedata docs_sitedata";
	private static final String _SQL_COUNT_DOCS_SITEDATA_WHERE = "SELECT COUNT(docs_sitedata) FROM docs_sitedata docs_sitedata WHERE ";
	private static final String _FINDER_COLUMN_FILEID_FILEENTRYID_2 = "docs_sitedata.fileentryid = ?";
	private static final String _FINDER_COLUMN_SITEID_SITEID_2 = "docs_sitedata.siteid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "docs_sitedata.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No docs_sitedata exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No docs_sitedata exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(docs_sitedataPersistenceImpl.class);
	private static docs_sitedata _nulldocs_sitedata = new docs_sitedataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<docs_sitedata> toCacheModel() {
				return _nulldocs_sitedataCacheModel;
			}
		};

	private static CacheModel<docs_sitedata> _nulldocs_sitedataCacheModel = new CacheModel<docs_sitedata>() {
			public docs_sitedata toEntityModel() {
				return _nulldocs_sitedata;
			}
		};
}