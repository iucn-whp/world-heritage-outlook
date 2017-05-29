package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.danger_list_status_lkp;
import com.iucn.whp.dbservice.model.whp_site_danger_list;

public class WhpSiteDangerType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private whp_site_danger_list dangerList;
	private danger_list_status_lkp dangerStatus;
	public whp_site_danger_list getDangerList() {
		return dangerList;
	}
	public void setDangerList(whp_site_danger_list dangerList) {
		this.dangerList = dangerList;
	}
	public danger_list_status_lkp getDangerStatus() {
		return dangerStatus;
	}
	public void setDangerStatus(danger_list_status_lkp dangerStatus) {
		this.dangerStatus = dangerStatus;
	}
	
}
