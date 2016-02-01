package com.iucn.whp.dto;
import com.liferay.portal.kernel.util.OrderByComparator;

public class SiteNameComparatorUtil extends OrderByComparator{

	public static OrderByComparator getSiteNameOrderByComparator(String orderByCol, String orderByType)
	{
		boolean orderByAsc = false;
		if (orderByType.equals("asc")) {
			orderByAsc = true;
			}
		OrderByComparator orderByComparator = null;
		if (orderByCol.equalsIgnoreCase("Site Name")) {
			orderByComparator = new SiteNameComparator(orderByAsc);
			}
		/*else if (orderByCol.equalsIgnoreCase("Last Name")) {
			orderByComparator = new LastNameComparator(orderByAsc);
			}
		else if (orderByCol.equalsIgnoreCase("Screen Name")) {
			orderByComparator = new ScreenNameComparator(orderByAsc);
			}
		else if (orderByCol.equalsIgnoreCase("Job Title")) {
			orderByComparator = new JobTitleComparator(orderByAsc);
			}*/
		return orderByComparator;
		}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
