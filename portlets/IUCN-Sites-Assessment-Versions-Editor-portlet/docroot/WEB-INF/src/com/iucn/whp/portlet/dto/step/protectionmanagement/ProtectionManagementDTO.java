package com.iucn.whp.portlet.dto.step.protectionmanagement;

import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;
import com.iucn.whp.dbservice.model.prot_mgmt_best_practices;
import com.iucn.whp.dbservice.model.prot_mgmt_overall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lugovskoy Andrey on 30.08.16.
 * if you need more function you can add it here.
 */
public class ProtectionManagementDTO {

    private List<ProtectionManagementDTOImpl> protectionManagementDTOs;

    private prot_mgmt_best_practices protMgmtBestPractices;

    private effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats;

    private prot_mgmt_overall prot_mgmt_overall;

    public com.iucn.whp.dbservice.model.prot_mgmt_overall getProt_mgmt_overall() {
        return prot_mgmt_overall;
    }

    public void setProt_mgmt_overall(com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall) {
        this.prot_mgmt_overall = prot_mgmt_overall;
    }

    public com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats getEffective_prot_mgmt_iothreats() {
        return effective_prot_mgmt_iothreats;
    }

    public void setEffective_prot_mgmt_iothreats(com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
        this.effective_prot_mgmt_iothreats = effective_prot_mgmt_iothreats;
    }

    public prot_mgmt_best_practices getProtMgmtBestPractices() {
        return protMgmtBestPractices;
    }

    public void setProtMgmtBestPractices(prot_mgmt_best_practices protMgmtBestPractices) {
        this.protMgmtBestPractices = protMgmtBestPractices;
    }

    public ProtectionManagementDTO() {
        this.protectionManagementDTOs = new ArrayList<>();
    }

    public boolean add(ProtectionManagementDTOImpl protectionManagementDTO){
        return this.protectionManagementDTOs.add(protectionManagementDTO);
    }

    public List<ProtectionManagementDTOImpl> getProtectionManagementDTOs() {
        return protectionManagementDTOs;
    }

    public void setProtectionManagementDTOs(List<ProtectionManagementDTOImpl> protectionManagementDTOs) {
        this.protectionManagementDTOs = protectionManagementDTOs;
    }
}
