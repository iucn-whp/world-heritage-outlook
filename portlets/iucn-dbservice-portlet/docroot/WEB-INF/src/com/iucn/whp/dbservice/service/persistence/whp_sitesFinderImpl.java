package com.iucn.whp.dbservice.service.persistence;

import java.util.ArrayList;
import java.util.List;

import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.impl.whp_sitesImpl;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class whp_sitesFinderImpl extends BasePersistenceImpl<whp_sites> implements whp_sitesFinder{

	public List<whp_sites> findByFilterSearch(String title, String content, String author, int begin, int end) throws SystemException {
        /// This stuff is basic set up
        Session session = null;
        try {
            session = openSession();
            // Here ends the basic set up; 

            //now we build the query. Note that we use the name of the tables from the database!
            String base = "SELECT {whp_whp_sites.*} FROM whp_whp_sites ";
                   //+ "JOIN ExampleBlog_Author " +
                    //"ON ExampleBlog_Post.authorId = ExampleBlog_Author.authorId ";
            StringBuffer sqlBuilder = new StringBuffer(base);
            List<String> criteria = new ArrayList<String>();
           // if (Validator.isNotNull(title)) {
                criteria.add("whp_whp_sites.serial =?");
            //}
           /* if (Validator.isNotNull(content)) {
                criteria.add("whp_whp_sites like ?");
            }
            if (Validator.isNotNull(author)) {
                criteria.add("whp_whp_sites like ?");
            }*/
            if (!criteria.isEmpty()) {
                sqlBuilder.append("WHERE ");
                sqlBuilder.append(criteria.remove(0) + " ");
                for (String criterion : criteria) {
                    sqlBuilder.append(" AND "+criterion);
                }
            }
            /* If all the parameters was given, the "sql" variable content should be something like
                 SELECT {ExampleBlog_Post.*} FROM ExampleBlog_Post
                  JOIN ExampleBlog_Author
                   ON ExampleBlog_Post.authorId = ExampleBlog_Author.authorId
                 WHERE ExampleBlog_Post.title like ?
                      AND ExampleBlog_Post.content like ?
                      AND ExampleBlog_Author.name like ?//
             */
             String sql = sqlBuilder.toString();
            // Now that we have built the query, we can do all the usual stuff.
            SQLQuery q = session.createSQLQuery(sql);
            q.setCacheable(false);
            q.addEntity("whp_whp_sites", whp_sitesImpl.class);

            QueryPos qPos = QueryPos.getInstance(q);
            // Setting the positions
            //if (Validator.isNotNull(title)) {
                qPos.add(false);
            //}
           /* if (Validator.isNotNull(content)) {
                qPos.add("%"+content+"%");
            }
            if (Validator.isNotNull(author)) {
                qPos.add("%"+author+"%");
            }*/

            //execute the query and return a list from the db
            return (List<whp_sites>) QueryUtil.list(q, getDialect(), begin, end);
        } catch (Exception e) {
            throw new SystemException(e);
        } finally {
            //must have this to close the hibernate session..
            // if you fail to do this.. you will have a lot of open sessions… 
            closeSession(session);
        }
    }
	
	
	public List<whp_sites> findByCustomQuery(String query, int begin, int end) throws SystemException {
        /// This stuff is basic set up
        Session session = null;
        try {
            session = openSession();
            // Here ends the basic set up; 
            SQLQuery q = session.createSQLQuery(query);
            q.setCacheable(false);
            q.addEntity("whp_whp_sites", whp_sitesImpl.class);

            //execute the query and return a list from the db
            return (List<whp_sites>) QueryUtil.list(q, getDialect(), begin, end);
        } catch (Exception e) {
            throw new SystemException(e);
        } finally {
            //must have this to close the hibernate session..
            // if you fail to do this.. you will have a lot of open sessions… 
            closeSession(session);
        }
    }

}
