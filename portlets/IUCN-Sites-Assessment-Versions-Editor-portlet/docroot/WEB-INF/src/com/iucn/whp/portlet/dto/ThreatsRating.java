package com.iucn.whp.portlet.dto;

public class ThreatsRating {

	private String threatRatingName;
	private Long rating;
	private String cssClass;

	public void setCssClass(long rating) {
		if(rating==1)
			 this.cssClass = "verylowThreatcell";
		 else if(rating==2)
			 this.cssClass = "lowthreatcell";
		 else if(rating==3)
			 this.cssClass = "highThreatcell";
		 else if(rating==4)
			 this.cssClass = "veryhighThreatcell";
		 else if(rating==5)
			 this.cssClass = "datadeficientcell";
		 else  this.cssClass = "";
	}

	public String getCssClass() {
		return cssClass;
	}

	public String getThreatRatingName() {
		return threatRatingName;
	}

	public void setThreatRatingName(String threatRatingName) {
		this.threatRatingName = threatRatingName;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}
}