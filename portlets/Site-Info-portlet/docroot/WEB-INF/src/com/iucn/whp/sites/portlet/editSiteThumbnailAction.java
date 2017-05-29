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
 *//*
package com.iucn.whp.sites.portlet;
//package com.liferay.portlet.usersadmin.action;

import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.portlet.PortletRequestUtil;

import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

*//**
 * @author Alok Sen
 *//*
public class editSiteThumbnailAction extends GenericPortlet {

	@Override
	public void processAction(ActionRequest request, ActionResponse response)
		throws PortletException, IOException {

		try {
			updateThumbnail(request);

			//sendRedirect(request, response);
		}
		catch (Exception e) {
			if (e instanceof NoSuchUserException ||
				e instanceof PrincipalException) {

				SessionErrors.add(request, e.getClass());
				//setForward(request, "siteinfo_jsp.thumbnail.error");
			}
			else if (e instanceof UploadException ||
					 e instanceof UserPortraitSizeException ||
					 e instanceof UserPortraitTypeException) {

				SessionErrors.add(request, e.getClass());
			}
			else {
				throw e;
			}
		}
	}

	@Override
	public ActionForward render(ActionRequest request, ActionResponse response)
	throws PortletException, IOException {

		return mapping.findForward(getForward(
			request, "siteinfo_jsp.thumbnail.edit_site_thumbnail"));
	}

	protected void updateThumbnail(ActionRequest actionRequest)
		throws Exception {

		if (_log.isDebugEnabled()) {
			PortletRequestUtil.testMultipartWithCommonsFileUpload(
				actionRequest);
		}

		UploadPortletRequest uploadPortletRequest =
			PortalUtil.getUploadPortletRequest(actionRequest);

		//User user = PortalUtil.getSelectedUser(uploadPortletRequest);
		
		long currentSiteId = ParamUtil.getLong(uploadPortletRequest, "siteId");

		//get site object from siteid
		whp_sites currentSite = whp_sitesLocalServiceUtil.getSiteBySiteId(currentSiteId);
		
		InputStream inputStream = uploadPortletRequest.getFileAsStream(
			"fileName");

		if (inputStream == null) {
			throw new UploadException();
		}

		byte[] bytes = FileUtil.getBytes(inputStream);

	whp_sitesLocalServiceUtil.updateThumbnail(currentSite.getSite_id(), bytes);
		//UserServiceUtil.updatePortrait(user.getUserId(), bytes);
	}

	private static Log _log = LogFactoryUtil.getLog(
			editSiteThumbnailAction.class);

}*/