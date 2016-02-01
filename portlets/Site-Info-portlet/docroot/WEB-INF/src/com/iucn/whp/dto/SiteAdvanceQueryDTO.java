package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.whp_sites;

public class SiteAdvanceQueryDTO implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1325944058830919265L;
	
	private whp_sites whp_site;
	
	
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}
	
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	
	private String languages;
	private String currentUser;
	private long siteId;
	
	public void setWhp_site(whp_sites whp_site) {
		this.whp_site = whp_site;
	}
	public whp_sites getWhp_site() {
		return whp_site;
	}
	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}
	public long getSiteId() {
		return siteId;
	}
	private String siteName;

}
