/*package com.iucn.whp.dbservice.model;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.webserver.WebServerServletTokenUtil;

public class whpSiteConstants {

	public static String getThumbnailURL(
			String imagePath, long thumbnailId) {

			StringBundler sb = new StringBundler(7);

			sb.append(imagePath);
			sb.append("/whpsite_");

			if (male) {
				sb.append("male");
			}
			else {
				sb.append("female");
			}

			sb.append("thumbnail?img_id=");
			sb.append(thumbnailId);
			sb.append("&t=");
			sb.append(WebServerServletTokenUtil.getToken(thumbnailId));

			return sb.toString();
		}
	
}
*/