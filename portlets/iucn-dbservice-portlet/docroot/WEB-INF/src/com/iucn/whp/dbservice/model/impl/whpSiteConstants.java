package com.iucn.whp.dbservice.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.webserver.WebServerServletTokenUtil;

public class whpSiteConstants {

	public static String getThumbnailURL(
			String imagePath, boolean male, long thumbnailId) {

			StringBundler sb = new StringBundler(7);

			sb.append(imagePath);
			sb.append("/user_");

			if (male) {
				sb.append("male");
			}
			else {
				sb.append("female");
			}

			sb.append("_portrait?img_id=");
			sb.append(thumbnailId);
			sb.append("&t=");
			sb.append(WebServerServletTokenUtil.getToken(thumbnailId));

			return sb.toString();
		}
	
}
