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

import com.iucn.whp.dbservice.NoSuch_sitesException;
import com.iucn.whp.dbservice.model.impl.whp_sitesImpl;
import com.iucn.whp.dbservice.model.impl.whp_sitesModelImpl;
import com.iucn.whp.dbservice.model.whp_sites;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ImagePersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the whp_sites service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_sitesPersistence
 * @see whp_sitesUtil
 * @generated
 */
public class whp_sitesPersistenceImpl extends BasePersistenceImpl<whp_sites>
	implements whp_sitesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link whp_sitesUtil} to access the whp_sites persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = whp_sitesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_NAMEEN = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBynameEn",
			new String[] { String.class.getName() },
			whp_sitesModelImpl.NAME_EN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAMEEN = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBynameEn",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESITES =
		new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByactiveSites",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESITES =
		new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByactiveSites",
			new String[] { Boolean.class.getName() },
			whp_sitesModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVESITES = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByactiveSites",
			new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBythumbnailid_small",
			new String[] { Long.class.getName() },
			whp_sitesModelImpl.THUMBNAILID_SMALL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUMBNAILID_SMALL = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBythumbnailid_small", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_THUMBNAILID = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBythumbnailid",
			new String[] { Long.class.getName() },
			whp_sitesModelImpl.THUMBNAILID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUMBNAILID = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythumbnailid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_WDPAID = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBywdpaid",
			new String[] { Long.class.getName() },
			whp_sitesModelImpl.WDPA_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WDPAID = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBywdpaid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, whp_sitesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the whp_sites in the entity cache if it is enabled.
	 *
	 * @param whp_sites the whp_sites
	 */
	public void cacheResult(whp_sites whp_sites) {
		EntityCacheUtil.putResult(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesImpl.class, whp_sites.getPrimaryKey(), whp_sites);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAMEEN,
			new Object[] { whp_sites.getName_en() }, whp_sites);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
			new Object[] { Long.valueOf(whp_sites.getThumbnailid_small()) },
			whp_sites);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
			new Object[] { Long.valueOf(whp_sites.getThumbnailid()) }, whp_sites);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WDPAID,
			new Object[] { Long.valueOf(whp_sites.getWdpa_id()) }, whp_sites);

		whp_sites.resetOriginalValues();
	}

	/**
	 * Caches the whp_siteses in the entity cache if it is enabled.
	 *
	 * @param whp_siteses the whp_siteses
	 */
	public void cacheResult(List<whp_sites> whp_siteses) {
		for (whp_sites whp_sites : whp_siteses) {
			if (EntityCacheUtil.getResult(
						whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
						whp_sitesImpl.class, whp_sites.getPrimaryKey()) == null) {
				cacheResult(whp_sites);
			}
			else {
				whp_sites.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all whp_siteses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(whp_sitesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(whp_sitesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the whp_sites.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(whp_sites whp_sites) {
		EntityCacheUtil.removeResult(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesImpl.class, whp_sites.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(whp_sites);
	}

	@Override
	public void clearCache(List<whp_sites> whp_siteses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (whp_sites whp_sites : whp_siteses) {
			EntityCacheUtil.removeResult(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
				whp_sitesImpl.class, whp_sites.getPrimaryKey());

			clearUniqueFindersCache(whp_sites);
		}
	}

	protected void clearUniqueFindersCache(whp_sites whp_sites) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAMEEN,
			new Object[] { whp_sites.getName_en() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
			new Object[] { Long.valueOf(whp_sites.getThumbnailid_small()) });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
			new Object[] { Long.valueOf(whp_sites.getThumbnailid()) });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_WDPAID,
			new Object[] { Long.valueOf(whp_sites.getWdpa_id()) });
	}

	/**
	 * Creates a new whp_sites with the primary key. Does not add the whp_sites to the database.
	 *
	 * @param site_id the primary key for the new whp_sites
	 * @return the new whp_sites
	 */
	public whp_sites create(long site_id) {
		whp_sites whp_sites = new whp_sitesImpl();

		whp_sites.setNew(true);
		whp_sites.setPrimaryKey(site_id);

		return whp_sites;
	}

	/**
	 * Removes the whp_sites with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param site_id the primary key of the whp_sites
	 * @return the whp_sites that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites remove(long site_id)
		throws NoSuch_sitesException, SystemException {
		return remove(Long.valueOf(site_id));
	}

	/**
	 * Removes the whp_sites with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the whp_sites
	 * @return the whp_sites that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites remove(Serializable primaryKey)
		throws NoSuch_sitesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			whp_sites whp_sites = (whp_sites)session.get(whp_sitesImpl.class,
					primaryKey);

			if (whp_sites == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_sitesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(whp_sites);
		}
		catch (NoSuch_sitesException nsee) {
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
	protected whp_sites removeImpl(whp_sites whp_sites)
		throws SystemException {
		whp_sites = toUnwrappedModel(whp_sites);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, whp_sites);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(whp_sites);

		return whp_sites;
	}

	@Override
	public whp_sites updateImpl(
		com.iucn.whp.dbservice.model.whp_sites whp_sites, boolean merge)
		throws SystemException {
		whp_sites = toUnwrappedModel(whp_sites);

		boolean isNew = whp_sites.isNew();

		whp_sitesModelImpl whp_sitesModelImpl = (whp_sitesModelImpl)whp_sites;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, whp_sites, merge);

			whp_sites.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !whp_sitesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((whp_sitesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESITES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Boolean.valueOf(whp_sitesModelImpl.getOriginalActive())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESITES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESITES,
					args);

				args = new Object[] {
						Boolean.valueOf(whp_sitesModelImpl.getActive())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESITES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESITES,
					args);
			}
		}

		EntityCacheUtil.putResult(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
			whp_sitesImpl.class, whp_sites.getPrimaryKey(), whp_sites);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAMEEN,
				new Object[] { whp_sites.getName_en() }, whp_sites);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
				new Object[] { Long.valueOf(whp_sites.getThumbnailid_small()) },
				whp_sites);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
				new Object[] { Long.valueOf(whp_sites.getThumbnailid()) },
				whp_sites);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WDPAID,
				new Object[] { Long.valueOf(whp_sites.getWdpa_id()) }, whp_sites);
		}
		else {
			if ((whp_sitesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_NAMEEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						whp_sitesModelImpl.getOriginalName_en()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAMEEN, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAMEEN, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAMEEN,
					new Object[] { whp_sites.getName_en() }, whp_sites);
			}

			if ((whp_sitesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(whp_sitesModelImpl.getOriginalThumbnailid_small())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUMBNAILID_SMALL,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
					new Object[] { Long.valueOf(
							whp_sites.getThumbnailid_small()) }, whp_sites);
			}

			if ((whp_sitesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUMBNAILID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(whp_sitesModelImpl.getOriginalThumbnailid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUMBNAILID,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
					new Object[] { Long.valueOf(whp_sites.getThumbnailid()) },
					whp_sites);
			}

			if ((whp_sitesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_WDPAID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(whp_sitesModelImpl.getOriginalWdpa_id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WDPAID, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_WDPAID, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WDPAID,
					new Object[] { Long.valueOf(whp_sites.getWdpa_id()) },
					whp_sites);
			}
		}

		return whp_sites;
	}

	protected whp_sites toUnwrappedModel(whp_sites whp_sites) {
		if (whp_sites instanceof whp_sitesImpl) {
			return whp_sites;
		}

		whp_sitesImpl whp_sitesImpl = new whp_sitesImpl();

		whp_sitesImpl.setNew(whp_sites.isNew());
		whp_sitesImpl.setPrimaryKey(whp_sites.getPrimaryKey());

		whp_sitesImpl.setSite_id(whp_sites.getSite_id());
		whp_sitesImpl.setGroupId(whp_sites.getGroupId());
		whp_sitesImpl.setCompanyId(whp_sites.getCompanyId());
		whp_sitesImpl.setWdpa_id(whp_sites.getWdpa_id());
		whp_sitesImpl.setUnesco_id(whp_sites.getUnesco_id());
		whp_sitesImpl.setName_en(whp_sites.getName_en());
		whp_sitesImpl.setName_fr(whp_sites.getName_fr());
		whp_sitesImpl.setTransboundary(whp_sites.isTransboundary());
		whp_sitesImpl.setInscription_date(whp_sites.getInscription_date());
		whp_sitesImpl.setMixed_site(whp_sites.isMixed_site());
		whp_sitesImpl.setCultural_landscape(whp_sites.isCultural_landscape());
		whp_sitesImpl.setDanger_list(whp_sites.isDanger_list());
		whp_sitesImpl.setArea(whp_sites.getArea());
		whp_sitesImpl.setBuffer_zone(whp_sites.isBuffer_zone());
		whp_sitesImpl.setBuffer_zone_area(whp_sites.getBuffer_zone_area());
		whp_sitesImpl.setBoundary_modification(whp_sites.isBoundary_modification());
		whp_sitesImpl.setSerial(whp_sites.isSerial());
		whp_sitesImpl.setMissions(whp_sites.isMissions());
		whp_sitesImpl.setSoc_reports(whp_sites.isSoc_reports());
		whp_sitesImpl.setSoouv(whp_sites.isSoouv());
		whp_sitesImpl.setDsocr(whp_sites.isDsocr());
		whp_sitesImpl.setManagement_plan(whp_sites.isManagement_plan());
		whp_sitesImpl.setMee(whp_sites.isMee());
		whp_sitesImpl.setStaff(whp_sites.getStaff());
		whp_sitesImpl.setStaff_update_date(whp_sites.getStaff_update_date());
		whp_sitesImpl.setIndigenous_communities(whp_sites.isIndigenous_communities());
		whp_sitesImpl.setPopulation(whp_sites.getPopulation());
		whp_sitesImpl.setLast_updated(whp_sites.getLast_updated());
		whp_sitesImpl.setCreation_date(whp_sites.getCreation_date());
		whp_sitesImpl.setCreated_by(whp_sites.getCreated_by());
		whp_sitesImpl.setUpdated_by(whp_sites.getUpdated_by());
		whp_sitesImpl.setActive(whp_sites.isActive());
		whp_sitesImpl.setThumbnailid(whp_sites.getThumbnailid());
		whp_sitesImpl.setThumbnailid_small(whp_sites.getThumbnailid_small());
		whp_sitesImpl.setDescription(whp_sites.getDescription());
		whp_sitesImpl.setInformation_updating(whp_sites.isInformation_updating());

		return whp_sitesImpl;
	}

	/**
	 * Returns the whp_sites with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites
	 * @return the whp_sites
	 * @throws com.liferay.portal.NoSuchModelException if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	 *
	 * @param site_id the primary key of the whp_sites
	 * @return the whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findByPrimaryKey(long site_id)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchByPrimaryKey(site_id);

		if (whp_sites == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + site_id);
			}

			throw new NoSuch_sitesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				site_id);
		}

		return whp_sites;
	}

	/**
	 * Returns the whp_sites with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_sites
	 * @return the whp_sites, or <code>null</code> if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_sites fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the whp_sites with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param site_id the primary key of the whp_sites
	 * @return the whp_sites, or <code>null</code> if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchByPrimaryKey(long site_id) throws SystemException {
		whp_sites whp_sites = (whp_sites)EntityCacheUtil.getResult(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
				whp_sitesImpl.class, site_id);

		if (whp_sites == _nullwhp_sites) {
			return null;
		}

		if (whp_sites == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				whp_sites = (whp_sites)session.get(whp_sitesImpl.class,
						Long.valueOf(site_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (whp_sites != null) {
					cacheResult(whp_sites);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(whp_sitesModelImpl.ENTITY_CACHE_ENABLED,
						whp_sitesImpl.class, site_id, _nullwhp_sites);
				}

				closeSession(session);
			}
		}

		return whp_sites;
	}

	/**
	 * Returns the whp_sites where name_en = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	 *
	 * @param name_en the name_en
	 * @return the matching whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findBynameEn(String name_en)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchBynameEn(name_en);

		if (whp_sites == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("name_en=");
			msg.append(name_en);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sitesException(msg.toString());
		}

		return whp_sites;
	}

	/**
	 * Returns the whp_sites where name_en = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name_en the name_en
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBynameEn(String name_en) throws SystemException {
		return fetchBynameEn(name_en, true);
	}

	/**
	 * Returns the whp_sites where name_en = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name_en the name_en
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBynameEn(String name_en, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { name_en };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_NAMEEN,
					finderArgs, this);
		}

		if (result instanceof whp_sites) {
			whp_sites whp_sites = (whp_sites)result;

			if (!Validator.equals(name_en, whp_sites.getName_en())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_WHP_SITES_WHERE);

			if (name_en == null) {
				query.append(_FINDER_COLUMN_NAMEEN_NAME_EN_1);
			}
			else {
				if (name_en.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NAMEEN_NAME_EN_3);
				}
				else {
					query.append(_FINDER_COLUMN_NAMEEN_NAME_EN_2);
				}
			}

			query.append(whp_sitesModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (name_en != null) {
					qPos.add(name_en);
				}

				List<whp_sites> list = q.list();

				result = list;

				whp_sites whp_sites = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAMEEN,
						finderArgs, list);
				}
				else {
					whp_sites = list.get(0);

					cacheResult(whp_sites);

					if ((whp_sites.getName_en() == null) ||
							!whp_sites.getName_en().equals(name_en)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAMEEN,
							finderArgs, whp_sites);
					}
				}

				return whp_sites;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAMEEN,
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
				return (whp_sites)result;
			}
		}
	}

	/**
	 * Returns all the whp_siteses where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites> findByactiveSites(boolean active)
		throws SystemException {
		return findByactiveSites(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the whp_siteses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites> findByactiveSites(boolean active, int start, int end)
		throws SystemException {
		return findByactiveSites(active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_siteses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites> findByactiveSites(boolean active, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESITES;
			finderArgs = new Object[] { active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESITES;
			finderArgs = new Object[] { active, start, end, orderByComparator };
		}

		List<whp_sites> list = (List<whp_sites>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (whp_sites whp_sites : list) {
				if ((active != whp_sites.getActive())) {
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

			query.append(_SQL_SELECT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_ACTIVESITES_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(whp_sitesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

				list = (List<whp_sites>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first whp_sites in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findByactiveSites_First(boolean active,
		OrderByComparator orderByComparator)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchByactiveSites_First(active, orderByComparator);

		if (whp_sites != null) {
			return whp_sites;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sitesException(msg.toString());
	}

	/**
	 * Returns the first whp_sites in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchByactiveSites_First(boolean active,
		OrderByComparator orderByComparator) throws SystemException {
		List<whp_sites> list = findByactiveSites(active, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last whp_sites in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findByactiveSites_Last(boolean active,
		OrderByComparator orderByComparator)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchByactiveSites_Last(active, orderByComparator);

		if (whp_sites != null) {
			return whp_sites;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_sitesException(msg.toString());
	}

	/**
	 * Returns the last whp_sites in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchByactiveSites_Last(boolean active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByactiveSites(active);

		List<whp_sites> list = findByactiveSites(active, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the whp_siteses before and after the current whp_sites in the ordered set where active = &#63;.
	 *
	 * @param site_id the primary key of the current whp_sites
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a whp_sites with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites[] findByactiveSites_PrevAndNext(long site_id,
		boolean active, OrderByComparator orderByComparator)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = findByPrimaryKey(site_id);

		Session session = null;

		try {
			session = openSession();

			whp_sites[] array = new whp_sitesImpl[3];

			array[0] = getByactiveSites_PrevAndNext(session, whp_sites, active,
					orderByComparator, true);

			array[1] = whp_sites;

			array[2] = getByactiveSites_PrevAndNext(session, whp_sites, active,
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

	protected whp_sites getByactiveSites_PrevAndNext(Session session,
		whp_sites whp_sites, boolean active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WHP_SITES_WHERE);

		query.append(_FINDER_COLUMN_ACTIVESITES_ACTIVE_2);

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
			query.append(whp_sitesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(whp_sites);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<whp_sites> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the whp_sites where thumbnailid_small = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	 *
	 * @param thumbnailid_small the thumbnailid_small
	 * @return the matching whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findBythumbnailid_small(long thumbnailid_small)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchBythumbnailid_small(thumbnailid_small);

		if (whp_sites == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thumbnailid_small=");
			msg.append(thumbnailid_small);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sitesException(msg.toString());
		}

		return whp_sites;
	}

	/**
	 * Returns the whp_sites where thumbnailid_small = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thumbnailid_small the thumbnailid_small
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBythumbnailid_small(long thumbnailid_small)
		throws SystemException {
		return fetchBythumbnailid_small(thumbnailid_small, true);
	}

	/**
	 * Returns the whp_sites where thumbnailid_small = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thumbnailid_small the thumbnailid_small
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBythumbnailid_small(long thumbnailid_small,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thumbnailid_small };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
					finderArgs, this);
		}

		if (result instanceof whp_sites) {
			whp_sites whp_sites = (whp_sites)result;

			if ((thumbnailid_small != whp_sites.getThumbnailid_small())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_THUMBNAILID_SMALL_THUMBNAILID_SMALL_2);

			query.append(whp_sitesModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thumbnailid_small);

				List<whp_sites> list = q.list();

				result = list;

				whp_sites whp_sites = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
						finderArgs, list);
				}
				else {
					whp_sites = list.get(0);

					cacheResult(whp_sites);

					if ((whp_sites.getThumbnailid_small() != thumbnailid_small)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
							finderArgs, whp_sites);
					}
				}

				return whp_sites;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUMBNAILID_SMALL,
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
				return (whp_sites)result;
			}
		}
	}

	/**
	 * Returns the whp_sites where thumbnailid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	 *
	 * @param thumbnailid the thumbnailid
	 * @return the matching whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findBythumbnailid(long thumbnailid)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchBythumbnailid(thumbnailid);

		if (whp_sites == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thumbnailid=");
			msg.append(thumbnailid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sitesException(msg.toString());
		}

		return whp_sites;
	}

	/**
	 * Returns the whp_sites where thumbnailid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thumbnailid the thumbnailid
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBythumbnailid(long thumbnailid)
		throws SystemException {
		return fetchBythumbnailid(thumbnailid, true);
	}

	/**
	 * Returns the whp_sites where thumbnailid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thumbnailid the thumbnailid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBythumbnailid(long thumbnailid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thumbnailid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
					finderArgs, this);
		}

		if (result instanceof whp_sites) {
			whp_sites whp_sites = (whp_sites)result;

			if ((thumbnailid != whp_sites.getThumbnailid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_THUMBNAILID_THUMBNAILID_2);

			query.append(whp_sitesModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thumbnailid);

				List<whp_sites> list = q.list();

				result = list;

				whp_sites whp_sites = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
						finderArgs, list);
				}
				else {
					whp_sites = list.get(0);

					cacheResult(whp_sites);

					if ((whp_sites.getThumbnailid() != thumbnailid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
							finderArgs, whp_sites);
					}
				}

				return whp_sites;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUMBNAILID,
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
				return (whp_sites)result;
			}
		}
	}

	/**
	 * Returns the whp_sites where wdpa_id = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_sitesException} if it could not be found.
	 *
	 * @param wdpa_id the wdpa_id
	 * @return the matching whp_sites
	 * @throws com.iucn.whp.dbservice.NoSuch_sitesException if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites findBywdpaid(long wdpa_id)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = fetchBywdpaid(wdpa_id);

		if (whp_sites == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("wdpa_id=");
			msg.append(wdpa_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_sitesException(msg.toString());
		}

		return whp_sites;
	}

	/**
	 * Returns the whp_sites where wdpa_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wdpa_id the wdpa_id
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBywdpaid(long wdpa_id) throws SystemException {
		return fetchBywdpaid(wdpa_id, true);
	}

	/**
	 * Returns the whp_sites where wdpa_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wdpa_id the wdpa_id
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_sites, or <code>null</code> if a matching whp_sites could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites fetchBywdpaid(long wdpa_id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { wdpa_id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_WDPAID,
					finderArgs, this);
		}

		if (result instanceof whp_sites) {
			whp_sites whp_sites = (whp_sites)result;

			if ((wdpa_id != whp_sites.getWdpa_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_WDPAID_WDPA_ID_2);

			query.append(whp_sitesModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wdpa_id);

				List<whp_sites> list = q.list();

				result = list;

				whp_sites whp_sites = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WDPAID,
						finderArgs, list);
				}
				else {
					whp_sites = list.get(0);

					cacheResult(whp_sites);

					if ((whp_sites.getWdpa_id() != wdpa_id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_WDPAID,
							finderArgs, whp_sites);
					}
				}

				return whp_sites;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_WDPAID,
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
				return (whp_sites)result;
			}
		}
	}

	/**
	 * Returns all the whp_siteses.
	 *
	 * @return the whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_siteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_siteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_sites> findAll(int start, int end,
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

		List<whp_sites> list = (List<whp_sites>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WHP_SITES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WHP_SITES.concat(whp_sitesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<whp_sites>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<whp_sites>)QueryUtil.list(q, getDialect(),
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
	 * Removes the whp_sites where name_en = &#63; from the database.
	 *
	 * @param name_en the name_en
	 * @return the whp_sites that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites removeBynameEn(String name_en)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = findBynameEn(name_en);

		return remove(whp_sites);
	}

	/**
	 * Removes all the whp_siteses where active = &#63; from the database.
	 *
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByactiveSites(boolean active) throws SystemException {
		for (whp_sites whp_sites : findByactiveSites(active)) {
			remove(whp_sites);
		}
	}

	/**
	 * Removes the whp_sites where thumbnailid_small = &#63; from the database.
	 *
	 * @param thumbnailid_small the thumbnailid_small
	 * @return the whp_sites that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites removeBythumbnailid_small(long thumbnailid_small)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = findBythumbnailid_small(thumbnailid_small);

		return remove(whp_sites);
	}

	/**
	 * Removes the whp_sites where thumbnailid = &#63; from the database.
	 *
	 * @param thumbnailid the thumbnailid
	 * @return the whp_sites that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites removeBythumbnailid(long thumbnailid)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = findBythumbnailid(thumbnailid);

		return remove(whp_sites);
	}

	/**
	 * Removes the whp_sites where wdpa_id = &#63; from the database.
	 *
	 * @param wdpa_id the wdpa_id
	 * @return the whp_sites that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_sites removeBywdpaid(long wdpa_id)
		throws NoSuch_sitesException, SystemException {
		whp_sites whp_sites = findBywdpaid(wdpa_id);

		return remove(whp_sites);
	}

	/**
	 * Removes all the whp_siteses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (whp_sites whp_sites : findAll()) {
			remove(whp_sites);
		}
	}

	/**
	 * Returns the number of whp_siteses where name_en = &#63;.
	 *
	 * @param name_en the name_en
	 * @return the number of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBynameEn(String name_en) throws SystemException {
		Object[] finderArgs = new Object[] { name_en };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_NAMEEN,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_WHERE);

			if (name_en == null) {
				query.append(_FINDER_COLUMN_NAMEEN_NAME_EN_1);
			}
			else {
				if (name_en.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NAMEEN_NAME_EN_3);
				}
				else {
					query.append(_FINDER_COLUMN_NAMEEN_NAME_EN_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (name_en != null) {
					qPos.add(name_en);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NAMEEN,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_siteses where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByactiveSites(boolean active) throws SystemException {
		Object[] finderArgs = new Object[] { active };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACTIVESITES,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_ACTIVESITES_ACTIVE_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACTIVESITES,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_siteses where thumbnailid_small = &#63;.
	 *
	 * @param thumbnailid_small the thumbnailid_small
	 * @return the number of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBythumbnailid_small(long thumbnailid_small)
		throws SystemException {
		Object[] finderArgs = new Object[] { thumbnailid_small };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_THUMBNAILID_SMALL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_THUMBNAILID_SMALL_THUMBNAILID_SMALL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thumbnailid_small);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUMBNAILID_SMALL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_siteses where thumbnailid = &#63;.
	 *
	 * @param thumbnailid the thumbnailid
	 * @return the number of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBythumbnailid(long thumbnailid) throws SystemException {
		Object[] finderArgs = new Object[] { thumbnailid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_THUMBNAILID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_THUMBNAILID_THUMBNAILID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thumbnailid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUMBNAILID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_siteses where wdpa_id = &#63;.
	 *
	 * @param wdpa_id the wdpa_id
	 * @return the number of matching whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public int countBywdpaid(long wdpa_id) throws SystemException {
		Object[] finderArgs = new Object[] { wdpa_id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_WDPAID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_SITES_WHERE);

			query.append(_FINDER_COLUMN_WDPAID_WDPA_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wdpa_id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_WDPAID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_siteses.
	 *
	 * @return the number of whp_siteses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WHP_SITES);

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
	 * Returns all the whp_sites_countries associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_countries associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		long pk) throws SystemException {
		return getwhp_sites_countries(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_countries associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_countries associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_countries(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_COUNTRIES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_countryImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_countryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_countries",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_COUNTRIES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_countries associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_countries associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_country> getwhp_sites_countries(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_country> list = (List<com.iucn.whp.dbservice.model.whp_sites_country>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_COUNTRIES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_COUNTRIES.concat(ORDER_BY_CLAUSE)
													 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_COUNTRIES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_country",
					com.iucn.whp.dbservice.model.impl.whp_sites_countryImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_country>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_COUNTRIES,
						finderArgs);
				}
				else {
					whp_sites_countryPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_COUNTRIES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_COUNTRIES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_countryImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_countryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_countriesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_COUNTRIES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_countries associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_countries associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_countriesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_COUNTRIES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_COUNTRIESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_COUNTRIES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_COUNTRY = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_countryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_countryImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_countryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_country",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_country is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_countryPK the primary key of the whp_sites_country
	 * @return <code>true</code> if the whp_sites_country is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_country(long pk, long whp_sites_countryPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_countryPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_COUNTRY,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_country.contains(pk,
							whp_sites_countryPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_COUNTRY,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_countries associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_countries
	 * @return <code>true</code> if the whp_sites has any whp_sites_countries associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_countries(long pk)
		throws SystemException {
		if (getwhp_sites_countriesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_soc_reportses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_soc_reportses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getwhp_sites_soc_reportses(
		long pk) throws SystemException {
		return getwhp_sites_soc_reportses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_soc_reportses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_soc_reportses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getwhp_sites_soc_reportses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_soc_reportses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_soc_reportsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_soc_reportses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_soc_reportses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_soc_reportses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> getwhp_sites_soc_reportses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_soc_reports> list = (List<com.iucn.whp.dbservice.model.whp_sites_soc_reports>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_SOC_REPORTSES.concat(ORDER_BY_CLAUSE)
														 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_SOC_REPORTSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_soc_reports",
					com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_soc_reports>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES,
						finderArgs);
				}
				else {
					whp_sites_soc_reportsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_soc_reportsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_soc_reportsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_soc_reportses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_soc_reportses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_soc_reportsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_SOC_REPORTSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_SOC_REPORTSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_SOC_REPORTS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soc_reportsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_soc_reportsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_soc_reports",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_soc_reports is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_soc_reportsPK the primary key of the whp_sites_soc_reports
	 * @return <code>true</code> if the whp_sites_soc_reports is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_soc_reports(long pk,
		long whp_sites_soc_reportsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_soc_reportsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_SOC_REPORTS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_soc_reports.contains(
							pk, whp_sites_soc_reportsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_SOC_REPORTS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_soc_reportses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_soc_reportses
	 * @return <code>true</code> if the whp_sites has any whp_sites_soc_reportses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_soc_reportses(long pk)
		throws SystemException {
		if (getwhp_sites_soc_reportsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_visitorses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_visitorses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		long pk) throws SystemException {
		return getwhp_sites_visitorses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_visitorses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_visitorses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_visitorses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_VISITORSES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_visitorsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_visitorsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_visitorsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_visitorsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_visitorses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_VISITORSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_visitorses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_visitorses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_visitors> getwhp_sites_visitorses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_visitors> list = (List<com.iucn.whp.dbservice.model.whp_sites_visitors>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_VISITORSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_VISITORSES.concat(ORDER_BY_CLAUSE)
													  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_VISITORSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_visitors",
					com.iucn.whp.dbservice.model.impl.whp_sites_visitorsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_visitors>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_VISITORSES,
						finderArgs);
				}
				else {
					whp_sites_visitorsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_VISITORSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_VISITORSES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_visitorsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_visitorsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_visitorsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_visitorsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_visitorsesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_VISITORSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_visitorses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_visitorses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_visitorsesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_VISITORSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_VISITORSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_VISITORSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_VISITORS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_visitorsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_visitorsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_visitorsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_visitorsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_visitors",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_visitors is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_visitorsPK the primary key of the whp_sites_visitors
	 * @return <code>true</code> if the whp_sites_visitors is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_visitors(long pk, long whp_sites_visitorsPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_visitorsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_VISITORS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_visitors.contains(
							pk, whp_sites_visitorsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_VISITORS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_visitorses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_visitorses
	 * @return <code>true</code> if the whp_sites has any whp_sites_visitorses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_visitorses(long pk)
		throws SystemException {
		if (getwhp_sites_visitorsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_inscription_dates associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_inscription_dates associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getwhp_sites_inscription_dates(
		long pk) throws SystemException {
		return getwhp_sites_inscription_dates(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_inscription_dates associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_inscription_dates associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getwhp_sites_inscription_dates(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_inscription_dates(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_datePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_inscription_dates",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_inscription_dates associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_inscription_dates associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> getwhp_sites_inscription_dates(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_inscription_date> list = (List<com.iucn.whp.dbservice.model.whp_sites_inscription_date>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_INSCRIPTION_DATES.concat(ORDER_BY_CLAUSE)
															 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_INSCRIPTION_DATES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_inscription_date",
					com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_inscription_date>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES,
						finderArgs);
				}
				else {
					whp_sites_inscription_datePersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_datePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_inscription_datesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_inscription_dates associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_inscription_dates associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_inscription_datesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_INSCRIPTION_DATESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_DATES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_INSCRIPTION_DATE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_dateImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_datePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_inscription_date",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_inscription_date is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_inscription_datePK the primary key of the whp_sites_inscription_date
	 * @return <code>true</code> if the whp_sites_inscription_date is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_inscription_date(long pk,
		long whp_sites_inscription_datePK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_inscription_datePK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_INSCRIPTION_DATE,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_inscription_date.contains(
							pk, whp_sites_inscription_datePK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_INSCRIPTION_DATE,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_inscription_dates associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_inscription_dates
	 * @return <code>true</code> if the whp_sites has any whp_sites_inscription_dates associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_inscription_dates(long pk)
		throws SystemException {
		if (getwhp_sites_inscription_datesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_budgets associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_budgets associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		long pk) throws SystemException {
		return getwhp_sites_budgets(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_budgets associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_budgets associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_budgets(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_BUDGETS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_budgetModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_budgetModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_budgetImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_budgetPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_budgets",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_BUDGETS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_budgets associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_budgets associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_budget> getwhp_sites_budgets(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_budget> list = (List<com.iucn.whp.dbservice.model.whp_sites_budget>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_BUDGETS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_BUDGETS.concat(ORDER_BY_CLAUSE)
												   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_BUDGETS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_budget",
					com.iucn.whp.dbservice.model.impl.whp_sites_budgetImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_budget>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_BUDGETS,
						finderArgs);
				}
				else {
					whp_sites_budgetPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_BUDGETS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_BUDGETS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_budgetModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_budgetModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_budgetImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_budgetPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_budgetsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_BUDGETS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_budgets associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_budgets associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_budgetsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_BUDGETS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_BUDGETSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_BUDGETS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_BUDGET = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_budgetModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_budgetModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_budgetImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_budgetPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_budget",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_budget is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_budgetPK the primary key of the whp_sites_budget
	 * @return <code>true</code> if the whp_sites_budget is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_budget(long pk, long whp_sites_budgetPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_budgetPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_BUDGET,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_budget.contains(pk,
							whp_sites_budgetPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_BUDGET,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_budgets associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_budgets
	 * @return <code>true</code> if the whp_sites has any whp_sites_budgets associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_budgets(long pk) throws SystemException {
		if (getwhp_sites_budgetsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_flagship_specieses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_flagship_specieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		long pk) throws SystemException {
		return getwhp_sites_flagship_specieses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_flagship_specieses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_flagship_specieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_flagship_specieses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_flagship_speciesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_flagship_specieses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_flagship_specieses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_flagship_specieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> getwhp_sites_flagship_specieses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_flagship_species> list = (List<com.iucn.whp.dbservice.model.whp_sites_flagship_species>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_FLAGSHIP_SPECIESES.concat(ORDER_BY_CLAUSE)
															  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_FLAGSHIP_SPECIESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_flagship_species",
					com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_flagship_species>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES,
						finderArgs);
				}
				else {
					whp_sites_flagship_speciesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_flagship_speciesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_flagship_speciesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_flagship_specieses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_flagship_specieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_flagship_speciesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_FLAGSHIP_SPECIESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_FLAGSHIP_SPECIESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_FLAGSHIP_SPECIES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_flagship_speciesImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_flagship_speciesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_flagship_species",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_flagship_species is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_flagship_speciesPK the primary key of the whp_sites_flagship_species
	 * @return <code>true</code> if the whp_sites_flagship_species is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_flagship_species(long pk,
		long whp_sites_flagship_speciesPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_flagship_speciesPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_FLAGSHIP_SPECIES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_flagship_species.contains(
							pk, whp_sites_flagship_speciesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_FLAGSHIP_SPECIES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_flagship_specieses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_flagship_specieses
	 * @return <code>true</code> if the whp_sites has any whp_sites_flagship_specieses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_flagship_specieses(long pk)
		throws SystemException {
		if (getwhp_sites_flagship_speciesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_mees associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_mees associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		long pk) throws SystemException {
		return getwhp_sites_mees(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_mees associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_mees associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_mees(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_MEES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_meeModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_meeModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_meeImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_meePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_mees",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_MEES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_mees associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_mees associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mee> getwhp_sites_mees(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_mee> list = (List<com.iucn.whp.dbservice.model.whp_sites_mee>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_MEES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_MEES.concat(ORDER_BY_CLAUSE)
												.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_MEES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_mee",
					com.iucn.whp.dbservice.model.impl.whp_sites_meeImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_mee>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_MEES,
						finderArgs);
				}
				else {
					whp_sites_meePersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_MEES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_MEES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_meeModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_meeModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_meeImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_meePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_meesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_MEES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_mees associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_mees associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_meesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_MEES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_MEESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_MEES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_MEE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_meeModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_meeModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_meeImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_meePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_mee",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_mee is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_meePK the primary key of the whp_sites_mee
	 * @return <code>true</code> if the whp_sites_mee is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_mee(long pk, long whp_sites_meePK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_meePK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_MEE,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_mee.contains(pk,
							whp_sites_meePK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_MEE,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_mees associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_mees
	 * @return <code>true</code> if the whp_sites has any whp_sites_mees associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_mees(long pk) throws SystemException {
		if (getwhp_sites_meesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the reinforced_monitorings associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the reinforced_monitorings associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		long pk) throws SystemException {
		return getreinforced_monitorings(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the reinforced_monitorings associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of reinforced_monitorings associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		long pk, int start, int end) throws SystemException {
		return getreinforced_monitorings(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_REINFORCED_MONITORINGS = new FinderPath(com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.reinforced_monitoringImpl.class,
			com.iucn.whp.dbservice.service.persistence.reinforced_monitoringPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getreinforced_monitorings",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_REINFORCED_MONITORINGS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the reinforced_monitorings associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reinforced_monitorings associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.reinforced_monitoring> getreinforced_monitorings(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.reinforced_monitoring> list = (List<com.iucn.whp.dbservice.model.reinforced_monitoring>)FinderCacheUtil.getResult(FINDER_PATH_GET_REINFORCED_MONITORINGS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETREINFORCED_MONITORINGS.concat(ORDER_BY_CLAUSE)
														.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETREINFORCED_MONITORINGS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_reinforced_monitoring",
					com.iucn.whp.dbservice.model.impl.reinforced_monitoringImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.reinforced_monitoring>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_REINFORCED_MONITORINGS,
						finderArgs);
				}
				else {
					reinforced_monitoringPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_REINFORCED_MONITORINGS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_REINFORCED_MONITORINGS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.reinforced_monitoringImpl.class,
			com.iucn.whp.dbservice.service.persistence.reinforced_monitoringPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getreinforced_monitoringsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_REINFORCED_MONITORINGS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of reinforced_monitorings associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of reinforced_monitorings associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getreinforced_monitoringsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_REINFORCED_MONITORINGS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETREINFORCED_MONITORINGSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_REINFORCED_MONITORINGS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_REINFORCED_MONITORING = new FinderPath(com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.reinforced_monitoringModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.reinforced_monitoringImpl.class,
			com.iucn.whp.dbservice.service.persistence.reinforced_monitoringPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsreinforced_monitoring",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the reinforced_monitoring is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param reinforced_monitoringPK the primary key of the reinforced_monitoring
	 * @return <code>true</code> if the reinforced_monitoring is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsreinforced_monitoring(long pk,
		long reinforced_monitoringPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, reinforced_monitoringPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_REINFORCED_MONITORING,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsreinforced_monitoring.contains(
							pk, reinforced_monitoringPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_REINFORCED_MONITORING,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any reinforced_monitorings associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with reinforced_monitorings
	 * @return <code>true</code> if the whp_sites has any reinforced_monitorings associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsreinforced_monitorings(long pk)
		throws SystemException {
		if (getreinforced_monitoringsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_missions associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_missions associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		long pk) throws SystemException {
		return getwhp_sites_missions(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_missions associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_missions associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_missions(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_MISSIONS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_missionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_missions",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_MISSIONS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_missions associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_missions associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mission> getwhp_sites_missions(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_mission> list = (List<com.iucn.whp.dbservice.model.whp_sites_mission>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_MISSIONS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_MISSIONS.concat(ORDER_BY_CLAUSE)
													.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_MISSIONS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_mission",
					com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_mission>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_MISSIONS,
						finderArgs);
				}
				else {
					whp_sites_missionPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_MISSIONS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_MISSIONS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_missionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_missionsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_MISSIONS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_missions associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_missions associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_missionsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_MISSIONS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_MISSIONSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_MISSIONS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_MISSION = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_missionModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_missionImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_missionPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_mission",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_mission is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_missionPK the primary key of the whp_sites_mission
	 * @return <code>true</code> if the whp_sites_mission is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_mission(long pk, long whp_sites_missionPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_missionPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_MISSION,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_mission.contains(pk,
							whp_sites_missionPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_MISSION,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_missions associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_missions
	 * @return <code>true</code> if the whp_sites has any whp_sites_missions associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_missions(long pk)
		throws SystemException {
		if (getwhp_sites_missionsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_external_documentses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_external_documentses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_external_documents> getwhp_sites_external_documentses(
		long pk) throws SystemException {
		return getwhp_sites_external_documentses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_external_documentses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_external_documentses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_external_documents> getwhp_sites_external_documentses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_external_documentses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_external_documentsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_external_documentses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_external_documentses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_external_documentses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_external_documents> getwhp_sites_external_documentses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_external_documents> list = (List<com.iucn.whp.dbservice.model.whp_sites_external_documents>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_EXTERNAL_DOCUMENTSES.concat(ORDER_BY_CLAUSE)
																.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_EXTERNAL_DOCUMENTSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_external_documents",
					com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_external_documents>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES,
						finderArgs);
				}
				else {
					whp_sites_external_documentsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_external_documentsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_external_documentsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_external_documentses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_external_documentses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_external_documentsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_EXTERNAL_DOCUMENTSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_EXTERNAL_DOCUMENTSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_EXTERNAL_DOCUMENTS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_external_documentsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_external_documentsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_external_documents",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_external_documents is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_external_documentsPK the primary key of the whp_sites_external_documents
	 * @return <code>true</code> if the whp_sites_external_documents is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_external_documents(long pk,
		long whp_sites_external_documentsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_external_documentsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_EXTERNAL_DOCUMENTS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_external_documents.contains(
							pk, whp_sites_external_documentsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_EXTERNAL_DOCUMENTS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_external_documentses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_external_documentses
	 * @return <code>true</code> if the whp_sites has any whp_sites_external_documentses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_external_documentses(long pk)
		throws SystemException {
		if (getwhp_sites_external_documentsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_contactses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_contactses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		long pk) throws SystemException {
		return getwhp_sites_contactses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_contactses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_contactses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_contactses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_CONTACTSES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_contactsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_contactsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_contactsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_contactsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_contactses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_CONTACTSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_contactses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_contactses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_contacts> getwhp_sites_contactses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_contacts> list = (List<com.iucn.whp.dbservice.model.whp_sites_contacts>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_CONTACTSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_CONTACTSES.concat(ORDER_BY_CLAUSE)
													  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_CONTACTSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_contacts",
					com.iucn.whp.dbservice.model.impl.whp_sites_contactsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_contacts>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_CONTACTSES,
						finderArgs);
				}
				else {
					whp_sites_contactsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_CONTACTSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_CONTACTSES_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_contactsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_contactsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_contactsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_contactsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_contactsesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_CONTACTSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_contactses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_contactses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_contactsesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_CONTACTSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_CONTACTSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_CONTACTSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_CONTACTS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_contactsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_contactsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_contactsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_contactsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_contacts",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_contacts is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_contactsPK the primary key of the whp_sites_contacts
	 * @return <code>true</code> if the whp_sites_contacts is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_contacts(long pk, long whp_sites_contactsPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_contactsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_CONTACTS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_contacts.contains(
							pk, whp_sites_contactsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_CONTACTS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_contactses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_contactses
	 * @return <code>true</code> if the whp_sites has any whp_sites_contactses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_contactses(long pk)
		throws SystemException {
		if (getwhp_sites_contactsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_iucn_pa_categories associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_iucn_pa_categories associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		long pk) throws SystemException {
		return getwhp_sites_iucn_pa_categories(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_iucn_pa_categories associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_iucn_pa_categories associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_iucn_pa_categories(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_pa_categoryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_iucn_pa_categories",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_iucn_pa_categories associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_iucn_pa_categories associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> getwhp_sites_iucn_pa_categories(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category> list = (List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_IUCN_PA_CATEGORIES.concat(ORDER_BY_CLAUSE)
															  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_IUCN_PA_CATEGORIES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_iucn_pa_category",
					com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES,
						finderArgs);
				}
				else {
					whp_sites_iucn_pa_categoryPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_pa_categoryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_iucn_pa_categoriesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_iucn_pa_categories associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_iucn_pa_categories associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_iucn_pa_categoriesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_IUCN_PA_CATEGORIESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_IUCN_PA_CATEGORIES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_IUCN_PA_CATEGORY =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_pa_categoryImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_pa_categoryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_iucn_pa_category",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_iucn_pa_category is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_iucn_pa_categoryPK the primary key of the whp_sites_iucn_pa_category
	 * @return <code>true</code> if the whp_sites_iucn_pa_category is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_iucn_pa_category(long pk,
		long whp_sites_iucn_pa_categoryPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_iucn_pa_categoryPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_IUCN_PA_CATEGORY,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_iucn_pa_category.contains(
							pk, whp_sites_iucn_pa_categoryPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_IUCN_PA_CATEGORY,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_iucn_pa_categories associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_iucn_pa_categories
	 * @return <code>true</code> if the whp_sites has any whp_sites_iucn_pa_categories associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_iucn_pa_categories(long pk)
		throws SystemException {
		if (getwhp_sites_iucn_pa_categoriesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_other_designationses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_other_designationses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		long pk) throws SystemException {
		return getwhp_sites_other_designationses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_other_designationses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_other_designationses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_other_designationses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_other_designationsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_other_designationses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_other_designationses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_other_designationses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_other_designations> getwhp_sites_other_designationses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_other_designations> list = (List<com.iucn.whp.dbservice.model.whp_sites_other_designations>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_OTHER_DESIGNATIONSES.concat(ORDER_BY_CLAUSE)
																.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_OTHER_DESIGNATIONSES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_other_designations",
					com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_other_designations>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES,
						finderArgs);
				}
				else {
					whp_sites_other_designationsPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_other_designationsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_other_designationsesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_other_designationses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_other_designationses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_other_designationsesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_OTHER_DESIGNATIONSESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_OTHER_DESIGNATIONSES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_OTHER_DESIGNATIONS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_other_designationsImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_other_designationsPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_other_designations",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_other_designations is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_other_designationsPK the primary key of the whp_sites_other_designations
	 * @return <code>true</code> if the whp_sites_other_designations is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_other_designations(long pk,
		long whp_sites_other_designationsPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_other_designationsPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_OTHER_DESIGNATIONS,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_other_designations.contains(
							pk, whp_sites_other_designationsPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_OTHER_DESIGNATIONS,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_other_designationses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_other_designationses
	 * @return <code>true</code> if the whp_sites has any whp_sites_other_designationses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_other_designationses(long pk)
		throws SystemException {
		if (getwhp_sites_other_designationsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_indigenous_communitieses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_indigenous_communitieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		long pk) throws SystemException {
		return getwhp_sites_indigenous_communitieses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_indigenous_communitieses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_indigenous_communitieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_indigenous_communitieses(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_indigenous_communitiesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_indigenous_communitieses",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_indigenous_communitieses associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_indigenous_communitieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> getwhp_sites_indigenous_communitieses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities> list =
			(List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_INDIGENOUS_COMMUNITIESES.concat(ORDER_BY_CLAUSE)
																	.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_INDIGENOUS_COMMUNITIESES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_indigenous_communities",
					com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_indigenous_communities>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES,
						finderArgs);
				}
				else {
					whp_sites_indigenous_communitiesPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_indigenous_communitiesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_indigenous_communitiesesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_indigenous_communitieses associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_indigenous_communitieses associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_indigenous_communitiesesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_INDIGENOUS_COMMUNITIESESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_INDIGENOUS_COMMUNITIESES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_INDIGENOUS_COMMUNITIES =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_indigenous_communitiesImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_indigenous_communitiesPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_indigenous_communities",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_indigenous_communities is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_indigenous_communitiesPK the primary key of the whp_sites_indigenous_communities
	 * @return <code>true</code> if the whp_sites_indigenous_communities is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_indigenous_communities(long pk,
		long whp_sites_indigenous_communitiesPK) throws SystemException {
		Object[] finderArgs = new Object[] {
				pk, whp_sites_indigenous_communitiesPK
			};

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_INDIGENOUS_COMMUNITIES,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_indigenous_communities.contains(
							pk, whp_sites_indigenous_communitiesPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_INDIGENOUS_COMMUNITIES,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_indigenous_communitieses associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_indigenous_communitieses
	 * @return <code>true</code> if the whp_sites has any whp_sites_indigenous_communitieses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_indigenous_communitieses(long pk)
		throws SystemException {
		if (getwhp_sites_indigenous_communitiesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_mgmt_plan_states associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_mgmt_plan_states associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		long pk) throws SystemException {
		return getwhp_sites_mgmt_plan_states(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_mgmt_plan_states associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_mgmt_plan_states associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_mgmt_plan_states(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_mgmt_plan_statePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_mgmt_plan_states",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_mgmt_plan_states associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_mgmt_plan_states associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> getwhp_sites_mgmt_plan_states(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state> list = (List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_MGMT_PLAN_STATES.concat(ORDER_BY_CLAUSE)
															.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_MGMT_PLAN_STATES;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_mgmt_plan_state",
					com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES,
						finderArgs);
				}
				else {
					whp_sites_mgmt_plan_statePersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_mgmt_plan_statePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_mgmt_plan_statesSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_mgmt_plan_states associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_mgmt_plan_states associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_mgmt_plan_statesSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_MGMT_PLAN_STATESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_MGMT_PLAN_STATES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_MGMT_PLAN_STATE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_mgmt_plan_stateImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_mgmt_plan_statePersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_mgmt_plan_state",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_mgmt_plan_state is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_mgmt_plan_statePK the primary key of the whp_sites_mgmt_plan_state
	 * @return <code>true</code> if the whp_sites_mgmt_plan_state is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_mgmt_plan_state(long pk,
		long whp_sites_mgmt_plan_statePK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_mgmt_plan_statePK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_MGMT_PLAN_STATE,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_mgmt_plan_state.contains(
							pk, whp_sites_mgmt_plan_statePK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_MGMT_PLAN_STATE,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_mgmt_plan_states associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_mgmt_plan_states
	 * @return <code>true</code> if the whp_sites has any whp_sites_mgmt_plan_states associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_mgmt_plan_states(long pk)
		throws SystemException {
		if (getwhp_sites_mgmt_plan_statesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_dsocrs associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_dsocrs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhp_sites_dsocrs(
		long pk) throws SystemException {
		return getwhp_sites_dsocrs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_dsocrs associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_dsocrs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhp_sites_dsocrs(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_dsocrs(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_DSOCRS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_dsocrModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_dsocrModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_dsocrImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_dsocrPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_dsocrs",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_DSOCRS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_dsocrs associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_dsocrs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_dsocr> getwhp_sites_dsocrs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_dsocr> list = (List<com.iucn.whp.dbservice.model.whp_sites_dsocr>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_DSOCRS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_DSOCRS.concat(ORDER_BY_CLAUSE)
												  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_DSOCRS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_dsocr",
					com.iucn.whp.dbservice.model.impl.whp_sites_dsocrImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_dsocr>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_DSOCRS,
						finderArgs);
				}
				else {
					whp_sites_dsocrPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_DSOCRS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_DSOCRS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_dsocrModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_dsocrModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_dsocrImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_dsocrPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_dsocrsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_DSOCRS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_dsocrs associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_dsocrs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_dsocrsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_DSOCRS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_DSOCRSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_DSOCRS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_DSOCR = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_dsocrModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_dsocrModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_dsocrImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_dsocrPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_dsocr",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_dsocr is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_dsocrPK the primary key of the whp_sites_dsocr
	 * @return <code>true</code> if the whp_sites_dsocr is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_dsocr(long pk, long whp_sites_dsocrPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_dsocrPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_DSOCR,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_dsocr.contains(pk,
							whp_sites_dsocrPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_DSOCR,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_dsocrs associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_dsocrs
	 * @return <code>true</code> if the whp_sites has any whp_sites_dsocrs associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_dsocrs(long pk) throws SystemException {
		if (getwhp_sites_dsocrsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_soouvs associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_soouvs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhp_sites_soouvs(
		long pk) throws SystemException {
		return getwhp_sites_soouvs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_soouvs associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_soouvs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhp_sites_soouvs(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_soouvs(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_SOOUVS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_soouvModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soouvModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soouvImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_soouvPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_soouvs",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_SOOUVS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_soouvs associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_soouvs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_soouv> getwhp_sites_soouvs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_soouv> list = (List<com.iucn.whp.dbservice.model.whp_sites_soouv>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_SOOUVS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_SOOUVS.concat(ORDER_BY_CLAUSE)
												  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_SOOUVS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_soouv",
					com.iucn.whp.dbservice.model.impl.whp_sites_soouvImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_soouv>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_SOOUVS,
						finderArgs);
				}
				else {
					whp_sites_soouvPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_SOOUVS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_SOOUVS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_soouvModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soouvModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soouvImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_soouvPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_soouvsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_SOOUVS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_soouvs associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_soouvs associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_soouvsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_SOOUVS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_SOOUVSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_SOOUVS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_SOOUV = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_soouvModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soouvModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_soouvImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_soouvPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_soouv",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_soouv is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_soouvPK the primary key of the whp_sites_soouv
	 * @return <code>true</code> if the whp_sites_soouv is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_soouv(long pk, long whp_sites_soouvPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_soouvPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_SOOUV,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_soouv.contains(pk,
							whp_sites_soouvPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_SOOUV,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_soouvs associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_soouvs
	 * @return <code>true</code> if the whp_sites has any whp_sites_soouvs associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_soouvs(long pk) throws SystemException {
		if (getwhp_sites_soouvsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_components associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_components associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		long pk) throws SystemException {
		return getwhp_sites_components(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_components associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_components associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_components(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_COMPONENTS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_componentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_componentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_componentImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_componentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_components",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_COMPONENTS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_components associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_components associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_component> getwhp_sites_components(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_component> list = (List<com.iucn.whp.dbservice.model.whp_sites_component>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_COMPONENTS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_COMPONENTS.concat(ORDER_BY_CLAUSE)
													  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_COMPONENTS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_component",
					com.iucn.whp.dbservice.model.impl.whp_sites_componentImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_component>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_COMPONENTS,
						finderArgs);
				}
				else {
					whp_sites_componentPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_COMPONENTS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_COMPONENTS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_componentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_componentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_componentImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_componentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_componentsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_COMPONENTS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_components associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_components associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_componentsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_COMPONENTS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_COMPONENTSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_COMPONENTS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_COMPONENT = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_componentModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_componentModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_componentImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_componentPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_component",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_component is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_componentPK the primary key of the whp_sites_component
	 * @return <code>true</code> if the whp_sites_component is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_component(long pk,
		long whp_sites_componentPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_componentPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_COMPONENT,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_component.contains(
							pk, whp_sites_componentPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_COMPONENT,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_components associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_components
	 * @return <code>true</code> if the whp_sites has any whp_sites_components associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_components(long pk)
		throws SystemException {
		if (getwhp_sites_componentsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_boundary_modifications associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_boundary_modifications associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		long pk) throws SystemException {
		return getwhp_sites_boundary_modifications(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_boundary_modifications associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_boundary_modifications associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_boundary_modifications(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_boundary_modificationPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_boundary_modifications",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_boundary_modifications associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_boundary_modifications associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> getwhp_sites_boundary_modifications(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification> list = (List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_BOUNDARY_MODIFICATIONS.concat(ORDER_BY_CLAUSE)
																  .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_BOUNDARY_MODIFICATIONS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_boundary_modification",
					com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_boundary_modification>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS,
						finderArgs);
				}
				else {
					whp_sites_boundary_modificationPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_boundary_modificationPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_boundary_modificationsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_boundary_modifications associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_boundary_modifications associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_boundary_modificationsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_BOUNDARY_MODIFICATIONSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_BOUNDARY_MODIFICATIONS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_BOUNDARY_MODIFICATION =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_boundary_modificationImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_boundary_modificationPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_boundary_modification",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_boundary_modification is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_boundary_modificationPK the primary key of the whp_sites_boundary_modification
	 * @return <code>true</code> if the whp_sites_boundary_modification is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_boundary_modification(long pk,
		long whp_sites_boundary_modificationPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_boundary_modificationPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_BOUNDARY_MODIFICATION,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_boundary_modification.contains(
							pk, whp_sites_boundary_modificationPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_BOUNDARY_MODIFICATION,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_boundary_modifications associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_boundary_modifications
	 * @return <code>true</code> if the whp_sites has any whp_sites_boundary_modifications associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_boundary_modifications(long pk)
		throws SystemException {
		if (getwhp_sites_boundary_modificationsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_site_danger_lists associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_site_danger_lists associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		long pk) throws SystemException {
		return getwhp_site_danger_lists(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_site_danger_lists associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_site_danger_lists associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		long pk, int start, int end) throws SystemException {
		return getwhp_site_danger_lists(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITE_DANGER_LISTS = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_site_danger_listModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_site_danger_listModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_site_danger_listImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_site_danger_listPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_site_danger_lists",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITE_DANGER_LISTS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_site_danger_lists associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_site_danger_lists associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_site_danger_list> getwhp_site_danger_lists(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_site_danger_list> list = (List<com.iucn.whp.dbservice.model.whp_site_danger_list>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITE_DANGER_LISTS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITE_DANGER_LISTS.concat(ORDER_BY_CLAUSE)
													   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITE_DANGER_LISTS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_site_danger_list",
					com.iucn.whp.dbservice.model.impl.whp_site_danger_listImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_site_danger_list>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITE_DANGER_LISTS,
						finderArgs);
				}
				else {
					whp_site_danger_listPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITE_DANGER_LISTS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITE_DANGER_LISTS_SIZE = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_site_danger_listModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_site_danger_listModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_site_danger_listImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_site_danger_listPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_site_danger_listsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITE_DANGER_LISTS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_site_danger_lists associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_site_danger_lists associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_site_danger_listsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITE_DANGER_LISTS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITE_DANGER_LISTSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITE_DANGER_LISTS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITE_DANGER_LIST = new FinderPath(com.iucn.whp.dbservice.model.impl.whp_site_danger_listModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_site_danger_listModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_site_danger_listImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_site_danger_listPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_site_danger_list",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_site_danger_list is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_site_danger_listPK the primary key of the whp_site_danger_list
	 * @return <code>true</code> if the whp_site_danger_list is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_site_danger_list(long pk,
		long whp_site_danger_listPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_site_danger_listPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITE_DANGER_LIST,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_site_danger_list.contains(
							pk, whp_site_danger_listPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITE_DANGER_LIST,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_site_danger_lists associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_site_danger_lists
	 * @return <code>true</code> if the whp_sites has any whp_site_danger_lists associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_site_danger_lists(long pk)
		throws SystemException {
		if (getwhp_site_danger_listsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_iucn_recommendations associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_iucn_recommendations associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getwhp_sites_iucn_recommendations(
		long pk) throws SystemException {
		return getwhp_sites_iucn_recommendations(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_iucn_recommendations associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_iucn_recommendations associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getwhp_sites_iucn_recommendations(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_iucn_recommendations(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_recommendationPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_iucn_recommendations",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_iucn_recommendations associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_iucn_recommendations associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> getwhp_sites_iucn_recommendations(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> list = (List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_IUCN_RECOMMENDATIONS.concat(ORDER_BY_CLAUSE)
																.concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_IUCN_RECOMMENDATIONS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_iucn_recommendation",
					com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS,
						finderArgs);
				}
				else {
					whp_sites_iucn_recommendationPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_recommendationPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_iucn_recommendationsSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_iucn_recommendations associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_iucn_recommendations associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_iucn_recommendationsSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_IUCN_RECOMMENDATIONSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_IUCN_RECOMMENDATIONS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_IUCN_RECOMMENDATION =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_iucn_recommendationImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_iucn_recommendationPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_iucn_recommendation",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_iucn_recommendation is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_iucn_recommendationPK the primary key of the whp_sites_iucn_recommendation
	 * @return <code>true</code> if the whp_sites_iucn_recommendation is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_iucn_recommendation(long pk,
		long whp_sites_iucn_recommendationPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_iucn_recommendationPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_IUCN_RECOMMENDATION,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_iucn_recommendation.contains(
							pk, whp_sites_iucn_recommendationPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_IUCN_RECOMMENDATION,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_iucn_recommendations associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_iucn_recommendations
	 * @return <code>true</code> if the whp_sites has any whp_sites_iucn_recommendations associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_iucn_recommendations(long pk)
		throws SystemException {
		if (getwhp_sites_iucn_recommendationsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the whp_sites_inscription_criterias associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the whp_sites_inscription_criterias associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getwhp_sites_inscription_criterias(
		long pk) throws SystemException {
		return getwhp_sites_inscription_criterias(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the whp_sites_inscription_criterias associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @return the range of whp_sites_inscription_criterias associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getwhp_sites_inscription_criterias(
		long pk, int start, int end) throws SystemException {
		return getwhp_sites_inscription_criterias(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_criteriaPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_inscription_criterias",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the whp_sites_inscription_criterias associated with the whp_sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the whp_sites
	 * @param start the lower bound of the range of whp_siteses
	 * @param end the upper bound of the range of whp_siteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_sites_inscription_criterias associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> getwhp_sites_inscription_criterias(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria> list = (List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria>)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETWHP_SITES_INSCRIPTION_CRITERIAS.concat(ORDER_BY_CLAUSE)
																 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETWHP_SITES_INSCRIPTION_CRITERIAS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("whp_whp_sites_inscription_criteria",
					com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<com.iucn.whp.dbservice.model.whp_sites_inscription_criteria>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS,
						finderArgs);
				}
				else {
					whp_sites_inscription_criteriaPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS_SIZE =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_criteriaPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getwhp_sites_inscription_criteriasSize",
			new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of whp_sites_inscription_criterias associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @return the number of whp_sites_inscription_criterias associated with the whp_sites
	 * @throws SystemException if a system exception occurred
	 */
	public int getwhp_sites_inscription_criteriasSize(long pk)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETWHP_SITES_INSCRIPTION_CRITERIASSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_WHP_SITES_INSCRIPTION_CRITERIAS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_WHP_SITES_INSCRIPTION_CRITERIA =
		new FinderPath(com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaModelImpl.ENTITY_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaModelImpl.FINDER_CACHE_ENABLED,
			com.iucn.whp.dbservice.model.impl.whp_sites_inscription_criteriaImpl.class,
			com.iucn.whp.dbservice.service.persistence.whp_sites_inscription_criteriaPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containswhp_sites_inscription_criteria",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the whp_sites_inscription_criteria is associated with the whp_sites.
	 *
	 * @param pk the primary key of the whp_sites
	 * @param whp_sites_inscription_criteriaPK the primary key of the whp_sites_inscription_criteria
	 * @return <code>true</code> if the whp_sites_inscription_criteria is associated with the whp_sites; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_inscription_criteria(long pk,
		long whp_sites_inscription_criteriaPK) throws SystemException {
		Object[] finderArgs = new Object[] { pk, whp_sites_inscription_criteriaPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_WHP_SITES_INSCRIPTION_CRITERIA,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containswhp_sites_inscription_criteria.contains(
							pk, whp_sites_inscription_criteriaPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_WHP_SITES_INSCRIPTION_CRITERIA,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the whp_sites has any whp_sites_inscription_criterias associated with it.
	 *
	 * @param pk the primary key of the whp_sites to check for associations with whp_sites_inscription_criterias
	 * @return <code>true</code> if the whp_sites has any whp_sites_inscription_criterias associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containswhp_sites_inscription_criterias(long pk)
		throws SystemException {
		if (getwhp_sites_inscription_criteriasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the whp_sites persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.whp_sites")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<whp_sites>> listenersList = new ArrayList<ModelListener<whp_sites>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<whp_sites>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containswhp_sites_country = new Containswhp_sites_country();

		containswhp_sites_soc_reports = new Containswhp_sites_soc_reports();

		containswhp_sites_visitors = new Containswhp_sites_visitors();

		containswhp_sites_inscription_date = new Containswhp_sites_inscription_date();

		containswhp_sites_budget = new Containswhp_sites_budget();

		containswhp_sites_flagship_species = new Containswhp_sites_flagship_species();

		containswhp_sites_mee = new Containswhp_sites_mee();

		containsreinforced_monitoring = new Containsreinforced_monitoring();

		containswhp_sites_mission = new Containswhp_sites_mission();

		containswhp_sites_external_documents = new Containswhp_sites_external_documents();

		containswhp_sites_contacts = new Containswhp_sites_contacts();

		containswhp_sites_iucn_pa_category = new Containswhp_sites_iucn_pa_category();

		containswhp_sites_other_designations = new Containswhp_sites_other_designations();

		containswhp_sites_indigenous_communities = new Containswhp_sites_indigenous_communities();

		containswhp_sites_mgmt_plan_state = new Containswhp_sites_mgmt_plan_state();

		containswhp_sites_dsocr = new Containswhp_sites_dsocr();

		containswhp_sites_soouv = new Containswhp_sites_soouv();

		containswhp_sites_component = new Containswhp_sites_component();

		containswhp_sites_boundary_modification = new Containswhp_sites_boundary_modification();

		containswhp_site_danger_list = new Containswhp_site_danger_list();

		containswhp_sites_iucn_recommendation = new Containswhp_sites_iucn_recommendation();

		containswhp_sites_inscription_criteria = new Containswhp_sites_inscription_criteria();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(whp_sitesImpl.class.getName());
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
	@BeanReference(type = ImagePersistence.class)
	protected ImagePersistence imagePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	protected Containswhp_sites_country containswhp_sites_country;
	protected Containswhp_sites_soc_reports containswhp_sites_soc_reports;
	protected Containswhp_sites_visitors containswhp_sites_visitors;
	protected Containswhp_sites_inscription_date containswhp_sites_inscription_date;
	protected Containswhp_sites_budget containswhp_sites_budget;
	protected Containswhp_sites_flagship_species containswhp_sites_flagship_species;
	protected Containswhp_sites_mee containswhp_sites_mee;
	protected Containsreinforced_monitoring containsreinforced_monitoring;
	protected Containswhp_sites_mission containswhp_sites_mission;
	protected Containswhp_sites_external_documents containswhp_sites_external_documents;
	protected Containswhp_sites_contacts containswhp_sites_contacts;
	protected Containswhp_sites_iucn_pa_category containswhp_sites_iucn_pa_category;
	protected Containswhp_sites_other_designations containswhp_sites_other_designations;
	protected Containswhp_sites_indigenous_communities containswhp_sites_indigenous_communities;
	protected Containswhp_sites_mgmt_plan_state containswhp_sites_mgmt_plan_state;
	protected Containswhp_sites_dsocr containswhp_sites_dsocr;
	protected Containswhp_sites_soouv containswhp_sites_soouv;
	protected Containswhp_sites_component containswhp_sites_component;
	protected Containswhp_sites_boundary_modification containswhp_sites_boundary_modification;
	protected Containswhp_site_danger_list containswhp_site_danger_list;
	protected Containswhp_sites_iucn_recommendation containswhp_sites_iucn_recommendation;
	protected Containswhp_sites_inscription_criteria containswhp_sites_inscription_criteria;

	protected class Containswhp_sites_country {
		protected Containswhp_sites_country() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_COUNTRY,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_country_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_country_id)
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

	protected class Containswhp_sites_soc_reports {
		protected Containswhp_sites_soc_reports() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_SOC_REPORTS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_soc_reports_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_soc_reports_id)
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

	protected class Containswhp_sites_visitors {
		protected Containswhp_sites_visitors() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_VISITORS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_visitors_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_visitors_id)
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

	protected class Containswhp_sites_inscription_date {
		protected Containswhp_sites_inscription_date() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_INSCRIPTION_DATE,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_inscription_date_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_inscription_date_id)
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

	protected class Containswhp_sites_budget {
		protected Containswhp_sites_budget() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_BUDGET,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_budget_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_budget_id)
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

	protected class Containswhp_sites_flagship_species {
		protected Containswhp_sites_flagship_species() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_FLAGSHIP_SPECIES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_flagship_species_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_flagship_species_id)
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

	protected class Containswhp_sites_mee {
		protected Containswhp_sites_mee() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_MEE,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_mee_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_mee_id)
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

	protected class Containsreinforced_monitoring {
		protected Containsreinforced_monitoring() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSREINFORCED_MONITORING,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_reinforced_monitoring_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_reinforced_monitoring_id)
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

	protected class Containswhp_sites_mission {
		protected Containswhp_sites_mission() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_MISSION,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_mission_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_mission_id)
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

	protected class Containswhp_sites_external_documents {
		protected Containswhp_sites_external_documents() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_EXTERNAL_DOCUMENTS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_external_documents_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_external_documents_id)
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

	protected class Containswhp_sites_contacts {
		protected Containswhp_sites_contacts() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_CONTACTS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_contacts_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_contacts_id)
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

	protected class Containswhp_sites_iucn_pa_category {
		protected Containswhp_sites_iucn_pa_category() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_IUCN_PA_CATEGORY,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_iucn_pa_category_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_iucn_pa_category_id)
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

	protected class Containswhp_sites_other_designations {
		protected Containswhp_sites_other_designations() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_OTHER_DESIGNATIONS,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_other_designations_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_other_designations_id)
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

	protected class Containswhp_sites_indigenous_communities {
		protected Containswhp_sites_indigenous_communities() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_INDIGENOUS_COMMUNITIES,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_indigenous_communities_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_indigenous_communities_id)
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

	protected class Containswhp_sites_mgmt_plan_state {
		protected Containswhp_sites_mgmt_plan_state() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_MGMT_PLAN_STATE,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_mgmt_plan_state_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_mgmt_plan_state_id)
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

	protected class Containswhp_sites_dsocr {
		protected Containswhp_sites_dsocr() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_DSOCR,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_dsocr_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_dsocr_id)
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

	protected class Containswhp_sites_soouv {
		protected Containswhp_sites_soouv() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_SOOUV,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_soouv_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_soouv_id)
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

	protected class Containswhp_sites_component {
		protected Containswhp_sites_component() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_COMPONENT,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_sites_component_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_sites_component_id)
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

	protected class Containswhp_sites_boundary_modification {
		protected Containswhp_sites_boundary_modification() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_BOUNDARY_MODIFICATION,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_boundary_modification_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_boundary_modification_id)
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

	protected class Containswhp_site_danger_list {
		protected Containswhp_site_danger_list() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITE_DANGER_LIST,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id, long whp_site_danger_list_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id), new Long(whp_site_danger_list_id)
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

	protected class Containswhp_sites_iucn_recommendation {
		protected Containswhp_sites_iucn_recommendation() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_IUCN_RECOMMENDATION,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_iucn_recommendation_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_iucn_recommendation_id)
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

	protected class Containswhp_sites_inscription_criteria {
		protected Containswhp_sites_inscription_criteria() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSWHP_SITES_INSCRIPTION_CRITERIA,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long site_id,
			long whp_sites_inscription_criteria_id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(site_id),
						new Long(whp_sites_inscription_criteria_id)
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

	private static final String _SQL_SELECT_WHP_SITES = "SELECT whp_sites FROM whp_sites whp_sites";
	private static final String _SQL_SELECT_WHP_SITES_WHERE = "SELECT whp_sites FROM whp_sites whp_sites WHERE ";
	private static final String _SQL_COUNT_WHP_SITES = "SELECT COUNT(whp_sites) FROM whp_sites whp_sites";
	private static final String _SQL_COUNT_WHP_SITES_WHERE = "SELECT COUNT(whp_sites) FROM whp_sites whp_sites WHERE ";
	private static final String _SQL_GETWHP_SITES_COUNTRIES = "SELECT {whp_whp_sites_country.*} FROM whp_whp_sites_country INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_country.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_COUNTRIESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_country WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_COUNTRY = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_country WHERE site_id = ? AND whp_sites_country_id = ?";
	private static final String _SQL_GETWHP_SITES_SOC_REPORTSES = "SELECT {whp_whp_sites_soc_reports.*} FROM whp_whp_sites_soc_reports INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_soc_reports.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_SOC_REPORTSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_soc_reports WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_SOC_REPORTS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_soc_reports WHERE site_id = ? AND whp_sites_soc_reports_id = ?";
	private static final String _SQL_GETWHP_SITES_VISITORSES = "SELECT {whp_whp_sites_visitors.*} FROM whp_whp_sites_visitors INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_visitors.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_VISITORSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_visitors WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_VISITORS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_visitors WHERE site_id = ? AND whp_sites_visitors_id = ?";
	private static final String _SQL_GETWHP_SITES_INSCRIPTION_DATES = "SELECT {whp_whp_sites_inscription_date.*} FROM whp_whp_sites_inscription_date INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_inscription_date.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_INSCRIPTION_DATESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_inscription_date WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_INSCRIPTION_DATE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_inscription_date WHERE site_id = ? AND whp_sites_inscription_date_id = ?";
	private static final String _SQL_GETWHP_SITES_BUDGETS = "SELECT {whp_whp_sites_budget.*} FROM whp_whp_sites_budget INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_budget.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_BUDGETSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_budget WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_BUDGET = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_budget WHERE site_id = ? AND whp_sites_budget_id = ?";
	private static final String _SQL_GETWHP_SITES_FLAGSHIP_SPECIESES = "SELECT {whp_whp_sites_flagship_species.*} FROM whp_whp_sites_flagship_species INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_flagship_species.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_FLAGSHIP_SPECIESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_flagship_species WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_FLAGSHIP_SPECIES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_flagship_species WHERE site_id = ? AND whp_sites_flagship_species_id = ?";
	private static final String _SQL_GETWHP_SITES_MEES = "SELECT {whp_whp_sites_mee.*} FROM whp_whp_sites_mee INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_mee.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_MEESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_mee WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_MEE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_mee WHERE site_id = ? AND whp_sites_mee_id = ?";
	private static final String _SQL_GETREINFORCED_MONITORINGS = "SELECT {whp_reinforced_monitoring.*} FROM whp_reinforced_monitoring INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_reinforced_monitoring.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETREINFORCED_MONITORINGSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_reinforced_monitoring WHERE site_id = ?";
	private static final String _SQL_CONTAINSREINFORCED_MONITORING = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_reinforced_monitoring WHERE site_id = ? AND whp_sites_reinforced_monitoring_id = ?";
	private static final String _SQL_GETWHP_SITES_MISSIONS = "SELECT {whp_whp_sites_mission.*} FROM whp_whp_sites_mission INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_mission.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_MISSIONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_mission WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_MISSION = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_mission WHERE site_id = ? AND whp_sites_mission_id = ?";
	private static final String _SQL_GETWHP_SITES_EXTERNAL_DOCUMENTSES = "SELECT {whp_whp_sites_external_documents.*} FROM whp_whp_sites_external_documents INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_external_documents.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_EXTERNAL_DOCUMENTSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_external_documents WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_EXTERNAL_DOCUMENTS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_external_documents WHERE site_id = ? AND whp_sites_external_documents_id = ?";
	private static final String _SQL_GETWHP_SITES_CONTACTSES = "SELECT {whp_whp_sites_contacts.*} FROM whp_whp_sites_contacts INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_contacts.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_CONTACTSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_contacts WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_CONTACTS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_contacts WHERE site_id = ? AND whp_sites_contacts_id = ?";
	private static final String _SQL_GETWHP_SITES_IUCN_PA_CATEGORIES = "SELECT {whp_whp_sites_iucn_pa_category.*} FROM whp_whp_sites_iucn_pa_category INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_iucn_pa_category.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_IUCN_PA_CATEGORIESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_iucn_pa_category WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_IUCN_PA_CATEGORY = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_iucn_pa_category WHERE site_id = ? AND whp_sites_iucn_pa_category_id = ?";
	private static final String _SQL_GETWHP_SITES_OTHER_DESIGNATIONSES = "SELECT {whp_whp_sites_other_designations.*} FROM whp_whp_sites_other_designations INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_other_designations.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_OTHER_DESIGNATIONSESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_other_designations WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_OTHER_DESIGNATIONS = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_other_designations WHERE site_id = ? AND whp_sites_other_designations_id = ?";
	private static final String _SQL_GETWHP_SITES_INDIGENOUS_COMMUNITIESES = "SELECT {whp_whp_sites_indigenous_communities.*} FROM whp_whp_sites_indigenous_communities INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_indigenous_communities.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_INDIGENOUS_COMMUNITIESESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_indigenous_communities WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_INDIGENOUS_COMMUNITIES = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_indigenous_communities WHERE site_id = ? AND whp_sites_indigenous_communities_id = ?";
	private static final String _SQL_GETWHP_SITES_MGMT_PLAN_STATES = "SELECT {whp_whp_sites_mgmt_plan_state.*} FROM whp_whp_sites_mgmt_plan_state INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_mgmt_plan_state.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_MGMT_PLAN_STATESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_mgmt_plan_state WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_MGMT_PLAN_STATE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_mgmt_plan_state WHERE site_id = ? AND whp_sites_mgmt_plan_state_id = ?";
	private static final String _SQL_GETWHP_SITES_DSOCRS = "SELECT {whp_whp_sites_dsocr.*} FROM whp_whp_sites_dsocr INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_dsocr.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_DSOCRSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_dsocr WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_DSOCR = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_dsocr WHERE site_id = ? AND whp_sites_dsocr_id = ?";
	private static final String _SQL_GETWHP_SITES_SOOUVS = "SELECT {whp_whp_sites_soouv.*} FROM whp_whp_sites_soouv INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_soouv.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_SOOUVSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_soouv WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_SOOUV = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_soouv WHERE site_id = ? AND whp_sites_soouv_id = ?";
	private static final String _SQL_GETWHP_SITES_COMPONENTS = "SELECT {whp_whp_sites_component.*} FROM whp_whp_sites_component INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_component.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_COMPONENTSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_component WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_COMPONENT = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_component WHERE site_id = ? AND whp_sites_component_id = ?";
	private static final String _SQL_GETWHP_SITES_BOUNDARY_MODIFICATIONS = "SELECT {whp_whp_sites_boundary_modification.*} FROM whp_whp_sites_boundary_modification INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_boundary_modification.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_BOUNDARY_MODIFICATIONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_boundary_modification WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_BOUNDARY_MODIFICATION = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_boundary_modification WHERE site_id = ? AND whp_sites_boundary_modification_id = ?";
	private static final String _SQL_GETWHP_SITE_DANGER_LISTS = "SELECT {whp_whp_site_danger_list.*} FROM whp_whp_site_danger_list INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_site_danger_list.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITE_DANGER_LISTSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_site_danger_list WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITE_DANGER_LIST = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_site_danger_list WHERE site_id = ? AND whp_site_danger_list_id = ?";
	private static final String _SQL_GETWHP_SITES_IUCN_RECOMMENDATIONS = "SELECT {whp_whp_sites_iucn_recommendation.*} FROM whp_whp_sites_iucn_recommendation INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_iucn_recommendation.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_IUCN_RECOMMENDATIONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_iucn_recommendation WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_IUCN_RECOMMENDATION = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_iucn_recommendation WHERE site_id = ? AND whp_sites_iucn_recommendation_id = ?";
	private static final String _SQL_GETWHP_SITES_INSCRIPTION_CRITERIAS = "SELECT {whp_whp_sites_inscription_criteria.*} FROM whp_whp_sites_inscription_criteria INNER JOIN whp_whp_sites ON (whp_whp_sites.site_id = whp_whp_sites_inscription_criteria.site_id) WHERE (whp_whp_sites.site_id = ?)";
	private static final String _SQL_GETWHP_SITES_INSCRIPTION_CRITERIASSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_inscription_criteria WHERE site_id = ?";
	private static final String _SQL_CONTAINSWHP_SITES_INSCRIPTION_CRITERIA = "SELECT COUNT(*) AS COUNT_VALUE FROM whp_whp_sites_inscription_criteria WHERE site_id = ? AND whp_sites_inscription_criteria_id = ?";
	private static final String _FINDER_COLUMN_NAMEEN_NAME_EN_1 = "whp_sites.name_en IS NULL";
	private static final String _FINDER_COLUMN_NAMEEN_NAME_EN_2 = "whp_sites.name_en = ?";
	private static final String _FINDER_COLUMN_NAMEEN_NAME_EN_3 = "(whp_sites.name_en IS NULL OR whp_sites.name_en = ?)";
	private static final String _FINDER_COLUMN_ACTIVESITES_ACTIVE_2 = "whp_sites.active = ? AND whp_sites.active is true";
	private static final String _FINDER_COLUMN_THUMBNAILID_SMALL_THUMBNAILID_SMALL_2 =
		"whp_sites.thumbnailid_small = ?";
	private static final String _FINDER_COLUMN_THUMBNAILID_THUMBNAILID_2 = "whp_sites.thumbnailid = ?";
	private static final String _FINDER_COLUMN_WDPAID_WDPA_ID_2 = "whp_sites.wdpa_id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "whp_sites.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No whp_sites exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No whp_sites exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(whp_sitesPersistenceImpl.class);
	private static whp_sites _nullwhp_sites = new whp_sitesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<whp_sites> toCacheModel() {
				return _nullwhp_sitesCacheModel;
			}
		};

	private static CacheModel<whp_sites> _nullwhp_sitesCacheModel = new CacheModel<whp_sites>() {
			public whp_sites toEntityModel() {
				return _nullwhp_sites;
			}
		};
}