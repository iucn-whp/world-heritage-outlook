package com.iucn.whp.dbservice.service.persistence;

import java.util.List;

import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.impl.site_assessmentImpl;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class site_assessmentFinderImpl extends BasePersistenceImpl<site_assessment> implements site_assessmentFinder {

	public List<site_assessment> findSite_assessmentByCustomQuery(String query, int begin, int end) throws SystemException {
        /// This stuff is basic set up
        Session session = null;
        try {
            session = openSession();
            // Here ends the basic set up; 
            SQLQuery q = session.createSQLQuery(query);
            q.setCacheable(false);
            q.addEntity("whp_site_assessment", site_assessmentImpl.class);
            return (List<site_assessment>) QueryUtil.list(q, getDialect(), begin, end);
        } catch (Exception e) {
            throw new SystemException(e);
        } finally {
              closeSession(session);
        }
    }

}
