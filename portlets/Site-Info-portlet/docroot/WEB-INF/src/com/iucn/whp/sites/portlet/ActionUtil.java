package com.iucn.whp.sites.portlet;

import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_inscription_date;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_inscription_dateLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import java.util.Collections;
import java.util.List;

public class ActionUtil {

	
    /**
     * Used by the view.jsp to grab the Active Sites from the database.
     * @param request
     * @return
     * @throws PortalException 
     */
    public static List<whp_sites> getActiveSites(RenderRequest request) throws PortalException {
        //ThemeDisplay themeDisplay =
        //    (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        //long groupId = themeDisplay.getScopeGroupId();

        List<whp_sites> tempResults;

        try {
            tempResults = whp_sitesLocalServiceUtil.getAllActiveSites();

//            System.out.println("Active Site Count = " + tempResults.size());
        }

        catch (SystemException ex) {
            tempResults  = Collections.EMPTY_LIST;

        }

        return tempResults;

    }

    /*public static List<PRRegistration> getRegistrations(RenderRequest request) {
        ThemeDisplay themeDisplay =
             (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        long groupId = themeDisplay.getScopeGroupId();
        List<PRRegistration> tempResults;

        try {
            tempResults = PRRegistrationLocalServiceUtil.getAllRegistrations(groupId);
        }

        catch (SystemException se) {
            tempResults = Collections.EMPTY_LIST;
        }

        return tempResults;
        }*/



    /**
     * Creates a PRUser object out of fields from the request.
     *
     * @param request
     * @return
     */
/*    public static PRUser prUserFromRequest(ActionRequest request) {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
       PRUser prUser = new PRUserImpl();

        prUser.setCompanyId(themeDisplay.getCompanyId());
        prUser.setGroupId(themeDisplay.getScopeGroupId());
        prUser.setFirstName(ParamUtil.getString(request, "firstName"));
        prUser.setLastName(ParamUtil.getString(request, "lastName"));
        prUser.setAddress1(ParamUtil.getString(request, "address1"));
        prUser.setAddress2(ParamUtil.getString(request, "address2"));
        prUser.setCity(ParamUtil.getString(request, "city"));
        prUser.setState(ParamUtil.getString(request, "state"));
        prUser.setPostalCode(ParamUtil.getString(request, "postalCode"));
        prUser.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
        prUser.setCountry(ParamUtil.getString(request, "country"));
        prUser.setEmail(ParamUtil.getString(request, "emailAddress"));
        String gender = ParamUtil.getString(request, "gender");

        int birthDateMonth = ParamUtil.getInteger(request, "birthDateMonth");
        int birthDateDay = ParamUtil.getInteger(request, "birthDateDay");
        int birthDateYear = ParamUtil.getInteger(request, "birthDateYear");

        try {

            prUser.setBirthDate(PortalUtil.getDate(birthDateMonth, birthDateDay, birthDateYear, new PortalException()));

        } catch (PortalException ex) {
            prUser.setBirthDate(new Date());
        }

        if (!gender.equals("")) {

            if (gender.equalsIgnoreCase("male")) {
                prUser.setMale(true);
                prUser.setGender("male");

            } else {
                prUser.setMale(false);
                prUser.setGender("female");
            }

        } else {
            prUser.setGender(null);
        }

        return prUser;

    }*/

    /**
    * Creates a PRRegistration object out of values from the request.
    * @param request
    * @return
    */
    /*public static PRRegistration prRegistrationFromRequest(ActionRequest request) {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        PRRegistration registration = new PRRegistrationImpl();

        registration.setCompanyId(themeDisplay.getCompanyId());
        registration.setGroupId(themeDisplay.getScopeGroupId());

        int datePurchasedMonth = ParamUtil.getInteger(request, "datePurchasedMonth");
        int datePurchasedDay = ParamUtil.getInteger(request, "datePurchasedDay");
        int datePurchasedYear = ParamUtil.getInteger(request, "datePurchasedYear");

        try {
            registration.setDatePurchased(PortalUtil.getDate(datePurchasedMonth, datePurchasedDay, datePurchasedYear, new PortalException()));
        } catch (PortalException ex) {
            registration.setDatePurchased(new Date());
        }

        registration.setHowHear(ParamUtil.getString(request, "howHear"));
        registration.setProductId(Long.parseLong(ParamUtil.getString(request, "productType")));
        registration.setPrUserId(ParamUtil.getLong(request, "regUserId"));
        registration.setSerialNumber(ParamUtil.getString(request, "productSerialNumber"));
        registration.setWherePurchased(ParamUtil.getString(request, "wherePurchase"));

        return registration;

    }*/

    /**
     * Creates a PRProduct object out of values from the request.
     * @param request
     * @return
     */
/*    public static whp_sites sitesFromRequest (ActionRequest request) {
       ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
       
       whp_sites newSite = whp_sitesLocalServiceUtil.createwhp_sites(0);
       
       product.setCompanyId(themeDisplay.getCompanyId());
       product.setGroupId(themeDisplay.getScopeGroupId());
       product.setProductName(ParamUtil.getString(request, "productName"));
       product.setSerialNumber(ParamUtil.getString(request, "productSerial"));

       return product;
    }*/
    
    /**
     * Creates a PRUser object out of fields from the request.
     *
     * @param request
     * @return
     */
    
    /**
     * Creates a PRProduct object out of values from the request.
     * @param request
     * @return
     */
    public static whp_sites_inscription_date inscriptionHistoryfromRequest (ActionRequest request) {
    
        //ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
    	long id = ParamUtil.getLong(request, "resourcePrimKey");
        
        whp_sites_inscription_date objwhp_sites_inscription_date = whp_sites_inscription_dateLocalServiceUtil.createwhp_sites_inscription_date(id);
        objwhp_sites_inscription_date.setInscription_type_id(ParamUtil.getInteger(request, "inscriptionType"));
    	objwhp_sites_inscription_date.setSite_id(ParamUtil.getLong(request, "siteID"));
    	//objwhp_sites_inscription_date.setAddress1(ParamUtil.getString(request, "address1"));
        
        
        return objwhp_sites_inscription_date;
         
    }
    
}
