package com.iucn.whp.assesment.utils;

import com.iucn.whp.assesment.utils.implcomparator.FirstNameComparator;
import com.iucn.whp.assesment.utils.implcomparator.JobTitleComparator;
import com.iucn.whp.assesment.utils.implcomparator.LastNameComparator;
import com.iucn.whp.assesment.utils.implcomparator.ScreenNameComparator;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * Created by A-Lugovskoy
 */
public class CustomComparatorUtil {

    public static OrderByComparator getUserOrderByComparator(String orderByCol, String orderByType) {

        boolean orderByAsc = false;

        if (orderByType.equals("asc")) {
            orderByAsc = true;
        }

        OrderByComparator orderByComparator = null;


        if (orderByCol.equalsIgnoreCase("First Name")) {

            orderByComparator = new FirstNameComparator(orderByAsc);
        }
        else if (orderByCol.equalsIgnoreCase("Last Name")) {

            orderByComparator = new LastNameComparator(orderByAsc);
        }
        else if (orderByCol.equalsIgnoreCase("Screen Name")) {

            orderByComparator = new ScreenNameComparator(orderByAsc);
        }
        else if (orderByCol.equalsIgnoreCase("Job Title")) {

            orderByComparator = new JobTitleComparator(orderByAsc);
        }

        return orderByComparator;
    }
}
