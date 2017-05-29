package com.iucn.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.WindowStateException;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.iucn.whp.dbservice.model.active_conservation_projects;
import com.iucn.whp.dbservice.model.assessing_threats_current;
import com.iucn.whp.dbservice.model.assessing_threats_potential;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.assessment_validation;
import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;
import com.iucn.whp.dbservice.model.benefits;
import com.iucn.whp.dbservice.model.benefits_summary;
import com.iucn.whp.dbservice.model.benefits_type_ref;
import com.iucn.whp.dbservice.model.biodiversity_values;
import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.current_state_trend;
import com.iucn.whp.dbservice.model.current_threat_assessment_cat;
import com.iucn.whp.dbservice.model.current_threat_values;
import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;
import com.iucn.whp.dbservice.model.key_conservation_issues;
import com.iucn.whp.dbservice.model.potential_project_needs;
import com.iucn.whp.dbservice.model.potential_threat_assessment_cat;
import com.iucn.whp.dbservice.model.potential_threat_values;
import com.iucn.whp.dbservice.model.prot_mgmt_best_practices;
import com.iucn.whp.dbservice.model.prot_mgmt_overall;
import com.iucn.whp.dbservice.model.protection_management;
import com.iucn.whp.dbservice.model.references;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.state_trend_biodivvals;
import com.iucn.whp.dbservice.model.state_trend_whvalues;
import com.iucn.whp.dbservice.model.threat_summary_current;
import com.iucn.whp.dbservice.model.threat_summary_potential;
import com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_potentialLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_validationLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_whvaluesLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_whvalues_whcriterionLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefitsLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefits_summaryLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefits_type_refLocalServiceUtil;
import com.iucn.whp.dbservice.service.biodiversity_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_state_trendLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_threat_assessment_catLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_threat_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.effective_prot_mgmt_iothreatsLocalServiceUtil;
import com.iucn.whp.dbservice.service.key_conservation_issuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_threat_assessment_catLocalServiceUtil;
import com.iucn.whp.dbservice.service.potential_threat_valuesLocalServiceUtil;
import com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalServiceUtil;
import com.iucn.whp.dbservice.service.prot_mgmt_overallLocalServiceUtil;
import com.iucn.whp.dbservice.service.protection_managementLocalServiceUtil;
import com.iucn.whp.dbservice.service.referencesLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_trend_whvaluesLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_potentialLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.util.ParamUtil;

public class AssessmentDelete {

	public static void deleteasscessmentAction(ActionRequest request,ActionResponse response) throws PortalException, SystemException, WindowStateException {
		
		long assmnt_id = ParamUtil.getLong(request, "assessmentId");
		
		
		
		
		List<site_assessment_versions> lstassessmentverson=site_assessment_versionsLocalServiceUtil.findByAssessmentId(assmnt_id);
		
		List<Long> assessmentid= new ArrayList<Long>();
		
		if(lstassessmentverson!=null)
		{
			for(site_assessment_versions objsite_assessment_versions:lstassessmentverson)
			{
				assessmentid.add(objsite_assessment_versions.getAssessment_version_id());
			}
		}
	
		//delete for Identifying And Describing Values  
		
		
			
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<assessment_whvalues> lstwhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(assessment_id);
		
		List<Long> lstwhvalid= new ArrayList<Long>();
	
		if(lstwhValues!=null){
			
			for(assessment_whvalues objassessment_whvalues:lstwhValues)
			{
				lstwhvalid.add(objassessment_whvalues.getPrimaryKey());
			}
		}
			
		
		

		 for(int in=0;in<lstwhvalid.size();in++){
 	   
			long  id=lstwhvalid.get(in);
			 
 	   List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(id);
 	   List<current_state_trend> lstCurrentStateTrend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessment_id);
 	   if(lstwhvalues_whcriterion!=null && lstwhvalues_whcriterion.size()>0){
    			for(int i=0;i<lstwhvalues_whcriterion.size();i++){
    				long criteria_id =lstwhvalues_whcriterion.get(i).getWh_criteria_id();
    				assessment_whvalues_whcriterionLocalServiceUtil.deleteassessment_whvalues_whcriterion(criteria_id);
    			}
 	   }
 	   if(lstCurrentStateTrend!=null && lstCurrentStateTrend.size()>0){
   			for(int i=0;i<lstCurrentStateTrend.size();i++){
   				long vn =lstCurrentStateTrend.get(i).getPrimaryKey();
   			
   					current_state_trendLocalServiceUtil.deletecurrent_state_trend(vn);
   			
   			}
 	   }
    		assessment_whvaluesLocalServiceUtil.deleteassessment_whvalues(id);
    
		

		
		
	}
	
