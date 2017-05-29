package com.iucn.whp.sites.portlet;

import com.iucn.whp.dbservice.model.*;
import com.iucn.whp.dbservice.service.*;
import com.iucn.whp.sites.utils.SiteSearchUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.util.ImageProcessorUtil;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Saurabh.Mehta
 *
 */
/**
 * @author Saurabh.Mehta
 *
 */
public class siteAdminPortlet extends MVCPortlet{

	
    /**
     * This Action adds a product to the database.
     *
     * @param request
     * @param response
     * @throws java.lang.Exception
     */
	public DateFormat serverDate = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
    public void addSite(ActionRequest request, ActionResponse response)
        throws Exception {

        /*ThemeDisplay themeDisplay =
            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        whp_sites product = ActionUtil.productFromRequest(request);
        ArrayList<String> errors = new ArrayList<String>();

        if (ProdRegValidator.validateProduct(product, errors)) {
            PRProductLocalServiceUtil.addProduct(
                product, themeDisplay.getUserId());
            SessionMessages.add(request, "product-saved-successfully");
        }
        else {
            SessionErrors.add(request, "fields-required");
        }*/
    }

    /**
     * This Action gets a product from the database and puts it into the
     * request. It also sets the "jspPage" parameter to "editProduct" so that
     * processing is forwarded to edit_product.jsp.
     *
     * @param request
     * @param response
     * @throws java.lang.Exception
     */

    public void editSite(ActionRequest request, ActionResponse response)
        throws Exception {

        long siteId = ParamUtil.getLong(request, "resourcePrimKey");
        System.out.println("site"+siteId);
        //if (Validator.isNotNull(productKey)) {
        String mode=ParamUtil.getString(request, "mode");
            whp_sites site =
                whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);
            request.setAttribute("siteId", siteId);
            request.setAttribute("mode", mode);
            response.setRenderParameter("jspPage", editSiteJSP);
            
            
           
