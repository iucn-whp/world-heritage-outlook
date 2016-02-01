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

import com.iucn.whp.dbservice.NoSuchassessment_whvaluesException;
import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.impl.assessment_whvaluesImpl;
import com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl;

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
 * The persistence implementation for the assessment_whvalues service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_whvaluesPersistence
 * @see assessment_whvaluesUtil
 * @generated
 */
public class assessment_whvaluesPersistenceImpl extends BasePersistenceImpl<assessment_whvalues>
	implements assessment_whvaluesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link assessment_whvaluesUtil} to access the assessment_whvalues persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = assessment_whvaluesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			assessment_whvaluesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassessment_version_id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			assessment_whvaluesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessment_version_id",
			new String[] { Long.class.getName() },
			assessment_whvaluesModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID = new FinderPath(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessment_version_id",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			assessment_whvaluesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			assessment_whvaluesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the assessment_whvalues in the entity cache if it is enabled.
	 *
	 * @param assessment_whvalues the assessment_whvalues
	 */
	public void cacheResult(assessment_whvalues assessment_whvalues) {
		EntityCacheUtil.putResult(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesImpl.class, assessment_whvalues.getPrimaryKey(),
			assessment_whvalues);

		assessment_whvalues.resetOriginalValues();
	}

	/**
	 * Caches the assessment_whvalueses in the entity cache if it is enabled.
	 *
	 * @param assessment_whvalueses the assessment_whvalueses
	 */
	public void cacheResult(List<assessment_whvalues> assessment_whvalueses) {
		for (assessment_whvalues assessment_whvalues : assessment_whvalueses) {
			if (EntityCacheUtil.getResult(
						assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
						assessment_whvaluesImpl.class,
						assessment_whvalues.getPrimaryKey()) == null) {
				cacheResult(assessment_whvalues);
			}
			else {
				assessment_whvalues.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessment_whvalueses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(assessment_whvaluesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(assessment_whvaluesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessment_whvalues.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(assessment_whvalues assessment_whvalues) {
		EntityCacheUtil.removeResult(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesImpl.class, assessment_whvalues.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<assessment_whvalues> assessment_whvalueses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (assessment_whvalues assessment_whvalues : assessment_whvalueses) {
			EntityCacheUtil.removeResult(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
				assessment_whvaluesImpl.class,
				assessment_whvalues.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessment_whvalues with the primary key. Does not add the assessment_whvalues to the database.
	 *
	 * @param whvalues_id the primary key for the new assessment_whvalues
	 * @return the new assessment_whvalues
	 */
	public assessment_whvalues create(long whvalues_id) {
		assessment_whvalues assessment_whvalues = new assessment_whvaluesImpl();

		assessment_whvalues.setNew(true);
		assessment_whvalues.setPrimaryKey(whvalues_id);

		return assessment_whvalues;
	}

	/**
	 * Removes the assessment_whvalues with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param whvalues_id the primary key of the assessment_whvalues
	 * @return the assessment_whvalues that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues remove(long whvalues_id)
		throws NoSuchassessment_whvaluesException, SystemException {
		return remove(Long.valueOf(whvalues_id));
	}

	/**
	 * Removes the assessment_whvalues with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment_whvalues
	 * @return the assessment_whvalues that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_whvalues remove(Serializable primaryKey)
		throws NoSuchassessment_whvaluesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			assessment_whvalues assessment_whvalues = (assessment_whvalues)session.get(assessment_whvaluesImpl.class,
					primaryKey);

			if (assessment_whvalues == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchassessment_whvaluesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessment_whvalues);
		}
		catch (NoSuchassessment_whvaluesException nsee) {
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
	protected assessment_whvalues removeImpl(
		assessment_whvalues assessment_whvalues) throws SystemException {
		assessment_whvalues = toUnwrappedModel(assessment_whvalues);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, assessment_whvalues);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(assessment_whvalues);

		return assessment_whvalues;
	}

	@Override
	public assessment_whvalues updateImpl(
		com.iucn.whp.dbservice.model.assessment_whvalues assessment_whvalues,
		boolean merge) throws SystemException {
		assessment_whvalues = toUnwrappedModel(assessment_whvalues);

		boolean isNew = assessment_whvalues.isNew();

		assessment_whvaluesModelImpl assessment_whvaluesModelImpl = (assessment_whvaluesModelImpl)assessment_whvalues;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, assessment_whvalues, merge);

			assessment_whvalues.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !assessment_whvaluesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessment_whvaluesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessment_whvaluesModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);

				args = new Object[] {
						Long.valueOf(assessment_whvaluesModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			assessment_whvaluesImpl.class, assessment_whvalues.getPrimaryKey(),
			assessment_whvalues);

		return assessment_whvalues;
	}

	protected assessment_whvalues toUnwrappedModel(
		assessment_whvalues assessment_whvalues) {
		if (assessment_whvalues instanceof assessment_whvaluesImpl) {
			return assessment_whvalues;
		}

		assessment_whvaluesImpl assessment_whvaluesImpl = new assessment_whvaluesImpl();

		assessment_whvaluesImpl.setNew(assessment_whvalues.isNew());
		assessment_whvaluesImpl.setPrimaryKey(assessment_whvalues.getPrimaryKey());

		assessment_whvaluesImpl.setWhvalues_id(assessment_whvalues.getWhvalues_id());
		assessment_whvaluesImpl.setVn(assessment_whvalues.getVn());
		assessment_whvaluesImpl.setAssessment_version_id(assessment_whvalues.getAssessment_version_id());
		assessment_whvaluesImpl.setValues(assessment_whvalues.getValues());
		assessment_whvaluesImpl.setDescription(assessment_whvalues.getDescription());

		return assessment_whvaluesImpl;
	}

	/**
	 * Returns the assessment_whvalues with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment_whvalues
	 * @return the assessment_whvalues
	 * @throws com.liferay.portal.NoSuchModelException if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_whvalues findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessment_whvalues with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_whvaluesException} if it could not be found.
	 *
	 * @param whvalues_id the primary key of the assessment_whvalues
	 * @return the assessment_whvalues
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues findByPrimaryKey(long whvalues_id)
		throws NoSuchassessment_whvaluesException, SystemException {
		assessment_whvalues assessment_whvalues = fetchByPrimaryKey(whvalues_id);

		if (assessment_whvalues == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + whvalues_id);
			}

			throw new NoSuchassessment_whvaluesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				whvalues_id);
		}

		return assessment_whvalues;
	}

	/**
	 * Returns the assessment_whvalues with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment_whvalues
	 * @return the assessment_whvalues, or <code>null</code> if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_whvalues fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessment_whvalues with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param whvalues_id the primary key of the assessment_whvalues
	 * @return the assessment_whvalues, or <code>null</code> if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues fetchByPrimaryKey(long whvalues_id)
		throws SystemException {
		assessment_whvalues assessment_whvalues = (assessment_whvalues)EntityCacheUtil.getResult(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
				assessment_whvaluesImpl.class, whvalues_id);

		if (assessment_whvalues == _nullassessment_whvalues) {
			return null;
		}

		if (assessment_whvalues == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				assessment_whvalues = (assessment_whvalues)session.get(assessment_whvaluesImpl.class,
						Long.valueOf(whvalues_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (assessment_whvalues != null) {
					cacheResult(assessment_whvalues);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
						assessment_whvaluesImpl.class, whvalues_id,
						_nullassessment_whvalues);
				}

				closeSession(session);
			}
		}

		return assessment_whvalues;
	}

	/**
	 * Returns all the assessment_whvalueses where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_whvalues> findByassessment_version_id(
		long assessment_version_id) throws SystemException {
		return findByassessment_version_id(assessment_version_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_whvalueses where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @return the range of matching assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_whvalues> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassessment_version_id(assessment_version_id, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the assessment_whvalueses where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_whvalues> findByassessment_version_id(
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

		List<assessment_whvalues> list = (List<assessment_whvalues>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessment_whvalues assessment_whvalues : list) {
				if ((assessment_version_id != assessment_whvalues.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_ASSESSMENT_WHVALUES_WHERE);

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

				list = (List<assessment_whvalues>)QueryUtil.list(q,
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
	 * Returns the first assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_whvalues
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a matching assessment_whvalues could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues findByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessment_whvaluesException, SystemException {
		assessment_whvalues assessment_whvalues = fetchByassessment_version_id_First(assessment_version_id,
				orderByComparator);

		if (assessment_whvalues != null) {
			return assessment_whvalues;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_whvaluesException(msg.toString());
	}

	/**
	 * Returns the first assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_whvalues, or <code>null</code> if a matching assessment_whvalues could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues fetchByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessment_whvalues> list = findByassessment_version_id(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_whvalues
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a matching assessment_whvalues could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues findByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessment_whvaluesException, SystemException {
		assessment_whvalues assessment_whvalues = fetchByassessment_version_id_Last(assessment_version_id,
				orderByComparator);

		if (assessment_whvalues != null) {
			return assessment_whvalues;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_whvaluesException(msg.toString());
	}

	/**
	 * Returns the last assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_whvalues, or <code>null</code> if a matching assessment_whvalues could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues fetchByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessment_version_id(assessment_version_id);

		List<assessment_whvalues> list = findByassessment_version_id(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment_whvalueses before and after the current assessment_whvalues in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param whvalues_id the primary key of the current assessment_whvalues
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment_whvalues
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_whvaluesException if a assessment_whvalues with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_whvalues[] findByassessment_version_id_PrevAndNext(
		long whvalues_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchassessment_whvaluesException, SystemException {
		assessment_whvalues assessment_whvalues = findByPrimaryKey(whvalues_id);

		Session session = null;

		try {
			session = openSession();

			assessment_whvalues[] array = new assessment_whvaluesImpl[3];

			array[0] = getByassessment_version_id_PrevAndNext(session,
					assessment_whvalues, assessment_version_id,
					orderByComparator, true);

			array[1] = assessment_whvalues;

			array[2] = getByassessment_version_id_PrevAndNext(session,
					assessment_whvalues, assessment_version_id,
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

	protected assessment_whvalues getByassessment_version_id_PrevAndNext(
		Session session, assessment_whvalues assessment_whvalues,
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

		query.append(_SQL_SELECT_ASSESSMENT_WHVALUES_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessment_whvalues);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessment_whvalues> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessment_whvalueses.
	 *
	 * @return the assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_whvalues> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_whvalueses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @return the range of assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_whvalues> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_whvalueses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_whvalues> findAll(int start, int end,
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

		List<assessment_whvalues> list = (List<assessment_whvalues>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENT_WHVALUES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENT_WHVALUES;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<assessment_whvalues>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<assessment_whvalues>)QueryUtil.list(q,
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
	 * Removes all the assessment_whvalueses where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessment_version_id(long assessment_version_id)
		throws SystemException {
		for (assessment_whvalues assessment_whvalues : findByassessment_version_id(
				assessment_version_id)) {
			remove(assessment_whvalues);
		}
	}

	/**
	 * Removes all the assessment_whvalueses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (assessment_whvalues assessment_whvalues : findAll()) {
			remove(assessment_whvalues);
		}
	}

	/**
	 * Returns the number of assessment_whvalueses where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessment_version_id(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESSMENT_WHVALUES_WHERE);

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
	 * Returns the number of assessment_whvalueses.
	 *
	 * @return the number of assessment_whvalueses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENT_WHVALUES);

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
	 * Returns all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @return the assessment_whvalues_whcriterions associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk) throws SystemException {
		return getassessment_whvalues_whcriterions(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @return the range of assessment_whvalues_whcriterions associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk, int start, int end) throws SystemException {
		return getassessment_whvalues_whcriterions(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_whvalues_whcriterionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessment_whvalues_whcriterions",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the assessment_whvalues_whcriterions associated with the assessment_whvalues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment_whvalues_whcriterions associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> getassessment_whvalues_whcriterions(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion> list = (List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion>)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETASSESSMENT_WHVALUES_WHCRITERIONS.concat(ORDER_BY_CLAUSE)
																  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETASSESSMENT_WHVALUES_WHCRITERIONS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_assessment_whvalues_whcriterion",
					com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS,
						finderArgs);
				}
				else {
					assessment_whvalues_whcriterionPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_whvalues_whcriterionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessment_whvalues_whcriterionsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of assessment_whvalues_whcriterions associated with the assessment_whvalues.
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @return the number of assessment_whvalues_whcriterions associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public int getassessment_whvalues_whcriterionsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETASSESSMENT_WHVALUES_WHCRITERIONSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSMENT_WHVALUES_WHCRITERIONS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_ASSESSMENT_WHVALUES_WHCRITERION =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvalues_whcriterionImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_whvalues_whcriterionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsassessment_whvalues_whcriterion",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the assessment_whvalues_whcriterion is associated with the assessment_whvalues.
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @param assessment_whvalues_whcriterionPK the primary key of the assessment_whvalues_whcriterion
	 * @return <code>true</code> if the assessment_whvalues_whcriterion is associated with the assessment_whvalues; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessment_whvalues_whcriterion(long pk,
		long assessment_whvalues_whcriterionPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, assessment_whvalues_whcriterionPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_ASSESSMENT_WHVALUES_WHCRITERION,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsassessment_whvalues_whcriterion.contains(
							pk, assessment_whvalues_whcriterionPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_ASSESSMENT_WHVALUES_WHCRITERION,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the assessment_whvalues has any assessment_whvalues_whcriterions associated with it.
	 *
	 * @param pk the primary key of the assessment_whvalues to check for associations with assessment_whvalues_whcriterions
	 * @return <code>true</code> if the assessment_whvalues has any assessment_whvalues_whcriterions associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessment_whvalues_whcriterions(long pk)
		throws SystemException {
		if (getassessment_whvalues_whcriterionsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the current_state_trend_valueses associated with the assessment_whvalues.
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @return the current_state_trend_valueses associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk) throws SystemException {
		return getcurrent_state_trend_valueses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the current_state_trend_valueses associated with the assessment_whvalues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @return the range of current_state_trend_valueses associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end) throws SystemException {
		return getcurrent_state_trend_valueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_state_trend_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_state_trend_valueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the current_state_trend_valueses associated with the assessment_whvalues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @param start the lower bound of the range of assessment_whvalueses
	 * @param end the upper bound of the range of assessment_whvalueses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of current_state_trend_valueses associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_state_trend_values> getcurrent_state_trend_valueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.current_state_trend_values> list = (List<com.iucn.whp.dbservice.model.current_state_trend_values>)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETCURRENT_STATE_TREND_VALUESES.concat(ORDER_BY_CLAUSE)
															  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETCURRENT_STATE_TREND_VALUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_current_state_trend_values",
					com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.current_state_trend_values>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES,
						finderArgs);
				}
				else {
					current_state_trend_valuesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_state_trend_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_state_trend_valuesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of current_state_trend_valueses associated with the assessment_whvalues.
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @return the number of current_state_trend_valueses associated with the assessment_whvalues
	 * @throws SystemException if a system exception occurred
	 */
	public int getcurrent_state_trend_valuesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETCURRENT_STATE_TREND_VALUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_STATE_TREND_VALUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_CURRENT_STATE_TREND_VALUES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_state_trend_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containscurrent_state_trend_values",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the current_state_trend_values is associated with the assessment_whvalues.
	 *
	 * @param pk the primary key of the assessment_whvalues
	 * @param current_state_trend_valuesPK the primary key of the current_state_trend_values
	 * @return <code>true</code> if the current_state_trend_values is associated with the assessment_whvalues; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_state_trend_values(long pk,
		long current_state_trend_valuesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, current_state_trend_valuesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_CURRENT_STATE_TREND_VALUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containscurrent_state_trend_values.contains(
							pk, current_state_trend_valuesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_CURRENT_STATE_TREND_VALUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the assessment_whvalues has any current_state_trend_valueses associated with it.
	 *
	 * @param pk the primary key of the assessment_whvalues to check for associations with current_state_trend_valueses
	 * @return <code>true</code> if the assessment_whvalues has any current_state_trend_valueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_state_trend_valueses(long pk)
		throws SystemException {
		if (getcurrent_state_trend_valuesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the assessment_whvalues persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.assessment_whvalues")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<assessment_whvalues>> listenersList = new ArrayList<ModelListener<assessment_whvalues>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<assessment_whvalues>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsassessment_whvalues_whcriterion = new Containsassessment_whvalues_whcriterion();

		containscurrent_state_trend_values = new Containscurrent_state_trend_values();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(assessment_whvaluesImpl.class.getName());
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
	protected Containsassessment_whvalues_whcriterion containsassessment_whvalues_whcriterion;
	protected Containscurrent_state_trend_values containscurrent_state_trend_values;

	protected class Containsassessment_whvalues_whcriterion {
		protected Containsassessment_whvalues_whcriterion() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSASSESSMENT_WHVALUES_WHCRITERION,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long whvalues_id, long wh_criteria_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(whvalues_id), new Long(wh_criteria_id)
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

	protected class Containscurrent_state_trend_values {
		protected Containscurrent_state_trend_values() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSCURRENT_STATE_TREND_VALUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long whvalues_id, long id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(whvalues_id), new Long(id)
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

	private static final String _SQL_SELECT_ASSESSMENT_WHVALUES = "SELECT assessment_whvalues FROM assessment_whvalues assessment_whvalues";
	private static final String _SQL_SELECT_ASSESSMENT_WHVALUES_WHERE = "SELECT assessment_whvalues FROM assessment_whvalues assessment_whvalues WHERE ";
	private static final String _SQL_COUNT_ASSESSMENT_WHVALUES = "SELECT COUNT(assessment_whvalues) FROM assessment_whvalues assessment_whvalues";
	private static final String _SQL_COUNT_ASSESSMENT_WHVALUES_WHERE = "SELECT COUNT(assessment_whvalues) FROM assessment_whvalues assessment_whvalues WHERE ";
	private static final String _SQL_GETASSESSMENT_WHVALUES_WHCRITERIONS = "SELECT {whp_assessment_whvalues_whcriterion.*} FROM whp_assessment_whvalues_whcriterion INNER JOIN whp_assessment_whvalues ON (whp_assessment_whvalues.whvalues_id = whp_assessment_whvalues_whcriterion.whvalues_id) WHERE (whp_assessment_whvalues.whvalues_id = ?)";
	private static final String _SQL_GETASSESSMENT_WHVALUES_WHCRITERIONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessment_whvalues_whcriterion WHERE whvalues_id = ?";
	private static final String _SQL_CONTAINSASSESSMENT_WHVALUES_WHCRITERION = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessment_whvalues_whcriterion WHERE whvalues_id = ? AND wh_criteria_id = ?";
	private static final String _SQL_GETCURRENT_STATE_TREND_VALUESES = "SELECT {whp_current_state_trend_values.*} FROM whp_current_state_trend_values INNER JOIN whp_assessment_whvalues ON (whp_assessment_whvalues.whvalues_id = whp_current_state_trend_values.whvalues_id) WHERE (whp_assessment_whvalues.whvalues_id = ?)";
	private static final String _SQL_GETCURRENT_STATE_TREND_VALUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_state_trend_values WHERE whvalues_id = ?";
	private static final String _SQL_CONTAINSCURRENT_STATE_TREND_VALUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_state_trend_values WHERE whvalues_id = ? AND id_ = ?";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2 =
		"assessment_whvalues.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessment_whvalues.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No assessment_whvalues exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No assessment_whvalues exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(assessment_whvaluesPersistenceImpl.class);
	private static assessment_whvalues _nullassessment_whvalues = new assessment_whvaluesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<assessment_whvalues> toCacheModel() {
				return _nullassessment_whvaluesCacheModel;
			}
		};

	private static CacheModel<assessment_whvalues> _nullassessment_whvaluesCacheModel =
		new CacheModel<assessment_whvalues>() {
			public assessment_whvalues toEntityModel() {
				return _nullassessment_whvalues;
			}
		};
}