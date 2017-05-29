<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="/siteinfo_jsp/init.jsp" %>

<% 

  List<assessing_threats_potential> lstpotential_threats=null;
  
  benefit_checktype_lkp lstchecktype_lkp=null;
  List<benefits> lstbenefits=null;
  long assessment_versionid=0;
  
  try{
	assessment_versionid=Long.parseLong(request.getAttribute("versionId").toString());
    lstpotential_threats=assessing_threats_potentialLocalServiceUtil.getEntriesByAssessmentVersionId(assessment_versionid); 
    
    
    lstbenefits=benefitsLocalServiceUtil.getbenefitByVersion(assessment_versionid);        
    long benefit_id=0;
    if(lstbenefits!=null && lstbenefits.size()>0){
    	benefit_id=lstbenefits.get(0).getSelected_benefit();
    	lstchecktype_lkp=benefit_checktype_lkpLocalServiceUtil.getbenefit_checktype_lkp(benefit_id); 
        request.setAttribute("lstchecktype_lkp", lstchecktype_lkp);
    }
    //lstpotential_threats.get(0).getPotential_threat();
  }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
    
  