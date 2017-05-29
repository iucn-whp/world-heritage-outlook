package com.iucn.whp.assesment.utils.implcomparator;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;

/**
 * Created by A-Lugovskoy
 */
public class FirstNameComparator extends OrderByComparator {

    public static String ORDER_BY_ASC = "status ASC";

    public static String ORDER_BY_DESC = "status DESC";


    public FirstNameComparator() {
        this(false);
    }

    public FirstNameComparator(boolean asc) {
        _asc = asc;
    }


    public int compare(Object obj1, Object obj2) {

        User instance1 = (User) obj1;
        User instance2 = (User) obj2;

        int value = instance1.getFirstName().toLowerCase().compareTo(instance2.getFirstName().toLowerCase());

        if (_asc) {
            return value;
        } else {
            return -value;
        }
    }

    public String getOrderBy() {

        if (_asc) {
            return ORDER_BY_ASC;
        } else {
            return ORDER_BY_DESC;
        }
    }

    private boolean _asc;

}
