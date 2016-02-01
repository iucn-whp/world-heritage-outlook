package com.iucn.whp.dbservice.service.persistence;

import java.util.List;

import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.impl.site_assessment_versionsImpl;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class site_assessment_versionsFinderImpl extends BasePersistenceImpl<site_assessment_versions> implements site_assessment_versionsFinder {
	
	public List<site_assessment_versions> findSite_assessment_versionsByCustomQuery(
			String query, int begin, int end) throws SystemException {
		// / This stuff is basic set up
		Session session = null;
		session = openSession();
		// Here ends the basic set up;
		SQLQuery q = session.createSQLQuery(query);
		q.setCacheable(false);
		q.addEntity("whp_site_assessment_versions",
				site_assessment_versionsImpl.class);
		return (List<site_assessment_versions>) QueryUtil.list(q, getDialect(),
				begin, end);
	}

}
