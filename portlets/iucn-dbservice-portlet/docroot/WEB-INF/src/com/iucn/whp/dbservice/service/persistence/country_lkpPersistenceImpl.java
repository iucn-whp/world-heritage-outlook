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

import com.iucn.whp.dbservice.NoSuchcountry_lkpException;
import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.impl.country_lkpImpl;
import com.iucn.whp.dbservice.model.impl.country_lkpModelImpl;

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
import com.liferay.portal.kernel.util.Validator;
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
 * The persistence implementation for the country_lkp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see country_lkpPersistence
 * @see country_lkpUtil
 * @generated
 */
public class country_lkpPersistenceImpl extends BasePersistenceImpl<country_lkp>
	implements country_lkpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link country_lkpUtil} to access the country_lkp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = country_lkpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_NAME = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, country_lkpImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByName",
			new String[] { String.class.getName() },
			country_lkpModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_A2 = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, country_lkpImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByA2",
			new String[] { String.class.getName() },
			country_lkpModelImpl.A2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A2 = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA2",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_A3 = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, country_lkpImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByA3",
			new String[] { String.class.getName() },
			country_lkpModelImpl.A3_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A3 = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA3",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, country_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, country_lkpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the country_lkp in the entity cache if it is enabled.
	 *
	 * @param country_lkp the country_lkp
	 */
	public void cacheResult(country_lkp country_lkp) {
		EntityCacheUtil.putResult(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpImpl.class, country_lkp.getPrimaryKey(), country_lkp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] { country_lkp.getName() }, country_lkp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A2,
			new Object[] { country_lkp.getA2() }, country_lkp);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A3,
			new Object[] { country_lkp.getA3() }, country_lkp);

		country_lkp.resetOriginalValues();
	}

	/**
	 * Caches the country_lkps in the entity cache if it is enabled.
	 *
	 * @param country_lkps the country_lkps
	 */
	public void cacheResult(List<country_lkp> country_lkps) {
		for (country_lkp country_lkp : country_lkps) {
			if (EntityCacheUtil.getResult(
						country_lkpModelImpl.ENTITY_CACHE_ENABLED,
						country_lkpImpl.class, country_lkp.getPrimaryKey()) == null) {
				cacheResult(country_lkp);
			}
			else {
				country_lkp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all country_lkps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(country_lkpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(country_lkpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the country_lkp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(country_lkp country_lkp) {
		EntityCacheUtil.removeResult(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpImpl.class, country_lkp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(country_lkp);
	}

	@Override
	public void clearCache(List<country_lkp> country_lkps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (country_lkp country_lkp : country_lkps) {
			EntityCacheUtil.removeResult(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
				country_lkpImpl.class, country_lkp.getPrimaryKey());

			clearUniqueFindersCache(country_lkp);
		}
	}

	protected void clearUniqueFindersCache(country_lkp country_lkp) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] { country_lkp.getName() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A2,
			new Object[] { country_lkp.getA2() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A3,
			new Object[] { country_lkp.getA3() });
	}

	/**
	 * Creates a new country_lkp with the primary key. Does not add the country_lkp to the database.
	 *
	 * @param countryid the primary key for the new country_lkp
	 * @return the new country_lkp
	 */
	public country_lkp create(int countryid) {
		country_lkp country_lkp = new country_lkpImpl();

		country_lkp.setNew(true);
		country_lkp.setPrimaryKey(countryid);

		return country_lkp;
	}

	/**
	 * Removes the country_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param countryid the primary key of the country_lkp
	 * @return the country_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp remove(int countryid)
		throws NoSuchcountry_lkpException, SystemException {
		return remove(Integer.valueOf(countryid));
	}

	/**
	 * Removes the country_lkp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the country_lkp
	 * @return the country_lkp that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public country_lkp remove(Serializable primaryKey)
		throws NoSuchcountry_lkpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			country_lkp country_lkp = (country_lkp)session.get(country_lkpImpl.class,
					primaryKey);

			if (country_lkp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcountry_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(country_lkp);
		}
		catch (NoSuchcountry_lkpException nsee) {
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
	protected country_lkp removeImpl(country_lkp country_lkp)
		throws SystemException {
		country_lkp = toUnwrappedModel(country_lkp);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, country_lkp);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(country_lkp);

		return country_lkp;
	}

	@Override
	public country_lkp updateImpl(
		com.iucn.whp.dbservice.model.country_lkp country_lkp, boolean merge)
		throws SystemException {
		country_lkp = toUnwrappedModel(country_lkp);

		boolean isNew = country_lkp.isNew();

		country_lkpModelImpl country_lkpModelImpl = (country_lkpModelImpl)country_lkp;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, country_lkp, merge);

			country_lkp.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !country_lkpModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
			country_lkpImpl.class, country_lkp.getPrimaryKey(), country_lkp);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
				new Object[] { country_lkp.getName() }, country_lkp);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A2,
				new Object[] { country_lkp.getA2() }, country_lkp);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A3,
				new Object[] { country_lkp.getA3() }, country_lkp);
		}
		else {
			if ((country_lkpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						country_lkpModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
					new Object[] { country_lkp.getName() }, country_lkp);
			}

			if ((country_lkpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_A2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						country_lkpModelImpl.getOriginalA2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A2, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A2, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A2,
					new Object[] { country_lkp.getA2() }, country_lkp);
			}

			if ((country_lkpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_A3.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						country_lkpModelImpl.getOriginalA3()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A3, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A3, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A3,
					new Object[] { country_lkp.getA3() }, country_lkp);
			}
		}

		return country_lkp;
	}

	protected country_lkp toUnwrappedModel(country_lkp country_lkp) {
		if (country_lkp instanceof country_lkpImpl) {
			return country_lkp;
		}

		country_lkpImpl country_lkpImpl = new country_lkpImpl();

		country_lkpImpl.setNew(country_lkp.isNew());
		country_lkpImpl.setPrimaryKey(country_lkp.getPrimaryKey());

		country_lkpImpl.setCountryid(country_lkp.getCountryid());
		country_lkpImpl.setName(country_lkp.getName());
		country_lkpImpl.setA2(country_lkp.getA2());
		country_lkpImpl.setA3(country_lkp.getA3());
		country_lkpImpl.setNumber(country_lkp.getNumber());
		country_lkpImpl.setIdd(country_lkp.getIdd());
		country_lkpImpl.setCurrency(country_lkp.getCurrency());
		country_lkpImpl.setZiprequired(country_lkp.isZiprequired());
		country_lkpImpl.setActive(country_lkp.isActive());

		return country_lkpImpl;
	}

	/**
	 * Returns the country_lkp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the country_lkp
	 * @return the country_lkp
	 * @throws com.liferay.portal.NoSuchModelException if a country_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public country_lkp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the country_lkp with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	 *
	 * @param countryid the primary key of the country_lkp
	 * @return the country_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a country_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp findByPrimaryKey(int countryid)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = fetchByPrimaryKey(countryid);

		if (country_lkp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + countryid);
			}

			throw new NoSuchcountry_lkpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				countryid);
		}

		return country_lkp;
	}

	/**
	 * Returns the country_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the country_lkp
	 * @return the country_lkp, or <code>null</code> if a country_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public country_lkp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the country_lkp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param countryid the primary key of the country_lkp
	 * @return the country_lkp, or <code>null</code> if a country_lkp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByPrimaryKey(int countryid)
		throws SystemException {
		country_lkp country_lkp = (country_lkp)EntityCacheUtil.getResult(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
				country_lkpImpl.class, countryid);

		if (country_lkp == _nullcountry_lkp) {
			return null;
		}

		if (country_lkp == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				country_lkp = (country_lkp)session.get(country_lkpImpl.class,
						Integer.valueOf(countryid));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (country_lkp != null) {
					cacheResult(country_lkp);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(country_lkpModelImpl.ENTITY_CACHE_ENABLED,
						country_lkpImpl.class, countryid, _nullcountry_lkp);
				}

				closeSession(session);
			}
		}

		return country_lkp;
	}

	/**
	 * Returns the country_lkp where name = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	 *
	 * @param name the name
	 * @return the matching country_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp findByName(String name)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = fetchByName(name);

		if (country_lkp == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchcountry_lkpException(msg.toString());
		}

		return country_lkp;
	}

	/**
	 * Returns the country_lkp where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByName(String name) throws SystemException {
		return fetchByName(name, true);
	}

	/**
	 * Returns the country_lkp where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByName(String name, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { name };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_NAME,
					finderArgs, this);
		}

		if (result instanceof country_lkp) {
			country_lkp country_lkp = (country_lkp)result;

			if (!Validator.equals(name, country_lkp.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_COUNTRY_LKP_WHERE);

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_NAME_NAME_2);
				}
			}

			query.append(country_lkpModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (name != null) {
					qPos.add(name);
				}

				List<country_lkp> list = q.list();

				result = list;

				country_lkp country_lkp = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
						finderArgs, list);
				}
				else {
					country_lkp = list.get(0);

					cacheResult(country_lkp);

					if ((country_lkp.getName() == null) ||
							!country_lkp.getName().equals(name)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
							finderArgs, country_lkp);
					}
				}

				return country_lkp;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
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
				return (country_lkp)result;
			}
		}
	}

	/**
	 * Returns the country_lkp where a2 = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	 *
	 * @param a2 the a2
	 * @return the matching country_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp findByA2(String a2)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = fetchByA2(a2);

		if (country_lkp == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("a2=");
			msg.append(a2);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchcountry_lkpException(msg.toString());
		}

		return country_lkp;
	}

	/**
	 * Returns the country_lkp where a2 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param a2 the a2
	 * @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByA2(String a2) throws SystemException {
		return fetchByA2(a2, true);
	}

	/**
	 * Returns the country_lkp where a2 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param a2 the a2
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByA2(String a2, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { a2 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_A2,
					finderArgs, this);
		}

		if (result instanceof country_lkp) {
			country_lkp country_lkp = (country_lkp)result;

			if (!Validator.equals(a2, country_lkp.getA2())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_COUNTRY_LKP_WHERE);

			if (a2 == null) {
				query.append(_FINDER_COLUMN_A2_A2_1);
			}
			else {
				if (a2.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A2_A2_3);
				}
				else {
					query.append(_FINDER_COLUMN_A2_A2_2);
				}
			}

			query.append(country_lkpModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (a2 != null) {
					qPos.add(a2);
				}

				List<country_lkp> list = q.list();

				result = list;

				country_lkp country_lkp = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A2,
						finderArgs, list);
				}
				else {
					country_lkp = list.get(0);

					cacheResult(country_lkp);

					if ((country_lkp.getA2() == null) ||
							!country_lkp.getA2().equals(a2)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A2,
							finderArgs, country_lkp);
					}
				}

				return country_lkp;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A2,
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
				return (country_lkp)result;
			}
		}
	}

	/**
	 * Returns the country_lkp where a3 = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchcountry_lkpException} if it could not be found.
	 *
	 * @param a3 the a3
	 * @return the matching country_lkp
	 * @throws com.iucn.whp.dbservice.NoSuchcountry_lkpException if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp findByA3(String a3)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = fetchByA3(a3);

		if (country_lkp == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("a3=");
			msg.append(a3);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchcountry_lkpException(msg.toString());
		}

		return country_lkp;
	}

	/**
	 * Returns the country_lkp where a3 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param a3 the a3
	 * @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByA3(String a3) throws SystemException {
		return fetchByA3(a3, true);
	}

	/**
	 * Returns the country_lkp where a3 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param a3 the a3
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching country_lkp, or <code>null</code> if a matching country_lkp could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp fetchByA3(String a3, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { a3 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_A3,
					finderArgs, this);
		}

		if (result instanceof country_lkp) {
			country_lkp country_lkp = (country_lkp)result;

			if (!Validator.equals(a3, country_lkp.getA3())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_COUNTRY_LKP_WHERE);

			if (a3 == null) {
				query.append(_FINDER_COLUMN_A3_A3_1);
			}
			else {
				if (a3.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A3_A3_3);
				}
				else {
					query.append(_FINDER_COLUMN_A3_A3_2);
				}
			}

			query.append(country_lkpModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (a3 != null) {
					qPos.add(a3);
				}

				List<country_lkp> list = q.list();

				result = list;

				country_lkp country_lkp = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A3,
						finderArgs, list);
				}
				else {
					country_lkp = list.get(0);

					cacheResult(country_lkp);

					if ((country_lkp.getA3() == null) ||
							!country_lkp.getA3().equals(a3)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A3,
							finderArgs, country_lkp);
					}
				}

				return country_lkp;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A3,
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
				return (country_lkp)result;
			}
		}
	}

	/**
	 * Returns all the country_lkps.
	 *
	 * @return the country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<country_lkp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the country_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of country_lkps
	 * @param end the upper bound of the range of country_lkps (not inclusive)
	 * @return the range of country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<country_lkp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the country_lkps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of country_lkps
	 * @param end the upper bound of the range of country_lkps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public List<country_lkp> findAll(int start, int end,
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

		List<country_lkp> list = (List<country_lkp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COUNTRY_LKP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COUNTRY_LKP.concat(country_lkpModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<country_lkp>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<country_lkp>)QueryUtil.list(q, getDialect(),
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
	 * Removes the country_lkp where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the country_lkp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp removeByName(String name)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = findByName(name);

		return remove(country_lkp);
	}

	/**
	 * Removes the country_lkp where a2 = &#63; from the database.
	 *
	 * @param a2 the a2
	 * @return the country_lkp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp removeByA2(String a2)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = findByA2(a2);

		return remove(country_lkp);
	}

	/**
	 * Removes the country_lkp where a3 = &#63; from the database.
	 *
	 * @param a3 the a3
	 * @return the country_lkp that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public country_lkp removeByA3(String a3)
		throws NoSuchcountry_lkpException, SystemException {
		country_lkp country_lkp = findByA3(a3);

		return remove(country_lkp);
	}

	/**
	 * Removes all the country_lkps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (country_lkp country_lkp : findAll()) {
			remove(country_lkp);
		}
	}

	/**
	 * Returns the number of country_lkps where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countByName(String name) throws SystemException {
		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_NAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COUNTRY_LKP_WHERE);

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NAME_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_NAME_NAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (name != null) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of country_lkps where a2 = &#63;.
	 *
	 * @param a2 the a2
	 * @return the number of matching country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countByA2(String a2) throws SystemException {
		Object[] finderArgs = new Object[] { a2 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_A2,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COUNTRY_LKP_WHERE);

			if (a2 == null) {
				query.append(_FINDER_COLUMN_A2_A2_1);
			}
			else {
				if (a2.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A2_A2_3);
				}
				else {
					query.append(_FINDER_COLUMN_A2_A2_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (a2 != null) {
					qPos.add(a2);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A2, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of country_lkps where a3 = &#63;.
	 *
	 * @param a3 the a3
	 * @return the number of matching country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countByA3(String a3) throws SystemException {
		Object[] finderArgs = new Object[] { a3 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_A3,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COUNTRY_LKP_WHERE);

			if (a3 == null) {
				query.append(_FINDER_COLUMN_A3_A3_1);
			}
			else {
				if (a3.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A3_A3_3);
				}
				else {
					query.append(_FINDER_COLUMN_A3_A3_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (a3 != null) {
					qPos.add(a3);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A3, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of country_lkps.
	 *
	 * @return the number of country_lkps
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COUNTRY_LKP);

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
	 * Initializes the country_lkp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.country_lkp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<country_lkp>> listenersList = new ArrayList<ModelListener<country_lkp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<country_lkp>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(country_lkpImpl.class.getName());
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
	private static final String _SQL_SELECT_COUNTRY_LKP = "SELECT country_lkp FROM country_lkp country_lkp";
	private static final String _SQL_SELECT_COUNTRY_LKP_WHERE = "SELECT country_lkp FROM country_lkp country_lkp WHERE ";
	private static final String _SQL_COUNT_COUNTRY_LKP = "SELECT COUNT(country_lkp) FROM country_lkp country_lkp";
	private static final String _SQL_COUNT_COUNTRY_LKP_WHERE = "SELECT COUNT(country_lkp) FROM country_lkp country_lkp WHERE ";
	private static final String _FINDER_COLUMN_NAME_NAME_1 = "country_lkp.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "country_lkp.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(country_lkp.name IS NULL OR country_lkp.name = ?)";
	private static final String _FINDER_COLUMN_A2_A2_1 = "country_lkp.a2 IS NULL";
	private static final String _FINDER_COLUMN_A2_A2_2 = "country_lkp.a2 = ?";
	private static final String _FINDER_COLUMN_A2_A2_3 = "(country_lkp.a2 IS NULL OR country_lkp.a2 = ?)";
	private static final String _FINDER_COLUMN_A3_A3_1 = "country_lkp.a3 IS NULL";
	private static final String _FINDER_COLUMN_A3_A3_2 = "country_lkp.a3 = ?";
	private static final String _FINDER_COLUMN_A3_A3_3 = "(country_lkp.a3 IS NULL OR country_lkp.a3 = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "country_lkp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No country_lkp exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No country_lkp exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(country_lkpPersistenceImpl.class);
	private static country_lkp _nullcountry_lkp = new country_lkpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<country_lkp> toCacheModel() {
				return _nullcountry_lkpCacheModel;
			}
		};

	private static CacheModel<country_lkp> _nullcountry_lkpCacheModel = new CacheModel<country_lkp>() {
			public country_lkp toEntityModel() {
				return _nullcountry_lkp;
			}
		};
}