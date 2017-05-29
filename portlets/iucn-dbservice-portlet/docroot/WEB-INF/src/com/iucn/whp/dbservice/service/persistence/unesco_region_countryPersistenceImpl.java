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

import com.iucn.whp.dbservice.NoSuchunesco_region_countryException;
import com.iucn.whp.dbservice.model.impl.unesco_region_countryImpl;
import com.iucn.whp.dbservice.model.impl.unesco_region_countryModelImpl;
import com.iucn.whp.dbservice.model.unesco_region_country;

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
 * The persistence implementation for the unesco_region_country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see unesco_region_countryPersistence
 * @see unesco_region_countryUtil
 * @generated
 */
public class unesco_region_countryPersistenceImpl extends BasePersistenceImpl<unesco_region_country>
	implements unesco_region_countryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link unesco_region_countryUtil} to access the unesco_region_country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = unesco_region_countryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_COUNTRYID = new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED,
			unesco_region_countryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycountryid", new String[] { Integer.class.getName() },
			unesco_region_countryModelImpl.COUNTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COUNTRYID = new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycountryid",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UNESCOREGIONID =
		new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByunescoregionid",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNESCOREGIONID =
		new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByunescoregionid",
			new String[] { Integer.class.getName() },
			unesco_region_countryModelImpl.UNESCO_REGION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UNESCOREGIONID = new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByunescoregionid",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the unesco_region_country in the entity cache if it is enabled.
	 *
	 * @param unesco_region_country the unesco_region_country
	 */
	public void cacheResult(unesco_region_country unesco_region_country) {
		EntityCacheUtil.putResult(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			unesco_region_country.getPrimaryKey(), unesco_region_country);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID,
			new Object[] { Integer.valueOf(unesco_region_country.getCountryid()) },
			unesco_region_country);

		unesco_region_country.resetOriginalValues();
	}

	/**
	 * Caches the unesco_region_countries in the entity cache if it is enabled.
	 *
	 * @param unesco_region_countries the unesco_region_countries
	 */
	public void cacheResult(List<unesco_region_country> unesco_region_countries) {
		for (unesco_region_country unesco_region_country : unesco_region_countries) {
			if (EntityCacheUtil.getResult(
						unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
						unesco_region_countryImpl.class,
						unesco_region_country.getPrimaryKey()) == null) {
				cacheResult(unesco_region_country);
			}
			else {
				unesco_region_country.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all unesco_region_countries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(unesco_region_countryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(unesco_region_countryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the unesco_region_country.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(unesco_region_country unesco_region_country) {
		EntityCacheUtil.removeResult(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			unesco_region_country.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(unesco_region_country);
	}

	@Override
	public void clearCache(List<unesco_region_country> unesco_region_countries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (unesco_region_country unesco_region_country : unesco_region_countries) {
			EntityCacheUtil.removeResult(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
				unesco_region_countryImpl.class,
				unesco_region_country.getPrimaryKey());

			clearUniqueFindersCache(unesco_region_country);
		}
	}

	protected void clearUniqueFindersCache(
		unesco_region_country unesco_region_country) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COUNTRYID,
			new Object[] { Integer.valueOf(unesco_region_country.getCountryid()) });
	}

	/**
	 * Creates a new unesco_region_country with the primary key. Does not add the unesco_region_country to the database.
	 *
	 * @param whp_unesco_region_country_id the primary key for the new unesco_region_country
	 * @return the new unesco_region_country
	 */
	public unesco_region_country create(int whp_unesco_region_country_id) {
		unesco_region_country unesco_region_country = new unesco_region_countryImpl();

		unesco_region_country.setNew(true);
		unesco_region_country.setPrimaryKey(whp_unesco_region_country_id);

		return unesco_region_country;
	}

	/**
	 * Removes the unesco_region_country with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param whp_unesco_region_country_id the primary key of the unesco_region_country
	 * @return the unesco_region_country that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country remove(int whp_unesco_region_country_id)
		throws NoSuchunesco_region_countryException, SystemException {
		return remove(Integer.valueOf(whp_unesco_region_country_id));
	}

	/**
	 * Removes the unesco_region_country with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unesco_region_country
	 * @return the unesco_region_country that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public unesco_region_country remove(Serializable primaryKey)
		throws NoSuchunesco_region_countryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			unesco_region_country unesco_region_country = (unesco_region_country)session.get(unesco_region_countryImpl.class,
					primaryKey);

			if (unesco_region_country == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchunesco_region_countryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(unesco_region_country);
		}
		catch (NoSuchunesco_region_countryException nsee) {
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
	protected unesco_region_country removeImpl(
		unesco_region_country unesco_region_country) throws SystemException {
		unesco_region_country = toUnwrappedModel(unesco_region_country);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, unesco_region_country);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(unesco_region_country);

		return unesco_region_country;
	}

	@Override
	public unesco_region_country updateImpl(
		com.iucn.whp.dbservice.model.unesco_region_country unesco_region_country,
		boolean merge) throws SystemException {
		unesco_region_country = toUnwrappedModel(unesco_region_country);

		boolean isNew = unesco_region_country.isNew();

		unesco_region_countryModelImpl unesco_region_countryModelImpl = (unesco_region_countryModelImpl)unesco_region_country;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, unesco_region_country, merge);

			unesco_region_country.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !unesco_region_countryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((unesco_region_countryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNESCOREGIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(unesco_region_countryModelImpl.getOriginalUnesco_region_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNESCOREGIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNESCOREGIONID,
					args);

				args = new Object[] {
						Integer.valueOf(unesco_region_countryModelImpl.getUnesco_region_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNESCOREGIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNESCOREGIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
			unesco_region_countryImpl.class,
			unesco_region_country.getPrimaryKey(), unesco_region_country);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID,
				new Object[] {
					Integer.valueOf(unesco_region_country.getCountryid())
				}, unesco_region_country);
		}
		else {
			if ((unesco_region_countryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_COUNTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(unesco_region_countryModelImpl.getOriginalCountryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRYID,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COUNTRYID,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID,
					new Object[] {
						Integer.valueOf(unesco_region_country.getCountryid())
					}, unesco_region_country);
			}
		}

		return unesco_region_country;
	}

	protected unesco_region_country toUnwrappedModel(
		unesco_region_country unesco_region_country) {
		if (unesco_region_country instanceof unesco_region_countryImpl) {
			return unesco_region_country;
		}

		unesco_region_countryImpl unesco_region_countryImpl = new unesco_region_countryImpl();

		unesco_region_countryImpl.setNew(unesco_region_country.isNew());
		unesco_region_countryImpl.setPrimaryKey(unesco_region_country.getPrimaryKey());

		unesco_region_countryImpl.setWhp_unesco_region_country_id(unesco_region_country.getWhp_unesco_region_country_id());
		unesco_region_countryImpl.setCountryid(unesco_region_country.getCountryid());
		unesco_region_countryImpl.setUnesco_region_id(unesco_region_country.getUnesco_region_id());

		return unesco_region_countryImpl;
	}

	/**
	 * Returns the unesco_region_country with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the unesco_region_country
	 * @return the unesco_region_country
	 * @throws com.liferay.portal.NoSuchModelException if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public unesco_region_country findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the unesco_region_country with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_region_countryException} if it could not be found.
	 *
	 * @param whp_unesco_region_country_id the primary key of the unesco_region_country
	 * @return the unesco_region_country
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country findByPrimaryKey(
		int whp_unesco_region_country_id)
		throws NoSuchunesco_region_countryException, SystemException {
		unesco_region_country unesco_region_country = fetchByPrimaryKey(whp_unesco_region_country_id);

		if (unesco_region_country == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					whp_unesco_region_country_id);
			}

			throw new NoSuchunesco_region_countryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				whp_unesco_region_country_id);
		}

		return unesco_region_country;
	}

	/**
	 * Returns the unesco_region_country with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unesco_region_country
	 * @return the unesco_region_country, or <code>null</code> if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public unesco_region_country fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the unesco_region_country with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param whp_unesco_region_country_id the primary key of the unesco_region_country
	 * @return the unesco_region_country, or <code>null</code> if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country fetchByPrimaryKey(
		int whp_unesco_region_country_id) throws SystemException {
		unesco_region_country unesco_region_country = (unesco_region_country)EntityCacheUtil.getResult(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
				unesco_region_countryImpl.class, whp_unesco_region_country_id);

		if (unesco_region_country == _nullunesco_region_country) {
			return null;
		}

		if (unesco_region_country == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				unesco_region_country = (unesco_region_country)session.get(unesco_region_countryImpl.class,
						Integer.valueOf(whp_unesco_region_country_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (unesco_region_country != null) {
					cacheResult(unesco_region_country);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(unesco_region_countryModelImpl.ENTITY_CACHE_ENABLED,
						unesco_region_countryImpl.class,
						whp_unesco_region_country_id, _nullunesco_region_country);
				}

				closeSession(session);
			}
		}

		return unesco_region_country;
	}

	/**
	 * Returns the unesco_region_country where countryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchunesco_region_countryException} if it could not be found.
	 *
	 * @param countryid the countryid
	 * @return the matching unesco_region_country
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country findBycountryid(int countryid)
		throws NoSuchunesco_region_countryException, SystemException {
		unesco_region_country unesco_region_country = fetchBycountryid(countryid);

		if (unesco_region_country == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("countryid=");
			msg.append(countryid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchunesco_region_countryException(msg.toString());
		}

		return unesco_region_country;
	}

	/**
	 * Returns the unesco_region_country where countryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param countryid the countryid
	 * @return the matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country fetchBycountryid(int countryid)
		throws SystemException {
		return fetchBycountryid(countryid, true);
	}

	/**
	 * Returns the unesco_region_country where countryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param countryid the countryid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country fetchBycountryid(int countryid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { countryid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_COUNTRYID,
					finderArgs, this);
		}

		if (result instanceof unesco_region_country) {
			unesco_region_country unesco_region_country = (unesco_region_country)result;

			if ((countryid != unesco_region_country.getCountryid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_UNESCO_REGION_COUNTRY_WHERE);

			query.append(_FINDER_COLUMN_COUNTRYID_COUNTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(countryid);

				List<unesco_region_country> list = q.list();

				result = list;

				unesco_region_country unesco_region_country = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID,
						finderArgs, list);
				}
				else {
					unesco_region_country = list.get(0);

					cacheResult(unesco_region_country);

					if ((unesco_region_country.getCountryid() != countryid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COUNTRYID,
							finderArgs, unesco_region_country);
					}
				}

				return unesco_region_country;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COUNTRYID,
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
				return (unesco_region_country)result;
			}
		}
	}

	/**
	 * Returns all the unesco_region_countries where unesco_region_id = &#63;.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @return the matching unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<unesco_region_country> findByunescoregionid(
		int unesco_region_id) throws SystemException {
		return findByunescoregionid(unesco_region_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unesco_region_countries where unesco_region_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @param start the lower bound of the range of unesco_region_countries
	 * @param end the upper bound of the range of unesco_region_countries (not inclusive)
	 * @return the range of matching unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<unesco_region_country> findByunescoregionid(
		int unesco_region_id, int start, int end) throws SystemException {
		return findByunescoregionid(unesco_region_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the unesco_region_countries where unesco_region_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @param start the lower bound of the range of unesco_region_countries
	 * @param end the upper bound of the range of unesco_region_countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<unesco_region_country> findByunescoregionid(
		int unesco_region_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNESCOREGIONID;
			finderArgs = new Object[] { unesco_region_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UNESCOREGIONID;
			finderArgs = new Object[] {
					unesco_region_id,
					
					start, end, orderByComparator
				};
		}

		List<unesco_region_country> list = (List<unesco_region_country>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (unesco_region_country unesco_region_country : list) {
				if ((unesco_region_id != unesco_region_country.getUnesco_region_id())) {
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

			query.append(_SQL_SELECT_UNESCO_REGION_COUNTRY_WHERE);

			query.append(_FINDER_COLUMN_UNESCOREGIONID_UNESCO_REGION_ID_2);

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

				qPos.add(unesco_region_id);

				list = (List<unesco_region_country>)QueryUtil.list(q,
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
	 * Returns the first unesco_region_country in the ordered set where unesco_region_id = &#63;.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unesco_region_country
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country findByunescoregionid_First(
		int unesco_region_id, OrderByComparator orderByComparator)
		throws NoSuchunesco_region_countryException, SystemException {
		unesco_region_country unesco_region_country = fetchByunescoregionid_First(unesco_region_id,
				orderByComparator);

		if (unesco_region_country != null) {
			return unesco_region_country;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("unesco_region_id=");
		msg.append(unesco_region_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchunesco_region_countryException(msg.toString());
	}

	/**
	 * Returns the first unesco_region_country in the ordered set where unesco_region_id = &#63;.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country fetchByunescoregionid_First(
		int unesco_region_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<unesco_region_country> list = findByunescoregionid(unesco_region_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last unesco_region_country in the ordered set where unesco_region_id = &#63;.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unesco_region_country
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country findByunescoregionid_Last(
		int unesco_region_id, OrderByComparator orderByComparator)
		throws NoSuchunesco_region_countryException, SystemException {
		unesco_region_country unesco_region_country = fetchByunescoregionid_Last(unesco_region_id,
				orderByComparator);

		if (unesco_region_country != null) {
			return unesco_region_country;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("unesco_region_id=");
		msg.append(unesco_region_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchunesco_region_countryException(msg.toString());
	}

	/**
	 * Returns the last unesco_region_country in the ordered set where unesco_region_id = &#63;.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unesco_region_country, or <code>null</code> if a matching unesco_region_country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country fetchByunescoregionid_Last(
		int unesco_region_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByunescoregionid(unesco_region_id);

		List<unesco_region_country> list = findByunescoregionid(unesco_region_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the unesco_region_countries before and after the current unesco_region_country in the ordered set where unesco_region_id = &#63;.
	 *
	 * @param whp_unesco_region_country_id the primary key of the current unesco_region_country
	 * @param unesco_region_id the unesco_region_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unesco_region_country
	 * @throws com.iucn.whp.dbservice.NoSuchunesco_region_countryException if a unesco_region_country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country[] findByunescoregionid_PrevAndNext(
		int whp_unesco_region_country_id, int unesco_region_id,
		OrderByComparator orderByComparator)
		throws NoSuchunesco_region_countryException, SystemException {
		unesco_region_country unesco_region_country = findByPrimaryKey(whp_unesco_region_country_id);

		Session session = null;

		try {
			session = openSession();

			unesco_region_country[] array = new unesco_region_countryImpl[3];

			array[0] = getByunescoregionid_PrevAndNext(session,
					unesco_region_country, unesco_region_id, orderByComparator,
					true);

			array[1] = unesco_region_country;

			array[2] = getByunescoregionid_PrevAndNext(session,
					unesco_region_country, unesco_region_id, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected unesco_region_country getByunescoregionid_PrevAndNext(
		Session session, unesco_region_country unesco_region_country,
		int unesco_region_id, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_UNESCO_REGION_COUNTRY_WHERE);

		query.append(_FINDER_COLUMN_UNESCOREGIONID_UNESCO_REGION_ID_2);

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

		qPos.add(unesco_region_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(unesco_region_country);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<unesco_region_country> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the unesco_region_countries.
	 *
	 * @return the unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<unesco_region_country> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unesco_region_countries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of unesco_region_countries
	 * @param end the upper bound of the range of unesco_region_countries (not inclusive)
	 * @return the range of unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<unesco_region_country> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the unesco_region_countries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of unesco_region_countries
	 * @param end the upper bound of the range of unesco_region_countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public List<unesco_region_country> findAll(int start, int end,
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

		List<unesco_region_country> list = (List<unesco_region_country>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_UNESCO_REGION_COUNTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UNESCO_REGION_COUNTRY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<unesco_region_country>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<unesco_region_country>)QueryUtil.list(q,
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
	 * Removes the unesco_region_country where countryid = &#63; from the database.
	 *
	 * @param countryid the countryid
	 * @return the unesco_region_country that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public unesco_region_country removeBycountryid(int countryid)
		throws NoSuchunesco_region_countryException, SystemException {
		unesco_region_country unesco_region_country = findBycountryid(countryid);

		return remove(unesco_region_country);
	}

	/**
	 * Removes all the unesco_region_countries where unesco_region_id = &#63; from the database.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByunescoregionid(int unesco_region_id)
		throws SystemException {
		for (unesco_region_country unesco_region_country : findByunescoregionid(
				unesco_region_id)) {
			remove(unesco_region_country);
		}
	}

	/**
	 * Removes all the unesco_region_countries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (unesco_region_country unesco_region_country : findAll()) {
			remove(unesco_region_country);
		}
	}

	/**
	 * Returns the number of unesco_region_countries where countryid = &#63;.
	 *
	 * @param countryid the countryid
	 * @return the number of matching unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public int countBycountryid(int countryid) throws SystemException {
		Object[] finderArgs = new Object[] { countryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COUNTRYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UNESCO_REGION_COUNTRY_WHERE);

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
	 * Returns the number of unesco_region_countries where unesco_region_id = &#63;.
	 *
	 * @param unesco_region_id the unesco_region_id
	 * @return the number of matching unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByunescoregionid(int unesco_region_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { unesco_region_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UNESCOREGIONID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UNESCO_REGION_COUNTRY_WHERE);

			query.append(_FINDER_COLUMN_UNESCOREGIONID_UNESCO_REGION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(unesco_region_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UNESCOREGIONID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of unesco_region_countries.
	 *
	 * @return the number of unesco_region_countries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UNESCO_REGION_COUNTRY);

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
	 * Initializes the unesco_region_country persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.unesco_region_country")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<unesco_region_country>> listenersList = new ArrayList<ModelListener<unesco_region_country>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<unesco_region_country>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(unesco_region_countryImpl.class.getName());
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
	private static final String _SQL_SELECT_UNESCO_REGION_COUNTRY = "SELECT unesco_region_country FROM unesco_region_country unesco_region_country";
	private static final String _SQL_SELECT_UNESCO_REGION_COUNTRY_WHERE = "SELECT unesco_region_country FROM unesco_region_country unesco_region_country WHERE ";
	private static final String _SQL_COUNT_UNESCO_REGION_COUNTRY = "SELECT COUNT(unesco_region_country) FROM unesco_region_country unesco_region_country";
	private static final String _SQL_COUNT_UNESCO_REGION_COUNTRY_WHERE = "SELECT COUNT(unesco_region_country) FROM unesco_region_country unesco_region_country WHERE ";
	private static final String _FINDER_COLUMN_COUNTRYID_COUNTRYID_2 = "unesco_region_country.countryid = ?";
	private static final String _FINDER_COLUMN_UNESCOREGIONID_UNESCO_REGION_ID_2 =
		"unesco_region_country.unesco_region_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "unesco_region_country.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No unesco_region_country exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No unesco_region_country exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(unesco_region_countryPersistenceImpl.class);
	private static unesco_region_country _nullunesco_region_country = new unesco_region_countryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<unesco_region_country> toCacheModel() {
				return _nullunesco_region_countryCacheModel;
			}
		};

	private static CacheModel<unesco_region_country> _nullunesco_region_countryCacheModel =
		new CacheModel<unesco_region_country>() {
			public unesco_region_country toEntityModel() {
				return _nullunesco_region_country;
			}
		};
}