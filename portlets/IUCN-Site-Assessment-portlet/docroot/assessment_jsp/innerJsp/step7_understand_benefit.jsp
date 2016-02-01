<%@page import="com.iucn.whp.dto.BenefitDTO"%>
<%@include file="/init_import.jsp" %>



<%
 List<benefits>  lstbenefit=null;
//List<benefit_rating_lkp> lstbenefitratinglkp=null;
//List<benefit_checktype_lkp> lstbenefit_checktype_lkp =null;
//List<benefit_checksubtype_lkp>  lstbenefit_checksubtype_lkp=null;
List<BenefitDTO> lstclassBenefit=new ArrayList<BenefitDTO>();
List<benefits_type_ref> lstbenefitstyperef=null;

long benefitid=0;



try{
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstbenefit=benefitsLocalServiceUtil.getbenefitByVersion(assesmentVersionId);
	
	int i=1;
	
	if(lstbenefit.size()>0)
	{
	 benefitid = lstbenefit.get(0).getBenefits_id();
	
	
	lstbenefitstyperef =benefits_type_refLocalServiceUtil.findByBenefitsId(benefitid);
	
	for(benefits  lst_benefits   : lstbenefit )
	{
		
	BenefitDTO objbenefit = new BenefitDTO();
	
	List<benefit_checksubtype_lkp> objSubTypelkp=new ArrayList<benefit_checksubtype_lkp>();
	
	//getting subtype list 
	 List<benefits_type_ref> objbenefits_type_ref=benefits_type_refLocalServiceUtil.findByBenefitsId(lst_benefits.getBenefits_id());
	 long benefitType=0;
	 
	 for(benefits_type_ref benefits_type_refTemp: objbenefits_type_ref){
		 
		 benefitType=benefits_type_refTemp.getBenefit_checktype();
		 
		 long subType=benefits_type_refTemp.getBenefit_checksubtype();
		 
		 objSubTypelkp.add(benefit_checksubtype_lkpLocalServiceUtil.getbenefit_checksubtype_lkp(subType));
	 }
	 objbenefit.setObjbenefits(lst_benefits);
	 objbenefit.setCount(i);
	 i++;
	 
	 //set type
	 if(benefitType>0){
		 objbenefit.setBenefitchecktypelkp(benefit_checktype_lkpLocalServiceUtil.getbenefit_checktype_lkp(benefitType));
	 }
	
	 
	 //set subtype
	 
	
	if(lst_benefits!=null){
		objbenefit.setBenefitchecksubtypelkp(objSubTypelkp);
		
		if(lst_benefits.getCommunity_outside_site()>0)
		{
		 objbenefit.setBenefitratingOutside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getCommunity_outside_site()));
		}
		
		
		if(lst_benefits.getCommunity_within_site()>0)
		{
		 objbenefit.setBenefitratingInside(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getCommunity_within_site()));
		}
		
		
		
		if(lst_benefits.getWider_community()>0)
		{
		 objbenefit.setBenefitratingWider(benefit_rating_lkpLocalServiceUtil.getbenefit_rating_lkp(lst_benefits.getWider_community()));
		}
		
		
		objbenefit.setObjbenefits(lst_benefits);
		 lstclassBenefit.add(objbenefit);
		 
		 
		  if(objbenefit.getObjbenefits().getData_deficient()==true)
		 {
			  objbenefit.setDatadeficent("Data deficient"); 
		 } 
		  else
		  {
			  objbenefit.setDatadeficent("Present"); 

		  }
		 
	}
	 
	}
	}

}catch(Exception e)

{

	
	e.printStackTrace();

}

%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/site7_benefits_pop.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step7_understand_benefit.jsp"/>
<c:set var="currentDiv" value="step7Div"/> 



<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>No</th>
<th>Benefit Type</th>
<th>Checklist of benefits</th>
<th>State</th>
<th>Summary</th>
<th style="width:80px;">Comm. Within Site</th>
<th style="width:80px;">Comm. Outside Site</th>
<th>Wider Community</th>
<th>Edit / Delete</th>
</tr>
<%
if(lstclassBenefit.isEmpty())
{
	%>
	<tr>
	<td colspan=9 align="center"><span class="blankCellStyle">Add  Benefits</span></td>
	
	
	</tr><script>
	$("#step7").removeClass('aui-state-complete');
	</script>	<%
	
}%>

<c:forEach items="<%=lstclassBenefit%>" var="understandingbenefit" varStatus="status">	
<%
BenefitDTO benefitDTO =(BenefitDTO)pageContext.getAttribute("understandingbenefit");
List<benefit_checksubtype_lkp> lstBenifitSub = benefitDTO.getBenefitchecksubtypelkp();
int lstSize= lstBenifitSub.size();

%>	
<c:forEach items="${understandingbenefit.getBenefitchecksubtypelkp()}" var="subtype" varStatus="status">
<%-- <c:out value="${status.count)"/>
 --%>
 <c:if test="${status.count eq 1}">

<tr id="${understandingbenefit.getObjbenefits().getBenefits_id()}_TR">
<td rowspan="<%=lstSize %>"><c:out value="${understandingbenefit.getCount()}" /></td>
<td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}CTY_TD"><c:out value="${understandingbenefit.getBenefitchecktypelkp().getBenefit_checktype()}" /></td>

<td id="${understandingbenefit.getObjbenefits().getBenefits_id()}_${subtype.getSubbenefit_id() }_SUB_TD" style="width:200px;">
<c:out value="${subtype.getBenefit_checksubtype()}" />
</td>


<td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}DD_TD" ><c:out value="${understandingbenefit.getDatadeficent()}" /></td>
<td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}SM_TD"><c:out value="${understandingbenefit.getObjbenefits().getSummary()}" /></td>
<td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}CW_TD"><c:out value="${understandingbenefit.getBenefitratingInside().getRating()}" /></td>
<td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}CO_TD"><c:out value="${understandingbenefit.getBenefitratingOutside().getRating()}" /></td>
<td rowspan="<%=lstSize %>" id="${understandingbenefit.getObjbenefits().getBenefits_id()}WC_TD"><c:out value="${understandingbenefit.getBenefitratingWider().getRating()}" /></td>

<td rowspan="<%=lstSize %>" class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${understandingbenefit.getObjbenefits().getBenefits_id()}','Understanding Benefits..',event); return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${understandingbenefit.getObjbenefits().getBenefits_id()}','Understanding Benefits');" class="delete">delete</a>
</div>
</td>
</tr>
</c:if>
<c:if test="${status.count >1}">
<TR>
<td id="${understandingbenefit.getObjbenefits().getBenefits_id()}_${subtype.getSubbenefit_id() }_SUB_TD" style="width:200px;">
<c:out value="${subtype.getBenefit_checksubtype()}" />
</td>
</TR>
</c:if>
</c:forEach>

</c:forEach> 
</tbody></table>

 