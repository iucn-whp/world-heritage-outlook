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

import com.iucn.whp.dbservice.NoSuchassessment_lang_versionException;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.impl.assessment_lang_versionImpl;
import com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl;

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
 * The persistence implementation for the assessment_lang_version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see assessment_lang_versionPersistence
 * @see assessment_lang_versionUtil
 * @generated
 */
public class assessment_lang_versionPersistenceImpl extends BasePersistenceImpl<assessment_lang_version>
	implements assessment_lang_versionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link assessment_lang_versionUtil} to access the assessment_lang_version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = assessment_lang_versionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTID =
		new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByassessmentId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID =
		new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByassessmentId",
			new String[] { Long.class.getName() },
			assessment_lang_versionModelImpl.ASSESSMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTID = new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByassessmentId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID =
		new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassessmentIdAndLangId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID =
		new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessmentIdAndLangId",
			new String[] { Long.class.getName(), Long.class.getName() },
			assessment_lang_versionModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			assessment_lang_versionModelImpl.LANGUAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDLANGID = new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessmentIdAndLangId",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTVERSIONID =
		new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByassessmentVersionId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTVERSIONID =
		new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByassessmentVersionId", new String[] { Long.class.getName() },
			assessment_lang_versionModelImpl.ASSESSMENT_VERSION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTVERSIONID = new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByassessmentVersionId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the assessment_lang_version in the entity cache if it is enabled.
	 *
	 * @param assessment_lang_version the assessment_lang_version
	 */
	public void cacheResult(assessment_lang_version assessment_lang_version) {
		EntityCacheUtil.putResult(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			assessment_lang_version.getPrimaryKey(), assessment_lang_version);

		assessment_lang_version.resetOriginalValues();
	}

	/**
	 * Caches the assessment_lang_versions in the entity cache if it is enabled.
	 *
	 * @param assessment_lang_versions the assessment_lang_versions
	 */
	public void cacheResult(
		List<assessment_lang_version> assessment_lang_versions) {
		for (assessment_lang_version assessment_lang_version : assessment_lang_versions) {
			if (EntityCacheUtil.getResult(
						assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
						assessment_lang_versionImpl.class,
						assessment_lang_version.getPrimaryKey()) == null) {
				cacheResult(assessment_lang_version);
			}
			else {
				assessment_lang_version.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessment_lang_versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(assessment_lang_versionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(assessment_lang_versionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessment_lang_version.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(assessment_lang_version assessment_lang_version) {
		EntityCacheUtil.removeResult(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			assessment_lang_version.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<assessment_lang_version> assessment_lang_versions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (assessment_lang_version assessment_lang_version : assessment_lang_versions) {
			EntityCacheUtil.removeResult(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
				assessment_lang_versionImpl.class,
				assessment_lang_version.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessment_lang_version with the primary key. Does not add the assessment_lang_version to the database.
	 *
	 * @param lang_ver_id the primary key for the new assessment_lang_version
	 * @return the new assessment_lang_version
	 */
	public assessment_lang_version create(long lang_ver_id) {
		assessment_lang_version assessment_lang_version = new assessment_lang_versionImpl();

		assessment_lang_version.setNew(true);
		assessment_lang_version.setPrimaryKey(lang_ver_id);

		return assessment_lang_version;
	}

	/**
	 * Removes the assessment_lang_version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lang_ver_id the primary key of the assessment_lang_version
	 * @return the assessment_lang_version that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version remove(long lang_ver_id)
		throws NoSuchassessment_lang_versionException, SystemException {
		return remove(Long.valueOf(lang_ver_id));
	}

	/**
	 * Removes the assessment_lang_version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment_lang_version
	 * @return the assessment_lang_version that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_lang_version remove(Serializable primaryKey)
		throws NoSuchassessment_lang_versionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			assessment_lang_version assessment_lang_version = (assessment_lang_version)session.get(assessment_lang_versionImpl.class,
					primaryKey);

			if (assessment_lang_version == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchassessment_lang_versionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessment_lang_version);
		}
		catch (NoSuchassessment_lang_versionException nsee) {
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
	protected assessment_lang_version removeImpl(
		assessment_lang_version assessment_lang_version)
		throws SystemException {
		assessment_lang_version = toUnwrappedModel(assessment_lang_version);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, assessment_lang_version);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(assessment_lang_version);

		return assessment_lang_version;
	}

	@Override
	public assessment_lang_version updateImpl(
		com.iucn.whp.dbservice.model.assessment_lang_version assessment_lang_version,
		boolean merge) throws SystemException {
		assessment_lang_version = toUnwrappedModel(assessment_lang_version);

		boolean isNew = assessment_lang_version.isNew();

		assessment_lang_versionModelImpl assessment_lang_versionModelImpl = (assessment_lang_versionModelImpl)assessment_lang_version;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, assessment_lang_version, merge);

			assessment_lang_version.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !assessment_lang_versionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessment_lang_versionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessment_lang_versionModelImpl.getOriginalAssessmentid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID,
					args);

				args = new Object[] {
						Long.valueOf(assessment_lang_versionModelImpl.getAssessmentid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID,
					args);
			}

			if ((assessment_lang_versionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessment_lang_versionModelImpl.getOriginalAssessmentid()),
						Long.valueOf(assessment_lang_versionModelImpl.getOriginalLanguageid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDLANGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID,
					args);

				args = new Object[] {
						Long.valueOf(assessment_lang_versionModelImpl.getAssessmentid()),
						Long.valueOf(assessment_lang_versionModelImpl.getLanguageid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDLANGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID,
					args);
			}

			if ((assessment_lang_versionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTVERSIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(assessment_lang_versionModelImpl.getOriginalAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTVERSIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTVERSIONID,
					args);

				args = new Object[] {
						Long.valueOf(assessment_lang_versionModelImpl.getAssessment_version_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTVERSIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTVERSIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			assessment_lang_versionImpl.class,
			assessment_lang_version.getPrimaryKey(), assessment_lang_version);

		return assessment_lang_version;
	}

	protected assessment_lang_version toUnwrappedModel(
		assessment_lang_version assessment_lang_version) {
		if (assessment_lang_version instanceof assessment_lang_versionImpl) {
			return assessment_lang_version;
		}

		assessment_lang_versionImpl assessment_lang_versionImpl = new assessment_lang_versionImpl();

		assessment_lang_versionImpl.setNew(assessment_lang_version.isNew());
		assessment_lang_versionImpl.setPrimaryKey(assessment_lang_version.getPrimaryKey());

		assessment_lang_versionImpl.setLang_ver_id(assessment_lang_version.getLang_ver_id());
		assessment_lang_versionImpl.setAssessmentid(assessment_lang_version.getAssessmentid());
		assessment_lang_versionImpl.setAssessment_version_id(assessment_lang_version.getAssessment_version_id());
		assessment_lang_versionImpl.setLanguageid(assessment_lang_version.getLanguageid());
		assessment_lang_versionImpl.setPublished(assessment_lang_version.isPublished());
		assessment_lang_versionImpl.setPublished_date(assessment_lang_version.getPublished_date());

		return assessment_lang_versionImpl;
	}

	/**
	 * Returns the assessment_lang_version with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment_lang_version
	 * @return the assessment_lang_version
	 * @throws com.liferay.portal.NoSuchModelException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_lang_version findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessment_lang_version with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchassessment_lang_versionException} if it could not be found.
	 *
	 * @param lang_ver_id the primary key of the assessment_lang_version
	 * @return the assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByPrimaryKey(long lang_ver_id)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByPrimaryKey(lang_ver_id);

		if (assessment_lang_version == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + lang_ver_id);
			}

			throw new NoSuchassessment_lang_versionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				lang_ver_id);
		}

		return assessment_lang_version;
	}

	/**
	 * Returns the assessment_lang_version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment_lang_version
	 * @return the assessment_lang_version, or <code>null</code> if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public assessment_lang_version fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the assessment_lang_version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lang_ver_id the primary key of the assessment_lang_version
	 * @return the assessment_lang_version, or <code>null</code> if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByPrimaryKey(long lang_ver_id)
		throws SystemException {
		assessment_lang_version assessment_lang_version = (assessment_lang_version)EntityCacheUtil.getResult(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
				assessment_lang_versionImpl.class, lang_ver_id);

		if (assessment_lang_version == _nullassessment_lang_version) {
			return null;
		}

		if (assessment_lang_version == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				assessment_lang_version = (assessment_lang_version)session.get(assessment_lang_versionImpl.class,
						Long.valueOf(lang_ver_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (assessment_lang_version != null) {
					cacheResult(assessment_lang_version);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
						assessment_lang_versionImpl.class, lang_ver_id,
						_nullassessment_lang_version);
				}

				closeSession(session);
			}
		}

		return assessment_lang_version;
	}

	/**
	 * Returns all the assessment_lang_versions where assessmentid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @return the matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentId(long assessmentid)
		throws SystemException {
		return findByassessmentId(assessmentid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_lang_versions where assessmentid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @return the range of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentId(long assessmentid,
		int start, int end) throws SystemException {
		return findByassessmentId(assessmentid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_lang_versions where assessmentid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentId(long assessmentid,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTID;
			finderArgs = new Object[] { assessmentid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTID;
			finderArgs = new Object[] {
					assessmentid,
					
					start, end, orderByComparator
				};
		}

		List<assessment_lang_version> list = (List<assessment_lang_version>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessment_lang_version assessment_lang_version : list) {
				if ((assessmentid != assessment_lang_version.getAssessmentid())) {
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

			query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTID_ASSESSMENTID_2);

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

				qPos.add(assessmentid);

				list = (List<assessment_lang_version>)QueryUtil.list(q,
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
	 * Returns the first assessment_lang_version in the ordered set where assessmentid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByassessmentId_First(long assessmentid,
		OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByassessmentId_First(assessmentid,
				orderByComparator);

		if (assessment_lang_version != null) {
			return assessment_lang_version;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_lang_versionException(msg.toString());
	}

	/**
	 * Returns the first assessment_lang_version in the ordered set where assessmentid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByassessmentId_First(
		long assessmentid, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessment_lang_version> list = findByassessmentId(assessmentid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment_lang_version in the ordered set where assessmentid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByassessmentId_Last(long assessmentid,
		OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByassessmentId_Last(assessmentid,
				orderByComparator);

		if (assessment_lang_version != null) {
			return assessment_lang_version;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_lang_versionException(msg.toString());
	}

	/**
	 * Returns the last assessment_lang_version in the ordered set where assessmentid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByassessmentId_Last(long assessmentid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByassessmentId(assessmentid);

		List<assessment_lang_version> list = findByassessmentId(assessmentid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment_lang_versions before and after the current assessment_lang_version in the ordered set where assessmentid = &#63;.
	 *
	 * @param lang_ver_id the primary key of the current assessment_lang_version
	 * @param assessmentid the assessmentid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version[] findByassessmentId_PrevAndNext(
		long lang_ver_id, long assessmentid, OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = findByPrimaryKey(lang_ver_id);

		Session session = null;

		try {
			session = openSession();

			assessment_lang_version[] array = new assessment_lang_versionImpl[3];

			array[0] = getByassessmentId_PrevAndNext(session,
					assessment_lang_version, assessmentid, orderByComparator,
					true);

			array[1] = assessment_lang_version;

			array[2] = getByassessmentId_PrevAndNext(session,
					assessment_lang_version, assessmentid, orderByComparator,
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

	protected assessment_lang_version getByassessmentId_PrevAndNext(
		Session session, assessment_lang_version assessment_lang_version,
		long assessmentid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE);

		query.append(_FINDER_COLUMN_ASSESSMENTID_ASSESSMENTID_2);

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

		qPos.add(assessmentid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessment_lang_version);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessment_lang_version> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @return the matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentIdAndLangId(
		long assessmentid, long languageid) throws SystemException {
		return findByassessmentIdAndLangId(assessmentid, languageid,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @return the range of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentIdAndLangId(
		long assessmentid, long languageid, int start, int end)
		throws SystemException {
		return findByassessmentIdAndLangId(assessmentid, languageid, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentIdAndLangId(
		long assessmentid, long languageid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID;
			finderArgs = new Object[] { assessmentid, languageid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDLANGID;
			finderArgs = new Object[] {
					assessmentid, languageid,
					
					start, end, orderByComparator
				};
		}

		List<assessment_lang_version> list = (List<assessment_lang_version>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessment_lang_version assessment_lang_version : list) {
				if ((assessmentid != assessment_lang_version.getAssessmentid()) ||
						(languageid != assessment_lang_version.getLanguageid())) {
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

			query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDLANGID_ASSESSMENTID_2);

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDLANGID_LANGUAGEID_2);

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

				qPos.add(assessmentid);

				qPos.add(languageid);

				list = (List<assessment_lang_version>)QueryUtil.list(q,
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
	 * Returns the first assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByassessmentIdAndLangId_First(
		long assessmentid, long languageid, OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByassessmentIdAndLangId_First(assessmentid,
				languageid, orderByComparator);

		if (assessment_lang_version != null) {
			return assessment_lang_version;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", languageid=");
		msg.append(languageid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_lang_versionException(msg.toString());
	}

	/**
	 * Returns the first assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByassessmentIdAndLangId_First(
		long assessmentid, long languageid, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessment_lang_version> list = findByassessmentIdAndLangId(assessmentid,
				languageid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByassessmentIdAndLangId_Last(
		long assessmentid, long languageid, OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByassessmentIdAndLangId_Last(assessmentid,
				languageid, orderByComparator);

		if (assessment_lang_version != null) {
			return assessment_lang_version;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", languageid=");
		msg.append(languageid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_lang_versionException(msg.toString());
	}

	/**
	 * Returns the last assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByassessmentIdAndLangId_Last(
		long assessmentid, long languageid, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessmentIdAndLangId(assessmentid, languageid);

		List<assessment_lang_version> list = findByassessmentIdAndLangId(assessmentid,
				languageid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment_lang_versions before and after the current assessment_lang_version in the ordered set where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param lang_ver_id the primary key of the current assessment_lang_version
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version[] findByassessmentIdAndLangId_PrevAndNext(
		long lang_ver_id, long assessmentid, long languageid,
		OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = findByPrimaryKey(lang_ver_id);

		Session session = null;

		try {
			session = openSession();

			assessment_lang_version[] array = new assessment_lang_versionImpl[3];

			array[0] = getByassessmentIdAndLangId_PrevAndNext(session,
					assessment_lang_version, assessmentid, languageid,
					orderByComparator, true);

			array[1] = assessment_lang_version;

			array[2] = getByassessmentIdAndLangId_PrevAndNext(session,
					assessment_lang_version, assessmentid, languageid,
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

	protected assessment_lang_version getByassessmentIdAndLangId_PrevAndNext(
		Session session, assessment_lang_version assessment_lang_version,
		long assessmentid, long languageid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE);

		query.append(_FINDER_COLUMN_ASSESSMENTIDANDLANGID_ASSESSMENTID_2);

		query.append(_FINDER_COLUMN_ASSESSMENTIDANDLANGID_LANGUAGEID_2);

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

		qPos.add(assessmentid);

		qPos.add(languageid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessment_lang_version);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessment_lang_version> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessment_lang_versions where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentVersionId(
		long assessment_version_id) throws SystemException {
		return findByassessmentVersionId(assessment_version_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_lang_versions where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @return the range of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentVersionId(
		long assessment_version_id, int start, int end)
		throws SystemException {
		return findByassessmentVersionId(assessment_version_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_lang_versions where assessment_version_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findByassessmentVersionId(
		long assessment_version_id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTVERSIONID;
			finderArgs = new Object[] { assessment_version_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTVERSIONID;
			finderArgs = new Object[] {
					assessment_version_id,
					
					start, end, orderByComparator
				};
		}

		List<assessment_lang_version> list = (List<assessment_lang_version>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (assessment_lang_version assessment_lang_version : list) {
				if ((assessment_version_id != assessment_lang_version.getAssessment_version_id())) {
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

			query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTVERSIONID_ASSESSMENT_VERSION_ID_2);

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

				list = (List<assessment_lang_version>)QueryUtil.list(q,
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
	 * Returns the first assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByassessmentVersionId_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByassessmentVersionId_First(assessment_version_id,
				orderByComparator);

		if (assessment_lang_version != null) {
			return assessment_lang_version;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_lang_versionException(msg.toString());
	}

	/**
	 * Returns the first assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByassessmentVersionId_First(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		List<assessment_lang_version> list = findByassessmentVersionId(assessment_version_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version findByassessmentVersionId_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = fetchByassessmentVersionId_Last(assessment_version_id,
				orderByComparator);

		if (assessment_lang_version != null) {
			return assessment_lang_version;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessment_version_id=");
		msg.append(assessment_version_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchassessment_lang_versionException(msg.toString());
	}

	/**
	 * Returns the last assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment_lang_version, or <code>null</code> if a matching assessment_lang_version could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version fetchByassessmentVersionId_Last(
		long assessment_version_id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByassessmentVersionId(assessment_version_id);

		List<assessment_lang_version> list = findByassessmentVersionId(assessment_version_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment_lang_versions before and after the current assessment_lang_version in the ordered set where assessment_version_id = &#63;.
	 *
	 * @param lang_ver_id the primary key of the current assessment_lang_version
	 * @param assessment_version_id the assessment_version_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment_lang_version
	 * @throws com.iucn.whp.dbservice.NoSuchassessment_lang_versionException if a assessment_lang_version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public assessment_lang_version[] findByassessmentVersionId_PrevAndNext(
		long lang_ver_id, long assessment_version_id,
		OrderByComparator orderByComparator)
		throws NoSuchassessment_lang_versionException, SystemException {
		assessment_lang_version assessment_lang_version = findByPrimaryKey(lang_ver_id);

		Session session = null;

		try {
			session = openSession();

			assessment_lang_version[] array = new assessment_lang_versionImpl[3];

			array[0] = getByassessmentVersionId_PrevAndNext(session,
					assessment_lang_version, assessment_version_id,
					orderByComparator, true);

			array[1] = assessment_lang_version;

			array[2] = getByassessmentVersionId_PrevAndNext(session,
					assessment_lang_version, assessment_version_id,
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

	protected assessment_lang_version getByassessmentVersionId_PrevAndNext(
		Session session, assessment_lang_version assessment_lang_version,
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

		query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE);

		query.append(_FINDER_COLUMN_ASSESSMENTVERSIONID_ASSESSMENT_VERSION_ID_2);

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessment_lang_version);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<assessment_lang_version> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the assessment_lang_versions.
	 *
	 * @return the assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment_lang_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @return the range of assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment_lang_versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment_lang_versions
	 * @param end the upper bound of the range of assessment_lang_versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<assessment_lang_version> findAll(int start, int end,
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

		List<assessment_lang_version> list = (List<assessment_lang_version>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENT_LANG_VERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENT_LANG_VERSION;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<assessment_lang_version>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<assessment_lang_version>)QueryUtil.list(q,
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
	 * Removes all the assessment_lang_versions where assessmentid = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessmentId(long assessmentid)
		throws SystemException {
		for (assessment_lang_version assessment_lang_version : findByassessmentId(
				assessmentid)) {
			remove(assessment_lang_version);
		}
	}

	/**
	 * Removes all the assessment_lang_versions where assessmentid = &#63; and languageid = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessmentIdAndLangId(long assessmentid, long languageid)
		throws SystemException {
		for (assessment_lang_version assessment_lang_version : findByassessmentIdAndLangId(
				assessmentid, languageid)) {
			remove(assessment_lang_version);
		}
	}

	/**
	 * Removes all the assessment_lang_versions where assessment_version_id = &#63; from the database.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByassessmentVersionId(long assessment_version_id)
		throws SystemException {
		for (assessment_lang_version assessment_lang_version : findByassessmentVersionId(
				assessment_version_id)) {
			remove(assessment_lang_version);
		}
	}

	/**
	 * Removes all the assessment_lang_versions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (assessment_lang_version assessment_lang_version : findAll()) {
			remove(assessment_lang_version);
		}
	}

	/**
	 * Returns the number of assessment_lang_versions where assessmentid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @return the number of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessmentId(long assessmentid) throws SystemException {
		Object[] finderArgs = new Object[] { assessmentid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESSMENT_LANG_VERSION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTID_ASSESSMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessmentid);

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
	 * Returns the number of assessment_lang_versions where assessmentid = &#63; and languageid = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param languageid the languageid
	 * @return the number of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessmentIdAndLangId(long assessmentid, long languageid)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessmentid, languageid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDLANGID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSESSMENT_LANG_VERSION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDLANGID_ASSESSMENTID_2);

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDLANGID_LANGUAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessmentid);

				qPos.add(languageid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDLANGID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of assessment_lang_versions where assessment_version_id = &#63;.
	 *
	 * @param assessment_version_id the assessment_version_id
	 * @return the number of matching assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByassessmentVersionId(long assessment_version_id)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessment_version_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ASSESSMENTVERSIONID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESSMENT_LANG_VERSION_WHERE);

			query.append(_FINDER_COLUMN_ASSESSMENTVERSIONID_ASSESSMENT_VERSION_ID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSMENTVERSIONID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of assessment_lang_versions.
	 *
	 * @return the number of assessment_lang_versions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENT_LANG_VERSION);

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
	 * Initializes the assessment_lang_version persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.assessment_lang_version")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<assessment_lang_version>> listenersList = new ArrayList<ModelListener<assessment_lang_version>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<assessment_lang_version>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(assessment_lang_versionImpl.class.getName());
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
	private static final String _SQL_SELECT_ASSESSMENT_LANG_VERSION = "SELECT assessment_lang_version FROM assessment_lang_version assessment_lang_version";
	private static final String _SQL_SELECT_ASSESSMENT_LANG_VERSION_WHERE = "SELECT assessment_lang_version FROM assessment_lang_version assessment_lang_version WHERE ";
	private static final String _SQL_COUNT_ASSESSMENT_LANG_VERSION = "SELECT COUNT(assessment_lang_version) FROM assessment_lang_version assessment_lang_version";
	private static final String _SQL_COUNT_ASSESSMENT_LANG_VERSION_WHERE = "SELECT COUNT(assessment_lang_version) FROM assessment_lang_version assessment_lang_version WHERE ";
	private static final String _FINDER_COLUMN_ASSESSMENTID_ASSESSMENTID_2 = "assessment_lang_version.assessmentid = ?";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDLANGID_ASSESSMENTID_2 =
		"assessment_lang_version.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDLANGID_LANGUAGEID_2 =
		"assessment_lang_version.languageid = ?";
	private static final String _FINDER_COLUMN_ASSESSMENTVERSIONID_ASSESSMENT_VERSION_ID_2 =
		"assessment_lang_version.assessment_version_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessment_lang_version.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No assessment_lang_version exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No assessment_lang_version exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(assessment_lang_versionPersistenceImpl.class);
	private static assessment_lang_version _nullassessment_lang_version = new assessment_lang_versionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<assessment_lang_version> toCacheModel() {
				return _nullassessment_lang_versionCacheModel;
			}
		};

	private static CacheModel<assessment_lang_version> _nullassessment_lang_versionCacheModel =
		new CacheModel<assessment_lang_version>() {
			public assessment_lang_version toEntityModel() {
				return _nullassessment_lang_version;
			}
		};
}