		 lstwhvalid.clear();
	
		}
		
		}catch(Exception e)
		{
			System.out.print("delete for Identifying And Describing Values ");
			e.printStackTrace();
		}
	        //Other Important Biodiversity Values +Add Values 
		
		
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
	
	     List<biodiversity_values> lstbioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assessment_id);
	
	         List<Long> lstbioid= new ArrayList<Long>();
	         
	         
	         if(lstbioValues!=null)
	         {
	        	 for(biodiversity_values objlstbioValues:lstbioValues)
	        	 {
	        		 lstbioid.add(objlstbioValues.getPrimaryKey());
	        	 }
	         }
	
	          
	         
	         for(int in=0;in<lstbioid.size();in++){
	       	   
	 			long  id=lstbioid.get(in);
	 			
	            biodiversity_valuesLocalServiceUtil.deletebiodiversity_values(id);
	         
	         }
	         
	         lstbioid.clear();
	         
		}
		}catch(Exception e)
		{
			System.out.print("delete Other Important Biodiversity Values  ");
			e.printStackTrace();
		} 
	         
	         //delete current threat 
		
		
		try{
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
	         
	         List<assessing_threats_current> lstthreats_current=site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(assessment_id);
	         
	         List<Long> lstcthretid= new ArrayList<Long>();
	         
	         if(lstthreats_current!=null)
	         {
	        	 for(assessing_threats_current objassessing_threats_current:lstthreats_current)
	        	 {
	        		 lstcthretid.add(objassessing_threats_current.getPrimaryKey());
	        	 }
	         }
	         
	      for(int in=0;in<lstcthretid.size();in++){
		       	   
		 		long  id=lstcthretid.get(in);
		 			{
	         
        	 assessing_threats_currentLocalServiceUtil.deleteassessing_threats_current(id);
        	 List<current_threat_assessment_cat> lstThreatCat = site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(id);
        	 List<current_threat_values> lstThreatVal = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(id);
        	 for(current_threat_assessment_cat threatCat:lstThreatCat){
        		 current_threat_assessment_catLocalServiceUtil.deletecurrent_threat_assessment_cat(threatCat);
        	 }
        	 for(current_threat_values threatVal:lstThreatVal){
        		 current_threat_valuesLocalServiceUtil.deletecurrent_threat_values(threatVal);
        	 }
          
	         
		}
	   	
	}
	      
	      lstcthretid.clear();
		}  
		}catch(Exception e)
		{
			System.out.print("delete for current threat");
			e.printStackTrace();
		} 
	      
	      
	      // delete potential threat
	      
		
		
		try{
			
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
	      
	      List<assessing_threats_potential> stthreats_potential = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(assessment_id);

	      
	      List<Long> lstpthretid= new ArrayList<Long>();
	         
	         if(stthreats_potential!=null)
	         {
	        	 for(assessing_threats_potential objassessing_threats_potential:stthreats_potential)
	        	 {
	        		 lstpthretid.add(objassessing_threats_potential.getPrimaryKey());
	        	 }
	         }
	      
	      
	         for(int in=0;in<lstpthretid.size();in++){
		       	   
			 		long  id=lstpthretid.get(in);
			 			
	      
	      
	      
	      
	      assessing_threats_potentialLocalServiceUtil.deleteassessing_threats_potential(id);
       	 List<potential_threat_assessment_cat> lstThreatCat = site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(id);
       	 List<potential_threat_values> lstThreatVal = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(id);
       	 for(potential_threat_assessment_cat threatCat:lstThreatCat){
       		potential_threat_assessment_catLocalServiceUtil.deletepotential_threat_assessment_cat(threatCat);
       	 }
       	 for(potential_threat_values threatVal:lstThreatVal){
       		potential_threat_valuesLocalServiceUtil.deletepotential_threat_values(threatVal);
       	 }
       }
	         lstpthretid.clear();
	         
		} 
		
		}catch(Exception e)
		{
			System.out.print("delete for potential threat  ");
			e.printStackTrace();
		} 
		
	
	      
	      //Summary of value current state and trend of World Heritage values  step 4
		
		
		try
		{
			
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<state_trend_whvalues> 	lststate_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(assessment_id);
	     
		
		 List<Long> lsttrendWH= new ArrayList<Long>();
		
		  if(lststate_trendWH!=null)
		  {
			  
			  for(state_trend_whvalues objstate_trend_whvalues:lststate_trendWH)
			  {
				  lsttrendWH.add(objstate_trend_whvalues.getPrimaryKey());
			  }
		  }
		 
		
		  for(int in=0;in<lsttrendWH.size();in++){
	       	   
		 		long  id=lsttrendWH.get(in);
		 		
		 		state_trend_whvaluesLocalServiceUtil.deletestate_trend_whvalues(id);
		 		
		  }
		  
		  lsttrendWH.clear();
		
		}
	      
	     
		}catch(Exception e)
		{
			System.out.print(" delete Summary of value current state and trend of World Heritage values  step 4  ");
			e.printStackTrace();
		} 
		
		// Summary of current state and trend of other important biodiversity values   step 4
	      
		
		try
		{
	    
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
			
		List<state_trend_biodivvals> lstBiodivvals = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(assessment_id);
		
		 List<Long> lsttrendbioval= new ArrayList<Long>();
			
		  if(lstBiodivvals!=null)
		  {
			  
			  for(state_trend_biodivvals objstate_trend_biodivvals:lstBiodivvals)
			  {
				  lsttrendbioval.add(objstate_trend_biodivvals.getPrimaryKey());
			  }
		  }
		  
		  for(int in=0;in<lsttrendbioval.size();in++){
	       	   
		 		long  id=lsttrendbioval.get(in);
		 		
		 		state_trend_biodivvalsLocalServiceUtil.deletestate_trend_biodivvals(id);
		 		
		  }
		
		  
		  lsttrendbioval.clear();
		  
		  
		}
	      
		
		}catch(Exception e)
		{
			System.out.print(" delete Summary of current state and trend of other important biodiversity values   step 4 ");
			e.printStackTrace();
		} 
		
		
		// Delete threat summary current 
		
		
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<threat_summary_current>lstthreats_current = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(assessment_id);
		
		List<Long> lstthreatcurrent= new ArrayList<Long>();
		
		if(lstthreats_current!=null)
		{
			for(threat_summary_current objthreat_summary_current:lstthreats_current)
			{
				lstthreatcurrent.add(objthreat_summary_current.getPrimaryKey());
			}
		}
		
		for(int in=0;in<lstthreatcurrent.size();in++){
	       	   
	 		long  id=lstthreatcurrent.get(in);
	 		
	 		threat_summary_currentLocalServiceUtil.deletethreat_summary_current(id);
		}
		
		
		lstthreatcurrent.clear();
		
		}
		
		}catch(Exception e)
		{
			System.out.print(" Delete threat summary current ");
			e.printStackTrace();
		} 
		
		
		
		
		// Delete Threat summery potential 
		
		
		try{
			
		
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<threat_summary_potential> lstthreats_potential =site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(assessment_id);
		
		List<Long> lstthreatpotential= new ArrayList<Long>();
		
		if(lstthreats_potential!=null)
		{
			for(threat_summary_potential objthreat_summary_potential:lstthreats_potential)
			{
				lstthreatpotential.add(objthreat_summary_potential.getPrimaryKey());
			}
		}
		
		for(int in=0;in<lstthreatpotential.size();in++){
	       	   
	 		long  id=lstthreatpotential.get(in);
	 		
	 		threat_summary_potentialLocalServiceUtil.deletethreat_summary_potential(id);
		}
		
		
		lstthreatpotential.clear();
		}
		
		
		}catch(Exception e)
		{
			System.out.print(" Delete Threat summery potential  ");
			e.printStackTrace();
		} 
		
		
		//Delete Assessing Protection & Management +Assess Protection & Management 
		
		
		try{
			
		
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<protection_management> listprotection_management=protection_managementLocalServiceUtil.findByAssessementVersionId(assessment_id);
		
		
		List<Long> lstprotmgt= new ArrayList<Long>();
		
          if(listprotection_management!=null)
          {
        	  for(protection_management objprotection_management:listprotection_management)
        	  {
        		  lstprotmgt.add(objprotection_management.getPrimaryKey());
        	  }
          }
		
          
          for(int in=0;in<lstprotmgt.size();in++){
	       	   
  	 		long  id=lstprotmgt.get(in);
  	 		
  	 		protection_managementLocalServiceUtil.deleteprotection_management(id);
  		}
          
          lstprotmgt.clear();
		}
		
		}catch(Exception e)
		{
			System.out.print(" Delete Assessing Protection & Management +Assess Protection & Management  ");
			e.printStackTrace();
		} 
		
		//Delete Assessment of the effectiveness of protection and management in addressing threats outside the site 
		
		
		
		try
		{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatsList=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(assessment_id);
		
		List<Long> lsteffpotmgt= new ArrayList<Long>();
		
		if(effective_prot_mgmt_iothreatsList!=null)
		{
			for(effective_prot_mgmt_iothreats objeffective_prot_mgmt_iothreats:effective_prot_mgmt_iothreatsList)
			{
				lsteffpotmgt.add(objeffective_prot_mgmt_iothreats.getPrimaryKey());	
			}
		}
		
		for(int in=0;in<lsteffpotmgt.size();in++){
	       	   
  	 		long  id=lsteffpotmgt.get(in);
  	 		
  	 		effective_prot_mgmt_iothreatsLocalServiceUtil.deleteeffective_prot_mgmt_iothreats(id);
  		}
		
		lsteffpotmgt.clear();
		
		}
		
		}catch(Exception e)
		{
			System.out.print(" Delete Assessment of the effectiveness of protection and management in addressing threats outside the site ");
			e.printStackTrace();
		} 
		
		
		// Delete Overall assessment of protection and management 
		
		
		try
		{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		 List<prot_mgmt_overall> prot_overallList = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(assessment_id);
		 
		 List<Long> lstpotmgtover= new ArrayList<Long>();

		 if(prot_overallList!=null)
		 {
			 for(prot_mgmt_overall objprot_mgmt_overall:prot_overallList)
			 {
				 lstpotmgtover.add(objprot_mgmt_overall.getPrimaryKey());
			 }
		 }
		 
		 for(int in=0;in<lstpotmgtover.size();in++){
	       	   
	  	 		long  id=lstpotmgtover.get(in);
	  	 		
	  	 		prot_mgmt_overallLocalServiceUtil.deleteprot_mgmt_overall(id);
	  		}
		 
		 lstpotmgtover.clear();
		 
		}
		
		}catch(Exception e)
		{
			System.out.print("  Delete Overall assessment of protection and management  ");
			e.printStackTrace();
		} 
		
		
		
		// Delete Best Practice Examples
		
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		 List<prot_mgmt_best_practices> prot_best_practicelList = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(assessment_id);
		 
		 List<Long> lstpotbestprac= new ArrayList<Long>();
		
		 if(prot_best_practicelList!=null)
		 {
			 
			 for(prot_mgmt_best_practices objprot_mgmt_best_practices:prot_best_practicelList)
			 {
				 lstpotbestprac.add(objprot_mgmt_best_practices.getPrimaryKey());
				 
			 }
		 }
		 
		 for(int in=0;in<lstpotbestprac.size();in++){
	       	   
	  	 		long  id=lstpotbestprac.get(in);
	  	 		
	  	 		prot_mgmt_best_practicesLocalServiceUtil.deleteprot_mgmt_best_practices(id);
	  		}
		 
		 
		 lstpotbestprac.clear();
		}
		
		}catch(Exception e)
		{
			System.out.print("  Delete for best   ");
			e.printStackTrace();
		} 
		
		//Delete 4
		
		
		try
		{
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		
		List<current_state_trend> lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessment_id);
		
		List<Long> lstcurrestate= new ArrayList<Long>();
		
		
		if(lstcurrent_state_trend!=null)
		{
			for(current_state_trend objcurrent_state_trend :lstcurrent_state_trend)
			{
				lstcurrestate.add(objcurrent_state_trend.getPrimaryKey());
			}
		}
		
		 for(int in=0;in<lstcurrestate.size();in++){
	       	   
	  	 		long  id=lstcurrestate.get(in);
	  	 		
	  	 		current_state_trendLocalServiceUtil.deletecurrent_state_trend(id);
	  		}
		 lstcurrestate.clear();
		 
		}
		
		}catch(Exception e)
		{
			System.out.print("  Delete 4  ");
			e.printStackTrace();
		} 
		
		// delete 5
		
		
		try
		{
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<conservation_outlook>  lstconservation_out = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(assessment_id);

		List<Long> lstconout= new ArrayList<Long>();
		
		if(lstconservation_out!=null)
		{
		for(conservation_outlook   objconservation_out :lstconservation_out)
		{
			lstconout.add(objconservation_out.getPrimaryKey());
		}
		
		}
		
		 for(int in=0;in<lstconout.size();in++){
	       	   
	  	 		long  id=lstconout.get(in);
	  	 		
	  	 		conservation_outlookLocalServiceUtil.deleteconservation_outlook(id);
	  		}
		 
		 lstconout.clear();
		
		}
		
		}catch(Exception e)
		{
			System.out.print("  5  ");
			e.printStackTrace();
		} 
		
		//Delete 6
		
		
		try {
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<key_conservation_issues> lstKey_conservationIssues=key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(assessment_id);
		
		
		List<Long> lstkeyissue= new ArrayList<Long>();
		
		if(lstKey_conservationIssues!=null)
		{
			for(key_conservation_issues objkey_conservation_issues:lstKey_conservationIssues)
			{
				lstkeyissue.add(objkey_conservation_issues.getPrimaryKey());
			}
		}
		
		
		for(int in=0;in<lstkeyissue.size();in++){
	       	   
  	 		long  id=lstkeyissue.get(in);
  	 		
  	 		key_conservation_issuesLocalServiceUtil.deletekey_conservation_issues(id);
  		}
	 
		lstkeyissue.clear();
		
		}
		
		}catch(Exception e)
		{
			System.out.print("  Delete 6 ");
			e.printStackTrace();
		} 
		
		
		//Delete 7
		
		try
		{
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<benefits>  lst_benefits_summary=benefitsLocalServiceUtil.getbenefitByVersion(assessment_id);
		
		
		List<Long> lstbenefit= new ArrayList<Long>();
		
		if(lst_benefits_summary!=null)
		{
			for(benefits objbenefits_summary:lst_benefits_summary)
			{
				lstbenefit.add(objbenefits_summary.getPrimaryKey());
			}
		}
		
		for(int in=0;in<lstbenefit.size();in++){
	       	   
  	 		long  id=lstbenefit.get(in);
  	 		
         	 List<benefits_type_ref> listbenefittype =benefits_type_refLocalServiceUtil.findByBenefitsId(id);
        	   
        	   for(benefits_type_ref typeref:listbenefittype)
        	   {
        		
        		   benefits_type_refLocalServiceUtil.deletebenefits_type_ref(typeref);
        	   }
  	 		
        	   benefitsLocalServiceUtil.deletebenefits(id);
  		}
	 
		lstbenefit.clear();
		
		
		
		
		}
		}catch(Exception e)
		{
			System.out.print("  Delete 7  ");
			e.printStackTrace();
		} 
		

		
		//Delete Summary of benefits
		
		try
		{
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<benefits_summary> lst_benefits_summary=benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(assessment_id);
		 
		List<Long> lstbenefitsumm= new ArrayList<Long>();
		
		
	   for(benefits_summary objbenefits_summary:lst_benefits_summary)
   	   {
   		
		   lstbenefitsumm.add(objbenefits_summary.getPrimaryKey());
   	   }

	   
	   for(int in=0;in<lstbenefitsumm.size();in++){
       	   
 	 		long  id=lstbenefitsumm.get(in);
 	 		
 	 		benefits_summaryLocalServiceUtil.deletebenefits_summary(id);
 		}
	 
	   lstbenefitsumm.clear();
		}
		
		}catch(Exception e)
		{
			System.out.print("  Delete 7b");
			e.printStackTrace();
		} 
		
		//Delete Compilation Of Active Conservation Projects And Project Needs +Add Conservation Projects 
		
		
		try{
			
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<active_conservation_projects> 	lstactive_projects=active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(assessment_id);
		
		List<Long> lstactivecon= new ArrayList<Long>();
		
		
		for(active_conservation_projects objactive_conservation_projects:lstactive_projects)
		{
			lstactivecon.add(objactive_conservation_projects.getPrimaryKey());
			
		}
		
		
		
		  for(int in=0;in<lstactivecon.size();in++){
	       	   
	 	 		long  id=lstactivecon.get(in);
	 	 		
	 	 		active_conservation_projectsLocalServiceUtil.deleteactive_conservation_projects(id);
	 		}
		 
		  lstactivecon.clear();
		   
		}
		}catch(Exception e)
		{
			System.out.print("  Delete 8  ");
			e.printStackTrace();
		} 
		
		// delete Compilation of potential project needs +Add potential project 
		
		
		
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<potential_project_needs>lstpotential_project=potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(assessment_id);
		
		List<Long> lstpotentialpro= new ArrayList<Long>();
		
		
		if(lstpotential_project!=null)
		{
			for(potential_project_needs objpotential_project_needs:lstpotential_project)
			{
				lstpotentialpro.add(objpotential_project_needs.getPrimaryKey());
			}
			
		}
		
		  for(int in=0;in<lstpotentialpro.size();in++){
	       	   
	 	 		long  id=lstpotentialpro.get(in);
	 	 		
	 	 		potential_project_needsLocalServiceUtil.deletepotential_project_needs(id);
	 		}
		 
		  lstpotentialpro.clear();
		  
		
		}
		
		}catch(Exception e)
		{
			System.out.print("  Delete 8b ");
			e.printStackTrace();
		} 
		
		
		//Delete form reference tab
		
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<references> whpreferences=referencesLocalServiceUtil.findByAssessmentId(assessment_id);
		
		List<Long> lstreference= new ArrayList<Long>();
		
		if(whpreferences!=null)
		{
			for(references objreferences:whpreferences)
			{
				lstreference.add(objreferences.getPrimaryKey());
			}
		}
		
		
		 for(int in=0;in<lstreference.size();in++){
	       	   
	 	 		long  id=lstreference.get(in);
	 	 		
	 	 		referencesLocalServiceUtil.deletereferences(id);
	 		}
		 
		 lstreference.clear();
		  
		
		}
		
		
		}catch(Exception e)
		{
			System.out.print("  Delete 9  ");
			e.printStackTrace();
		} 
		
		
		// Delete frorm assessment validation 
		
		
		try{
		
		for (int a=0;a<assessmentid.size();a++)
		{
		long assessment_id =assessmentid.get(a);
		
		List<assessment_validation> lstassessment_validation=assessment_validationLocalServiceUtil.getAssessmentValbyVersionId(assessment_id);
		
		List<Long> lstassessvalidation= new ArrayList<Long>();

		
		if(lstassessment_validation!=null )
		{
			for(assessment_validation objassessment_validation:lstassessment_validation)
			{
				lstassessvalidation.add(objassessment_validation.getPrimaryKey());
		    
			}
			
		}
		
		 for(int in=0;in<lstassessvalidation.size();in++){
	       	   
	 	 		long  id=lstassessvalidation.get(in);
	 	 		
	 	 		assessment_validationLocalServiceUtil.deleteassessment_validation(id);
	 		}
		 
		 lstassessment_validation.clear();
		 
		}
		
		}catch(Exception e)
		{
		  System.out.println("Delete Assessment validation");
		  e.printStackTrace();
		}
		
		
		//getAssessmentValbyVersionId
		
		
		
		
		//assesment_lang_version
		
		List<assessment_lang_version> lstlangversion =assessment_lang_versionLocalServiceUtil.findByAssessmentId(assmnt_id);
		
		List<Long> lstlangversioid= new ArrayList<Long>();
		
		if(lstlangversion!=null)
		{
			for(assessment_lang_version objassessment_lang_version:lstlangversion)
			{
				lstlangversioid.add(objassessment_lang_version.getPrimaryKey());
			}
		}
		
		
		 for(int in=0;in<lstlangversioid.size();in++){
	       	   
	 	 		long  id=lstlangversioid.get(in);
	 	 		
	 	 		assessment_lang_versionLocalServiceUtil.deleteassessment_lang_version(id);
	 		}
		 
		 
		 // Delete site_assessment_versions 
		 
		 

		 List<site_assessment_versions> lstassessmentversion =site_assessment_versionsLocalServiceUtil.findByAssessmentId(assmnt_id);
		 
		 
		 List<Long> lstassestversion= new ArrayList<Long>();
		 
		 
		 if(lstassestversion!=null)
		 {
			 for(site_assessment_versions objsite_assessment_versions:lstassessmentversion)
			 {
				 lstassestversion.add(objsite_assessment_versions.getPrimaryKey());
			 }
		 }
		
		 for(int in=0;in<lstassestversion.size();in++){
	       	   
	 	 		long  id=lstassestversion.get(in);
	 	 		
	 	 		site_assessment_versionsLocalServiceUtil.deletesite_assessment_versions(id);
	 		}
		 
		 
		 //delet site assessment table 
		 
		 site_assessment objsite_assessment=site_assessmentLocalServiceUtil.deletesite_assessment(assmnt_id);
		 
		    response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
			response.setWindowState(LiferayWindowState.NORMAL);
		 
		 
		 
		
	}
	
	
	
	
	
}
