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

import com.iucn.whp.dbservice.NoSuchsite_assessmentException;
import com.iucn.whp.dbservice.model.impl.site_assessmentImpl;
import com.iucn.whp.dbservice.model.impl.site_assessmentModelImpl;
import com.iucn.whp.dbservice.model.site_assessment;

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
 * The persistence implementation for the site_assessment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see site_assessmentPersistence
 * @see site_assessmentUtil
 * @generated
 */
public class site_assessmentPersistenceImpl extends BasePersistenceImpl<site_assessment>
	implements site_assessmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link site_assessmentUtil} to access the site_assessment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = site_assessmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CURRENTUSERID =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycurrentuserid",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENTUSERID =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycurrentuserid",
			new String[] { Long.class.getName() },
			site_assessmentModelImpl.CURRENT_USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CURRENTUSERID = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycurrentuserid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WIP_SITEIDS =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBywip_siteids",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WIP_SITEIDS =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBywip_siteids",
			new String[] { Long.class.getName() },
			site_assessmentModelImpl.SITE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WIP_SITEIDS = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBywip_siteids",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAllActiveSiteAssessment",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAllActiveSiteAssessment",
			new String[] { Boolean.class.getName() },
			site_assessmentModelImpl.ARCHIVED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALLACTIVESITEASSESSMENT = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAllActiveSiteAssessment",
			new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBysiteAssessmentByFlag",
			new String[] {
				Boolean.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG =
		new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBysiteAssessmentByFlag",
			new String[] { Boolean.class.getName(), Boolean.class.getName() },
			site_assessmentModelImpl.IS_ACTIVE_COLUMN_BITMASK |
			site_assessmentModelImpl.ARCHIVED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITEASSESSMENTBYFLAG = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBysiteAssessmentByFlag",
			new String[] { Boolean.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED,
			site_assessmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the site_assessment in the entity cache if it is enabled.
	 *
	 * @param site_assessment the site_assessment
	 */
	public void cacheResult(site_assessment site_assessment) {
		EntityCacheUtil.putResult(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentImpl.class, site_assessment.getPrimaryKey(),
			site_assessment);

		site_assessment.resetOriginalValues();
	}

	/**
	 * Caches the site_assessments in the entity cache if it is enabled.
	 *
	 * @param site_assessments the site_assessments
	 */
	public void cacheResult(List<site_assessment> site_assessments) {
		for (site_assessment site_assessment : site_assessments) {
			if (EntityCacheUtil.getResult(
						site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
						site_assessmentImpl.class,
						site_assessment.getPrimaryKey()) == null) {
				cacheResult(site_assessment);
			}
			else {
				site_assessment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all site_assessments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(site_assessmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(site_assessmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the site_assessment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(site_assessment site_assessment) {
		EntityCacheUtil.removeResult(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentImpl.class, site_assessment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<site_assessment> site_assessments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (site_assessment site_assessment : site_assessments) {
			EntityCacheUtil.removeResult(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
				site_assessmentImpl.class, site_assessment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new site_assessment with the primary key. Does not add the site_assessment to the database.
	 *
	 * @param assessment_id the primary key for the new site_assessment
	 * @return the new site_assessment
	 */
	public site_assessment create(long assessment_id) {
		site_assessment site_assessment = new site_assessmentImpl();

		site_assessment.setNew(true);
		site_assessment.setPrimaryKey(assessment_id);

		return site_assessment;
	}

	/**
	 * Removes the site_assessment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessment_id the primary key of the site_assessment
	 * @return the site_assessment that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment remove(long assessment_id)
		throws NoSuchsite_assessmentException, SystemException {
		return remove(Long.valueOf(assessment_id));
	}

	/**
	 * Removes the site_assessment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the site_assessment
	 * @return the site_assessment that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public site_assessment remove(Serializable primaryKey)
		throws NoSuchsite_assessmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			site_assessment site_assessment = (site_assessment)session.get(site_assessmentImpl.class,
					primaryKey);

			if (site_assessment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsite_assessmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(site_assessment);
		}
		catch (NoSuchsite_assessmentException nsee) {
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
	protected site_assessment removeImpl(site_assessment site_assessment)
		throws SystemException {
		site_assessment = toUnwrappedModel(site_assessment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, site_assessment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(site_assessment);

		return site_assessment;
	}

	@Override
	public site_assessment updateImpl(
		com.iucn.whp.dbservice.model.site_assessment site_assessment,
		boolean merge) throws SystemException {
		site_assessment = toUnwrappedModel(site_assessment);

		boolean isNew = site_assessment.isNew();

		site_assessmentModelImpl site_assessmentModelImpl = (site_assessmentModelImpl)site_assessment;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, site_assessment, merge);

			site_assessment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !site_assessmentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((site_assessmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENTUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(site_assessmentModelImpl.getOriginalCurrent_userid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CURRENTUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENTUSERID,
					args);

				args = new Object[] {
						Long.valueOf(site_assessmentModelImpl.getCurrent_userid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CURRENTUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENTUSERID,
					args);
			}

			if ((site_assessmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WIP_SITEIDS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(site_assessmentModelImpl.getOriginalSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WIP_SITEIDS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WIP_SITEIDS,
					args);

				args = new Object[] {
						Long.valueOf(site_assessmentModelImpl.getSite_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WIP_SITEIDS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WIP_SITEIDS,
					args);
			}

			if ((site_assessmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Boolean.valueOf(site_assessmentModelImpl.getOriginalArchived())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLACTIVESITEASSESSMENT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT,
					args);

				args = new Object[] {
						Boolean.valueOf(site_assessmentModelImpl.getArchived())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLACTIVESITEASSESSMENT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT,
					args);
			}

			if ((site_assessmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Boolean.valueOf(site_assessmentModelImpl.getOriginalIs_active()),
						Boolean.valueOf(site_assessmentModelImpl.getOriginalArchived())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEASSESSMENTBYFLAG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG,
					args);

				args = new Object[] {
						Boolean.valueOf(site_assessmentModelImpl.getIs_active()),
						Boolean.valueOf(site_assessmentModelImpl.getArchived())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SITEASSESSMENTBYFLAG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG,
					args);
			}
		}

		EntityCacheUtil.putResult(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
			site_assessmentImpl.class, site_assessment.getPrimaryKey(),
			site_assessment);

		return site_assessment;
	}

	protected site_assessment toUnwrappedModel(site_assessment site_assessment) {
		if (site_assessment instanceof site_assessmentImpl) {
			return site_assessment;
		}

		site_assessmentImpl site_assessmentImpl = new site_assessmentImpl();

		site_assessmentImpl.setNew(site_assessment.isNew());
		site_assessmentImpl.setPrimaryKey(site_assessment.getPrimaryKey());

		site_assessmentImpl.setAssessment_id(site_assessment.getAssessment_id());
		site_assessmentImpl.setSite_id(site_assessment.getSite_id());
		site_assessmentImpl.setStatus_id(site_assessment.getStatus_id());
		site_assessmentImpl.setInitiation_date(site_assessment.getInitiation_date());
		site_assessmentImpl.setCurrent_userid(site_assessment.getCurrent_userid());
		site_assessmentImpl.setCurrent_stageid(site_assessment.getCurrent_stageid());
		site_assessmentImpl.setAssessment_initiated_by(site_assessment.getAssessment_initiated_by());
		site_assessmentImpl.setBase_langid(site_assessment.getBase_langid());
		site_assessmentImpl.setArchived(site_assessment.isArchived());
		site_assessmentImpl.setIs_active(site_assessment.isIs_active());

		return site_assessmentImpl;
	}

	/**
	 * Returns the site_assessment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the site_assessment
	 * @return the site_assessment
	 * @throws com.liferay.portal.NoSuchModelException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public site_assessment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the site_assessment with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchsite_assessmentException} if it could not be found.
	 *
	 * @param assessment_id the primary key of the site_assessment
	 * @return the site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findByPrimaryKey(long assessment_id)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchByPrimaryKey(assessment_id);

		if (site_assessment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + assessment_id);
			}

			throw new NoSuchsite_assessmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				assessment_id);
		}

		return site_assessment;
	}

	/**
	 * Returns the site_assessment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the site_assessment
	 * @return the site_assessment, or <code>null</code> if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public site_assessment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the site_assessment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessment_id the primary key of the site_assessment
	 * @return the site_assessment, or <code>null</code> if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchByPrimaryKey(long assessment_id)
		throws SystemException {
		site_assessment site_assessment = (site_assessment)EntityCacheUtil.getResult(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
				site_assessmentImpl.class, assessment_id);

		if (site_assessment == _nullsite_assessment) {
			return null;
		}

		if (site_assessment == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				site_assessment = (site_assessment)session.get(site_assessmentImpl.class,
						Long.valueOf(assessment_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (site_assessment != null) {
					cacheResult(site_assessment);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(site_assessmentModelImpl.ENTITY_CACHE_ENABLED,
						site_assessmentImpl.class, assessment_id,
						_nullsite_assessment);
				}

				closeSession(session);
			}
		}

		return site_assessment;
	}

	/**
	 * Returns all the site_assessments where current_userid = &#63;.
	 *
	 * @param current_userid the current_userid
	 * @return the matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBycurrentuserid(long current_userid)
		throws SystemException {
		return findBycurrentuserid(current_userid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessments where current_userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param current_userid the current_userid
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBycurrentuserid(long current_userid,
		int start, int end) throws SystemException {
		return findBycurrentuserid(current_userid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessments where current_userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param current_userid the current_userid
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBycurrentuserid(long current_userid,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENTUSERID;
			finderArgs = new Object[] { current_userid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CURRENTUSERID;
			finderArgs = new Object[] {
					current_userid,
					
					start, end, orderByComparator
				};
		}

		List<site_assessment> list = (List<site_assessment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment site_assessment : list) {
				if ((current_userid != site_assessment.getCurrent_userid())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_CURRENTUSERID_CURRENT_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(current_userid);

				list = (List<site_assessment>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first site_assessment in the ordered set where current_userid = &#63;.
	 *
	 * @param current_userid the current_userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findBycurrentuserid_First(long current_userid,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchBycurrentuserid_First(current_userid,
				orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("current_userid=");
		msg.append(current_userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the first site_assessment in the ordered set where current_userid = &#63;.
	 *
	 * @param current_userid the current_userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchBycurrentuserid_First(long current_userid,
		OrderByComparator orderByComparator) throws SystemException {
		List<site_assessment> list = findBycurrentuserid(current_userid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment in the ordered set where current_userid = &#63;.
	 *
	 * @param current_userid the current_userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findBycurrentuserid_Last(long current_userid,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchBycurrentuserid_Last(current_userid,
				orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("current_userid=");
		msg.append(current_userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the last site_assessment in the ordered set where current_userid = &#63;.
	 *
	 * @param current_userid the current_userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchBycurrentuserid_Last(long current_userid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycurrentuserid(current_userid);

		List<site_assessment> list = findBycurrentuserid(current_userid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessments before and after the current site_assessment in the ordered set where current_userid = &#63;.
	 *
	 * @param assessment_id the primary key of the current site_assessment
	 * @param current_userid the current_userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment[] findBycurrentuserid_PrevAndNext(
		long assessment_id, long current_userid,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = findByPrimaryKey(assessment_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment[] array = new site_assessmentImpl[3];

			array[0] = getBycurrentuserid_PrevAndNext(session, site_assessment,
					current_userid, orderByComparator, true);

			array[1] = site_assessment;

			array[2] = getBycurrentuserid_PrevAndNext(session, site_assessment,
					current_userid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected site_assessment getBycurrentuserid_PrevAndNext(Session session,
		site_assessment site_assessment, long current_userid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

		query.append(_FINDER_COLUMN_CURRENTUSERID_CURRENT_USERID_2);

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

		else {
			query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(current_userid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessments where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBywip_siteids(long site_id)
		throws SystemException {
		return findBywip_siteids(site_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the site_assessments where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBywip_siteids(long site_id, int start,
		int end) throws SystemException {
		return findBywip_siteids(site_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessments where site_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param site_id the site_id
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBywip_siteids(long site_id, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WIP_SITEIDS;
			finderArgs = new Object[] { site_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WIP_SITEIDS;
			finderArgs = new Object[] { site_id, start, end, orderByComparator };
		}

		List<site_assessment> list = (List<site_assessment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment site_assessment : list) {
				if ((site_id != site_assessment.getSite_id())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_WIP_SITEIDS_SITE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(site_id);

				list = (List<site_assessment>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first site_assessment in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findBywip_siteids_First(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchBywip_siteids_First(site_id,
				orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the first site_assessment in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchBywip_siteids_First(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		List<site_assessment> list = findBywip_siteids(site_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findBywip_siteids_Last(long site_id,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchBywip_siteids_Last(site_id,
				orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("site_id=");
		msg.append(site_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the last site_assessment in the ordered set where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchBywip_siteids_Last(long site_id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBywip_siteids(site_id);

		List<site_assessment> list = findBywip_siteids(site_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessments before and after the current site_assessment in the ordered set where site_id = &#63;.
	 *
	 * @param assessment_id the primary key of the current site_assessment
	 * @param site_id the site_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment[] findBywip_siteids_PrevAndNext(long assessment_id,
		long site_id, OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = findByPrimaryKey(assessment_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment[] array = new site_assessmentImpl[3];

			array[0] = getBywip_siteids_PrevAndNext(session, site_assessment,
					site_id, orderByComparator, true);

			array[1] = site_assessment;

			array[2] = getBywip_siteids_PrevAndNext(session, site_assessment,
					site_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected site_assessment getBywip_siteids_PrevAndNext(Session session,
		site_assessment site_assessment, long site_id,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

		query.append(_FINDER_COLUMN_WIP_SITEIDS_SITE_ID_2);

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

		else {
			query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(site_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessments where archived = &#63;.
	 *
	 * @param archived the archived
	 * @return the matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findByAllActiveSiteAssessment(boolean archived)
		throws SystemException {
		return findByAllActiveSiteAssessment(archived, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessments where archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param archived the archived
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findByAllActiveSiteAssessment(
		boolean archived, int start, int end) throws SystemException {
		return findByAllActiveSiteAssessment(archived, start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessments where archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param archived the archived
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findByAllActiveSiteAssessment(
		boolean archived, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT;
			finderArgs = new Object[] { archived };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLACTIVESITEASSESSMENT;
			finderArgs = new Object[] { archived, start, end, orderByComparator };
		}

		List<site_assessment> list = (List<site_assessment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment site_assessment : list) {
				if ((archived != site_assessment.getArchived())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_ALLACTIVESITEASSESSMENT_ARCHIVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(archived);

				list = (List<site_assessment>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first site_assessment in the ordered set where archived = &#63;.
	 *
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findByAllActiveSiteAssessment_First(
		boolean archived, OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchByAllActiveSiteAssessment_First(archived,
				orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("archived=");
		msg.append(archived);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the first site_assessment in the ordered set where archived = &#63;.
	 *
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchByAllActiveSiteAssessment_First(
		boolean archived, OrderByComparator orderByComparator)
		throws SystemException {
		List<site_assessment> list = findByAllActiveSiteAssessment(archived, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment in the ordered set where archived = &#63;.
	 *
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findByAllActiveSiteAssessment_Last(
		boolean archived, OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchByAllActiveSiteAssessment_Last(archived,
				orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("archived=");
		msg.append(archived);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the last site_assessment in the ordered set where archived = &#63;.
	 *
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchByAllActiveSiteAssessment_Last(
		boolean archived, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAllActiveSiteAssessment(archived);

		List<site_assessment> list = findByAllActiveSiteAssessment(archived,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessments before and after the current site_assessment in the ordered set where archived = &#63;.
	 *
	 * @param assessment_id the primary key of the current site_assessment
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment[] findByAllActiveSiteAssessment_PrevAndNext(
		long assessment_id, boolean archived,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = findByPrimaryKey(assessment_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment[] array = new site_assessmentImpl[3];

			array[0] = getByAllActiveSiteAssessment_PrevAndNext(session,
					site_assessment, archived, orderByComparator, true);

			array[1] = site_assessment;

			array[2] = getByAllActiveSiteAssessment_PrevAndNext(session,
					site_assessment, archived, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected site_assessment getByAllActiveSiteAssessment_PrevAndNext(
		Session session, site_assessment site_assessment, boolean archived,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

		query.append(_FINDER_COLUMN_ALLACTIVESITEASSESSMENT_ARCHIVED_2);

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

		else {
			query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(archived);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessments where is_active = &#63; and archived = &#63;.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @return the matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBysiteAssessmentByFlag(boolean is_active,
		boolean archived) throws SystemException {
		return findBysiteAssessmentByFlag(is_active, archived,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessments where is_active = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBysiteAssessmentByFlag(boolean is_active,
		boolean archived, int start, int end) throws SystemException {
		return findBysiteAssessmentByFlag(is_active, archived, start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessments where is_active = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findBysiteAssessmentByFlag(boolean is_active,
		boolean archived, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG;
			finderArgs = new Object[] { is_active, archived };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SITEASSESSMENTBYFLAG;
			finderArgs = new Object[] {
					is_active, archived,
					
					start, end, orderByComparator
				};
		}

		List<site_assessment> list = (List<site_assessment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (site_assessment site_assessment : list) {
				if ((is_active != site_assessment.getIs_active()) ||
						(archived != site_assessment.getArchived())) {
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
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_SITEASSESSMENTBYFLAG_IS_ACTIVE_2);

			query.append(_FINDER_COLUMN_SITEASSESSMENTBYFLAG_ARCHIVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(is_active);

				qPos.add(archived);

				list = (List<site_assessment>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findBysiteAssessmentByFlag_First(boolean is_active,
		boolean archived, OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchBysiteAssessmentByFlag_First(is_active,
				archived, orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("is_active=");
		msg.append(is_active);

		msg.append(", archived=");
		msg.append(archived);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the first site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchBysiteAssessmentByFlag_First(
		boolean is_active, boolean archived, OrderByComparator orderByComparator)
		throws SystemException {
		List<site_assessment> list = findBysiteAssessmentByFlag(is_active,
				archived, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment findBysiteAssessmentByFlag_Last(boolean is_active,
		boolean archived, OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = fetchBysiteAssessmentByFlag_Last(is_active,
				archived, orderByComparator);

		if (site_assessment != null) {
			return site_assessment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("is_active=");
		msg.append(is_active);

		msg.append(", archived=");
		msg.append(archived);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsite_assessmentException(msg.toString());
	}

	/**
	 * Returns the last site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching site_assessment, or <code>null</code> if a matching site_assessment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment fetchBysiteAssessmentByFlag_Last(boolean is_active,
		boolean archived, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBysiteAssessmentByFlag(is_active, archived);

		List<site_assessment> list = findBysiteAssessmentByFlag(is_active,
				archived, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the site_assessments before and after the current site_assessment in the ordered set where is_active = &#63; and archived = &#63;.
	 *
	 * @param assessment_id the primary key of the current site_assessment
	 * @param is_active the is_active
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next site_assessment
	 * @throws com.iucn.whp.dbservice.NoSuchsite_assessmentException if a site_assessment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public site_assessment[] findBysiteAssessmentByFlag_PrevAndNext(
		long assessment_id, boolean is_active, boolean archived,
		OrderByComparator orderByComparator)
		throws NoSuchsite_assessmentException, SystemException {
		site_assessment site_assessment = findByPrimaryKey(assessment_id);

		Session session = null;

		try {
			session = openSession();

			site_assessment[] array = new site_assessmentImpl[3];

			array[0] = getBysiteAssessmentByFlag_PrevAndNext(session,
					site_assessment, is_active, archived, orderByComparator,
					true);

			array[1] = site_assessment;

			array[2] = getBysiteAssessmentByFlag_PrevAndNext(session,
					site_assessment, is_active, archived, orderByComparator,
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

	protected site_assessment getBysiteAssessmentByFlag_PrevAndNext(
		Session session, site_assessment site_assessment, boolean is_active,
		boolean archived, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITE_ASSESSMENT_WHERE);

		query.append(_FINDER_COLUMN_SITEASSESSMENTBYFLAG_IS_ACTIVE_2);

		query.append(_FINDER_COLUMN_SITEASSESSMENTBYFLAG_ARCHIVED_2);

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

		else {
			query.append(site_assessmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(is_active);

		qPos.add(archived);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(site_assessment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<site_assessment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the site_assessments.
	 *
	 * @return the site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the site_assessments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the site_assessments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public List<site_assessment> findAll(int start, int end,
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

		List<site_assessment> list = (List<site_assessment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SITE_ASSESSMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SITE_ASSESSMENT.concat(site_assessmentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<site_assessment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<site_assessment>)QueryUtil.list(q,
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
	 * Removes all the site_assessments where current_userid = &#63; from the database.
	 *
	 * @param current_userid the current_userid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBycurrentuserid(long current_userid)
		throws SystemException {
		for (site_assessment site_assessment : findBycurrentuserid(
				current_userid)) {
			remove(site_assessment);
		}
	}

	/**
	 * Removes all the site_assessments where site_id = &#63; from the database.
	 *
	 * @param site_id the site_id
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBywip_siteids(long site_id) throws SystemException {
		for (site_assessment site_assessment : findBywip_siteids(site_id)) {
			remove(site_assessment);
		}
	}

	/**
	 * Removes all the site_assessments where archived = &#63; from the database.
	 *
	 * @param archived the archived
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAllActiveSiteAssessment(boolean archived)
		throws SystemException {
		for (site_assessment site_assessment : findByAllActiveSiteAssessment(
				archived)) {
			remove(site_assessment);
		}
	}

	/**
	 * Removes all the site_assessments where is_active = &#63; and archived = &#63; from the database.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBysiteAssessmentByFlag(boolean is_active, boolean archived)
		throws SystemException {
		for (site_assessment site_assessment : findBysiteAssessmentByFlag(
				is_active, archived)) {
			remove(site_assessment);
		}
	}

	/**
	 * Removes all the site_assessments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (site_assessment site_assessment : findAll()) {
			remove(site_assessment);
		}
	}

	/**
	 * Returns the number of site_assessments where current_userid = &#63;.
	 *
	 * @param current_userid the current_userid
	 * @return the number of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public int countBycurrentuserid(long current_userid)
		throws SystemException {
		Object[] finderArgs = new Object[] { current_userid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CURRENTUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_CURRENTUSERID_CURRENT_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(current_userid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CURRENTUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessments where site_id = &#63;.
	 *
	 * @param site_id the site_id
	 * @return the number of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public int countBywip_siteids(long site_id) throws SystemException {
		Object[] finderArgs = new Object[] { site_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_WIP_SITEIDS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_WIP_SITEIDS_SITE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(site_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_WIP_SITEIDS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessments where archived = &#63;.
	 *
	 * @param archived the archived
	 * @return the number of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAllActiveSiteAssessment(boolean archived)
		throws SystemException {
		Object[] finderArgs = new Object[] { archived };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ALLACTIVESITEASSESSMENT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_ALLACTIVESITEASSESSMENT_ARCHIVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(archived);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ALLACTIVESITEASSESSMENT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessments where is_active = &#63; and archived = &#63;.
	 *
	 * @param is_active the is_active
	 * @param archived the archived
	 * @return the number of matching site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public int countBysiteAssessmentByFlag(boolean is_active, boolean archived)
		throws SystemException {
		Object[] finderArgs = new Object[] { is_active, archived };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SITEASSESSMENTBYFLAG,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SITE_ASSESSMENT_WHERE);

			query.append(_FINDER_COLUMN_SITEASSESSMENTBYFLAG_IS_ACTIVE_2);

			query.append(_FINDER_COLUMN_SITEASSESSMENTBYFLAG_ARCHIVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(is_active);

				qPos.add(archived);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SITEASSESSMENTBYFLAG,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of site_assessments.
	 *
	 * @return the number of site_assessments
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SITE_ASSESSMENT);

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
	 * Returns all the site_assessment_versionses associated with the site_assessment.
	 *
	 * @param pk the primary key of the site_assessment
	 * @return the site_assessment_versionses associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		long pk) throws SystemException {
		return getsite_assessment_versionses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the site_assessment_versionses associated with the site_assessment.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of site_assessment_versionses associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		long pk, int start, int end) throws SystemException {
		return getsite_assessment_versionses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES = new FinderPath(com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl.class,
			com.iucn.whp.dbservice.service.persistence.site_assessment_versionsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getsite_assessment_versionses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the site_assessment_versionses associated with the site_assessment.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of site_assessment_versionses associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.site_assessment_versions> getsite_assessment_versionses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.site_assessment_versions> list = (List<com.iucn.whp.dbservice.model.site_assessment_versions>)FinderCacheUtil.getResult(FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETSITE_ASSESSMENT_VERSIONSES.concat(ORDER_BY_CLAUSE)
															.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETSITE_ASSESSMENT_VERSIONSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_site_assessment_versions",
					com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.site_assessment_versions>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES,
						finderArgs);
				}
				else {
					site_assessment_versionsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl.class,
			com.iucn.whp.dbservice.service.persistence.site_assessment_versionsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getsite_assessment_versionsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of site_assessment_versionses associated with the site_assessment.
	 *
	 * @param pk the primary key of the site_assessment
	 * @return the number of site_assessment_versionses associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public int getsite_assessment_versionsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETSITE_ASSESSMENT_VERSIONSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_SITE_ASSESSMENT_VERSIONSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_SITE_ASSESSMENT_VERSIONS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.site_assessment_versionsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl.class,
			com.iucn.whp.dbservice.service.persistence.site_assessment_versionsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containssite_assessment_versions",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the site_assessment_versions is associated with the site_assessment.
	 *
	 * @param pk the primary key of the site_assessment
	 * @param site_assessment_versionsPK the primary key of the site_assessment_versions
	 * @return <code>true</code> if the site_assessment_versions is associated with the site_assessment; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containssite_assessment_versions(long pk,
		long site_assessment_versionsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, site_assessment_versionsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_SITE_ASSESSMENT_VERSIONS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containssite_assessment_versions.contains(
							pk, site_assessment_versionsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_SITE_ASSESSMENT_VERSIONS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment has any site_assessment_versionses associated with it.
	 *
	 * @param pk the primary key of the site_assessment to check for associations with site_assessment_versionses
	 * @return <code>true</code> if the site_assessment has any site_assessment_versionses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containssite_assessment_versionses(long pk)
		throws SystemException {
		if (getsite_assessment_versionsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the assessment_lang_versions associated with the site_assessment.
	 *
	 * @param pk the primary key of the site_assessment
	 * @return the assessment_lang_versions associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_lang_version> getassessment_lang_versions(
		long pk) throws SystemException {
		return getassessment_lang_versions(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the assessment_lang_versions associated with the site_assessment.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @return the range of assessment_lang_versions associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_lang_version> getassessment_lang_versions(
		long pk, int start, int end) throws SystemException {
		return getassessment_lang_versions(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS = new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_lang_versionImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_lang_versionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessment_lang_versions",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the assessment_lang_versions associated with the site_assessment.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the site_assessment
	 * @param start the lower bound of the range of site_assessments
	 * @param end the upper bound of the range of site_assessments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment_lang_versions associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.assessment_lang_version> getassessment_lang_versions(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.assessment_lang_version> list = (List<com.iucn.whp.dbservice.model.assessment_lang_version>)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETASSESSMENT_LANG_VERSIONS.concat(ORDER_BY_CLAUSE)
														  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETASSESSMENT_LANG_VERSIONS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_assessment_lang_version",
					com.iucn.whp.dbservice.model.impl.assessment_lang_versionImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.assessment_lang_version>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS,
						finderArgs);
				}
				else {
					assessment_lang_versionPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_lang_versionImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_lang_versionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getassessment_lang_versionsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of assessment_lang_versions associated with the site_assessment.
	 *
	 * @param pk the primary key of the site_assessment
	 * @return the number of assessment_lang_versions associated with the site_assessment
	 * @throws SystemException if a system exception occurred
	 */
	public int getassessment_lang_versionsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETASSESSMENT_LANG_VERSIONSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_ASSESSMENT_LANG_VERSIONS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_ASSESSMENT_LANG_VERSION = new FinderPath(com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_lang_versionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.assessment_lang_versionImpl.class,
			com.iucn.whp.dbservice.service.persistence.assessment_lang_versionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsassessment_lang_version",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the assessment_lang_version is associated with the site_assessment.
	 *
	 * @param pk the primary key of the site_assessment
	 * @param assessment_lang_versionPK the primary key of the assessment_lang_version
	 * @return <code>true</code> if the assessment_lang_version is associated with the site_assessment; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessment_lang_version(long pk,
		long assessment_lang_versionPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, assessment_lang_versionPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_ASSESSMENT_LANG_VERSION,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsassessment_lang_version.contains(
							pk, assessment_lang_versionPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_ASSESSMENT_LANG_VERSION,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the site_assessment has any assessment_lang_versions associated with it.
	 *
	 * @param pk the primary key of the site_assessment to check for associations with assessment_lang_versions
	 * @return <code>true</code> if the site_assessment has any assessment_lang_versions associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsassessment_lang_versions(long pk)
		throws SystemException {
		if (getassessment_lang_versionsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the site_assessment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.site_assessment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<site_assessment>> listenersList = new ArrayList<ModelListener<site_assessment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<site_assessment>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containssite_assessment_versions = new Containssite_assessment_versions();

		containsassessment_lang_version = new Containsassessment_lang_version();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(site_assessmentImpl.class.getName());
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
	protected Containssite_assessment_versions containssite_assessment_versions;
	protected Containsassessment_lang_version containsassessment_lang_version;

	protected class Containssite_assessment_versions {
		protected Containssite_assessment_versions() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSSITE_ASSESSMENT_VERSIONS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_id,
			long assessment_version_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_id), new Long(assessment_version_id)
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

	protected class Containsassessment_lang_version {
		protected Containsassessment_lang_version() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSASSESSMENT_LANG_VERSION,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long assessment_id, long lang_ver_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(assessment_id), new Long(lang_ver_id)
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

	private static final String _SQL_SELECT_SITE_ASSESSMENT = "SELECT site_assessment FROM site_assessment site_assessment";
	private static final String _SQL_SELECT_SITE_ASSESSMENT_WHERE = "SELECT site_assessment FROM site_assessment site_assessment WHERE ";
	private static final String _SQL_COUNT_SITE_ASSESSMENT = "SELECT COUNT(site_assessment) FROM site_assessment site_assessment";
	private static final String _SQL_COUNT_SITE_ASSESSMENT_WHERE = "SELECT COUNT(site_assessment) FROM site_assessment site_assessment WHERE ";
	private static final String _SQL_GETSITE_ASSESSMENT_VERSIONSES = "SELECT {whp_site_assessment_versions.*} FROM whp_site_assessment_versions INNER JOIN whp_site_assessment ON (whp_site_assessment.assessment_id = whp_site_assessment_versions.assessment_id) WHERE (whp_site_assessment.assessment_id = ?)";
	private static final String _SQL_GETSITE_ASSESSMENT_VERSIONSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_site_assessment_versions WHERE assessment_id = ?";
	private static final String _SQL_CONTAINSSITE_ASSESSMENT_VERSIONS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_site_assessment_versions WHERE assessment_id = ? AND assessment_version_id = ?";
	private static final String _SQL_GETASSESSMENT_LANG_VERSIONS = "SELECT {whp_assessment_lang_version.*} FROM whp_assessment_lang_version INNER JOIN whp_site_assessment ON (whp_site_assessment.assessment_id = whp_assessment_lang_version.assessment_id) WHERE (whp_site_assessment.assessment_id = ?)";
	private static final String _SQL_GETASSESSMENT_LANG_VERSIONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessment_lang_version WHERE assessment_id = ?";
	private static final String _SQL_CONTAINSASSESSMENT_LANG_VERSION = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_assessment_lang_version WHERE assessment_id = ? AND lang_ver_id = ?";
	private static final String _FINDER_COLUMN_CURRENTUSERID_CURRENT_USERID_2 = "site_assessment.current_userid = ? AND site_assessment.archived is false";
	private static final String _FINDER_COLUMN_WIP_SITEIDS_SITE_ID_2 = "site_assessment.site_id = ? AND site_assessment.archived is false";
	private static final String _FINDER_COLUMN_ALLACTIVESITEASSESSMENT_ARCHIVED_2 =
		"site_assessment.archived = ? AND site_assessment.archived is false";
	private static final String _FINDER_COLUMN_SITEASSESSMENTBYFLAG_IS_ACTIVE_2 = "site_assessment.is_active = ? AND ";
	private static final String _FINDER_COLUMN_SITEASSESSMENTBYFLAG_ARCHIVED_2 = "site_assessment.archived = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "site_assessment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No site_assessment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No site_assessment exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(site_assessmentPersistenceImpl.class);
	private static site_assessment _nullsite_assessment = new site_assessmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<site_assessment> toCacheModel() {
				return _nullsite_assessmentCacheModel;
			}
		};

	private static CacheModel<site_assessment> _nullsite_assessmentCacheModel = new CacheModel<site_assessment>() {
			public site_assessment toEntityModel() {
				return _nullsite_assessment;
			}
		};
}