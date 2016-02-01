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

import com.iucn.whp.dbservice.NoSuchreinforced_monitoringException;
import com.iucn.whp.dbservice.model.impl.reinforced_monitoringImpl;
import com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl;
import com.iucn.whp.dbservice.model.reinforced_monitoring;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the reinforced_monitoring service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see reinforced_monitoringPersistence
 * @see reinforced_monitoringUtil
 * @generated
 */
public class reinforced_monitoringPersistenceImpl extends BasePersistenceImpl<reinforced_monitoring>
	implements reinforced_monitoringPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link reinforced_monitoringUtil} to access the reinforced_monitoring persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = reinforced_monitoringImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			reinforced_monitoringModelImpl.FINDER_CACHE_ENABLED,
			reinforced_monitoringImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			reinforced_monitoringModelImpl.FINDER_CACHE_ENABLED,
			reinforced_monitoringImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			reinforced_monitoringModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the reinforced_monitoring in the entity cache if it is enabled.
	 *
	 * @param reinforced_monitoring the reinforced_monitoring
	 */
	public void cacheResult(reinforced_monitoring reinforced_monitoring) {
		EntityCacheUtil.putResult(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			reinforced_monitoringImpl.class,
			reinforced_monitoring.getPrimaryKey(), reinforced_monitoring);

		reinforced_monitoring.resetOriginalValues();
	}

	/**
	 * Caches the reinforced_monitorings in the entity cache if it is enabled.
	 *
	 * @param reinforced_monitorings the reinforced_monitorings
	 */
	public void cacheResult(List<reinforced_monitoring> reinforced_monitorings) {
		for (reinforced_monitoring reinforced_monitoring : reinforced_monitorings) {
			if (EntityCacheUtil.getResult(
						reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
						reinforced_monitoringImpl.class,
						reinforced_monitoring.getPrimaryKey()) == null) {
				cacheResult(reinforced_monitoring);
			}
			else {
				reinforced_monitoring.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all reinforced_monitorings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(reinforced_monitoringImpl.class.getName());
		}

		EntityCacheUtil.clearCache(reinforced_monitoringImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the reinforced_monitoring.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(reinforced_monitoring reinforced_monitoring) {
		EntityCacheUtil.removeResult(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			reinforced_monitoringImpl.class,
			reinforced_monitoring.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<reinforced_monitoring> reinforced_monitorings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (reinforced_monitoring reinforced_monitoring : reinforced_monitorings) {
			EntityCacheUtil.removeResult(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
				reinforced_monitoringImpl.class,
				reinforced_monitoring.getPrimaryKey());
		}
	}

	/**
	 * Creates a new reinforced_monitoring with the primary key. Does not add the reinforced_monitoring to the database.
	 *
	 * @param whp_sites_reinforced_monitoring_id the primary key for the new reinforced_monitoring
	 * @return the new reinforced_monitoring
	 */
	public reinforced_monitoring create(long whp_sites_reinforced_monitoring_id) {
		reinforced_monitoring reinforced_monitoring = new reinforced_monitoringImpl();

		reinforced_monitoring.setNew(true);
		reinforced_monitoring.setPrimaryKey(whp_sites_reinforced_monitoring_id);

		return reinforced_monitoring;
	}

	/**
	 * Removes the reinforced_monitoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	 * @return the reinforced_monitoring that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public reinforced_monitoring remove(long whp_sites_reinforced_monitoring_id)
		throws NoSuchreinforced_monitoringException, SystemException {
		return remove(Long.valueOf(whp_sites_reinforced_monitoring_id));
	}

	/**
	 * Removes the reinforced_monitoring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the reinforced_monitoring
	 * @return the reinforced_monitoring that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public reinforced_monitoring remove(Serializable primaryKey)
		throws NoSuchreinforced_monitoringException, SystemException {
		Session session = null;

		try {
			session = openSession();

			reinforced_monitoring reinforced_monitoring = (reinforced_monitoring)session.get(reinforced_monitoringImpl.class,
					primaryKey);

			if (reinforced_monitoring == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchreinforced_monitoringException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(reinforced_monitoring);
		}
		catch (NoSuchreinforced_monitoringException nsee) {
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
	protected reinforced_monitoring removeImpl(
		reinforced_monitoring reinforced_monitoring) throws SystemException {
		reinforced_monitoring = toUnwrappedModel(reinforced_monitoring);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, reinforced_monitoring);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(reinforced_monitoring);

		return reinforced_monitoring;
	}

	@Override
	public reinforced_monitoring updateImpl(
		com.iucn.whp.dbservice.model.reinforced_monitoring reinforced_monitoring,
		boolean merge) throws SystemException {
		reinforced_monitoring = toUnwrappedModel(reinforced_monitoring);

		boolean isNew = reinforced_monitoring.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, reinforced_monitoring, merge);

			reinforced_monitoring.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			reinforced_monitoringImpl.class,
			reinforced_monitoring.getPrimaryKey(), reinforced_monitoring);

		return reinforced_monitoring;
	}

	protected reinforced_monitoring toUnwrappedModel(
		reinforced_monitoring reinforced_monitoring) {
		if (reinforced_monitoring instanceof reinforced_monitoringImpl) {
			return reinforced_monitoring;
		}

		reinforced_monitoringImpl reinforced_monitoringImpl = new reinforced_monitoringImpl();

		reinforced_monitoringImpl.setNew(reinforced_monitoring.isNew());
		reinforced_monitoringImpl.setPrimaryKey(reinforced_monitoring.getPrimaryKey());

		reinforced_monitoringImpl.setWhp_sites_reinforced_monitoring_id(reinforced_monitoring.getWhp_sites_reinforced_monitoring_id());
		reinforced_monitoringImpl.setSite_id(reinforced_monitoring.getSite_id());
		reinforced_monitoringImpl.setReinforced_date(reinforced_monitoring.getReinforced_date());

		return reinforced_monitoringImpl;
	}

	/**
	 * Returns the reinforced_monitoring with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the reinforced_monitoring
	 * @return the reinforced_monitoring
	 * @throws com.liferay.portal.NoSuchModelException if a reinforced_monitoring with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public reinforced_monitoring findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the reinforced_monitoring with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchreinforced_monitoringException} if it could not be found.
	 *
	 * @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	 * @return the reinforced_monitoring
	 * @throws com.iucn.whp.dbservice.NoSuchreinforced_monitoringException if a reinforced_monitoring with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public reinforced_monitoring findByPrimaryKey(
		long whp_sites_reinforced_monitoring_id)
		throws NoSuchreinforced_monitoringException, SystemException {
		reinforced_monitoring reinforced_monitoring = fetchByPrimaryKey(whp_sites_reinforced_monitoring_id);

		if (reinforced_monitoring == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					whp_sites_reinforced_monitoring_id);
			}

			throw new NoSuchreinforced_monitoringException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				whp_sites_reinforced_monitoring_id);
		}

		return reinforced_monitoring;
	}

	/**
	 * Returns the reinforced_monitoring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the reinforced_monitoring
	 * @return the reinforced_monitoring, or <code>null</code> if a reinforced_monitoring with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public reinforced_monitoring fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the reinforced_monitoring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param whp_sites_reinforced_monitoring_id the primary key of the reinforced_monitoring
	 * @return the reinforced_monitoring, or <code>null</code> if a reinforced_monitoring with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public reinforced_monitoring fetchByPrimaryKey(
		long whp_sites_reinforced_monitoring_id) throws SystemException {
		reinforced_monitoring reinforced_monitoring = (reinforced_monitoring)EntityCacheUtil.getResult(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
				reinforced_monitoringImpl.class,
				whp_sites_reinforced_monitoring_id);

		if (reinforced_monitoring == _nullreinforced_monitoring) {
			return null;
		}

		if (reinforced_monitoring == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				reinforced_monitoring = (reinforced_monitoring)session.get(reinforced_monitoringImpl.class,
						Long.valueOf(whp_sites_reinforced_monitoring_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (reinforced_monitoring != null) {
					cacheResult(reinforced_monitoring);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
						reinforced_monitoringImpl.class,
						whp_sites_reinforced_monitoring_id,
						_nullreinforced_monitoring);
				}

				closeSession(session);
			}
		}

		return reinforced_monitoring;
	}

	/**
	 * Returns all the reinforced_monitorings.
	 *
	 * @return the reinforced_monitorings
	 * @throws SystemException if a system exception occurred
	 */
	public List<reinforced_monitoring> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the reinforced_monitorings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of reinforced_monitorings
	 * @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	 * @return the range of reinforced_monitorings
	 * @throws SystemException if a system exception occurred
	 */
	public List<reinforced_monitoring> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the reinforced_monitorings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of reinforced_monitorings
	 * @param end the upper bound of the range of reinforced_monitorings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reinforced_monitorings
	 * @throws SystemException if a system exception occurred
	 */
	public List<reinforced_monitoring> findAll(int start, int end,
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

		List<reinforced_monitoring> list = (List<reinforced_monitoring>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REINFORCED_MONITORING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REINFORCED_MONITORING;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<reinforced_monitoring>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<reinforced_monitoring>)QueryUtil.list(q,
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
	 * Removes all the reinforced_monitorings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (reinforced_monitoring reinforced_monitoring : findAll()) {
			remove(reinforced_monitoring);
		}
	}

	/**
	 * Returns the number of reinforced_monitorings.
	 *
	 * @return the number of reinforced_monitorings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REINFORCED_MONITORING);

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
	 * Initializes the reinforced_monitoring persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.reinforced_monitoring")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<reinforced_monitoring>> listenersList = new ArrayList<ModelListener<reinforced_monitoring>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<reinforced_monitoring>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(reinforced_monitoringImpl.class.getName());
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
	private static final String _SQL_SELECT_REINFORCED_MONITORING = "SELECT reinforced_monitoring FROM reinforced_monitoring reinforced_monitoring";
	private static final String _SQL_COUNT_REINFORCED_MONITORING = "SELECT COUNT(reinforced_monitoring) FROM reinforced_monitoring reinforced_monitoring";
	private static final String _ORDER_BY_ENTITY_ALIAS = "reinforced_monitoring.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No reinforced_monitoring exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(reinforced_monitoringPersistenceImpl.class);
	private static reinforced_monitoring _nullreinforced_monitoring = new reinforced_monitoringImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<reinforced_monitoring> toCacheModel() {
				return _nullreinforced_monitoringCacheModel;
			}
		};

	private static CacheModel<reinforced_monitoring> _nullreinforced_monitoringCacheModel =
		new CacheModel<reinforced_monitoring>() {
			public reinforced_monitoring toEntityModel() {
				return _nullreinforced_monitoring;
			}
		};
}