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

import com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException;
import com.iucn.whp.dbservice.model.assessing_threats_potential;
import com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl;
import com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl;

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
 * The persistence implementation for the assessing_threats_potential service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessing_threats_potentialPersistence
 * @see assessing_threats_potentialUtil
 * @generated
 */
public class assessing_threats_potentialPersistenceImpl
	extends BasePersistenceImpl<assessing_threats_potential>
	implements assessing_threats_potentialPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link assessing_threats_potentialUtil} to access the assessing_threats_potential persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = assessing_threats_potentialImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassessment_version_id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID =
		new FinderPath(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessment_version_id",
			new String[] { Long.class.getName() },
			assessing_threats_potentialModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID = new FinderPath(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessment_version_id",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the assessing_threats_potential in the entity cache if it is enabled.
	 *
	 * @param assessing_threats_potential the assessing_threats_potential
	 */
	public void cacheResult(
		assessing_threats_potential assessing_threats_potential) {
		EntityCacheUtil.putResult(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			assessing_threats_potential.getPrimaryKey(),
			assessing_threats_potential);

		assessing_threats_potential.resetOriginalValues();
	}

	/**
	 * Caches the assessing_threats_potentials in the entity cache if it is enabled.
	 *
	 * @param assessing_threats_potentials the assessing_threats_potentials
	 */
	public void cacheResult(
		List<assessing_threats_potential> assessing_threats_potentials) {
		for (assessing_threats_potential assessing_threats_potential : assessing_threats_potentials) {
			if (EntityCacheUtil.getResult(
						assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
						assessing_threats_potentialImpl.class,
						assessing_threats_potential.getPrimaryKey()) == null) {
				cacheResult(assessing_threats_potential);
			}
			else {
				assessing_threats_potential.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessing_threats_potentials.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(assessing_threats_potentialImpl.class.getName());
		}

		EntityCacheUtil.clearCache(assessing_threats_potentialImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessing_threats_potential.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		assessing_threats_potential assessing_threats_potential) {
		EntityCacheUtil.removeResult(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			assessing_threats_potential.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<assessing_threats_potential> assessing_threats_potentials) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (assessing_threats_potential assessing_threats_potential : assessing_threats_potentials) {
			EntityCacheUtil.removeResult(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
				assessing_threats_potentialImpl.class,
				assessing_threats_potential.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessing_threats_potential with the primary key. Does not add the assessing_threats_potential to the database.
	 *
	 * @param potential_threat_id the primary key for the new assessing_threats_potential
	 * @return the new assessing_threats_potential
	 */
	public assessing_threats_potential create(long potential_threat_id) {
		assessing_threats_potential assessing_threats_potential = new assessing_threats_potentialImpl();

		assessing_threats_potential.setNew(true);
		assessing_threats_potential.setPrimaryKey(potential_threat_id);

		return assessing_threats_potential;
	}

	/**
	 * Removes the assessing_threats_potential with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param potential_threat_id the primary key of the assessing_threats_potential
	 * @return the assessing_threats_potential that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential remove(long potential_threat_id)
		throws NoSuchassessing_threats_potentialException, SystemException {
		return remove(Long.valueOf(potential_threat_id));
	}

	/**
	 * Removes the assessing_threats_potential with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessing_threats_potential
	 * @return the assessing_threats_potential that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessing_threats_potential remove(Serializable primaryKey)
		throws NoSuchassessing_threats_potentialException, SystemException {
		Session session = null;

		try {
			session = openSession();

			assessing_threats_potential assessing_threats_potential = (assessing_threats_potential)session.get(assessing_threats_potentialImpl.class,
					primaryKey);

			if (assessing_threats_potential == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchassessing_threats_potentialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessing_threats_potential);
		}
		catch (NoSuchassessing_threats_potentialException nsee) {
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
	protected assessing_threats_potential removeImpl(
		assessing_threats_potential assessing_threats_potential)
		throws SystemException {
		assessing_threats_potential = toUnwrappedModel(assessing_threats_potential);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, assessing_threats_potential);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(assessing_threats_potential);

		return assessing_threats_potential;
	}

	@Override
	public assessing_threats_potential updateImpl(
		com.iucn.whp.dbservice.model.assessing_threats_potential assessing_threats_potential,
		boolean merge) throws SystemException {
		assessing_threats_potential = toUnwrappedModel(assessing_threats_potential);

		boolean isNew = assessing_threats_potential.isNew();

		assessing_threats_potentialModelImpl assessing_threats_potentialModelImpl =
			(assessing_threats_potentialModelImpl)assessing_threats_potential;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, assessing_threats_potential, merge);

			assessing_threats_potential.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!assessing_threats_potentialModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessing_threats_potentialModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessing_threats_potentialModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);

				args = new Object[] {
						Long.valueOf(assessing_threats_potentialModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENT_VERSION_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			assessing_threats_potentialImpl.class,
			assessing_threats_potential.getPrimaryKey(),
			assessing_threats_potential);

		return assessing_threats_potential;
	}

	protected assessing_threats_potential toUnwrappedModel(
		assessing_threats_potential assessing_threats_potential) {
		if (assessing_threats_potential instanceof assessing_threats_potentialImpl) {
			return assessing_threats_potential;
		}

		assessing_threats_potentialImpl assessing_threats_potentialImpl = new assessing_threats_potentialImpl();

		assessing_threats_potentialImpl.setNew(assessing_threats_potential.isNew());
		assessing_threats_potentialImpl.setPrimaryKey(assessing_threats_potential.getPrimaryKey());

		assessing_threats_potentialImpl.setPotential_threat_id(assessing_threats_potential.getPotential_threat_id());
		assessing_threats_potentialImpl.setAssessment_version_id(assessing_threats_potential.getAssessment_version_id());
		assessing_threats_potentialImpl.setPotential_threat(assessing_threats_potential.getPotential_threat());
		assessing_threats_potentialImpl.setJustification(assessing_threats_potential.getJustification());
		assessing_threats_potentialImpl.setThreat_rating(assessing_threats_potential.getThreat_rating());
		assessing_threats_potentialImpl.setInside_site(assessing_threats_potential.isInside_site());
		assessing_threats_potentialImpl.setOutside_site(assessing_threats_potential.isOutside_site());

		return assessing_threats_potentialImpl;
	}

	/**
	 * Returns the assessing_threats_potential with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessing_threats_potential
	 * @return the assessing_threats_potential
	 * @throws com.liferay.portal.NoSuchModelException if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessing_threats_potential findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessing_threats_potential with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException} if it could not be found.
	 *
	 * @param potential_threat_id the primary key of the assessing_threats_potential
	 * @return the assessing_threats_potential
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential findByPrimaryKey(
		long potential_threat_id)
		throws NoSuchassessing_threats_potentialException, SystemException {
		assessing_threats_potential assessing_threats_potential = fetchByPrimaryKey(potential_threat_id);

		if (assessing_threats_potential == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					potential_threat_id);
			}

			throw new NoSuchassessing_threats_potentialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				potential_threat_id);
		}

		return assessing_threats_potential;
	}

	/**
	 * Returns the assessing_threats_potential with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessing_threats_potential
	 * @return the assessing_threats_potential, or <code>null</code> if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessing_threats_potential fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessing_threats_potential with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param potential_threat_id the primary key of the assessing_threats_potential
	 * @return the assessing_threats_potential, or <code>null</code> if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential fetchByPrimaryKey(
		long potential_threat_id) throws SystemException {
		assessing_threats_potential assessing_threats_potential = (assessing_threats_potential)EntityCacheUtil.getResult(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
				assessing_threats_potentialImpl.class, potential_threat_id);

		if (assessing_threats_potential == _nullassessing_threats_potential) {
			return null;
		}

		if (assessing_threats_potential == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				assessing_threats_potential = (assessing_threats_potential)session.get(assessing_threats_potentialImpl.class,
						Long.valueOf(potential_threat_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (assessing_threats_potential != null) {
					cacheResult(assessing_threats_potential);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
						assessing_threats_potentialImpl.class,
						potential_threat_id, _nullassessing_threats_potential);
				}

				closeSession(session);
			}
		}

		return assessing_threats_potential;
	}

	/**
	 * Returns all the assessing_threats_potentials where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id) throws SystemException {
		return findByassessment_version_id(assessment_version_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessing_threats_potentials where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @return the range of matching assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_potential> findByassessment_version_id(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassessment_version_id(assessment_version_id, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the assessing_threats_potentials where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_potential> findByassessment_version_id(
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

		List<assessing_threats_potential> list = (List<assessing_threats_potential>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessing_threats_potential assessing_threats_potential : list) {
				if ((assessment_version_id != assessing_threats_potential.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_ASSESSING_THREATS_POTENTIAL_WHERE);

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

				list = (List<assessing_threats_potential>)QueryUtil.list(q,
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
	 * Returns the first assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessing_threats_potential
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a matching assessing_threats_potential could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential findByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessing_threats_potentialException, SystemException {
		assessing_threats_potential assessing_threats_potential = fetchByassessment_version_id_First(assessment_version_id,
				orderByComparator);

		if (assessing_threats_potential != null) {
			return assessing_threats_potential;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessing_threats_potentialException(msg.toString());
	}

	/**
	 * Returns the first assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessing_threats_potential, or <code>null</code> if a matching assessing_threats_potential could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential fetchByassessment_version_id_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessing_threats_potential> list = findByassessment_version_id(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessing_threats_potential
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a matching assessing_threats_potential could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential findByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessing_threats_potentialException, SystemException {
		assessing_threats_potential assessing_threats_potential = fetchByassessment_version_id_Last(assessment_version_id,
				orderByComparator);

		if (assessing_threats_potential != null) {
			return assessing_threats_potential;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessing_threats_potentialException(msg.toString());
	}

	/**
	 * Returns the last assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessing_threats_potential, or <code>null</code> if a matching assessing_threats_potential could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential fetchByassessment_version_id_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessment_version_id(assessment_version_id);

		List<assessing_threats_potential> list = findByassessment_version_id(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessing_threats_potentials before and after the current assessing_threats_potential in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param potential_threat_id the primary key of the current assessing_threats_potential
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessing_threats_potential
	 * @throws com.iucn.whp.dbservice.NoSuchassessing_threats_potentialException if a assessing_threats_potential with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessing_threats_potential[] findByassessment_version_id_PrevAndNext(
		long potential_threat_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchassessing_threats_potentialException, SystemException {
		assessing_threats_potential assessing_threats_potential = findByPrimaryKey(potential_threat_id);

		Session session = null;

		try {
			session = openSession();

			assessing_threats_potential[] array = new assessing_threats_potentialImpl[3];

			array[0] = getByassessment_version_id_PrevAndNext(session,
					assessing_threats_potential, assessment_version_id,
					orderByComparator, true);

			array[1] = assessing_threats_potential;

			array[2] = getByassessment_version_id_PrevAndNext(session,
					assessing_threats_potential, assessment_version_id,
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

	protected assessing_threats_potential getByassessment_version_id_PrevAndNext(
		Session session,
		assessing_threats_potential assessing_threats_potential,
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

		query.append(_SQL_SELECT_ASSESSING_THREATS_POTENTIAL_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessing_threats_potential);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessing_threats_potential> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessing_threats_potentials.
	 *
	 * @return the assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_potential> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessing_threats_potentials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @return the range of assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_potential> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessing_threats_potentials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessing_threats_potential> findAll(int start, int end,
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

		List<assessing_threats_potential> list = (List<assessing_threats_potential>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSING_THREATS_POTENTIAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSING_THREATS_POTENTIAL;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<assessing_threats_potential>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<assessing_threats_potential>)QueryUtil.list(q,
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
	 * Removes all the assessing_threats_potentials where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessment_version_id(long assessment_version_id)
		throws SystemException {
		for (assessing_threats_potential assessing_threats_potential : findByassessment_version_id(
				assessment_version_id)) {
			remove(assessing_threats_potential);
		}
	}

	/**
	 * Removes all the assessing_threats_potentials from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (assessing_threats_potential assessing_threats_potential : findAll()) {
			remove(assessing_threats_potential);
		}
	}

	/**
	 * Returns the number of assessing_threats_potentials where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessment_version_id(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENT_VERSION_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESSING_THREATS_POTENTIAL_WHERE);

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
	 * Returns the number of assessing_threats_potentials.
	 *
	 * @return the number of assessing_threats_potentials
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSESSING_THREATS_POTENTIAL);

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
	 * Returns all the potential_threat_valueses associated with the assessing_threats_potential.
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @return the potential_threat_valueses associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk) throws SystemException {
		return getpotential_threat_valueses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the potential_threat_valueses associated with the assessing_threats_potential.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @return the range of potential_threat_valueses associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk, int start, int end) throws SystemException {
		return getpotential_threat_valueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.potential_threat_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_threat_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getpotential_threat_valueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the potential_threat_valueses associated with the assessing_threats_potential.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of potential_threat_valueses associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_threat_values> getpotential_threat_valueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.potential_threat_values> list = (List<com.iucn.whp.dbservice.model.potential_threat_values>)FinderCacheUtil.getResult(FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPOTENTIAL_THREAT_VALUESES.concat(ORDER_BY_CLAUSE)
														   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPOTENTIAL_THREAT_VALUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_potential_threat_values",
					com.iucn.whp.dbservice.model.impl.potential_threat_valuesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.potential_threat_values>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES,
						finderArgs);
				}
				else {
					potential_threat_valuesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.potential_threat_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_threat_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getpotential_threat_valuesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of potential_threat_valueses associated with the assessing_threats_potential.
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @return the number of potential_threat_valueses associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public int getpotential_threat_valuesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPOTENTIAL_THREAT_VALUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_POTENTIAL_THREAT_VALUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_POTENTIAL_THREAT_VALUES = new FinderPath(com.iucn.whp.dbservice.model.impl.potential_threat_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_threat_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containspotential_threat_values",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the potential_threat_values is associated with the assessing_threats_potential.
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @param potential_threat_valuesPK the primary key of the potential_threat_values
	 * @return <code>true</code> if the potential_threat_values is associated with the assessing_threats_potential; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containspotential_threat_values(long pk,
		long potential_threat_valuesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, potential_threat_valuesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_POTENTIAL_THREAT_VALUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containspotential_threat_values.contains(
							pk, potential_threat_valuesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_POTENTIAL_THREAT_VALUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the assessing_threats_potential has any potential_threat_valueses associated with it.
	 *
	 * @param pk the primary key of the assessing_threats_potential to check for associations with potential_threat_valueses
	 * @return <code>true</code> if the assessing_threats_potential has any potential_threat_valueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containspotential_threat_valueses(long pk)
		throws SystemException {
		if (getpotential_threat_valuesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @return the potential_threat_assessment_cats associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk) throws SystemException {
		return getpotential_threat_assessment_cats(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @return the range of potential_threat_assessment_cats associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk, int start, int end) throws SystemException {
		return getpotential_threat_assessment_cats(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_threat_assessment_catPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getpotential_threat_assessment_cats",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the potential_threat_assessment_cats associated with the assessing_threats_potential.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @param start the lower bound of the range of assessing_threats_potentials
	 * @param end the upper bound of the range of assessing_threats_potentials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of potential_threat_assessment_cats associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> getpotential_threat_assessment_cats(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat> list = (List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat>)FinderCacheUtil.getResult(FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPOTENTIAL_THREAT_ASSESSMENT_CATS.concat(ORDER_BY_CLAUSE)
																  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPOTENTIAL_THREAT_ASSESSMENT_CATS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_potential_threat_assessment_cat",
					com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.potential_threat_assessment_cat>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS,
						finderArgs);
				}
				else {
					potential_threat_assessment_catPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_threat_assessment_catPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getpotential_threat_assessment_catsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of potential_threat_assessment_cats associated with the assessing_threats_potential.
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @return the number of potential_threat_assessment_cats associated with the assessing_threats_potential
	 * @throws SystemException if a system exception occurred
	 */
	public int getpotential_threat_assessment_catsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPOTENTIAL_THREAT_ASSESSMENT_CATSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_POTENTIAL_THREAT_ASSESSMENT_CATS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_POTENTIAL_THREAT_ASSESSMENT_CAT =
		new FinderPath(com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_threat_assessment_catImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_threat_assessment_catPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containspotential_threat_assessment_cat",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the potential_threat_assessment_cat is associated with the assessing_threats_potential.
	 *
	 * @param pk the primary key of the assessing_threats_potential
	 * @param potential_threat_assessment_catPK the primary key of the potential_threat_assessment_cat
	 * @return <code>true</code> if the potential_threat_assessment_cat is associated with the assessing_threats_potential; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containspotential_threat_assessment_cat(long pk,
		long potential_threat_assessment_catPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, potential_threat_assessment_catPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_POTENTIAL_THREAT_ASSESSMENT_CAT,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containspotential_threat_assessment_cat.contains(
							pk, potential_threat_assessment_catPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_POTENTIAL_THREAT_ASSESSMENT_CAT,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the assessing_threats_potential has any potential_threat_assessment_cats associated with it.
	 *
	 * @param pk the primary key of the assessing_threats_potential to check for associations with potential_threat_assessment_cats
	 * @return <code>true</code> if the assessing_threats_potential has any potential_threat_assessment_cats associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containspotential_threat_assessment_cats(long pk)
		throws SystemException {
		if (getpotential_threat_assessment_catsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the assessing_threats_potential persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.assessing_threats_potential")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<assessing_threats_potential>> listenersList = new ArrayList<ModelListener<assessing_threats_potential>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<assessing_threats_potential>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containspotential_threat_values = new Containspotential_threat_values();

		containspotential_threat_assessment_cat = new Containspotential_threat_assessment_cat();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(assessing_threats_potentialImpl.class.getName());
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
	protected Containspotential_threat_values containspotential_threat_values;
	protected Containspotential_threat_assessment_cat containspotential_threat_assessment_cat;

	protected class Containspotential_threat_values {
		protected Containspotential_threat_values() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPOTENTIAL_THREAT_VALUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long potential_threat_id,
			long potential_threat_values_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(potential_threat_id),
						new Long(potential_threat_values_id)
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

	protected class Containspotential_threat_assessment_cat {
		protected Containspotential_threat_assessment_cat() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPOTENTIAL_THREAT_ASSESSMENT_CAT,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long potential_threat_id,
			long pot_threat_cat_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(potential_threat_id),
						new Long(pot_threat_cat_id)
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

	private static final String _SQL_SELECT_ASSESSING_THREATS_POTENTIAL = "SELECT assessing_threats_potential FROM assessing_threats_potential assessing_threats_potential";
	private static final String _SQL_SELECT_ASSESSING_THREATS_POTENTIAL_WHERE = "SELECT assessing_threats_potential FROM assessing_threats_potential assessing_threats_potential WHERE ";
	private static final String _SQL_COUNT_ASSESSING_THREATS_POTENTIAL = "SELECT COUNT(assessing_threats_potential) FROM assessing_threats_potential assessing_threats_potential";
	private static final String _SQL_COUNT_ASSESSING_THREATS_POTENTIAL_WHERE = "SELECT COUNT(assessing_threats_potential) FROM assessing_threats_potential assessing_threats_potential WHERE ";
	private static final String _SQL_GETPOTENTIAL_THREAT_VALUESES = "SELECT {whp_potential_threat_values.*} FROM whp_potential_threat_values INNER JOIN whp_assessing_threats_potential ON (whp_assessing_threats_potential.potential_threat_id = whp_potential_threat_values.potential_threat_id) WHERE (whp_assessing_threats_potential.potential_threat_id = ?)";
	private static final String _SQL_GETPOTENTIAL_THREAT_VALUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_potential_threat_values WHERE potential_threat_id = ?";
	private static final String _SQL_CONTAINSPOTENTIAL_THREAT_VALUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_potential_threat_values WHERE potential_threat_id = ? AND potential_threat_values_id = ?";
	private static final String _SQL_GETPOTENTIAL_THREAT_ASSESSMENT_CATS = "SELECT {whp_potential_threat_assessment_cat.*} FROM whp_potential_threat_assessment_cat INNER JOIN whp_assessing_threats_potential ON (whp_assessing_threats_potential.potential_threat_id = whp_potential_threat_assessment_cat.potential_threat_id) WHERE (whp_assessing_threats_potential.potential_threat_id = ?)";
	private static final String _SQL_GETPOTENTIAL_THREAT_ASSESSMENT_CATSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_potential_threat_assessment_cat WHERE potential_threat_id = ?";
	private static final String _SQL_CONTAINSPOTENTIAL_THREAT_ASSESSMENT_CAT = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_potential_threat_assessment_cat WHERE potential_threat_id = ? AND pot_threat_cat_id = ?";
	private static final String _FINDER_COLUMN_ASSESSMENT_VERSION_ID_ASSESSMENT_VERSION_ID_2 =
		"assessing_threats_potential.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessing_threats_potential.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No assessing_threats_potential exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No assessing_threats_potential exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(assessing_threats_potentialPersistenceImpl.class);
	private static assessing_threats_potential _nullassessing_threats_potential = new assessing_threats_potentialImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<assessing_threats_potential> toCacheModel() {
				return _nullassessing_threats_potentialCacheModel;
			}
		};

	private static CacheModel<assessing_threats_potential> _nullassessing_threats_potentialCacheModel =
		new CacheModel<assessing_threats_potential>() {
			public assessing_threats_potential toEntityModel() {
				return _nullassessing_threats_potential;
			}
		};
}