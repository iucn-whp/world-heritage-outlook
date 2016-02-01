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

import com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException;
import com.iucn.whp.dbservice.model.impl.threat_categories_lkpImpl;
import com.iucn.whp.dbservice.model.impl.threat_categories_lkpModelImpl;
import com.iucn.whp.dbservice.model.threat_categories_lkp;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQuery;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
 * The persistence implementation for the threat_categories_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see threat_categories_lkpPersistence
 * @see threat_categories_lkpUtil
 * @generated
 */
public class threat_categories_lkpPersistenceImpl extends BasePersistenceImpl<threat_categories_lkp>
	implements threat_categories_lkpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link threat_categories_lkpUtil} to access the threat_categories_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = threat_categories_lkpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			threat_categories_lkpModelImpl.FINDER_CACHE_ENABLED,
			threat_categories_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			threat_categories_lkpModelImpl.FINDER_CACHE_ENABLED,
			threat_categories_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			threat_categories_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the threat_categories_lkp in the entity cache if it is enabled.
	 *
	 * @param threat_categories_lkp the threat_categories_lkp
	 */
	public void cacheResult(threat_categories_lkp threat_categories_lkp) {
		EntityCacheUtil.putResult(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			threat_categories_lkpImpl.class,
			threat_categories_lkp.getPrimaryKey(), threat_categories_lkp);

		threat_categories_lkp.resetOriginalValues();
	}

	/**
	 * Caches the threat_categories_lkps in the entity cache if it is enabled.
	 *
	 * @param threat_categories_lkps the threat_categories_lkps
	 */
	public void cacheResult(List<threat_categories_lkp> threat_categories_lkps) {
		for (threat_categories_lkp threat_categories_lkp : threat_categories_lkps) {
			if (EntityCacheUtil.getResult(
						threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
						threat_categories_lkpImpl.class,
						threat_categories_lkp.getPrimaryKey()) == null) {
				cacheResult(threat_categories_lkp);
			}
			else {
				threat_categories_lkp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all threat_categories_lkps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(threat_categories_lkpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(threat_categories_lkpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the threat_categories_lkp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(threat_categories_lkp threat_categories_lkp) {
		EntityCacheUtil.removeResult(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			threat_categories_lkpImpl.class,
			threat_categories_lkp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<threat_categories_lkp> threat_categories_lkps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (threat_categories_lkp threat_categories_lkp : threat_categories_lkps) {
			EntityCacheUtil.removeResult(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
				threat_categories_lkpImpl.class,
				threat_categories_lkp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new threat_categories_lkp with the primary key. Does not add the threat_categories_lkp to the database.
	 *
	 * @param threatCategoryid the primary key for the new threat_categories_lkp
	 * @return the new threat_categories_lkp
	 */
	public threat_categories_lkp create(long threatCategoryid) {
		threat_categories_lkp threat_categories_lkp = new threat_categories_lkpImpl();

		threat_categories_lkp.setNew(true);
		threat_categories_lkp.setPrimaryKey(threatCategoryid);

		return threat_categories_lkp;
	}

	/**
	 * Removes the threat_categories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param threatCategoryid the primary key of the threat_categories_lkp
	 * @return the threat_categories_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException if a threat_categories_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_categories_lkp remove(long threatCategoryid)
		throws NoSuchthreat_categories_lkpException, SystemException {
		return remove(Long.valueOf(threatCategoryid));
	}

	/**
	 * Removes the threat_categories_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the threat_categories_lkp
	 * @return the threat_categories_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException if a threat_categories_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public threat_categories_lkp remove(Serializable primaryKey)
		throws NoSuchthreat_categories_lkpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			threat_categories_lkp threat_categories_lkp = (threat_categories_lkp)session.get(threat_categories_lkpImpl.class,
					primaryKey);

			if (threat_categories_lkp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchthreat_categories_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(threat_categories_lkp);
		}
		catch (NoSuchthreat_categories_lkpException nsee) {
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
	protected threat_categories_lkp removeImpl(
		threat_categories_lkp threat_categories_lkp) throws SystemException {
		threat_categories_lkp = toUnwrappedModel(threat_categories_lkp);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, threat_categories_lkp);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(threat_categories_lkp);

		return threat_categories_lkp;
	}

	@Override
	public threat_categories_lkp updateImpl(
		com.iucn.whp.dbservice.model.threat_categories_lkp threat_categories_lkp,
		boolean merge) throws SystemException {
		threat_categories_lkp = toUnwrappedModel(threat_categories_lkp);

		boolean isNew = threat_categories_lkp.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, threat_categories_lkp, merge);

			threat_categories_lkp.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			threat_categories_lkpImpl.class,
			threat_categories_lkp.getPrimaryKey(), threat_categories_lkp);

		return threat_categories_lkp;
	}

	protected threat_categories_lkp toUnwrappedModel(
		threat_categories_lkp threat_categories_lkp) {
		if (threat_categories_lkp instanceof threat_categories_lkpImpl) {
			return threat_categories_lkp;
		}

		threat_categories_lkpImpl threat_categories_lkpImpl = new threat_categories_lkpImpl();

		threat_categories_lkpImpl.setNew(threat_categories_lkp.isNew());
		threat_categories_lkpImpl.setPrimaryKey(threat_categories_lkp.getPrimaryKey());

		threat_categories_lkpImpl.setThreatCategoryid(threat_categories_lkp.getThreatCategoryid());
		threat_categories_lkpImpl.setThreat_category(threat_categories_lkp.getThreat_category());

		return threat_categories_lkpImpl;
	}

	/**
	 * Returns the threat_categories_lkp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the threat_categories_lkp
	 * @return the threat_categories_lkp
	 * @throws com.liferay.portal.NoSuchModelException if a threat_categories_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public threat_categories_lkp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the threat_categories_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException} if it could not be found.
	 *
	 * @param threatCategoryid the primary key of the threat_categories_lkp
	 * @return the threat_categories_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_categories_lkpException if a threat_categories_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_categories_lkp findByPrimaryKey(long threatCategoryid)
		throws NoSuchthreat_categories_lkpException, SystemException {
		threat_categories_lkp threat_categories_lkp = fetchByPrimaryKey(threatCategoryid);

		if (threat_categories_lkp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + threatCategoryid);
			}

			throw new NoSuchthreat_categories_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				threatCategoryid);
		}

		return threat_categories_lkp;
	}

	/**
	 * Returns the threat_categories_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the threat_categories_lkp
	 * @return the threat_categories_lkp, or <code>null</code> if a threat_categories_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public threat_categories_lkp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the threat_categories_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param threatCategoryid the primary key of the threat_categories_lkp
	 * @return the threat_categories_lkp, or <code>null</code> if a threat_categories_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_categories_lkp fetchByPrimaryKey(long threatCategoryid)
		throws SystemException {
		threat_categories_lkp threat_categories_lkp = (threat_categories_lkp)EntityCacheUtil.getResult(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
				threat_categories_lkpImpl.class, threatCategoryid);

		if (threat_categories_lkp == _nullthreat_categories_lkp) {
			return null;
		}

		if (threat_categories_lkp == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				threat_categories_lkp = (threat_categories_lkp)session.get(threat_categories_lkpImpl.class,
						Long.valueOf(threatCategoryid));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (threat_categories_lkp != null) {
					cacheResult(threat_categories_lkp);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(threat_categories_lkpModelImpl.ENTITY_CACHE_ENABLED,
						threat_categories_lkpImpl.class, threatCategoryid,
						_nullthreat_categories_lkp);
				}

				closeSession(session);
			}
		}

		return threat_categories_lkp;
	}

	/**
	 * Returns all the threat_categories_lkps.
	 *
	 * @return the threat_categories_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_categories_lkp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the threat_categories_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of threat_categories_lkps
	 * @param end the upper bound of the range of threat_categories_lkps (not inclusive)
	 * @return the range of threat_categories_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_categories_lkp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the threat_categories_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of threat_categories_lkps
	 * @param end the upper bound of the range of threat_categories_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of threat_categories_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_categories_lkp> findAll(int start, int end,
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

		List<threat_categories_lkp> list = (List<threat_categories_lkp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THREAT_CATEGORIES_LKP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THREAT_CATEGORIES_LKP;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<threat_categories_lkp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<threat_categories_lkp>)QueryUtil.list(q,
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
	 * Removes all the threat_categories_lkps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (threat_categories_lkp threat_categories_lkp : findAll()) {
			remove(threat_categories_lkp);
		}
	}

	/**
	 * Returns the number of threat_categories_lkps.
	 *
	 * @return the number of threat_categories_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_THREAT_CATEGORIES_LKP);

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
	 * Returns all the threat_subcategories_lkps associated with the threat_categories_lkp.
	 *
	 * @param pk the primary key of the threat_categories_lkp
	 * @return the threat_subcategories_lkps associated with the threat_categories_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> getthreat_subcategories_lkps(
		long pk) throws SystemException {
		return getthreat_subcategories_lkps(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the threat_subcategories_lkps associated with the threat_categories_lkp.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the threat_categories_lkp
	 * @param start the lower bound of the range of threat_categories_lkps
	 * @param end the upper bound of the range of threat_categories_lkps (not inclusive)
	 * @return the range of threat_subcategories_lkps associated with the threat_categories_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> getthreat_subcategories_lkps(
		long pk, int start, int end) throws SystemException {
		return getthreat_subcategories_lkps(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_subcategories_lkpPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_subcategories_lkps",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the threat_subcategories_lkps associated with the threat_categories_lkp.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the threat_categories_lkp
	 * @param start the lower bound of the range of threat_categories_lkps
	 * @param end the upper bound of the range of threat_categories_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of threat_subcategories_lkps associated with the threat_categories_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> getthreat_subcategories_lkps(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.threat_subcategories_lkp> list = (List<com.iucn.whp.dbservice.model.threat_subcategories_lkp>)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETTHREAT_SUBCATEGORIES_LKPS.concat(ORDER_BY_CLAUSE)
														   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETTHREAT_SUBCATEGORIES_LKPS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_threat_subcategories_lkp",
					com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.threat_subcategories_lkp>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS,
						finderArgs);
				}
				else {
					threat_subcategories_lkpPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_subcategories_lkpPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_subcategories_lkpsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of threat_subcategories_lkps associated with the threat_categories_lkp.
	 *
	 * @param pk the primary key of the threat_categories_lkp
	 * @return the number of threat_subcategories_lkps associated with the threat_categories_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public int getthreat_subcategories_lkpsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETTHREAT_SUBCATEGORIES_LKPSSIZE);

				q.addScalar(COUNT_COLUMN_NAME,
					com.liferay.portal.kernel.dao.orm.Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUBCATEGORIES_LKPS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_THREAT_SUBCATEGORIES_LKP =
		new FinderPath(com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_subcategories_lkpImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_subcategories_lkpPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsthreat_subcategories_lkp",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the threat_subcategories_lkp is associated with the threat_categories_lkp.
	 *
	 * @param pk the primary key of the threat_categories_lkp
	 * @param threat_subcategories_lkpPK the primary key of the threat_subcategories_lkp
	 * @return <code>true</code> if the threat_subcategories_lkp is associated with the threat_categories_lkp; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_subcategories_lkp(long pk,
		long threat_subcategories_lkpPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, threat_subcategories_lkpPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_THREAT_SUBCATEGORIES_LKP,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsthreat_subcategories_lkp.contains(
							pk, threat_subcategories_lkpPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_THREAT_SUBCATEGORIES_LKP,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the threat_categories_lkp has any threat_subcategories_lkps associated with it.
	 *
	 * @param pk the primary key of the threat_categories_lkp to check for associations with threat_subcategories_lkps
	 * @return <code>true</code> if the threat_categories_lkp has any threat_subcategories_lkps associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_subcategories_lkps(long pk)
		throws SystemException {
		if (getthreat_subcategories_lkpsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the threat_categories_lkp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.threat_categories_lkp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<threat_categories_lkp>> listenersList = new ArrayList<ModelListener<threat_categories_lkp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<threat_categories_lkp>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsthreat_subcategories_lkp = new Containsthreat_subcategories_lkp();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(threat_categories_lkpImpl.class.getName());
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
	protected Containsthreat_subcategories_lkp containsthreat_subcategories_lkp;

	protected class Containsthreat_subcategories_lkp {
		protected Containsthreat_subcategories_lkp() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSTHREAT_SUBCATEGORIES_LKP,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long threatCategoryid, long id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(threatCategoryid), new Long(id)
					});

			if (results.size() > 0) {
				Integer count = results.get(0);

				if (count.intValue() > 0) {
					return true;
				}
			}

			return false;
		}

		private MappingSqlQuery<Integer> _mappingSqlQuery;
	}

	private static final String _SQL_SELECT_THREAT_CATEGORIES_LKP = "SELECT threat_categories_lkp FROM threat_categories_lkp threat_categories_lkp";
	private static final String _SQL_COUNT_THREAT_CATEGORIES_LKP = "SELECT COUNT(threat_categories_lkp) FROM threat_categories_lkp threat_categories_lkp";
	private static final String _SQL_GETTHREAT_SUBCATEGORIES_LKPS = "SELECT {whp_threat_subcategories_lkp.*} FROM whp_threat_subcategories_lkp INNER JOIN whp_threat_categories_lkp ON (whp_threat_categories_lkp.threatCategoryid = whp_threat_subcategories_lkp.threatCategoryid) WHERE (whp_threat_categories_lkp.threatCategoryid = ?)";
	private static final String _SQL_GETTHREAT_SUBCATEGORIES_LKPSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_subcategories_lkp WHERE threatCategoryid = ?";
	private static final String _SQL_CONTAINSTHREAT_SUBCATEGORIES_LKP = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_subcategories_lkp WHERE threatCategoryid = ? AND id_ = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "threat_categories_lkp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No threat_categories_lkp exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(threat_categories_lkpPersistenceImpl.class);
	private static threat_categories_lkp _nullthreat_categories_lkp = new threat_categories_lkpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<threat_categories_lkp> toCacheModel() {
				return _nullthreat_categories_lkpCacheModel;
			}
		};

	private static CacheModel<threat_categories_lkp> _nullthreat_categories_lkpCacheModel =
		new CacheModel<threat_categories_lkp>() {
			public threat_categories_lkp toEntityModel() {
				return _nullthreat_categories_lkp;
			}
		};
}