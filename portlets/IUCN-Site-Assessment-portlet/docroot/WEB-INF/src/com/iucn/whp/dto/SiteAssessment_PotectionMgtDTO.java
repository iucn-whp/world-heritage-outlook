package com.iucn.whp.dto;

import java.io.Serializable;


import com.iucn.whp.dbservice.model.protection_management;

public class SiteAssessment_PotectionMgtDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String protection_mgmt_checklist;
	
	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}

	private String strprotection_management_ratings;
	
	private long topicId;
	
	private protection_management protection_management;

	public String getProtection_mgmt_checklist() {
		return protection_mgmt_checklist;
	}

	public void setProtection_mgmt_checklist(String protection_mgmt_checklist) {
		this.protection_mgmt_checklist = protection_mgmt_checklist;
	}

	public String getStrprotection_management_ratings() {
		return strprotection_management_ratings;
	}

	public void setStrprotection_management_ratings(
			String strprotection_management_ratings) {
		this.strprotection_management_ratings = strprotection_management_ratings;
	}

	public protection_management getProtection_management() {
		return protection_management;
	}

	public void setProtection_management(protection_management protection_management) {
		this.protection_management = protection_management;
	}

}
