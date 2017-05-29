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

import com.iucn.whp.dbservice.NoSuchthreat_summary_overallException;
import com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl;
import com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl;
import com.iucn.whp.dbservice.model.threat_summary_overall;

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
 * The persistence implementation for the threat_summary_overall service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see threat_summary_overallPersistence
 * @see threat_summary_overallUtil
 * @generated
 */
public class threat_summary_overallPersistenceImpl extends BasePersistenceImpl<threat_summary_overall>
	implements threat_summary_overallPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link threat_summary_overallUtil} to access the threat_summary_overall persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = threat_summary_overallImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassessment_version_id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessment_version_id",
			new String[] { Long.class.getName() },
			threat_summary_overallModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID = new FinderPath(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessment_version_id",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the threat_summary_overall in the entity cache if it is enabled.
	 *
	 * @param threat_summary_overall the threat_summary_overall
	 */
	public void cacheResult(threat_summary_overall threat_summary_overall) {
		EntityCacheUtil.putResult(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			threat_summary_overall.getPrimaryKey(), threat_summary_overall);

		threat_summary_overall.resetOriginalValues();
	}

	/**
	 * Caches the threat_summary_overalls in the entity cache if it is enabled.
	 *
	 * @param threat_summary_overalls the threat_summary_overalls
	 */
	public void cacheResult(
		List<threat_summary_overall> threat_summary_overalls) {
		for (threat_summary_overall threat_summary_overall : threat_summary_overalls) {
			if (EntityCacheUtil.getResult(
						threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
						threat_summary_overallImpl.class,
						threat_summary_overall.getPrimaryKey()) == null) {
				cacheResult(threat_summary_overall);
			}
			else {
				threat_summary_overall.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all threat_summary_overalls.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(threat_summary_overallImpl.class.getName());
		}

		EntityCacheUtil.clearCache(threat_summary_overallImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the threat_summary_overall.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(threat_summary_overall threat_summary_overall) {
		EntityCacheUtil.removeResult(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			threat_summary_overall.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<threat_summary_overall> threat_summary_overalls) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (threat_summary_overall threat_summary_overall : threat_summary_overalls) {
			EntityCacheUtil.removeResult(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
				threat_summary_overallImpl.class,
				threat_summary_overall.getPrimaryKey());
		}
	}

	/**
	 * Creates a new threat_summary_overall with the primary key. Does not add the threat_summary_overall to the database.
	 *
	 * @param threat_sum_overall_id the primary key for the new threat_summary_overall
	 * @return the new threat_summary_overall
	 */
	public threat_summary_overall create(long threat_sum_overall_id) {
		threat_summary_overall threat_summary_overall = new threat_summary_overallImpl();

		threat_summary_overall.setNew(true);
		threat_summary_overall.setPrimaryKey(threat_sum_overall_id);

		return threat_summary_overall;
	}

	/**
	 * Removes the threat_summary_overall with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param threat_sum_overall_id the primary key of the threat_summary_overall
	 * @return the threat_summary_overall that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall remove(long threat_sum_overall_id)
		throws NoSuchthreat_summary_overallException, SystemException {
		return remove(Long.valueOf(threat_sum_overall_id));
	}

	/**
	 * Removes the threat_summary_overall with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the threat_summary_overall
	 * @return the threat_summary_overall that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public threat_summary_overall remove(Serializable primaryKey)
		throws NoSuchthreat_summary_overallException, SystemException {
		Session session = null;

		try {
			session = openSession();

			threat_summary_overall threat_summary_overall = (threat_summary_overall)session.get(threat_summary_overallImpl.class,
					primaryKey);

			if (threat_summary_overall == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchthreat_summary_overallException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(threat_summary_overall);
		}
		catch (NoSuchthreat_summary_overallException nsee) {
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
	protected threat_summary_overall removeImpl(
		threat_summary_overall threat_summary_overall)
		throws SystemException {
		threat_summary_overall = toUnwrappedModel(threat_summary_overall);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, threat_summary_overall);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(threat_summary_overall);

		return threat_summary_overall;
	}

	@Override
	public threat_summary_overall updateImpl(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall,
		boolean merge) throws SystemException {
		threat_summary_overall = toUnwrappedModel(threat_summary_overall);

		boolean isNew = threat_summary_overall.isNew();

		threat_summary_overallModelImpl threat_summary_overallModelImpl = (threat_summary_overallModelImpl)threat_summary_overall;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, threat_summary_overall, merge);

			threat_summary_overall.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !threat_summary_overallModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((threat_summary_overallModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(threat_summary_overallModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);

				args = new Object[] {
						Long.valueOf(threat_summary_overallModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			threat_summary_overallImpl.class,
			threat_summary_overall.getPrimaryKey(), threat_summary_overall);

		return threat_summary_overall;
	}

	protected threat_summary_overall toUnwrappedModel(
		threat_summary_overall threat_summary_overall) {
		if (threat_summary_overall instanceof threat_summary_overallImpl) {
			return threat_summary_overall;
		}

		threat_summary_overallImpl threat_summary_overallImpl = new threat_summary_overallImpl();

		threat_summary_overallImpl.setNew(threat_summary_overall.isNew());
		threat_summary_overallImpl.setPrimaryKey(threat_summary_overall.getPrimaryKey());

		threat_summary_overallImpl.setThreat_sum_overall_id(threat_summary_overall.getThreat_sum_overall_id());
		threat_summary_overallImpl.setAssessment_version_id(threat_summary_overall.getAssessment_version_id());
		threat_summary_overallImpl.setOverall_threat(threat_summary_overall.getOverall_threat());
		threat_summary_overallImpl.setThreat_rating(threat_summary_overall.getThreat_rating());

		return threat_summary_overallImpl;
	}

	/**
	 * Returns the threat_summary_overall with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the threat_summary_overall
	 * @return the threat_summary_overall
	 * @throws com.liferay.portal.NoSuchModelException if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public threat_summary_overall findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the threat_summary_overall with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchthreat_summary_overallException} if it could not be found.
	 *
	 * @param threat_sum_overall_id the primary key of the threat_summary_overall
	 * @return the threat_summary_overall
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall findByPrimaryKey(long threat_sum_overall_id)
		throws NoSuchthreat_summary_overallException, SystemException {
		threat_summary_overall threat_summary_overall = fetchByPrimaryKey(threat_sum_overall_id);

		if (threat_summary_overall == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					threat_sum_overall_id);
			}

			throw new NoSuchthreat_summary_overallException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				threat_sum_overall_id);
		}

		return threat_summary_overall;
	}

	/**
	 * Returns the threat_summary_overall with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the threat_summary_overall
	 * @return the threat_summary_overall, or <code>null</code> if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public threat_summary_overall fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the threat_summary_overall with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param threat_sum_overall_id the primary key of the threat_summary_overall
	 * @return the threat_summary_overall, or <code>null</code> if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall fetchByPrimaryKey(long threat_sum_overall_id)
		throws SystemException {
		threat_summary_overall threat_summary_overall = (threat_summary_overall)EntityCacheUtil.getResult(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
				threat_summary_overallImpl.class, threat_sum_overall_id);

		if (threat_summary_overall == _nullthreat_summary_overall) {
			return null;
		}

		if (threat_summary_overall == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				threat_summary_overall = (threat_summary_overall)session.get(threat_summary_overallImpl.class,
						Long.valueOf(threat_sum_overall_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (threat_summary_overall != null) {
					cacheResult(threat_summary_overall);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
						threat_summary_overallImpl.class,
						threat_sum_overall_id, _nullthreat_summary_overall);
				}

				closeSession(session);
			}
		}

		return threat_summary_overall;
	}

	/**
	 * Returns all the threat_summary_overalls where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_summary_overall> findByassessment_version_id(
		long assessment_version_id) throws SystemException {
		return findByassessment_version_id(assessment_version_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the threat_summary_overalls where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of threat_summary_overalls
	 * @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	 * @return the range of matching threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_summary_overall> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassessment_version_id(assessment_version_id, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the threat_summary_overalls where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of threat_summary_overalls
	 * @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_summary_overall> findByassessment_version_id(
		long assessment_version_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID;
			finderArgs = new Object[] { assessment_version_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID;
			finderArgs = new Object[] {
					assessment_version_id,
					
					start, end, orderByComparator
				};
		}

		List<threat_summary_overall> list = (List<threat_summary_overall>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (threat_summary_overall threat_summary_overall : list) {
				if ((assessment_version_id != threat_summary_overall.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_THREAT_SUMMARY_OVERALL_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

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

				qPos.add(assessment_version_id);

				list = (List<threat_summary_overall>)QueryUtil.list(q,
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
	 * Returns the first threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching threat_summary_overall
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a matching threat_summary_overall could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall findByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchthreat_summary_overallException, SystemException {
		threat_summary_overall threat_summary_overall = fetchByassessment_version_id_First(assessment_version_id,
				orderByComparator);

		if (threat_summary_overall != null) {
			return threat_summary_overall;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchthreat_summary_overallException(msg.toString());
	}

	/**
	 * Returns the first threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching threat_summary_overall, or <code>null</code> if a matching threat_summary_overall could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall fetchByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<threat_summary_overall> list = findByassessment_version_id(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching threat_summary_overall
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a matching threat_summary_overall could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall findByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchthreat_summary_overallException, SystemException {
		threat_summary_overall threat_summary_overall = fetchByassessment_version_id_Last(assessment_version_id,
				orderByComparator);

		if (threat_summary_overall != null) {
			return threat_summary_overall;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchthreat_summary_overallException(msg.toString());
	}

	/**
	 * Returns the last threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching threat_summary_overall, or <code>null</code> if a matching threat_summary_overall could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall fetchByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessment_version_id(assessment_version_id);

		List<threat_summary_overall> list = findByassessment_version_id(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the threat_summary_overalls before and after the current threat_summary_overall in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param threat_sum_overall_id the primary key of the current threat_summary_overall
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next threat_summary_overall
	 * @throws com.iucn.whp.dbservice.NoSuchthreat_summary_overallException if a threat_summary_overall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public threat_summary_overall[] findByassessment_version_id_PrevAndNext(
		long threat_sum_overall_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchthreat_summary_overallException, SystemException {
		threat_summary_overall threat_summary_overall = findByPrimaryKey(threat_sum_overall_id);

		Session session = null;

		try {
			session = openSession();

			threat_summary_overall[] array = new threat_summary_overallImpl[3];

			array[0] = getByassessment_version_id_PrevAndNext(session,
					threat_summary_overall, assessment_version_id,
					orderByComparator, true);

			array[1] = threat_summary_overall;

			array[2] = getByassessment_version_id_PrevAndNext(session,
					threat_summary_overall, assessment_version_id,
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

	protected threat_summary_overall getByassessment_version_id_PrevAndNext(
		Session session, threat_summary_overall threat_summary_overall,
		long assessment_version_id, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THREAT_SUMMARY_OVERALL_WHERE);

		query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

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

		qPos.add(assessment_version_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(threat_summary_overall);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<threat_summary_overall> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the threat_summary_overalls.
	 *
	 * @return the threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_summary_overall> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the threat_summary_overalls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of threat_summary_overalls
	 * @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	 * @return the range of threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_summary_overall> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the threat_summary_overalls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of threat_summary_overalls
	 * @param end the upper bound of the range of threat_summary_overalls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public List<threat_summary_overall> findAll(int start, int end,
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

		List<threat_summary_overall> list = (List<threat_summary_overall>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THREAT_SUMMARY_OVERALL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THREAT_SUMMARY_OVERALL;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<threat_summary_overall>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<threat_summary_overall>)QueryUtil.list(q,
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
	 * Removes all the threat_summary_overalls where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessment_version_id(long assessment_version_id)
		throws SystemException {
		for (threat_summary_overall threat_summary_overall : findByassessment_version_id(
				assessment_version_id)) {
			remove(threat_summary_overall);
		}
	}

	/**
	 * Removes all the threat_summary_overalls from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (threat_summary_overall threat_summary_overall : findAll()) {
			remove(threat_summary_overall);
		}
	}

	/**
	 * Returns the number of threat_summary_overalls where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessment_version_id(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THREAT_SUMMARY_OVERALL_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessment_version_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of threat_summary_overalls.
	 *
	 * @return the number of threat_summary_overalls
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_THREAT_SUMMARY_OVERALL);

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
	 * Initializes the threat_summary_overall persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.threat_summary_overall")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<threat_summary_overall>> listenersList = new ArrayList<ModelListener<threat_summary_overall>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<threat_summary_overall>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(threat_summary_overallImpl.class.getName());
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
	@BeanReference(type = negative_factors_level_impactPersistence.class)
	protected negative_factors_level_impactPersistence negative_factors_level_impactPersistence;
	@BeanReference(type = negative_factors_trendPersistence.class)
	protected negative_factors_trendPersistence negative_factors_trendPersistence;
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
	private static final String _SQL_SELECT_THREAT_SUMMARY_OVERALL = "SELECT threat_summary_overall FROM threat_summary_overall threat_summary_overall";
	private static final String _SQL_SELECT_THREAT_SUMMARY_OVERALL_WHERE = "SELECT threat_summary_overall FROM threat_summary_overall threat_summary_overall WHERE ";
	private static final String _SQL_COUNT_THREAT_SUMMARY_OVERALL = "SELECT COUNT(threat_summary_overall) FROM threat_summary_overall threat_summary_overall";
	private static final String _SQL_COUNT_THREAT_SUMMARY_OVERALL_WHERE = "SELECT COUNT(threat_summary_overall) FROM threat_summary_overall threat_summary_overall WHERE ";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2 =
		"threat_summary_overall.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "threat_summary_overall.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No threat_summary_overall exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No threat_summary_overall exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(threat_summary_overallPersistenceImpl.class);
	private static threat_summary_overall _nullthreat_summary_overall = new threat_summary_overallImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<threat_summary_overall> toCacheModel() {
				return _nullthreat_summary_overallCacheModel;
			}
		};

	private static CacheModel<threat_summary_overall> _nullthreat_summary_overallCacheModel =
		new CacheModel<threat_summary_overall>() {
			public threat_summary_overall toEntityModel() {
				return _nullthreat_summary_overall;
			}
		};
}