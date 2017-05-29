package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.whp_sites;

public class SiteAssessmentDTO implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1325944058830919265L;
	
	private site_assessment site_Assessment;
	public site_assessment getSite_Assessment() {
		return site_Assessment;
	}
	public void setSite_Assessment(site_assessment site_Assessment) {
		this.site_Assessment = site_Assessment;
	}
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
	public String getCurrent_Status() {
		return current_Status;
	}
	public void setCurrent_Status(String current_Status) {
		this.current_Status = current_Status;
	}
	public String getCurrentVersion() {
		return currentVersion;
	}
	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
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
	public long getCurrentVersionId() {
		return currentVersionId;
	}
	public void setCurrentVersionId(long currentVersionId) {
		this.currentVersionId = currentVersionId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	private site_assessment_versions site_AssessmentVersions;
	
	private String current_Stage;
	private String current_Status;
	private String currentVersion;
	private String languages;
	private String currentUser;
	private long currentVersionId;
	private long assessmentId;
	public long getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(long assessmentId) {
		this.assessmentId = assessmentId;
	}
	private String siteName;
	/*@Override
	public int compareTo(SiteAssessmentDTO arg0) {
		// TODO Auto-generated method stub
		return 0;
	}*/

}
