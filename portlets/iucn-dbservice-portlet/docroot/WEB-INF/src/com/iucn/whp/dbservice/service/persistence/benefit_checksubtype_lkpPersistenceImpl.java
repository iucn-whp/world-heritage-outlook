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

import com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException;
import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;
import com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl;
import com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl;

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
 * The persistence implementation for the benefit_checksubtype_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkpPersistence
 * @see benefit_checksubtype_lkpUtil
 * @generated
 */
public class benefit_checksubtype_lkpPersistenceImpl extends BasePersistenceImpl<benefit_checksubtype_lkp>
	implements benefit_checksubtype_lkpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link benefit_checksubtype_lkpUtil} to access the benefit_checksubtype_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = benefit_checksubtype_lkpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESTATUS =
		new FinderPath(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActiveStatus",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS =
		new FinderPath(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActiveStatus",
			new String[] { Boolean.class.getName() },
			benefit_checksubtype_lkpModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVESTATUS = new FinderPath(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActiveStatus",
			new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the benefit_checksubtype_lkp in the entity cache if it is enabled.
	 *
	 * @param benefit_checksubtype_lkp the benefit_checksubtype_lkp
	 */
	public void cacheResult(benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		EntityCacheUtil.putResult(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			benefit_checksubtype_lkp.getPrimaryKey(), benefit_checksubtype_lkp);

		benefit_checksubtype_lkp.resetOriginalValues();
	}

	/**
	 * Caches the benefit_checksubtype_lkps in the entity cache if it is enabled.
	 *
	 * @param benefit_checksubtype_lkps the benefit_checksubtype_lkps
	 */
	public void cacheResult(
		List<benefit_checksubtype_lkp> benefit_checksubtype_lkps) {
		for (benefit_checksubtype_lkp benefit_checksubtype_lkp : benefit_checksubtype_lkps) {
			if (EntityCacheUtil.getResult(
						benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
						benefit_checksubtype_lkpImpl.class,
						benefit_checksubtype_lkp.getPrimaryKey()) == null) {
				cacheResult(benefit_checksubtype_lkp);
			}
			else {
				benefit_checksubtype_lkp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all benefit_checksubtype_lkps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(benefit_checksubtype_lkpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(benefit_checksubtype_lkpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the benefit_checksubtype_lkp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		EntityCacheUtil.removeResult(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			benefit_checksubtype_lkp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<benefit_checksubtype_lkp> benefit_checksubtype_lkps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (benefit_checksubtype_lkp benefit_checksubtype_lkp : benefit_checksubtype_lkps) {
			EntityCacheUtil.removeResult(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
				benefit_checksubtype_lkpImpl.class,
				benefit_checksubtype_lkp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new benefit_checksubtype_lkp with the primary key. Does not add the benefit_checksubtype_lkp to the database.
	 *
	 * @param subbenefit_id the primary key for the new benefit_checksubtype_lkp
	 * @return the new benefit_checksubtype_lkp
	 */
	public benefit_checksubtype_lkp create(long subbenefit_id) {
		benefit_checksubtype_lkp benefit_checksubtype_lkp = new benefit_checksubtype_lkpImpl();

		benefit_checksubtype_lkp.setNew(true);
		benefit_checksubtype_lkp.setPrimaryKey(subbenefit_id);

		return benefit_checksubtype_lkp;
	}

	/**
	 * Removes the benefit_checksubtype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	 * @return the benefit_checksubtype_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp remove(long subbenefit_id)
		throws NoSuchbenefit_checksubtype_lkpException, SystemException {
		return remove(Long.valueOf(subbenefit_id));
	}

	/**
	 * Removes the benefit_checksubtype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the benefit_checksubtype_lkp
	 * @return the benefit_checksubtype_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefit_checksubtype_lkp remove(Serializable primaryKey)
		throws NoSuchbenefit_checksubtype_lkpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			benefit_checksubtype_lkp benefit_checksubtype_lkp = (benefit_checksubtype_lkp)session.get(benefit_checksubtype_lkpImpl.class,
					primaryKey);

			if (benefit_checksubtype_lkp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbenefit_checksubtype_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(benefit_checksubtype_lkp);
		}
		catch (NoSuchbenefit_checksubtype_lkpException nsee) {
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
	protected benefit_checksubtype_lkp removeImpl(
		benefit_checksubtype_lkp benefit_checksubtype_lkp)
		throws SystemException {
		benefit_checksubtype_lkp = toUnwrappedModel(benefit_checksubtype_lkp);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, benefit_checksubtype_lkp);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(benefit_checksubtype_lkp);

		return benefit_checksubtype_lkp;
	}

	@Override
	public benefit_checksubtype_lkp updateImpl(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp,
		boolean merge) throws SystemException {
		benefit_checksubtype_lkp = toUnwrappedModel(benefit_checksubtype_lkp);

		boolean isNew = benefit_checksubtype_lkp.isNew();

		benefit_checksubtype_lkpModelImpl benefit_checksubtype_lkpModelImpl = (benefit_checksubtype_lkpModelImpl)benefit_checksubtype_lkp;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, benefit_checksubtype_lkp, merge);

			benefit_checksubtype_lkp.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !benefit_checksubtype_lkpModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((benefit_checksubtype_lkpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Boolean.valueOf(benefit_checksubtype_lkpModelImpl.getOriginalActive())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS,
					args);

				args = new Object[] {
						Boolean.valueOf(benefit_checksubtype_lkpModelImpl.getActive())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checksubtype_lkpImpl.class,
			benefit_checksubtype_lkp.getPrimaryKey(), benefit_checksubtype_lkp);

		return benefit_checksubtype_lkp;
	}

	protected benefit_checksubtype_lkp toUnwrappedModel(
		benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		if (benefit_checksubtype_lkp instanceof benefit_checksubtype_lkpImpl) {
			return benefit_checksubtype_lkp;
		}

		benefit_checksubtype_lkpImpl benefit_checksubtype_lkpImpl = new benefit_checksubtype_lkpImpl();

		benefit_checksubtype_lkpImpl.setNew(benefit_checksubtype_lkp.isNew());
		benefit_checksubtype_lkpImpl.setPrimaryKey(benefit_checksubtype_lkp.getPrimaryKey());

		benefit_checksubtype_lkpImpl.setSubbenefit_id(benefit_checksubtype_lkp.getSubbenefit_id());
		benefit_checksubtype_lkpImpl.setBenefit_checksubtype(benefit_checksubtype_lkp.getBenefit_checksubtype());
		benefit_checksubtype_lkpImpl.setParent_id(benefit_checksubtype_lkp.getParent_id());
		benefit_checksubtype_lkpImpl.setPosition(benefit_checksubtype_lkp.getPosition());
		benefit_checksubtype_lkpImpl.setActive(benefit_checksubtype_lkp.isActive());

		return benefit_checksubtype_lkpImpl;
	}

	/**
	 * Returns the benefit_checksubtype_lkp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the benefit_checksubtype_lkp
	 * @return the benefit_checksubtype_lkp
	 * @throws com.liferay.portal.NoSuchModelException if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefit_checksubtype_lkp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the benefit_checksubtype_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException} if it could not be found.
	 *
	 * @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	 * @return the benefit_checksubtype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp findByPrimaryKey(long subbenefit_id)
		throws NoSuchbenefit_checksubtype_lkpException, SystemException {
		benefit_checksubtype_lkp benefit_checksubtype_lkp = fetchByPrimaryKey(subbenefit_id);

		if (benefit_checksubtype_lkp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + subbenefit_id);
			}

			throw new NoSuchbenefit_checksubtype_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				subbenefit_id);
		}

		return benefit_checksubtype_lkp;
	}

	/**
	 * Returns the benefit_checksubtype_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the benefit_checksubtype_lkp
	 * @return the benefit_checksubtype_lkp, or <code>null</code> if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefit_checksubtype_lkp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the benefit_checksubtype_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subbenefit_id the primary key of the benefit_checksubtype_lkp
	 * @return the benefit_checksubtype_lkp, or <code>null</code> if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp fetchByPrimaryKey(long subbenefit_id)
		throws SystemException {
		benefit_checksubtype_lkp benefit_checksubtype_lkp = (benefit_checksubtype_lkp)EntityCacheUtil.getResult(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
				benefit_checksubtype_lkpImpl.class, subbenefit_id);

		if (benefit_checksubtype_lkp == _nullbenefit_checksubtype_lkp) {
			return null;
		}

		if (benefit_checksubtype_lkp == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				benefit_checksubtype_lkp = (benefit_checksubtype_lkp)session.get(benefit_checksubtype_lkpImpl.class,
						Long.valueOf(subbenefit_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (benefit_checksubtype_lkp != null) {
					cacheResult(benefit_checksubtype_lkp);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
						benefit_checksubtype_lkpImpl.class, subbenefit_id,
						_nullbenefit_checksubtype_lkp);
				}

				closeSession(session);
			}
		}

		return benefit_checksubtype_lkp;
	}

	/**
	 * Returns all the benefit_checksubtype_lkps where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checksubtype_lkp> findByActiveStatus(boolean active)
		throws SystemException {
		return findByActiveStatus(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the benefit_checksubtype_lkps where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of benefit_checksubtype_lkps
	 * @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	 * @return the range of matching benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checksubtype_lkp> findByActiveStatus(boolean active,
		int start, int end) throws SystemException {
		return findByActiveStatus(active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefit_checksubtype_lkps where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of benefit_checksubtype_lkps
	 * @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checksubtype_lkp> findByActiveStatus(boolean active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS;
			finderArgs = new Object[] { active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESTATUS;
			finderArgs = new Object[] { active, start, end, orderByComparator };
		}

		List<benefit_checksubtype_lkp> list = (List<benefit_checksubtype_lkp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (benefit_checksubtype_lkp benefit_checksubtype_lkp : list) {
				if ((active != benefit_checksubtype_lkp.getActive())) {
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

			query.append(_SQL_SELECT_BENEFIT_CHECKSUBTYPE_LKP_WHERE);

			query.append(_FINDER_COLUMN_ACTIVESTATUS_ACTIVE_2);

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

				qPos.add(active);

				list = (List<benefit_checksubtype_lkp>)QueryUtil.list(q,
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
	 * Returns the first benefit_checksubtype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit_checksubtype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a matching benefit_checksubtype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp findByActiveStatus_First(boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchbenefit_checksubtype_lkpException, SystemException {
		benefit_checksubtype_lkp benefit_checksubtype_lkp = fetchByActiveStatus_First(active,
				orderByComparator);

		if (benefit_checksubtype_lkp != null) {
			return benefit_checksubtype_lkp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefit_checksubtype_lkpException(msg.toString());
	}

	/**
	 * Returns the first benefit_checksubtype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit_checksubtype_lkp, or <code>null</code> if a matching benefit_checksubtype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp fetchByActiveStatus_First(boolean active,
		OrderByComparator orderByComparator) throws SystemException {
		List<benefit_checksubtype_lkp> list = findByActiveStatus(active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last benefit_checksubtype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit_checksubtype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a matching benefit_checksubtype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp findByActiveStatus_Last(boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchbenefit_checksubtype_lkpException, SystemException {
		benefit_checksubtype_lkp benefit_checksubtype_lkp = fetchByActiveStatus_Last(active,
				orderByComparator);

		if (benefit_checksubtype_lkp != null) {
			return benefit_checksubtype_lkp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefit_checksubtype_lkpException(msg.toString());
	}

	/**
	 * Returns the last benefit_checksubtype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit_checksubtype_lkp, or <code>null</code> if a matching benefit_checksubtype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp fetchByActiveStatus_Last(boolean active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByActiveStatus(active);

		List<benefit_checksubtype_lkp> list = findByActiveStatus(active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the benefit_checksubtype_lkps before and after the current benefit_checksubtype_lkp in the ordered set where active = &#63;.
	 *
	 * @param subbenefit_id the primary key of the current benefit_checksubtype_lkp
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit_checksubtype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checksubtype_lkpException if a benefit_checksubtype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checksubtype_lkp[] findByActiveStatus_PrevAndNext(
		long subbenefit_id, boolean active, OrderByComparator orderByComparator)
		throws NoSuchbenefit_checksubtype_lkpException, SystemException {
		benefit_checksubtype_lkp benefit_checksubtype_lkp = findByPrimaryKey(subbenefit_id);

		Session session = null;

		try {
			session = openSession();

			benefit_checksubtype_lkp[] array = new benefit_checksubtype_lkpImpl[3];

			array[0] = getByActiveStatus_PrevAndNext(session,
					benefit_checksubtype_lkp, active, orderByComparator, true);

			array[1] = benefit_checksubtype_lkp;

			array[2] = getByActiveStatus_PrevAndNext(session,
					benefit_checksubtype_lkp, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected benefit_checksubtype_lkp getByActiveStatus_PrevAndNext(
		Session session, benefit_checksubtype_lkp benefit_checksubtype_lkp,
		boolean active, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BENEFIT_CHECKSUBTYPE_LKP_WHERE);

		query.append(_FINDER_COLUMN_ACTIVESTATUS_ACTIVE_2);

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

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(benefit_checksubtype_lkp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<benefit_checksubtype_lkp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the benefit_checksubtype_lkps.
	 *
	 * @return the benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checksubtype_lkp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the benefit_checksubtype_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit_checksubtype_lkps
	 * @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	 * @return the range of benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checksubtype_lkp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefit_checksubtype_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit_checksubtype_lkps
	 * @param end the upper bound of the range of benefit_checksubtype_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checksubtype_lkp> findAll(int start, int end,
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

		List<benefit_checksubtype_lkp> list = (List<benefit_checksubtype_lkp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BENEFIT_CHECKSUBTYPE_LKP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BENEFIT_CHECKSUBTYPE_LKP;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<benefit_checksubtype_lkp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<benefit_checksubtype_lkp>)QueryUtil.list(q,
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
	 * Removes all the benefit_checksubtype_lkps where active = &#63; from the database.
	 *
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByActiveStatus(boolean active) throws SystemException {
		for (benefit_checksubtype_lkp benefit_checksubtype_lkp : findByActiveStatus(
				active)) {
			remove(benefit_checksubtype_lkp);
		}
	}

	/**
	 * Removes all the benefit_checksubtype_lkps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (benefit_checksubtype_lkp benefit_checksubtype_lkp : findAll()) {
			remove(benefit_checksubtype_lkp);
		}
	}

	/**
	 * Returns the number of benefit_checksubtype_lkps where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countByActiveStatus(boolean active) throws SystemException {
		Object[] finderArgs = new Object[] { active };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BENEFIT_CHECKSUBTYPE_LKP_WHERE);

			query.append(_FINDER_COLUMN_ACTIVESTATUS_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of benefit_checksubtype_lkps.
	 *
	 * @return the number of benefit_checksubtype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BENEFIT_CHECKSUBTYPE_LKP);

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
	 * Initializes the benefit_checksubtype_lkp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.benefit_checksubtype_lkp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<benefit_checksubtype_lkp>> listenersList = new ArrayList<ModelListener<benefit_checksubtype_lkp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<benefit_checksubtype_lkp>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(benefit_checksubtype_lkpImpl.class.getName());
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
	private static final String _SQL_SELECT_BENEFIT_CHECKSUBTYPE_LKP = "SELECT benefit_checksubtype_lkp FROM benefit_checksubtype_lkp benefit_checksubtype_lkp";
	private static final String _SQL_SELECT_BENEFIT_CHECKSUBTYPE_LKP_WHERE = "SELECT benefit_checksubtype_lkp FROM benefit_checksubtype_lkp benefit_checksubtype_lkp WHERE ";
	private static final String _SQL_COUNT_BENEFIT_CHECKSUBTYPE_LKP = "SELECT COUNT(benefit_checksubtype_lkp) FROM benefit_checksubtype_lkp benefit_checksubtype_lkp";
	private static final String _SQL_COUNT_BENEFIT_CHECKSUBTYPE_LKP_WHERE = "SELECT COUNT(benefit_checksubtype_lkp) FROM benefit_checksubtype_lkp benefit_checksubtype_lkp WHERE ";
	private static final String _FINDER_COLUMN_ACTIVESTATUS_ACTIVE_2 = "benefit_checksubtype_lkp.active = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "benefit_checksubtype_lkp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No benefit_checksubtype_lkp exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No benefit_checksubtype_lkp exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(benefit_checksubtype_lkpPersistenceImpl.class);
	private static benefit_checksubtype_lkp _nullbenefit_checksubtype_lkp = new benefit_checksubtype_lkpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<benefit_checksubtype_lkp> toCacheModel() {
				return _nullbenefit_checksubtype_lkpCacheModel;
			}
		};

	private static CacheModel<benefit_checksubtype_lkp> _nullbenefit_checksubtype_lkpCacheModel =
		new CacheModel<benefit_checksubtype_lkp>() {
			public benefit_checksubtype_lkp toEntityModel() {
				return _nullbenefit_checksubtype_lkp;
			}
		};
}