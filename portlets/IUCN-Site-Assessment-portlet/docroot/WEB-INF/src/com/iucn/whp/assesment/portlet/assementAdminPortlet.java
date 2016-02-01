package com.iucn.whp.assesment.portlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.iucn.action.AssessmentDelete;
import com.iucn.action.AssessmentWorkflowAction;
import com.iucn.whp.assesment.utils.AssessmentSearchUtil;
import com.iucn.whp.assesment.utils.Exportutil;
import com.iucn.whp.dbservice.model.active_conservation_projects;
import com.iucn.whp.dbservice.model.assessing_threats_current;
import com.iucn.whp.dbservice.model.assessing_threats_potential;
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
import com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp;
import com.iucn.whp.dbservice.model.references;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.site_assessment_versions;
import com.iucn.whp.dbservice.model.state_trend_biodivvals;
import com.iucn.whp.dbservice.model.state_trend_whvalues;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;
import com.iucn.whp.dbservice.model.threat_summary_current;
import com.iucn.whp.dbservice.model.threat_summary_overall;
import com.iucn.whp.dbservice.model.threat_summary_potential;
import com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessing_threats_potentialLocalServiceUtil;
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
import com.iucn.whp.dbservice.service.protection_mgmt_checklist_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.referencesLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_trend_biodivvalsLocalServiceUtil;
import com.iucn.whp.dbservice.service.state_trend_whvaluesLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_subcategories_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_overallLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_potentialLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class assementAdminPortlet extends MVCPortlet{

	
    /**
     * This Action adds a product to the database.
     *
     * @param request
     * @param response
     * @throws java.lang.Exception
     */
	public DateFormat serverDate = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
    
	
	/**
     * This Action gets a product from the database and puts it into the
     * request. It also sets the "jspPage" parameter to "editProduct" so that
     * processing is forwarded to edit_product.jsp.
     *
     * @param request
     * @param response
     * @throws java.lang.Exception
     */

   

    
    
    
    public void compilationActiveconver(ActionRequest request, ActionResponse response)
    throws Exception {
    	
    	
    	try
    	{
    		
    		String organisationname =ParamUtil.getString(request,"organisation" );
    		
    		String briefdescription =ParamUtil.getString(request,"description" );
    		
    		String contactdetail=ParamUtil.getString(request,"contact" );
    		
    		long acpid=ParamUtil.getLong(request, "acpid");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		System.out.println("hi"+organisationname);
    		
    		System.out.println(briefdescription);

    		System.out.println(contactdetail);

    		System.out.println(acpid);
    		
    		
    		active_conservation_projects active_conservation =null;
    		
    		if(acpid >0)
    		{
    			active_conservation=active_conservation_projectsLocalServiceUtil.getactive_conservation_projects(acpid);
    		}
    		else{
    			active_conservation=active_conservation_projectsLocalServiceUtil.createactive_conservation_projects(CounterLocalServiceUtil.increment(active_conservation_projects.class.getName()));    			
    		}
        	
    		if(active_conservation!=null)
    		{
    		
    		active_conservation.setContact_details(contactdetail);
    		active_conservation.setDescription(briefdescription);
    		active_conservation.setOrganization_individual(organisationname);
    		active_conservation.setAssessment_version_id(assessmentVersionId);
    		active_conservation_projectsLocalServiceUtil.addactive_conservation_projects(active_conservation);
    		
    		}
    		

    	}
    	catch(Exception ex){
	
    		ex.printStackTrace();
    		
    		
	}

    	
    }
    

    
    
    public void compilationofpotentialpro(ActionRequest request, ActionResponse response)
    throws Exception {
    	
    	
		String organisationname =ParamUtil.getString(request,"organisation" );
		
		String briefdescription =ParamUtil.getString(request,"description" );
		
		String contactdetail=ParamUtil.getString(request,"contactdetail" );
		
		long ppnid=ParamUtil.getLong(request, "ppnid");
		
		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");

		System.out.println(organisationname);
		System.out.println(briefdescription);
		System.out.println(contactdetail);
		System.out.println(ppnid);
		
		potential_project_needs  potential_project = null;
		
		
		if(ppnid>0)
		{
			
			potential_project=potential_project_needsLocalServiceUtil.getpotential_project_needs(ppnid);

		}
		else
			
		{
			potential_project=potential_project_needsLocalServiceUtil.createpotential_project_needs(CounterLocalServiceUtil.increment(potential_project_needs.class.getName()));
			
		}
		if(potential_project!=null)
		{
		potential_project.setContact_details(contactdetail);
		potential_project.setDescription(briefdescription);
		potential_project.setOrganization_individual(organisationname);
		potential_project.setAssessment_version_id(assessmentVersionId);
		potential_project_needsLocalServiceUtil.addpotential_project_needs(potential_project);
		}
    }


    
    
    
    public void addSummarryOfBenefit(ActionRequest request, ActionResponse response)
    throws Exception {
    		
    	
    	
       
    	String summarybenefits =ParamUtil.getString(request,"summarybenefits" );
		
			
		long benefitsummuryid=ParamUtil.getLong(request, "benefitsummury_id");
		
		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
		
		
		benefits_summary     objbenefits_summary=null;
		
		
		if(benefitsummuryid>0)
		{
			objbenefits_summary=benefits_summaryLocalServiceUtil.getbenefits_summary(benefitsummuryid);
			
		}
		
		else
		{
			objbenefits_summary=benefits_summaryLocalServiceUtil.createbenefits_summary(CounterLocalServiceUtil.increment(benefits_summary.class.getName()));
		}
		
		
		
		if(objbenefits_summary!=null)
		{
			objbenefits_summary.setAssessment_version_id(assessmentVersionId);
			objbenefits_summary.setSummary(summarybenefits);
		    benefits_summaryLocalServiceUtil.addbenefits_summary(objbenefits_summary);
		}
    
    }
    
    



    public void  justificationofassessment(ActionRequest request, ActionResponse response)
    throws Exception {
    	
		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");

		 long conservation_id=ParamUtil.getLong(request, "conservation_id");
    	
    	
		 String justification_assessment =ParamUtil.getString(request, "justification");
		 		 
		 
		 Long assessment_id=ParamUtil.getLong(request, "assessment");
		 
		 
		 conservation_outlook  conservation_out=null;
		 
		 
		 if(conservation_id>0)
		 {
			 conservation_out=conservation_outlookLocalServiceUtil.getconservation_outlook(conservation_id) ;
		 }else{
			 conservation_out=conservation_outlookLocalServiceUtil.createconservation_outlook(CounterLocalServiceUtil.increment(conservation_outlook.class.getName()));
		 }
		 
		 if(conservation_out!=null)
		 {
			 conservation_out.setAssessment_version_id(assessmentVersionId);
			 conservation_out.setJustification(justification_assessment);
			 conservation_out.setRating(assessment_id);
			 
			 conservation_outlookLocalServiceUtil.addconservation_outlook(conservation_out);
		 }
		 
		 
		 
    }


    public void understandingkeyconservation(ActionRequest request, ActionResponse response)
    throws Exception {
    	
    	String keyconissue =ParamUtil.getString(request, "keyconissue");
    	   	
    	String description =ParamUtil.getString(request, "description");
    		 	
    	
    	Long scale=ParamUtil.getLong(request, "scale");
    	Long  cons_issues_id =ParamUtil.getLong(request, "conservation_issues_id");
    	
    	
		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");

    	
              key_conservation_issues key_con_issue=null;
              
              
              if(cons_issues_id>0)
              {
            	  key_con_issue=key_conservation_issuesLocalServiceUtil.getkey_conservation_issues(cons_issues_id);
            	  
            	  
              }
    	
              else
              {
            	  key_con_issue=key_conservation_issuesLocalServiceUtil.createkey_conservation_issues(CounterLocalServiceUtil.increment(key_conservation_issues.class.getName()));
              }

              if(key_con_issue!=null)
              {
            	 
            	  key_con_issue.setAssessment_version_id(assessmentVersionId);
            	  key_con_issue.setDescription(description);
            	  key_con_issue.setScale(scale);
            	  
            	 
            	  key_con_issue.setKey_conservation_issues(keyconissue);
                  key_conservation_issuesLocalServiceUtil.addkey_conservation_issues(key_con_issue);
            	  
              }
    }
    
    public void step1details(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long whValueId=ParamUtil.getLong(request,"assessmentwhValueId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		long assessmentVn = ParamUtil.getLong(request, "assessmentVn");
           String values = ParamUtil.getString(request, "values");
           String description = ParamUtil.getString(request, "description");
           int[] criteria = ParamUtil.getIntegerValues(request, "listCriteria");
           List<Long> lstCriteria = new ArrayList<Long>();
           
            for(int crt:criteria) {
            	lstCriteria.add((long) crt);
            }
        	assessment_whvalues objassessment_whvalues = null;
        	current_state_trend objcurrent_state_trend = null;
        	List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = null;
        	List<current_state_trend> lstCurrentStateTrend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessmentVersionId);
        	if(whValueId>0){
        		objassessment_whvalues =assessment_whvaluesLocalServiceUtil.getassessment_whvalues(whValueId);
        		lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(whValueId);
        	}else {
        		
        		objassessment_whvalues = assessment_whvaluesLocalServiceUtil.createassessment_whvalues(CounterLocalServiceUtil.increment(assessment_whvalues.class.getName()));
        		objcurrent_state_trend = current_state_trendLocalServiceUtil.createcurrent_state_trend(CounterLocalServiceUtil.increment(current_state_trend.class.getName()));
        	}
        	if(objassessment_whvalues!=null){
        		objassessment_whvalues.setAssessment_version_id(assessmentVersionId);
        		objassessment_whvalues.setDescription(description);
        		objassessment_whvalues.setVn(assessmentVn);
        		objassessment_whvalues.setValues(values);
        		assessment_whvaluesLocalServiceUtil.addassessment_whvalues(objassessment_whvalues);
        	}
        	if(objcurrent_state_trend!=null){
        		
        		objcurrent_state_trend.setVn(objassessment_whvalues.getWhvalues_id());
        		objcurrent_state_trend.setAssessment_version_id(assessmentVersionId);
        		objcurrent_state_trend.setIs_biodiv_whval(false);
        		current_state_trendLocalServiceUtil.addcurrent_state_trend(objcurrent_state_trend);
        	}
        	if(lstwhvalues_whcriterion!=null && lstwhvalues_whcriterion.size()>0){
        		for(int i=0;i<lstwhvalues_whcriterion.size();i++){
        			long criteria_id =lstwhvalues_whcriterion.get(i).getWh_criteria_id();
        			long criteriaVal = lstwhvalues_whcriterion.get(i).getCriterion();
        			if(lstCriteria.contains(criteriaVal))
        				lstCriteria.remove(criteriaVal);
        			else {
        				assessment_whvalues_whcriterionLocalServiceUtil.deleteassessment_whvalues_whcriterion(criteria_id);
        			}
        		}
        	}
        	if(lstCriteria.size()>0){
        		for(long crt:lstCriteria){
	        		assessment_whvalues_whcriterion objwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.createassessment_whvalues_whcriterion(CounterLocalServiceUtil.increment(assessment_whvalues_whcriterion.class.getName()));	
	        		objwhvalues_whcriterion.setWhvalues_id(objassessment_whvalues.getWhvalues_id());
	        		objwhvalues_whcriterion.setCriterion(crt);
	        		assessment_whvalues_whcriterionLocalServiceUtil.addassessment_whvalues_whcriterion(objwhvalues_whcriterion);
        		}
        	}
        	
        	List<threat_summary_current> lstthreat_summary_current = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(assessmentVersionId);
        	List<threat_summary_potential> lstthreat_summary_potential = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(assessmentVersionId);
        	List<threat_summary_overall> lstthreat_summary_overall = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(assessmentVersionId);
    			threat_summary_current objthreat_summary_current = null;
    			if(lstthreat_summary_current==null || lstthreat_summary_current.isEmpty())
    				objthreat_summary_current = threat_summary_currentLocalServiceUtil.createthreat_summary_current(CounterLocalServiceUtil.increment(threat_summary_current.class.getName()));
    			if(objthreat_summary_current!=null){
    				objthreat_summary_current.setAssessment_version_id(assessmentVersionId);
    				threat_summary_currentLocalServiceUtil.addthreat_summary_current(objthreat_summary_current);
    			}
    		
    			threat_summary_potential objthreat_summary_potential = null;
    			if(lstthreat_summary_potential==null || lstthreat_summary_potential.isEmpty())
    				objthreat_summary_potential = threat_summary_potentialLocalServiceUtil.createthreat_summary_potential(CounterLocalServiceUtil.increment(threat_summary_potential.class.getName()));
    			if(objthreat_summary_potential!=null){
    				objthreat_summary_potential.setAssessment_version_id(assessmentVersionId);
    				threat_summary_potentialLocalServiceUtil.addthreat_summary_potential(objthreat_summary_potential);
    			}
    		
    			threat_summary_overall objthreat_summary_overall = null;
    			if(lstthreat_summary_overall==null || lstthreat_summary_overall.isEmpty())
    				objthreat_summary_overall = threat_summary_overallLocalServiceUtil.createthreat_summary_overall(CounterLocalServiceUtil.increment(threat_summary_overall.class.getName()));
    			if(objthreat_summary_overall!=null){
    				objthreat_summary_overall.setAssessment_version_id(assessmentVersionId);
    				threat_summary_overallLocalServiceUtil.addthreat_summary_overall(objthreat_summary_overall);
    			}
    			List<state_trend_biodivvals> lststate_trend_biodivvals =site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(assessmentVersionId);
    			List<state_trend_whvalues> lststate_trend_whvalues = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(assessmentVersionId);
    			
    			state_trend_biodivvals objstate_trend_biodivvals = null;
    			if(lststate_trend_biodivvals==null || lststate_trend_biodivvals.isEmpty()){
    				objstate_trend_biodivvals = state_trend_biodivvalsLocalServiceUtil.createstate_trend_biodivvals(CounterLocalServiceUtil.increment(state_trend_biodivvals.class.getName()));
    			}
    			if(objstate_trend_biodivvals!=null){
    				objstate_trend_biodivvals.setAssessment_version_id(assessmentVersionId);
    				state_trend_biodivvalsLocalServiceUtil.addstate_trend_biodivvals(objstate_trend_biodivvals);
    			}
    			
    			state_trend_whvalues objstate_trend_whvalues = null;
    			if(lststate_trend_whvalues==null || lststate_trend_whvalues.isEmpty()){
    				objstate_trend_whvalues = state_trend_whvaluesLocalServiceUtil.createstate_trend_whvalues(CounterLocalServiceUtil.increment(state_trend_whvalues.class.getName()));
    			}
    			
    			if(objstate_trend_whvalues!=null){
    				objstate_trend_whvalues.setAssessment_version_id(assessmentVersionId);
    				state_trend_whvaluesLocalServiceUtil.addstate_trend_whvalues(objstate_trend_whvalues);
    			}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.printStackTrace();
    	}
    }
    
    public void updateCurrentStateTrend(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long stateTrendId=ParamUtil.getLong(request,"stateTrendId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		long currentWhValue = ParamUtil.getLong(request, "currentWhValue");
    		String justificationAssessment = ParamUtil.getString(request, "justificationAssessment");
    		long currentAssessment = ParamUtil.getLong(request, "currentAssessment");
    		long currentTrend = ParamUtil.getLong(request, "currentTrend");
    		
    		current_state_trend objCurrent_state_trend = null;
    		if(stateTrendId>0){
    			objCurrent_state_trend = current_state_trendLocalServiceUtil.getcurrent_state_trend(stateTrendId);
    		}
           
    		if(objCurrent_state_trend!=null){
    			objCurrent_state_trend.setAssessment_version_id(assessmentVersionId);
    			objCurrent_state_trend.setJustification(justificationAssessment);
    			objCurrent_state_trend.setState_id(currentAssessment);
    			objCurrent_state_trend.setTrend_id(currentTrend);
    			objCurrent_state_trend.setVn(currentWhValue);
    			current_state_trendLocalServiceUtil.addcurrent_state_trend(objCurrent_state_trend);
    		}

    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    public void updateStateTrendBio(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long stateTrendId=ParamUtil.getLong(request,"stateTrendId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		String justificationAssessment = ParamUtil.getString(request, "justificationAssessment");
    		long currentAssessment = ParamUtil.getLong(request, "currentAssessment");
    		long currentTrend = ParamUtil.getLong(request, "currentTrend");
    		
    		state_trend_biodivvals objstate_trend_biodivvals = null;
    		if(stateTrendId>0){
    			objstate_trend_biodivvals = state_trend_biodivvalsLocalServiceUtil.getstate_trend_biodivvals(stateTrendId);
    		}else{
    			objstate_trend_biodivvals = state_trend_biodivvalsLocalServiceUtil.createstate_trend_biodivvals(CounterLocalServiceUtil.increment(state_trend_biodivvals.class.getName()));
    		}
           
    		if(objstate_trend_biodivvals!=null){
    			objstate_trend_biodivvals.setAssessment_version_id(assessmentVersionId);
    			objstate_trend_biodivvals.setJustification(justificationAssessment);
    			objstate_trend_biodivvals.setState_id(currentAssessment);
    			objstate_trend_biodivvals.setTrend_id(currentTrend);
    			state_trend_biodivvalsLocalServiceUtil.addstate_trend_biodivvals(objstate_trend_biodivvals);
    		}

    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    
    public void understandingBenefit(ActionRequest request, ActionResponse response)
    throws Exception {
    	
		
		long assessmentVersionId = ParamUtil.getLong(request,
				"assessmentVersionId");

		boolean check=false;
		long benefittype = ParamUtil.getLong(request, "benefittype");
		long[] selectedbenefit = ParamUtil.getLongValues(request, "benefitSubtype");
		String state = ParamUtil.getString(request, "state");
		if(state.equals("datadeficient"))
		{
			check=true;
		}
		else
		{
			check=false;
		}
		String summary = ParamUtil.getString(request, "summary");
		long commwithin = ParamUtil.getLong(request, "commwithin");
		long commoutside = ParamUtil.getLong(request, "commoutside");
		long commwider = ParamUtil.getLong(request, "commwider");
		long benefit_id = ParamUtil.getLong(request, "benefitid");
    	
 	
    	
   
    	
    	benefits  benefitsobj =null;
    	
		if (benefit_id > 0) {
			benefitsobj = benefitsLocalServiceUtil.getbenefits(benefit_id);
			
					
					
		}
		else {
			benefitsobj = benefitsLocalServiceUtil
					.createbenefits(CounterLocalServiceUtil
							.increment(benefits.class.getName()));
		}
    	
       	if(benefitsobj!=null)
    	{
    		benefitsobj.setAssessment_version_id(assessmentVersionId);
    		benefitsobj.setSummary(summary);
    		benefitsobj.setData_deficient(check);
    		benefitsobj.setCommunity_outside_site(commoutside);
    		benefitsobj.setCommunity_within_site(commwithin);
    		benefitsobj.setWider_community(commwider);
    		benefitsobj.setSelected_benefit(benefittype);
    		benefits tempBenefits= benefitsLocalServiceUtil.addbenefits(benefitsobj);
    		long benefitsID=tempBenefits.getBenefits_id();
    		
    		   	   	if(benefitsID>0)	
    		   	   	{
    		   	   	List<benefits_type_ref> listbenefittype =benefits_type_refLocalServiceUtil.findByBenefitsId(benefitsID);
    		     	   
    		     	   for(benefits_type_ref typeref:listbenefittype)
    		     	   {
    		     		
    		     		   benefits_type_refLocalServiceUtil.deletebenefits_type_ref(typeref);
    		     	   }
    		   	   	}
    		
    		int size=selectedbenefit.length;
    		   		
    		for(int i=0; i<size;i++){
    			benefits_type_ref objbenefits_type_ref = benefits_type_refLocalServiceUtil.createbenefits_type_ref(CounterLocalServiceUtil
						.increment(benefits_type_ref.class.getName()));
    			objbenefits_type_ref.setBenefit_checktype(benefittype);
    			objbenefits_type_ref.setBenefit_checksubtype(selectedbenefit[i]);
    			objbenefits_type_ref.setBenefits_id(benefitsID);
    			benefits_type_refLocalServiceUtil.addbenefits_type_ref(objbenefits_type_ref);
    		}
      	}    	
    	    	    	    	
    }
    
    
       
    
    
    
    public void updateStateTrendwh(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long stateTrendId=ParamUtil.getLong(request,"stateTrendId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		String justificationAssessment = ParamUtil.getString(request, "justificationAssessment");
    		long currentAssessment = ParamUtil.getLong(request, "currentAssessment");
    		long currentTrend = ParamUtil.getLong(request, "currentTrend");
    		
    		state_trend_whvalues objstate_trend_whvalues = null;
    		if(stateTrendId>0){
    			objstate_trend_whvalues = state_trend_whvaluesLocalServiceUtil.getstate_trend_whvalues(stateTrendId);
    		}else{
    			objstate_trend_whvalues = state_trend_whvaluesLocalServiceUtil.createstate_trend_whvalues(CounterLocalServiceUtil.increment(state_trend_whvalues.class.getName()));
    		}
           
    		if(objstate_trend_whvalues!=null){
    			objstate_trend_whvalues.setAssessment_version_id(assessmentVersionId);
    			objstate_trend_whvalues.setJustification(justificationAssessment);
    			objstate_trend_whvalues.setState_id(currentAssessment);
    			objstate_trend_whvalues.setTrend_id(currentTrend);
    			state_trend_whvaluesLocalServiceUtil.addstate_trend_whvalues(objstate_trend_whvalues);
    		}

    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException {

	    	String cmd = resourceRequest.getParameter("ACTION_CMD");
			if (cmd != null && cmd.equalsIgnoreCase("assessmentWHValue")) {
				getValidateWHValuesData(resourceRequest, resourceResponse);
				
			}else if (cmd != null && cmd.equalsIgnoreCase("assessmentBioValue")) {
				getValidateBioValuesData(resourceRequest, resourceResponse);
				
			}else if(cmd != null && cmd.equalsIgnoreCase("deleteWhvalues")){
				
					deleteCurrentRecordFromWhValues(resourceRequest, resourceResponse);
				
			}else if(cmd != null && cmd.equalsIgnoreCase("stepStatusUpdate")) {
			
				UpdateStepValidation(resourceRequest, resourceResponse);
				
			}
			
			else if(cmd != null && cmd.equalsIgnoreCase("actionGetTopic")) {
				
				try {
					getTopicValue(resourceRequest, resourceResponse);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(cmd != null && cmd.equalsIgnoreCase("RUNQUERY")){
				
				try {
					 String[] fieldValue=ParamUtil.getParameterValues(resourceRequest, "lstWhereClause");
					 List<Long> assessmentIdlst=AssessmentSearchUtil.runQuery(fieldValue);
					 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
				   	 JSONObject cell=null;
				   	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
				   	 String strAssessmentIds = "";
				   	 String strSiteNames = "";
				   	 if(assessmentIdlst!=null && assessmentIdlst.size()>0){
				   		     cell=JSONFactoryUtil.createJSONObject();
				   		  for(long assessmentId:assessmentIdlst){
				   			if(strAssessmentIds.isEmpty()){
				   				String siteName="";
								try {
									long siteId = site_assessmentLocalServiceUtil.getsite_assessment(assessmentId).getSite_id();
									siteName = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId).getName_en();
									strAssessmentIds = strAssessmentIds+assessmentId;
					   				strSiteNames = siteName;
								} catch (Exception e) {
									// TODO Auto-generated catch block
									//e.printStackTrace();
								}
				   				
				   			}
				   			else {
				   				String siteName="";
								try {
									long siteId = site_assessmentLocalServiceUtil.getsite_assessment(assessmentId).getSite_id();
									siteName = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId).getName_en();
									strAssessmentIds = strAssessmentIds+","+assessmentId;
					   				strSiteNames = strSiteNames+","+siteName;
								} catch (Exception e) {
									// TODO Auto-generated catch block
									//e.printStackTrace();
								}
				   				
				   			}
				   		  }
					    	 cell.put("result", strAssessmentIds);
					    	 cell.put("strSiteNames", strSiteNames);
					    	 recordsjsonArray.put(cell);
				   		 int size=assessmentIdlst.size();
				   		 String resultStr="";
				   		 if(size>1)
				   			resultStr= size+" records found";
				   		 else
				   			resultStr= size+" record found"; 
				   		recordsjsonObject.put("search_result",resultStr);
				   		recordsjsonObject.put("rows",recordsjsonArray);
				   	 }else{
				   		recordsjsonObject.put("search_result","no record found.");
				   	 }
				   	 
				   	 resourceResponse.getWriter().print(recordsjsonObject.toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
			
			else if(cmd != null && cmd.equalsIgnoreCase("advanceSearch")) {
				String jspPage = resourceRequest.getParameter("jspPageDiv");
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
				dispatcher.include(resourceRequest, resourceResponse);	
			}
			else if(cmd != null && cmd.equalsIgnoreCase("GETSUBCAT")) {
				//getting value os sub category for advance search
				AssessmentSearchUtil.getSubCategoryList(resourceRequest, resourceResponse);
				
			}
			else if(cmd != null && cmd.equalsIgnoreCase("GETUNIQUEVALUES")) {
				//AssessmentSearchUtil.getUniqueValuesForSearch(resourceRequest, resourceResponse);
				AssessmentSearchUtil.getLookUpValues(resourceRequest, resourceResponse);
				
			}
			else if(cmd != null && cmd.equalsIgnoreCase("SEARCH")) {
				String jspPage = resourceRequest.getParameter("jspPageDiv");
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
				dispatcher.include(resourceRequest, resourceResponse);	
			}
			
			else if(cmd != null && cmd.equalsIgnoreCase("EXPORT"))
			{
				Exportutil.exportData(resourceRequest, resourceResponse);
			}
			else {
	    		String assessment_versionId = resourceRequest.getParameter("assessment_versionId");
	    		if(assessment_versionId.isEmpty())
	    			assessment_versionId = resourceRequest.getParameter("versionId");
	    		String previous_versionId="";
	    		if(assessment_versionId!=null && !assessment_versionId.isEmpty() )
	    		{
	    			previous_versionId = getPreviousVersion(assessment_versionId);
	    		}
	    		 
				String jspPage = resourceRequest.getParameter("jspPageDiv");
				
				resourceRequest.setAttribute("versionId", assessment_versionId);
				if(previous_versionId!=null && !previous_versionId.isEmpty())
					resourceRequest.setAttribute("previousVersionId", previous_versionId);
	
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
				dispatcher.include(resourceRequest, resourceResponse);
			}
    }
    
   	private void getTopicValue(ResourceRequest resourceRequest,	ResourceResponse resourceResponse) throws PortletException, IOException, SystemException, PortalException{
   		
   		List<protection_management> lstprotection_management=null;

   		boolean islastrating=false;
   		long rating=0;
   		String justifiaction="";
   		String topicvalue="";
   		long protectionId=0;
   	 long topic_id=ParamUtil.getLong(resourceRequest, "topic_id");
   	
   	 
   	 String assessment_versionId = resourceRequest.getParameter("assessmentVersionId");
   
   	lstprotection_management=protection_managementLocalServiceUtil.findByAssessementVersionId(Long.parseLong(assessment_versionId));
   	protection_mgmt_checklist_lkp protection_mgmt_checklist_lkpobj=null;
	try {
		protection_mgmt_checklist_lkpobj = protection_mgmt_checklist_lkpLocalServiceUtil.getprotection_mgmt_checklist_lkp(topic_id);
	} catch (Exception e1) {
	}
    
   	if(protection_mgmt_checklist_lkpobj!=null)
   	{
   		
   	for(protection_management objprotection_management:lstprotection_management)
   	{
   		   	
   		if(objprotection_management.getTopic_id()==topic_id)
   		{
   			justifiaction=objprotection_management.getJustification();
   			rating=objprotection_management.getRating();
   			protectionId=objprotection_management.getPrimaryKey();
   			try {
				topicvalue=protection_mgmt_checklist_lkpLocalServiceUtil.getprotection_mgmt_checklist_lkp(topic_id).getTopic();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
   		}
   	}
   	
   	islastrating=true;
   	if(protectionId==0)
    {
 	   try {
 			topicvalue=protection_mgmt_checklist_lkpLocalServiceUtil.getprotection_mgmt_checklist_lkp(topic_id).getTopic();
 		} catch (PortalException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    }
   	}
   
   	
   	try {
   		JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject(); 
   		JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
    	JSONObject cell=null;
    	cell=JSONFactoryUtil.createJSONObject();
    	cell.put("rating", rating);
    	cell.put("assessmentVersionId", assessment_versionId);
    	cell.put("justifiaction", justifiaction);
    	cell.put("topic_id", topic_id);
       	cell.put("topicvalue", topicvalue);
       	cell.put("islastrating", islastrating);
       	cell.put("protectionId", protectionId);
    	recordsjsonArray.put(cell);
   	   	recordsjsonObject.put("rows",recordsjsonArray);
    	resourceResponse.getWriter().print(recordsjsonObject.toString());
    	
    	
	} catch (Exception e) {
	e.printStackTrace();
	 
	}
   	
	}




	private void getValidateBioValuesData(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws PortletException, IOException
    {
    	long whValueId=ParamUtil.getLong(resourceRequest, "WHValueId");
    	String assessment_versionId = resourceRequest.getParameter("versionId");
    	
    	JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
    	boolean isValueAttached = false;
    	String whValue= "";
   	 	try{
    	 if(whValueId>0){
    		 
    		 boolean currentThreat = false;
    		 boolean potentialThreat = false;
    		 whValue = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(whValueId).getValue();
		     List<assessing_threats_current> lstAssessing_threats_current= site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(Long.parseLong(assessment_versionId));
		     List<assessing_threats_potential> lstAssessing_threats_potential= site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(Long.parseLong(assessment_versionId));
		     if(lstAssessing_threats_current!=null && lstAssessing_threats_potential!=null){
		    	for(assessing_threats_current threats_current:lstAssessing_threats_current){
		    		long threatId = threats_current.getCurrent_threat_id();
		    		List<current_threat_values> lstThreatValues = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(threatId);
		    		for(current_threat_values threat_values:lstThreatValues){
		    			long currentVal = threat_values.getWhvalues_id();
		    			if(currentVal==whValueId){
		    			     currentThreat = true;
		    			     isValueAttached = true;
		    			     break;
		    				}
		    			}
		    		}
		    	for(assessing_threats_potential threats_potential:lstAssessing_threats_potential){
		    		long threatId = threats_potential.getPotential_threat_id();
		    		List<potential_threat_values> lstThreatValues = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(threatId);
		    		for(potential_threat_values threat_values:lstThreatValues){
		    			long currentVal = threat_values.getWhvalues_id();
		    			if(currentVal==whValueId){
		    				potentialThreat = true;
		    				isValueAttached = true;
		    				break;
		    				}
		    			}
		    		}
		     
		     	}
		     if(isValueAttached){
		    	 
		    	 try {
				    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
				    	 
			    	JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
			    	JSONObject cell=null;

			    	cell=JSONFactoryUtil.createJSONObject();
			    	cell.put("isValueAttached", isValueAttached);
			    	if(currentThreat && potentialThreat)
			    		cell.put("threats", "Current and Potential Threat");
			    	if(currentThreat && !potentialThreat)
			    		cell.put("threats", "Current Threat");
			    	if(!currentThreat && potentialThreat)
			    		cell.put("threats", "Potential Threat");
			    	cell.put("whValue", whValue);
			    	cell.put("valueType", "BioValue");
			    	cell.put("whValueId", whValueId);
			    	cell.put("assessmentVersionId", assessment_versionId);
			    	recordsjsonArray.put(cell);
			    	System.out.println("whValueId"+whValueId);
			    	 
			    	recordsjsonObject.put("rows",recordsjsonArray);
			    	resourceResponse.getWriter().print(recordsjsonObject.toString());
			    	} catch (Exception e) {
			    		e.printStackTrace();
			    	 
			    	}
		     	}
    	 	}
    	 if(!isValueAttached){
    		 try {
    		 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	 	JSONObject cell=null;

		    	 cell=JSONFactoryUtil.createJSONObject();
		    	 cell.put("isValueAttached", isValueAttached);
		    	 cell.put("whValueId", whValueId);
		    	 cell.put("whValue", whValue);
		    	 cell.put("valueType", "BioValue");
		    	 cell.put("assessmentVersionId", assessment_versionId);
		    	 cell.put("threats", "No Data Exist");
		    	 recordsjsonArray.put(cell);
		    	 
		    	 recordsjsonObject.put("rows",recordsjsonArray);
		    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
		    	 } catch (Exception e) {
		    		 e.printStackTrace();
		    	 
		    	 } 
    	 }
   	 	}catch (Exception e) {
		}   	
    
    
    }
    




	private String getPreviousVersion(String assessment_versionId) {
   		site_assessment_versions assessment_versions;
		try {
			assessment_versions = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(Long.parseLong(assessment_versionId));
			Double version_id = assessment_versions.getVersion_code();
	   		Double previousVersionCode=version_id-0.1;
	   		DecimalFormat df = new DecimalFormat("#.##");
	   		previousVersionCode = Double.valueOf(df.format(previousVersionCode));
	   		long previousVersionId=0;
	   		if(previousVersionCode>0){
	   			List<site_assessment_versions> lstPrevVersions = site_assessment_versionsLocalServiceUtil.findByPrevAssementCodeId(assessment_versions.getAssessment_id(),previousVersionCode);
	   			if(lstPrevVersions!=null && !lstPrevVersions.isEmpty())
	   			previousVersionId=lstPrevVersions.get(0).getAssessment_version_id();
	   		}
			return previousVersionId+"";
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}




	private void UpdateStepValidation(ResourceRequest resourceRequest,ResourceResponse resourceResponse) {
		int stepNum = Integer.parseInt(resourceRequest.getParameter("STEP_NO").toString());
		long versionId = Long.parseLong(resourceRequest.getParameter("VersionId").toString());
		boolean isStatusUpdated = false;

		String bitCode = "";
		String prevSteps = "";
		String completeSteps = "";
		String incompleteSteps = "";
		assessment_validation objAssessment_validation = null;
			
		try {
			List<assessment_whvalues> lstWhVal = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(versionId);
			List<assessing_threats_current> lstCThreat = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(versionId);
//			List<assessing_threats_potential> lstPThreat = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(versionId);
			List<threat_summary_current> lstSumCur = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(versionId);
//			List<threat_summary_potential> lstSumPot = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(versionId);
			List<threat_summary_overall> lstSumOver = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(versionId);
			List<protection_management> lstProMgmt = protection_managementLocalServiceUtil.findByAssessementVersionId(versionId);
			List<current_state_trend> lstStateTrends = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(versionId);
			List<state_trend_whvalues> lstStateTrendwhValues = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(versionId);
			List<state_trend_biodivvals> lstStateTrendbioValues = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(versionId);
			List<conservation_outlook> lstconoutlook=conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(versionId);
			List<key_conservation_issues> lstkeyconissue=key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(versionId);
			List<benefits> lstbenefit= benefitsLocalServiceUtil.getbenefitByVersion(versionId);
			List<active_conservation_projects> lstactiveconpro=active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(versionId);
			List<potential_project_needs> lstpotentialpro=potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(versionId);
			List<references> lstreferences = referencesLocalServiceUtil.findByAssessmentId(versionId);
			List<protection_mgmt_checklist_lkp> lstpromgmtchecklkp =protection_mgmt_checklist_lkpLocalServiceUtil.findAll();
			List<effective_prot_mgmt_iothreats> lsteffprotmgmtiothreat=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(versionId);
			List<prot_mgmt_overall> lstprotmgmtoverall=prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(versionId);
			List<prot_mgmt_best_practices> lstprotmgmtbestpract=prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(versionId);
			List<current_state_trend> listcurrent_state_trend= site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(versionId);
			

			
			boolean isTrends = true;
			for(current_state_trend stateTrends:lstStateTrends){
				if(stateTrends.getState_id()==0 && !stateTrends.getIs_biodiv_whval())
					isTrends=false;
			}
			// validation for step 1
			
			if(lstWhVal.size()==0)
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			// validation for step 2
			
//			if(lstCThreat.size()==0 || lstPThreat.size()==0 || lstSumCur.get(0).getThreat_rating()==0 ||lstSumPot.get(0).getThreat_rating()==0 || lstSumOver.get(0).getThreat_rating()==0)
			if(lstCThreat.size()==0 || lstSumCur.get(0).getThreat_rating()==0 || lstSumOver.get(0).getThreat_rating()==0)	
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 3
			
			if (lstProMgmt.size()!=lstpromgmtchecklkp.size()|| lsteffprotmgmtiothreat==null || lsteffprotmgmtiothreat.isEmpty()|| lstprotmgmtoverall==null || lstprotmgmtoverall.isEmpty() )
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 4
/*			if(!isTrends || lstStateTrendwhValues.isEmpty() || lstStateTrendwhValues.get(0).getState_id()==0 || lstStateTrendbioValues.isEmpty() || lstStateTrendbioValues.get(0).getState_id()==0)
*/	
			if(lstStateTrendwhValues.isEmpty() || lstStateTrendwhValues.get(0).getState_id()==0)
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 5				
			if(lstconoutlook==null   || lstconoutlook.isEmpty())
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 6
			if(lstkeyconissue==null   || lstkeyconissue.isEmpty())
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 7
			if(lstbenefit==null ||  lstbenefit.isEmpty())
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 8
			if(lstactiveconpro==null || lstactiveconpro.isEmpty()  )
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";
			
			// validation for step 9
			if(lstreferences==null || lstreferences.isEmpty() )
				bitCode = bitCode+"1";
			else
				bitCode = bitCode+"0";

			
			
//			String strBitCode = getBitCode(bitCode);
			if(bitCode.length()>0 ){
				prevSteps = getSteps(bitCode,stepNum);
				int step = 0;
				if(!prevSteps.isEmpty())
					step = Integer.parseInt(prevSteps.substring(0, 1));
				if(prevSteps.isEmpty() || step>9)	
					isStatusUpdated=true;
				completeSteps = getSteps(bitCode);
				incompleteSteps = getStepsIncomplete(bitCode);
			}
			if(stepNum==0 && !prevSteps.isEmpty() &&  Integer.parseInt(prevSteps.substring(0, 1))==1)
				prevSteps="";
			
		JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
		 try {
		    	 
	    	 	JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	 	JSONObject cell=null;
		    	 cell=JSONFactoryUtil.createJSONObject();
		    	 cell.put("isStatusUpdated", isStatusUpdated);
		    	 cell.put("Step", prevSteps);
		    	 cell.put("completeSteps", completeSteps);
		    	 cell.put("incompleteSteps", incompleteSteps);
		    	 if(prevSteps.length()>0)
		    		 cell.put("CurrentStep", prevSteps.substring(0, 1));
		    	 else if(stepNum>=9)
		    		 cell.put("CurrentStep", 1);
		    	 else
		    		 cell.put("CurrentStep", stepNum+1);
		    	 cell.put("stepNum", stepNum);
		    	 recordsjsonArray.put(cell);
		    	 recordsjsonObject.put("rows",recordsjsonArray);
		    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
		    	 } catch (Exception e) {
		    		 e.printStackTrace();
		    	 
		    	 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	private String getStepsIncomplete(String strBitCode) {
		String str = "";
		int stepnum= 0;
		for(int i=0;i<strBitCode.length();i++){
			
			int char1 = strBitCode.charAt(i);
			stepnum++;
			if(char1==49 && stepnum!= 7){
				if(str.isEmpty())
					str = stepnum+"";
				else str = str+","+stepnum;
			}
				
		}
		return str;
	}




	private String getSteps(String strBitCode) {
		String str = "";
		int stepnum= 0;
		for(int i=0;i<strBitCode.length();i++){
			
			int char1 = strBitCode.charAt(i);
			stepnum++;
			if(char1==48){
				if(str.isEmpty())
					str = stepnum+"";
				else str = str+","+stepnum;
			}
				
		}
		
		return str;
	}




	private String getSteps(String substring, int stepNum2) {
		String str = "";
		int stepnum= 0;
		for(int i=0;i<substring.length();i++){
			
			int char1 = substring.charAt(i);
			stepnum++;
			if(char1==49 && stepnum!=7){
				if(str.isEmpty())
					str = stepnum+"";
				else str = str+","+stepnum;
			}
			if(stepNum2==stepnum ||stepnum>=9 ||stepNum2==0)
				break;
				
		}
		return str;
	}




	private String getBitCode(int bitCode) {
		String str="";
		for(int i=0;bitCode>0;i++){
			int rem = bitCode%2;
			bitCode = bitCode/2;
			str = rem+str;
				
		}
		return str;
	}




	public void getValidateWHValuesData(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException
    {
    	long whValueId=ParamUtil.getLong(resourceRequest, "WHValueId");
    	String assessment_versionId = resourceRequest.getParameter("versionId");
    	
    	JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
    	boolean isValueAttached = false;
    	String whValue= "";
   	 	try{
    	 if(whValueId>0){
    		 
    		 boolean currentThreat = false;
    		 boolean potentialThreat = false;
    		 whValue = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(whValueId).getValues();
		     List<assessing_threats_current> lstAssessing_threats_current= site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(Long.parseLong(assessment_versionId));
		     List<assessing_threats_potential> lstAssessing_threats_potential= site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(Long.parseLong(assessment_versionId));
		     if(lstAssessing_threats_current!=null && lstAssessing_threats_potential!=null){
		    	for(assessing_threats_current threats_current:lstAssessing_threats_current){
		    		long threatId = threats_current.getCurrent_threat_id();
		    		List<current_threat_values> lstThreatValues = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(threatId);
		    		for(current_threat_values threat_values:lstThreatValues){
		    			long currentVal = threat_values.getWhvalues_id();
		    			if(currentVal==whValueId){
		    			     currentThreat = true;
		    			     isValueAttached = true;
		    			     break;
		    				}
		    			}
		    		}
		    	for(assessing_threats_potential threats_potential:lstAssessing_threats_potential){
		    		long threatId = threats_potential.getPotential_threat_id();
		    		List<potential_threat_values> lstThreatValues = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(threatId);
		    		for(potential_threat_values threat_values:lstThreatValues){
		    			long currentVal = threat_values.getWhvalues_id();
		    			if(currentVal==whValueId){
		    				potentialThreat = true;
		    				isValueAttached = true;
		    				break;
		    				}
		    			}
		    		}
		     
		     	}
		     if(isValueAttached){
		    	 
		    	 try {
				    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
				    	 
			    	JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
			    	JSONObject cell=null;

			    	cell=JSONFactoryUtil.createJSONObject();
			    	cell.put("isValueAttached", isValueAttached);
			    	if(currentThreat && potentialThreat)
			    		cell.put("threats", "Current and Potential Threat");
			    	if(currentThreat && !potentialThreat)
			    		cell.put("threats", "Current Threat");
			    	if(!currentThreat && potentialThreat)
			    		cell.put("threats", "Potential Threat");
			    	cell.put("whValue", whValue);
			    	cell.put("valueType", "WHValue");
			    	cell.put("whValueId", whValueId);
			    	cell.put("assessmentVersionId", assessment_versionId);
			    	recordsjsonArray.put(cell);
			    	 
			    	recordsjsonObject.put("rows",recordsjsonArray);
			    	resourceResponse.getWriter().print(recordsjsonObject.toString());
			    	} catch (Exception e) {
			    		e.printStackTrace();
			    	 
			    	}
		     	}
    	 	}
    	 if(!isValueAttached){
    		 try {
    		 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	 	JSONObject cell=null;

		    	 cell=JSONFactoryUtil.createJSONObject();
		    	 cell.put("isValueAttached", isValueAttached);
		    	 cell.put("whValueId", whValueId);
		    	 cell.put("whValue", whValue);
		    	 cell.put("valueType", "WHValue");
		    	 cell.put("assessmentVersionId", assessment_versionId);
		    	 cell.put("threats", "No Data Exist");
		    	 recordsjsonArray.put(cell);
		    	 
		    	 recordsjsonObject.put("rows",recordsjsonArray);
		    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
		    	 } catch (Exception e) {
		    		 e.printStackTrace();
		    	 
		    	 } 
    	 }
   	 	}catch (Exception e) {
		}   	
    
    
    }
    
    
    public void step1biodetails(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long bioId=ParamUtil.getLong(request,"bioId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		long assessmentVn = ParamUtil.getLong(request, "assessmentVn");
           String values = ParamUtil.getString(request, "values");
           String description = ParamUtil.getString(request, "description");
           current_state_trend objcurrent_state_trend = null;
        	biodiversity_values objbiodiversity_values = null;
        	List<current_state_trend> lstCurrentStateTrend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessmentVersionId);
        	if(bioId>0){
        		objbiodiversity_values =biodiversity_valuesLocalServiceUtil.getbiodiversity_values(bioId);
        	}else {
        		
        		objbiodiversity_values = biodiversity_valuesLocalServiceUtil.createbiodiversity_values(CounterLocalServiceUtil.increment(biodiversity_values.class.getName()));
        		objcurrent_state_trend = current_state_trendLocalServiceUtil.createcurrent_state_trend(CounterLocalServiceUtil.increment(current_state_trend.class.getName()));
        	}
        	if(objbiodiversity_values!=null){
        		objbiodiversity_values.setAssessment_version_id(assessmentVersionId);
        		objbiodiversity_values.setDescription(description);
        		objbiodiversity_values.setVn(assessmentVn);
        		objbiodiversity_values.setValue(values);
        		biodiversity_valuesLocalServiceUtil.addbiodiversity_values(objbiodiversity_values);
        	}
        	if(objcurrent_state_trend!=null){
        		
        		objcurrent_state_trend.setVn(objbiodiversity_values.getId());
        		objcurrent_state_trend.setAssessment_version_id(assessmentVersionId);
        		objcurrent_state_trend.setIs_biodiv_whval(true);
        		current_state_trendLocalServiceUtil.addcurrent_state_trend(objcurrent_state_trend);
        	}
        	
        	
        	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    
    
    public void deleteCurrentRecordFromWhValues(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
    throws PortletException, IOException {
    	      try{
    	    	  String strValueId = resourceRequest.getParameter("WHValueId").toString().trim();
    	    	  long id = Long.parseLong(strValueId);
    	    	   long assessmentVersionID = Long.parseLong(resourceRequest.getParameter("versionId"));
    	    	   boolean isDeleted = false;
    	    	   JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
    	           String tableName = resourceRequest.getParameter("tableName");
                   if(tableName.contains("WHValue")){
                	   
                	   List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(id);
                	   if(lstwhvalues_whcriterion!=null && lstwhvalues_whcriterion.size()>0){
                   			for(int i=0;i<lstwhvalues_whcriterion.size();i++){
                   				long criteria_id =lstwhvalues_whcriterion.get(i).getWh_criteria_id();
                   				assessment_whvalues_whcriterionLocalServiceUtil.deleteassessment_whvalues_whcriterion(criteria_id);
                   			}
                	   }
                   		assessment_whvaluesLocalServiceUtil.deleteassessment_whvalues(id);
                   		isDeleted=true;
                   }
                 
                   if(tableName.contains("BioValue")){
                	   biodiversity_valuesLocalServiceUtil.deletebiodiversity_values(id);	
                	   isDeleted=true;
                   }
                   if(isDeleted){
	                   List<current_state_trend> lstCurrentStateTrend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessmentVersionID);
		           	   if(lstCurrentStateTrend!=null && lstCurrentStateTrend.size()>0){
		           		   for(int i=0;i<lstCurrentStateTrend.size();i++){
		           			   long vn =lstCurrentStateTrend.get(i).getVn();
		           			   if(vn==id){
		           				   current_state_trendLocalServiceUtil.deletecurrent_state_trend(lstCurrentStateTrend.get(i));
		           			   }
		           		   }
		           	   }
		           	   List<assessing_threats_current> lstAssessing_threats_current= site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(assessmentVersionID);
		           	   if(lstAssessing_threats_current!=null){
		           		   for(assessing_threats_current threats_current:lstAssessing_threats_current){
		           			   long threatId = threats_current.getCurrent_threat_id();
		           			   List<current_threat_values> lstThreatValues = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(threatId);
		           			   for(current_threat_values threat_values:lstThreatValues){
		           				   long currentVal = threat_values.getWhvalues_id();
		           				   if(currentVal==id){
		           					   current_threat_valuesLocalServiceUtil.deletecurrent_threat_values(threat_values.getCurrent_threat_values_id());
		           				   }
		           			   }
		           		   }
		           	   }
					
		           	   List<assessing_threats_potential> lstAssessing_threats_potential= site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(assessmentVersionID);
						
						if(lstAssessing_threats_potential!=null){
						for(assessing_threats_potential threats_potential:lstAssessing_threats_potential){
							long threatId = threats_potential.getPotential_threat_id();
							List<potential_threat_values> lstThreatValues = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(threatId);
							for(potential_threat_values threat_values:lstThreatValues){
								long currentVal = threat_values.getWhvalues_id();
								if(currentVal==id){
									potential_threat_valuesLocalServiceUtil.deletepotential_threat_values(threat_values.getPotential_threat_values_id());
									}
								}
							}
						}
                   }
                   JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
                   JSONObject cell=null;
                   cell=JSONFactoryUtil.createJSONObject();
                   cell.put("isDeleted", isDeleted);
                   cell.put("versionId", assessmentVersionID);
                   recordsjsonArray.put(cell);
                   recordsjsonObject.put("rows",recordsjsonArray);
                   resourceResponse.getWriter().print(recordsjsonObject.toString());
    	       }
    	       catch(Exception ex){
    	    	   System.out.println("Ex------------"+ex.getMessage());
    	       }
    }
    
    public void deleteCurrentRecordFromTable(ActionRequest request, ActionResponse response)
    throws Exception {
    	      try{
    	    	  long id = Long.parseLong(request.getParameter("selectedPkey"));
    	    	   long assessmentVersionID = Long.parseLong(request.getParameter("assessmentVersionID"));
    	           String tableName = request.getParameter("tableName");
    	           
                   if(tableName.contains("Identifying And Describing Values")){
                	   
                	   List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(id);
                	   List<current_state_trend> lstCurrentStateTrend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessmentVersionID);
                	   if(lstwhvalues_whcriterion!=null && lstwhvalues_whcriterion.size()>0){
                   			for(int i=0;i<lstwhvalues_whcriterion.size();i++){
                   				long criteria_id =lstwhvalues_whcriterion.get(i).getWh_criteria_id();
                   				assessment_whvalues_whcriterionLocalServiceUtil.deleteassessment_whvalues_whcriterion(criteria_id);
                   			}
                	   }
                	   if(lstCurrentStateTrend!=null && lstCurrentStateTrend.size()>0){
                  			for(int i=0;i<lstCurrentStateTrend.size();i++){
                  				long vn =lstCurrentStateTrend.get(i).getVn();
                  				if(vn==id){
                  					current_state_trendLocalServiceUtil.deletecurrent_state_trend(lstCurrentStateTrend.get(i));
                  				}
                  			}
                	   }
                   		assessment_whvaluesLocalServiceUtil.deleteassessment_whvalues(id);
                   }
                   if(tableName.contains("Other Important Biodiversity Values")){
                	   
                   		biodiversity_valuesLocalServiceUtil.deletebiodiversity_values(id);
                   }
                   if(tableName.contains("Current Threats")){
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
                   if(tableName.contains("Potential Threats")){
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
                   
                   
                   if(tableName.contains("Conservation Projects Needs")){
                   		active_conservation_projectsLocalServiceUtil.deleteactive_conservation_projects(id);
                   }
                  
                   
                   if(tableName.contains("Key Conservation Issues")){
                   	   key_conservation_issuesLocalServiceUtil.deletekey_conservation_issues(id);
                   	   
                   	    }
                   
                   
                   if(tableName.contains("potential project needs")){
                   		potential_project_needsLocalServiceUtil.deletepotential_project_needs(id);
                   }
                  
                   
                   if(tableName.contains("References")){
                  		
                	   referencesLocalServiceUtil.deletereferences(id);
                  }
                 
                   
                   if(tableName.contains("Understanding Benefits")){
                  	 List<benefits_type_ref> listbenefittype =benefits_type_refLocalServiceUtil.findByBenefitsId(id);
                  	   
                  	   for(benefits_type_ref typeref:listbenefittype)
                  	   {
                  		
                  		   benefits_type_refLocalServiceUtil.deletebenefits_type_ref(typeref);
                  	   }
                    		benefitsLocalServiceUtil.deletebenefits(id);
                    }
                   if(tableName.contains("References"))
                   {
                	   
                	 List<references> listreftype=referencesLocalServiceUtil.findByAssessmentId(id) ;
                	 
                	 
                   }
                   
    	       }
    	       catch(Exception ex){
    	    	   System.out.println("Ex------------"+ex.getMessage());
    	       }
    }
	  
    public void updatestep2PotentialThreat(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long potentialThreatId=ParamUtil.getLong(request,"potentialThreatId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		long[] threatSubCategory = ParamUtil.getLongValues(request, "threatSubCategory");
    		String description = ParamUtil.getString(request, "currentThreat");
    		long currentAssessment = ParamUtil.getLong(request, "currentAssessment");
    		boolean insideSite = ParamUtil.getBoolean(request, "insideSite");
    		boolean outsideSite = ParamUtil.getBoolean(request, "outsideSite");
    		long[] valuesAffectedwh = ParamUtil.getLongValues(request, "valueAffectedwh");
    		long[] valuesAffectedbio = ParamUtil.getLongValues(request, "valueAffectedbio");
    		String justification = ParamUtil.getString(request, "justification");

        	assessing_threats_potential objassessing_threats_potential = null;
        	potential_threat_assessment_cat objpotential_threat_assessment_cat = null;
        	potential_threat_values objpotential_threat_values = null;
        	
        	if(potentialThreatId>0){
        		objassessing_threats_potential = assessing_threats_potentialLocalServiceUtil.getassessing_threats_potential(potentialThreatId);
        	}else{
        		objassessing_threats_potential = assessing_threats_potentialLocalServiceUtil.createassessing_threats_potential(CounterLocalServiceUtil.increment(assessing_threats_potential.class.getName()));
        		potentialThreatId = objassessing_threats_potential.getPotential_threat_id();
        	}
        	if(objassessing_threats_potential!=null){
        		objassessing_threats_potential.setAssessment_version_id(assessmentVersionId);
        		objassessing_threats_potential.setInside_site(insideSite);
        		objassessing_threats_potential.setOutside_site(outsideSite);
        		objassessing_threats_potential.setJustification(justification);
        		objassessing_threats_potential.setPotential_threat(description);
        		objassessing_threats_potential.setThreat_rating(currentAssessment);
        		
        		assessing_threats_potentialLocalServiceUtil.addassessing_threats_potential(objassessing_threats_potential);
        	}
        	List<potential_threat_assessment_cat> lstPotrentailThreatAssessmentCat = site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(potentialThreatId);
        	List<potential_threat_values> lstPotentialThreatValues = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(potentialThreatId);
        	if(lstPotrentailThreatAssessmentCat!=null){
        		for(potential_threat_assessment_cat potentialCat:lstPotrentailThreatAssessmentCat){
        			potential_threat_assessment_catLocalServiceUtil.deletepotential_threat_assessment_cat(potentialCat);
        		}
        		for(long subCat:threatSubCategory){
        			threat_subcategories_lkp subCategory = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(subCat);
        			objpotential_threat_assessment_cat = potential_threat_assessment_catLocalServiceUtil.createpotential_threat_assessment_cat(CounterLocalServiceUtil.increment(potential_threat_assessment_cat.class.getName()));
        			objpotential_threat_assessment_cat.setPotential_threat_id(potentialThreatId);
        			objpotential_threat_assessment_cat.setSub_cat_id(subCat);
        			objpotential_threat_assessment_cat.setCategory_id(subCategory.getParent_id());
        			potential_threat_assessment_catLocalServiceUtil.addpotential_threat_assessment_cat(objpotential_threat_assessment_cat);
        			
        		}
        	}
        	
        	if(lstPotentialThreatValues!=null){
        		for(potential_threat_values potentialVal:lstPotentialThreatValues){
        			potential_threat_valuesLocalServiceUtil.deletepotential_threat_values(potentialVal);
        		}
        		for(long whVal:valuesAffectedwh){
        			objpotential_threat_values = potential_threat_valuesLocalServiceUtil.createpotential_threat_values(CounterLocalServiceUtil.increment(potential_threat_values.class.getName()));
        			objpotential_threat_values.setPotential_threat_id(potentialThreatId);
        			objpotential_threat_values.setWhvalues_id(whVal);
        			objpotential_threat_values.setIs_biodiv_whval(false);
        			potential_threat_valuesLocalServiceUtil.addpotential_threat_values(objpotential_threat_values);
        			
        		}
        		for(long whVal:valuesAffectedbio){
        			objpotential_threat_values = potential_threat_valuesLocalServiceUtil.createpotential_threat_values(CounterLocalServiceUtil.increment(potential_threat_values.class.getName()));
        			objpotential_threat_values.setPotential_threat_id(potentialThreatId);
        			objpotential_threat_values.setWhvalues_id(whVal);
        			objpotential_threat_values.setIs_biodiv_whval(true);
        			potential_threat_valuesLocalServiceUtil.addpotential_threat_values(objpotential_threat_values);
        			
        		}
        	}
        	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    public void updatestep2CurrentThreat(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long currentThreatId=ParamUtil.getLong(request,"currentThreatId");
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		long[] threatSubCategory = ParamUtil.getLongValues(request, "threatSubCategory");
    		String description = ParamUtil.getString(request, "currentThreat");
    		long currentAssessment = ParamUtil.getLong(request, "currentAssessment");
    		boolean insideSite = ParamUtil.getBoolean(request, "insideSite");
    		boolean outsideSite = ParamUtil.getBoolean(request, "outsideSite");
    		long[] valuesAffectedwh = ParamUtil.getLongValues(request, "valueAffectedwh");
    		long[] valuesAffectedbio = ParamUtil.getLongValues(request, "valueAffectedbio");
    		String justification = ParamUtil.getString(request, "justification");
        	assessing_threats_current objassessing_threats_current = null;
        	current_threat_assessment_cat objcurrent_threat_assessment_cat = null;
        	current_threat_values objcurrent_threat_values = null;
        	
        	if(currentThreatId>0){
        		objassessing_threats_current = assessing_threats_currentLocalServiceUtil.getassessing_threats_current(currentThreatId);
        	}else{
        		objassessing_threats_current = assessing_threats_currentLocalServiceUtil.createassessing_threats_current(CounterLocalServiceUtil.increment(assessing_threats_current.class.getName()));
        		currentThreatId = objassessing_threats_current.getCurrent_threat_id();
        	}
        	if(objassessing_threats_current!=null){
        		objassessing_threats_current.setAssessment_version_id(assessmentVersionId);
        		objassessing_threats_current.setInside_site(insideSite);
        		objassessing_threats_current.setOutside_site(outsideSite);
        		objassessing_threats_current.setJustification(justification);
        		objassessing_threats_current.setCurrent_threat(description);
        		objassessing_threats_current.setThreat_rating_id(currentAssessment);
        		
        		assessing_threats_currentLocalServiceUtil.addassessing_threats_current(objassessing_threats_current);
        	}
        	List<current_threat_assessment_cat> lstCurrentThreatAssessmentCat = site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(currentThreatId);
        	List<current_threat_values> lstCurrentThreatValues = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(currentThreatId); 
        	if(lstCurrentThreatAssessmentCat!=null){
        		for(current_threat_assessment_cat currentCat:lstCurrentThreatAssessmentCat){
        			current_threat_assessment_catLocalServiceUtil.deletecurrent_threat_assessment_cat(currentCat);
        		}
        		for(long subCat:threatSubCategory){
        			threat_subcategories_lkp subCategory = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(subCat);
        			objcurrent_threat_assessment_cat = current_threat_assessment_catLocalServiceUtil.createcurrent_threat_assessment_cat(CounterLocalServiceUtil.increment(current_threat_assessment_cat.class.getName()));
        			objcurrent_threat_assessment_cat.setCurrent_threat_id(currentThreatId);
        			objcurrent_threat_assessment_cat.setSub_cat_id(subCat);
        			objcurrent_threat_assessment_cat.setCategory_id(subCategory.getParent_id());
        			current_threat_assessment_catLocalServiceUtil.addcurrent_threat_assessment_cat(objcurrent_threat_assessment_cat);
        			
        		}
        	}
        	
        	if(lstCurrentThreatValues!=null){
        		for(current_threat_values currentVal:lstCurrentThreatValues){
        			current_threat_valuesLocalServiceUtil.deletecurrent_threat_values(currentVal);
        		}
        		for(long whVal:valuesAffectedwh){
        			objcurrent_threat_values = current_threat_valuesLocalServiceUtil.createcurrent_threat_values(CounterLocalServiceUtil.increment(current_threat_values.class.getName()));
        			objcurrent_threat_values.setCurrent_threat_id(currentThreatId);
        			objcurrent_threat_values.setWhvalues_id(whVal);
        			objcurrent_threat_values.setIs_biodiv_whval(false);
        			current_threat_valuesLocalServiceUtil.addcurrent_threat_values(objcurrent_threat_values);
        			
        		}
        		for(long whVal:valuesAffectedbio){
        			objcurrent_threat_values = current_threat_valuesLocalServiceUtil.createcurrent_threat_values(CounterLocalServiceUtil.increment(current_threat_values.class.getName()));
        			objcurrent_threat_values.setCurrent_threat_id(currentThreatId);
        			objcurrent_threat_values.setWhvalues_id(whVal);
        			objcurrent_threat_values.setIs_biodiv_whval(true);
        			current_threat_valuesLocalServiceUtil.addcurrent_threat_values(objcurrent_threat_values);
        			
        		}
        	}
        	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    public void updateStep2overallThreat(ActionRequest request, ActionResponse response)
    throws Exception{
    	
    	try{
    		long assessmentVersionId=ParamUtil.getLong(request, "assessmentVersionId");
    		String threatType = ParamUtil.getString(request, "threatType");
    		long currentAssessment = ParamUtil.getLong(request, "currentAssessment");
    		String justification = ParamUtil.getString(request, "justification");
    		long threatSummaryId = ParamUtil.getLong(request, "threatSummaryId");
    		if(threatSummaryId>0){
    		if(threatType.equalsIgnoreCase("current")){
    			threat_summary_current objthreat_summary_current = threat_summary_currentLocalServiceUtil.getthreat_summary_current(threatSummaryId);
    			if(objthreat_summary_current!=null){
    				objthreat_summary_current.setAssessment_version_id(assessmentVersionId);
    				objthreat_summary_current.setOverall_current(justification);
    				objthreat_summary_current.setThreat_rating(currentAssessment);
    				threat_summary_currentLocalServiceUtil.addthreat_summary_current(objthreat_summary_current);
    			}
    		}else if(threatType.equalsIgnoreCase("potential")){
    			threat_summary_potential objthreat_summary_potential = threat_summary_potentialLocalServiceUtil.getthreat_summary_potential(threatSummaryId);
    			if(objthreat_summary_potential!=null){
    				objthreat_summary_potential.setAssessment_version_id(assessmentVersionId);
    				objthreat_summary_potential.setOverall_potential(justification);
    				objthreat_summary_potential.setThreat_rating(currentAssessment);
    				threat_summary_potentialLocalServiceUtil.addthreat_summary_potential(objthreat_summary_potential);
    			}
    		}else if(threatType.equalsIgnoreCase("overall")){
    			threat_summary_overall objthreat_summary_overall = threat_summary_overallLocalServiceUtil.getthreat_summary_overall(threatSummaryId);
    			if(objthreat_summary_overall!=null){
    				objthreat_summary_overall.setAssessment_version_id(assessmentVersionId);
    				objthreat_summary_overall.setOverall_threat(justification);
    				objthreat_summary_overall.setThreat_rating(currentAssessment);
    				threat_summary_overallLocalServiceUtil.addthreat_summary_overall(objthreat_summary_overall);
    			}
    		}
    		}else{

        		if(threatType.equalsIgnoreCase("current")){
        			threat_summary_current objthreat_summary_current = threat_summary_currentLocalServiceUtil.createthreat_summary_current(CounterLocalServiceUtil.increment(threat_summary_current.class.getName()));
            			if(objthreat_summary_current!=null){
            				objthreat_summary_current.setAssessment_version_id(assessmentVersionId);
            				objthreat_summary_current.setOverall_current(justification);
            				objthreat_summary_current.setThreat_rating(currentAssessment);
            				threat_summary_currentLocalServiceUtil.addthreat_summary_current(objthreat_summary_current);
            			}
        			
        		}else if(threatType.equalsIgnoreCase("potential")){
        			threat_summary_potential objthreat_summary_potential = threat_summary_potentialLocalServiceUtil.createthreat_summary_potential(CounterLocalServiceUtil.increment(threat_summary_potential.class.getName()));
            			if(objthreat_summary_potential!=null){
            				objthreat_summary_potential.setAssessment_version_id(assessmentVersionId);
            				objthreat_summary_potential.setOverall_potential(justification);
            				objthreat_summary_potential.setThreat_rating(currentAssessment);
            				threat_summary_potentialLocalServiceUtil.addthreat_summary_potential(objthreat_summary_potential);
            			}
        		}else if(threatType.equalsIgnoreCase("overall")){
        			threat_summary_overall objthreat_summary_overall = threat_summary_overallLocalServiceUtil.createthreat_summary_overall(CounterLocalServiceUtil.increment(threat_summary_overall.class.getName()));
            			if(objthreat_summary_overall!=null){
            				objthreat_summary_overall.setAssessment_version_id(assessmentVersionId);
            				objthreat_summary_overall.setOverall_threat(justification);
            				objthreat_summary_overall.setThreat_rating(currentAssessment);
            				threat_summary_overallLocalServiceUtil.addthreat_summary_overall(objthreat_summary_overall);
            			}
        		}
        		
    		}
        	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    //------------------------------------dashboard action-----------------
	public void fillAssessmentAction(ActionRequest request,
			ActionResponse response) throws Exception {
		//List<Role> lst=RoleServiceUtil.getUserRoles(79120);
		try{
			AssessmentWorkflowAction.fillAssessmentAction(request, response);
		}
		catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.sendRedirect("/web/iucn/assessment");
		}
	}

	// Assign assessor
	public void updateAssessor(ActionRequest request, ActionResponse response)
			throws Exception {
		try{
		AssessmentWorkflowAction.assigneAssessor(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.sendRedirect("/web/iucn/assessment");
		}

	}

	// update base language
	public void updateBaseLanguage(ActionRequest request,
			ActionResponse response) throws Exception {
		try{
		AssessmentWorkflowAction.baseLanguageAction(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.sendRedirect("/web/iucn/assessment");
		}
	}

	public void reviewAssessmentAction(ActionRequest request,
			ActionResponse response) throws Exception {
		try{
		AssessmentWorkflowAction.reviewAssessmentAction(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.sendRedirect("/web/iucn/assessment");
		}
	}

	public void approveAssessmentAction(ActionRequest request,
			ActionResponse response) throws Exception {
		try{
		AssessmentWorkflowAction.approveAssessmentAction(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.sendRedirect("/web/iucn/assessment");
		}
	}

	public void publishAssessmentAction(ActionRequest request,
			ActionResponse response) throws Exception {
		try{
		AssessmentWorkflowAction.publishAssessmentAction(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.sendRedirect("/web/iucn/assessment");
		}
	}
	
	public void unPublishAssessmentAction(ActionRequest request,
			ActionResponse response) throws Exception {
		try{
		AssessmentWorkflowAction.unPublishAssessmentAction(request, response);
		}catch(Exception ex){
			ex.printStackTrace();
			SessionErrors.add(request, "error-assessment");
			response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
			response.setWindowState(LiferayWindowState.NORMAL);
		}
	}
	
	 public void viewAssessmentAction(ActionRequest request, ActionResponse response)
	    throws Exception {
		 try{
		 AssessmentWorkflowAction.viewAssessmentAction(request, response);
		 }catch(Exception ex){
				ex.printStackTrace();
				SessionErrors.add(request, "error-assessment");
				response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
				response.setWindowState(LiferayWindowState.NORMAL);
			}
	}
	 
	 public void editPublishesAssessmentAction(ActionRequest request, ActionResponse response)
	    throws Exception {
		 try{
		 AssessmentWorkflowAction.editPublishesAssessmentAction(request, response);
		 }catch(Exception ex){
				ex.printStackTrace();
				SessionErrors.add(request, "error-assessment");
				response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
				response.setWindowState(LiferayWindowState.NORMAL);
			}
	}
	 
	 public void updateReviewer(ActionRequest request, ActionResponse response) throws Exception {
		 try{
		 AssessmentWorkflowAction.assigneReviewer(request, response);
		 }catch(Exception ex){
				ex.printStackTrace();
				SessionErrors.add(request, "error-assessment");
				response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
				response.setWindowState(LiferayWindowState.NORMAL);
			}
	 }
	 
	 public void assigneTranslator(ActionRequest request, ActionResponse response) throws Exception {
		 try{
		 AssessmentWorkflowAction.assigneTranslator(request, response);
		 }catch(Exception ex){
				ex.printStackTrace();
				SessionErrors.add(request, "error-assessment");
				response.setRenderParameter("jspPage", "/assessment_dashboard.jsp");
				response.setWindowState(LiferayWindowState.NORMAL);
			}
	 }
	 
	 
	 public void translationCompleateAction(ActionRequest request,
				ActionResponse response) throws Exception {
		 try{
			AssessmentWorkflowAction.translationCompleateAction(request, response);
		 }catch(Exception ex){
				ex.printStackTrace();
				SessionErrors.add(request, "error-assessment");
				response.setRenderParameter("jspPage", "/view.jsp");
				response.setWindowState(LiferayWindowState.NORMAL);
			}
		}
	 
	 
	 public void fillFromPrevAssessmentAction(ActionRequest request,
				ActionResponse response) throws Exception {
			//List<Role> lst=RoleServiceUtil.getUserRoles(79120);
		 try{
			AssessmentWorkflowAction.fillFromPrevAssessmentAction(request, response);
		 }catch(Exception ex){
				ex.printStackTrace();
				SessionErrors.add(request, "error-assessment");
				response.setRenderParameter("jspPage", "/view.jsp");
				response.setWindowState(LiferayWindowState.NORMAL);
			}
		}
   //--------------------------------------dashboard action end here---------
	
	public void addmngtoverall(ActionRequest request, ActionResponse response)
			throws Exception {
		try {

			long assessmentversion_id = ParamUtil.getLong(request,
					"assessmentVersionId");
			long prot_manag = ParamUtil.getLong(request,
					"protection_managementId");

			String justification = ParamUtil
					.getString(request, "justification");
			long rating = ParamUtil.getLong(request, "assessmentratings");

			prot_mgmt_overall objoverall = null;

			if (assessmentversion_id > 0) {

				if (prot_manag > 0) {
					objoverall = prot_mgmt_overallLocalServiceUtil
							.getprot_mgmt_overall(prot_manag);
				} else {
					objoverall = prot_mgmt_overallLocalServiceUtil
							.createprot_mgmt_overall(CounterLocalServiceUtil
									.increment(prot_mgmt_overall.class
											.getName()));

				}

				if (objoverall != null) {

					objoverall.setAssessment_version_id(assessmentversion_id);
					objoverall.setJustification(justification);
					objoverall.setRating(rating);

					prot_mgmt_overallLocalServiceUtil
							.addprot_mgmt_overall(objoverall);
				}
			}
		} catch (Exception ex) {
			System.out.println("ex---------" + ex.getCause());
			ex.getCause();
		}
	}
	
	public void addprotectionmngtIoThreats(ActionRequest request,
			ActionResponse response) throws Exception {

		try {

			long assessmentversion_id = ParamUtil.getLong(request,
					"assessmentVersionId");
			long prot_manag = ParamUtil.getLong(request,
					"protection_managementId");
			String justification = ParamUtil
					.getString(request, "justification");
			long rating = ParamUtil.getLong(request, "assessmentratings");

			effective_prot_mgmt_iothreats objiothreats = null;

			if (assessmentversion_id > 0) {

				if (prot_manag > 0) {
					objiothreats = effective_prot_mgmt_iothreatsLocalServiceUtil
							.geteffective_prot_mgmt_iothreats(prot_manag);
				} else {
					objiothreats = effective_prot_mgmt_iothreatsLocalServiceUtil
							.createeffective_prot_mgmt_iothreats(CounterLocalServiceUtil
									.increment(effective_prot_mgmt_iothreats.class
											.getName()));

				}

				if (objiothreats != null) {

					objiothreats.setAssessment_version_id(assessmentversion_id);
					objiothreats.setJustification(justification);
					objiothreats.setRating(rating);

					effective_prot_mgmt_iothreatsLocalServiceUtil
							.addeffective_prot_mgmt_iothreats(objiothreats);
				}
			}
		} catch (Exception ex) {
			System.out.println("ex---------" + ex.getCause());
			ex.getCause();
		}
	}
	
	public void addbestpractices(ActionRequest request, ActionResponse response)
			throws Exception {

		try {

			long assessmentversion_id = ParamUtil.getLong(request,
					"assessmentVersionId");
			long prot_manag = ParamUtil.getLong(request,
					"protection_managementId");

			String desciption = ParamUtil.getString(request, "description");

			prot_mgmt_best_practices objbestpractices = null;

			if (assessmentversion_id > 0) {
				if (prot_manag > 0) {
					objbestpractices = prot_mgmt_best_practicesLocalServiceUtil
							.getprot_mgmt_best_practices(prot_manag);
				} else {
					objbestpractices = prot_mgmt_best_practicesLocalServiceUtil
							.createprot_mgmt_best_practices(CounterLocalServiceUtil
									.increment(prot_mgmt_best_practices.class
											.getName()));

				}

				if (objbestpractices != null) {

					objbestpractices
							.setAssessment_version_id(assessmentversion_id);
					objbestpractices.setDescription(desciption);

					prot_mgmt_best_practicesLocalServiceUtil
							.addprot_mgmt_best_practices(objbestpractices);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	public void referencedetails(ActionRequest request, ActionResponse response)
			throws Exception {

		try {

			long assessmentversion_id = ParamUtil.getLong(request,
					"assessmentVersionId");
			long prot_manag = ParamUtil.getLong(request, "referenceID");

			String subcategory = ParamUtil.getString(request, "referencesub");
			long refrenceRN = ParamUtil.getLong(request, "referencern");

			references objbreferences = null;

			if (assessmentversion_id > 0) {
				if (prot_manag > 0) {
					objbreferences = referencesLocalServiceUtil
							.getreferences(prot_manag);
				} else {
					objbreferences = referencesLocalServiceUtil
							.createreferences(CounterLocalServiceUtil
									.increment(references.class.getName()));
					// createprot_mgmt_best_practices(CounterLocalServiceUtil.increment(prot_mgmt_best_practices.class.getName()));
				}

				if (objbreferences != null) {

					objbreferences
							.setAssessment_version_id(assessmentversion_id);
					objbreferences.setRn(refrenceRN);
					objbreferences.setReferences(subcategory);

					referencesLocalServiceUtil.addreferences(objbreferences);
				}
			}
		} catch (Exception ex) {
			System.out.println("ex---------" + ex.getCause());
			ex.getCause();
		}
	}
	
	 public void addprotectionmngt(ActionRequest request, ActionResponse response)
	    throws Exception {
	    	try{    		
	           	long version_id = ParamUtil.getLong(request, "assessmentVersionId");     	
	           long prot_manag 	  = ParamUtil.getLong(request,"protection_managementId");       
	           long topic=ParamUtil.getLong(request,"topicId");       
	           long rating=ParamUtil.getLong(request,"assessmentratings");
	           String justification=ParamUtil.getString(request,"justification");
	           
	        	 protection_management objpromngt = null;
	        	
	        	if(version_id>0){
	        		if(prot_manag >0){
	        			objpromngt=protection_managementLocalServiceUtil.getprotection_management(prot_manag);
	        		}else{
	        			objpromngt=protection_managementLocalServiceUtil.createprotection_management(CounterLocalServiceUtil.increment(protection_management.class.getName()));
	        		}
	        		
	        		if(objpromngt!=null){
	        			objpromngt.setAssessment_version_id(version_id);
	        			objpromngt.setJustification(justification);
	        			objpromngt.setRating(rating);
	        			objpromngt.setTopic_id(topic);
	        			protection_managementLocalServiceUtil.addprotection_management(objpromngt);
	        		}
	        	}
	    	}catch(Exception ex){
	    		System.out.println("ex---------"+ex.getCause()); 
	    		ex.getCause();
	    	}
	    }  
	    
	 
	 	
	 public void submitForReviewAction(ActionRequest request,
				ActionResponse response) throws Exception {
			AssessmentWorkflowAction.submitForReviewAction(request, response);
		}
	 public void reviewCompletedAction(ActionRequest request,
				ActionResponse response) throws Exception {
			AssessmentWorkflowAction.reviewCompletedAction(request, response);
		}
	 
	 public void translateAssessmentAction(ActionRequest request,
				ActionResponse response) throws Exception {
			AssessmentWorkflowAction.translateAssessmentAction(request, response);
		}
	 public void translationStartAction(ActionRequest request,
				ActionResponse response) throws Exception {
			AssessmentWorkflowAction.translationStartAction(request, response);
	 }
	

	 // deleteassessmentAction added by kamal Upreti 
	 
	 public void deleteassessmentAction(ActionRequest request,
				ActionResponse response) throws Exception {
		 try{
		 AssessmentDelete.deleteasscessmentAction(request, response);
		 }catch(Exception ex)
		 {
			 ex.printStackTrace();
			 SessionErrors.add(request, "error-assessment");
			 response.sendRedirect("/web/iucn/assessment");

		 }
	 }

}
    





