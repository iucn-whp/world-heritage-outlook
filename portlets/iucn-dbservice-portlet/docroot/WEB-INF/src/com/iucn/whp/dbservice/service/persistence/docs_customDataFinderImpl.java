package com.iucn.whp.dbservice.service.persistence;

import java.util.List;

import com.iucn.whp.dbservice.model.docs_customData;
import com.iucn.whp.dbservice.model.impl.docs_customDataImpl;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class docs_customDataFinderImpl extends BasePersistenceImpl<docs_customData> implements docs_customDataFinder{
	
	public List<docs_customData> findByCustomQuery(String query, int begin, int end) throws SystemException {
        /// This stuff is basic set up
        Session session = null;
        try {
            session = openSession();
            // Here ends the basic set up; 
            SQLQuery q = session.createSQLQuery(query);
            q.setCacheable(false);
            q.addEntity("docs_customData", docs_customDataImpl.class);

            //execute the query and return a list from the db
            return (List<docs_customData>) QueryUtil.list(q, getDialect(), begin, end);
        } catch (Exception e) {
            throw new SystemException(e);
        } finally {
            //must have this to close the hibernate session..
            // if you fail to do this.. you will have a lot of open sessions… 
            closeSession(session);
        }
    }


}
