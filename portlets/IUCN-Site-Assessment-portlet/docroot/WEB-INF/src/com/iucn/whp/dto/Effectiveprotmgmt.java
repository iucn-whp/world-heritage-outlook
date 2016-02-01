package com.iucn.whp.dto;

import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkp;

public class Effectiveprotmgmt {

	
	private effective_prot_mgmt_iothreats   effectiveprot;
	
	
	private protection_management_ratings_lkp  protectionmanage;


	public void setEffectiveprot(effective_prot_mgmt_iothreats effectiveprot) {
		this.effectiveprot = effectiveprot;
	}


	public effective_prot_mgmt_iothreats getEffectiveprot() {
		return effectiveprot;
	}


	public void setProtectionmanage(protection_management_ratings_lkp protectionmanage) {
		this.protectionmanage = protectionmanage;
	}


	public protection_management_ratings_lkp getProtectionmanage() {
		return protectionmanage;
	}
	
}
