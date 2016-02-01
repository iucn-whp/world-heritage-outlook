/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.documentlibrary.action;

import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.struts.PortletAction;

/**
 * @author Sergio González
 */
public class SearchAction extends PortletAction {

	@Override
	public ActionForward render(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws Exception {

		return mapping.findForward("portlet.document_library.view");
	}

	@Override
	public void serveResource(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {
				
		String keywords=ParamUtil.getString(resourceRequest, "keywords");
		String docType = ParamUtil.getString(resourceRequest, "docType");
		String docCategory = ParamUtil.getString(resourceRequest, "docCategory");
		String docSite = ParamUtil.getString(resourceRequest, "docSite");
		String doclanguage = ParamUtil.getString(resourceRequest, "docLanguage");
		String docAuthor = ParamUtil.getString(resourceRequest, "docAuthor");
		String docpubDatestr = resourceRequest.getParameter("docpubDate");
		String  docUploadDatestr = resourceRequest.getParameter("docUploadDate");
		String docCopyright = ParamUtil.getString(resourceRequest, "docCopyright");
		String docFull_COM = ParamUtil.getString(resourceRequest, "docFull_COM");
		String docCOM = ParamUtil.getString(resourceRequest, "docCOM");
		String navigation = ParamUtil.getString(resourceRequest, "navigation");
		
		
		PortletSession portletSession = resourceRequest.getPortletSession();
		/*if (navigation.equalsIgnoreCase("home")) 
		{				
			portletSession.setAttribute("keywords","",PortletSession.PORTLET_SCOPE);
		}*/
		 
		
		if(keywords.equalsIgnoreCase("advance_search"))
		{			
			portletSession.setAttribute("keywords","advance_search",PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docType",docType,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docCategory",docCategory,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docSite",docSite,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("doclanguage",doclanguage,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docAuthor",docAuthor,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docpubDatestr",docpubDatestr,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docUploadDatestr",docUploadDatestr,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docCopyright",docCopyright,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docFull_COM",docFull_COM,PortletSession.PORTLET_SCOPE);
			portletSession.setAttribute("docCOM",docCOM,PortletSession.PORTLET_SCOPE);			
		}
		

		PortletContext portletContext = portletConfig.getPortletContext();
		/*String jspPage="";
		if(keywords.equalsIgnoreCase("advance_search")){
			jspPage="/html/portlet/document_library/advanceSearch_resources.jsp";
		}else{
			jspPage="/html/portlet/document_library/search_resources.jsp";
		}

		PortletRequestDispatcher portletRequestDispatcher =
			portletContext.getRequestDispatcher(jspPage);*/
		PortletRequestDispatcher portletRequestDispatcher =
			portletContext.getRequestDispatcher("/html/portlet/document_library/search_resources.jsp");

		portletRequestDispatcher.include(resourceRequest, resourceResponse);
	}
}