        //}
    }

    public void editSiteInscriptionDate(ActionRequest request, ActionResponse response)
    throws Exception {

    long selectedPkey = ParamUtil.getLong(request, "resourcePrimKey");
    //System.out.println("site"+siteId);
    //if (Validator.isNotNull(productKey)) {
        
    whp_sites_inscription_date currentInscriptionDate = whp_sites_inscription_dateLocalServiceUtil.getwhp_sites_inscription_date(selectedPkey);
    	System.out.println("Alok-----------------------:" + currentInscriptionDate.getSite_id());
    	System.out.println("Alok-----------------------:" + currentInscriptionDate.getInscription_type_id());
    	System.out.println("Alok-----------------------:" + currentInscriptionDate.getWhp_sites_inscription_date_id());
        request.setAttribute("currentInscriptionDate", currentInscriptionDate);
        response.setRenderParameter("jspPage", editInscriptionHistoryJSP);
        
       
    //}
}
   

    public void EditInscriptionHistory(ActionRequest request, ActionResponse response)
    throws Exception {
    	
    	long siteId=ParamUtil.getLong(request, "siteID");
    	whp_sites_inscription_date objwhp_sites_inscription_date=null;
    	try{
    		
    		long inscDateId = ParamUtil.getLong(request, "inscriptionDateId");
    		int inscriptionType = ParamUtil.getInteger(request, "inscriptionType");
    		String strDate = ParamUtil.getString(request, "inscriptionDate1");
    		String referenceNo = ParamUtil.getString(request, "referenceNo");
    		
    	 	String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
  	        int monthstr=Integer.parseInt(month)+1;
  	        String Dobmon=String.valueOf(monthstr);
  	        
  	        
  	        String date= day+"/"+Dobmon+"/"+year;
  	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
  	        Date inscriptionDate = formatter1.parse(date);
  	      
  	        
    		
/*    		Date inscriptionDate= serverDate.parse(serverDate.format(formDate.parse(strDate)));
*/
    		if(inscDateId>0){
    		 objwhp_sites_inscription_date = whp_sites_inscription_dateLocalServiceUtil.getwhp_sites_inscription_date(inscDateId);
    		}
    		else{
    			objwhp_sites_inscription_date=whp_sites_inscription_dateLocalServiceUtil.createwhp_sites_inscription_date(CounterLocalServiceUtil.increment(whp_sites_inscription_date.class.getName()));
    		}
    		
            objwhp_sites_inscription_date.setInscription_type_id(inscriptionType);
        	objwhp_sites_inscription_date.setInscription_date(inscriptionDate);
        	objwhp_sites_inscription_date.setReference_no(referenceNo);
        	objwhp_sites_inscription_date.setSite_id(siteId);
    		whp_sites_inscription_dateLocalServiceUtil.addwhp_sites_inscription_date(objwhp_sites_inscription_date);
    	}catch(Exception ex){
    		System.out.println("exx------"+ex.getMessage());
    	}

     }

    
    

    
    
    public void viewSiteCountry(ActionRequest request, ActionResponse response)
    throws Exception {

    long siteId = ParamUtil.getLong(request, "resourcePrimKey");
    System.out.println("site"+siteId);
        whp_sites site =
            whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);
        request.setAttribute("siteidtest", siteId);
        response.setRenderParameter("jspPage", editSiteJSP);
        
       
}
    

    /**
     * This Action deletes a product from the database.
     *
     * @param request
     * @param response
     * @throws java.lang.Exception
     */
    public void deleteSite(ActionRequest request, ActionResponse response)
    throws Exception {

    long siteID = ParamUtil.getLong(request, "resourcePrimKey");
    if(siteID!=0){
    	whp_sites objwhp_sites=whp_sitesLocalServiceUtil.getSiteBySiteId(siteID);
        objwhp_sites.setActive(false);
        whp_sitesLocalServiceUtil.addwhp_sites(objwhp_sites);
        response.setRenderParameter("jspPage", "/view.jsp");
        response.setWindowState(LiferayWindowState.NORMAL);
        List<whp_sites> lstSiteName = whp_sitesLocalServiceUtil.getAllActiveSites();
        List<String> lststrSiteName = new ArrayList<String>();
        String[] strArray = new String[lstSiteName.size()+1];
        String strdefaultData = "Select Site";
        strArray[0] = strdefaultData;
        if(lstSiteName!=null){
			for(int i=0;i<lstSiteName.size();i++){
				long siteid = lstSiteName.get(i).getSite_id();
				lststrSiteName.add(whp_sitesLocalServiceUtil.getSiteBySiteId(siteid).getName_en());
			}
		}
		Collections.sort(lststrSiteName);
		if(!lststrSiteName.isEmpty()){
			for(int i=0;i<lststrSiteName.size();i++){
				strArray[i+1] = lststrSiteName.get(i);
			}
		}
		
		ExpandoColumnLocalServiceUtil.updateColumn(11309, "Site", 16,strArray );
    }
    
}


 
    /**
     * This Action deletes a product from the database.
     *
     * @param request
     * @param response
     * @throws java.lang.Exception
     */
    public void advanceSiteSearch(ActionRequest request, ActionResponse response)
        throws Exception {
    	String test=request.getParameter("Prefix");
        long siteID = ParamUtil.getLong(request, "resourcePrimKey");
        System.out.println("test---------"+test);
    }
    
    
    public void addSiteInscriptionCriteria(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		int criteria=ParamUtil.getInteger(request,"criteriaID");
    		long inscriptionCriteriaId=ParamUtil.getLong(request, "inscriptionCriteriaId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	boolean natural = false;
           	boolean cultural = false;
        	whp_sites_inscription_criteria objwhp_sites_inscription_criteria = null;
        	List<inscription_criteria_lkp> lstSiteCriteria=null;
        	lstSiteCriteria=whp_sitesLocalServiceUtil.getInscriptionBySiteId(siteID);
        	if(lstSiteCriteria.size()>1){
    			for(int i=0;i<lstSiteCriteria.size();i++){
    				if(lstSiteCriteria.get(i).getCriteria_id()==criteria)
    					return;
    			}
        	}else lstSiteCriteria=null;
        	if(inscriptionCriteriaId>0){
        		objwhp_sites_inscription_criteria =whp_sites_inscription_criteriaLocalServiceUtil.getwhp_sites_inscription_criteria(inscriptionCriteriaId);
        	
        	}else {
        		
        		objwhp_sites_inscription_criteria = whp_sites_inscription_criteriaLocalServiceUtil.createwhp_sites_inscription_criteria(CounterLocalServiceUtil.increment(whp_sites_inscription_criteria.class.getName()));
        	}
        	if(objwhp_sites_inscription_criteria!=null){
        		
        		objwhp_sites_inscription_criteria.setCriteria_id(criteria);
        		objwhp_sites_inscription_criteria.setSite_id(siteID);
            	whp_sites_inscription_criteriaLocalServiceUtil.addwhp_sites_inscription_criteria(objwhp_sites_inscription_criteria);
            	
            	// Code for update Site Mixed status update
            	
            	lstSiteCriteria=whp_sitesLocalServiceUtil.getInscriptionBySiteId(siteID);
        		if(lstSiteCriteria.size()>1){
        			for(int i=0;i<lstSiteCriteria.size();i++){
        				if(lstSiteCriteria.get(i).getCriteria_type().equalsIgnoreCase("cultural"))
        					cultural= true;
        				if(lstSiteCriteria.get(i).getCriteria_type().equalsIgnoreCase("natural"))
        					natural=true;
        			}
        			whp_sites objwhp_sites = whp_sitesLocalServiceUtil.getwhp_sites(siteID);
        			if(cultural && natural){
        				
        				objwhp_sites.setMixed_site(true);
        				
        			}else objwhp_sites.setMixed_site(false);
        				
        				whp_sitesLocalServiceUtil.updatewhp_sites(objwhp_sites);
        		}
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addSiteDangerList(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		int dangerTypeId=ParamUtil.getInteger(request,"dangerType");
    		long dangerListSiteId=ParamUtil.getLong(request, "dangerListId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	
           	String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
  	        int monthstr=Integer.parseInt(month)+1;
  	        String Dobmon=String.valueOf(monthstr);
  	          	        
  	        String date= day+"/"+Dobmon+"/"+year;
  	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
  	        Date dangerDate = formatter1.parse(date);
  	                   	
           	/*Date dangerDate = serverDate.parse(serverDate.format(formDate.parse(ParamUtil.getString(request, "dangerDate"))));*/
           	
        	whp_site_danger_list objwhp_site_danger_list = null;
        	if(dangerListSiteId>0){
        		objwhp_site_danger_list =whp_site_danger_listLocalServiceUtil.getwhp_site_danger_list(dangerListSiteId);
        	
        	}else {
        		
        		objwhp_site_danger_list = whp_site_danger_listLocalServiceUtil.createwhp_site_danger_list(CounterLocalServiceUtil.increment(whp_site_danger_list.class.getName()));
        		
        	}
        	if(objwhp_site_danger_list!=null){
        		objwhp_site_danger_list.setStatus_id(dangerTypeId);
        		objwhp_site_danger_list.setSite_id(siteID);
        		objwhp_site_danger_list.setYear(dangerDate);
            	whp_site_danger_listLocalServiceUtil.addwhp_site_danger_list(objwhp_site_danger_list);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addSiteIUCNRRecomendation(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		int recommendationTypeId=ParamUtil.getInteger(request,"recommendationType");
    		long recommendationSiteId=ParamUtil.getLong(request, "iucnRecommendationId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	
           	
         	String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
  	        int monthstr=Integer.parseInt(month)+1;
  	        String Dobmon=String.valueOf(monthstr);
  	          	        
  	        String date= day+"/"+Dobmon+"/"+year;
  	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
  	        Date recommendationDate = formatter1.parse(date);
  	        
  	       	/*Date recommendationDate = serverDate.parse(serverDate.format(formDate.parse(ParamUtil.getString(request, "recommendationDate"))));*/
  	       	
        	whp_sites_iucn_recommendation objwhp_sites_IUCN_Recommendation = null;
        	if(recommendationSiteId>0){
        		objwhp_sites_IUCN_Recommendation =whp_sites_iucn_recommendationLocalServiceUtil.getwhp_sites_iucn_recommendation(recommendationSiteId);
        	
        	}else {
        		CounterLocalServiceUtil.increment(whp_sites_iucn_recommendation.class.getName());
        		objwhp_sites_IUCN_Recommendation = whp_sites_iucn_recommendationLocalServiceUtil.createwhp_sites_iucn_recommendation(0);
        		
        	}
        	if(objwhp_sites_IUCN_Recommendation!=null){
        		objwhp_sites_IUCN_Recommendation.setRecommendation_type(recommendationTypeId);
        		objwhp_sites_IUCN_Recommendation.setSite_id(siteID);
        		objwhp_sites_IUCN_Recommendation.setRec_date(recommendationDate);
        		whp_sites_iucn_recommendationLocalServiceUtil.addwhp_sites_iucn_recommendation(objwhp_sites_IUCN_Recommendation);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addSiteBoundaryModification(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		int boundaryModificationTypeId=ParamUtil.getInteger(request,"boundaryModificationType");
    		long boundaryModificationSiteId=ParamUtil.getLong(request, "boundaryModificationId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	String boundaryModificationDescription = ParamUtil.getString(request, "boundaryModificationDescription");
           	
           	String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
  	        int monthstr=Integer.parseInt(month)+1;
  	        String Dobmon=String.valueOf(monthstr);
  	          	        
  	        String date= day+"/"+Dobmon+"/"+year;
  	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
  	        Date boundaryModificationDate = formatter1.parse(date);
  	        
           	
           	/*Date boundaryModificationDate = serverDate.parse(serverDate.format(formDate.parse(ParamUtil.getString(request, "boundaryModificationDate"))));*/
           	
        	whp_sites_boundary_modification objwhp_sites_boundary_modification = null;
        	if(boundaryModificationSiteId>0){
        		objwhp_sites_boundary_modification =whp_sites_boundary_modificationLocalServiceUtil.getwhp_sites_boundary_modification(boundaryModificationSiteId);
        	
        	}else {
        		
        		objwhp_sites_boundary_modification = whp_sites_boundary_modificationLocalServiceUtil.createwhp_sites_boundary_modification(CounterLocalServiceUtil.increment(whp_sites_boundary_modification.class.getName()));
        		
        	}
        	if(objwhp_sites_boundary_modification!=null){
        		objwhp_sites_boundary_modification.setBmid(boundaryModificationTypeId);
        		objwhp_sites_boundary_modification.setSite_id(siteID);
        		objwhp_sites_boundary_modification.setMod_date(boundaryModificationDate);
        		objwhp_sites_boundary_modification.setDescription(boundaryModificationDescription);
        		whp_sites_boundary_modificationLocalServiceUtil.addwhp_sites_boundary_modification(objwhp_sites_boundary_modification);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addSiteSOOUV(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		long soouvSiteId=ParamUtil.getLong(request, "soouvId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	String soouvEnAdaptation = ParamUtil.getString(request, "soouvEnAdaptation");
           	String soouvFrAdaptation = ParamUtil.getString(request, "soouvFrAdaptation");
           	
           	String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
  	        int monthstr=Integer.parseInt(month)+1;
  	        String Dobmon=String.valueOf(monthstr);
  	        
  	        
  	        String date= day+"/"+Dobmon+"/"+year;
  	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
  	        Date soouvDate = formatter1.parse(date);
  	        
  	        
           	/*Date soouvDate = serverDate.parse(serverDate.format(formDate.parse(ParamUtil.getString(request, "soouvDate"))));*/
        	whp_sites_soouv objwhp_sites_soouv = null;
        	if(soouvSiteId>0){
        		objwhp_sites_soouv =whp_sites_soouvLocalServiceUtil.getwhp_sites_soouv(soouvSiteId);
        	
        	}else {
        		//CounterLocalServiceUtil.increment(whp_sites_boundary_modification.class.getName());
        		objwhp_sites_soouv = whp_sites_soouvLocalServiceUtil.createwhp_sites_soouv(CounterLocalServiceUtil.increment(whp_sites_soouv.class.getName()));
        		
        	}
        	if(objwhp_sites_soouv!=null){
        		objwhp_sites_soouv.setSite_id(siteID);
        		objwhp_sites_soouv.setSoouv_date(soouvDate);
        		objwhp_sites_soouv.setDescription_en(soouvEnAdaptation);
        		objwhp_sites_soouv.setDescription_fr(soouvFrAdaptation);
        		whp_sites_soouvLocalServiceUtil.addwhp_sites_soouv(objwhp_sites_soouv);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addSiteDscor(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		long dscorSiteId=ParamUtil.getLong(request, "dsocrId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	String dscorState = ParamUtil.getString(request, "startDate");
           	/*String doacdate=ParamUtil.getString(request, "startDate");
           	Date dscorDate = serverDate.parse(serverDate.format(formDate.parse(ParamUtil.getString(request, "startDate"))));
           	*/
           	String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
    	        int monthstr=Integer.parseInt(month)+1;
    	        String Dobmon=String.valueOf(monthstr);
    	        
    	        
    	        String date= day+"/"+Dobmon+"/"+year;
    	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
    	        Date dscorDate = formatter1.parse(date);
       	        
       	        
       	        /*SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy"); Date dscorDate = formatter1.parse(date);*/
           	                   
        	whp_sites_dsocr objwhp_sites_dscor = null;
        	if(dscorSiteId>0){
        		objwhp_sites_dscor =whp_sites_dsocrLocalServiceUtil.getwhp_sites_dsocr(dscorSiteId);
        	
        	}else {
        		objwhp_sites_dscor = whp_sites_dsocrLocalServiceUtil.createwhp_sites_dsocr(CounterLocalServiceUtil.increment(whp_sites_dsocr.class.getName()));
        		
        	}
        	if(objwhp_sites_dscor!=null){
        		objwhp_sites_dscor.setSite_id(siteID);
        		objwhp_sites_dscor.setDsocr_date(dscorDate);
        		objwhp_sites_dscor.setState_description(dscorState);
        		whp_sites_dsocrLocalServiceUtil.addwhp_sites_dsocr(objwhp_sites_dscor);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addSiteFlagshipSpecies(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		long flagshipSpeciesSiteId=ParamUtil.getLong(request, "flagshipSpeciesId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	int redlistSpeciesId = ParamUtil.getInteger(request, "redlistSpeciesID");
        	whp_sites_flagship_species objwhp_sites_flagship_species = null;
        	if(flagshipSpeciesSiteId>0){
        		objwhp_sites_flagship_species =whp_sites_flagship_speciesLocalServiceUtil.getwhp_sites_flagship_species(flagshipSpeciesSiteId);
        	
        	}else {
        		objwhp_sites_flagship_species = whp_sites_flagship_speciesLocalServiceUtil.createwhp_sites_flagship_species(CounterLocalServiceUtil.increment(whp_sites_flagship_species.class.getName()));
        		
        	}
        	if(objwhp_sites_flagship_species!=null){
        		objwhp_sites_flagship_species.setSite_id(siteID);
        		objwhp_sites_flagship_species.setFlagship_species_id(redlistSpeciesId);
        		whp_sites_flagship_speciesLocalServiceUtil.addwhp_sites_flagship_species(objwhp_sites_flagship_species);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void AddSiteIUCNPACategory(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		List<whp_sites_iucn_pa_category> lstsiteIucnPaCategories = null;
    		long siteID = ParamUtil.getLong(request, "siteID");
           	String[] IUCNPACategories = ParamUtil.getParameterValues(request, "IUCNPACategory");
           	lstsiteIucnPaCategories = whp_sites_iucn_pa_categoryLocalServiceUtil.getWhpSiteIUCNPACategoryBySiteId(siteID);
           	List<String> lstSelectedCategories = new ArrayList<String>();
           	System.out.println(IUCNPACategories);
            for(String cat_id:IUCNPACategories) {
            	lstSelectedCategories.add(cat_id);
            }
           	for(whp_sites_iucn_pa_category pa_cat:lstsiteIucnPaCategories){
           		int pa_category_id= pa_cat.getIucn_pa_category_id();
           		long sites_iucn_pa_category_id =pa_cat.getWhp_sites_iucn_pa_category_id();
           		if(lstSelectedCategories.contains(pa_category_id+"")){
           			lstSelectedCategories.remove(pa_category_id+"");
           		}
           		else {
           			whp_sites_iucn_pa_categoryLocalServiceUtil.deletewhp_sites_iucn_pa_category(sites_iucn_pa_category_id);
           		}
    	    }
           	System.out.println("Newly Added "+lstSelectedCategories);
           	for(String IUCNPACategoryId:lstSelectedCategories){
           		whp_sites_iucn_pa_category objwhp_sites_iucn_pa_category = null;
            	
        		objwhp_sites_iucn_pa_category = whp_sites_iucn_pa_categoryLocalServiceUtil.createwhp_sites_iucn_pa_category(CounterLocalServiceUtil.increment(whp_sites_iucn_pa_category.class.getName()));
        		
        		if(objwhp_sites_iucn_pa_category!=null){
            		objwhp_sites_iucn_pa_category.setSite_id(siteID);
            		objwhp_sites_iucn_pa_category.setIucn_pa_category_id(Integer.parseInt(IUCNPACategoryId));
            		whp_sites_iucn_pa_categoryLocalServiceUtil.addwhp_sites_iucn_pa_category(objwhp_sites_iucn_pa_category);
                	}
	    	    }
	           
        	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.printStackTrace();
    	}
    	
    }
    
    public void AddSiteSpeciesOtherDesignation(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		long otherDesignationSiteId=ParamUtil.getLong(request, "siteOtherDesignationId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	int otherDesignationId = ParamUtil.getInteger(request, "OtherDesignations");
        	whp_sites_other_designations objwhp_sites_other_designations = null;
        	if(otherDesignationSiteId>0){
        		objwhp_sites_other_designations =whp_sites_other_designationsLocalServiceUtil.getwhp_sites_other_designations(otherDesignationSiteId);
        	
        	}else {
        		objwhp_sites_other_designations = whp_sites_other_designationsLocalServiceUtil.createwhp_sites_other_designations(CounterLocalServiceUtil.increment(whp_sites_other_designations.class.getName()));
        		
        	}
        	if(objwhp_sites_other_designations!=null){
        		objwhp_sites_other_designations.setSite_id(siteID);
        		objwhp_sites_other_designations.setOther_designation_id(otherDesignationId);
        		whp_sites_other_designationsLocalServiceUtil.addwhp_sites_other_designations(objwhp_sites_other_designations);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    
    public void AddsiteThematic(ActionRequest request, ActionResponse response) throws Exception {
    	
    	
    	try
    	{
    		long sitesthematicID=ParamUtil.getLong(request, "sitesthematicID");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	int OtherThematicsId = ParamUtil.getInteger(request, "OtherThematics");
           	sites_thematic objsites_thematic =null;
           	if(sitesthematicID>0)
           	{
           		objsites_thematic=sites_thematicLocalServiceUtil.getsites_thematic(sitesthematicID);
           	}else
           	{
           		objsites_thematic=sites_thematicLocalServiceUtil.createsites_thematic(CounterLocalServiceUtil.increment(sites_thematic.class.getName()));
           	}
           	
           	if(objsites_thematic!=null)
           	{
           		objsites_thematic.setSite_id(siteID);
           		objsites_thematic.setThematicid(OtherThematicsId);
           		sites_thematicLocalServiceUtil.addsites_thematic(objsites_thematic);
           	}
           	
    		
    	}catch(Exception ex )
    	{
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    	
    	
    	
    }
    
    
    
    
    public void addSiteContactInformation(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		long siteContactId=ParamUtil.getLong(request, "siteContactId");
           	long siteID = ParamUtil.getLong(request, "siteID");
           	int contact_id = ParamUtil.getInteger(request, "contactID");
           	int newContactId = 0;
        	whp_contact objwhp_contact = null;
        	whp_sites_contacts objwhp_sites_contacts = null;
        	if(siteContactId>0){
        		objwhp_contact =whp_contactLocalServiceUtil.getwhp_contact(contact_id);
        	
        	}else {
        		newContactId = (int) CounterLocalServiceUtil.increment(whp_contact.class.getName());
        		objwhp_contact = whp_contactLocalServiceUtil.createwhp_contact(0);
        		objwhp_sites_contacts = whp_sites_contactsLocalServiceUtil.createwhp_sites_contacts(CounterLocalServiceUtil.increment(whp_sites_contacts.class.getName()));    
        	}
        	if(objwhp_contact!=null){
        		System.out.println("new Contact id:"+newContactId +"andOld Contact Id:"+contact_id);
        		objwhp_contact.setPrefix(ParamUtil.getString(request, "Prefix"));
        		objwhp_contact.setFirst_name(ParamUtil.getString(request, "FName"));
        		objwhp_contact.setLast_name(ParamUtil.getString(request, "LName"));
        		objwhp_contact.setEmail(ParamUtil.getString(request, "email"));
        		objwhp_contact.setPosition(ParamUtil.getString(request, "position"));
        		objwhp_contact.setOrganization(ParamUtil.getString(request, "organisation"));
        		objwhp_contact.setCategoryid(ParamUtil.getInteger(request, "category"));
        		objwhp_contact.setTelephone(ParamUtil.getString(request,"telephone"));
        		objwhp_contact.setLast_updated(new Date());
        		objwhp_contact.setAddress(ParamUtil.getString(request, "address"));
        		whp_contact persisteObj=whp_contactLocalServiceUtil.addwhp_contact(objwhp_contact);
        		if(objwhp_sites_contacts!=null){
        			objwhp_sites_contacts.setSite_id(siteID);
        			objwhp_sites_contacts.setContactid(persisteObj.getContact_id());
            		whp_sites_contactsLocalServiceUtil.addwhp_sites_contacts(objwhp_sites_contacts);
        		}
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    protected String editSiteJSP = "/SiteInfo_view.jsp";
    protected String editInscriptionHistoryJSP = "/siteinfo_jsp/editInscriptionHistory.jsp";
    
    
    /// method Added by Sonil for .... Site Info - Basic Details ....
    
    public void editSiteBasicDetails(ActionRequest request, ActionResponse response)
    throws Exception {
    	
    	try{
    		long siteID = ParamUtil.getLong(request, "iucnId");
    		
    		String year=ParamUtil.getString(request,"DobYear");
           	String day=ParamUtil.getString(request,"DobDay");
           	String month =ParamUtil.getString(request,"DobMonth");
  	        int monthstr=Integer.parseInt(month)+1;
  	        String Dobmon=String.valueOf(monthstr);
  	        
  	        
  	        String date= day+"/"+Dobmon+"/"+year;
  	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
  	        Date inscriptionDate = formatter1.parse(date);
  	        
    		
    		/*String strDate=ParamUtil.getString(request, "siteInscriptionYear");*/
    		
    		/*Date inscriptionDate=null;*/
    		
    		/*if(strDate!=null)
    		 inscriptionDate= serverDate.parse(serverDate.format(formDate.parse(strDate)));
    		*/
  	        
    		whp_sites whp_sitesobj = whp_sitesLocalServiceUtil.getSiteBySiteId(siteID);
    		
    		whp_sitesobj.setWdpa_id(ParamUtil.getLong(request, "wdpaId"));
    		whp_sitesobj.setUnesco_id(ParamUtil.getLong(request, "unescoId"));
    		whp_sitesobj.setName_en(ParamUtil.getString(request, "siteNameEn"));
    		whp_sitesobj.setName_fr(ParamUtil.getString(request, "siteNameFr"));
    		whp_sitesobj.setCultural_landscape(ParamUtil.getBoolean(request, "culturalLand"));
    		whp_sitesobj.setMixed_site(ParamUtil.getBoolean(request, "mixedSite"));
    		whp_sitesobj.setInscription_date(inscriptionDate);
    		
    		whp_sitesLocalServiceUtil.updatewhp_sites(whp_sitesobj);
    		
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    
    public void addSiteBasicDetails(ActionRequest request, ActionResponse response)
    throws Exception {
    	whp_sites newwhp_sites=null;
    	
    	List<String> lststrSiteName = new ArrayList<String>();
    	
     	try{
    		String strDate=ParamUtil.getString(request, "siteInscriptionYear");
    		String strdefaultData = "Select Site";
    		Date inscriptionDate=null;
    		
    		if(strDate!=null)
    		 inscriptionDate= serverDate.parse(serverDate.format(formDate.parse(strDate)));
    		
    		whp_sites whp_sitesobj = whp_sitesLocalServiceUtil.createwhp_sites(CounterLocalServiceUtil.increment(whp_sites.class.getName()));
    		whp_sitesobj.setWdpa_id(ParamUtil.getLong(request, "wdpaId"));
    		whp_sitesobj.setUnesco_id(ParamUtil.getLong(request, "unescoId"));
    		whp_sitesobj.setName_en(ParamUtil.getString(request, "siteNameEn"));
    		whp_sitesobj.setName_fr(ParamUtil.getString(request, "siteNameFr"));
    		whp_sitesobj.setCultural_landscape(ParamUtil.getBoolean(request, "culturalLand"));
    		whp_sitesobj.setMixed_site(false);
    		whp_sitesobj.setCreation_date(new Date());
    		whp_sitesobj.setCreated_by(ParamUtil.getLong(request, "userId"));
    		whp_sitesobj.setUpdated_by(ParamUtil.getLong(request, "userId"));
    		whp_sitesobj.setLast_updated(new Date());
    		whp_sitesobj.setActive(true);
    		whp_sitesobj.setInscription_date(inscriptionDate);
    		newwhp_sites=whp_sitesLocalServiceUtil.addwhp_sites(whp_sitesobj);
    		
    		//redirtiong to site view
    		request.setAttribute("siteId", newwhp_sites.getSite_id());
    		//response.set
            response.setRenderParameter("jspPage", editSiteJSP);
            response.setWindowState(LiferayWindowState.NORMAL);
           //Code to update Expando column
            List<whp_sites> lstSiteName = whp_sitesLocalServiceUtil.getAllActiveSites();
            String[] strArray = new String[lstSiteName.size()+1];
            strArray[0] = strdefaultData;
            if(lstSiteName!=null){
    			for(int i=0;i<lstSiteName.size();i++){
    				long siteid = lstSiteName.get(i).getSite_id();
    				lststrSiteName.add(whp_sitesLocalServiceUtil.getSiteBySiteId(siteid).getName_en());
    			}
    		}
    		Collections.sort(lststrSiteName);
    		if(!lststrSiteName.isEmpty()){
    			for(int i=0;i<lststrSiteName.size();i++){
    				strArray[i+1] = lststrSiteName.get(i);
    			}
    		}
    		System.out.println(strArray);
    		
    		ExpandoColumnLocalServiceUtil.updateColumn(11309, "Site", 16,strArray );
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    		ex.printStackTrace();
    	}
    	
    }
    //// for adding country in Site Basic Information ... by Sonil 
    
    public void editSiteBasicCountryInfo(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		long siteID = ParamUtil.getLong(request, "siteID");
    		int countryId = ParamUtil.getInteger(request, "countryId");
    		List<country_lkp> lstcountry_lkp = whp_sitesLocalServiceUtil.getCountryListBySiteId(siteID);
    		if(!lstcountry_lkp.contains(country_lkpLocalServiceUtil.getcountry_lkp(countryId))){
    			//whp_sites_country whp_sites_countryObj = whp_sites_countryLocalServiceUtil.createwhp_sites_country(countryId);
    			whp_sites_country whp_sites_countryObj = whp_sites_countryLocalServiceUtil.createwhp_sites_country(CounterLocalServiceUtil.increment(whp_sites_country.class.getName()));
        		if(whp_sites_countryObj!=null){
        			whp_sites_countryObj.setSite_id(siteID);
        			whp_sites_countryObj.setCountryid(countryId);
        			whp_sites_countryLocalServiceUtil.addwhp_sites_country(whp_sites_countryObj);
        		}
        		whp_sites objwhp_sites = whp_sitesLocalServiceUtil.getwhp_sites(siteID);
        		if(lstcountry_lkp.size()>0){
        				objwhp_sites.setTransboundary(true);
        				
        			}else objwhp_sites.setTransboundary(false);
        				
        		whp_sitesLocalServiceUtil.updatewhp_sites(objwhp_sites);
        		
    		}
    		
	    }catch(Exception ex){
	    	SessionErrors.add(request, "");
			//System.out.println("ex---------"+ex.getCause());
			ex.getCause();
		}
	    
        
    }
    
    public void addmgmtBudget(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		
    	/*String strDate=request.getParameter("budgetDate");*/
    	
    	double nCurrency=Double.parseDouble(request.getParameter("nationalCurrency"));
    	double vUSD=Double.parseDouble(request.getParameter("valueInUSD"));
    	long siteBudgetID = ParamUtil.getLong(request, "sitebudgetId");
    	long siteID = ParamUtil.getLong(request, "siteID");
       	
    	
    	String year=ParamUtil.getString(request,"DobYear");
       	String day=ParamUtil.getString(request,"DobDay");
       	String month =ParamUtil.getString(request,"DobMonth");
	        int monthstr=Integer.parseInt(month)+1;
	        String Dobmon=String.valueOf(monthstr);
	        
	        
	        String date= day+"/"+Dobmon+"/"+year;
	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
	        Date budgetDate = formatter1.parse(date);
	        
    	String currencytype = ParamUtil.getString(request, "currencytype");
    	
    	/*String tempDate= serverDate.format(formDate.parse(strDate));
		Date budgetDate =serverDate.parse(tempDate) ;*/
		
		
		whp_sites_budget objwhp_sites_budget=null;
		if(siteBudgetID!=0){
			objwhp_sites_budget=whp_sites_budgetLocalServiceUtil.getwhp_sites_budget(siteBudgetID);
		}else{
			objwhp_sites_budget=whp_sites_budgetLocalServiceUtil.createwhp_sites_budget(CounterLocalServiceUtil.increment(whp_sites_budget.class.getName()));
		}
    	
    	objwhp_sites_budget.setDate(budgetDate);
    	objwhp_sites_budget.setCurrency_local(nCurrency);
    	objwhp_sites_budget.setCurrency_usd(vUSD);
    	objwhp_sites_budget.setSite_id(siteID);
    	objwhp_sites_budget.setCurrency(currencytype);
    	
    	whp_sites_budgetLocalServiceUtil.addwhp_sites_budget(objwhp_sites_budget);
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    }
    public void addStaffCount(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		
    	
       	long staffCount=Long.parseLong(request.getParameter("textStaffCount"));
    	long site_id = ParamUtil.getLong(request, "siteID");

    	
    	String year=ParamUtil.getString(request,"DobYear");
       	String day=ParamUtil.getString(request,"DobDay");
       	String month =ParamUtil.getString(request,"DobMonth");
	        int monthstr=Integer.parseInt(month)+1;
	        String Dobmon=String.valueOf(monthstr);
	        
	        
	        String date= day+"/"+Dobmon+"/"+year;
	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
	        Date staffDate = formatter1.parse(date);
	        

	        
    	/*Date staffDate =serverDate.parse(serverDate.format(formDate.parse(request.getParameter("staffUpdateDate")))) ;*/

		
		if(site_id>0){
			//getting site object
		whp_sites objwhp_sites=whp_sitesLocalServiceUtil.getwhp_sites(site_id);
		
		//setting updated values
		objwhp_sites.setStaff(staffCount);
		objwhp_sites.setStaff_update_date(staffDate);
		
		//adding updated object to databse
    	whp_sitesLocalServiceUtil.addwhp_sites(objwhp_sites);
    	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.printStackTrace();
    	}
    }
    public void addmgmtIndiComm(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		
    	
    	String textDes=request.getParameter("textDescription");
    	long siteId = Long.parseLong(request.getParameter("siteID"));
    	
    	long in_comsite_id = ParamUtil.getLong(request, "siteIndiCommId");
    	whp_sites_indigenous_communities objwhp_sitesIC=null;
    	
		if(in_comsite_id>0){
			//getting site object
			objwhp_sitesIC=whp_sites_indigenous_communitiesLocalServiceUtil.getwhp_sites_indigenous_communities(in_comsite_id);
		}
		else
		{			
			objwhp_sitesIC=whp_sites_indigenous_communitiesLocalServiceUtil.createwhp_sites_indigenous_communities(CounterLocalServiceUtil.increment(whp_sites_indigenous_communities.class.getName()));
			
		}
		//setting updated values
			objwhp_sitesIC.setDescription(textDes);
			objwhp_sitesIC.setSite_id(siteId);
		
		//adding updated object to databse
			whp_sites_indigenous_communitiesLocalServiceUtil.addwhp_sites_indigenous_communities(objwhp_sitesIC);
    	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.printStackTrace();
    	}
    }
    public void addmgmtPopulation(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		
    	
    	long textCount=Long.parseLong(request.getParameter("populationCount"));
    	long popusite_id = ParamUtil.getLong(request, "siteID");
		
		if(popusite_id>0){
			//getting site object
			whp_sites objwhp_sitespopu=whp_sitesLocalServiceUtil.getwhp_sites(popusite_id);
		
		//setting updated values
			objwhp_sitespopu.setPopulation(textCount);
		//objwhp_sites.setStaff_update_date(staffDate);
		
		//adding updated object to databse
			whp_sitesLocalServiceUtil.addwhp_sites(objwhp_sitespopu);
    	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.printStackTrace();
    	}
    }
    
    public void addmgmtVisitor(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		
    	
    	long textCount=Long.parseLong(request.getParameter("visitorCount"));
    	long siteId = Long.parseLong(request.getParameter("siteID"));
    	long visitorsite_id = ParamUtil.getLong(request, "siteVisitorId");
    	
    	String year=ParamUtil.getString(request,"DobYear");
       	String day=ParamUtil.getString(request,"DobDay");
       	String month =ParamUtil.getString(request,"DobMonth");
	        int monthstr=Integer.parseInt(month)+1;
	        String Dobmon=String.valueOf(monthstr);
	        
	        
	        String date= day+"/"+Dobmon+"/"+year;
	        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
	        Date visitorDate = formatter1.parse(date);
	        
	        

    	/*Date visitorDate =serverDate.parse(serverDate.format(formDate.parse(request.getParameter("visitorDate")))) ;*/
    	
    	whp_sites_visitors objwhp_sites_visitors = null;
		
		if(visitorsite_id>0){
			//getting site object
			objwhp_sites_visitors=whp_sites_visitorsLocalServiceUtil.getwhp_sites_visitors(visitorsite_id);
		}else {
			objwhp_sites_visitors=whp_sites_visitorsLocalServiceUtil.createwhp_sites_visitors(CounterLocalServiceUtil.increment(whp_sites_visitors.class.getName()));
		}//setting updated values
			objwhp_sites_visitors.setVisitor_count(textCount);
			objwhp_sites_visitors.setRecord_date(visitorDate);
			objwhp_sites_visitors.setSite_id(siteId);
		
		//adding updated object to databse
			whp_sites_visitorsLocalServiceUtil.addwhp_sites_visitors(objwhp_sites_visitors);
    	
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.printStackTrace();
    	}
    }
 
    public void deleteCurrentRecordFromTable(ActionRequest request, ActionResponse response)
    throws Exception {
    	      try{
    	    	   String selectedPkey=request.getParameter("selectedPkey");
    	    	   long siteId = Long.parseLong(request.getParameter("siteID"));
    	           String tableName = request.getParameter("tableName");
    	           whp_sites objwhp_sites = whp_sitesLocalServiceUtil.getwhp_sites(siteId);
    	           if(tableName.contains("Inscription Criteria")){
                   		whp_sites_inscription_criteriaLocalServiceUtil.deletewhp_sites_inscription_criteria(Long.parseLong(selectedPkey));
                   		List<inscription_criteria_lkp> lstSiteCriteria=null;
                   	// Code for update Site Mixed status update
                    	boolean cultural= false;
                    	boolean natural=false;
                    	
                    	lstSiteCriteria=whp_sitesLocalServiceUtil.getInscriptionBySiteId(siteId);
                		if(lstSiteCriteria.size()>1){
                			for(int i=0;i<lstSiteCriteria.size();i++){
                				if(lstSiteCriteria.get(i).getCriteria_type().equalsIgnoreCase("cultural"))
                					cultural= true;
                				if(lstSiteCriteria.get(i).getCriteria_type().equalsIgnoreCase("natural"))
                					natural=true;
                			}
                			
                			if(cultural && natural){
                				
                				objwhp_sites.setMixed_site(true);
                				
                			}else objwhp_sites.setMixed_site(false);
                				
                				whp_sitesLocalServiceUtil.updatewhp_sites(objwhp_sites);
                		}
                   }
                   if(tableName.contains("Inscription History")){
                   		whp_sites_inscription_dateLocalServiceUtil.deletewhp_sites_inscription_date(Long.parseLong(selectedPkey));
                   }
                   if(tableName.contains("Danger List")){
                		whp_site_danger_listLocalServiceUtil.deletewhp_site_danger_list(Long.parseLong(selectedPkey));
                   }
                   if(tableName.contains("IUCN Recomendation")){
                  		whp_sites_iucn_recommendationLocalServiceUtil.deletewhp_sites_iucn_recommendation(Long.parseLong(selectedPkey));
                   }
                   if(tableName.contains("Boundary Modifications")){
                  		whp_sites_boundary_modificationLocalServiceUtil.deletewhp_sites_boundary_modification(Long.parseLong(selectedPkey));
                  	}
                   if(tableName.contains("Outstanding Universal Values")){
                 		whp_sites_soouvLocalServiceUtil.deletewhp_sites_soouv(Long.parseLong(selectedPkey));
                   }
                   if(tableName.contains("DSOCR")){
                 		whp_sites_dsocrLocalServiceUtil.deletewhp_sites_dsocr(Long.parseLong(selectedPkey));
                   }
                   
                   if(tableName.contains("Flagship Species")){
                	   whp_sites_flagship_speciesLocalServiceUtil.deletewhp_sites_flagship_species(Long.parseLong(selectedPkey));
                   }

                   if(tableName.contains("Other Designations")){
                	   whp_sites_other_designationsLocalServiceUtil.deletewhp_sites_other_designations(Long.parseLong(selectedPkey));
                   }
                   
                   if(tableName.contains("Budget")){
                	   whp_sites_budgetLocalServiceUtil.deletewhp_sites_budget(Long.parseLong(selectedPkey));
                   }
                   
                   if(tableName.contains("Visitors")){
                	   whp_sites_visitorsLocalServiceUtil.deletewhp_sites_visitors(Long.parseLong(selectedPkey));
                   }
                   if(tableName.contains("Component")){
                	   whp_sites_componentLocalServiceUtil.deletewhp_sites_component(Long.parseLong(selectedPkey));
                   }
                   
                   if(tableName.contains("Country")){
                	   whp_sites_countryLocalServiceUtil.deletewhp_sites_country(Long.parseLong(selectedPkey));
                	   List<country_lkp> lstcountry_lkp = whp_sitesLocalServiceUtil.getCountryListBySiteId(siteId);
	               	   if(lstcountry_lkp.size()>1){
	               			objwhp_sites.setTransboundary(true);
	               				
	               			}else objwhp_sites.setTransboundary(false);
	               				
	               		whp_sitesLocalServiceUtil.updatewhp_sites(objwhp_sites);
	                   }
                   
                   if(tableName.contains("Contact Information")){
                	   whp_sites_contactsLocalServiceUtil.deletewhp_sites_contacts(Long.parseLong(selectedPkey));
                   }
                   if(tableName.contains("Indiginous Communities")){
                	   whp_sites_indigenous_communitiesLocalServiceUtil.deletewhp_sites_indigenous_communities(Long.parseLong(selectedPkey));
                   }
                   
                   if(tableName.contains("Site Theme"))
                	{
                	sites_thematicLocalServiceUtil.deletesites_thematic(Long.parseLong(selectedPkey))  ; 
                	}
                   
    	       }
    	       catch(Exception ex){
    	    	   System.out.println("Ex------------"+ex.getMessage());
    	       }
    }
    
    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException {

		String cmd = resourceRequest.getParameter("ACTION_CMD");
		if (cmd != null && cmd.equalsIgnoreCase("CountryList")) {
			getCountryList(resourceRequest, resourceResponse);
		} 
		else if (cmd != null && cmd.equalsIgnoreCase("SiteCountryList")) {
			getSiteCountryList(resourceRequest, resourceResponse);
		}
		else if(cmd != null && cmd.equalsIgnoreCase("ADD_CONTACT")){
			isContactExistForSite(resourceRequest, resourceResponse);
		}
		
		
		
		else if(cmd != null && cmd.equalsIgnoreCase("AUTOCOMPLETE")){
			autocomplete(resourceRequest, resourceResponse);
		}
		
		else if(cmd != null && cmd.equalsIgnoreCase("EXPORT")){
			//	String site_id = resourceRequest.getParameter("exportType");
			//	resourceRequest.setAttribute("SearchSiteId", site_id);
						
				//exportUtil objexportUtil = new exportUtil();
				exportUtil.exportData(resourceRequest, resourceResponse);
				
			}
		else if(cmd != null && cmd.equalsIgnoreCase("RUNQUERY")){
			
			try {
				 String[] fieldValue=ParamUtil.getParameterValues(resourceRequest, "lstWhereClause");
				 List<Long> siteIdList=SiteSearchUtil.runQuery(fieldValue);
				 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
			   	 JSONObject cell=null;
			   	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
			   	 String strSiteIds = "";
			   	 String strSiteNames = "";
			   	 if(siteIdList!=null && siteIdList.size()>0){
			   		     cell=JSONFactoryUtil.createJSONObject();
			   		  for(long siteId:siteIdList){
			   			if(strSiteIds.isEmpty()){
			   				String siteName="";
							try {
								siteName = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId).getName_en();
								strSiteIds = strSiteIds+siteId;
				   				strSiteNames = siteName;
							} catch (Exception e) {
								// TODO Auto-generated catch block
								//e.printStackTrace();
							}
			   				
			   			}
			   			else {
			   				String siteName="";
							try {
								siteName = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId).getName_en();
								strSiteIds = strSiteIds+","+siteId;
				   				strSiteNames = strSiteNames+","+siteName;
							} catch (Exception e) {
								// TODO Auto-generated catch block
								//e.printStackTrace();
							}
			   				
			   			}
			   		  }
				    	 cell.put("result", strSiteIds);
				    	 cell.put("strSiteNames", strSiteNames);
				    	 recordsjsonArray.put(cell);
			   		 int size=siteIdList.size();
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
			SiteSearchUtil.getSubCategoryList(resourceRequest, resourceResponse);
			
		}
		else if(cmd != null && cmd.equalsIgnoreCase("GETUNIQUEVALUES")) {
			//AssessmentSearchUtil.getUniqueValuesForSearch(resourceRequest, resourceResponse);
			SiteSearchUtil.getLookUpValues(resourceRequest, resourceResponse);
			
		}
		else if(cmd != null && cmd.equalsIgnoreCase("SEARCH")) {
			String jspPage = resourceRequest.getParameter("jspPageDiv");
			PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
			dispatcher.include(resourceRequest, resourceResponse);	
		}
		else {
			String siteId = resourceRequest.getParameter("siteId");
			String jspPage = resourceRequest.getParameter("jspPageDiv");
			// System.out.println("jspPage:"+jspPage);
			resourceRequest.setAttribute("siteId", siteId);
			PortletRequestDispatcher dispatcher = getPortletContext()
					.getRequestDispatcher(jspPage);
			// "/siteinfo_jsp/innerJSP/site_contact_div.jsp");
			dispatcher.include(resourceRequest, resourceResponse);
		}
    }
	    
    
    private void autocomplete(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException {


    	JSONObject json = JSONFactoryUtil.createJSONObject();
		JSONArray results = JSONFactoryUtil.createJSONArray();
		json.put("response", results);
		
		
		String keyword = ParamUtil.getString(resourceRequest, "keys");
		String searchPattern = keyword.replace("*", "%");
		
		
			ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");

			//Dynamic query to get sites based on site name
			DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites", classLoader)
				 .add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+searchPattern+"%"));
			
			List<whp_sites> whp_sitesList=null;
			
			String base = "SELECT (whp_whp_sites.*) FROM whp_whp_sites WHERE ";
			String whereCondition="";
			whereCondition=" lower(whp_whp_sites.name_en) like '%"+ searchPattern.toLowerCase()+"%'AND  whp_whp_sites.active_=true";
			
			String sql = base+ whereCondition;
	        System.out.println("sql--"+sql);
	        try {
				whp_sitesList=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(sql, 0, whp_sitesLocalServiceUtil.getwhp_sitesesCount());
			} catch (PortalException e1) {
				
				e1.printStackTrace();
			} catch (SystemException e1) {
				
				e1.printStackTrace();
			}
	        
			
			
			//Dynamic queries to get sites based on country name
			DynamicQuery dqGetCountryId = DynamicQueryFactoryUtil.forClass(country_lkp.class, "countryLkp",classLoader)
			.add(RestrictionsFactoryUtil.ilike("countryLkp.name", ""+searchPattern+"%")) 
			.setProjection(ProjectionFactoryUtil.property("countryLkp.countryid")); 
			
			DynamicQuery dqGetSiteId = DynamicQueryFactoryUtil.forClass(whp_sites_country.class, "siteCountry",classLoader)
			.add(PropertyFactoryUtil.forName("siteCountry.countryid").in(dqGetCountryId))
			.setProjection(ProjectionFactoryUtil.property("siteCountry.site_id"));
			
			
			DynamicQuery dqGetSiteFromCountryName = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites",classLoader)
			.add(PropertyFactoryUtil.forName("whpSites.site_id").in(dqGetSiteId));
			
			try {
				@SuppressWarnings("unchecked")
				List<whp_sites> sitesFromName = whp_sitesLocalServiceUtil.dynamicQuery(dqGetSitesFromSiteNames);
				@SuppressWarnings("unchecked")
				List<whp_sites> sitesFromCountry = whp_sitesLocalServiceUtil.dynamicQuery(dqGetSiteFromCountryName);
				
				//Merge List without duplicates
				Set<whp_sites> setMergedSites = new HashSet<whp_sites>(sitesFromName);
				setMergedSites.addAll(sitesFromCountry);
				sitesFromName.clear();
				sitesFromName.addAll(setMergedSites);
				
				for (whp_sites site : whp_sitesList) {
					JSONObject listEntry = JSONFactoryUtil.createJSONObject();
					listEntry.put("key", site.getSite_id());
					listEntry.put("name", site.getName_en());
					listEntry.put("description", "test Alok");
					listEntry.put("type", "test Alok 1");
					listEntry.put("wdpaId", site.getWdpa_id());
					results.put(listEntry);
				}
				
			} catch (Exception e) {
				/*if (_log.isErrorEnabled()) {
					_log.error(e.getMessage());
				}*/
			} finally{
				json.put("response", results);
			}
			
			writeJSON(resourceRequest, resourceResponse, json);
			
		
		
	}

	private void getSiteCountryList(ResourceRequest resourceRequest,ResourceResponse resourceResponse) {
    	boolean isCountryExist=false;
    	int country_id = ParamUtil.getInteger(resourceRequest, "CountryID");
	     List<country_lkp> countryList=new ArrayList<country_lkp>();
	     try{
	    	 long siteId=Long.parseLong(ParamUtil.getString(resourceRequest,"siteID"));
		    	if(siteId>0)
			    	countryList= whp_sitesLocalServiceUtil.getCountryListBySiteId(siteId);
	    	 
		    	if(countryList!=null){
		    		for(int j=0;j<countryList.size();j++){
		       			if(countryList.get(j).getCountryid()==country_id){
		       				isCountryExist=true;
		       				break;
		       			}
		      		}
		    	}
	    	}catch(Exception ex){
	       	 ex.printStackTrace();
	        }
	     try {

	     	 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
	     	 JSONObject cell=null;
	     	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	        	 cell=JSONFactoryUtil.createJSONObject();
	     	 cell.put("isCountryExist", isCountryExist);
	     	 recordsjsonArray.put(cell);
	     	 recordsjsonObject.put("rows",recordsjsonArray);
	     	 resourceResponse.getWriter().print(recordsjsonObject.toString());
	     	 
	     } catch (Exception e) {
	    		 e.printStackTrace();
	    }
	}

	public void addPhysicalComponent(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		String phyComponent=ParamUtil.getString(request,"phyComponent");    		
           	long siteID = ParamUtil.getLong(request, "siteID");        	
           	long siteComponentID=ParamUtil.getLong(request,"siteComponentID");   
           	
           	whp_sites_component objwhp_sites_component = null;
        	if(siteComponentID>0){
        		objwhp_sites_component =whp_sites_componentLocalServiceUtil.getwhp_sites_component(siteComponentID);
        	
        	}else {
        		CounterLocalServiceUtil.increment(whp_sites_component.class.getName());
        		objwhp_sites_component =whp_sites_componentLocalServiceUtil.createwhp_sites_component(0);
        	}
        	if(objwhp_sites_component!=null){
        		objwhp_sites_component.setComponent(phyComponent);
        		objwhp_sites_component.setSite_id(siteID);
        		whp_sites_componentLocalServiceUtil.addwhp_sites_component(objwhp_sites_component);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    public void addPhysicalInformation(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		//area , bzArea, transboundry, bufferZone, serial
    		Double area=ParamUtil.getDouble(request,"area"); 
    		Double bzArea=ParamUtil.getDouble(request,"bzArea"); 
    		Boolean transboundry=ParamUtil.getBoolean(request,"transboundry");
    		Boolean bufferZone=ParamUtil.getBoolean(request,"bufferZone");
    		Boolean serial=ParamUtil.getBoolean(request,"serial");
           	long siteID = ParamUtil.getLong(request, "siteID");        	
              	
           	whp_sites objwhp_sites = null;
        	if(siteID>0){
        		objwhp_sites =whp_sitesLocalServiceUtil.getwhp_sites(siteID);
        	
        	}else {
        		CounterLocalServiceUtil.increment(whp_sites.class.getName());
        		objwhp_sites =whp_sitesLocalServiceUtil.createwhp_sites(0);
        	}
        	if(objwhp_sites!=null){
        		
        		objwhp_sites.setArea(area);
        		objwhp_sites.setBuffer_zone_area(bzArea);
        		objwhp_sites.setTransboundary(transboundry);
        		objwhp_sites.setBuffer_zone(bufferZone);
        		objwhp_sites.setSerial(serial);
        		whp_sitesLocalServiceUtil.addwhp_sites(objwhp_sites);
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    
    public void addsiteDesc(ActionRequest request, ActionResponse response) throws PortletException, IOException, PortalException, SystemException
    {
    	
    long siteId=ParamUtil.getLong(request, "siteID");
    String Description=ParamUtil.getString(request, "textDescription"); 
    whp_sites objwhp_sites = null;
    
    if(siteId>0){
		objwhp_sites =whp_sitesLocalServiceUtil.getwhp_sites(siteId);
	
	}
    	
    	if(objwhp_sites!=null)
    	{
    	
    		objwhp_sites.setDescription(Description);
    		whp_sitesLocalServiceUtil.addwhp_sites(objwhp_sites);
    	}
    
    }
    
    
    public void getCountryList(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException
    {
    	int iucnRegionId=ParamUtil.getInteger(resourceRequest, "iucnRegionId");
	     List<country_lkp> countryList=new ArrayList<country_lkp>();
	     try{
	    	 if(iucnRegionId>0)
		    	 /*countryList= iucn_region_countryLocalServiceUtil.getCountryObject(iucnRegionId);*/
		    	 countryList=unesco_region_countryLocalServiceUtil.getCountryObject(iucnRegionId);

		     else
		    	  countryList= country_lkpLocalServiceUtil.getAllCountries();
	    	 
	    	if(countryList!=null){
	    		//Collections.sort(countryList);
	    		Collections.sort(countryList, new Comparator<country_lkp>(){
	    		    public int compare(country_lkp one, country_lkp other) {
	    		        return one.getName().compareTo(other.getName());
	    		    }
	    		});
	    	}
	    		
	     }catch(Exception ex){
	    	 ex.printStackTrace();
	     }
	    
	     
	     try {
	    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
	    	 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
	    	 JSONObject cell=null;
	    	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
	    	
	    	 for(int i=0;i<countryList.size();i++){

	    	 country_lkp country_lkpObject=countryList.get(i);
	    	 cell=JSONFactoryUtil.createJSONObject();
	    	 cell.put("countryid", country_lkpObject.getCountryid());
	    	 cell.put("name", country_lkpObject.getName());
	    	 recordsjsonArray.put(cell);
	    	 }
	    	 recordsjsonObject.put("rows",recordsjsonArray);
	    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
	    	// System.out.println(recordsjsonObject.toString());
	    	 } catch (Exception e) {
	    	 // TODO Auto-generated catch block
	    		 e.printStackTrace();
	    	 }
    	
    
    
    }
    
    public void addExistingContact(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{    		
           	long siteID = ParamUtil.getLong(request, "siteID");
           	int contact_id = ParamUtil.getInteger(request, "contactID");
        
        	whp_sites_contacts objwhp_sites_contacts = null;
        	
        	if(contact_id>0){
        		objwhp_sites_contacts=whp_sites_contactsLocalServiceUtil.createwhp_sites_contacts(CounterLocalServiceUtil.increment(whp_sites_contacts.class.getName()));
        		if(objwhp_sites_contacts!=null){
        			objwhp_sites_contacts.setSite_id(siteID);
        			objwhp_sites_contacts.setContactid(contact_id);
            		whp_sites_contactsLocalServiceUtil.addwhp_sites_contacts(objwhp_sites_contacts);
        		}
        	}
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		ex.getCause();
    	}
    	
    }
    
    
public void isContactExistForSite(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException
{
	
	boolean isContactExist=false;
	int ContactID=ParamUtil.getInteger(resourceRequest, "ContactID");
	 try{
	List<whp_sites_contacts> objwhp_sites_contacts=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(
			Long.parseLong(resourceRequest.getParameter("siteId")));
    
    	 int len=objwhp_sites_contacts.size();
    	 for(int j=0;j<len;j++){
    		 whp_sites_contacts temp=objwhp_sites_contacts.get(j);
    			if(temp.getContactid()==ContactID){
    				isContactExist=true;
    				break;
    			}
   		}
     }catch(Exception ex){
    	 ex.printStackTrace();
     }
       
     try {
    	// List<Invheader> objectList=InvheaderLocalServiceUtil.getAllRecords();
    	 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
    	 JSONObject cell=null;
    	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
       	 cell=JSONFactoryUtil.createJSONObject();
    	 cell.put("isContactExist", isContactExist);
    	 recordsjsonArray.put(cell);
    	 recordsjsonObject.put("rows",recordsjsonArray);
    	 resourceResponse.getWriter().print(recordsjsonObject.toString());
    	// System.out.println(recordsjsonObject.toString());
    	 } catch (Exception e) {
    	 // TODO Auto-generated catch block
    		 e.printStackTrace();
    	 }
    }



	/**
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void startSiteAssessment(ActionRequest request,
			ActionResponse response) throws Exception {
		try {
			long siteID = ParamUtil.getLong(request, "siteID");
			long userId = ParamUtil.getLong(request, "userId");
			Date initiation_date = new Date();

			//check is assessment is already started
			site_assessment objsite_assessment = null;
			boolean isAssessmentInProgress=false;
			List<site_assessment> lstsite_assessment = new ArrayList<site_assessment>();
			lstsite_assessment.addAll(site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(siteID));
			//siteAssessmentByFlag(true,false);
					
			for(site_assessment site_assessmentobj:lstsite_assessment){
				/*List<assessment_lang_version> assessment_lang_versionList=assessment_lang_versionLocalServiceUtil.
				findByAssessmentId(site_assessmentobj.getAssessment_id());
				if(assessment_lang_versionList!=null && assessment_lang_versionList.size()>0){
					for(assessment_lang_version assessment_lang_versionObj:assessment_lang_versionList){
						if(!assessment_lang_versionObj.isPublished()){
							isAssessmentInProgress=true;
							break;
						}
						
					}
				}else{
					isAssessmentInProgress=true;
				}*/
				
			if(site_assessmentobj.isIs_active()){
					isAssessmentInProgress=true;
					break;
				}
				
				/*if(isAssessmentInProgress){
					break;
				}*/
			}
			
			/*if(lstsite_assessment!=null && lstsite_assessment.size()>0){
				isAssessmentInProgress=true;
			}*/
			
			
			lstsite_assessment.add(objsite_assessment);
			
			/*if (lstsite_assessment != null
					&& lstsite_assessment.size() > 0) {*/
			if(isAssessmentInProgress){

				SessionErrors.add(request, "error-assessment");

			} else {
				
				objsite_assessment = site_assessmentLocalServiceUtil
						.createsite_assessment(CounterLocalServiceUtil.increment(site_assessment.class
								.getName()));
				objsite_assessment.setSite_id(siteID);
				objsite_assessment.setAssessment_initiated_by(userId);
				objsite_assessment.setInitiation_date(initiation_date);
				//objsite_assessment.setPublished(false);
				objsite_assessment.setStatus_id(1);
				objsite_assessment.setCurrent_stageid(1);
				objsite_assessment.setArchived(false);
				objsite_assessment.setIs_active(true);
				// previous version is '2016'
				objsite_assessment.setAssessment_cycle("2017");

				site_assessmentLocalServiceUtil
						.addsite_assessment(objsite_assessment);
				response.sendRedirect("/web/iucn/manage-assessment");
				
			}

		} catch (Exception ex) {
			SessionErrors.add(request, "error");
//			System.out.println("ex---------"+ex.getCause());
//			ex.getCause();
			ex.printStackTrace();
		}
	}
	public void site_searchFilterURL(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception{
		
	
		Boolean transboundry=ParamUtil.getBoolean(actionRequest,"isTranOpt");
		Boolean serial=ParamUtil.getBoolean(actionRequest,"serialOpt");
		Boolean isMixedOpt=ParamUtil.getBoolean(actionRequest,"isMixedOpt");
		Boolean isendangered=ParamUtil.getBoolean(actionRequest,"isendangeredListOpt");
       	long siteID = ParamUtil.getLong(actionRequest, "siteID");  
       	
		System.out.println(transboundry+";"+serial+";"+isMixedOpt+";"+isendangered);
	}
	
	public void UploadSiteImage(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
	/*System.out.println("submitFile:");
	UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);

	String submissionFileName = uploadRequest.getFileName("file");//uploaded filename
	File submissionFile = uploadRequest.getFile("file"); //uploaded file you can see it in /tomcat/temp 
*/

    	
			//_log.info("In UploadDocument process action");
			
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			String sourceFileName = uploadRequest.getFileName("fileUpload");//uploaded filename		
			String title = sourceFileName ; //uploadRequest.getParameter("title");
			String description = sourceFileName; //uploadRequest.getParameter("description");

			long repositoryId = ParamUtil.getLong(uploadRequest, "repositoryId");
			long siteid = ParamUtil.getLong(uploadRequest, "siteid");
			long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID; //get home directory folderId
			String changeLog = "changeLog";
			InputStream inputStream = null;
			long fileSize = uploadRequest.getSize("fileUpload");
			String contentType = uploadRequest.getContentType("fileUpload");
			String siteImageFolferName = "WHS_thumbnails";
			
			inputStream = uploadRequest.getFileAsStream("fileUpload");
			
			
			//file upload for small image 
			InputStream inputStream_small = null;
			String sourceFileName_small = uploadRequest.getFileName("fileUpload_small");//uploaded filename		
			String title_small = sourceFileName_small ; //uploadRequest.getParameter("title");
			String description_small = sourceFileName_small;
			long fileSize_small = uploadRequest.getSize("fileUpload_small");
			String contentType_small = uploadRequest.getContentType("fileUpload_small");
			inputStream_small = uploadRequest.getFileAsStream("fileUpload_small");
			

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					DLFileEntry.class.getName(), actionRequest);

			// check uniqueness of the title if the file with same title exists in dms exception would occur.
			
			/*FileEntry oldFileEntry = DLAppServiceUtil.getFileEntry(repositoryId, folderId, title);
			if (oldFileEntry.getFileEntryId() > 0)
			{
				actionRequest.setAttribute("message", "Duplicate Image Name. Upload after renaming the image");
				return;
				
			}*/
			try {	
				//get folderif by folder name
				Folder siteImageFolder = DLAppServiceUtil.getFolder(repositoryId, parentFolderId, siteImageFolferName);
				long siteImageFolderId = siteImageFolder.getFolderId();
				/*List<Folder> siteImageFolder = DLAppServiceUtil.getFolders(repositoryId, parentFolderId);*/
				/*
				for(int folderCnt=0;folderCnt < siteImageFolder.size();folderCnt++)
				{
					Folder tempFolder = siteImageFolder.get(folderCnt);
					if(tempFolder.getName().contains(siteImageFolferName))
					{
						
					}
				}*/
				//long siteImageFolderId = siteImageFolder.getFolderId();
				//Update fileentryid to IUCN table
				whp_sites currentSite = whp_sitesLocalServiceUtil.getSiteBySiteId(siteid);
				
				if( sourceFileName!=null &&!sourceFileName.isEmpty())
				{
			
				FileEntry fileEntry = DLAppServiceUtil.addFileEntry(
					repositoryId, siteImageFolderId, sourceFileName, contentType, title,
					description, changeLog, inputStream, fileSize, serviceContext); //call document library addFileEntry method to add file in home directory
				
				ImageProcessorUtil.generateImages(fileEntry.getLatestFileVersion()); 
				
				currentSite.setThumbnailid(fileEntry.getFileEntryId());
				
				}
				
				
				if(sourceFileName_small!=null && !sourceFileName_small.isEmpty())
				{
				
				FileEntry fileEntry_small = DLAppServiceUtil.addFileEntry(
						repositoryId, siteImageFolderId, sourceFileName_small, contentType_small, title_small,
						description_small, changeLog, inputStream_small, fileSize_small, serviceContext);
				
				ImageProcessorUtil.generateImages(fileEntry_small.getLatestFileVersion()); 
				
				currentSite.setThumbnailid_small(fileEntry_small.getFileEntryId());
				}
				
				
			//set file permission
				
			/*Role roleUser = RoleLocalServiceUtil.getRole(companyId, RoleConstants.USER);
	
			ResourcePermissionLocalServiceUtil.setResourcePermissions(companyId(DLFileEntry.class.getName(),ResourceConstants.SCOPE_INDIVIDUAL,String.valueOf(fileEntry.getFileEntryId()),roleId,new String[] {ActionKeys.VIEW});
	*/		//Create Thumbnail for the uploaded file
			
			
			
			
			
			
			//for small thumbnail image
			
			
			whp_sitesLocalServiceUtil.updatewhp_sites(currentSite);
			
		
			
			   actionRequest.setAttribute("siteId", siteid);
			   actionRequest.setAttribute("mode", "edit");
	           actionResponse.setRenderParameter("jspPage", editSiteJSP);
			
			/*long fileEntryId = fileEntry.getFileEntryId();
			actionRequest.setAttribute("fileEntry", fileEntry);
			UploadFileLocalServiceUtil.addFile(fileEntryId, title, description, fileSize); //call custom portlet addFile method to add file details in table
*/	
		}catch (com.liferay.portal.kernel.exception.PortalException e) {
			
			e.printStackTrace();
		}
/*		catch (SystemException e) {
			//_log.equals("In UploadDocument():"+e.getMessage());
		}*/
		finally{
			//SessionErrors.clear(actionRequest);
			//SessionErrors.add(actionRequest, "duplicateFile");
			actionRequest.setAttribute("siteId", siteid);
			actionRequest.setAttribute("mode", "edit");
	        actionResponse.setRenderParameter("jspPage", editSiteJSP);
		}
	}
}

