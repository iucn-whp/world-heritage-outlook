package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.contact_category;
import com.iucn.whp.dbservice.model.whp_contact;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_contacts;

public class WhpSite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private whp_contact whpContact;
	private contact_category contactCategory;
	private whp_sites_contacts whpSiteContacts;
	public whp_contact getWhpContact() {
		return whpContact;
	}
	public void setWhpContact(whp_contact whpContact) {
		this.whpContact = whpContact;
	}
	public contact_category getContactCategory() {
		return contactCategory;
	}
	public void setContactCategory(contact_category contactCategory) {
		this.contactCategory = contactCategory;
	}
	public void setWhpSiteContacts(whp_sites_contacts whpSiteContacts) {
		this.whpSiteContacts = whpSiteContacts;
	}
	public whp_sites_contacts getWhpSiteContacts() {
		return whpSiteContacts;
	}

	
	
}