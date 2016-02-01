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

import com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException;
import com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsImpl;
import com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl;
import com.iucn.whp.dbservice.model.state_trend_biodivvals;

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
 * The persistence implementation for the state_trend_biodivvals service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see state_trend_biodivvalsPersistence
 * @see state_trend_biodivvalsUtil
 * @generated
 */
public class state_trend_biodivvalsPersistenceImpl extends BasePersistenceImpl<state_trend_biodivvals>
	implements state_trend_biodivvalsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link state_trend_biodivvalsUtil} to access the state_trend_biodivvals persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = state_trend_biodivvalsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassessment_version_id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessment_version_id",
			new String[] { Long.class.getName() },
			state_trend_biodivvalsModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID = new FinderPath(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessment_version_id",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the state_trend_biodivvals in the entity cache if it is enabled.
	 *
	 * @param state_trend_biodivvals the state_trend_biodivvals
	 */
	public void cacheResult(state_trend_biodivvals state_trend_biodivvals) {
		EntityCacheUtil.putResult(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			state_trend_biodivvals.getPrimaryKey(), state_trend_biodivvals);

		state_trend_biodivvals.resetOriginalValues();
	}

	/**
	 * Caches the state_trend_biodivvalses in the entity cache if it is enabled.
	 *
	 * @param state_trend_biodivvalses the state_trend_biodivvalses
	 */
	public void cacheResult(
		List<state_trend_biodivvals> state_trend_biodivvalses) {
		for (state_trend_biodivvals state_trend_biodivvals : state_trend_biodivvalses) {
			if (EntityCacheUtil.getResult(
						state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
						state_trend_biodivvalsImpl.class,
						state_trend_biodivvals.getPrimaryKey()) == null) {
				cacheResult(state_trend_biodivvals);
			}
			else {
				state_trend_biodivvals.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all state_trend_biodivvalses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(state_trend_biodivvalsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(state_trend_biodivvalsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the state_trend_biodivvals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(state_trend_biodivvals state_trend_biodivvals) {
		EntityCacheUtil.removeResult(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			state_trend_biodivvals.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<state_trend_biodivvals> state_trend_biodivvalses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (state_trend_biodivvals state_trend_biodivvals : state_trend_biodivvalses) {
			EntityCacheUtil.removeResult(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
				state_trend_biodivvalsImpl.class,
				state_trend_biodivvals.getPrimaryKey());
		}
	}

	/**
	 * Creates a new state_trend_biodivvals with the primary key. Does not add the state_trend_biodivvals to the database.
	 *
	 * @param state_trend_biodivvals_id the primary key for the new state_trend_biodivvals
	 * @return the new state_trend_biodivvals
	 */
	public state_trend_biodivvals create(long state_trend_biodivvals_id) {
		state_trend_biodivvals state_trend_biodivvals = new state_trend_biodivvalsImpl();

		state_trend_biodivvals.setNew(true);
		state_trend_biodivvals.setPrimaryKey(state_trend_biodivvals_id);

		return state_trend_biodivvals;
	}

	/**
	 * Removes the state_trend_biodivvals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param state_trend_biodivvals_id the primary key of the state_trend_biodivvals
	 * @return the state_trend_biodivvals that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals remove(long state_trend_biodivvals_id)
		throws NoSuchstate_trend_biodivvalsException, SystemException {
		return remove(Long.valueOf(state_trend_biodivvals_id));
	}

	/**
	 * Removes the state_trend_biodivvals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the state_trend_biodivvals
	 * @return the state_trend_biodivvals that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public state_trend_biodivvals remove(Serializable primaryKey)
		throws NoSuchstate_trend_biodivvalsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			state_trend_biodivvals state_trend_biodivvals = (state_trend_biodivvals)session.get(state_trend_biodivvalsImpl.class,
					primaryKey);

			if (state_trend_biodivvals == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstate_trend_biodivvalsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(state_trend_biodivvals);
		}
		catch (NoSuchstate_trend_biodivvalsException nsee) {
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
	protected state_trend_biodivvals removeImpl(
		state_trend_biodivvals state_trend_biodivvals)
		throws SystemException {
		state_trend_biodivvals = toUnwrappedModel(state_trend_biodivvals);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, state_trend_biodivvals);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(state_trend_biodivvals);

		return state_trend_biodivvals;
	}

	@Override
	public state_trend_biodivvals updateImpl(
		com.iucn.whp.dbservice.model.state_trend_biodivvals state_trend_biodivvals,
		boolean merge) throws SystemException {
		state_trend_biodivvals = toUnwrappedModel(state_trend_biodivvals);

		boolean isNew = state_trend_biodivvals.isNew();

		state_trend_biodivvalsModelImpl state_trend_biodivvalsModelImpl = (state_trend_biodivvalsModelImpl)state_trend_biodivvals;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, state_trend_biodivvals, merge);

			state_trend_biodivvals.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !state_trend_biodivvalsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((state_trend_biodivvalsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(state_trend_biodivvalsModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);

				args = new Object[] {
						Long.valueOf(state_trend_biodivvalsModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			state_trend_biodivvalsImpl.class,
			state_trend_biodivvals.getPrimaryKey(), state_trend_biodivvals);

		return state_trend_biodivvals;
	}

	protected state_trend_biodivvals toUnwrappedModel(
		state_trend_biodivvals state_trend_biodivvals) {
		if (state_trend_biodivvals instanceof state_trend_biodivvalsImpl) {
			return state_trend_biodivvals;
		}

		state_trend_biodivvalsImpl state_trend_biodivvalsImpl = new state_trend_biodivvalsImpl();

		state_trend_biodivvalsImpl.setNew(state_trend_biodivvals.isNew());
		state_trend_biodivvalsImpl.setPrimaryKey(state_trend_biodivvals.getPrimaryKey());

		state_trend_biodivvalsImpl.setState_trend_biodivvals_id(state_trend_biodivvals.getState_trend_biodivvals_id());
		state_trend_biodivvalsImpl.setAssessment_version_id(state_trend_biodivvals.getAssessment_version_id());
		state_trend_biodivvalsImpl.setJustification(state_trend_biodivvals.getJustification());
		state_trend_biodivvalsImpl.setState_id(state_trend_biodivvals.getState_id());
		state_trend_biodivvalsImpl.setTrend_id(state_trend_biodivvals.getTrend_id());

		return state_trend_biodivvalsImpl;
	}

	/**
	 * Returns the state_trend_biodivvals with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the state_trend_biodivvals
	 * @return the state_trend_biodivvals
	 * @throws com.liferay.portal.NoSuchModelException if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public state_trend_biodivvals findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the state_trend_biodivvals with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException} if it could not be found.
	 *
	 * @param state_trend_biodivvals_id the primary key of the state_trend_biodivvals
	 * @return the state_trend_biodivvals
	 * @throws com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals findByPrimaryKey(
		long state_trend_biodivvals_id)
		throws NoSuchstate_trend_biodivvalsException, SystemException {
		state_trend_biodivvals state_trend_biodivvals = fetchByPrimaryKey(state_trend_biodivvals_id);

		if (state_trend_biodivvals == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					state_trend_biodivvals_id);
			}

			throw new NoSuchstate_trend_biodivvalsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				state_trend_biodivvals_id);
		}

		return state_trend_biodivvals;
	}

	/**
	 * Returns the state_trend_biodivvals with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the state_trend_biodivvals
	 * @return the state_trend_biodivvals, or <code>null</code> if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public state_trend_biodivvals fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the state_trend_biodivvals with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param state_trend_biodivvals_id the primary key of the state_trend_biodivvals
	 * @return the state_trend_biodivvals, or <code>null</code> if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals fetchByPrimaryKey(
		long state_trend_biodivvals_id) throws SystemException {
		state_trend_biodivvals state_trend_biodivvals = (state_trend_biodivvals)EntityCacheUtil.getResult(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
				state_trend_biodivvalsImpl.class, state_trend_biodivvals_id);

		if (state_trend_biodivvals == _nullstate_trend_biodivvals) {
			return null;
		}

		if (state_trend_biodivvals == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				state_trend_biodivvals = (state_trend_biodivvals)session.get(state_trend_biodivvalsImpl.class,
						Long.valueOf(state_trend_biodivvals_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (state_trend_biodivvals != null) {
					cacheResult(state_trend_biodivvals);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
						state_trend_biodivvalsImpl.class,
						state_trend_biodivvals_id, _nullstate_trend_biodivvals);
				}

				closeSession(session);
			}
		}

		return state_trend_biodivvals;
	}

	/**
	 * Returns all the state_trend_biodivvalses where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public List<state_trend_biodivvals> findByassessment_version_id(
		long assessment_version_id) throws SystemException {
		return findByassessment_version_id(assessment_version_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the state_trend_biodivvalses where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of state_trend_biodivvalses
	 * @param end the upper bound of the range of state_trend_biodivvalses (not inclusive)
	 * @return the range of matching state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public List<state_trend_biodivvals> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassessment_version_id(assessment_version_id, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the state_trend_biodivvalses where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of state_trend_biodivvalses
	 * @param end the upper bound of the range of state_trend_biodivvalses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public List<state_trend_biodivvals> findByassessment_version_id(
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

		List<state_trend_biodivvals> list = (List<state_trend_biodivvals>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (state_trend_biodivvals state_trend_biodivvals : list) {
				if ((assessment_version_id != state_trend_biodivvals.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_STATE_TREND_BIODIVVALS_WHERE);

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

				list = (List<state_trend_biodivvals>)QueryUtil.list(q,
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
	 * Returns the first state_trend_biodivvals in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching state_trend_biodivvals
	 * @throws com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException if a matching state_trend_biodivvals could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals findByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchstate_trend_biodivvalsException, SystemException {
		state_trend_biodivvals state_trend_biodivvals = fetchByassessment_version_id_First(assessment_version_id,
				orderByComparator);

		if (state_trend_biodivvals != null) {
			return state_trend_biodivvals;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchstate_trend_biodivvalsException(msg.toString());
	}

	/**
	 * Returns the first state_trend_biodivvals in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching state_trend_biodivvals, or <code>null</code> if a matching state_trend_biodivvals could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals fetchByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<state_trend_biodivvals> list = findByassessment_version_id(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last state_trend_biodivvals in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching state_trend_biodivvals
	 * @throws com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException if a matching state_trend_biodivvals could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals findByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchstate_trend_biodivvalsException, SystemException {
		state_trend_biodivvals state_trend_biodivvals = fetchByassessment_version_id_Last(assessment_version_id,
				orderByComparator);

		if (state_trend_biodivvals != null) {
			return state_trend_biodivvals;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchstate_trend_biodivvalsException(msg.toString());
	}

	/**
	 * Returns the last state_trend_biodivvals in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching state_trend_biodivvals, or <code>null</code> if a matching state_trend_biodivvals could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals fetchByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessment_version_id(assessment_version_id);

		List<state_trend_biodivvals> list = findByassessment_version_id(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the state_trend_biodivvalses before and after the current state_trend_biodivvals in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param state_trend_biodivvals_id the primary key of the current state_trend_biodivvals
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next state_trend_biodivvals
	 * @throws com.iucn.whp.dbservice.NoSuchstate_trend_biodivvalsException if a state_trend_biodivvals with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public state_trend_biodivvals[] findByassessment_version_id_PrevAndNext(
		long state_trend_biodivvals_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchstate_trend_biodivvalsException, SystemException {
		state_trend_biodivvals state_trend_biodivvals = findByPrimaryKey(state_trend_biodivvals_id);

		Session session = null;

		try {
			session = openSession();

			state_trend_biodivvals[] array = new state_trend_biodivvalsImpl[3];

			array[0] = getByassessment_version_id_PrevAndNext(session,
					state_trend_biodivvals, assessment_version_id,
					orderByComparator, true);

			array[1] = state_trend_biodivvals;

			array[2] = getByassessment_version_id_PrevAndNext(session,
					state_trend_biodivvals, assessment_version_id,
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

	protected state_trend_biodivvals getByassessment_version_id_PrevAndNext(
		Session session, state_trend_biodivvals state_trend_biodivvals,
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

		query.append(_SQL_SELECT_STATE_TREND_BIODIVVALS_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(state_trend_biodivvals);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<state_trend_biodivvals> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the state_trend_biodivvalses.
	 *
	 * @return the state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public List<state_trend_biodivvals> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the state_trend_biodivvalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_trend_biodivvalses
	 * @param end the upper bound of the range of state_trend_biodivvalses (not inclusive)
	 * @return the range of state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public List<state_trend_biodivvals> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the state_trend_biodivvalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of state_trend_biodivvalses
	 * @param end the upper bound of the range of state_trend_biodivvalses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public List<state_trend_biodivvals> findAll(int start, int end,
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

		List<state_trend_biodivvals> list = (List<state_trend_biodivvals>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATE_TREND_BIODIVVALS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATE_TREND_BIODIVVALS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<state_trend_biodivvals>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<state_trend_biodivvals>)QueryUtil.list(q,
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
	 * Removes all the state_trend_biodivvalses where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessment_version_id(long assessment_version_id)
		throws SystemException {
		for (state_trend_biodivvals state_trend_biodivvals : findByassessment_version_id(
				assessment_version_id)) {
			remove(state_trend_biodivvals);
		}
	}

	/**
	 * Removes all the state_trend_biodivvalses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (state_trend_biodivvals state_trend_biodivvals : findAll()) {
			remove(state_trend_biodivvals);
		}
	}

	/**
	 * Returns the number of state_trend_biodivvalses where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessment_version_id(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STATE_TREND_BIODIVVALS_WHERE);

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
	 * Returns the number of state_trend_biodivvalses.
	 *
	 * @return the number of state_trend_biodivvalses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STATE_TREND_BIODIVVALS);

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
	 * Initializes the state_trend_biodivvals persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.state_trend_biodivvals")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<state_trend_biodivvals>> listenersList = new ArrayList<ModelListener<state_trend_biodivvals>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<state_trend_biodivvals>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(state_trend_biodivvalsImpl.class.getName());
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
	private static final String _SQL_SELECT_STATE_TREND_BIODIVVALS = "SELECT state_trend_biodivvals FROM state_trend_biodivvals state_trend_biodivvals";
	private static final String _SQL_SELECT_STATE_TREND_BIODIVVALS_WHERE = "SELECT state_trend_biodivvals FROM state_trend_biodivvals state_trend_biodivvals WHERE ";
	private static final String _SQL_COUNT_STATE_TREND_BIODIVVALS = "SELECT COUNT(state_trend_biodivvals) FROM state_trend_biodivvals state_trend_biodivvals";
	private static final String _SQL_COUNT_STATE_TREND_BIODIVVALS_WHERE = "SELECT COUNT(state_trend_biodivvals) FROM state_trend_biodivvals state_trend_biodivvals WHERE ";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2 =
		"state_trend_biodivvals.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "state_trend_biodivvals.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No state_trend_biodivvals exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No state_trend_biodivvals exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(state_trend_biodivvalsPersistenceImpl.class);
	private static state_trend_biodivvals _nullstate_trend_biodivvals = new state_trend_biodivvalsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<state_trend_biodivvals> toCacheModel() {
				return _nullstate_trend_biodivvalsCacheModel;
			}
		};

	private static CacheModel<state_trend_biodivvals> _nullstate_trend_biodivvalsCacheModel =
		new CacheModel<state_trend_biodivvals>() {
			public state_trend_biodivvals toEntityModel() {
				return _nullstate_trend_biodivvals;
			}
		};
}