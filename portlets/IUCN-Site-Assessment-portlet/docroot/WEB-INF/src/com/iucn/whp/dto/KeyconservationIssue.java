package com.iucn.whp.dto;

import com.iucn.whp.dbservice.model.key_conservation_issues;
import com.iucn.whp.dbservice.model.key_conservation_scale_lkp;

public class KeyconservationIssue {
	
	
	private key_conservation_issues key_conservation;
	
	private key_conservation_scale_lkp key_conserrvation_scale;
	
	private int count;

	public void setKey_conservation(key_conservation_issues key_conservation) {
		this.key_conservation = key_conservation;
	}

	public key_conservation_issues getKey_conservation() {
		return key_conservation;
	}
	

	public void setKey_conserrvation_scale(key_conservation_scale_lkp key_conserrvation_scale) {
		this.key_conserrvation_scale = key_conserrvation_scale;
	}

	public key_conservation_scale_lkp getKey_conserrvation_scale() {
		return key_conserrvation_scale;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}
	
	

}
