package com.iucn.whp.portlet.util;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import org.apache.commons.lang.StringUtils;

import javax.portlet.PortletRequest;

public class PortalUtils {

    public static ThemeDisplay getThemeDisplay(PortletRequest request) {
        return (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
    }

    public static String getUserRoleName(User user) throws Exception {
        long assessorRoleId = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Assessor").getRoleId();
        boolean hasAssessorRole =  UserLocalServiceUtil.hasRoleUser(assessorRoleId, user.getUserId());

        if (hasAssessorRole) {
            return "Assessor";
        }

        long reviewerRoleId = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Reviewer").getRoleId();
        boolean hasReviewerRole =  UserLocalServiceUtil.hasRoleUser(reviewerRoleId, user.getUserId());

        if (hasReviewerRole) {
            return "Reviewer";
        }

        long coordinatorRoleId = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Coordinator").getRoleId();
        boolean hasCoordinatorRole =  UserLocalServiceUtil.hasRoleUser(coordinatorRoleId, user.getUserId());

        if (hasCoordinatorRole) {
            return "Coordinator";
        }

        return StringUtils.EMPTY;
    }

}
