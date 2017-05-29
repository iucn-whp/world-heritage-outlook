package com.iucn.whp.portlet.dto.step.protectionmanagement;

import com.iucn.whp.dbservice.model.protection_management;
import com.iucn.whp.dbservice.model.protection_management_ratings_lkpModel;
import com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp;
import com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkpModel;

/**
 * Created by Lugovskoy Andrey on 31.08.16.
 */
public class ProtectionManagementDTOImpl {

    private protection_management protection_management;

    private protection_management_ratings_lkpModel protection_management_ratings_lkpModel;

    private protection_mgmt_checklist_lkp mgmt_checklist_lkp;

    public protection_mgmt_checklist_lkp getMgmt_checklist_lkp() {
        return mgmt_checklist_lkp;
    }

    public void setMgmt_checklist_lkp(protection_mgmt_checklist_lkp mgmt_checklist_lkp) {
        this.mgmt_checklist_lkp = mgmt_checklist_lkp;
    }

    public com.iucn.whp.dbservice.model.protection_management getProtection_management() {
        return protection_management;
    }

    public void setProtection_management(com.iucn.whp.dbservice.model.protection_management protection_management) {
        this.protection_management = protection_management;
    }
    public com.iucn.whp.dbservice.model.protection_management_ratings_lkpModel getProtection_management_ratings_lkpModel() {
        return protection_management_ratings_lkpModel;
    }

    public void setProtection_management_ratings_lkpModel(com.iucn.whp.dbservice.model.protection_management_ratings_lkpModel protection_management_ratings_lkpModel) {
        this.protection_management_ratings_lkpModel = protection_management_ratings_lkpModel;
    }
}
