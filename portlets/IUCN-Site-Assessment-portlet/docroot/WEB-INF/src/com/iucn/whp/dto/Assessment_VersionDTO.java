package com.iucn.whp.dto;

import java.io.Serializable;
import java.util.Date;

import com.iucn.whp.dbservice.model.site_assessment_versions;

public class Assessment_VersionDTO implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1325944058830919265L;
	
	/*private site_assessment site_Assessment;
	public site_assessment getSite_Assessment() {
		return site_Assessment;
	}
	public void setSite_Assessment(site_assessment site_Assessment) {
		this.site_Assessment = site_Assessment;
	}*/
	public site_assessment_versions getSite_AssessmentVersions() {
		return site_AssessmentVersions;
	}
	public void setSite_AssessmentVersions(
			site_assessment_versions site_AssessmentVersions) {
		this.site_AssessmentVersions = site_AssessmentVersions;
	}
	public String getCurrent_Stage() {
		return current_Stage;
	}
	public void setCurrent_Stage(String current_Stage) {
		this.current_Stage = current_Stage;
	}
	
	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String currentVersion) {
		this.versionCode = currentVersion;
	}
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
	
	private site_assessment_versions site_AssessmentVersions;
	
	private String current_Stage;
	private String versionCode;
	private String languages;
	private String currentUser;
	private Date startDate;
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	private Date endDate;
	private long versionId;
	public long getVersionId() {
		return versionId;
	}
	public void setVersionId(long versionId) {
		this.versionId = versionId;
	}

	private long assessmentId;
	public long getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(long assessmentId) {
		this.assessmentId = assessmentId;
	}
	

}
