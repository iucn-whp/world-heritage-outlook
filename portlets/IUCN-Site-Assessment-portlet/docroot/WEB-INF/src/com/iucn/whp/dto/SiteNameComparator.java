package com.iucn.whp.dto;

import com.liferay.portal.kernel.util.OrderByComparator;

public class SiteNameComparator extends OrderByComparator{

	public static String ORDER_BY_ASC = "status ASC";  
	public static String ORDER_BY_DESC = "status DESC";    
	public SiteNameComparator(){
		this(false);
		}   
	public SiteNameComparator(boolean asc) {
		_asc = asc;
		}
	public int compare(Object obj1, Object obj2) {
		SiteAssessmentDTO instance1 = (SiteAssessmentDTO) obj1;
		SiteAssessmentDTO instance2 = (SiteAssessmentDTO) obj2;
		int value = instance1.getSiteName().toLowerCase().compareTo(instance2.getSiteName().toLowerCase());
		if(_asc){
				return value;
			} else{
				return -value;
			}
		}   
	public String getOrderBy() {
		if (_asc) {
			return ORDER_BY_ASC;
			}
		else {
			return ORDER_BY_DESC;
			}
		}
	private boolean _asc;
}
