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

import com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException;
import com.iucn.whp.dbservice.model.benefit_checktype_lkp;
import com.iucn.whp.dbservice.model.impl.benefit_checktype_lkpImpl;
import com.iucn.whp.dbservice.model.impl.benefit_checktype_lkpModelImpl;

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
 * The persistence implementation for the benefit_checktype_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefit_checktype_lkpPersistence
 * @see benefit_checktype_lkpUtil
 * @generated
 */
public class benefit_checktype_lkpPersistenceImpl extends BasePersistenceImpl<benefit_checktype_lkp>
	implements benefit_checktype_lkpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link benefit_checktype_lkpUtil} to access the benefit_checktype_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = benefit_checktype_lkpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESTATUS =
		new FinderPath(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActiveStatus",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS =
		new FinderPath(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActiveStatus",
			new String[] { Boolean.class.getName() },
			benefit_checktype_lkpModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVESTATUS = new FinderPath(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActiveStatus",
			new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpModelImpl.FINDER_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the benefit_checktype_lkp in the entity cache if it is enabled.
	 *
	 * @param benefit_checktype_lkp the benefit_checktype_lkp
	 */
	public void cacheResult(benefit_checktype_lkp benefit_checktype_lkp) {
		EntityCacheUtil.putResult(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			benefit_checktype_lkp.getPrimaryKey(), benefit_checktype_lkp);

		benefit_checktype_lkp.resetOriginalValues();
	}

	/**
	 * Caches the benefit_checktype_lkps in the entity cache if it is enabled.
	 *
	 * @param benefit_checktype_lkps the benefit_checktype_lkps
	 */
	public void cacheResult(List<benefit_checktype_lkp> benefit_checktype_lkps) {
		for (benefit_checktype_lkp benefit_checktype_lkp : benefit_checktype_lkps) {
			if (EntityCacheUtil.getResult(
						benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
						benefit_checktype_lkpImpl.class,
						benefit_checktype_lkp.getPrimaryKey()) == null) {
				cacheResult(benefit_checktype_lkp);
			}
			else {
				benefit_checktype_lkp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all benefit_checktype_lkps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(benefit_checktype_lkpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(benefit_checktype_lkpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the benefit_checktype_lkp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(benefit_checktype_lkp benefit_checktype_lkp) {
		EntityCacheUtil.removeResult(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			benefit_checktype_lkp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<benefit_checktype_lkp> benefit_checktype_lkps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (benefit_checktype_lkp benefit_checktype_lkp : benefit_checktype_lkps) {
			EntityCacheUtil.removeResult(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
				benefit_checktype_lkpImpl.class,
				benefit_checktype_lkp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new benefit_checktype_lkp with the primary key. Does not add the benefit_checktype_lkp to the database.
	 *
	 * @param benefit_id the primary key for the new benefit_checktype_lkp
	 * @return the new benefit_checktype_lkp
	 */
	public benefit_checktype_lkp create(long benefit_id) {
		benefit_checktype_lkp benefit_checktype_lkp = new benefit_checktype_lkpImpl();

		benefit_checktype_lkp.setNew(true);
		benefit_checktype_lkp.setPrimaryKey(benefit_id);

		return benefit_checktype_lkp;
	}

	/**
	 * Removes the benefit_checktype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param benefit_id the primary key of the benefit_checktype_lkp
	 * @return the benefit_checktype_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp remove(long benefit_id)
		throws NoSuchbenefit_checktype_lkpException, SystemException {
		return remove(Long.valueOf(benefit_id));
	}

	/**
	 * Removes the benefit_checktype_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the benefit_checktype_lkp
	 * @return the benefit_checktype_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefit_checktype_lkp remove(Serializable primaryKey)
		throws NoSuchbenefit_checktype_lkpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			benefit_checktype_lkp benefit_checktype_lkp = (benefit_checktype_lkp)session.get(benefit_checktype_lkpImpl.class,
					primaryKey);

			if (benefit_checktype_lkp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbenefit_checktype_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(benefit_checktype_lkp);
		}
		catch (NoSuchbenefit_checktype_lkpException nsee) {
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
	protected benefit_checktype_lkp removeImpl(
		benefit_checktype_lkp benefit_checktype_lkp) throws SystemException {
		benefit_checktype_lkp = toUnwrappedModel(benefit_checktype_lkp);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, benefit_checktype_lkp);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(benefit_checktype_lkp);

		return benefit_checktype_lkp;
	}

	@Override
	public benefit_checktype_lkp updateImpl(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp,
		boolean merge) throws SystemException {
		benefit_checktype_lkp = toUnwrappedModel(benefit_checktype_lkp);

		boolean isNew = benefit_checktype_lkp.isNew();

		benefit_checktype_lkpModelImpl benefit_checktype_lkpModelImpl = (benefit_checktype_lkpModelImpl)benefit_checktype_lkp;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, benefit_checktype_lkp, merge);

			benefit_checktype_lkp.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !benefit_checktype_lkpModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((benefit_checktype_lkpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Boolean.valueOf(benefit_checktype_lkpModelImpl.getOriginalActive())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS,
					args);

				args = new Object[] {
						Boolean.valueOf(benefit_checktype_lkpModelImpl.getActive())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESTATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			benefit_checktype_lkpImpl.class,
			benefit_checktype_lkp.getPrimaryKey(), benefit_checktype_lkp);

		return benefit_checktype_lkp;
	}

	protected benefit_checktype_lkp toUnwrappedModel(
		benefit_checktype_lkp benefit_checktype_lkp) {
		if (benefit_checktype_lkp instanceof benefit_checktype_lkpImpl) {
			return benefit_checktype_lkp;
		}

		benefit_checktype_lkpImpl benefit_checktype_lkpImpl = new benefit_checktype_lkpImpl();

		benefit_checktype_lkpImpl.setNew(benefit_checktype_lkp.isNew());
		benefit_checktype_lkpImpl.setPrimaryKey(benefit_checktype_lkp.getPrimaryKey());

		benefit_checktype_lkpImpl.setBenefit_id(benefit_checktype_lkp.getBenefit_id());
		benefit_checktype_lkpImpl.setBenefit_checktype(benefit_checktype_lkp.getBenefit_checktype());
		benefit_checktype_lkpImpl.setActive(benefit_checktype_lkp.isActive());

		return benefit_checktype_lkpImpl;
	}

	/**
	 * Returns the benefit_checktype_lkp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the benefit_checktype_lkp
	 * @return the benefit_checktype_lkp
	 * @throws com.liferay.portal.NoSuchModelException if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefit_checktype_lkp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the benefit_checktype_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException} if it could not be found.
	 *
	 * @param benefit_id the primary key of the benefit_checktype_lkp
	 * @return the benefit_checktype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp findByPrimaryKey(long benefit_id)
		throws NoSuchbenefit_checktype_lkpException, SystemException {
		benefit_checktype_lkp benefit_checktype_lkp = fetchByPrimaryKey(benefit_id);

		if (benefit_checktype_lkp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + benefit_id);
			}

			throw new NoSuchbenefit_checktype_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				benefit_id);
		}

		return benefit_checktype_lkp;
	}

	/**
	 * Returns the benefit_checktype_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the benefit_checktype_lkp
	 * @return the benefit_checktype_lkp, or <code>null</code> if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefit_checktype_lkp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the benefit_checktype_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param benefit_id the primary key of the benefit_checktype_lkp
	 * @return the benefit_checktype_lkp, or <code>null</code> if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp fetchByPrimaryKey(long benefit_id)
		throws SystemException {
		benefit_checktype_lkp benefit_checktype_lkp = (benefit_checktype_lkp)EntityCacheUtil.getResult(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
				benefit_checktype_lkpImpl.class, benefit_id);

		if (benefit_checktype_lkp == _nullbenefit_checktype_lkp) {
			return null;
		}

		if (benefit_checktype_lkp == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				benefit_checktype_lkp = (benefit_checktype_lkp)session.get(benefit_checktype_lkpImpl.class,
						Long.valueOf(benefit_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (benefit_checktype_lkp != null) {
					cacheResult(benefit_checktype_lkp);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(benefit_checktype_lkpModelImpl.ENTITY_CACHE_ENABLED,
						benefit_checktype_lkpImpl.class, benefit_id,
						_nullbenefit_checktype_lkp);
				}

				closeSession(session);
			}
		}

		return benefit_checktype_lkp;
	}

	/**
	 * Returns all the benefit_checktype_lkps where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checktype_lkp> findByActiveStatus(boolean active)
		throws SystemException {
		return findByActiveStatus(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the benefit_checktype_lkps where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of benefit_checktype_lkps
	 * @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	 * @return the range of matching benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checktype_lkp> findByActiveStatus(boolean active,
		int start, int end) throws SystemException {
		return findByActiveStatus(active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefit_checktype_lkps where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of benefit_checktype_lkps
	 * @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checktype_lkp> findByActiveStatus(boolean active,
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

		List<benefit_checktype_lkp> list = (List<benefit_checktype_lkp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (benefit_checktype_lkp benefit_checktype_lkp : list) {
				if ((active != benefit_checktype_lkp.getActive())) {
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

			query.append(_SQL_SELECT_BENEFIT_CHECKTYPE_LKP_WHERE);

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

				list = (List<benefit_checktype_lkp>)QueryUtil.list(q,
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
	 * Returns the first benefit_checktype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit_checktype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a matching benefit_checktype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp findByActiveStatus_First(boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchbenefit_checktype_lkpException, SystemException {
		benefit_checktype_lkp benefit_checktype_lkp = fetchByActiveStatus_First(active,
				orderByComparator);

		if (benefit_checktype_lkp != null) {
			return benefit_checktype_lkp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefit_checktype_lkpException(msg.toString());
	}

	/**
	 * Returns the first benefit_checktype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit_checktype_lkp, or <code>null</code> if a matching benefit_checktype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp fetchByActiveStatus_First(boolean active,
		OrderByComparator orderByComparator) throws SystemException {
		List<benefit_checktype_lkp> list = findByActiveStatus(active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last benefit_checktype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit_checktype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a matching benefit_checktype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp findByActiveStatus_Last(boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchbenefit_checktype_lkpException, SystemException {
		benefit_checktype_lkp benefit_checktype_lkp = fetchByActiveStatus_Last(active,
				orderByComparator);

		if (benefit_checktype_lkp != null) {
			return benefit_checktype_lkp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefit_checktype_lkpException(msg.toString());
	}

	/**
	 * Returns the last benefit_checktype_lkp in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit_checktype_lkp, or <code>null</code> if a matching benefit_checktype_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp fetchByActiveStatus_Last(boolean active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByActiveStatus(active);

		List<benefit_checktype_lkp> list = findByActiveStatus(active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the benefit_checktype_lkps before and after the current benefit_checktype_lkp in the ordered set where active = &#63;.
	 *
	 * @param benefit_id the primary key of the current benefit_checktype_lkp
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit_checktype_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchbenefit_checktype_lkpException if a benefit_checktype_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefit_checktype_lkp[] findByActiveStatus_PrevAndNext(
		long benefit_id, boolean active, OrderByComparator orderByComparator)
		throws NoSuchbenefit_checktype_lkpException, SystemException {
		benefit_checktype_lkp benefit_checktype_lkp = findByPrimaryKey(benefit_id);

		Session session = null;

		try {
			session = openSession();

			benefit_checktype_lkp[] array = new benefit_checktype_lkpImpl[3];

			array[0] = getByActiveStatus_PrevAndNext(session,
					benefit_checktype_lkp, active, orderByComparator, true);

			array[1] = benefit_checktype_lkp;

			array[2] = getByActiveStatus_PrevAndNext(session,
					benefit_checktype_lkp, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected benefit_checktype_lkp getByActiveStatus_PrevAndNext(
		Session session, benefit_checktype_lkp benefit_checktype_lkp,
		boolean active, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BENEFIT_CHECKTYPE_LKP_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(benefit_checktype_lkp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<benefit_checktype_lkp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the benefit_checktype_lkps.
	 *
	 * @return the benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checktype_lkp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the benefit_checktype_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit_checktype_lkps
	 * @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	 * @return the range of benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checktype_lkp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefit_checktype_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit_checktype_lkps
	 * @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefit_checktype_lkp> findAll(int start, int end,
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

		List<benefit_checktype_lkp> list = (List<benefit_checktype_lkp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BENEFIT_CHECKTYPE_LKP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BENEFIT_CHECKTYPE_LKP;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<benefit_checktype_lkp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<benefit_checktype_lkp>)QueryUtil.list(q,
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
	 * Removes all the benefit_checktype_lkps where active = &#63; from the database.
	 *
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByActiveStatus(boolean active) throws SystemException {
		for (benefit_checktype_lkp benefit_checktype_lkp : findByActiveStatus(
				active)) {
			remove(benefit_checktype_lkp);
		}
	}

	/**
	 * Removes all the benefit_checktype_lkps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (benefit_checktype_lkp benefit_checktype_lkp : findAll()) {
			remove(benefit_checktype_lkp);
		}
	}

	/**
	 * Returns the number of benefit_checktype_lkps where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countByActiveStatus(boolean active) throws SystemException {
		Object[] finderArgs = new Object[] { active };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACTIVESTATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BENEFIT_CHECKTYPE_LKP_WHERE);

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
	 * Returns the number of benefit_checktype_lkps.
	 *
	 * @return the number of benefit_checktype_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BENEFIT_CHECKTYPE_LKP);

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
	 * Returns all the benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	 *
	 * @param pk the primary key of the benefit_checktype_lkp
	 * @return the benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		long pk) throws SystemException {
		return getbenefit_checksubtype_lkps(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the benefit_checktype_lkp
	 * @param start the lower bound of the range of benefit_checktype_lkps
	 * @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	 * @return the range of benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		long pk, int start, int end) throws SystemException {
		return getbenefit_checksubtype_lkps(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS = new FinderPath(com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefit_checksubtype_lkpPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbenefit_checksubtype_lkps",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the benefit_checktype_lkp
	 * @param start the lower bound of the range of benefit_checktype_lkps
	 * @param end the upper bound of the range of benefit_checktype_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> getbenefit_checksubtype_lkps(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> list = (List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp>)FinderCacheUtil.getResult(FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETBENEFIT_CHECKSUBTYPE_LKPS.concat(ORDER_BY_CLAUSE)
														   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETBENEFIT_CHECKSUBTYPE_LKPS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_benefit_checksubtype_lkp",
					com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS,
						finderArgs);
				}
				else {
					benefit_checksubtype_lkpPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefit_checksubtype_lkpPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbenefit_checksubtype_lkpsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of benefit_checksubtype_lkps associated with the benefit_checktype_lkp.
	 *
	 * @param pk the primary key of the benefit_checktype_lkp
	 * @return the number of benefit_checksubtype_lkps associated with the benefit_checktype_lkp
	 * @throws SystemException if a system exception occurred
	 */
	public int getbenefit_checksubtype_lkpsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETBENEFIT_CHECKSUBTYPE_LKPSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_BENEFIT_CHECKSUBTYPE_LKPS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_BENEFIT_CHECKSUBTYPE_LKP =
		new FinderPath(com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefit_checksubtype_lkpPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsbenefit_checksubtype_lkp",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the benefit_checksubtype_lkp is associated with the benefit_checktype_lkp.
	 *
	 * @param pk the primary key of the benefit_checktype_lkp
	 * @param benefit_checksubtype_lkpPK the primary key of the benefit_checksubtype_lkp
	 * @return <code>true</code> if the benefit_checksubtype_lkp is associated with the benefit_checktype_lkp; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbenefit_checksubtype_lkp(long pk,
		long benefit_checksubtype_lkpPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, benefit_checksubtype_lkpPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_BENEFIT_CHECKSUBTYPE_LKP,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsbenefit_checksubtype_lkp.contains(
							pk, benefit_checksubtype_lkpPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_BENEFIT_CHECKSUBTYPE_LKP,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the benefit_checktype_lkp has any benefit_checksubtype_lkps associated with it.
	 *
	 * @param pk the primary key of the benefit_checktype_lkp to check for associations with benefit_checksubtype_lkps
	 * @return <code>true</code> if the benefit_checktype_lkp has any benefit_checksubtype_lkps associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbenefit_checksubtype_lkps(long pk)
		throws SystemException {
		if (getbenefit_checksubtype_lkpsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the benefit_checktype_lkp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.benefit_checktype_lkp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<benefit_checktype_lkp>> listenersList = new ArrayList<ModelListener<benefit_checktype_lkp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<benefit_checktype_lkp>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsbenefit_checksubtype_lkp = new Containsbenefit_checksubtype_lkp();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(benefit_checktype_lkpImpl.class.getName());
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
	protected Containsbenefit_checksubtype_lkp containsbenefit_checksubtype_lkp;

	protected class Containsbenefit_checksubtype_lkp {
		protected Containsbenefit_checksubtype_lkp() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSBENEFIT_CHECKSUBTYPE_LKP,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long benefit_id, long subbenefit_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(benefit_id), new Long(subbenefit_id)
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

	private static final String _SQL_SELECT_BENEFIT_CHECKTYPE_LKP = "SELECT benefit_checktype_lkp FROM benefit_checktype_lkp benefit_checktype_lkp";
	private static final String _SQL_SELECT_BENEFIT_CHECKTYPE_LKP_WHERE = "SELECT benefit_checktype_lkp FROM benefit_checktype_lkp benefit_checktype_lkp WHERE ";
	private static final String _SQL_COUNT_BENEFIT_CHECKTYPE_LKP = "SELECT COUNT(benefit_checktype_lkp) FROM benefit_checktype_lkp benefit_checktype_lkp";
	private static final String _SQL_COUNT_BENEFIT_CHECKTYPE_LKP_WHERE = "SELECT COUNT(benefit_checktype_lkp) FROM benefit_checktype_lkp benefit_checktype_lkp WHERE ";
	private static final String _SQL_GETBENEFIT_CHECKSUBTYPE_LKPS = "SELECT {whp_benefit_checksubtype_lkp.*} FROM whp_benefit_checksubtype_lkp INNER JOIN whp_benefit_checktype_lkp ON (whp_benefit_checktype_lkp.benefit_id = whp_benefit_checksubtype_lkp.benefit_id) WHERE (whp_benefit_checktype_lkp.benefit_id = ?)";
	private static final String _SQL_GETBENEFIT_CHECKSUBTYPE_LKPSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_benefit_checksubtype_lkp WHERE benefit_id = ?";
	private static final String _SQL_CONTAINSBENEFIT_CHECKSUBTYPE_LKP = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_benefit_checksubtype_lkp WHERE benefit_id = ? AND subbenefit_id = ?";
	private static final String _FINDER_COLUMN_ACTIVESTATUS_ACTIVE_2 = "benefit_checktype_lkp.active = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "benefit_checktype_lkp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No benefit_checktype_lkp exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No benefit_checktype_lkp exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(benefit_checktype_lkpPersistenceImpl.class);
	private static benefit_checktype_lkp _nullbenefit_checktype_lkp = new benefit_checktype_lkpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<benefit_checktype_lkp> toCacheModel() {
				return _nullbenefit_checktype_lkpCacheModel;
			}
		};

	private static CacheModel<benefit_checktype_lkp> _nullbenefit_checktype_lkpCacheModel =
		new CacheModel<benefit_checktype_lkp>() {
			public benefit_checktype_lkp toEntityModel() {
				return _nullbenefit_checktype_lkp;
			}
		};
}