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

import com.iucn.whp.dbservice.NoSuchassessment_validationException;
import com.iucn.whp.dbservice.model.assessment_validation;
import com.iucn.whp.dbservice.model.impl.assessment_validationImpl;
import com.iucn.whp.dbservice.model.impl.assessment_validationModelImpl;

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
 * The persistence implementation for the assessment_validation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_validationPersistence
 * @see assessment_validationUtil
 * @generated
 */
public class assessment_validationPersistenceImpl extends BasePersistenceImpl<assessment_validation>
	implements assessment_validationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link assessment_validationUtil} to access the assessment_validation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = assessment_validationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID = new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED,
			assessment_validationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByassessment_version_id",
			new String[] { Long.class.getName(), Long.class.getName() },
			assessment_validationModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK |
			assessment_validationModelImpl.ASSESSMENT_STEP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID = new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessment_version_id",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERID =
		new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED,
			assessment_validationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByassessment_verId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERID =
		new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED,
			assessment_validationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessment_verId", new String[] { Long.class.getName() },
			assessment_validationModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENT_VERID = new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessment_verId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED,
			assessment_validationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED,
			assessment_validationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the assessment_validation in the entity cache if it is enabled.
	 *
	 * @param assessment_validation the assessment_validation
	 */
	public void cacheResult(assessment_validation assessment_validation) {
		EntityCacheUtil.putResult(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationImpl.class,
			assessment_validation.getPrimaryKey(), assessment_validation);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
			new Object[] {
				Long.valueOf(assessment_validation.getAssessment_version_id()),
				Long.valueOf(assessment_validation.getAssessment_step())
			}, assessment_validation);

		assessment_validation.resetOriginalValues();
	}

	/**
	 * Caches the assessment_validations in the entity cache if it is enabled.
	 *
	 * @param assessment_validations the assessment_validations
	 */
	public void cacheResult(List<assessment_validation> assessment_validations) {
		for (assessment_validation assessment_validation : assessment_validations) {
			if (EntityCacheUtil.getResult(
						assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
						assessment_validationImpl.class,
						assessment_validation.getPrimaryKey()) == null) {
				cacheResult(assessment_validation);
			}
			else {
				assessment_validation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessment_validations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(assessment_validationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(assessment_validationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessment_validation.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(assessment_validation assessment_validation) {
		EntityCacheUtil.removeResult(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationImpl.class,
			assessment_validation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(assessment_validation);
	}

	@Override
	public void clearCache(List<assessment_validation> assessment_validations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (assessment_validation assessment_validation : assessment_validations) {
			EntityCacheUtil.removeResult(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
				assessment_validationImpl.class,
				assessment_validation.getPrimaryKey());

			clearUniqueFindersCache(assessment_validation);
		}
	}

	protected void clearUniqueFindersCache(
		assessment_validation assessment_validation) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
			new Object[] {
				Long.valueOf(assessment_validation.getAssessment_version_id()),
				Long.valueOf(assessment_validation.getAssessment_step())
			});
	}

	/**
	 * Creates a new assessment_validation with the primary key. Does not add the assessment_validation to the database.
	 *
	 * @param assessment_ver_val_id the primary key for the new assessment_validation
	 * @return the new assessment_validation
	 */
	public assessment_validation create(long assessment_ver_val_id) {
		assessment_validation assessment_validation = new assessment_validationImpl();

		assessment_validation.setNew(true);
		assessment_validation.setPrimaryKey(assessment_ver_val_id);

		return assessment_validation;
	}

	/**
	 * Removes the assessment_validation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessment_ver_val_id the primary key of the assessment_validation
	 * @return the assessment_validation that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation remove(long assessment_ver_val_id)
		throws NoSuchassessment_validationException, SystemException {
		return remove(Long.valueOf(assessment_ver_val_id));
	}

	/**
	 * Removes the assessment_validation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment_validation
	 * @return the assessment_validation that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_validation remove(Serializable primaryKey)
		throws NoSuchassessment_validationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			assessment_validation assessment_validation = (assessment_validation)session.get(assessment_validationImpl.class,
					primaryKey);

			if (assessment_validation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchassessment_validationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessment_validation);
		}
		catch (NoSuchassessment_validationException nsee) {
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
	protected assessment_validation removeImpl(
		assessment_validation assessment_validation) throws SystemException {
		assessment_validation = toUnwrappedModel(assessment_validation);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, assessment_validation);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(assessment_validation);

		return assessment_validation;
	}

	@Override
	public assessment_validation updateImpl(
		com.iucn.whp.dbservice.model.assessment_validation assessment_validation,
		boolean merge) throws SystemException {
		assessment_validation = toUnwrappedModel(assessment_validation);

		boolean isNew = assessment_validation.isNew();

		assessment_validationModelImpl assessment_validationModelImpl = (assessment_validationModelImpl)assessment_validation;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, assessment_validation, merge);

			assessment_validation.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !assessment_validationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessment_validationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessment_validationModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERID,
					args);

				args = new Object[] {
						Long.valueOf(assessment_validationModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERID,
					args);
			}
		}

		EntityCacheUtil.putResult(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
			assessment_validationImpl.class,
			assessment_validation.getPrimaryKey(), assessment_validation);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
				new Object[] {
					Long.valueOf(
						assessment_validation.getAssessment_version_id()),
					Long.valueOf(assessment_validation.getAssessment_step())
				}, assessment_validation);
		}
		else {
			if ((assessment_validationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessment_validationModelImpl.getOriginalAssessment_version_id()),
						Long.valueOf(assessment_validationModelImpl.getOriginalAssessment_step())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
					new Object[] {
						Long.valueOf(
							assessment_validation.getAssessment_version_id()),
						Long.valueOf(assessment_validation.getAssessment_step())
					}, assessment_validation);
			}
		}

		return assessment_validation;
	}

	protected assessment_validation toUnwrappedModel(
		assessment_validation assessment_validation) {
		if (assessment_validation instanceof assessment_validationImpl) {
			return assessment_validation;
		}

		assessment_validationImpl assessment_validationImpl = new assessment_validationImpl();

		assessment_validationImpl.setNew(assessment_validation.isNew());
		assessment_validationImpl.setPrimaryKey(assessment_validation.getPrimaryKey());

		assessment_validationImpl.setAssessment_ver_val_id(assessment_validation.getAssessment_ver_val_id());
		assessment_validationImpl.setAssessment_version_id(assessment_validation.getAssessment_version_id());
		assessment_validationImpl.setAssessment_step(assessment_validation.getAssessment_step());
		assessment_validationImpl.setValidation_complete(assessment_validation.isValidation_complete());

		return assessment_validationImpl;
	}

	/**
	 * Returns the assessment_validation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment_validation
	 * @return the assessment_validation
	 * @throws com.liferay.portal.NoSuchModelException if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_validation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessment_validation with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_validationException} if it could not be found.
	 *
	 * @param assessment_ver_val_id the primary key of the assessment_validation
	 * @return the assessment_validation
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation findByPrimaryKey(long assessment_ver_val_id)
		throws NoSuchassessment_validationException, SystemException {
		assessment_validation assessment_validation = fetchByPrimaryKey(assessment_ver_val_id);

		if (assessment_validation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					assessment_ver_val_id);
			}

			throw new NoSuchassessment_validationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				assessment_ver_val_id);
		}

		return assessment_validation;
	}

	/**
	 * Returns the assessment_validation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment_validation
	 * @return the assessment_validation, or <code>null</code> if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_validation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessment_validation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessment_ver_val_id the primary key of the assessment_validation
	 * @return the assessment_validation, or <code>null</code> if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation fetchByPrimaryKey(long assessment_ver_val_id)
		throws SystemException {
		assessment_validation assessment_validation = (assessment_validation)EntityCacheUtil.getResult(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
				assessment_validationImpl.class, assessment_ver_val_id);

		if (assessment_validation == _nullassessment_validation) {
			return null;
		}

		if (assessment_validation == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				assessment_validation = (assessment_validation)session.get(assessment_validationImpl.class,
						Long.valueOf(assessment_ver_val_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (assessment_validation != null) {
					cacheResult(assessment_validation);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(assessment_validationModelImpl.ENTITY_CACHE_ENABLED,
						assessment_validationImpl.class, assessment_ver_val_id,
						_nullassessment_validation);
				}

				closeSession(session);
			}
		}

		return assessment_validation;
	}

	/**
	 * Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_validationException} if it could not be found.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param assessment_step the assessment_step
	 * @return the matching assessment_validation
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation findByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws NoSuchassessment_validationException, SystemException {
		assessment_validation assessment_validation = fetchByassessment_version_id(assessment_version_id,
				assessment_step);

		if (assessment_validation == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("assessment_version_id=");
			msg.append(assessment_version_id);

			msg.append(", assessment_step=");
			msg.append(assessment_step);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchassessment_validationException(msg.toString());
		}

		return assessment_validation;
	}

	/**
	 * Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param assessment_step the assessment_step
	 * @return the matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation fetchByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws SystemException {
		return fetchByassessment_version_id(assessment_version_id,
			assessment_step, true);
	}

	/**
	 * Returns the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param assessment_step the assessment_step
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation fetchByassessment_version_id(
		long assessment_version_id, long assessment_step,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				assessment_version_id, assessment_step
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
					finderArgs, this);
		}

		if (result instanceof assessment_validation) {
			assessment_validation assessment_validation = (assessment_validation)result;

			if ((assessment_version_id != assessment_validation.getAssessment_version_id()) ||
					(assessment_step != assessment_validation.getAssessment_step())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ASSESSMENT_VALIDATION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_STEP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessment_version_id);

				qPos.add(assessment_step);

				List<assessment_validation> list = q.list();

				result = list;

				assessment_validation assessment_validation = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
						finderArgs, list);
				}
				else {
					assessment_validation = list.get(0);

					cacheResult(assessment_validation);

					if ((assessment_validation.getAssessment_version_id() != assessment_version_id) ||
							(assessment_validation.getAssessment_step() != assessment_step)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
							finderArgs, assessment_validation);
					}
				}

				return assessment_validation;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSESSMENT_VERSION_ID,
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
				return (assessment_validation)result;
			}
		}
	}

	/**
	 * Returns all the assessment_validations where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_validation> findByassessment_verId(
		long assessment_version_id) throws SystemException {
		return findByassessment_verId(assessment_version_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_validations where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessment_validations
	 * @param end the upper bound of the range of assessment_validations (not inclusive)
	 * @return the range of matching assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_validation> findByassessment_verId(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassessment_verId(assessment_version_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_validations where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessment_validations
	 * @param end the upper bound of the range of assessment_validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_validation> findByassessment_verId(
		long assessment_version_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERID;
			finderArgs = new Object[] { assessment_version_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERID;
			finderArgs = new Object[] {
					assessment_version_id,
					
					start, end, orderByComparator
				};
		}

		List<assessment_validation> list = (List<assessment_validation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessment_validation assessment_validation : list) {
				if ((assessment_version_id != assessment_validation.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_ASSESSMENT_VALIDATION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERID_ASSESSMENT_VERSION_ID_2);

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

				list = (List<assessment_validation>)QueryUtil.list(q,
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
	 * Returns the first assessment_validation in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_validation
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation findByassessment_verId_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessment_validationException, SystemException {
		assessment_validation assessment_validation = fetchByassessment_verId_First(assessment_version_id,
				orderByComparator);

		if (assessment_validation != null) {
			return assessment_validation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_validationException(msg.toString());
	}

	/**
	 * Returns the first assessment_validation in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation fetchByassessment_verId_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessment_validation> list = findByassessment_verId(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment_validation in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_validation
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation findByassessment_verId_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessment_validationException, SystemException {
		assessment_validation assessment_validation = fetchByassessment_verId_Last(assessment_version_id,
				orderByComparator);

		if (assessment_validation != null) {
			return assessment_validation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_validationException(msg.toString());
	}

	/**
	 * Returns the last assessment_validation in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_validation, or <code>null</code> if a matching assessment_validation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation fetchByassessment_verId_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessment_verId(assessment_version_id);

		List<assessment_validation> list = findByassessment_verId(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment_validations before and after the current assessment_validation in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_ver_val_id the primary key of the current assessment_validation
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment_validation
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_validationException if a assessment_validation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation[] findByassessment_verId_PrevAndNext(
		long assessment_ver_val_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchassessment_validationException, SystemException {
		assessment_validation assessment_validation = findByPrimaryKey(assessment_ver_val_id);

		Session session = null;

		try {
			session = openSession();

			assessment_validation[] array = new assessment_validationImpl[3];

			array[0] = getByassessment_verId_PrevAndNext(session,
					assessment_validation, assessment_version_id,
					orderByComparator, true);

			array[1] = assessment_validation;

			array[2] = getByassessment_verId_PrevAndNext(session,
					assessment_validation, assessment_version_id,
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

	protected assessment_validation getByassessment_verId_PrevAndNext(
		Session session, assessment_validation assessment_validation,
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

		query.append(_SQL_SELECT_ASSESSMENT_VALIDATION_WHERE);

		query.append(_FINDER_COLUMN_ASSESSMENT_VERID_ASSESSMENT_VERSION_ID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessment_validation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessment_validation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessment_validations.
	 *
	 * @return the assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_validation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_validations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment_validations
	 * @param end the upper bound of the range of assessment_validations (not inclusive)
	 * @return the range of assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_validation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_validations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment_validations
	 * @param end the upper bound of the range of assessment_validations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_validation> findAll(int start, int end,
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

		List<assessment_validation> list = (List<assessment_validation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENT_VALIDATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENT_VALIDATION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<assessment_validation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<assessment_validation>)QueryUtil.list(q,
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
	 * Removes the assessment_validation where assessment_version_id = &#63; and assessment_step = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param assessment_step the assessment_step
	 * @return the assessment_validation that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_validation removeByassessment_version_id(
		long assessment_version_id, long assessment_step)
		throws NoSuchassessment_validationException, SystemException {
		assessment_validation assessment_validation = findByassessment_version_id(assessment_version_id,
				assessment_step);

		return remove(assessment_validation);
	}

	/**
	 * Removes all the assessment_validations where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessment_verId(long assessment_version_id)
		throws SystemException {
		for (assessment_validation assessment_validation : findByassessment_verId(
				assessment_version_id)) {
			remove(assessment_validation);
		}
	}

	/**
	 * Removes all the assessment_validations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (assessment_validation assessment_validation : findAll()) {
			remove(assessment_validation);
		}
	}

	/**
	 * Returns the number of assessment_validations where assessment_version_id = &#63; and assessment_step = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param assessment_step the assessment_step
	 * @return the number of matching assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessment_version_id(long assessment_version_id,
		long assessment_step) throws SystemException {
		Object[] finderArgs = new Object[] {
				assessment_version_id, assessment_step
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSESSMENT_VALIDATION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_STEP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessment_version_id);

				qPos.add(assessment_step);

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
	 * Returns the number of assessment_validations where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessment_verId(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESSMENT_VALIDATION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENT_VERID_ASSESSMENT_VERSION_ID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of assessment_validations.
	 *
	 * @return the number of assessment_validations
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENT_VALIDATION);

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
	 * Initializes the assessment_validation persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.assessment_validation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<assessment_validation>> listenersList = new ArrayList<ModelListener<assessment_validation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<assessment_validation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(assessment_validationImpl.class.getName());
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
	private static final String _SQL_SELECT_ASSESSMENT_VALIDATION = "SELECT assessment_validation FROM assessment_validation assessment_validation";
	private static final String _SQL_SELECT_ASSESSMENT_VALIDATION_WHERE = "SELECT assessment_validation FROM assessment_validation assessment_validation WHERE ";
	private static final String _SQL_COUNT_ASSESSMENT_VALIDATION = "SELECT COUNT(assessment_validation) FROM assessment_validation assessment_validation";
	private static final String _SQL_COUNT_ASSESSMENT_VALIDATION_WHERE = "SELECT COUNT(assessment_validation) FROM assessment_validation assessment_validation WHERE ";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2 =
		"assessment_validation.assessment_version_id = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_STEP_2 =
		"assessment_validation.assessment_step = ?";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERID_ASSESSMENT_VERSION_ID_2 =
		"assessment_validation.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessment_validation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No assessment_validation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No assessment_validation exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(assessment_validationPersistenceImpl.class);
	private static assessment_validation _nullassessment_validation = new assessment_validationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<assessment_validation> toCacheModel() {
				return _nullassessment_validationCacheModel;
			}
		};

	private static CacheModel<assessment_validation> _nullassessment_validationCacheModel =
		new CacheModel<assessment_validation>() {
			public assessment_validation toEntityModel() {
				return _nullassessment_validation;
			}
		};
}