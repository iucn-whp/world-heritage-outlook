package com.iucn.whp.portlet.dto.step.conservation;

import com.iucn.whp.portlet.dto.ThreatsRating;

public class SummaryOfAssessmentsDTO {

	// Current State Trend of World Heritage values
	private Long currentStateTrendWhId;
	private String currentStateTrendWhJustification;
	private ThreatsRating currentStateTrendWhRating;

	// Current state and trend of other important biodiversity values (if applicable)
	private Long currentStateTrendBioId;
	private String currentStateTrendBioJustification;
	private ThreatsRating currentStateTrendBioRating;

	// Current threats
	private Long currentThreatsId;
	private String currentThreatsJustification;
	private ThreatsRating currentThreatsRating;

	// Potential threats
	private Long potentialThreatsId;
	private String potentialThreatsJustification;
	private ThreatsRating potentialThreatsRating;

	// Overall threats
	private Long overallThreatsId;
	private String overallThreatsJustification;
	private ThreatsRating overallThreatsRating;

	// Effectiveness of protection and management in addressing threats outside the site
	private Long effectiveProtectionAndManagementId;
	private String effectiveProtectionAndManagementJustification;
	private ThreatsRating effectiveProtectionAndManagementRating;

	// Overall protection and management
	private Long protectionAndManagementId;
	private String protectionAndManagementJustification;
	private ThreatsRating protectionAndManagementRating;

	public Long getCurrentStateTrendWhId() {
		return currentStateTrendWhId;
	}

	public void setCurrentStateTrendWhId(Long currentStateTrendWhId) {
		this.currentStateTrendWhId = currentStateTrendWhId;
	}

	public String getCurrentStateTrendWhJustification() {
		return currentStateTrendWhJustification;
	}

	public void setCurrentStateTrendWhJustification(String currentStateTrendWhJustification) {
		this.currentStateTrendWhJustification = currentStateTrendWhJustification;
	}

	public ThreatsRating getCurrentStateTrendWhRating() {
		return currentStateTrendWhRating;
	}

	public void setCurrentStateTrendWhRating(ThreatsRating currentStateTrendWhRating) {
		this.currentStateTrendWhRating = currentStateTrendWhRating;
	}

	public Long getCurrentStateTrendBioId() {
		return currentStateTrendBioId;
	}

	public void setCurrentStateTrendBioId(Long currentStateTrendBioId) {
		this.currentStateTrendBioId = currentStateTrendBioId;
	}

	public String getCurrentStateTrendBioJustification() {
		return currentStateTrendBioJustification;
	}

	public void setCurrentStateTrendBioJustification(String currentStateTrendBioJustification) {
		this.currentStateTrendBioJustification = currentStateTrendBioJustification;
	}

	public ThreatsRating getCurrentStateTrendBioRating() {
		return currentStateTrendBioRating;
	}

	public void setCurrentStateTrendBioRating(ThreatsRating currentStateTrendBioRating) {
		this.currentStateTrendBioRating = currentStateTrendBioRating;
	}

	public Long getCurrentThreatsId() {
		return currentThreatsId;
	}

	public void setCurrentThreatsId(Long currentThreatsId) {
		this.currentThreatsId = currentThreatsId;
	}

	public String getCurrentThreatsJustification() {
		return currentThreatsJustification;
	}

	public void setCurrentThreatsJustification(String currentThreatsJustification) {
		this.currentThreatsJustification = currentThreatsJustification;
	}

	public ThreatsRating getCurrentThreatsRating() {
		return currentThreatsRating;
	}

	public void setCurrentThreatsRating(ThreatsRating currentThreatsRating) {
		this.currentThreatsRating = currentThreatsRating;
	}

	public Long getPotentialThreatsId() {
		return potentialThreatsId;
	}

	public void setPotentialThreatsId(Long potentialThreatsId) {
		this.potentialThreatsId = potentialThreatsId;
	}

	public String getPotentialThreatsJustification() {
		return potentialThreatsJustification;
	}

	public void setPotentialThreatsJustification(String potentialThreatsJustification) {
		this.potentialThreatsJustification = potentialThreatsJustification;
	}

	public ThreatsRating getPotentialThreatsRating() {
		return potentialThreatsRating;
	}

	public void setPotentialThreatsRating(ThreatsRating potentialThreatsRating) {
		this.potentialThreatsRating = potentialThreatsRating;
	}

	public Long getOverallThreatsId() {
		return overallThreatsId;
	}

	public void setOverallThreatsId(Long overallThreatsId) {
		this.overallThreatsId = overallThreatsId;
	}

	public String getOverallThreatsJustification() {
		return overallThreatsJustification;
	}

	public void setOverallThreatsJustification(String overallThreatsJustification) {
		this.overallThreatsJustification = overallThreatsJustification;
	}

	public ThreatsRating getOverallThreatsRating() {
		return overallThreatsRating;
	}

	public void setOverallThreatsRating(ThreatsRating overallThreatsRating) {
		this.overallThreatsRating = overallThreatsRating;
	}

	public Long getEffectiveProtectionAndManagementId() {
		return effectiveProtectionAndManagementId;
	}

	public void setEffectiveProtectionAndManagementId(Long effectiveProtectionAndManagementId) {
		this.effectiveProtectionAndManagementId = effectiveProtectionAndManagementId;
	}

	public String getEffectiveProtectionAndManagementJustification() {
		return effectiveProtectionAndManagementJustification;
	}

	public void setEffectiveProtectionAndManagementJustification(String effectiveProtectionAndManagementJustification) {
		this.effectiveProtectionAndManagementJustification = effectiveProtectionAndManagementJustification;
	}

	public ThreatsRating getEffectiveProtectionAndManagementRating() {
		return effectiveProtectionAndManagementRating;
	}

	public void setEffectiveProtectionAndManagementRating(ThreatsRating effectiveProtectionAndManagementRating) {
		this.effectiveProtectionAndManagementRating = effectiveProtectionAndManagementRating;
	}

	public Long getProtectionAndManagementId() {
		return protectionAndManagementId;
	}

	public void setProtectionAndManagementId(Long protectionAndManagementId) {
		this.protectionAndManagementId = protectionAndManagementId;
	}

	public String getProtectionAndManagementJustification() {
		return protectionAndManagementJustification;
	}

	public void setProtectionAndManagementJustification(String protectionAndManagementJustification) {
		this.protectionAndManagementJustification = protectionAndManagementJustification;
	}

	public ThreatsRating getProtectionAndManagementRating() {
		return protectionAndManagementRating;
	}

	public void setProtectionAndManagementRating(ThreatsRating protectionAndManagementRating) {
		this.protectionAndManagementRating = protectionAndManagementRating;
	}
}
