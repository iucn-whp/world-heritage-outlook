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

import com.iucn.whp.dbservice.NoSuch_contactException;
import com.iucn.whp.dbservice.model.impl.whp_contactImpl;
import com.iucn.whp.dbservice.model.impl.whp_contactModelImpl;
import com.iucn.whp.dbservice.model.whp_contact;

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
 * The persistence implementation for the whp_contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author alok.sen
 * @see whp_contactPersistence
 * @see whp_contactUtil
 * @generated
 */
public class whp_contactPersistenceImpl extends BasePersistenceImpl<whp_contact>
	implements whp_contactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link whp_contactUtil} to access the whp_contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = whp_contactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_CATEGORY = new FinderPath(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactModelImpl.FINDER_CACHE_ENABLED, whp_contactImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBycategory",
			new String[] { Integer.class.getName() },
			whp_contactModelImpl.CATEGORYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORY = new FinderPath(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycategory",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactModelImpl.FINDER_CACHE_ENABLED, whp_contactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactModelImpl.FINDER_CACHE_ENABLED, whp_contactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the whp_contact in the entity cache if it is enabled.
	 *
	 * @param whp_contact the whp_contact
	 */
	public void cacheResult(whp_contact whp_contact) {
		EntityCacheUtil.putResult(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactImpl.class, whp_contact.getPrimaryKey(), whp_contact);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORY,
			new Object[] { Integer.valueOf(whp_contact.getCategoryid()) },
			whp_contact);

		whp_contact.resetOriginalValues();
	}

	/**
	 * Caches the whp_contacts in the entity cache if it is enabled.
	 *
	 * @param whp_contacts the whp_contacts
	 */
	public void cacheResult(List<whp_contact> whp_contacts) {
		for (whp_contact whp_contact : whp_contacts) {
			if (EntityCacheUtil.getResult(
						whp_contactModelImpl.ENTITY_CACHE_ENABLED,
						whp_contactImpl.class, whp_contact.getPrimaryKey()) == null) {
				cacheResult(whp_contact);
			}
			else {
				whp_contact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all whp_contacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(whp_contactImpl.class.getName());
		}

		EntityCacheUtil.clearCache(whp_contactImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the whp_contact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(whp_contact whp_contact) {
		EntityCacheUtil.removeResult(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactImpl.class, whp_contact.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(whp_contact);
	}

	@Override
	public void clearCache(List<whp_contact> whp_contacts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (whp_contact whp_contact : whp_contacts) {
			EntityCacheUtil.removeResult(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
				whp_contactImpl.class, whp_contact.getPrimaryKey());

			clearUniqueFindersCache(whp_contact);
		}
	}

	protected void clearUniqueFindersCache(whp_contact whp_contact) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORY,
			new Object[] { Integer.valueOf(whp_contact.getCategoryid()) });
	}

	/**
	 * Creates a new whp_contact with the primary key. Does not add the whp_contact to the database.
	 *
	 * @param contact_id the primary key for the new whp_contact
	 * @return the new whp_contact
	 */
	public whp_contact create(int contact_id) {
		whp_contact whp_contact = new whp_contactImpl();

		whp_contact.setNew(true);
		whp_contact.setPrimaryKey(contact_id);

		return whp_contact;
	}

	/**
	 * Removes the whp_contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contact_id the primary key of the whp_contact
	 * @return the whp_contact that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact remove(int contact_id)
		throws NoSuch_contactException, SystemException {
		return remove(Integer.valueOf(contact_id));
	}

	/**
	 * Removes the whp_contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the whp_contact
	 * @return the whp_contact that was removed
	 * @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_contact remove(Serializable primaryKey)
		throws NoSuch_contactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			whp_contact whp_contact = (whp_contact)session.get(whp_contactImpl.class,
					primaryKey);

			if (whp_contact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_contactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(whp_contact);
		}
		catch (NoSuch_contactException nsee) {
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
	protected whp_contact removeImpl(whp_contact whp_contact)
		throws SystemException {
		whp_contact = toUnwrappedModel(whp_contact);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, whp_contact);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(whp_contact);

		return whp_contact;
	}

	@Override
	public whp_contact updateImpl(
		com.iucn.whp.dbservice.model.whp_contact whp_contact, boolean merge)
		throws SystemException {
		whp_contact = toUnwrappedModel(whp_contact);

		boolean isNew = whp_contact.isNew();

		whp_contactModelImpl whp_contactModelImpl = (whp_contactModelImpl)whp_contact;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, whp_contact, merge);

			whp_contact.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !whp_contactModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
			whp_contactImpl.class, whp_contact.getPrimaryKey(), whp_contact);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORY,
				new Object[] { Integer.valueOf(whp_contact.getCategoryid()) },
				whp_contact);
		}
		else {
			if ((whp_contactModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CATEGORY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(whp_contactModelImpl.getOriginalCategoryid())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORY, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORY,
					new Object[] { Integer.valueOf(whp_contact.getCategoryid()) },
					whp_contact);
			}
		}

		return whp_contact;
	}

	protected whp_contact toUnwrappedModel(whp_contact whp_contact) {
		if (whp_contact instanceof whp_contactImpl) {
			return whp_contact;
		}

		whp_contactImpl whp_contactImpl = new whp_contactImpl();

		whp_contactImpl.setNew(whp_contact.isNew());
		whp_contactImpl.setPrimaryKey(whp_contact.getPrimaryKey());

		whp_contactImpl.setContact_id(whp_contact.getContact_id());
		whp_contactImpl.setPrefix(whp_contact.getPrefix());
		whp_contactImpl.setLast_name(whp_contact.getLast_name());
		whp_contactImpl.setFirst_name(whp_contact.getFirst_name());
		whp_contactImpl.setEmail(whp_contact.getEmail());
		whp_contactImpl.setPosition(whp_contact.getPosition());
		whp_contactImpl.setOrganization(whp_contact.getOrganization());
		whp_contactImpl.setAddress(whp_contact.getAddress());
		whp_contactImpl.setTelephone(whp_contact.getTelephone());
		whp_contactImpl.setLast_updated(whp_contact.getLast_updated());
		whp_contactImpl.setCategoryid(whp_contact.getCategoryid());

		return whp_contactImpl;
	}

	/**
	 * Returns the whp_contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_contact
	 * @return the whp_contact
	 * @throws com.liferay.portal.NoSuchModelException if a whp_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_contact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the whp_contact with the primary key or throws a {@link com.iucn.whp.dbservice.NoSuch_contactException} if it could not be found.
	 *
	 * @param contact_id the primary key of the whp_contact
	 * @return the whp_contact
	 * @throws com.iucn.whp.dbservice.NoSuch_contactException if a whp_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact findByPrimaryKey(int contact_id)
		throws NoSuch_contactException, SystemException {
		whp_contact whp_contact = fetchByPrimaryKey(contact_id);

		if (whp_contact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + contact_id);
			}

			throw new NoSuch_contactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				contact_id);
		}

		return whp_contact;
	}

	/**
	 * Returns the whp_contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the whp_contact
	 * @return the whp_contact, or <code>null</code> if a whp_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public whp_contact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the whp_contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contact_id the primary key of the whp_contact
	 * @return the whp_contact, or <code>null</code> if a whp_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact fetchByPrimaryKey(int contact_id)
		throws SystemException {
		whp_contact whp_contact = (whp_contact)EntityCacheUtil.getResult(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
				whp_contactImpl.class, contact_id);

		if (whp_contact == _nullwhp_contact) {
			return null;
		}

		if (whp_contact == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				whp_contact = (whp_contact)session.get(whp_contactImpl.class,
						Integer.valueOf(contact_id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (whp_contact != null) {
					cacheResult(whp_contact);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(whp_contactModelImpl.ENTITY_CACHE_ENABLED,
						whp_contactImpl.class, contact_id, _nullwhp_contact);
				}

				closeSession(session);
			}
		}

		return whp_contact;
	}

	/**
	 * Returns the whp_contact where categoryid = &#63; or throws a {@link com.iucn.whp.dbservice.NoSuch_contactException} if it could not be found.
	 *
	 * @param categoryid the categoryid
	 * @return the matching whp_contact
	 * @throws com.iucn.whp.dbservice.NoSuch_contactException if a matching whp_contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact findBycategory(int categoryid)
		throws NoSuch_contactException, SystemException {
		whp_contact whp_contact = fetchBycategory(categoryid);

		if (whp_contact == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("categoryid=");
			msg.append(categoryid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuch_contactException(msg.toString());
		}

		return whp_contact;
	}

	/**
	 * Returns the whp_contact where categoryid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param categoryid the categoryid
	 * @return the matching whp_contact, or <code>null</code> if a matching whp_contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact fetchBycategory(int categoryid)
		throws SystemException {
		return fetchBycategory(categoryid, true);
	}

	/**
	 * Returns the whp_contact where categoryid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param categoryid the categoryid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching whp_contact, or <code>null</code> if a matching whp_contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact fetchBycategory(int categoryid, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { categoryid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CATEGORY,
					finderArgs, this);
		}

		if (result instanceof whp_contact) {
			whp_contact whp_contact = (whp_contact)result;

			if ((categoryid != whp_contact.getCategoryid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_WHP_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryid);

				List<whp_contact> list = q.list();

				result = list;

				whp_contact whp_contact = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORY,
						finderArgs, list);
				}
				else {
					whp_contact = list.get(0);

					cacheResult(whp_contact);

					if ((whp_contact.getCategoryid() != categoryid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORY,
							finderArgs, whp_contact);
					}
				}

				return whp_contact;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORY,
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
				return (whp_contact)result;
			}
		}
	}

	/**
	 * Returns all the whp_contacts.
	 *
	 * @return the whp_contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_contact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the whp_contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_contacts
	 * @param end the upper bound of the range of whp_contacts (not inclusive)
	 * @return the range of whp_contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_contact> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the whp_contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of whp_contacts
	 * @param end the upper bound of the range of whp_contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of whp_contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<whp_contact> findAll(int start, int end,
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

		List<whp_contact> list = (List<whp_contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WHP_CONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WHP_CONTACT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<whp_contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<whp_contact>)QueryUtil.list(q, getDialect(),
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
	 * Removes the whp_contact where categoryid = &#63; from the database.
	 *
	 * @param categoryid the categoryid
	 * @return the whp_contact that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public whp_contact removeBycategory(int categoryid)
		throws NoSuch_contactException, SystemException {
		whp_contact whp_contact = findBycategory(categoryid);

		return remove(whp_contact);
	}

	/**
	 * Removes all the whp_contacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (whp_contact whp_contact : findAll()) {
			remove(whp_contact);
		}
	}

	/**
	 * Returns the number of whp_contacts where categoryid = &#63;.
	 *
	 * @param categoryid the categoryid
	 * @return the number of matching whp_contacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countBycategory(int categoryid) throws SystemException {
		Object[] finderArgs = new Object[] { categoryid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CATEGORY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WHP_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of whp_contacts.
	 *
	 * @return the number of whp_contacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WHP_CONTACT);

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
	 * Initializes the whp_contact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.iucn.whp.dbservice.model.whp_contact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<whp_contact>> listenersList = new ArrayList<ModelListener<whp_contact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<whp_contact>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(whp_contactImpl.class.getName());
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
	private static final String _SQL_SELECT_WHP_CONTACT = "SELECT whp_contact FROM whp_contact whp_contact";
	private static final String _SQL_SELECT_WHP_CONTACT_WHERE = "SELECT whp_contact FROM whp_contact whp_contact WHERE ";
	private static final String _SQL_COUNT_WHP_CONTACT = "SELECT COUNT(whp_contact) FROM whp_contact whp_contact";
	private static final String _SQL_COUNT_WHP_CONTACT_WHERE = "SELECT COUNT(whp_contact) FROM whp_contact whp_contact WHERE ";
	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_2 = "whp_contact.categoryid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "whp_contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No whp_contact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No whp_contact exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(whp_contactPersistenceImpl.class);
	private static whp_contact _nullwhp_contact = new whp_contactImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<whp_contact> toCacheModel() {
				return _nullwhp_contactCacheModel;
			}
		};

	private static CacheModel<whp_contact> _nullwhp_contactCacheModel = new CacheModel<whp_contact>() {
			public whp_contact toEntityModel() {
				return _nullwhp_contact;
			}
		};
}