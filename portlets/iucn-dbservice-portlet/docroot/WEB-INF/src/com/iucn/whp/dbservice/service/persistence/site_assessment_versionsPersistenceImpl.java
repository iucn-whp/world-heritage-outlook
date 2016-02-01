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

import com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException;
import com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl;
import com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl;
import com.iucn.whp.dbservice.model.site_assessment_versions;

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
 * The persistence implementation for the site_assessment_versions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see site_assessment_versionsPersistence
 * @see site_assessment_versionsUtil
 * @generated
 */
public class site_assessment_versionsPersistenceImpl extends BasePersistenceImpl<site_assessment_versions>
	implements site_assessment_versionsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link site_assessment_versionsUtil} to access the site_assessment_versions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = site_assessment_versionsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserid",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserid",
			new String[] { Long.class.getName() },
			site_assessment_versionsModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTID =
		new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAssessmentId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID =
		new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAssessmentId",
			new String[] { Long.class.getName() },
			site_assessment_versionsModelImpl.ASSESSMENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTID = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAssessmentId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE =
		new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBypreviousVersionCode",
			new String[] {
				Long.class.getName(), Double.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE =
		new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBypreviousVersionCode",
			new String[] { Long.class.getName(), Double.class.getName() },
			site_assessment_versionsModelImpl.ASSESSMENT_ID_COLUMN_BITMASK |
			site_assessment_versionsModelImpl.VERSION_CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PREVIOUSVERSIONCODE = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBypreviousVersionCode",
			new String[] { Long.class.getName(), Double.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the site_assessment_versions in the entity cache if it is enabled.
	 *
	 * @param site_assessment_versions the site_assessment_versions
	 */
	public void cacheResult(site_assessment_versions site_assessment_versions) {
		EntityCacheUtil.putResult(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			site_assessment_versions.getPrimaryKey(), site_assessment_versions);

		site_assessment_versions.resetOriginalValues();
	}

	/**
	 * Caches the site_assessment_versionses in the entity cache if it is enabled.
	 *
	 * @param site_assessment_versionses the site_assessment_versionses
	 */
	public void cacheResult(
		List<site_assessment_versions> site_assessment_versionses) {
		for (site_assessment_versions site_assessment_versions : site_assessment_versionses) {
			if (EntityCacheUtil.getResult(
						site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
						site_assessment_versionsImpl.class,
						site_assessment_versions.getPrimaryKey()) == null) {
				cacheResult(site_assessment_versions);
			}
			else {
				site_assessment_versions.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all site_assessment_versionses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(site_assessment_versionsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(site_assessment_versionsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the site_assessment_versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(site_assessment_versions site_assessment_versions) {
		EntityCacheUtil.removeResult(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			site_assessment_versions.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<site_assessment_versions> site_assessment_versionses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (site_assessment_versions site_assessment_versions : site_assessment_versionses) {
			EntityCacheUtil.removeResult(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
				site_assessment_versionsImpl.class,
				site_assessment_versions.getPrimaryKey());
		}
	}

	/**
	 * Creates a new site_assessment_versions with the primary key. Does not add the site_assessment_versions to the database.
	 *
	 * @param assessment_version_id the primary key for the new site_assessment_versions
	 * @return the new site_assessment_versions
	 */
	public site_assessment_versions create(long assessment_version_id) {
		site_assessment_versions site_assessment_versions = new site_assessment_versionsImpl();

		site_assessment_versions.setNew(true);
		site_assessment_versions.setPrimaryKey(assessment_version_id);

		return site_assessment_versions;
	}

	/**
	 * Removes the site_assessment_versions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessment_version_id the primary key of the site_assessment_versions
	 * @return the site_assessment_versions that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions remove(long assessment_version_id)
		throws NoSuchsite_assessment_versionsException, SystemException {
		return remove(Long.valueOf(assessment_version_id));
	}

	/**
	 * Removes the site_assessment_versions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the site_assessment_versions
	 * @return the site_assessment_versions that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public site_assessment_versions remove(Serializable primaryKey)
		throws NoSuchsite_assessment_versionsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			site_assessment_versions site_assessment_versions = (site_assessment_versions)session.get(site_assessment_versionsImpl.class,
					primaryKey);

			if (site_assessment_versions == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsite_assessment_versionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(site_assessment_versions);
		}
		catch (NoSuchsite_assessment_versionsException nsee) {
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
	protected site_assessment_versions removeImpl(
		site_assessment_versions site_assessment_versions)
		throws SystemException {
		site_assessment_versions = toUnwrappedModel(site_assessment_versions);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, site_assessment_versions);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(site_assessment_versions);

		return site_assessment_versions;
	}

	@Override
	public site_assessment_versions updateImpl(
		com.iucn.whp.dbservice.model.site_assessment_versions site_assessment_versions,
		boolean merge) throws SystemException {
		site_assessment_versions = toUnwrappedModel(site_assessment_versions);

		boolean isNew = site_assessment_versions.isNew();

		site_assessment_versionsModelImpl site_assessment_versionsModelImpl = (site_assessment_versionsModelImpl)site_assessment_versions;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, site_assessment_versions, merge);

			site_assessment_versions.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !site_assessment_versionsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((site_assessment_versionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(site_assessment_versionsModelImpl.getOriginalUserid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] {
						Long.valueOf(site_assessment_versionsModelImpl.getUserid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((site_assessment_versionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(site_assessment_versionsModelImpl.getOriginalAssessment_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID,
					args);

				args = new Object[] {
						Long.valueOf(site_assessment_versionsModelImpl.getAssessment_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID,
					args);
			}

			if ((site_assessment_versionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(site_assessment_versionsModelImpl.getOriginalAssessment_id()),
						Double.valueOf(site_assessment_versionsModelImpl.getOriginalVersion_code())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PREVIOUSVERSIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE,
					args);

				args = new Object[] {
						Long.valueOf(site_assessment_versionsModelImpl.getAssessment_id()),
						Double.valueOf(site_assessment_versionsModelImpl.getVersion_code())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PREVIOUSVERSIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			site_assessment_versionsImpl.class,
			site_assessment_versions.getPrimaryKey(), site_assessment_versions);

		return site_assessment_versions;
	}

	protected site_assessment_versions toUnwrappedModel(
		site_assessment_versions site_assessment_versions) {
		if (site_assessment_versions instanceof site_assessment_versionsImpl) {
			return site_assessment_versions;
		}

		site_assessment_versionsImpl site_assessment_versionsImpl = new site_assessment_versionsImpl();

		site_assessment_versionsImpl.setNew(site_assessment_versions.isNew());
		site_assessment_versionsImpl.setPrimaryKey(site_assessment_versions.getPrimaryKey());

		site_assessment_versionsImpl.setAssessment_version_id(site_assessment_versions.getAssessment_version_id());
		site_assessment_versionsImpl.setStage_id(site_assessment_versions.getStage_id());
		site_assessment_versionsImpl.setAssessment_id(site_assessment_versions.getAssessment_id());
		site_assessment_versionsImpl.setStart_date(site_assessment_versions.getStart_date());
		site_assessment_versionsImpl.setEnd_date(site_assessment_versions.getEnd_date());
		site_assessment_versionsImpl.setUserid(site_assessment_versions.getUserid());
		site_assessment_versionsImpl.setInitiation_date(site_assessment_versions.getInitiation_date());
		site_assessment_versionsImpl.setLanguage(site_assessment_versions.getLanguage());
		site_assessment_versionsImpl.setVersion_code(site_assessment_versions.getVersion_code());
		site_assessment_versionsImpl.setIs_translated(site_assessment_versions.isIs_translated());
		site_assessment_versionsImpl.setParent_assessment_versionid(site_assessment_versions.getParent_assessment_versionid());

		return site_assessment_versionsImpl;
	}

	/**
	 * Returns the site_assessment_versions with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the site_assessment_versions
	 * @return the site_assessment_versions
	 * @throws com.liferay.portal.NoSuchModelException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public site_assessment_versions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the site_assessment_versions with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException} if it could not be found.
	 *
	 * @param assessment_version_id the primary key of the site_assessment_versions
	 * @return the site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findByPrimaryKey(long assessment_version_id)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchByPrimaryKey(assessment_version_id);

		if (site_assessment_versions == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					assessment_version_id);
			}

			throw new NoSuchsite_assessment_versionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				assessment_version_id);
		}

		return site_assessment_versions;
	}

	/**
	 * Returns the site_assessment_versions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the site_assessment_versions
	 * @return the site_assessment_versions, or <code>null</code> if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public site_assessment_versions fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the site_assessment_versions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessment_version_id the primary key of the site_assessment_versions
	 * @return the site_assessment_versions, or <code>null</code> if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchByPrimaryKey(
		long assessment_version_id) throws SystemException {
		site_assessment_versions site_assessment_versions = (site_assessment_versions)EntityCacheUtil.getResult(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
				site_assessment_versionsImpl.class, assessment_version_id);

		if (site_assessment_versions == _nullsite_assessment_versions) {
			return null;
		}

		if (site_assessment_versions == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				site_assessment_versions = (site_assessment_versions)session.get(site_assessment_versionsImpl.class,
						Long.valueOf(assessment_version_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (site_assessment_versions != null) {
					cacheResult(site_assessment_versions);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
						site_assessment_versionsImpl.class,
						assessment_version_id, _nullsite_assessment_versions);
				}

				closeSession(session);
			}
		}

		return site_assessment_versions;
	}

	/**
	 * Returns all the site_assessment_versionses where userid = &#63;.
	 *
	 * @param userid the userid
	 * @return the matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findByuserid(long userid)
		throws SystemException {
		return findByuserid(userid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessment_versionses where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userid the userid
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findByuserid(long userid, int start,
		int end) throws SystemException {
		return findByuserid(userid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessment_versionses where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userid the userid
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findByuserid(long userid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userid, start, end, orderByComparator };
		}

		List<site_assessment_versions> list = (List<site_assessment_versions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment_versions site_assessment_versions : list) {
				if ((userid != site_assessment_versions.getUserid())) {
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

			query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

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

				qPos.add(userid);

				list = (List<site_assessment_versions>)QueryUtil.list(q,
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
	 * Returns the first site_assessment_versions in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findByuserid_First(long userid,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchByuserid_First(userid,
				orderByComparator);

		if (site_assessment_versions != null) {
			return site_assessment_versions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessment_versionsException(msg.toString());
	}

	/**
	 * Returns the first site_assessment_versions in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchByuserid_First(long userid,
		OrderByComparator orderByComparator) throws SystemException {
		List<site_assessment_versions> list = findByuserid(userid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment_versions in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findByuserid_Last(long userid,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchByuserid_Last(userid,
				orderByComparator);

		if (site_assessment_versions != null) {
			return site_assessment_versions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessment_versionsException(msg.toString());
	}

	/**
	 * Returns the last site_assessment_versions in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchByuserid_Last(long userid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByuserid(userid);

		List<site_assessment_versions> list = findByuserid(userid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where userid = &#63;.
	 *
	 * @param assessment_version_id the primary key of the current site_assessment_versions
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions[] findByuserid_PrevAndNext(
		long assessment_version_id, long userid,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = findByPrimaryKey(assessment_version_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment_versions[] array = new site_assessment_versionsImpl[3];

			array[0] = getByuserid_PrevAndNext(session,
					site_assessment_versions, userid, orderByComparator, true);

			array[1] = site_assessment_versions;

			array[2] = getByuserid_PrevAndNext(session,
					site_assessment_versions, userid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected site_assessment_versions getByuserid_PrevAndNext(
		Session session, site_assessment_versions site_assessment_versions,
		long userid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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

		qPos.add(userid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment_versions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment_versions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessment_versionses where assessment_id = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @return the matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findByAssessmentId(long assessment_id)
		throws SystemException {
		return findByAssessmentId(assessment_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessment_versionses where assessment_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_id the assessment_id
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findByAssessmentId(
		long assessment_id, int start, int end) throws SystemException {
		return findByAssessmentId(assessment_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessment_versionses where assessment_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_id the assessment_id
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findByAssessmentId(
		long assessment_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID;
			finderArgs = new Object[] { assessment_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTID;
			finderArgs = new Object[] {
					assessment_id,
					
					start, end, orderByComparator
				};
		}

		List<site_assessment_versions> list = (List<site_assessment_versions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment_versions site_assessment_versions : list) {
				if ((assessment_id != site_assessment_versions.getAssessment_id())) {
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

			query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTID_ASSESSMENT_ID_2);

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

				qPos.add(assessment_id);

				list = (List<site_assessment_versions>)QueryUtil.list(q,
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
	 * Returns the first site_assessment_versions in the ordered set where assessment_id = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findByAssessmentId_First(
		long assessment_id, OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchByAssessmentId_First(assessment_id,
				orderByComparator);

		if (site_assessment_versions != null) {
			return site_assessment_versions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_id=");
		msg.append(assessment_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessment_versionsException(msg.toString());
	}

	/**
	 * Returns the first site_assessment_versions in the ordered set where assessment_id = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchByAssessmentId_First(
		long assessment_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<site_assessment_versions> list = findByAssessmentId(assessment_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment_versions in the ordered set where assessment_id = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findByAssessmentId_Last(
		long assessment_id, OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchByAssessmentId_Last(assessment_id,
				orderByComparator);

		if (site_assessment_versions != null) {
			return site_assessment_versions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_id=");
		msg.append(assessment_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessment_versionsException(msg.toString());
	}

	/**
	 * Returns the last site_assessment_versions in the ordered set where assessment_id = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchByAssessmentId_Last(
		long assessment_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAssessmentId(assessment_id);

		List<site_assessment_versions> list = findByAssessmentId(assessment_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where assessment_id = &#63;.
	 *
	 * @param assessment_version_id the primary key of the current site_assessment_versions
	 * @param assessment_id the assessment_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions[] findByAssessmentId_PrevAndNext(
		long assessment_version_id, long assessment_id,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = findByPrimaryKey(assessment_version_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment_versions[] array = new site_assessment_versionsImpl[3];

			array[0] = getByAssessmentId_PrevAndNext(session,
					site_assessment_versions, assessment_id, orderByComparator,
					true);

			array[1] = site_assessment_versions;

			array[2] = getByAssessmentId_PrevAndNext(session,
					site_assessment_versions, assessment_id, orderByComparator,
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

	protected site_assessment_versions getByAssessmentId_PrevAndNext(
		Session session, site_assessment_versions site_assessment_versions,
		long assessment_id, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE);

		query.append(_FINDER_COLUMN_ASSESSMENTID_ASSESSMENT_ID_2);

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

		qPos.add(assessment_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment_versions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment_versions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @return the matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findBypreviousVersionCode(
		long assessment_id, double version_code) throws SystemException {
		return findBypreviousVersionCode(assessment_id, version_code,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findBypreviousVersionCode(
		long assessment_id, double version_code, int start, int end)
		throws SystemException {
		return findBypreviousVersionCode(assessment_id, version_code, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findBypreviousVersionCode(
		long assessment_id, double version_code, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE;
			finderArgs = new Object[] { assessment_id, version_code };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PREVIOUSVERSIONCODE;
			finderArgs = new Object[] {
					assessment_id, version_code,
					
					start, end, orderByComparator
				};
		}

		List<site_assessment_versions> list = (List<site_assessment_versions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment_versions site_assessment_versions : list) {
				if ((assessment_id != site_assessment_versions.getAssessment_id()) ||
						(version_code != site_assessment_versions.getVersion_code())) {
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

			query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE);

			query.append(_FINDER_COLUMN_PREVIOUSVERSIONCODE_ASSESSMENT_ID_2);

			query.append(_FINDER_COLUMN_PREVIOUSVERSIONCODE_VERSION_CODE_2);

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

				qPos.add(assessment_id);

				qPos.add(version_code);

				list = (List<site_assessment_versions>)QueryUtil.list(q,
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
	 * Returns the first site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findBypreviousVersionCode_First(
		long assessment_id, double version_code,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchBypreviousVersionCode_First(assessment_id,
				version_code, orderByComparator);

		if (site_assessment_versions != null) {
			return site_assessment_versions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_id=");
		msg.append(assessment_id);

		msg.append(", version_code=");
		msg.append(version_code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessment_versionsException(msg.toString());
	}

	/**
	 * Returns the first site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchBypreviousVersionCode_First(
		long assessment_id, double version_code,
		OrderByComparator orderByComparator) throws SystemException {
		List<site_assessment_versions> list = findBypreviousVersionCode(assessment_id,
				version_code, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions findBypreviousVersionCode_Last(
		long assessment_id, double version_code,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = fetchBypreviousVersionCode_Last(assessment_id,
				version_code, orderByComparator);

		if (site_assessment_versions != null) {
			return site_assessment_versions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_id=");
		msg.append(assessment_id);

		msg.append(", version_code=");
		msg.append(version_code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessment_versionsException(msg.toString());
	}

	/**
	 * Returns the last site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment_versions, or <code>null</code> if a matching site_assessment_versions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions fetchBypreviousVersionCode_Last(
		long assessment_id, double version_code,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBypreviousVersionCode(assessment_id, version_code);

		List<site_assessment_versions> list = findBypreviousVersionCode(assessment_id,
				version_code, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessment_versionses before and after the current site_assessment_versions in the ordered set where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_version_id the primary key of the current site_assessment_versions
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment_versions
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessment_versionsException if a site_assessment_versions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment_versions[] findBypreviousVersionCode_PrevAndNext(
		long assessment_version_id, long assessment_id, double version_code,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessment_versionsException, SystemException {
		site_assessment_versions site_assessment_versions = findByPrimaryKey(assessment_version_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment_versions[] array = new site_assessment_versionsImpl[3];

			array[0] = getBypreviousVersionCode_PrevAndNext(session,
					site_assessment_versions, assessment_id, version_code,
					orderByComparator, true);

			array[1] = site_assessment_versions;

			array[2] = getBypreviousVersionCode_PrevAndNext(session,
					site_assessment_versions, assessment_id, version_code,
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

	protected site_assessment_versions getBypreviousVersionCode_PrevAndNext(
		Session session, site_assessment_versions site_assessment_versions,
		long assessment_id, double version_code,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE);

		query.append(_FINDER_COLUMN_PREVIOUSVERSIONCODE_ASSESSMENT_ID_2);

		query.append(_FINDER_COLUMN_PREVIOUSVERSIONCODE_VERSION_CODE_2);

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

		qPos.add(assessment_id);

		qPos.add(version_code);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment_versions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment_versions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessment_versionses.
	 *
	 * @return the site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessment_versionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessment_versionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment_versions> findAll(int start, int end,
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

		List<site_assessment_versions> list = (List<site_assessment_versions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SITE_ASSESSMENT_VERSIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SITE_ASSESSMENT_VERSIONS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<site_assessment_versions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<site_assessment_versions>)QueryUtil.list(q,
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
	 * Removes all the site_assessment_versionses where userid = &#63; from the database.
	 *
	 * @param userid the userid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByuserid(long userid) throws SystemException {
		for (site_assessment_versions site_assessment_versions : findByuserid(
				userid)) {
			remove(site_assessment_versions);
		}
	}

	/**
	 * Removes all the site_assessment_versionses where assessment_id = &#63; from the database.
	 *
	 * @param assessment_id the assessment_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAssessmentId(long assessment_id)
		throws SystemException {
		for (site_assessment_versions site_assessment_versions : findByAssessmentId(
				assessment_id)) {
			remove(site_assessment_versions);
		}
	}

	/**
	 * Removes all the site_assessment_versionses where assessment_id = &#63; and version_code = &#63; from the database.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBypreviousVersionCode(long assessment_id,
		double version_code) throws SystemException {
		for (site_assessment_versions site_assessment_versions : findBypreviousVersionCode(
				assessment_id, version_code)) {
			remove(site_assessment_versions);
		}
	}

	/**
	 * Removes all the site_assessment_versionses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (site_assessment_versions site_assessment_versions : findAll()) {
			remove(site_assessment_versions);
		}
	}

	/**
	 * Returns the number of site_assessment_versionses where userid = &#63;.
	 *
	 * @param userid the userid
	 * @return the number of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByuserid(long userid) throws SystemException {
		Object[] finderArgs = new Object[] { userid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_VERSIONS_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessment_versionses where assessment_id = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @return the number of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAssessmentId(long assessment_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_VERSIONS_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTID_ASSESSMENT_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessment_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessment_versionses where assessment_id = &#63; and version_code = &#63;.
	 *
	 * @param assessment_id the assessment_id
	 * @param version_code the version_code
	 * @return the number of matching site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBypreviousVersionCode(long assessment_id,
		double version_code) throws SystemException {
		Object[] finderArgs = new Object[] { assessment_id, version_code };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PREVIOUSVERSIONCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_VERSIONS_WHERE);

			query.append(_FINDER_COLUMN_PREVIOUSVERSIONCODE_ASSESSMENT_ID_2);

			query.append(_FINDER_COLUMN_PREVIOUSVERSIONCODE_VERSION_CODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessment_id);

				qPos.add(version_code);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PREVIOUSVERSIONCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessment_versionses.
	 *
	 * @return the number of site_assessment_versionses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SITE_ASSESSMENT_VERSIONS);

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
	 * Returns all the active_conservation_projectses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the active_conservation_projectses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		long pk) throws SystemException {
		return getactive_conservation_projectses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the active_conservation_projectses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of active_conservation_projectses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		long pk, int start, int end) throws SystemException {
		return getactive_conservation_projectses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.active_conservation_projectsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.active_conservation_projectsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.active_conservation_projectsImpl.class,
			com.iucn.whp.dbservice.service.persistence.active_conservation_projectsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getactive_conservation_projectses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the active_conservation_projectses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of active_conservation_projectses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.active_conservation_projects> getactive_conservation_projectses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.active_conservation_projects> list = (List<com.iucn.whp.dbservice.model.active_conservation_projects>)FinderCacheUtil.getResult(FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETACTIVE_CONSERVATION_PROJECTSES.concat(ORDER_BY_CLAUSE)
																.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETACTIVE_CONSERVATION_PROJECTSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_active_conservation_projects",
					com.iucn.whp.dbservice.model.impl.active_conservation_projectsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.active_conservation_projects>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES,
						finderArgs);
				}
				else {
					active_conservation_projectsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.active_conservation_projectsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.active_conservation_projectsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.active_conservation_projectsImpl.class,
			com.iucn.whp.dbservice.service.persistence.active_conservation_projectsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getactive_conservation_projectsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of active_conservation_projectses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of active_conservation_projectses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getactive_conservation_projectsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETACTIVE_CONSERVATION_PROJECTSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_ACTIVE_CONSERVATION_PROJECTSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_ACTIVE_CONSERVATION_PROJECTS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.active_conservation_projectsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.active_conservation_projectsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.active_conservation_projectsImpl.class,
			com.iucn.whp.dbservice.service.persistence.active_conservation_projectsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsactive_conservation_projects",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the active_conservation_projects is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param active_conservation_projectsPK the primary key of the active_conservation_projects
	 * @return <code>true</code> if the active_conservation_projects is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsactive_conservation_projects(long pk,
		long active_conservation_projectsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, active_conservation_projectsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_ACTIVE_CONSERVATION_PROJECTS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsactive_conservation_projects.contains(
							pk, active_conservation_projectsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_ACTIVE_CONSERVATION_PROJECTS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any active_conservation_projectses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with active_conservation_projectses
	 * @return <code>true</code> if the site_assessment_versions has any active_conservation_projectses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsactive_conservation_projectses(long pk)
		throws SystemException {
		if (getactive_conservation_projectsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the assessment_whvalueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the assessment_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_whvalues> getassessment_whvalueses(
		long pk) throws SystemException {
		return getassessment_whvalueses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the assessment_whvalueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of assessment_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_whvalues> getassessment_whvalueses(
		long pk, int start, int end) throws SystemException {
		return getassessment_whvalueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSMENT_WHVALUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvaluesImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_whvaluesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessment_whvalueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_ASSESSMENT_WHVALUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the assessment_whvalueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_whvalues> getassessment_whvalueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.assessment_whvalues> list = (List<com.iucn.whp.dbservice.model.assessment_whvalues>)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSMENT_WHVALUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETASSESSMENT_WHVALUESES.concat(ORDER_BY_CLAUSE)
													   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETASSESSMENT_WHVALUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_assessment_whvalues",
					com.iucn.whp.dbservice.model.impl.assessment_whvaluesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.assessment_whvalues>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_ASSESSMENT_WHVALUESES,
						finderArgs);
				}
				else {
					assessment_whvaluesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSMENT_WHVALUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSMENT_WHVALUESES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvaluesImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_whvaluesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessment_whvaluesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_ASSESSMENT_WHVALUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of assessment_whvalueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of assessment_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getassessment_whvaluesesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSMENT_WHVALUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETASSESSMENT_WHVALUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSMENT_WHVALUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_ASSESSMENT_WHVALUES = new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_whvaluesImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_whvaluesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsassessment_whvalues",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the assessment_whvalues is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param assessment_whvaluesPK the primary key of the assessment_whvalues
	 * @return <code>true</code> if the assessment_whvalues is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessment_whvalues(long pk,
		long assessment_whvaluesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, assessment_whvaluesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_ASSESSMENT_WHVALUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsassessment_whvalues.contains(
							pk, assessment_whvaluesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_ASSESSMENT_WHVALUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any assessment_whvalueses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with assessment_whvalueses
	 * @return <code>true</code> if the site_assessment_versions has any assessment_whvalueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessment_whvalueses(long pk)
		throws SystemException {
		if (getassessment_whvaluesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the biodiversity_valueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the biodiversity_valueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		long pk) throws SystemException {
		return getbiodiversity_valueses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the biodiversity_valueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of biodiversity_valueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		long pk, int start, int end) throws SystemException {
		return getbiodiversity_valueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_BIODIVERSITY_VALUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.biodiversity_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbiodiversity_valueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_BIODIVERSITY_VALUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the biodiversity_valueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of biodiversity_valueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.biodiversity_values> getbiodiversity_valueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.biodiversity_values> list = (List<com.iucn.whp.dbservice.model.biodiversity_values>)FinderCacheUtil.getResult(FINDER_PATH_GET_BIODIVERSITY_VALUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETBIODIVERSITY_VALUESES.concat(ORDER_BY_CLAUSE)
													   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETBIODIVERSITY_VALUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_biodiversity_values",
					com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.biodiversity_values>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_BIODIVERSITY_VALUESES,
						finderArgs);
				}
				else {
					biodiversity_valuesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_BIODIVERSITY_VALUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_BIODIVERSITY_VALUESES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.biodiversity_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbiodiversity_valuesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_BIODIVERSITY_VALUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of biodiversity_valueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of biodiversity_valueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getbiodiversity_valuesesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_BIODIVERSITY_VALUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETBIODIVERSITY_VALUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_BIODIVERSITY_VALUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_BIODIVERSITY_VALUES = new FinderPath(com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.biodiversity_valuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.biodiversity_valuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.biodiversity_valuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsbiodiversity_values",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the biodiversity_values is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param biodiversity_valuesPK the primary key of the biodiversity_values
	 * @return <code>true</code> if the biodiversity_values is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbiodiversity_values(long pk,
		long biodiversity_valuesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, biodiversity_valuesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_BIODIVERSITY_VALUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsbiodiversity_values.contains(
							pk, biodiversity_valuesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_BIODIVERSITY_VALUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any biodiversity_valueses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with biodiversity_valueses
	 * @return <code>true</code> if the site_assessment_versions has any biodiversity_valueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbiodiversity_valueses(long pk)
		throws SystemException {
		if (getbiodiversity_valuesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the current_state_trends associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the current_state_trends associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_state_trend> getcurrent_state_trends(
		long pk) throws SystemException {
		return getcurrent_state_trends(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the current_state_trends associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of current_state_trends associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_state_trend> getcurrent_state_trends(
		long pk, int start, int end) throws SystemException {
		return getcurrent_state_trends(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_STATE_TRENDS = new FinderPath(com.iucn.whp.dbservice.model.impl.current_state_trendModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trendModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trendImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_state_trendPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_state_trends",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_CURRENT_STATE_TRENDS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the current_state_trends associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of current_state_trends associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.current_state_trend> getcurrent_state_trends(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.current_state_trend> list = (List<com.iucn.whp.dbservice.model.current_state_trend>)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_STATE_TRENDS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETCURRENT_STATE_TRENDS.concat(ORDER_BY_CLAUSE)
													  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETCURRENT_STATE_TRENDS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_current_state_trend",
					com.iucn.whp.dbservice.model.impl.current_state_trendImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.current_state_trend>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_CURRENT_STATE_TRENDS,
						finderArgs);
				}
				else {
					current_state_trendPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_STATE_TRENDS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_CURRENT_STATE_TRENDS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.current_state_trendModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trendModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trendImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_state_trendPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getcurrent_state_trendsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_CURRENT_STATE_TRENDS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of current_state_trends associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of current_state_trends associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getcurrent_state_trendsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_CURRENT_STATE_TRENDS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETCURRENT_STATE_TRENDSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_CURRENT_STATE_TRENDS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_CURRENT_STATE_TREND = new FinderPath(com.iucn.whp.dbservice.model.impl.current_state_trendModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trendModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.current_state_trendImpl.class,
			com.iucn.whp.dbservice.service.persistence.current_state_trendPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containscurrent_state_trend",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the current_state_trend is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param current_state_trendPK the primary key of the current_state_trend
	 * @return <code>true</code> if the current_state_trend is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_state_trend(long pk,
		long current_state_trendPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, current_state_trendPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_CURRENT_STATE_TREND,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containscurrent_state_trend.contains(
							pk, current_state_trendPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_CURRENT_STATE_TREND,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any current_state_trends associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with current_state_trends
	 * @return <code>true</code> if the site_assessment_versions has any current_state_trends associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containscurrent_state_trends(long pk)
		throws SystemException {
		if (getcurrent_state_trendsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the state_trend_whvalueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the state_trend_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.state_trend_whvalues> getstate_trend_whvalueses(
		long pk) throws SystemException {
		return getstate_trend_whvalueses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the state_trend_whvalueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of state_trend_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.state_trend_whvalues> getstate_trend_whvalueses(
		long pk, int start, int end) throws SystemException {
		return getstate_trend_whvalueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_STATE_TREND_WHVALUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.state_trend_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_whvaluesImpl.class,
			com.iucn.whp.dbservice.service.persistence.state_trend_whvaluesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getstate_trend_whvalueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_STATE_TREND_WHVALUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the state_trend_whvalueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of state_trend_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.state_trend_whvalues> getstate_trend_whvalueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.state_trend_whvalues> list = (List<com.iucn.whp.dbservice.model.state_trend_whvalues>)FinderCacheUtil.getResult(FINDER_PATH_GET_STATE_TREND_WHVALUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETSTATE_TREND_WHVALUESES.concat(ORDER_BY_CLAUSE)
														.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETSTATE_TREND_WHVALUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_state_trend_whvalues",
					com.iucn.whp.dbservice.model.impl.state_trend_whvaluesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.state_trend_whvalues>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_STATE_TREND_WHVALUESES,
						finderArgs);
				}
				else {
					state_trend_whvaluesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_STATE_TREND_WHVALUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_STATE_TREND_WHVALUESES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.state_trend_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_whvaluesImpl.class,
			com.iucn.whp.dbservice.service.persistence.state_trend_whvaluesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getstate_trend_whvaluesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_STATE_TREND_WHVALUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of state_trend_whvalueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of state_trend_whvalueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getstate_trend_whvaluesesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_STATE_TREND_WHVALUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETSTATE_TREND_WHVALUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_STATE_TREND_WHVALUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_STATE_TREND_WHVALUES = new FinderPath(com.iucn.whp.dbservice.model.impl.state_trend_whvaluesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_whvaluesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_whvaluesImpl.class,
			com.iucn.whp.dbservice.service.persistence.state_trend_whvaluesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsstate_trend_whvalues",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the state_trend_whvalues is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param state_trend_whvaluesPK the primary key of the state_trend_whvalues
	 * @return <code>true</code> if the state_trend_whvalues is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsstate_trend_whvalues(long pk,
		long state_trend_whvaluesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, state_trend_whvaluesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_STATE_TREND_WHVALUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsstate_trend_whvalues.contains(
							pk, state_trend_whvaluesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_STATE_TREND_WHVALUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any state_trend_whvalueses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with state_trend_whvalueses
	 * @return <code>true</code> if the site_assessment_versions has any state_trend_whvalueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsstate_trend_whvalueses(long pk)
		throws SystemException {
		if (getstate_trend_whvaluesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the referenceses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the referenceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.references> getreferenceses(
		long pk) throws SystemException {
		return getreferenceses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the referenceses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of referenceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.references> getreferenceses(
		long pk, int start, int end) throws SystemException {
		return getreferenceses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_REFERENCESES = new FinderPath(com.iucn.whp.dbservice.model.impl.referencesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.referencesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.referencesImpl.class,
			com.iucn.whp.dbservice.service.persistence.referencesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getreferenceses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_REFERENCESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the referenceses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of referenceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.references> getreferenceses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.references> list = (List<com.iucn.whp.dbservice.model.references>)FinderCacheUtil.getResult(FINDER_PATH_GET_REFERENCESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETREFERENCESES.concat(ORDER_BY_CLAUSE)
											  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETREFERENCESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_references",
					com.iucn.whp.dbservice.model.impl.referencesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.references>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_REFERENCESES,
						finderArgs);
				}
				else {
					referencesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_REFERENCESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_REFERENCESES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.referencesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.referencesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.referencesImpl.class,
			com.iucn.whp.dbservice.service.persistence.referencesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getreferencesesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_REFERENCESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of referenceses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of referenceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getreferencesesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_REFERENCESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETREFERENCESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_REFERENCESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_REFERENCES = new FinderPath(com.iucn.whp.dbservice.model.impl.referencesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.referencesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.referencesImpl.class,
			com.iucn.whp.dbservice.service.persistence.referencesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsreferences",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the references is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param referencesPK the primary key of the references
	 * @return <code>true</code> if the references is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsreferences(long pk, long referencesPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, referencesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_REFERENCES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsreferences.contains(pk,
							referencesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_REFERENCES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any referenceses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with referenceses
	 * @return <code>true</code> if the site_assessment_versions has any referenceses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsreferenceses(long pk) throws SystemException {
		if (getreferencesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		long pk) throws SystemException {
		return geteffective_prot_mgmt_iothreatses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		long pk, int start, int end) throws SystemException {
		return geteffective_prot_mgmt_iothreatses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsImpl.class,
			com.iucn.whp.dbservice.service.persistence.effective_prot_mgmt_iothreatsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"geteffective_prot_mgmt_iothreatses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> geteffective_prot_mgmt_iothreatses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats> list = (List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats>)FinderCacheUtil.getResult(FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETEFFECTIVE_PROT_MGMT_IOTHREATSES.concat(ORDER_BY_CLAUSE)
																 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETEFFECTIVE_PROT_MGMT_IOTHREATSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_effective_prot_mgmt_iothreats",
					com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES,
						finderArgs);
				}
				else {
					effective_prot_mgmt_iothreatsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsImpl.class,
			com.iucn.whp.dbservice.service.persistence.effective_prot_mgmt_iothreatsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"geteffective_prot_mgmt_iothreatsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of effective_prot_mgmt_iothreatses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of effective_prot_mgmt_iothreatses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int geteffective_prot_mgmt_iothreatsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETEFFECTIVE_PROT_MGMT_IOTHREATSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_EFFECTIVE_PROT_MGMT_IOTHREATSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_EFFECTIVE_PROT_MGMT_IOTHREATS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.effective_prot_mgmt_iothreatsImpl.class,
			com.iucn.whp.dbservice.service.persistence.effective_prot_mgmt_iothreatsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containseffective_prot_mgmt_iothreats",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the effective_prot_mgmt_iothreats is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param effective_prot_mgmt_iothreatsPK the primary key of the effective_prot_mgmt_iothreats
	 * @return <code>true</code> if the effective_prot_mgmt_iothreats is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containseffective_prot_mgmt_iothreats(long pk,
		long effective_prot_mgmt_iothreatsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, effective_prot_mgmt_iothreatsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_EFFECTIVE_PROT_MGMT_IOTHREATS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containseffective_prot_mgmt_iothreats.contains(
							pk, effective_prot_mgmt_iothreatsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_EFFECTIVE_PROT_MGMT_IOTHREATS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any effective_prot_mgmt_iothreatses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with effective_prot_mgmt_iothreatses
	 * @return <code>true</code> if the site_assessment_versions has any effective_prot_mgmt_iothreatses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containseffective_prot_mgmt_iothreatses(long pk)
		throws SystemException {
		if (geteffective_prot_mgmt_iothreatsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the potential_project_needses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the potential_project_needses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		long pk) throws SystemException {
		return getpotential_project_needses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the potential_project_needses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of potential_project_needses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		long pk, int start, int end) throws SystemException {
		return getpotential_project_needses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES = new FinderPath(com.iucn.whp.dbservice.model.impl.potential_project_needsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_project_needsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_project_needsImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_project_needsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getpotential_project_needses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the potential_project_needses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of potential_project_needses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.potential_project_needs> getpotential_project_needses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.potential_project_needs> list = (List<com.iucn.whp.dbservice.model.potential_project_needs>)FinderCacheUtil.getResult(FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPOTENTIAL_PROJECT_NEEDSES.concat(ORDER_BY_CLAUSE)
														   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPOTENTIAL_PROJECT_NEEDSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_potential_project_needs",
					com.iucn.whp.dbservice.model.impl.potential_project_needsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.potential_project_needs>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES,
						finderArgs);
				}
				else {
					potential_project_needsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.potential_project_needsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_project_needsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_project_needsImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_project_needsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getpotential_project_needsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of potential_project_needses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of potential_project_needses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getpotential_project_needsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPOTENTIAL_PROJECT_NEEDSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_POTENTIAL_PROJECT_NEEDSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_POTENTIAL_PROJECT_NEEDS = new FinderPath(com.iucn.whp.dbservice.model.impl.potential_project_needsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_project_needsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.potential_project_needsImpl.class,
			com.iucn.whp.dbservice.service.persistence.potential_project_needsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containspotential_project_needs",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the potential_project_needs is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param potential_project_needsPK the primary key of the potential_project_needs
	 * @return <code>true</code> if the potential_project_needs is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containspotential_project_needs(long pk,
		long potential_project_needsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, potential_project_needsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_POTENTIAL_PROJECT_NEEDS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containspotential_project_needs.contains(
							pk, potential_project_needsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_POTENTIAL_PROJECT_NEEDS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any potential_project_needses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with potential_project_needses
	 * @return <code>true</code> if the site_assessment_versions has any potential_project_needses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containspotential_project_needses(long pk)
		throws SystemException {
		if (getpotential_project_needsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the state_trend_biodivvalses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the state_trend_biodivvalses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		long pk) throws SystemException {
		return getstate_trend_biodivvalses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the state_trend_biodivvalses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of state_trend_biodivvalses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		long pk, int start, int end) throws SystemException {
		return getstate_trend_biodivvalses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_STATE_TREND_BIODIVVALSES = new FinderPath(com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsImpl.class,
			com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getstate_trend_biodivvalses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_STATE_TREND_BIODIVVALSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the state_trend_biodivvalses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of state_trend_biodivvalses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.state_trend_biodivvals> getstate_trend_biodivvalses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.state_trend_biodivvals> list = (List<com.iucn.whp.dbservice.model.state_trend_biodivvals>)FinderCacheUtil.getResult(FINDER_PATH_GET_STATE_TREND_BIODIVVALSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETSTATE_TREND_BIODIVVALSES.concat(ORDER_BY_CLAUSE)
														  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETSTATE_TREND_BIODIVVALSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_state_trend_biodivvals",
					com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.state_trend_biodivvals>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_STATE_TREND_BIODIVVALSES,
						finderArgs);
				}
				else {
					state_trend_biodivvalsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_STATE_TREND_BIODIVVALSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_STATE_TREND_BIODIVVALSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsImpl.class,
			com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getstate_trend_biodivvalsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_STATE_TREND_BIODIVVALSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of state_trend_biodivvalses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of state_trend_biodivvalses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getstate_trend_biodivvalsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_STATE_TREND_BIODIVVALSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETSTATE_TREND_BIODIVVALSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_STATE_TREND_BIODIVVALSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_STATE_TREND_BIODIVVALS = new FinderPath(com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.state_trend_biodivvalsImpl.class,
			com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsstate_trend_biodivvals",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the state_trend_biodivvals is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param state_trend_biodivvalsPK the primary key of the state_trend_biodivvals
	 * @return <code>true</code> if the state_trend_biodivvals is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsstate_trend_biodivvals(long pk,
		long state_trend_biodivvalsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, state_trend_biodivvalsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_STATE_TREND_BIODIVVALS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsstate_trend_biodivvals.contains(
							pk, state_trend_biodivvalsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_STATE_TREND_BIODIVVALS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any state_trend_biodivvalses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with state_trend_biodivvalses
	 * @return <code>true</code> if the site_assessment_versions has any state_trend_biodivvalses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsstate_trend_biodivvalses(long pk)
		throws SystemException {
		if (getstate_trend_biodivvalsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the prot_mgmt_best_practiceses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the prot_mgmt_best_practiceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		long pk) throws SystemException {
		return getprot_mgmt_best_practiceses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the prot_mgmt_best_practiceses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of prot_mgmt_best_practiceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		long pk, int start, int end) throws SystemException {
		return getprot_mgmt_best_practiceses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES = new FinderPath(com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl.class,
			com.iucn.whp.dbservice.service.persistence.prot_mgmt_best_practicesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getprot_mgmt_best_practiceses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the prot_mgmt_best_practiceses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prot_mgmt_best_practiceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> getprot_mgmt_best_practiceses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> list = (List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices>)FinderCacheUtil.getResult(FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPROT_MGMT_BEST_PRACTICESES.concat(ORDER_BY_CLAUSE)
															.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPROT_MGMT_BEST_PRACTICESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_prot_mgmt_best_practices",
					com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.prot_mgmt_best_practices>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES,
						finderArgs);
				}
				else {
					prot_mgmt_best_practicesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl.class,
			com.iucn.whp.dbservice.service.persistence.prot_mgmt_best_practicesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getprot_mgmt_best_practicesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of prot_mgmt_best_practiceses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of prot_mgmt_best_practiceses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getprot_mgmt_best_practicesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPROT_MGMT_BEST_PRACTICESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_PROT_MGMT_BEST_PRACTICESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_PROT_MGMT_BEST_PRACTICES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl.class,
			com.iucn.whp.dbservice.service.persistence.prot_mgmt_best_practicesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsprot_mgmt_best_practices",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the prot_mgmt_best_practices is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param prot_mgmt_best_practicesPK the primary key of the prot_mgmt_best_practices
	 * @return <code>true</code> if the prot_mgmt_best_practices is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsprot_mgmt_best_practices(long pk,
		long prot_mgmt_best_practicesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, prot_mgmt_best_practicesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_PROT_MGMT_BEST_PRACTICES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsprot_mgmt_best_practices.contains(
							pk, prot_mgmt_best_practicesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_PROT_MGMT_BEST_PRACTICES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any prot_mgmt_best_practiceses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with prot_mgmt_best_practiceses
	 * @return <code>true</code> if the site_assessment_versions has any prot_mgmt_best_practiceses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsprot_mgmt_best_practiceses(long pk)
		throws SystemException {
		if (getprot_mgmt_best_practicesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the prot_mgmt_overalls associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the prot_mgmt_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		long pk) throws SystemException {
		return getprot_mgmt_overalls(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the prot_mgmt_overalls associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of prot_mgmt_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		long pk, int start, int end) throws SystemException {
		return getprot_mgmt_overalls(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_PROT_MGMT_OVERALLS = new FinderPath(com.iucn.whp.dbservice.model.impl.prot_mgmt_overallModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_overallModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_overallImpl.class,
			com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getprot_mgmt_overalls",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_PROT_MGMT_OVERALLS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the prot_mgmt_overalls associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prot_mgmt_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.prot_mgmt_overall> getprot_mgmt_overalls(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.prot_mgmt_overall> list = (List<com.iucn.whp.dbservice.model.prot_mgmt_overall>)FinderCacheUtil.getResult(FINDER_PATH_GET_PROT_MGMT_OVERALLS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPROT_MGMT_OVERALLS.concat(ORDER_BY_CLAUSE)
													.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPROT_MGMT_OVERALLS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_prot_mgmt_overall",
					com.iucn.whp.dbservice.model.impl.prot_mgmt_overallImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.prot_mgmt_overall>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_PROT_MGMT_OVERALLS,
						finderArgs);
				}
				else {
					prot_mgmt_overallPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_PROT_MGMT_OVERALLS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_PROT_MGMT_OVERALLS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.prot_mgmt_overallModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_overallModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_overallImpl.class,
			com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getprot_mgmt_overallsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_PROT_MGMT_OVERALLS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of prot_mgmt_overalls associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of prot_mgmt_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getprot_mgmt_overallsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_PROT_MGMT_OVERALLS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPROT_MGMT_OVERALLSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_PROT_MGMT_OVERALLS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_PROT_MGMT_OVERALL = new FinderPath(com.iucn.whp.dbservice.model.impl.prot_mgmt_overallModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_overallModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.prot_mgmt_overallImpl.class,
			com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsprot_mgmt_overall",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the prot_mgmt_overall is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param prot_mgmt_overallPK the primary key of the prot_mgmt_overall
	 * @return <code>true</code> if the prot_mgmt_overall is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsprot_mgmt_overall(long pk, long prot_mgmt_overallPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, prot_mgmt_overallPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_PROT_MGMT_OVERALL,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsprot_mgmt_overall.contains(pk,
							prot_mgmt_overallPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_PROT_MGMT_OVERALL,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any prot_mgmt_overalls associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with prot_mgmt_overalls
	 * @return <code>true</code> if the site_assessment_versions has any prot_mgmt_overalls associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsprot_mgmt_overalls(long pk)
		throws SystemException {
		if (getprot_mgmt_overallsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the protection_managements associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the protection_managements associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		long pk) throws SystemException {
		return getprotection_managements(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the protection_managements associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of protection_managements associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		long pk, int start, int end) throws SystemException {
		return getprotection_managements(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_PROTECTION_MANAGEMENTS = new FinderPath(com.iucn.whp.dbservice.model.impl.protection_managementModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.protection_managementModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.protection_managementImpl.class,
			com.iucn.whp.dbservice.service.persistence.protection_managementPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getprotection_managements",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_PROTECTION_MANAGEMENTS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the protection_managements associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of protection_managements associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.protection_management> getprotection_managements(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.protection_management> list = (List<com.iucn.whp.dbservice.model.protection_management>)FinderCacheUtil.getResult(FINDER_PATH_GET_PROTECTION_MANAGEMENTS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPROTECTION_MANAGEMENTS.concat(ORDER_BY_CLAUSE)
														.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPROTECTION_MANAGEMENTS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_protection_management",
					com.iucn.whp.dbservice.model.impl.protection_managementImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.protection_management>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_PROTECTION_MANAGEMENTS,
						finderArgs);
				}
				else {
					protection_managementPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_PROTECTION_MANAGEMENTS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_PROTECTION_MANAGEMENTS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.protection_managementModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.protection_managementModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.protection_managementImpl.class,
			com.iucn.whp.dbservice.service.persistence.protection_managementPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getprotection_managementsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_PROTECTION_MANAGEMENTS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of protection_managements associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of protection_managements associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getprotection_managementsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_PROTECTION_MANAGEMENTS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPROTECTION_MANAGEMENTSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_PROTECTION_MANAGEMENTS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_PROTECTION_MANAGEMENT = new FinderPath(com.iucn.whp.dbservice.model.impl.protection_managementModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.protection_managementModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.protection_managementImpl.class,
			com.iucn.whp.dbservice.service.persistence.protection_managementPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsprotection_management",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the protection_management is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param protection_managementPK the primary key of the protection_management
	 * @return <code>true</code> if the protection_management is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsprotection_management(long pk,
		long protection_managementPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, protection_managementPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_PROTECTION_MANAGEMENT,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsprotection_management.contains(
							pk, protection_managementPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_PROTECTION_MANAGEMENT,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any protection_managements associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with protection_managements
	 * @return <code>true</code> if the site_assessment_versions has any protection_managements associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsprotection_managements(long pk)
		throws SystemException {
		if (getprotection_managementsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the benefits_summaries associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the benefits_summaries associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		long pk) throws SystemException {
		return getbenefits_summaries(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the benefits_summaries associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of benefits_summaries associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		long pk, int start, int end) throws SystemException {
		return getbenefits_summaries(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_BENEFITS_SUMMARIES = new FinderPath(com.iucn.whp.dbservice.model.impl.benefits_summaryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefits_summaryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefits_summaryImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefits_summaryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbenefits_summaries",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_BENEFITS_SUMMARIES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the benefits_summaries associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefits_summaries associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefits_summary> getbenefits_summaries(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.benefits_summary> list = (List<com.iucn.whp.dbservice.model.benefits_summary>)FinderCacheUtil.getResult(FINDER_PATH_GET_BENEFITS_SUMMARIES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETBENEFITS_SUMMARIES.concat(ORDER_BY_CLAUSE)
													.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETBENEFITS_SUMMARIES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_benefits_summary",
					com.iucn.whp.dbservice.model.impl.benefits_summaryImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.benefits_summary>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_BENEFITS_SUMMARIES,
						finderArgs);
				}
				else {
					benefits_summaryPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_BENEFITS_SUMMARIES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_BENEFITS_SUMMARIES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.benefits_summaryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefits_summaryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefits_summaryImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefits_summaryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbenefits_summariesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_BENEFITS_SUMMARIES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of benefits_summaries associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of benefits_summaries associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getbenefits_summariesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_BENEFITS_SUMMARIES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETBENEFITS_SUMMARIESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_BENEFITS_SUMMARIES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_BENEFITS_SUMMARY = new FinderPath(com.iucn.whp.dbservice.model.impl.benefits_summaryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefits_summaryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefits_summaryImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefits_summaryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsbenefits_summary",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the benefits_summary is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param benefits_summaryPK the primary key of the benefits_summary
	 * @return <code>true</code> if the benefits_summary is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbenefits_summary(long pk, long benefits_summaryPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, benefits_summaryPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_BENEFITS_SUMMARY,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsbenefits_summary.contains(pk,
							benefits_summaryPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_BENEFITS_SUMMARY,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any benefits_summaries associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with benefits_summaries
	 * @return <code>true</code> if the site_assessment_versions has any benefits_summaries associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbenefits_summaries(long pk)
		throws SystemException {
		if (getbenefits_summariesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the key_conservation_issueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the key_conservation_issueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		long pk) throws SystemException {
		return getkey_conservation_issueses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the key_conservation_issueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of key_conservation_issueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		long pk, int start, int end) throws SystemException {
		return getkey_conservation_issueses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES = new FinderPath(com.iucn.whp.dbservice.model.impl.key_conservation_issuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.key_conservation_issuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.key_conservation_issuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.key_conservation_issuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getkey_conservation_issueses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the key_conservation_issueses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of key_conservation_issueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.key_conservation_issues> getkey_conservation_issueses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.key_conservation_issues> list = (List<com.iucn.whp.dbservice.model.key_conservation_issues>)FinderCacheUtil.getResult(FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETKEY_CONSERVATION_ISSUESES.concat(ORDER_BY_CLAUSE)
														   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETKEY_CONSERVATION_ISSUESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_key_conservation_issues",
					com.iucn.whp.dbservice.model.impl.key_conservation_issuesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.key_conservation_issues>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES,
						finderArgs);
				}
				else {
					key_conservation_issuesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.key_conservation_issuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.key_conservation_issuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.key_conservation_issuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.key_conservation_issuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getkey_conservation_issuesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of key_conservation_issueses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of key_conservation_issueses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getkey_conservation_issuesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETKEY_CONSERVATION_ISSUESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_KEY_CONSERVATION_ISSUESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_KEY_CONSERVATION_ISSUES = new FinderPath(com.iucn.whp.dbservice.model.impl.key_conservation_issuesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.key_conservation_issuesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.key_conservation_issuesImpl.class,
			com.iucn.whp.dbservice.service.persistence.key_conservation_issuesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containskey_conservation_issues",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the key_conservation_issues is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param key_conservation_issuesPK the primary key of the key_conservation_issues
	 * @return <code>true</code> if the key_conservation_issues is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containskey_conservation_issues(long pk,
		long key_conservation_issuesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, key_conservation_issuesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_KEY_CONSERVATION_ISSUES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containskey_conservation_issues.contains(
							pk, key_conservation_issuesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_KEY_CONSERVATION_ISSUES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any key_conservation_issueses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with key_conservation_issueses
	 * @return <code>true</code> if the site_assessment_versions has any key_conservation_issueses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containskey_conservation_issueses(long pk)
		throws SystemException {
		if (getkey_conservation_issuesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the conservation_outlooks associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the conservation_outlooks associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		long pk) throws SystemException {
		return getconservation_outlooks(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the conservation_outlooks associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of conservation_outlooks associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		long pk, int start, int end) throws SystemException {
		return getconservation_outlooks(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_CONSERVATION_OUTLOOKS = new FinderPath(com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.conservation_outlookImpl.class,
			com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getconservation_outlooks",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_CONSERVATION_OUTLOOKS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the conservation_outlooks associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of conservation_outlooks associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.conservation_outlook> getconservation_outlooks(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.conservation_outlook> list = (List<com.iucn.whp.dbservice.model.conservation_outlook>)FinderCacheUtil.getResult(FINDER_PATH_GET_CONSERVATION_OUTLOOKS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETCONSERVATION_OUTLOOKS.concat(ORDER_BY_CLAUSE)
													   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETCONSERVATION_OUTLOOKS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_conservation_outlook",
					com.iucn.whp.dbservice.model.impl.conservation_outlookImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.conservation_outlook>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_CONSERVATION_OUTLOOKS,
						finderArgs);
				}
				else {
					conservation_outlookPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_CONSERVATION_OUTLOOKS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_CONSERVATION_OUTLOOKS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.conservation_outlookImpl.class,
			com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getconservation_outlooksSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_CONSERVATION_OUTLOOKS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of conservation_outlooks associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of conservation_outlooks associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getconservation_outlooksSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_CONSERVATION_OUTLOOKS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETCONSERVATION_OUTLOOKSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_CONSERVATION_OUTLOOKS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_CONSERVATION_OUTLOOK = new FinderPath(com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.conservation_outlookModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.conservation_outlookImpl.class,
			com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsconservation_outlook",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the conservation_outlook is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param conservation_outlookPK the primary key of the conservation_outlook
	 * @return <code>true</code> if the conservation_outlook is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsconservation_outlook(long pk,
		long conservation_outlookPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, conservation_outlookPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_CONSERVATION_OUTLOOK,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsconservation_outlook.contains(
							pk, conservation_outlookPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_CONSERVATION_OUTLOOK,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any conservation_outlooks associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with conservation_outlooks
	 * @return <code>true</code> if the site_assessment_versions has any conservation_outlooks associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsconservation_outlooks(long pk)
		throws SystemException {
		if (getconservation_outlooksSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the benefitses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the benefitses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefits> getbenefitses(long pk)
		throws SystemException {
		return getbenefitses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the benefitses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of benefitses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefits> getbenefitses(long pk,
		int start, int end) throws SystemException {
		return getbenefitses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_BENEFITSES = new FinderPath(com.iucn.whp.dbservice.model.impl.benefitsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefitsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefitsImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefitsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbenefitses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_BENEFITSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the benefitses associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefitses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.benefits> getbenefitses(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.benefits> list = (List<com.iucn.whp.dbservice.model.benefits>)FinderCacheUtil.getResult(FINDER_PATH_GET_BENEFITSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETBENEFITSES.concat(ORDER_BY_CLAUSE)
											.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETBENEFITSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_benefits",
					com.iucn.whp.dbservice.model.impl.benefitsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.benefits>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_BENEFITSES,
						finderArgs);
				}
				else {
					benefitsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_BENEFITSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_BENEFITSES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.benefitsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefitsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefitsImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefitsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getbenefitsesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_BENEFITSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of benefitses associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of benefitses associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getbenefitsesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_BENEFITSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETBENEFITSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_BENEFITSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_BENEFITS = new FinderPath(com.iucn.whp.dbservice.model.impl.benefitsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefitsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.benefitsImpl.class,
			com.iucn.whp.dbservice.service.persistence.benefitsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsbenefits",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the benefits is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param benefitsPK the primary key of the benefits
	 * @return <code>true</code> if the benefits is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbenefits(long pk, long benefitsPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, benefitsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_BENEFITS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsbenefits.contains(pk, benefitsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_BENEFITS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any benefitses associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with benefitses
	 * @return <code>true</code> if the site_assessment_versions has any benefitses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsbenefitses(long pk) throws SystemException {
		if (getbenefitsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the assessing_threats_currents associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the assessing_threats_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		long pk) throws SystemException {
		return getassessing_threats_currents(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the assessing_threats_currents associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of assessing_threats_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		long pk, int start, int end) throws SystemException {
		return getassessing_threats_currents(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS = new FinderPath(com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessing_threats_currentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessing_threats_currents",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the assessing_threats_currents associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessing_threats_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessing_threats_current> getassessing_threats_currents(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.assessing_threats_current> list = (List<com.iucn.whp.dbservice.model.assessing_threats_current>)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETASSESSING_THREATS_CURRENTS.concat(ORDER_BY_CLAUSE)
															.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETASSESSING_THREATS_CURRENTS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_assessing_threats_current",
					com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.assessing_threats_current>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS,
						finderArgs);
				}
				else {
					assessing_threats_currentPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessing_threats_currentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessing_threats_currentsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of assessing_threats_currents associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of assessing_threats_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getassessing_threats_currentsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETASSESSING_THREATS_CURRENTSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSING_THREATS_CURRENTS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_ASSESSING_THREATS_CURRENT =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_currentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_currentImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessing_threats_currentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsassessing_threats_current",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the assessing_threats_current is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param assessing_threats_currentPK the primary key of the assessing_threats_current
	 * @return <code>true</code> if the assessing_threats_current is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessing_threats_current(long pk,
		long assessing_threats_currentPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, assessing_threats_currentPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_ASSESSING_THREATS_CURRENT,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsassessing_threats_current.contains(
							pk, assessing_threats_currentPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_ASSESSING_THREATS_CURRENT,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any assessing_threats_currents associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with assessing_threats_currents
	 * @return <code>true</code> if the site_assessment_versions has any assessing_threats_currents associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessing_threats_currents(long pk)
		throws SystemException {
		if (getassessing_threats_currentsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the threat_summary_currents associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the threat_summary_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		long pk) throws SystemException {
		return getthreat_summary_currents(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the threat_summary_currents associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of threat_summary_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		long pk, int start, int end) throws SystemException {
		return getthreat_summary_currents(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_currentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_currentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_currentImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_currentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_summary_currents",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the threat_summary_currents associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of threat_summary_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_current> getthreat_summary_currents(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.threat_summary_current> list = (List<com.iucn.whp.dbservice.model.threat_summary_current>)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETTHREAT_SUMMARY_CURRENTS.concat(ORDER_BY_CLAUSE)
														 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETTHREAT_SUMMARY_CURRENTS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_threat_summary_current",
					com.iucn.whp.dbservice.model.impl.threat_summary_currentImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.threat_summary_current>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS,
						finderArgs);
				}
				else {
					threat_summary_currentPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_currentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_currentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_currentImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_currentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_summary_currentsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of threat_summary_currents associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of threat_summary_currents associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getthreat_summary_currentsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETTHREAT_SUMMARY_CURRENTSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUMMARY_CURRENTS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_THREAT_SUMMARY_CURRENT = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_currentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_currentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_currentImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_currentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsthreat_summary_current",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the threat_summary_current is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param threat_summary_currentPK the primary key of the threat_summary_current
	 * @return <code>true</code> if the threat_summary_current is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_summary_current(long pk,
		long threat_summary_currentPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, threat_summary_currentPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_THREAT_SUMMARY_CURRENT,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsthreat_summary_current.contains(
							pk, threat_summary_currentPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_THREAT_SUMMARY_CURRENT,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any threat_summary_currents associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with threat_summary_currents
	 * @return <code>true</code> if the site_assessment_versions has any threat_summary_currents associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_summary_currents(long pk)
		throws SystemException {
		if (getthreat_summary_currentsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the threat_summary_potentials associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the threat_summary_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		long pk) throws SystemException {
		return getthreat_summary_potentials(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the threat_summary_potentials associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of threat_summary_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		long pk, int start, int end) throws SystemException {
		return getthreat_summary_potentials(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_potentialModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_potentialModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_potentialImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_potentialPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_summary_potentials",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the threat_summary_potentials associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of threat_summary_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_potential> getthreat_summary_potentials(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.threat_summary_potential> list = (List<com.iucn.whp.dbservice.model.threat_summary_potential>)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETTHREAT_SUMMARY_POTENTIALS.concat(ORDER_BY_CLAUSE)
														   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETTHREAT_SUMMARY_POTENTIALS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_threat_summary_potential",
					com.iucn.whp.dbservice.model.impl.threat_summary_potentialImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.threat_summary_potential>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS,
						finderArgs);
				}
				else {
					threat_summary_potentialPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_potentialModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_potentialModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_potentialImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_potentialPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_summary_potentialsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of threat_summary_potentials associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of threat_summary_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getthreat_summary_potentialsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETTHREAT_SUMMARY_POTENTIALSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUMMARY_POTENTIALS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_THREAT_SUMMARY_POTENTIAL =
		new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_potentialModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_potentialModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_potentialImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_potentialPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsthreat_summary_potential",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the threat_summary_potential is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param threat_summary_potentialPK the primary key of the threat_summary_potential
	 * @return <code>true</code> if the threat_summary_potential is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_summary_potential(long pk,
		long threat_summary_potentialPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, threat_summary_potentialPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_THREAT_SUMMARY_POTENTIAL,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsthreat_summary_potential.contains(
							pk, threat_summary_potentialPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_THREAT_SUMMARY_POTENTIAL,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any threat_summary_potentials associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with threat_summary_potentials
	 * @return <code>true</code> if the site_assessment_versions has any threat_summary_potentials associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_summary_potentials(long pk)
		throws SystemException {
		if (getthreat_summary_potentialsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the assessing_threats_potentials associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the assessing_threats_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessing_threats_potential> getassessing_threats_potentials(
		long pk) throws SystemException {
		return getassessing_threats_potentials(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the assessing_threats_potentials associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of assessing_threats_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessing_threats_potential> getassessing_threats_potentials(
		long pk, int start, int end) throws SystemException {
		return getassessing_threats_potentials(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS = new FinderPath(com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessing_threats_potentialPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessing_threats_potentials",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the assessing_threats_potentials associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessing_threats_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessing_threats_potential> getassessing_threats_potentials(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.assessing_threats_potential> list = (List<com.iucn.whp.dbservice.model.assessing_threats_potential>)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETASSESSING_THREATS_POTENTIALS.concat(ORDER_BY_CLAUSE)
															  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETASSESSING_THREATS_POTENTIALS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_assessing_threats_potential",
					com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.assessing_threats_potential>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS,
						finderArgs);
				}
				else {
					assessing_threats_potentialPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessing_threats_potentialPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessing_threats_potentialsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of assessing_threats_potentials associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of assessing_threats_potentials associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getassessing_threats_potentialsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETASSESSING_THREATS_POTENTIALSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSING_THREATS_POTENTIALS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_ASSESSING_THREATS_POTENTIAL =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_potentialModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessing_threats_potentialImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessing_threats_potentialPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsassessing_threats_potential",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the assessing_threats_potential is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param assessing_threats_potentialPK the primary key of the assessing_threats_potential
	 * @return <code>true</code> if the assessing_threats_potential is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessing_threats_potential(long pk,
		long assessing_threats_potentialPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, assessing_threats_potentialPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_ASSESSING_THREATS_POTENTIAL,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsassessing_threats_potential.contains(
							pk, assessing_threats_potentialPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_ASSESSING_THREATS_POTENTIAL,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any assessing_threats_potentials associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with assessing_threats_potentials
	 * @return <code>true</code> if the site_assessment_versions has any assessing_threats_potentials associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessing_threats_potentials(long pk)
		throws SystemException {
		if (getassessing_threats_potentialsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the threat_summary_overalls associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the threat_summary_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		long pk) throws SystemException {
		return getthreat_summary_overalls(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the threat_summary_overalls associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @return the range of threat_summary_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		long pk, int start, int end) throws SystemException {
		return getthreat_summary_overalls(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_overallPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_summary_overalls",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the threat_summary_overalls associated with the site_assessment_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param start the lower bound of the range of site_assessment_versionses
	 * @param end the upper bound of the range of site_assessment_versionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of threat_summary_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.threat_summary_overall> getthreat_summary_overalls(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.threat_summary_overall> list = (List<com.iucn.whp.dbservice.model.threat_summary_overall>)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETTHREAT_SUMMARY_OVERALLS.concat(ORDER_BY_CLAUSE)
														 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETTHREAT_SUMMARY_OVERALLS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_threat_summary_overall",
					com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.threat_summary_overall>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS,
						finderArgs);
				}
				else {
					threat_summary_overallPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_overallPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getthreat_summary_overallsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of threat_summary_overalls associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @return the number of threat_summary_overalls associated with the site_assessment_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int getthreat_summary_overallsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETTHREAT_SUMMARY_OVERALLSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_THREAT_SUMMARY_OVERALLS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_THREAT_SUMMARY_OVERALL = new FinderPath(com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_overallModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.threat_summary_overallImpl.class,
			com.iucn.whp.dbservice.service.persistence.threat_summary_overallPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsthreat_summary_overall",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the threat_summary_overall is associated with the site_assessment_versions.
	 *
	 * @param pk the primary key of the site_assessment_versions
	 * @param threat_summary_overallPK the primary key of the threat_summary_overall
	 * @return <code>true</code> if the threat_summary_overall is associated with the site_assessment_versions; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_summary_overall(long pk,
		long threat_summary_overallPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, threat_summary_overallPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_THREAT_SUMMARY_OVERALL,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsthreat_summary_overall.contains(
							pk, threat_summary_overallPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_THREAT_SUMMARY_OVERALL,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment_versions has any threat_summary_overalls associated with it.
	 *
	 * @param pk the primary key of the site_assessment_versions to check for associations with threat_summary_overalls
	 * @return <code>true</code> if the site_assessment_versions has any threat_summary_overalls associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsthreat_summary_overalls(long pk)
		throws SystemException {
		if (getthreat_summary_overallsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the site_assessment_versions persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.site_assessment_versions")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<site_assessment_versions>> listenersList = new ArrayList<ModelListener<site_assessment_versions>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<site_assessment_versions>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsactive_conservation_projects = new Containsactive_conservation_projects();

		containsassessment_whvalues = new Containsassessment_whvalues();

		containsbiodiversity_values = new Containsbiodiversity_values();

		containscurrent_state_trend = new Containscurrent_state_trend();

		containsstate_trend_whvalues = new Containsstate_trend_whvalues();

		containsreferences = new Containsreferences();

		containseffective_prot_mgmt_iothreats = new Containseffective_prot_mgmt_iothreats();

		containspotential_project_needs = new Containspotential_project_needs();

		containsstate_trend_biodivvals = new Containsstate_trend_biodivvals();

		containsprot_mgmt_best_practices = new Containsprot_mgmt_best_practices();

		containsprot_mgmt_overall = new Containsprot_mgmt_overall();

		containsprotection_management = new Containsprotection_management();

		containsbenefits_summary = new Containsbenefits_summary();

		containskey_conservation_issues = new Containskey_conservation_issues();

		containsconservation_outlook = new Containsconservation_outlook();

		containsbenefits = new Containsbenefits();

		containsassessing_threats_current = new Containsassessing_threats_current();

		containsthreat_summary_current = new Containsthreat_summary_current();

		containsthreat_summary_potential = new Containsthreat_summary_potential();

		containsassessing_threats_potential = new Containsassessing_threats_potential();

		containsthreat_summary_overall = new Containsthreat_summary_overall();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(site_assessment_versionsImpl.class.getName());
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
	protected Containsactive_conservation_projects containsactive_conservation_projects;
	protected Containsassessment_whvalues containsassessment_whvalues;
	protected Containsbiodiversity_values containsbiodiversity_values;
	protected Containscurrent_state_trend containscurrent_state_trend;
	protected Containsstate_trend_whvalues containsstate_trend_whvalues;
	protected Containsreferences containsreferences;
	protected Containseffective_prot_mgmt_iothreats containseffective_prot_mgmt_iothreats;
	protected Containspotential_project_needs containspotential_project_needs;
	protected Containsstate_trend_biodivvals containsstate_trend_biodivvals;
	protected Containsprot_mgmt_best_practices containsprot_mgmt_best_practices;
	protected Containsprot_mgmt_overall containsprot_mgmt_overall;
	protected Containsprotection_management containsprotection_management;
	protected Containsbenefits_summary containsbenefits_summary;
	protected Containskey_conservation_issues containskey_conservation_issues;
	protected Containsconservation_outlook containsconservation_outlook;
	protected Containsbenefits containsbenefits;
	protected Containsassessing_threats_current containsassessing_threats_current;
	protected Containsthreat_summary_current containsthreat_summary_current;
	protected Containsthreat_summary_potential containsthreat_summary_potential;
	protected Containsassessing_threats_potential containsassessing_threats_potential;
	protected Containsthreat_summary_overall containsthreat_summary_overall;

	protected class Containsactive_conservation_projects {
		protected Containsactive_conservation_projects() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSACTIVE_CONSERVATION_PROJECTS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long acpid) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(acpid)
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

	protected class Containsassessment_whvalues {
		protected Containsassessment_whvalues() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSASSESSMENT_WHVALUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long whvalues_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(whvalues_id)
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

	protected class Containsbiodiversity_values {
		protected Containsbiodiversity_values() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSBIODIVERSITY_VALUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(id)
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

	protected class Containscurrent_state_trend {
		protected Containscurrent_state_trend() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSCURRENT_STATE_TREND,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long state_trend_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(state_trend_id)
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

	protected class Containsstate_trend_whvalues {
		protected Containsstate_trend_whvalues() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSSTATE_TREND_WHVALUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long state_trend_whval_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(state_trend_whval_id)
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

	protected class Containsreferences {
		protected Containsreferences() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSREFERENCES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long reference_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(reference_id)
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

	protected class Containseffective_prot_mgmt_iothreats {
		protected Containseffective_prot_mgmt_iothreats() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSEFFECTIVE_PROT_MGMT_IOTHREATS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(id)
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

	protected class Containspotential_project_needs {
		protected Containspotential_project_needs() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPOTENTIAL_PROJECT_NEEDS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long ppn_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(ppn_id)
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

	protected class Containsstate_trend_biodivvals {
		protected Containsstate_trend_biodivvals() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSSTATE_TREND_BIODIVVALS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long state_trend_biodivvals_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(state_trend_biodivvals_id)
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

	protected class Containsprot_mgmt_best_practices {
		protected Containsprot_mgmt_best_practices() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPROT_MGMT_BEST_PRACTICES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long best_practice_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(best_practice_id)
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

	protected class Containsprot_mgmt_overall {
		protected Containsprot_mgmt_overall() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPROT_MGMT_OVERALL,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long pmo_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(pmo_id)
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

	protected class Containsprotection_management {
		protected Containsprotection_management() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPROTECTION_MANAGEMENT,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long pm_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(pm_id)
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

	protected class Containsbenefits_summary {
		protected Containsbenefits_summary() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSBENEFITS_SUMMARY,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long benefits_summary_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(benefits_summary_id)
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

	protected class Containskey_conservation_issues {
		protected Containskey_conservation_issues() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSKEY_CONSERVATION_ISSUES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long key_conservation_issues_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(key_conservation_issues_id)
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

	protected class Containsconservation_outlook {
		protected Containsconservation_outlook() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSCONSERVATION_OUTLOOK,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long conservation_outlook_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(conservation_outlook_id)
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

	protected class Containsbenefits {
		protected Containsbenefits() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSBENEFITS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id, long benefits_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id), new Long(benefits_id)
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

	protected class Containsassessing_threats_current {
		protected Containsassessing_threats_current() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSASSESSING_THREATS_CURRENT,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long current_threat_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(current_threat_id)
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

	protected class Containsthreat_summary_current {
		protected Containsthreat_summary_current() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSTHREAT_SUMMARY_CURRENT,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long threat_sum_cur_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(threat_sum_cur_id)
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

	protected class Containsthreat_summary_potential {
		protected Containsthreat_summary_potential() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSTHREAT_SUMMARY_POTENTIAL,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long threat_sum_potential_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(threat_sum_potential_id)
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

	protected class Containsassessing_threats_potential {
		protected Containsassessing_threats_potential() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSASSESSING_THREATS_POTENTIAL,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long potential_threat_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(potential_threat_id)
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

	protected class Containsthreat_summary_overall {
		protected Containsthreat_summary_overall() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSTHREAT_SUMMARY_OVERALL,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_version_id,
			long threat_sum_overall_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_version_id),
						new Long(threat_sum_overall_id)
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

	private static final String _SQL_SELECT_SITE_ASSESSMENT_VERSIONS = "SELECT site_assessment_versions FROM site_assessment_versions site_assessment_versions";
	private static final String _SQL_SELECT_SITE_ASSESSMENT_VERSIONS_WHERE = "SELECT site_assessment_versions FROM site_assessment_versions site_assessment_versions WHERE ";
	private static final String _SQL_COUNT_SITE_ASSESSMENT_VERSIONS = "SELECT COUNT(site_assessment_versions) FROM site_assessment_versions site_assessment_versions";
	private static final String _SQL_COUNT_SITE_ASSESSMENT_VERSIONS_WHERE = "SELECT COUNT(site_assessment_versions) FROM site_assessment_versions site_assessment_versions WHERE ";
	private static final String _SQL_GETACTIVE_CONSERVATION_PROJECTSES = "SELECT {whp_active_conservation_projects.*} FROM whp_active_conservation_projects INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_active_conservation_projects.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETACTIVE_CONSERVATION_PROJECTSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_active_conservation_projects WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSACTIVE_CONSERVATION_PROJECTS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_active_conservation_projects WHERE assessment_version_id = ? AND acpid = ?";
	private static final String _SQL_GETASSESSMENT_WHVALUESES = "SELECT {whp_assessment_whvalues.*} FROM whp_assessment_whvalues INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_assessment_whvalues.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETASSESSMENT_WHVALUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessment_whvalues WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSASSESSMENT_WHVALUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessment_whvalues WHERE assessment_version_id = ? AND whvalues_id = ?";
	private static final String _SQL_GETBIODIVERSITY_VALUESES = "SELECT {whp_biodiversity_values.*} FROM whp_biodiversity_values INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_biodiversity_values.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETBIODIVERSITY_VALUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_biodiversity_values WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSBIODIVERSITY_VALUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_biodiversity_values WHERE assessment_version_id = ? AND id_ = ?";
	private static final String _SQL_GETCURRENT_STATE_TRENDS = "SELECT {whp_current_state_trend.*} FROM whp_current_state_trend INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_current_state_trend.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETCURRENT_STATE_TRENDSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_state_trend WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSCURRENT_STATE_TREND = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_current_state_trend WHERE assessment_version_id = ? AND state_trend_id = ?";
	private static final String _SQL_GETSTATE_TREND_WHVALUESES = "SELECT {whp_state_trend_whvalues.*} FROM whp_state_trend_whvalues INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_state_trend_whvalues.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETSTATE_TREND_WHVALUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_state_trend_whvalues WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSSTATE_TREND_WHVALUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_state_trend_whvalues WHERE assessment_version_id = ? AND state_trend_whval_id = ?";
	private static final String _SQL_GETREFERENCESES = "SELECT {whp_references.*} FROM whp_references INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_references.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETREFERENCESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_references WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSREFERENCES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_references WHERE assessment_version_id = ? AND reference_id = ?";
	private static final String _SQL_GETEFFECTIVE_PROT_MGMT_IOTHREATSES = "SELECT {whp_effective_prot_mgmt_iothreats.*} FROM whp_effective_prot_mgmt_iothreats INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_effective_prot_mgmt_iothreats.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETEFFECTIVE_PROT_MGMT_IOTHREATSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_effective_prot_mgmt_iothreats WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSEFFECTIVE_PROT_MGMT_IOTHREATS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_effective_prot_mgmt_iothreats WHERE assessment_version_id = ? AND id_ = ?";
	private static final String _SQL_GETPOTENTIAL_PROJECT_NEEDSES = "SELECT {whp_potential_project_needs.*} FROM whp_potential_project_needs INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_potential_project_needs.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETPOTENTIAL_PROJECT_NEEDSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_potential_project_needs WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSPOTENTIAL_PROJECT_NEEDS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_potential_project_needs WHERE assessment_version_id = ? AND ppn_id = ?";
	private static final String _SQL_GETSTATE_TREND_BIODIVVALSES = "SELECT {whp_state_trend_biodivvals.*} FROM whp_state_trend_biodivvals INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_state_trend_biodivvals.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETSTATE_TREND_BIODIVVALSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_state_trend_biodivvals WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSSTATE_TREND_BIODIVVALS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_state_trend_biodivvals WHERE assessment_version_id = ? AND state_trend_biodivvals_id = ?";
	private static final String _SQL_GETPROT_MGMT_BEST_PRACTICESES = "SELECT {whp_prot_mgmt_best_practices.*} FROM whp_prot_mgmt_best_practices INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_prot_mgmt_best_practices.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETPROT_MGMT_BEST_PRACTICESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_prot_mgmt_best_practices WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSPROT_MGMT_BEST_PRACTICES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_prot_mgmt_best_practices WHERE assessment_version_id = ? AND best_practice_id = ?";
	private static final String _SQL_GETPROT_MGMT_OVERALLS = "SELECT {whp_prot_mgmt_overall.*} FROM whp_prot_mgmt_overall INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_prot_mgmt_overall.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETPROT_MGMT_OVERALLSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_prot_mgmt_overall WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSPROT_MGMT_OVERALL = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_prot_mgmt_overall WHERE assessment_version_id = ? AND pmo_id = ?";
	private static final String _SQL_GETPROTECTION_MANAGEMENTS = "SELECT {whp_protection_management.*} FROM whp_protection_management INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_protection_management.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETPROTECTION_MANAGEMENTSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_protection_management WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSPROTECTION_MANAGEMENT = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_protection_management WHERE assessment_version_id = ? AND pm_id = ?";
	private static final String _SQL_GETBENEFITS_SUMMARIES = "SELECT {whp_benefits_summary.*} FROM whp_benefits_summary INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_benefits_summary.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETBENEFITS_SUMMARIESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_benefits_summary WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSBENEFITS_SUMMARY = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_benefits_summary WHERE assessment_version_id = ? AND benefits_summary_id = ?";
	private static final String _SQL_GETKEY_CONSERVATION_ISSUESES = "SELECT {whp_key_conservation_issues.*} FROM whp_key_conservation_issues INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_key_conservation_issues.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETKEY_CONSERVATION_ISSUESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_key_conservation_issues WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSKEY_CONSERVATION_ISSUES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_key_conservation_issues WHERE assessment_version_id = ? AND key_conservation_issues_id = ?";
	private static final String _SQL_GETCONSERVATION_OUTLOOKS = "SELECT {whp_conservation_outlook.*} FROM whp_conservation_outlook INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_conservation_outlook.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETCONSERVATION_OUTLOOKSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_conservation_outlook WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSCONSERVATION_OUTLOOK = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_conservation_outlook WHERE assessment_version_id = ? AND conservation_outlook_id = ?";
	private static final String _SQL_GETBENEFITSES = "SELECT {whp_benefits.*} FROM whp_benefits INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_benefits.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETBENEFITSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_benefits WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSBENEFITS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_benefits WHERE assessment_version_id = ? AND benefits_id = ?";
	private static final String _SQL_GETASSESSING_THREATS_CURRENTS = "SELECT {whp_assessing_threats_current.*} FROM whp_assessing_threats_current INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_assessing_threats_current.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETASSESSING_THREATS_CURRENTSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessing_threats_current WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSASSESSING_THREATS_CURRENT = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessing_threats_current WHERE assessment_version_id = ? AND current_threat_id = ?";
	private static final String _SQL_GETTHREAT_SUMMARY_CURRENTS = "SELECT {whp_threat_summary_current.*} FROM whp_threat_summary_current INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_threat_summary_current.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETTHREAT_SUMMARY_CURRENTSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_summary_current WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSTHREAT_SUMMARY_CURRENT = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_summary_current WHERE assessment_version_id = ? AND threat_sum_cur_id = ?";
	private static final String _SQL_GETTHREAT_SUMMARY_POTENTIALS = "SELECT {whp_threat_summary_potential.*} FROM whp_threat_summary_potential INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_threat_summary_potential.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETTHREAT_SUMMARY_POTENTIALSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_summary_potential WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSTHREAT_SUMMARY_POTENTIAL = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_summary_potential WHERE assessment_version_id = ? AND threat_sum_potential_id = ?";
	private static final String _SQL_GETASSESSING_THREATS_POTENTIALS = "SELECT {whp_assessing_threats_potential.*} FROM whp_assessing_threats_potential INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_assessing_threats_potential.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETASSESSING_THREATS_POTENTIALSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessing_threats_potential WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSASSESSING_THREATS_POTENTIAL = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessing_threats_potential WHERE assessment_version_id = ? AND potential_threat_id = ?";
	private static final String _SQL_GETTHREAT_SUMMARY_OVERALLS = "SELECT {whp_threat_summary_overall.*} FROM whp_threat_summary_overall INNER JOIN whp_site_assessment_versions ON (whp_site_assessment_versions.assessment_version_id = whp_threat_summary_overall.assessment_version_id) WHERE (whp_site_assessment_versions.assessment_version_id = ?)";
	private static final String _SQL_GETTHREAT_SUMMARY_OVERALLSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_summary_overall WHERE assessment_version_id = ?";
	private static final String _SQL_CONTAINSTHREAT_SUMMARY_OVERALL = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_threat_summary_overall WHERE assessment_version_id = ? AND threat_sum_overall_id = ?";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "site_assessment_versions.userid = ?";
	private static final String _FINDER_COLUMN_ASSESSMENTID_ASSESSMENT_ID_2 = "site_assessment_versions.assessment_id = ?";
	private static final String _FINDER_COLUMN_PREVIOUSVERSIONCODE_ASSESSMENT_ID_2 =
		"site_assessment_versions.assessment_id = ? AND ";
	private static final String _FINDER_COLUMN_PREVIOUSVERSIONCODE_VERSION_CODE_2 =
		"site_assessment_versions.version_code = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "site_assessment_versions.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No site_assessment_versions exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No site_assessment_versions exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(site_assessment_versionsPersistenceImpl.class);
	private static site_assessment_versions _nullsite_assessment_versions = new site_assessment_versionsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<site_assessment_versions> toCacheModel() {
				return _nullsite_assessment_versionsCacheModel;
			}
		};

	private static CacheModel<site_assessment_versions> _nullsite_assessment_versionsCacheModel =
		new CacheModel<site_assessment_versions>() {
			public site_assessment_versions toEntityModel() {
				return _nullsite_assessment_versions;
			}
		};
}