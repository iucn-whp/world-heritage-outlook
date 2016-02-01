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

import com.iucn.whp.dbservice.NoSuchassessing_threats_currentException;
import com.iucn.whp.dbservice.model.assessing_threats_current;
import com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl;
import com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl;

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
 * The persistence implementation for the assessing_threats_current service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_currentPersistence
 * @see assessing_threats_currentUtil
 * @generated
 */
public class assessing_threats_currentPersistenceImpl
	extends BasePersistenceImpl<assessing_threats_current>
	implements assessing_threats_currentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link assessing_threats_currentUtil} to access the assessing_threats_current persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = assessing_threats_currentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID =
		new FinderPath(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassesment_version_id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID =
		new FinderPath(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassesment_version_id",
			new String[] { Long.class.getName() },
			assessing_threats_currentModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESMENT_VERSION_ID = new FinderPath(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassesment_version_id", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the assessing_threats_current in the entity cache if it is enabled.
	 *
	 * @param assessing_threats_current the assessing_threats_current
	 */
	public void cacheResult(assessing_threats_current assessing_threats_current) {
		EntityCacheUtil.putResult(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			assessing_threats_current.getPrimaryKey(), assessing_threats_current);

		assessing_threats_current.resetOriginalValues();
	}

	/**
	 * Caches the assessing_threats_currents in the entity cache if it is enabled.
	 *
	 * @param assessing_threats_currents the assessing_threats_currents
	 */
	public void cacheResult(
		List<assessing_threats_current> assessing_threats_currents) {
		for (assessing_threats_current assessing_threats_current : assessing_threats_currents) {
			if (EntityCacheUtil.getResult(
						assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
						assessing_threats_currentImpl.class,
						assessing_threats_current.getPrimaryKey()) == null) {
				cacheResult(assessing_threats_current);
			}
			else {
				assessing_threats_current.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessing_threats_currents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(assessing_threats_currentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(assessing_threats_currentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessing_threats_current.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(assessing_threats_current assessing_threats_current) {
		EntityCacheUtil.removeResult(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			assessing_threats_current.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<assessing_threats_current> assessing_threats_currents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (assessing_threats_current assessing_threats_current : assessing_threats_currents) {
			EntityCacheUtil.removeResult(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
				assessing_threats_currentImpl.class,
				assessing_threats_current.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessing_threats_current with the primary key. Does not add the assessing_threats_current to the database.
	 *
	 * @param current_threat_id the primary key for the new assessing_threats_current
	 * @return the new assessing_threats_current
	 */
	public assessing_threats_current create(long current_threat_id) {
		assessing_threats_current assessing_threats_current = new assessing_threats_currentImpl();

		assessing_threats_current.setNew(true);
		assessing_threats_current.setPrimaryKey(current_threat_id);

		return assessing_threats_current;
	}

	/**
	 * Removes the assessing_threats_current with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param current_threat_id the primary key of the assessing_threats_current
	 * @return the assessing_threats_current that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current remove(long current_threat_id)
		throws NoSuchassessing_threats_currentException, SystemException {
		return remove(Long.valueOf(current_threat_id));
	}

	/**
	 * Removes the assessing_threats_current with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessing_threats_current
	 * @return the assessing_threats_current that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessing_threats_current remove(Serializable primaryKey)
		throws NoSuchassessing_threats_currentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			assessing_threats_current assessing_threats_current = (assessing_threats_current)session.get(assessing_threats_currentImpl.class,
					primaryKey);

			if (assessing_threats_current == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchassessing_threats_currentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessing_threats_current);
		}
		catch (NoSuchassessing_threats_currentException nsee) {
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
	protected assessing_threats_current removeImpl(
		assessing_threats_current assessing_threats_current)
		throws SystemException {
		assessing_threats_current = toUnwrappedModel(assessing_threats_current);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, assessing_threats_current);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(assessing_threats_current);

		return assessing_threats_current;
	}

	@Override
	public assessing_threats_current updateImpl(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current,
		boolean merge) throws SystemException {
		assessing_threats_current = toUnwrappedModel(assessing_threats_current);

		boolean isNew = assessing_threats_current.isNew();

		assessing_threats_currentModelImpl assessing_threats_currentModelImpl = (assessing_threats_currentModelImpl)assessing_threats_current;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, assessing_threats_current, merge);

			assessing_threats_current.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!assessing_threats_currentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessing_threats_currentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessing_threats_currentModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID,
					args);

				args = new Object[] {
						Long.valueOf(assessing_threats_currentModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_currentImpl.class,
			assessing_threats_current.getPrimaryKey(), assessing_threats_current);

		return assessing_threats_current;
	}

	protected assessing_threats_current toUnwrappedModel(
		assessing_threats_current assessing_threats_current) {
		if (assessing_threats_current instanceof assessing_threats_currentImpl) {
			return assessing_threats_current;
		}

		assessing_threats_currentImpl assessing_threats_currentImpl = new assessing_threats_currentImpl();

		assessing_threats_currentImpl.setNew(assessing_threats_current.isNew());
		assessing_threats_currentImpl.setPrimaryKey(assessing_threats_current.getPrimaryKey());

		assessing_threats_currentImpl.setCurrent_threat_id(assessing_threats_current.getCurrent_threat_id());
		assessing_threats_currentImpl.setAssessment_version_id(assessing_threats_current.getAssessment_version_id());
		assessing_threats_currentImpl.setCurrent_threat(assessing_threats_current.getCurrent_threat());
		assessing_threats_currentImpl.setJustification(assessing_threats_current.getJustification());
		assessing_threats_currentImpl.setInside_site(assessing_threats_current.isInside_site());
		assessing_threats_currentImpl.setOutside_site(assessing_threats_current.isOutside_site());
		assessing_threats_currentImpl.setThreat_rating_id(assessing_threats_current.getThreat_rating_id());

		return assessing_threats_currentImpl;
	}

	/**
	 * Returns the assessing_threats_current with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessing_threats_current
	 * @return the assessing_threats_current
	 * @throws com.liferay.portal.NoSuchModelException if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessing_threats_current findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessing_threats_current with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessing_threats_currentException} if it could not be found.
	 *
	 * @param current_threat_id the primary key of the assessing_threats_current
	 * @return the assessing_threats_current
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current findByPrimaryKey(long current_threat_id)
		throws NoSuchassessing_threats_currentException, SystemException {
		assessing_threats_current assessing_threats_current = fetchByPrimaryKey(current_threat_id);

		if (assessing_threats_current == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + current_threat_id);
			}

			throw new NoSuchassessing_threats_currentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				current_threat_id);
		}

		return assessing_threats_current;
	}

	/**
	 * Returns the assessing_threats_current with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessing_threats_current
	 * @return the assessing_threats_current, or <code>null</code> if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessing_threats_current fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessing_threats_current with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param current_threat_id the primary key of the assessing_threats_current
	 * @return the assessing_threats_current, or <code>null</code> if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current fetchByPrimaryKey(long current_threat_id)
		throws SystemException {
		assessing_threats_current assessing_threats_current = (assessing_threats_current)EntityCacheUtil.getResult(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
				assessing_threats_currentImpl.class, current_threat_id);

		if (assessing_threats_current == _nullassessing_threats_current) {
			return null;
		}

		if (assessing_threats_current == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				assessing_threats_current = (assessing_threats_current)session.get(assessing_threats_currentImpl.class,
						Long.valueOf(current_threat_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (assessing_threats_current != null) {
					cacheResult(assessing_threats_current);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
						assessing_threats_currentImpl.class, current_threat_id,
						_nullassessing_threats_current);
				}

				closeSession(session);
			}
		}

		return assessing_threats_current;
	}

	/**
	 * Returns all the assessing_threats_currents where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_current> findByassesment_version_id(
		long assessment_version_id) throws SystemException {
		return findByassesment_version_id(assessment_version_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessing_threats_currents where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @return the range of matching assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_current> findByassesment_version_id(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassesment_version_id(assessment_version_id, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the assessing_threats_currents where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_current> findByassesment_version_id(
		long assessment_version_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID;
			finderArgs = new Object[] { assessment_version_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESMENT_VERSION_ID;
			finderArgs = new Object[] {
					assessment_version_id,
					
					start, end, orderByComparator
				};
		}

		List<assessing_threats_current> list = (List<assessing_threats_current>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessing_threats_current assessing_threats_current : list) {
				if ((assessment_version_id != assessing_threats_current.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_ASSESSING_THREATS_CURRENT_WHERE);

			query.append(_FINDER_COLUMN_ASSESMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

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

				list = (List<assessing_threats_current>)QueryUtil.list(q,
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
	 * Returns the first assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessing_threats_current
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a matching assessing_threats_current could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current findByassesment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessing_threats_currentException, SystemException {
		assessing_threats_current assessing_threats_current = fetchByassesment_version_id_First(assessment_version_id,
				orderByComparator);

		if (assessing_threats_current != null) {
			return assessing_threats_current;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessing_threats_currentException(msg.toString());
	}

	/**
	 * Returns the first assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessing_threats_current, or <code>null</code> if a matching assessing_threats_current could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current fetchByassesment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessing_threats_current> list = findByassesment_version_id(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessing_threats_current
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a matching assessing_threats_current could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current findByassesment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessing_threats_currentException, SystemException {
		assessing_threats_current assessing_threats_current = fetchByassesment_version_id_Last(assessment_version_id,
				orderByComparator);

		if (assessing_threats_current != null) {
			return assessing_threats_current;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessing_threats_currentException(msg.toString());
	}

	/**
	 * Returns the last assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessing_threats_current, or <code>null</code> if a matching assessing_threats_current could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current fetchByassesment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassesment_version_id(assessment_version_id);

		List<assessing_threats_current> list = findByassesment_version_id(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessing_threats_currents before and after the current assessing_threats_current in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param current_threat_id the primary key of the current assessing_threats_current
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessing_threats_current
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_currentException if a assessing_threats_current with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_current[] findByassesment_version_id_PrevAndNext(
		long current_threat_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchassessing_threats_currentException, SystemException {
		assessing_threats_current assessing_threats_current = findByPrimaryKey(current_threat_id);

		Session session = null;

		try {
			session = openSession();

			assessing_threats_current[] array = new assessing_threats_currentImpl[3];

			array[0] = getByassesment_version_id_PrevAndNext(session,
					assessing_threats_current, assessment_version_id,
					orderByComparator, true);

			array[1] = assessing_threats_current;

			array[2] = getByassesment_version_id_PrevAndNext(session,
					assessing_threats_current, assessment_version_id,
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

	protected assessing_threats_current getByassesment_version_id_PrevAndNext(
		Session session, assessing_threats_current assessing_threats_current,
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

		query.append(_SQL_SELECT_ASSESSING_THREATS_CURRENT_WHERE);

		query.append(_FINDER_COLUMN_ASSESMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessing_threats_current);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessing_threats_current> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessing_threats_currents.
	 *
	 * @return the assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_current> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessing_threats_currents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @return the range of assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_current> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessing_threats_currents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_current> findAll(int start, int end,
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

		List<assessing_threats_current> list = (List<assessing_threats_current>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSING_THREATS_CURRENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSING_THREATS_CURRENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<assessing_threats_current>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<assessing_threats_current>)QueryUtil.list(q,
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
	 * Removes all the assessing_threats_currents where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassesment_version_id(long assessment_version_id)
		throws SystemException {
		for (assessing_threats_current assessing_threats_current : findByassesment_version_id(
				assessment_version_id)) {
			remove(assessing_threats_current);
		}
	}

	/**
	 * Removes all the assessing_threats_currents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (assessing_threats_current assessing_threats_current : findAll()) {
			remove(assessing_threats_current);
		}
	}

	/**
	 * Returns the number of assessing_threats_currents where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassesment_version_id(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESMENT_VERSION_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESSING_THREATS_CURRENT_WHERE);

			query.append(_FINDER_COLUMN_ASSESMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESMENT_VERSION_ID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of assessing_threats_currents.
	 *
	 * @return the number of assessing_threats_currents
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSESSING_THREATS_CURRENT);

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
	 * Returns all the current_threat_assessment_cats associated with the assessing_threats_current.
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @return the current_threat_assessment_cats associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getcurrent_threat_assessment_cats(
		long pk) throws SystemException {
		return getcurrent_threat_assessment_cats(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the current_threat_assessment_cats associated with the assessing_threats_current.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @return the range of current_threat_assessment_cats associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getcurrent_threat_assessment_cats(
		long pk, int start, int end) throws SystemException {
		return getcurrent_threat_assessment_cats(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_threat_assessment_cats",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the current_threat_assessment_cats associated with the assessing_threats_current.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of current_threat_assessment_cats associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> getcurrent_threat_assessment_cats(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.current_threat_assessment_cat> list = (List<com.iucn.whp.dbservice.model.current_threat_assessment_cat>)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETCURRENT_THREAT_ASSESSMENT_CATS.concat(ORDER_BY_CLAUSE)
																.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETCURRENT_THREAT_ASSESSMENT_CATS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_current_threat_assessment_cat",
					com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.current_threat_assessment_cat>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS,
						finderArgs);
				}
				else {
					current_threat_assessment_catPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_threat_assessment_catsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of current_threat_assessment_cats associated with the assessing_threats_current.
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @return the number of current_threat_assessment_cats associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public int getcurrent_threat_assessment_catsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETCURRENT_THREAT_ASSESSMENT_CATSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_THREAT_ASSESSMENT_CATS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_CURRENT_THREAT_ASSESSMENT_CAT =
		new FinderPath(com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_assessment_catModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_assessment_catImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containscurrent_threat_assessment_cat",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the current_threat_assessment_cat is associated with the assessing_threats_current.
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @param current_threat_assessment_catPK the primary key of the current_threat_assessment_cat
	 * @return <code>true</code> if the current_threat_assessment_cat is associated with the assessing_threats_current; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_threat_assessment_cat(long pk,
		long current_threat_assessment_catPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, current_threat_assessment_catPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_CURRENT_THREAT_ASSESSMENT_CAT,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containscurrent_threat_assessment_cat.contains(
							pk, current_threat_assessment_catPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_CURRENT_THREAT_ASSESSMENT_CAT,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the assessing_threats_current has any current_threat_assessment_cats associated with it.
	 *
	 * @param pk the primary key of the assessing_threats_current to check for associations with current_threat_assessment_cats
	 * @return <code>true</code> if the assessing_threats_current has any current_threat_assessment_cats associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_threat_assessment_cats(long pk)
		throws SystemException {
		if (getcurrent_threat_assessment_catsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the current_threat_valueses associated with the assessing_threats_current.
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @return the current_threat_valueses associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		long pk) throws SystemException {
		return getcurrent_threat_valueses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the current_threat_valueses associated with the assessing_threats_current.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @return the range of current_threat_valueses associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		long pk, int start, int end) throws SystemException {
		return getcurrent_threat_valueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_THREAT_VALUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_threat_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_threat_valueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_CURRENT_THREAT_VALUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the current_threat_valueses associated with the assessing_threats_current.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @param start the lower bound of the range of assessing_threats_currents
	 * @param end the upper bound of the range of assessing_threats_currents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of current_threat_valueses associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_threat_values> getcurrent_threat_valueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.current_threat_values> list = (List<com.iucn.whp.dbservice.model.current_threat_values>)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_THREAT_VALUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETCURRENT_THREAT_VALUESES.concat(ORDER_BY_CLAUSE)
														 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETCURRENT_THREAT_VALUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_current_threat_values",
					com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.current_threat_values>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_CURRENT_THREAT_VALUESES,
						finderArgs);
				}
				else {
					current_threat_valuesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_THREAT_VALUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_THREAT_VALUESES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_threat_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_threat_valuesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_CURRENT_THREAT_VALUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of current_threat_valueses associated with the assessing_threats_current.
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @return the number of current_threat_valueses associated with the assessing_threats_current
	 * @throws SystemException if a system exception occurred
	 */
	public int getcurrent_threat_valuesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_THREAT_VALUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETCURRENT_THREAT_VALUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_THREAT_VALUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_CURRENT_THREAT_VALUES = new FinderPath(com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_threat_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containscurrent_threat_values",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the current_threat_values is associated with the assessing_threats_current.
	 *
	 * @param pk the primary key of the assessing_threats_current
	 * @param current_threat_valuesPK the primary key of the current_threat_values
	 * @return <code>true</code> if the current_threat_values is associated with the assessing_threats_current; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_threat_values(long pk,
		long current_threat_valuesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, current_threat_valuesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_CURRENT_THREAT_VALUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containscurrent_threat_values.contains(
							pk, current_threat_valuesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_CURRENT_THREAT_VALUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the assessing_threats_current has any current_threat_valueses associated with it.
	 *
	 * @param pk the primary key of the assessing_threats_current to check for associations with current_threat_valueses
	 * @return <code>true</code> if the assessing_threats_current has any current_threat_valueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_threat_valueses(long pk)
		throws SystemException {
		if (getcurrent_threat_valuesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the assessing_threats_current persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.assessing_threats_current")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<assessing_threats_current>> listenersList = new ArrayList<ModelListener<assessing_threats_current>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<assessing_threats_current>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containscurrent_threat_assessment_cat = new Containscurrent_threat_assessment_cat();

		containscurrent_threat_values = new Containscurrent_threat_values();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(assessing_threats_currentImpl.class.getName());
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
	protected Containscurrent_threat_assessment_cat containscurrent_threat_assessment_cat;
	protected Containscurrent_threat_values containscurrent_threat_values;

	protected class Containscurrent_threat_assessment_cat {
		protected Containscurrent_threat_assessment_cat() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSCURRENT_THREAT_ASSESSMENT_CAT,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long current_threat_id,
			long cur_threat_cat_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(current_threat_id), new Long(cur_threat_cat_id)
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

	protected class Containscurrent_threat_values {
		protected Containscurrent_threat_values() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSCURRENT_THREAT_VALUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long current_threat_id,
			long current_threat_values_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(current_threat_id),
						new Long(current_threat_values_id)
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

	private static final String _SQL_SELECT_ASSESSING_THREATS_CURRENT = "SELECT assessing_threats_current FROM assessing_threats_current assessing_threats_current";
	private static final String _SQL_SELECT_ASSESSING_THREATS_CURRENT_WHERE = "SELECT assessing_threats_current FROM assessing_threats_current assessing_threats_current WHERE ";
	private static final String _SQL_COUNT_ASSESSING_THREATS_CURRENT = "SELECT COUNT(assessing_threats_current) FROM assessing_threats_current assessing_threats_current";
	private static final String _SQL_COUNT_ASSESSING_THREATS_CURRENT_WHERE = "SELECT COUNT(assessing_threats_current) FROM assessing_threats_current assessing_threats_current WHERE ";
	private static final String _SQL_GETCURRENT_THREAT_ASSESSMENT_CATS = "SELECT {whp_current_threat_assessment_cat.*} FROM whp_current_threat_assessment_cat INNER JOIN whp_assessing_threats_current ON (whp_assessing_threats_current.current_threat_id = whp_current_threat_assessment_cat.current_threat_id) WHERE (whp_assessing_threats_current.current_threat_id = ?)";
	private static final String _SQL_GETCURRENT_THREAT_ASSESSMENT_CATSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_threat_assessment_cat WHERE current_threat_id = ?";
	private static final String _SQL_CONTAINSCURRENT_THREAT_ASSESSMENT_CAT = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_threat_assessment_cat WHERE current_threat_id = ? AND cur_threat_cat_id = ?";
	private static final String _SQL_GETCURRENT_THREAT_VALUESES = "SELECT {whp_current_threat_values.*} FROM whp_current_threat_values INNER JOIN whp_assessing_threats_current ON (whp_assessing_threats_current.current_threat_id = whp_current_threat_values.current_threat_id) WHERE (whp_assessing_threats_current.current_threat_id = ?)";
	private static final String _SQL_GETCURRENT_THREAT_VALUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_threat_values WHERE current_threat_id = ?";
	private static final String _SQL_CONTAINSCURRENT_THREAT_VALUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_threat_values WHERE current_threat_id = ? AND current_threat_values_id = ?";
	private static final String _FINDER_COLUMN_ASSESMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2 =
		"assessing_threats_current.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessing_threats_current.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No assessing_threats_current exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No assessing_threats_current exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(assessing_threats_currentPersistenceImpl.class);
	private static assessing_threats_current _nullassessing_threats_current = new assessing_threats_currentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<assessing_threats_current> toCacheModel() {
				return _nullassessing_threats_currentCacheModel;
			}
		};

	private static CacheModel<assessing_threats_current> _nullassessing_threats_currentCacheModel =
		new CacheModel<assessing_threats_current>() {
			public assessing_threats_current toEntityModel() {
				return _nullassessing_threats_current;
			}
		};
}