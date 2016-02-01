package com.iucn.whp.dto;

public class AssessmentValueCssClass {
	
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

}