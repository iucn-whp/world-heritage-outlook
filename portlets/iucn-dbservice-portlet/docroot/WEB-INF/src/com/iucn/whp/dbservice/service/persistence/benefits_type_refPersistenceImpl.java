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

import com.iucn.whp.dbservice.NoSuchbenefits_type_refException;
import com.iucn.whp.dbservice.model.benefits_type_ref;
import com.iucn.whp.dbservice.model.impl.benefits_type_refImpl;
import com.iucn.whp.dbservice.model.impl.benefits_type_refModelImpl;

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
 * The persistence implementation for the benefits_type_ref service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see benefits_type_refPersistence
 * @see benefits_type_refUtil
 * @generated
 */
public class benefits_type_refPersistenceImpl extends BasePersistenceImpl<benefits_type_ref>
	implements benefits_type_refPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link benefits_type_refUtil} to access the benefits_type_ref persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = benefits_type_refImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BYBENEFITS_ID =
		new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED,
			benefits_type_refImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByByBenefits_id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYBENEFITS_ID =
		new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED,
			benefits_type_refImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByByBenefits_id",
			new String[] { Long.class.getName() },
			benefits_type_refModelImpl.BENEFITS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BYBENEFITS_ID = new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByByBenefits_id",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID = new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED,
			benefits_type_refImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytypeId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID =
		new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED,
			benefits_type_refImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytypeId",
			new String[] { Long.class.getName(), Long.class.getName() },
			benefits_type_refModelImpl.BENEFITS_ID_COLUMN_BITMASK |
			benefits_type_refModelImpl.BENEFIT_CHECKTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPEID = new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytypeId",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED,
			benefits_type_refImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED,
			benefits_type_refImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the benefits_type_ref in the entity cache if it is enabled.
	 *
	 * @param benefits_type_ref the benefits_type_ref
	 */
	public void cacheResult(benefits_type_ref benefits_type_ref) {
		EntityCacheUtil.putResult(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refImpl.class, benefits_type_ref.getPrimaryKey(),
			benefits_type_ref);

		benefits_type_ref.resetOriginalValues();
	}

	/**
	 * Caches the benefits_type_refs in the entity cache if it is enabled.
	 *
	 * @param benefits_type_refs the benefits_type_refs
	 */
	public void cacheResult(List<benefits_type_ref> benefits_type_refs) {
		for (benefits_type_ref benefits_type_ref : benefits_type_refs) {
			if (EntityCacheUtil.getResult(
						benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
						benefits_type_refImpl.class,
						benefits_type_ref.getPrimaryKey()) == null) {
				cacheResult(benefits_type_ref);
			}
			else {
				benefits_type_ref.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all benefits_type_refs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(benefits_type_refImpl.class.getName());
		}

		EntityCacheUtil.clearCache(benefits_type_refImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the benefits_type_ref.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(benefits_type_ref benefits_type_ref) {
		EntityCacheUtil.removeResult(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refImpl.class, benefits_type_ref.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<benefits_type_ref> benefits_type_refs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (benefits_type_ref benefits_type_ref : benefits_type_refs) {
			EntityCacheUtil.removeResult(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
				benefits_type_refImpl.class, benefits_type_ref.getPrimaryKey());
		}
	}

	/**
	 * Creates a new benefits_type_ref with the primary key. Does not add the benefits_type_ref to the database.
	 *
	 * @param benefits_type_ref_id the primary key for the new benefits_type_ref
	 * @return the new benefits_type_ref
	 */
	public benefits_type_ref create(long benefits_type_ref_id) {
		benefits_type_ref benefits_type_ref = new benefits_type_refImpl();

		benefits_type_ref.setNew(true);
		benefits_type_ref.setPrimaryKey(benefits_type_ref_id);

		return benefits_type_ref;
	}

	/**
	 * Removes the benefits_type_ref with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param benefits_type_ref_id the primary key of the benefits_type_ref
	 * @return the benefits_type_ref that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref remove(long benefits_type_ref_id)
		throws NoSuchbenefits_type_refException, SystemException {
		return remove(Long.valueOf(benefits_type_ref_id));
	}

	/**
	 * Removes the benefits_type_ref with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the benefits_type_ref
	 * @return the benefits_type_ref that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefits_type_ref remove(Serializable primaryKey)
		throws NoSuchbenefits_type_refException, SystemException {
		Session session = null;

		try {
			session = openSession();

			benefits_type_ref benefits_type_ref = (benefits_type_ref)session.get(benefits_type_refImpl.class,
					primaryKey);

			if (benefits_type_ref == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbenefits_type_refException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(benefits_type_ref);
		}
		catch (NoSuchbenefits_type_refException nsee) {
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
	protected benefits_type_ref removeImpl(benefits_type_ref benefits_type_ref)
		throws SystemException {
		benefits_type_ref = toUnwrappedModel(benefits_type_ref);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, benefits_type_ref);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(benefits_type_ref);

		return benefits_type_ref;
	}

	@Override
	public benefits_type_ref updateImpl(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref,
		boolean merge) throws SystemException {
		benefits_type_ref = toUnwrappedModel(benefits_type_ref);

		boolean isNew = benefits_type_ref.isNew();

		benefits_type_refModelImpl benefits_type_refModelImpl = (benefits_type_refModelImpl)benefits_type_ref;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, benefits_type_ref, merge);

			benefits_type_ref.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !benefits_type_refModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((benefits_type_refModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYBENEFITS_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(benefits_type_refModelImpl.getOriginalBenefits_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BYBENEFITS_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYBENEFITS_ID,
					args);

				args = new Object[] {
						Long.valueOf(benefits_type_refModelImpl.getBenefits_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BYBENEFITS_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYBENEFITS_ID,
					args);
			}

			if ((benefits_type_refModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(benefits_type_refModelImpl.getOriginalBenefits_id()),
						Long.valueOf(benefits_type_refModelImpl.getOriginalBenefit_checktype())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
					args);

				args = new Object[] {
						Long.valueOf(benefits_type_refModelImpl.getBenefits_id()),
						Long.valueOf(benefits_type_refModelImpl.getBenefit_checktype())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
					args);
			}
		}

		EntityCacheUtil.putResult(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
			benefits_type_refImpl.class, benefits_type_ref.getPrimaryKey(),
			benefits_type_ref);

		return benefits_type_ref;
	}

	protected benefits_type_ref toUnwrappedModel(
		benefits_type_ref benefits_type_ref) {
		if (benefits_type_ref instanceof benefits_type_refImpl) {
			return benefits_type_ref;
		}

		benefits_type_refImpl benefits_type_refImpl = new benefits_type_refImpl();

		benefits_type_refImpl.setNew(benefits_type_ref.isNew());
		benefits_type_refImpl.setPrimaryKey(benefits_type_ref.getPrimaryKey());

		benefits_type_refImpl.setBenefits_type_ref_id(benefits_type_ref.getBenefits_type_ref_id());
		benefits_type_refImpl.setBenefits_id(benefits_type_ref.getBenefits_id());
		benefits_type_refImpl.setBenefit_checktype(benefits_type_ref.getBenefit_checktype());
		benefits_type_refImpl.setBenefit_checksubtype(benefits_type_ref.getBenefit_checksubtype());

		return benefits_type_refImpl;
	}

	/**
	 * Returns the benefits_type_ref with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the benefits_type_ref
	 * @return the benefits_type_ref
	 * @throws com.liferay.portal.NoSuchModelException if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefits_type_ref findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the benefits_type_ref with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchbenefits_type_refException} if it could not be found.
	 *
	 * @param benefits_type_ref_id the primary key of the benefits_type_ref
	 * @return the benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref findByPrimaryKey(long benefits_type_ref_id)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = fetchByPrimaryKey(benefits_type_ref_id);

		if (benefits_type_ref == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					benefits_type_ref_id);
			}

			throw new NoSuchbenefits_type_refException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				benefits_type_ref_id);
		}

		return benefits_type_ref;
	}

	/**
	 * Returns the benefits_type_ref with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the benefits_type_ref
	 * @return the benefits_type_ref, or <code>null</code> if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public benefits_type_ref fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the benefits_type_ref with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param benefits_type_ref_id the primary key of the benefits_type_ref
	 * @return the benefits_type_ref, or <code>null</code> if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref fetchByPrimaryKey(long benefits_type_ref_id)
		throws SystemException {
		benefits_type_ref benefits_type_ref = (benefits_type_ref)EntityCacheUtil.getResult(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
				benefits_type_refImpl.class, benefits_type_ref_id);

		if (benefits_type_ref == _nullbenefits_type_ref) {
			return null;
		}

		if (benefits_type_ref == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				benefits_type_ref = (benefits_type_ref)session.get(benefits_type_refImpl.class,
						Long.valueOf(benefits_type_ref_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (benefits_type_ref != null) {
					cacheResult(benefits_type_ref);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(benefits_type_refModelImpl.ENTITY_CACHE_ENABLED,
						benefits_type_refImpl.class, benefits_type_ref_id,
						_nullbenefits_type_ref);
				}

				closeSession(session);
			}
		}

		return benefits_type_ref;
	}

	/**
	 * Returns all the benefits_type_refs where benefits_id = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @return the matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findByByBenefits_id(long benefits_id)
		throws SystemException {
		return findByByBenefits_id(benefits_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the benefits_type_refs where benefits_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param benefits_id the benefits_id
	 * @param start the lower bound of the range of benefits_type_refs
	 * @param end the upper bound of the range of benefits_type_refs (not inclusive)
	 * @return the range of matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findByByBenefits_id(long benefits_id,
		int start, int end) throws SystemException {
		return findByByBenefits_id(benefits_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefits_type_refs where benefits_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param benefits_id the benefits_id
	 * @param start the lower bound of the range of benefits_type_refs
	 * @param end the upper bound of the range of benefits_type_refs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findByByBenefits_id(long benefits_id,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYBENEFITS_ID;
			finderArgs = new Object[] { benefits_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BYBENEFITS_ID;
			finderArgs = new Object[] { benefits_id, start, end, orderByComparator };
		}

		List<benefits_type_ref> list = (List<benefits_type_ref>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (benefits_type_ref benefits_type_ref : list) {
				if ((benefits_id != benefits_type_ref.getBenefits_id())) {
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

			query.append(_SQL_SELECT_BENEFITS_TYPE_REF_WHERE);

			query.append(_FINDER_COLUMN_BYBENEFITS_ID_BENEFITS_ID_2);

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

				qPos.add(benefits_id);

				list = (List<benefits_type_ref>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first benefits_type_ref in the ordered set where benefits_id = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref findByByBenefits_id_First(long benefits_id,
		OrderByComparator orderByComparator)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = fetchByByBenefits_id_First(benefits_id,
				orderByComparator);

		if (benefits_type_ref != null) {
			return benefits_type_ref;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("benefits_id=");
		msg.append(benefits_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefits_type_refException(msg.toString());
	}

	/**
	 * Returns the first benefits_type_ref in the ordered set where benefits_id = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref fetchByByBenefits_id_First(long benefits_id,
		OrderByComparator orderByComparator) throws SystemException {
		List<benefits_type_ref> list = findByByBenefits_id(benefits_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last benefits_type_ref in the ordered set where benefits_id = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref findByByBenefits_id_Last(long benefits_id,
		OrderByComparator orderByComparator)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = fetchByByBenefits_id_Last(benefits_id,
				orderByComparator);

		if (benefits_type_ref != null) {
			return benefits_type_ref;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("benefits_id=");
		msg.append(benefits_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefits_type_refException(msg.toString());
	}

	/**
	 * Returns the last benefits_type_ref in the ordered set where benefits_id = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref fetchByByBenefits_id_Last(long benefits_id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByByBenefits_id(benefits_id);

		List<benefits_type_ref> list = findByByBenefits_id(benefits_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the benefits_type_refs before and after the current benefits_type_ref in the ordered set where benefits_id = &#63;.
	 *
	 * @param benefits_type_ref_id the primary key of the current benefits_type_ref
	 * @param benefits_id the benefits_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref[] findByByBenefits_id_PrevAndNext(
		long benefits_type_ref_id, long benefits_id,
		OrderByComparator orderByComparator)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = findByPrimaryKey(benefits_type_ref_id);

		Session session = null;

		try {
			session = openSession();

			benefits_type_ref[] array = new benefits_type_refImpl[3];

			array[0] = getByByBenefits_id_PrevAndNext(session,
					benefits_type_ref, benefits_id, orderByComparator, true);

			array[1] = benefits_type_ref;

			array[2] = getByByBenefits_id_PrevAndNext(session,
					benefits_type_ref, benefits_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected benefits_type_ref getByByBenefits_id_PrevAndNext(
		Session session, benefits_type_ref benefits_type_ref, long benefits_id,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BENEFITS_TYPE_REF_WHERE);

		query.append(_FINDER_COLUMN_BYBENEFITS_ID_BENEFITS_ID_2);

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

		qPos.add(benefits_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(benefits_type_ref);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<benefits_type_ref> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @return the matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findBytypeId(long benefits_id,
		long benefit_checktype) throws SystemException {
		return findBytypeId(benefits_id, benefit_checktype, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param start the lower bound of the range of benefits_type_refs
	 * @param end the upper bound of the range of benefits_type_refs (not inclusive)
	 * @return the range of matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findBytypeId(long benefits_id,
		long benefit_checktype, int start, int end) throws SystemException {
		return findBytypeId(benefits_id, benefit_checktype, start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param start the lower bound of the range of benefits_type_refs
	 * @param end the upper bound of the range of benefits_type_refs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findBytypeId(long benefits_id,
		long benefit_checktype, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID;
			finderArgs = new Object[] { benefits_id, benefit_checktype };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID;
			finderArgs = new Object[] {
					benefits_id, benefit_checktype,
					
					start, end, orderByComparator
				};
		}

		List<benefits_type_ref> list = (List<benefits_type_ref>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (benefits_type_ref benefits_type_ref : list) {
				if ((benefits_id != benefits_type_ref.getBenefits_id()) ||
						(benefit_checktype != benefits_type_ref.getBenefit_checktype())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BENEFITS_TYPE_REF_WHERE);

			query.append(_FINDER_COLUMN_TYPEID_BENEFITS_ID_2);

			query.append(_FINDER_COLUMN_TYPEID_BENEFIT_CHECKTYPE_2);

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

				qPos.add(benefits_id);

				qPos.add(benefit_checktype);

				list = (List<benefits_type_ref>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref findBytypeId_First(long benefits_id,
		long benefit_checktype, OrderByComparator orderByComparator)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = fetchBytypeId_First(benefits_id,
				benefit_checktype, orderByComparator);

		if (benefits_type_ref != null) {
			return benefits_type_ref;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("benefits_id=");
		msg.append(benefits_id);

		msg.append(", benefit_checktype=");
		msg.append(benefit_checktype);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefits_type_refException(msg.toString());
	}

	/**
	 * Returns the first benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref fetchBytypeId_First(long benefits_id,
		long benefit_checktype, OrderByComparator orderByComparator)
		throws SystemException {
		List<benefits_type_ref> list = findBytypeId(benefits_id,
				benefit_checktype, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref findBytypeId_Last(long benefits_id,
		long benefit_checktype, OrderByComparator orderByComparator)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = fetchBytypeId_Last(benefits_id,
				benefit_checktype, orderByComparator);

		if (benefits_type_ref != null) {
			return benefits_type_ref;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("benefits_id=");
		msg.append(benefits_id);

		msg.append(", benefit_checktype=");
		msg.append(benefit_checktype);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbenefits_type_refException(msg.toString());
	}

	/**
	 * Returns the last benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefits_type_ref, or <code>null</code> if a matching benefits_type_ref could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref fetchBytypeId_Last(long benefits_id,
		long benefit_checktype, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBytypeId(benefits_id, benefit_checktype);

		List<benefits_type_ref> list = findBytypeId(benefits_id,
				benefit_checktype, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the benefits_type_refs before and after the current benefits_type_ref in the ordered set where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_type_ref_id the primary key of the current benefits_type_ref
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefits_type_ref
	 * @throws com.iucn.whp.dbservice.NoSuchbenefits_type_refException if a benefits_type_ref with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public benefits_type_ref[] findBytypeId_PrevAndNext(
		long benefits_type_ref_id, long benefits_id, long benefit_checktype,
		OrderByComparator orderByComparator)
		throws NoSuchbenefits_type_refException, SystemException {
		benefits_type_ref benefits_type_ref = findByPrimaryKey(benefits_type_ref_id);

		Session session = null;

		try {
			session = openSession();

			benefits_type_ref[] array = new benefits_type_refImpl[3];

			array[0] = getBytypeId_PrevAndNext(session, benefits_type_ref,
					benefits_id, benefit_checktype, orderByComparator, true);

			array[1] = benefits_type_ref;

			array[2] = getBytypeId_PrevAndNext(session, benefits_type_ref,
					benefits_id, benefit_checktype, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected benefits_type_ref getBytypeId_PrevAndNext(Session session,
		benefits_type_ref benefits_type_ref, long benefits_id,
		long benefit_checktype, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BENEFITS_TYPE_REF_WHERE);

		query.append(_FINDER_COLUMN_TYPEID_BENEFITS_ID_2);

		query.append(_FINDER_COLUMN_TYPEID_BENEFIT_CHECKTYPE_2);

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

		qPos.add(benefits_id);

		qPos.add(benefit_checktype);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(benefits_type_ref);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<benefits_type_ref> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the benefits_type_refs.
	 *
	 * @return the benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the benefits_type_refs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefits_type_refs
	 * @param end the upper bound of the range of benefits_type_refs (not inclusive)
	 * @return the range of benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the benefits_type_refs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefits_type_refs
	 * @param end the upper bound of the range of benefits_type_refs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public List<benefits_type_ref> findAll(int start, int end,
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

		List<benefits_type_ref> list = (List<benefits_type_ref>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BENEFITS_TYPE_REF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BENEFITS_TYPE_REF;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<benefits_type_ref>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<benefits_type_ref>)QueryUtil.list(q,
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
	 * Removes all the benefits_type_refs where benefits_id = &#63; from the database.
	 *
	 * @param benefits_id the benefits_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByByBenefits_id(long benefits_id)
		throws SystemException {
		for (benefits_type_ref benefits_type_ref : findByByBenefits_id(
				benefits_id)) {
			remove(benefits_type_ref);
		}
	}

	/**
	 * Removes all the benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63; from the database.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBytypeId(long benefits_id, long benefit_checktype)
		throws SystemException {
		for (benefits_type_ref benefits_type_ref : findBytypeId(benefits_id,
				benefit_checktype)) {
			remove(benefits_type_ref);
		}
	}

	/**
	 * Removes all the benefits_type_refs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (benefits_type_ref benefits_type_ref : findAll()) {
			remove(benefits_type_ref);
		}
	}

	/**
	 * Returns the number of benefits_type_refs where benefits_id = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @return the number of matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByByBenefits_id(long benefits_id) throws SystemException {
		Object[] finderArgs = new Object[] { benefits_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BYBENEFITS_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BENEFITS_TYPE_REF_WHERE);

			query.append(_FINDER_COLUMN_BYBENEFITS_ID_BENEFITS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(benefits_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BYBENEFITS_ID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of benefits_type_refs where benefits_id = &#63; and benefit_checktype = &#63;.
	 *
	 * @param benefits_id the benefits_id
	 * @param benefit_checktype the benefit_checktype
	 * @return the number of matching benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public int countBytypeId(long benefits_id, long benefit_checktype)
		throws SystemException {
		Object[] finderArgs = new Object[] { benefits_id, benefit_checktype };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TYPEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BENEFITS_TYPE_REF_WHERE);

			query.append(_FINDER_COLUMN_TYPEID_BENEFITS_ID_2);

			query.append(_FINDER_COLUMN_TYPEID_BENEFIT_CHECKTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(benefits_id);

				qPos.add(benefit_checktype);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TYPEID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of benefits_type_refs.
	 *
	 * @return the number of benefits_type_refs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BENEFITS_TYPE_REF);

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
	 * Initializes the benefits_type_ref persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.benefits_type_ref")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<benefits_type_ref>> listenersList = new ArrayList<ModelListener<benefits_type_ref>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<benefits_type_ref>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(benefits_type_refImpl.class.getName());
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
	private static final String _SQL_SELECT_BENEFITS_TYPE_REF = "SELECT benefits_type_ref FROM benefits_type_ref benefits_type_ref";
	private static final String _SQL_SELECT_BENEFITS_TYPE_REF_WHERE = "SELECT benefits_type_ref FROM benefits_type_ref benefits_type_ref WHERE ";
	private static final String _SQL_COUNT_BENEFITS_TYPE_REF = "SELECT COUNT(benefits_type_ref) FROM benefits_type_ref benefits_type_ref";
	private static final String _SQL_COUNT_BENEFITS_TYPE_REF_WHERE = "SELECT COUNT(benefits_type_ref) FROM benefits_type_ref benefits_type_ref WHERE ";
	private static final String _FINDER_COLUMN_BYBENEFITS_ID_BENEFITS_ID_2 = "benefits_type_ref.benefits_id = ?";
	private static final String _FINDER_COLUMN_TYPEID_BENEFITS_ID_2 = "benefits_type_ref.benefits_id = ? AND ";
	private static final String _FINDER_COLUMN_TYPEID_BENEFIT_CHECKTYPE_2 = "benefits_type_ref.benefit_checktype = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "benefits_type_ref.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No benefits_type_ref exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No benefits_type_ref exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(benefits_type_refPersistenceImpl.class);
	private static benefits_type_ref _nullbenefits_type_ref = new benefits_type_refImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<benefits_type_ref> toCacheModel() {
				return _nullbenefits_type_refCacheModel;
			}
		};

	private static CacheModel<benefits_type_ref> _nullbenefits_type_refCacheModel =
		new CacheModel<benefits_type_ref>() {
			public benefits_type_ref toEntityModel() {
				return _nullbenefits_type_ref;
			}
		};
}