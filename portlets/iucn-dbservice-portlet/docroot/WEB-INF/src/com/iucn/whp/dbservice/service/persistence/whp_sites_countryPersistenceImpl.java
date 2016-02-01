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

import com.iucn.whp.dbservice.NoSuch_sites_countryException;
import com.iucn.whp.dbservice.model.impl.whp_sites_countryImpl;
import com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl;
import com.iucn.whp.dbservice.model.whp_sites_country;

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
 * The persistence implementation for the whp_sites_country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_countryPersistence
 * @see whp_sites_countryUtil
 * @generated
 */
public class whp_sites_countryPersistenceImpl extends BasePersistenceImpl<whp_sites_country>
	implements whp_sites_countryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link whp_sites_countryUtil} to access the whp_sites_country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = whp_sites_countryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COUNTRYID =
		new FinderPath(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycountryid",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID =
		new FinderPath(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycountryid",
			new String[] { Integer.class.getName() },
			whp_sites_countryModelImpl.COUNTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COUNTRYID = new FinderPath(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycountryid",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			whp_sites_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the whp_sites_country in the entity cache if it is enabled.
	 *
	 * @param whp_sites_country the whp_sites_country
	 */
	public void cacheResult(whp_sites_country whp_sites_country) {
		EntityCacheUtil.putResult(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryImpl.class, whp_sites_country.getPrimaryKey(),
			whp_sites_country);

		whp_sites_country.resetOriginalValues();
	}

	/**
	 * Caches the whp_sites_countries in the entity cache if it is enabled.
	 *
	 * @param whp_sites_countries the whp_sites_countries
	 */
	public void cacheResult(List<whp_sites_country> whp_sites_countries) {
		for (whp_sites_country whp_sites_country : whp_sites_countries) {
			if (EntityCacheUtil.getResult(
						whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
						whp_sites_countryImpl.class,
						whp_sites_country.getPrimaryKey()) == null) {
				cacheResult(whp_sites_country);
			}
			else {
				whp_sites_country.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all whp_sites_countries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(whp_sites_countryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(whp_sites_countryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the whp_sites_country.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(whp_sites_country whp_sites_country) {
		EntityCacheUtil.removeResult(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryImpl.class, whp_sites_country.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<whp_sites_country> whp_sites_countries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (whp_sites_country whp_sites_country : whp_sites_countries) {
			EntityCacheUtil.removeResult(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
				whp_sites_countryImpl.class, whp_sites_country.getPrimaryKey());
		}
	}

	/**
	 * Creates a new whp_sites_country with the primary key. Does not add the whp_sites_country to the database.
	 *
	 * @param whp_sites_country_id the primary key for the new whp_sites_country
	 * @return the new whp_sites_country
	 */
	public whp_sites_country create(long whp_sites_country_id) {
		whp_sites_country whp_sites_country = new whp_sites_countryImpl();

		whp_sites_country.setNew(true);
		whp_sites_country.setPrimaryKey(whp_sites_country_id);

		return whp_sites_country;
	}

	/**
	 * Removes the whp_sites_country with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param whp_sites_country_id the primary key of the whp_sites_country
	 * @return the whp_sites_country that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country remove(long whp_sites_country_id)
		throws NoSuch_sites_countryException, SystemException {
		return remove(Long.valueOf(whp_sites_country_id));
	}

	/**
	 * Removes the whp_sites_country with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the whp_sites_country
	 * @return the whp_sites_country that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_country remove(Serializable primaryKey)
		throws NoSuch_sites_countryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			whp_sites_country whp_sites_country = (whp_sites_country)session.get(whp_sites_countryImpl.class,
					primaryKey);

			if (whp_sites_country == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_sites_countryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(whp_sites_country);
		}
		catch (NoSuch_sites_countryException nsee) {
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
	protected whp_sites_country removeImpl(whp_sites_country whp_sites_country)
		throws SystemException {
		whp_sites_country = toUnwrappedModel(whp_sites_country);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, whp_sites_country);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(whp_sites_country);

		return whp_sites_country;
	}

	@Override
	public whp_sites_country updateImpl(
		com.iucn.whp.dbservice.model.whp_sites_country whp_sites_country,
		boolean merge) throws SystemException {
		whp_sites_country = toUnwrappedModel(whp_sites_country);

		boolean isNew = whp_sites_country.isNew();

		whp_sites_countryModelImpl whp_sites_countryModelImpl = (whp_sites_countryModelImpl)whp_sites_country;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, whp_sites_country, merge);

			whp_sites_country.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !whp_sites_countryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((whp_sites_countryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(whp_sites_countryModelImpl.getOriginalCountryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID,
					args);

				args = new Object[] {
						Integer.valueOf(whp_sites_countryModelImpl.getCountryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID,
					args);
			}
		}

		EntityCacheUtil.putResult(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			whp_sites_countryImpl.class, whp_sites_country.getPrimaryKey(),
			whp_sites_country);

		return whp_sites_country;
	}

	protected whp_sites_country toUnwrappedModel(
		whp_sites_country whp_sites_country) {
		if (whp_sites_country instanceof whp_sites_countryImpl) {
			return whp_sites_country;
		}

		whp_sites_countryImpl whp_sites_countryImpl = new whp_sites_countryImpl();

		whp_sites_countryImpl.setNew(whp_sites_country.isNew());
		whp_sites_countryImpl.setPrimaryKey(whp_sites_country.getPrimaryKey());

		whp_sites_countryImpl.setWhp_sites_country_id(whp_sites_country.getWhp_sites_country_id());
		whp_sites_countryImpl.setSite_id(whp_sites_country.getSite_id());
		whp_sites_countryImpl.setCountryid(whp_sites_country.getCountryid());

		return whp_sites_countryImpl;
	}

	/**
	 * Returns the whp_sites_country with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites_country
	 * @return the whp_sites_country
	 * @throws com.liferay.portal.NoSuchModelException if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_country findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sites_countryException} if it could not be found.
	 *
	 * @param whp_sites_country_id the primary key of the whp_sites_country
	 * @return the whp_sites_country
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country findByPrimaryKey(long whp_sites_country_id)
		throws NoSuch_sites_countryException, SystemException {
		whp_sites_country whp_sites_country = fetchByPrimaryKey(whp_sites_country_id);

		if (whp_sites_country == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					whp_sites_country_id);
			}

			throw new NoSuch_sites_countryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				whp_sites_country_id);
		}

		return whp_sites_country;
	}

	/**
	 * Returns the whp_sites_country with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites_country
	 * @return the whp_sites_country, or <code>null</code> if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites_country fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites_country with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param whp_sites_country_id the primary key of the whp_sites_country
	 * @return the whp_sites_country, or <code>null</code> if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country fetchByPrimaryKey(long whp_sites_country_id)
		throws SystemException {
		whp_sites_country whp_sites_country = (whp_sites_country)EntityCacheUtil.getResult(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
				whp_sites_countryImpl.class, whp_sites_country_id);

		if (whp_sites_country == _nullwhp_sites_country) {
			return null;
		}

		if (whp_sites_country == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				whp_sites_country = (whp_sites_country)session.get(whp_sites_countryImpl.class,
						Long.valueOf(whp_sites_country_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (whp_sites_country != null) {
					cacheResult(whp_sites_country);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
						whp_sites_countryImpl.class, whp_sites_country_id,
						_nullwhp_sites_country);
				}

				closeSession(session);
			}
		}

		return whp_sites_country;
	}

	/**
	 * Returns all the whp_sites_countries where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @return the matching whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_country> findBycountryid(int countryid)
		throws SystemException {
		return findBycountryid(countryid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the whp_sites_countries where countryid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param countryid the countryid
	 * @param start the lower bound of the range of whp_sites_countries
	 * @param end the upper bound of the range of whp_sites_countries (not inclusive)
	 * @return the range of matching whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_country> findBycountryid(int countryid, int start,
		int end) throws SystemException {
		return findBycountryid(countryid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_countries where countryid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param countryid the countryid
	 * @param start the lower bound of the range of whp_sites_countries
	 * @param end the upper bound of the range of whp_sites_countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_country> findBycountryid(int countryid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRYID;
			finderArgs = new Object[] { countryid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COUNTRYID;
			finderArgs = new Object[] { countryid, start, end, orderByComparator };
		}

		List<whp_sites_country> list = (List<whp_sites_country>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (whp_sites_country whp_sites_country : list) {
				if ((countryid != whp_sites_country.getCountryid())) {
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

			query.append(_SQL_SELECT_WHP_SITES_COUNTRY_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

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

				qPos.add(countryid);

				list = (List<whp_sites_country>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first whp_sites_country in the ordered set where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites_country
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a matching whp_sites_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country findBycountryid_First(int countryid,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_countryException, SystemException {
		whp_sites_country whp_sites_country = fetchBycountryid_First(countryid,
				orderByComparator);

		if (whp_sites_country != null) {
			return whp_sites_country;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("countryid=");
		msg.append(countryid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sites_countryException(msg.toString());
	}

	/**
	 * Returns the first whp_sites_country in the ordered set where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites_country, or <code>null</code> if a matching whp_sites_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country fetchBycountryid_First(int countryid,
		OrderByComparator orderByComparator) throws SystemException {
		List<whp_sites_country> list = findBycountryid(countryid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last whp_sites_country in the ordered set where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites_country
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a matching whp_sites_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country findBycountryid_Last(int countryid,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_countryException, SystemException {
		whp_sites_country whp_sites_country = fetchBycountryid_Last(countryid,
				orderByComparator);

		if (whp_sites_country != null) {
			return whp_sites_country;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("countryid=");
		msg.append(countryid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sites_countryException(msg.toString());
	}

	/**
	 * Returns the last whp_sites_country in the ordered set where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites_country, or <code>null</code> if a matching whp_sites_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country fetchBycountryid_Last(int countryid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycountryid(countryid);

		List<whp_sites_country> list = findBycountryid(countryid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the whp_sites_countries before and after the current whp_sites_country in the ordered set where countryid = &#63;.
	 *
	 * @param whp_sites_country_id the primary key of the current whp_sites_country
	 * @param countryid the countryid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next whp_sites_country
	 * @throws com.iucn.whp.dbservice.NoSuch_sites_countryException if a whp_sites_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites_country[] findBycountryid_PrevAndNext(
		long whp_sites_country_id, int countryid,
		OrderByComparator orderByComparator)
		throws NoSuch_sites_countryException, SystemException {
		whp_sites_country whp_sites_country = findByPrimaryKey(whp_sites_country_id);

		Session session = null;

		try {
			session = openSession();

			whp_sites_country[] array = new whp_sites_countryImpl[3];

			array[0] = getBycountryid_PrevAndNext(session, whp_sites_country,
					countryid, orderByComparator, true);

			array[1] = whp_sites_country;

			array[2] = getBycountryid_PrevAndNext(session, whp_sites_country,
					countryid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected whp_sites_country getBycountryid_PrevAndNext(Session session,
		whp_sites_country whp_sites_country, int countryid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WHP_SITES_COUNTRY_WHERE);

		query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

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

		qPos.add(countryid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(whp_sites_country);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<whp_sites_country> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the whp_sites_countries.
	 *
	 * @return the whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_country> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_sites_countries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_sites_countries
	 * @param end the upper bound of the range of whp_sites_countries (not inclusive)
	 * @return the range of whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_country> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_countries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_sites_countries
	 * @param end the upper bound of the range of whp_sites_countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites_country> findAll(int start, int end,
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

		List<whp_sites_country> list = (List<whp_sites_country>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WHP_SITES_COUNTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WHP_SITES_COUNTRY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<whp_sites_country>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<whp_sites_country>)QueryUtil.list(q,
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
	 * Removes all the whp_sites_countries where countryid = &#63; from the database.
	 *
	 * @param countryid the countryid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBycountryid(int countryid) throws SystemException {
		for (whp_sites_country whp_sites_country : findBycountryid(countryid)) {
			remove(whp_sites_country);
		}
	}

	/**
	 * Removes all the whp_sites_countries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (whp_sites_country whp_sites_country : findAll()) {
			remove(whp_sites_country);
		}
	}

	/**
	 * Returns the number of whp_sites_countries where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @return the number of matching whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public int countBycountryid(int countryid) throws SystemException {
		Object[] finderArgs = new Object[] { countryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COUNTRYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_COUNTRY_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COUNTRYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_sites_countries.
	 *
	 * @return the number of whp_sites_countries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WHP_SITES_COUNTRY);

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
	 * Initializes the whp_sites_country persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.whp_sites_country")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<whp_sites_country>> listenersList = new ArrayList<ModelListener<whp_sites_country>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<whp_sites_country>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(whp_sites_countryImpl.class.getName());
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
	private static final String _SQL_SELECT_WHP_SITES_COUNTRY = "SELECT whp_sites_country FROM whp_sites_country whp_sites_country";
	private static final String _SQL_SELECT_WHP_SITES_COUNTRY_WHERE = "SELECT whp_sites_country FROM whp_sites_country whp_sites_country WHERE ";
	private static final String _SQL_COUNT_WHP_SITES_COUNTRY = "SELECT COUNT(whp_sites_country) FROM whp_sites_country whp_sites_country";
	private static final String _SQL_COUNT_WHP_SITES_COUNTRY_WHERE = "SELECT COUNT(whp_sites_country) FROM whp_sites_country whp_sites_country WHERE ";
	private static final String _FINDER_COLUMN_COUNTRYID_COUNTRYID_2 = "whp_sites_country.countryid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "whp_sites_country.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No whp_sites_country exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No whp_sites_country exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(whp_sites_countryPersistenceImpl.class);
	private static whp_sites_country _nullwhp_sites_country = new whp_sites_countryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<whp_sites_country> toCacheModel() {
				return _nullwhp_sites_countryCacheModel;
			}
		};

	private static CacheModel<whp_sites_country> _nullwhp_sites_countryCacheModel =
		new CacheModel<whp_sites_country>() {
			public whp_sites_country toEntityModel() {
				return _nullwhp_sites_country;
			}
		};
}