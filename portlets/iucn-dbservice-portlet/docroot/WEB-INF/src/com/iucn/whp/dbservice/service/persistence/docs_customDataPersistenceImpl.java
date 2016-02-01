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

import com.iucn.whp.dbservice.NoSuchdocs_customDataException;
import com.iucn.whp.dbservice.model.docs_customData;
import com.iucn.whp.dbservice.model.impl.docs_customDataImpl;
import com.iucn.whp.dbservice.model.impl.docs_customDataModelImpl;

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
import com.liferay.portal.kernel.util.CalendarUtil;
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
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the docs_custom data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see docs_customDataPersistence
 * @see docs_customDataUtil
 * @generated
 */
public class docs_customDataPersistenceImpl extends BasePersistenceImpl<docs_customData>
	implements docs_customDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link docs_customDataUtil} to access the docs_custom data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = docs_customDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEID = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfileid",
			new String[] {
				Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEID =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfileid",
			new String[] { Date.class.getName() },
			docs_customDataModelImpl.PUBLISH_DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEID = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfileid",
			new String[] { Date.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEIDUPLOAD =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfileidupload",
			new String[] {
				Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDUPLOAD =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfileidupload",
			new String[] { Date.class.getName() },
			docs_customDataModelImpl.UPLOAD_DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEIDUPLOAD = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfileidupload",
			new String[] { Date.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEIDAUTH =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfileidauth",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDAUTH =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfileidauth",
			new String[] { String.class.getName() },
			docs_customDataModelImpl.AUTHOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEIDAUTH = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfileidauth",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_FILEOBJ = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByfileobj", new String[] { Long.class.getName() },
			docs_customDataModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEOBJ = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfileobj",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILECATEGORY =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfilecategory",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILECATEGORY =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfilecategory",
			new String[] { String.class.getName() },
			docs_customDataModelImpl.CATEGORY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILECATEGORY = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfilecategory",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILETYPE = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfiletype",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILETYPE =
		new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfiletype",
			new String[] { String.class.getName() },
			docs_customDataModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILETYPE = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfiletype",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_FILEENTRYID = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByFileEntryId", new String[] { Long.class.getName() },
			docs_customDataModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEENTRYID = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFileEntryId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED,
			docs_customDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the docs_custom data in the entity cache if it is enabled.
	 *
	 * @param docs_customData the docs_custom data
	 */
	public void cacheResult(docs_customData docs_customData) {
		EntityCacheUtil.putResult(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataImpl.class, docs_customData.getPrimaryKey(),
			docs_customData);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEOBJ,
			new Object[] { Long.valueOf(docs_customData.getFileentryid()) },
			docs_customData);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
			new Object[] { Long.valueOf(docs_customData.getFileentryid()) },
			docs_customData);

		docs_customData.resetOriginalValues();
	}

	/**
	 * Caches the docs_custom datas in the entity cache if it is enabled.
	 *
	 * @param docs_customDatas the docs_custom datas
	 */
	public void cacheResult(List<docs_customData> docs_customDatas) {
		for (docs_customData docs_customData : docs_customDatas) {
			if (EntityCacheUtil.getResult(
						docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
						docs_customDataImpl.class,
						docs_customData.getPrimaryKey()) == null) {
				cacheResult(docs_customData);
			}
			else {
				docs_customData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all docs_custom datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(docs_customDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(docs_customDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the docs_custom data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(docs_customData docs_customData) {
		EntityCacheUtil.removeResult(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataImpl.class, docs_customData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(docs_customData);
	}

	@Override
	public void clearCache(List<docs_customData> docs_customDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (docs_customData docs_customData : docs_customDatas) {
			EntityCacheUtil.removeResult(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
				docs_customDataImpl.class, docs_customData.getPrimaryKey());

			clearUniqueFindersCache(docs_customData);
		}
	}

	protected void clearUniqueFindersCache(docs_customData docs_customData) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEOBJ,
			new Object[] { Long.valueOf(docs_customData.getFileentryid()) });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
			new Object[] { Long.valueOf(docs_customData.getFileentryid()) });
	}

	/**
	 * Creates a new docs_custom data with the primary key. Does not add the docs_custom data to the database.
	 *
	 * @param docs_customDataId the primary key for the new docs_custom data
	 * @return the new docs_custom data
	 */
	public docs_customData create(int docs_customDataId) {
		docs_customData docs_customData = new docs_customDataImpl();

		docs_customData.setNew(true);
		docs_customData.setPrimaryKey(docs_customDataId);

		return docs_customData;
	}

	/**
	 * Removes the docs_custom data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docs_customDataId the primary key of the docs_custom data
	 * @return the docs_custom data that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData remove(int docs_customDataId)
		throws NoSuchdocs_customDataException, SystemException {
		return remove(Integer.valueOf(docs_customDataId));
	}

	/**
	 * Removes the docs_custom data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the docs_custom data
	 * @return the docs_custom data that was removed
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public docs_customData remove(Serializable primaryKey)
		throws NoSuchdocs_customDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			docs_customData docs_customData = (docs_customData)session.get(docs_customDataImpl.class,
					primaryKey);

			if (docs_customData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdocs_customDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(docs_customData);
		}
		catch (NoSuchdocs_customDataException nsee) {
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
	protected docs_customData removeImpl(docs_customData docs_customData)
		throws SystemException {
		docs_customData = toUnwrappedModel(docs_customData);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, docs_customData);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(docs_customData);

		return docs_customData;
	}

	@Override
	public docs_customData updateImpl(
		com.iucn.whp.dbservice.model.docs_customData docs_customData,
		boolean merge) throws SystemException {
		docs_customData = toUnwrappedModel(docs_customData);

		boolean isNew = docs_customData.isNew();

		docs_customDataModelImpl docs_customDataModelImpl = (docs_customDataModelImpl)docs_customData;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, docs_customData, merge);

			docs_customData.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !docs_customDataModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docs_customDataModelImpl.getOriginalPublish_date()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEID,
					args);

				args = new Object[] { docs_customDataModelImpl.getPublish_date() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEID,
					args);
			}

			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDUPLOAD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docs_customDataModelImpl.getOriginalUpload_date()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEIDUPLOAD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDUPLOAD,
					args);

				args = new Object[] { docs_customDataModelImpl.getUpload_date() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEIDUPLOAD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDUPLOAD,
					args);
			}

			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDAUTH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docs_customDataModelImpl.getOriginalAuthor()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEIDAUTH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDAUTH,
					args);

				args = new Object[] { docs_customDataModelImpl.getAuthor() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEIDAUTH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDAUTH,
					args);
			}

			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILECATEGORY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docs_customDataModelImpl.getOriginalCategory()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILECATEGORY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILECATEGORY,
					args);

				args = new Object[] { docs_customDataModelImpl.getCategory() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILECATEGORY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILECATEGORY,
					args);
			}

			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILETYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						docs_customDataModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILETYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILETYPE,
					args);

				args = new Object[] { docs_customDataModelImpl.getType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILETYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILETYPE,
					args);
			}
		}

		EntityCacheUtil.putResult(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
			docs_customDataImpl.class, docs_customData.getPrimaryKey(),
			docs_customData);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEOBJ,
				new Object[] { Long.valueOf(docs_customData.getFileentryid()) },
				docs_customData);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
				new Object[] { Long.valueOf(docs_customData.getFileentryid()) },
				docs_customData);
		}
		else {
			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FILEOBJ.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(docs_customDataModelImpl.getOriginalFileentryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEOBJ, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEOBJ, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEOBJ,
					new Object[] { Long.valueOf(
							docs_customData.getFileentryid()) }, docs_customData);
			}

			if ((docs_customDataModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FILEENTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(docs_customDataModelImpl.getOriginalFileentryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEENTRYID,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
					new Object[] { Long.valueOf(
							docs_customData.getFileentryid()) }, docs_customData);
			}
		}

		return docs_customData;
	}

	protected docs_customData toUnwrappedModel(docs_customData docs_customData) {
		if (docs_customData instanceof docs_customDataImpl) {
			return docs_customData;
		}

		docs_customDataImpl docs_customDataImpl = new docs_customDataImpl();

		docs_customDataImpl.setNew(docs_customData.isNew());
		docs_customDataImpl.setPrimaryKey(docs_customData.getPrimaryKey());

		docs_customDataImpl.setDocs_customDataId(docs_customData.getDocs_customDataId());
		docs_customDataImpl.setFileentryid(docs_customData.getFileentryid());
		docs_customDataImpl.setFileversionid(docs_customData.getFileversionid());
		docs_customDataImpl.setPublish_date(docs_customData.getPublish_date());
		docs_customDataImpl.setUpload_date(docs_customData.getUpload_date());
		docs_customDataImpl.setAuthor(docs_customData.getAuthor());
		docs_customDataImpl.setType(docs_customData.getType());
		docs_customDataImpl.setCategory(docs_customData.getCategory());
		docs_customDataImpl.setCom(docs_customData.getCom());
		docs_customDataImpl.setFull_com(docs_customData.getFull_com());
		docs_customDataImpl.setSite(docs_customData.getSite());
		docs_customDataImpl.setLanguage(docs_customData.getLanguage());
		docs_customDataImpl.setCopyright(docs_customData.getCopyright());
		docs_customDataImpl.setTitle(docs_customData.getTitle());

		return docs_customDataImpl;
	}

	/**
	 * Returns the docs_custom data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the docs_custom data
	 * @return the docs_custom data
	 * @throws com.liferay.portal.NoSuchModelException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public docs_customData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the docs_custom data with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	 *
	 * @param docs_customDataId the primary key of the docs_custom data
	 * @return the docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByPrimaryKey(int docs_customDataId)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByPrimaryKey(docs_customDataId);

		if (docs_customData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + docs_customDataId);
			}

			throw new NoSuchdocs_customDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				docs_customDataId);
		}

		return docs_customData;
	}

	/**
	 * Returns the docs_custom data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the docs_custom data
	 * @return the docs_custom data, or <code>null</code> if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public docs_customData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the docs_custom data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docs_customDataId the primary key of the docs_custom data
	 * @return the docs_custom data, or <code>null</code> if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByPrimaryKey(int docs_customDataId)
		throws SystemException {
		docs_customData docs_customData = (docs_customData)EntityCacheUtil.getResult(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
				docs_customDataImpl.class, docs_customDataId);

		if (docs_customData == _nulldocs_customData) {
			return null;
		}

		if (docs_customData == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				docs_customData = (docs_customData)session.get(docs_customDataImpl.class,
						Integer.valueOf(docs_customDataId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (docs_customData != null) {
					cacheResult(docs_customData);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(docs_customDataModelImpl.ENTITY_CACHE_ENABLED,
						docs_customDataImpl.class, docs_customDataId,
						_nulldocs_customData);
				}

				closeSession(session);
			}
		}

		return docs_customData;
	}

	/**
	 * Returns all the docs_custom datas where publish_date = &#63;.
	 *
	 * @param publish_date the publish_date
	 * @return the matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileid(Date publish_date)
		throws SystemException {
		return findByfileid(publish_date, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the docs_custom datas where publish_date = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param publish_date the publish_date
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @return the range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileid(Date publish_date, int start,
		int end) throws SystemException {
		return findByfileid(publish_date, start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_custom datas where publish_date = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param publish_date the publish_date
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileid(Date publish_date, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEID;
			finderArgs = new Object[] { publish_date };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEID;
			finderArgs = new Object[] {
					publish_date,
					
					start, end, orderByComparator
				};
		}

		List<docs_customData> list = (List<docs_customData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (docs_customData docs_customData : list) {
				if (!Validator.equals(publish_date,
							docs_customData.getPublish_date())) {
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

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			if (publish_date == null) {
				query.append(_FINDER_COLUMN_FILEID_PUBLISH_DATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_FILEID_PUBLISH_DATE_2);
			}

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

				if (publish_date != null) {
					qPos.add(CalendarUtil.getTimestamp(publish_date));
				}

				list = (List<docs_customData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first docs_custom data in the ordered set where publish_date = &#63;.
	 *
	 * @param publish_date the publish_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileid_First(Date publish_date,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileid_First(publish_date,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("publish_date=");
		msg.append(publish_date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the first docs_custom data in the ordered set where publish_date = &#63;.
	 *
	 * @param publish_date the publish_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileid_First(Date publish_date,
		OrderByComparator orderByComparator) throws SystemException {
		List<docs_customData> list = findByfileid(publish_date, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last docs_custom data in the ordered set where publish_date = &#63;.
	 *
	 * @param publish_date the publish_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileid_Last(Date publish_date,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileid_Last(publish_date,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("publish_date=");
		msg.append(publish_date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the last docs_custom data in the ordered set where publish_date = &#63;.
	 *
	 * @param publish_date the publish_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileid_Last(Date publish_date,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfileid(publish_date);

		List<docs_customData> list = findByfileid(publish_date, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the docs_custom datas before and after the current docs_custom data in the ordered set where publish_date = &#63;.
	 *
	 * @param docs_customDataId the primary key of the current docs_custom data
	 * @param publish_date the publish_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData[] findByfileid_PrevAndNext(int docs_customDataId,
		Date publish_date, OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByPrimaryKey(docs_customDataId);

		Session session = null;

		try {
			session = openSession();

			docs_customData[] array = new docs_customDataImpl[3];

			array[0] = getByfileid_PrevAndNext(session, docs_customData,
					publish_date, orderByComparator, true);

			array[1] = docs_customData;

			array[2] = getByfileid_PrevAndNext(session, docs_customData,
					publish_date, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected docs_customData getByfileid_PrevAndNext(Session session,
		docs_customData docs_customData, Date publish_date,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

		if (publish_date == null) {
			query.append(_FINDER_COLUMN_FILEID_PUBLISH_DATE_1);
		}
		else {
			query.append(_FINDER_COLUMN_FILEID_PUBLISH_DATE_2);
		}

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

		if (publish_date != null) {
			qPos.add(CalendarUtil.getTimestamp(publish_date));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docs_customData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<docs_customData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the docs_custom datas where upload_date = &#63;.
	 *
	 * @param upload_date the upload_date
	 * @return the matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileidupload(Date upload_date)
		throws SystemException {
		return findByfileidupload(upload_date, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the docs_custom datas where upload_date = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param upload_date the upload_date
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @return the range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileidupload(Date upload_date,
		int start, int end) throws SystemException {
		return findByfileidupload(upload_date, start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_custom datas where upload_date = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param upload_date the upload_date
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileidupload(Date upload_date,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDUPLOAD;
			finderArgs = new Object[] { upload_date };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEIDUPLOAD;
			finderArgs = new Object[] { upload_date, start, end, orderByComparator };
		}

		List<docs_customData> list = (List<docs_customData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (docs_customData docs_customData : list) {
				if (!Validator.equals(upload_date,
							docs_customData.getUpload_date())) {
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

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			if (upload_date == null) {
				query.append(_FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_2);
			}

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

				if (upload_date != null) {
					qPos.add(CalendarUtil.getTimestamp(upload_date));
				}

				list = (List<docs_customData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first docs_custom data in the ordered set where upload_date = &#63;.
	 *
	 * @param upload_date the upload_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileidupload_First(Date upload_date,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileidupload_First(upload_date,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("upload_date=");
		msg.append(upload_date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the first docs_custom data in the ordered set where upload_date = &#63;.
	 *
	 * @param upload_date the upload_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileidupload_First(Date upload_date,
		OrderByComparator orderByComparator) throws SystemException {
		List<docs_customData> list = findByfileidupload(upload_date, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last docs_custom data in the ordered set where upload_date = &#63;.
	 *
	 * @param upload_date the upload_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileidupload_Last(Date upload_date,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileidupload_Last(upload_date,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("upload_date=");
		msg.append(upload_date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the last docs_custom data in the ordered set where upload_date = &#63;.
	 *
	 * @param upload_date the upload_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileidupload_Last(Date upload_date,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfileidupload(upload_date);

		List<docs_customData> list = findByfileidupload(upload_date, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the docs_custom datas before and after the current docs_custom data in the ordered set where upload_date = &#63;.
	 *
	 * @param docs_customDataId the primary key of the current docs_custom data
	 * @param upload_date the upload_date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData[] findByfileidupload_PrevAndNext(
		int docs_customDataId, Date upload_date,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByPrimaryKey(docs_customDataId);

		Session session = null;

		try {
			session = openSession();

			docs_customData[] array = new docs_customDataImpl[3];

			array[0] = getByfileidupload_PrevAndNext(session, docs_customData,
					upload_date, orderByComparator, true);

			array[1] = docs_customData;

			array[2] = getByfileidupload_PrevAndNext(session, docs_customData,
					upload_date, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected docs_customData getByfileidupload_PrevAndNext(Session session,
		docs_customData docs_customData, Date upload_date,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

		if (upload_date == null) {
			query.append(_FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_1);
		}
		else {
			query.append(_FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_2);
		}

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

		if (upload_date != null) {
			qPos.add(CalendarUtil.getTimestamp(upload_date));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docs_customData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<docs_customData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the docs_custom datas where author = &#63;.
	 *
	 * @param author the author
	 * @return the matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileidauth(String author)
		throws SystemException {
		return findByfileidauth(author, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the docs_custom datas where author = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param author the author
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @return the range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileidauth(String author, int start,
		int end) throws SystemException {
		return findByfileidauth(author, start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_custom datas where author = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param author the author
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfileidauth(String author, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEIDAUTH;
			finderArgs = new Object[] { author };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEIDAUTH;
			finderArgs = new Object[] { author, start, end, orderByComparator };
		}

		List<docs_customData> list = (List<docs_customData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (docs_customData docs_customData : list) {
				if (!Validator.equals(author, docs_customData.getAuthor())) {
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

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			if (author == null) {
				query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_1);
			}
			else {
				if (author.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_3);
				}
				else {
					query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_2);
				}
			}

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

				if (author != null) {
					qPos.add(author);
				}

				list = (List<docs_customData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first docs_custom data in the ordered set where author = &#63;.
	 *
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileidauth_First(String author,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileidauth_First(author,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("author=");
		msg.append(author);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the first docs_custom data in the ordered set where author = &#63;.
	 *
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileidauth_First(String author,
		OrderByComparator orderByComparator) throws SystemException {
		List<docs_customData> list = findByfileidauth(author, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last docs_custom data in the ordered set where author = &#63;.
	 *
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileidauth_Last(String author,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileidauth_Last(author,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("author=");
		msg.append(author);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the last docs_custom data in the ordered set where author = &#63;.
	 *
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileidauth_Last(String author,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfileidauth(author);

		List<docs_customData> list = findByfileidauth(author, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the docs_custom datas before and after the current docs_custom data in the ordered set where author = &#63;.
	 *
	 * @param docs_customDataId the primary key of the current docs_custom data
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData[] findByfileidauth_PrevAndNext(
		int docs_customDataId, String author,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByPrimaryKey(docs_customDataId);

		Session session = null;

		try {
			session = openSession();

			docs_customData[] array = new docs_customDataImpl[3];

			array[0] = getByfileidauth_PrevAndNext(session, docs_customData,
					author, orderByComparator, true);

			array[1] = docs_customData;

			array[2] = getByfileidauth_PrevAndNext(session, docs_customData,
					author, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected docs_customData getByfileidauth_PrevAndNext(Session session,
		docs_customData docs_customData, String author,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

		if (author == null) {
			query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_1);
		}
		else {
			if (author.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_3);
			}
			else {
				query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_2);
			}
		}

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

		if (author != null) {
			qPos.add(author);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docs_customData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<docs_customData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the docs_custom data where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfileobj(long fileentryid)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfileobj(fileentryid);

		if (docs_customData == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fileentryid=");
			msg.append(fileentryid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchdocs_customDataException(msg.toString());
		}

		return docs_customData;
	}

	/**
	 * Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileobj(long fileentryid)
		throws SystemException {
		return fetchByfileobj(fileentryid, true);
	}

	/**
	 * Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfileobj(long fileentryid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FILEOBJ,
					finderArgs, this);
		}

		if (result instanceof docs_customData) {
			docs_customData docs_customData = (docs_customData)result;

			if ((fileentryid != docs_customData.getFileentryid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			query.append(_FINDER_COLUMN_FILEOBJ_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				List<docs_customData> list = q.list();

				result = list;

				docs_customData docs_customData = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEOBJ,
						finderArgs, list);
				}
				else {
					docs_customData = list.get(0);

					cacheResult(docs_customData);

					if ((docs_customData.getFileentryid() != fileentryid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEOBJ,
							finderArgs, docs_customData);
					}
				}

				return docs_customData;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEOBJ,
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
				return (docs_customData)result;
			}
		}
	}

	/**
	 * Returns all the docs_custom datas where category = &#63;.
	 *
	 * @param category the category
	 * @return the matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfilecategory(String category)
		throws SystemException {
		return findByfilecategory(category, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the docs_custom datas where category = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param category the category
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @return the range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfilecategory(String category, int start,
		int end) throws SystemException {
		return findByfilecategory(category, start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_custom datas where category = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param category the category
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfilecategory(String category, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILECATEGORY;
			finderArgs = new Object[] { category };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILECATEGORY;
			finderArgs = new Object[] { category, start, end, orderByComparator };
		}

		List<docs_customData> list = (List<docs_customData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (docs_customData docs_customData : list) {
				if (!Validator.equals(category, docs_customData.getCategory())) {
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

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			if (category == null) {
				query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_1);
			}
			else {
				if (category.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_3);
				}
				else {
					query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_2);
				}
			}

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

				if (category != null) {
					qPos.add(category);
				}

				list = (List<docs_customData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first docs_custom data in the ordered set where category = &#63;.
	 *
	 * @param category the category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfilecategory_First(String category,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfilecategory_First(category,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category=");
		msg.append(category);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the first docs_custom data in the ordered set where category = &#63;.
	 *
	 * @param category the category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfilecategory_First(String category,
		OrderByComparator orderByComparator) throws SystemException {
		List<docs_customData> list = findByfilecategory(category, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last docs_custom data in the ordered set where category = &#63;.
	 *
	 * @param category the category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfilecategory_Last(String category,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfilecategory_Last(category,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category=");
		msg.append(category);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the last docs_custom data in the ordered set where category = &#63;.
	 *
	 * @param category the category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfilecategory_Last(String category,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfilecategory(category);

		List<docs_customData> list = findByfilecategory(category, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the docs_custom datas before and after the current docs_custom data in the ordered set where category = &#63;.
	 *
	 * @param docs_customDataId the primary key of the current docs_custom data
	 * @param category the category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData[] findByfilecategory_PrevAndNext(
		int docs_customDataId, String category,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByPrimaryKey(docs_customDataId);

		Session session = null;

		try {
			session = openSession();

			docs_customData[] array = new docs_customDataImpl[3];

			array[0] = getByfilecategory_PrevAndNext(session, docs_customData,
					category, orderByComparator, true);

			array[1] = docs_customData;

			array[2] = getByfilecategory_PrevAndNext(session, docs_customData,
					category, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected docs_customData getByfilecategory_PrevAndNext(Session session,
		docs_customData docs_customData, String category,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

		if (category == null) {
			query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_1);
		}
		else {
			if (category.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_3);
			}
			else {
				query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_2);
			}
		}

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

		if (category != null) {
			qPos.add(category);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docs_customData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<docs_customData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the docs_custom datas where type = &#63;.
	 *
	 * @param type the type
	 * @return the matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfiletype(String type)
		throws SystemException {
		return findByfiletype(type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the docs_custom datas where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @return the range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfiletype(String type, int start, int end)
		throws SystemException {
		return findByfiletype(type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_custom datas where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findByfiletype(String type, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILETYPE;
			finderArgs = new Object[] { type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILETYPE;
			finderArgs = new Object[] { type, start, end, orderByComparator };
		}

		List<docs_customData> list = (List<docs_customData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (docs_customData docs_customData : list) {
				if (!Validator.equals(type, docs_customData.getType())) {
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

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			if (type == null) {
				query.append(_FINDER_COLUMN_FILETYPE_TYPE_1);
			}
			else {
				if (type.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FILETYPE_TYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_FILETYPE_TYPE_2);
				}
			}

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

				if (type != null) {
					qPos.add(type);
				}

				list = (List<docs_customData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first docs_custom data in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfiletype_First(String type,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfiletype_First(type,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the first docs_custom data in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfiletype_First(String type,
		OrderByComparator orderByComparator) throws SystemException {
		List<docs_customData> list = findByfiletype(type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last docs_custom data in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByfiletype_Last(String type,
		OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByfiletype_Last(type,
				orderByComparator);

		if (docs_customData != null) {
			return docs_customData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchdocs_customDataException(msg.toString());
	}

	/**
	 * Returns the last docs_custom data in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByfiletype_Last(String type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfiletype(type);

		List<docs_customData> list = findByfiletype(type, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the docs_custom datas before and after the current docs_custom data in the ordered set where type = &#63;.
	 *
	 * @param docs_customDataId the primary key of the current docs_custom data
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a docs_custom data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData[] findByfiletype_PrevAndNext(int docs_customDataId,
		String type, OrderByComparator orderByComparator)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByPrimaryKey(docs_customDataId);

		Session session = null;

		try {
			session = openSession();

			docs_customData[] array = new docs_customDataImpl[3];

			array[0] = getByfiletype_PrevAndNext(session, docs_customData,
					type, orderByComparator, true);

			array[1] = docs_customData;

			array[2] = getByfiletype_PrevAndNext(session, docs_customData,
					type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected docs_customData getByfiletype_PrevAndNext(Session session,
		docs_customData docs_customData, String type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

		if (type == null) {
			query.append(_FINDER_COLUMN_FILETYPE_TYPE_1);
		}
		else {
			if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FILETYPE_TYPE_3);
			}
			else {
				query.append(_FINDER_COLUMN_FILETYPE_TYPE_2);
			}
		}

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

		if (type != null) {
			qPos.add(type);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(docs_customData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<docs_customData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the docs_custom data where fileentryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuchdocs_customDataException} if it could not be found.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching docs_custom data
	 * @throws com.iucn.whp.dbservice.NoSuchdocs_customDataException if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData findByFileEntryId(long fileentryid)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = fetchByFileEntryId(fileentryid);

		if (docs_customData == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fileentryid=");
			msg.append(fileentryid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchdocs_customDataException(msg.toString());
		}

		return docs_customData;
	}

	/**
	 * Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByFileEntryId(long fileentryid)
		throws SystemException {
		return fetchByFileEntryId(fileentryid, true);
	}

	/**
	 * Returns the docs_custom data where fileentryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fileentryid the fileentryid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching docs_custom data, or <code>null</code> if a matching docs_custom data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData fetchByFileEntryId(long fileentryid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
					finderArgs, this);
		}

		if (result instanceof docs_customData) {
			docs_customData docs_customData = (docs_customData)result;

			if ((fileentryid != docs_customData.getFileentryid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_DOCS_CUSTOMDATA_WHERE);

			query.append(_FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				List<docs_customData> list = q.list();

				result = list;

				docs_customData docs_customData = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
						finderArgs, list);
				}
				else {
					docs_customData = list.get(0);

					cacheResult(docs_customData);

					if ((docs_customData.getFileentryid() != fileentryid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
							finderArgs, docs_customData);
					}
				}

				return docs_customData;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FILEENTRYID,
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
				return (docs_customData)result;
			}
		}
	}

	/**
	 * Returns all the docs_custom datas.
	 *
	 * @return the docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the docs_custom datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @return the range of docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the docs_custom datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of docs_custom datas
	 * @param end the upper bound of the range of docs_custom datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<docs_customData> findAll(int start, int end,
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

		List<docs_customData> list = (List<docs_customData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCS_CUSTOMDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCS_CUSTOMDATA;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<docs_customData>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<docs_customData>)QueryUtil.list(q,
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
	 * Removes all the docs_custom datas where publish_date = &#63; from the database.
	 *
	 * @param publish_date the publish_date
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfileid(Date publish_date) throws SystemException {
		for (docs_customData docs_customData : findByfileid(publish_date)) {
			remove(docs_customData);
		}
	}

	/**
	 * Removes all the docs_custom datas where upload_date = &#63; from the database.
	 *
	 * @param upload_date the upload_date
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfileidupload(Date upload_date)
		throws SystemException {
		for (docs_customData docs_customData : findByfileidupload(upload_date)) {
			remove(docs_customData);
		}
	}

	/**
	 * Removes all the docs_custom datas where author = &#63; from the database.
	 *
	 * @param author the author
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfileidauth(String author) throws SystemException {
		for (docs_customData docs_customData : findByfileidauth(author)) {
			remove(docs_customData);
		}
	}

	/**
	 * Removes the docs_custom data where fileentryid = &#63; from the database.
	 *
	 * @param fileentryid the fileentryid
	 * @return the docs_custom data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData removeByfileobj(long fileentryid)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByfileobj(fileentryid);

		return remove(docs_customData);
	}

	/**
	 * Removes all the docs_custom datas where category = &#63; from the database.
	 *
	 * @param category the category
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfilecategory(String category) throws SystemException {
		for (docs_customData docs_customData : findByfilecategory(category)) {
			remove(docs_customData);
		}
	}

	/**
	 * Removes all the docs_custom datas where type = &#63; from the database.
	 *
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfiletype(String type) throws SystemException {
		for (docs_customData docs_customData : findByfiletype(type)) {
			remove(docs_customData);
		}
	}

	/**
	 * Removes the docs_custom data where fileentryid = &#63; from the database.
	 *
	 * @param fileentryid the fileentryid
	 * @return the docs_custom data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public docs_customData removeByFileEntryId(long fileentryid)
		throws NoSuchdocs_customDataException, SystemException {
		docs_customData docs_customData = findByFileEntryId(fileentryid);

		return remove(docs_customData);
	}

	/**
	 * Removes all the docs_custom datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (docs_customData docs_customData : findAll()) {
			remove(docs_customData);
		}
	}

	/**
	 * Returns the number of docs_custom datas where publish_date = &#63;.
	 *
	 * @param publish_date the publish_date
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfileid(Date publish_date) throws SystemException {
		Object[] finderArgs = new Object[] { publish_date };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			if (publish_date == null) {
				query.append(_FINDER_COLUMN_FILEID_PUBLISH_DATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_FILEID_PUBLISH_DATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (publish_date != null) {
					qPos.add(CalendarUtil.getTimestamp(publish_date));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILEID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas where upload_date = &#63;.
	 *
	 * @param upload_date the upload_date
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfileidupload(Date upload_date) throws SystemException {
		Object[] finderArgs = new Object[] { upload_date };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEIDUPLOAD,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			if (upload_date == null) {
				query.append(_FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (upload_date != null) {
					qPos.add(CalendarUtil.getTimestamp(upload_date));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILEIDUPLOAD,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas where author = &#63;.
	 *
	 * @param author the author
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfileidauth(String author) throws SystemException {
		Object[] finderArgs = new Object[] { author };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEIDAUTH,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			if (author == null) {
				query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_1);
			}
			else {
				if (author.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_3);
				}
				else {
					query.append(_FINDER_COLUMN_FILEIDAUTH_AUTHOR_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (author != null) {
					qPos.add(author);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILEIDAUTH,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas where fileentryid = &#63;.
	 *
	 * @param fileentryid the fileentryid
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfileobj(long fileentryid) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEOBJ,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			query.append(_FINDER_COLUMN_FILEOBJ_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILEOBJ,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas where category = &#63;.
	 *
	 * @param category the category
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfilecategory(String category) throws SystemException {
		Object[] finderArgs = new Object[] { category };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILECATEGORY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			if (category == null) {
				query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_1);
			}
			else {
				if (category.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_3);
				}
				else {
					query.append(_FINDER_COLUMN_FILECATEGORY_CATEGORY_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (category != null) {
					qPos.add(category);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILECATEGORY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas where type = &#63;.
	 *
	 * @param type the type
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfiletype(String type) throws SystemException {
		Object[] finderArgs = new Object[] { type };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILETYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			if (type == null) {
				query.append(_FINDER_COLUMN_FILETYPE_TYPE_1);
			}
			else {
				if (type.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FILETYPE_TYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_FILETYPE_TYPE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (type != null) {
					qPos.add(type);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILETYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas where fileentryid = &#63;.
	 *
	 * @param fileentryid the fileentryid
	 * @return the number of matching docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFileEntryId(long fileentryid) throws SystemException {
		Object[] finderArgs = new Object[] { fileentryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FILEENTRYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCS_CUSTOMDATA_WHERE);

			query.append(_FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileentryid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FILEENTRYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of docs_custom datas.
	 *
	 * @return the number of docs_custom datas
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCS_CUSTOMDATA);

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
	 * Initializes the docs_custom data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.docs_customData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<docs_customData>> listenersList = new ArrayList<ModelListener<docs_customData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<docs_customData>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(docs_customDataImpl.class.getName());
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
	private static final String _SQL_SELECT_DOCS_CUSTOMDATA = "SELECT docs_customData FROM docs_customData docs_customData";
	private static final String _SQL_SELECT_DOCS_CUSTOMDATA_WHERE = "SELECT docs_customData FROM docs_customData docs_customData WHERE ";
	private static final String _SQL_COUNT_DOCS_CUSTOMDATA = "SELECT COUNT(docs_customData) FROM docs_customData docs_customData";
	private static final String _SQL_COUNT_DOCS_CUSTOMDATA_WHERE = "SELECT COUNT(docs_customData) FROM docs_customData docs_customData WHERE ";
	private static final String _FINDER_COLUMN_FILEID_PUBLISH_DATE_1 = "docs_customData.publish_date IS NULL";
	private static final String _FINDER_COLUMN_FILEID_PUBLISH_DATE_2 = "docs_customData.publish_date = ?";
	private static final String _FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_1 = "docs_customData.upload_date IS NULL";
	private static final String _FINDER_COLUMN_FILEIDUPLOAD_UPLOAD_DATE_2 = "docs_customData.upload_date = ?";
	private static final String _FINDER_COLUMN_FILEIDAUTH_AUTHOR_1 = "docs_customData.author IS NULL";
	private static final String _FINDER_COLUMN_FILEIDAUTH_AUTHOR_2 = "docs_customData.author = ?";
	private static final String _FINDER_COLUMN_FILEIDAUTH_AUTHOR_3 = "(docs_customData.author IS NULL OR docs_customData.author = ?)";
	private static final String _FINDER_COLUMN_FILEOBJ_FILEENTRYID_2 = "docs_customData.fileentryid = ?";
	private static final String _FINDER_COLUMN_FILECATEGORY_CATEGORY_1 = "docs_customData.category IS NULL";
	private static final String _FINDER_COLUMN_FILECATEGORY_CATEGORY_2 = "docs_customData.category = ?";
	private static final String _FINDER_COLUMN_FILECATEGORY_CATEGORY_3 = "(docs_customData.category IS NULL OR docs_customData.category = ?)";
	private static final String _FINDER_COLUMN_FILETYPE_TYPE_1 = "docs_customData.type IS NULL";
	private static final String _FINDER_COLUMN_FILETYPE_TYPE_2 = "docs_customData.type = ?";
	private static final String _FINDER_COLUMN_FILETYPE_TYPE_3 = "(docs_customData.type IS NULL OR docs_customData.type = ?)";
	private static final String _FINDER_COLUMN_FILEENTRYID_FILEENTRYID_2 = "docs_customData.fileentryid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "docs_customData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No docs_customData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No docs_customData exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(docs_customDataPersistenceImpl.class);
	private static docs_customData _nulldocs_customData = new docs_customDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<docs_customData> toCacheModel() {
				return _nulldocs_customDataCacheModel;
			}
		};

	private static CacheModel<docs_customData> _nulldocs_customDataCacheModel = new CacheModel<docs_customData>() {
			public docs_customData toEntityModel() {
				return _nulldocs_customData;
			}
		};
}