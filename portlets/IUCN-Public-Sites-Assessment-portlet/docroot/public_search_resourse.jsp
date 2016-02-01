<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.iucn.whp.util.SearchUtil"%>
<%@page import="com.iucn.whp.sites.utils"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.site_assessmentUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.benefits_type_refUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.assessing_threats_potentialUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.assessing_threats_currentUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.benefits_summaryPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.benefits_summaryUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.active_conservation_projectsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.state_lkpUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.referencesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.assessment_whvaluesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.threat_rating_lkpUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.state_trend_whvaluesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlookUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.site_assessment_versionsPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.site_assessmentPersistence"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil" %>
<%@page import="java.util.List"%>
<%@ page import="com.iucn.whp.dbservice.model.country_lkp"%>
<%@ page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.Locale"%>
<%@ page import="com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil" %>
<%@ page import="com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil"%>
<%@ include file="/init.jsp"%>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.portal.PortalException"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.liferay.portal.kernel.portlet.*"%>
<%@page import="javax.portlet.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil" %>
<portlet:defineObjects />


<%
List<whp_sites> lst_whp_sites = new ArrayList<whp_sites>();
String siteName=ParamUtil.getString(request, "siteName");
int countryId=ParamUtil.getInteger(request, "countryID");
String searchType=ParamUtil.getString(request, "searchType");

	
if(searchType.equalsIgnoreCase("advanceSearch"))
{
		
	
	
		long[] lstSiteId = ParamUtil.getLongValues(request, "siteIds");
				
		 	   if(lstSiteId!=null ){
		    		for(long siteId:lstSiteId){
		    		try {
		    			whp_sites siteInfo = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);
		    				if(siteInfo!=null)
		    					lst_whp_sites.add(siteInfo);
		 			} catch (Exception  e) {
		 				
		 				e.printStackTrace();
		 			}
		    	}

			}	
}
else
{
	
	
	try{
		
		lst_whp_sites=SearchUtil.getsiteList(siteName);
		
	}catch(Exception e )
	{
		e.printStackTrace();
	}
}


	List resultsList = null;
	String ppnetLink = "http://www.protectedplanet.net/sites/";
	String unescoLink = "http://whc.unesco.org/en/list/";
%>

<%

PortletURL assessmentPageURL=null;
try{
	assessmentPageURL = (PortletURL)liferayPortletResponse.createRenderURL();
	assessmentPageURL.setParameter("jspPage", "/view.jsp");
	assessmentPageURL.setParameter("isSearch", "Y");
	pageContext.setAttribute("lst_whp_sites", lst_whp_sites,PageContext.SESSION_SCOPE);
  }catch(Exception ex){
	  ex.getStackTrace();
	  
}
%>
		
			<div id="listViewDiv">

          <%if(searchType.equalsIgnoreCase("advanceSearch") || searchType.equalsIgnoreCase("keywordSearch") ){  %>
         <span class="totalSites">
         
         <span class="resultsText">Results:</span>
         
         <span class="sitesResultCount"> <%=lst_whp_sites.size() %> Sites</span>
         
         
         <a class="clearAnchor" onClick="self.location = '<portlet:renderURL><portlet:param name="view" value="" /></portlet:renderURL>';">Clear Search</a>
         
         </span>
          <%
          }
          %>
				<liferay-ui:search-container
					emptyResultsMessage="there-are-no-Sites" delta="30" iteratorURL="<%=assessmentPageURL %>">
					<liferay-ui:search-container-results>
						<%
						if(lst_whp_sites!=null && lst_whp_sites.size()>0){
							results = ListUtil.subList(lst_whp_sites,
									searchContainer.getStart(),
									searchContainer.getEnd());
							total = lst_whp_sites.size();
						}
							
									resultsList = results;
									pageContext.setAttribute("results", results);
									pageContext.setAttribute("total", total);

						%>
					</liferay-ui:search-container-results>

					<liferay-ui:search-container-row
						className="com.iucn.whp.dbservice.model.whp_sites"
						keyProperty="site_id" modelVar="sites">

						<%
							long tempSiteID = sites.getSite_id();
									String siteNamefirst = sites.getName_en();
									String titlesiteNamefirst=sites.getName_en();
									if(siteNamefirst.length()>45)
									{
										siteNamefirst=siteNamefirst.substring(0,40);
										siteNamefirst=siteNamefirst+"....";
									}

									long wdpa_id_first_site = sites.getWdpa_id();
									long unesco_id_first_site = sites.getUnesco_id();
									String ppnet_url1 = ppnetLink
											+ String.valueOf(wdpa_id_first_site);
									String unesco_url1 = unescoLink
											+ String.valueOf(unesco_id_first_site);

									String temp = "<a href='" + ppnet_url1
											+ "' target='blank' />";
											
											
											// for country 
											
											List<country_lkp> lkpcntry=whp_sitesLocalServiceUtil.getCountryListBySiteId(tempSiteID);
											
											String coutry_name="";
											
											for(int i=0;i<lkpcntry.size();i++)
											{
												coutry_name=lkpcntry.get(i).getName();
											}

											
											// for Incription year
										
											whp_sites objwhp_sitesBasic=null;
											objwhp_sitesBasic=whp_sitesLocalServiceUtil.getwhp_sites(tempSiteID);
											     
											
										//String Incdate=	objwhp_sitesBasic.getInscription_date().toString().substring(23);
										 String Incdate="";
										 SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");
										 Incdate = DATE_FORMAT.format( objwhp_sitesBasic.getInscription_date());
										 
										
										// for criteria  
										
										String criteria="";
										String Sitecriteria="";
										String finalcriteria="";

										List<whp_sites_inscription_criteria> lstcriteria=whp_sites_inscription_criteriaLocalServiceUtil.findbysite_id(tempSiteID);
										List<inscription_criteria_lkp> lstInscriptionCriterialkp=null;
                                          
										inscription_criteria_lkp obj= new inscription_criteria_lkpClp(); 
										
										if(lstcriteria!=null && !lstcriteria.isEmpty())
										{
											for(int n=0;n<lstcriteria.size();n++)
											{
												obj=inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(lstcriteria.get(n).getCriteria_id());
												criteria=obj.getCriteria();
												Sitecriteria = Sitecriteria+","+criteria;

											}
											 finalcriteria=Sitecriteria.substring(1);

										}
										
										
										// for rating 
										
										
    				List<conservation_outlook>  lstconservation_out =new ArrayList<conservation_outlook>();
    				conservation_outlook_rating_lkp objoutlook_rating_lkp= new conservation_outlook_rating_lkpClp();
    				String rating ="";
										
								    	List<site_assessment> lst_site_assessment=site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(tempSiteID);
										if (!lst_site_assessment.isEmpty()) {
					    					for(site_assessment obj_site_assessment:lst_site_assessment){
					    						if(!obj_site_assessment.isIs_active()){
					    							long assessmentId = obj_site_assessment.getAssessment_id();
					    							List<assessment_lang_version> assessment_lang_versionlist = assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessmentId);

					    							if (!assessment_lang_versionlist.isEmpty()) {
					    								for (assessment_lang_version objassessment_lang_version : assessment_lang_versionlist) {
					    									if (objassessment_lang_version.getPublished()) {
					    									long asses_mentid=objassessment_lang_version.getAssessment_version_id();
					    									if(asses_mentid!=-1)
					    									{
					    					    				
					    									lstconservation_out=conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(asses_mentid);
					    						          
					    									if(lstconservation_out!=null && !lstconservation_out.isEmpty())
					    									{
					    										for(int i=0;i<lstconservation_out.size();i++)
					    										{
					    											objoutlook_rating_lkp=	conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(lstconservation_out.get(i).getRating());
					    											
					    											rating=	objoutlook_rating_lkp.getCo_rating();
					    											
					    										}
					    									}
					    									
					    									}
					    								}
					    							}
					    						}
					    						
					    					}
					    					
					    				}
					        			
					        		}
											
									Map<String, Long> assessmntVersionLangMap = new HashMap<String, Long>();
									assessmntVersionLangMap = utils.getLangVersionDetails(tempSiteID);
									
									PortletURL rowURL_en = liferayPortletResponse
											.createRenderURL();
									PortletURL rowURL_fr = liferayPortletResponse
											.createRenderURL();
									PortletURL rowURL_sp = liferayPortletResponse
											.createRenderURL();
									PortletURL rowURL_Final = liferayPortletResponse
									.createRenderURL();
									if (!assessmntVersionLangMap.isEmpty()) {
										if (assessmntVersionLangMap.containsKey("en")) {
											rowURL_en.setParameter("jspPage",
													"/site_asssessment_summary.jsp");
											rowURL_en.setParameter("language","en" + "");
											rowURL_en.setParameter("wdpaid", wdpa_id_first_site + "");
											rowURL_Final = rowURL_en;
										}
										if (assessmntVersionLangMap.containsKey("fr")) {
											rowURL_fr.setParameter("jspPage",
													"/site_asssessment_summary.jsp");
											rowURL_fr.setParameter("language","fr" + "");
											rowURL_fr.setParameter("wdpaid", wdpa_id_first_site + "");
											rowURL_Final = rowURL_fr;
										}
										if (assessmntVersionLangMap.containsKey("es")) {
											rowURL_sp.setParameter("jspPage",
													"/site_asssessment_summary.jsp");
											rowURL_sp.setParameter("language","es" + "");
											rowURL_sp.setParameter("wdpaid", wdpa_id_first_site + "");
											rowURL_Final = rowURL_sp;
										}
									}
						%>

						<div class="sitePopup">
							<div class="siteThumbnail">
									<%
										String thumbnailUrl = "";
										if(sites.getThumbnailid_small() != 0 && sites.getThumbnailid_small()>0){
											
											
											ThemeDisplay themeDisplay = new ThemeDisplay();
											long thumbnailID = sites.getThumbnailid_small();
											try{
												if(DLAppServiceUtil.getFileEntry(thumbnailID)!=null){
													FileEntry fe = DLAppServiceUtil.getFileEntry(thumbnailID); 
													thumbnailUrl = DLUtil.getThumbnailSrc(fe, null,themeDisplay);
													boolean boolImg_En = false;
													if(assessmntVersionLangMap.containsKey("en")){
														boolImg_En = true;
												%>
														<a href="<%=rowURL_en%>"><img src="<%=thumbnailUrl %>"/></a>
												<%					
													}else if(assessmntVersionLangMap.containsKey("fr")){
												%>
														<a href="<%=rowURL_fr%>"><img src="<%=thumbnailUrl %>"/></a>
												<%		
													}else if(assessmntVersionLangMap.containsKey("es")){
												%>
														<a href="<%=rowURL_sp%>"><img src="<%=thumbnailUrl %>"/></a>
												<%	
													}else{
												%>
														<img src="<%=thumbnailUrl %>" />
												<%		
													}
												%>
									<%					
												}else{
									%>
													<div class="ImageNotAvailableBox">
													</div>
									<%				
												}
									%>
									<%										
											}catch(Exception e){
												e.printStackTrace();
									%>
												<div class="ImageNotAvailableBox">
													</div>
									<%				
											}
									%>		
									<%
										} else{
									%>
											<div class="ImageNotAvailableBox">
													</div>
									<%		
										}
									%>
									
								</div>
								
								
							<%
								boolean boolName_En = false;
								if(assessmntVersionLangMap.containsKey("en")){
									boolName_En = true;
							%>
								<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=coutry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in<%=Incdate %></span></div> <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> <div>
								
								<%if(rating.equals("Significant Concern")){ %>
																
								<span class="ratingStatusSignificantConcern"><%=rating %></span>
								
								<%}else if(rating.equals("Critical")){ %>
								
								<span class="ratingStatusCritical"><%=rating %></span>
								
								<%}else if(rating.equals("Data Deficient")){ %>
								
								<span class="ratingStatusDataDeficient"><%=rating %></span>
																
								<%}else if(rating.equals("Good with some concerns")){ %>
								
								<span class="ratingStatusGoodWithSomeConcerns"><%=rating %></span>
								
								<%}else if(rating.equals("Good")){ %>
																
								<span class="ratingStatusGood"><%=rating %></span>
								
								<%} %>
								
								
								
								</div> <a href="<%=rowURL_Final%>"  class="moreSiteInfo readMoreSiteInfo">&gt;&gt;&nbsp;Read more</a> </div>
							<%		
								} 
							%>
							
							<%
								if(!boolName_En){
									if(assessmntVersionLangMap.containsKey("fr")){
							%>
										<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=coutry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Incdate %></span></div> <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> <div>
										
								<%if(rating.equals("Significant Concern")){ %>
																
								<span class="ratingStatusSignificantConcern"><%=rating %></span>
								
								<%}else if(rating.equals("Critical")){ %>
								
								<span class="ratingStatusCritical"><%=rating %></span>
								
								<%}else if(rating.equals("Data Deficient")){ %>
								
								<span class="ratingStatusDataDeficient"><%=rating %></span>
																
								<%}else if(rating.equals("Good with some concerns")){ %>
								
								<span class="ratingStatusGoodWithSomeConcerns"><%=rating %></span>
								
								<%}else if(rating.equals("Good")){ %>
																
								<span class="ratingStatusGood"><%=rating %></span>
								
								<%} %>
										
										
										</div> <a href="<%=rowURL_Final%>"  class="moreSiteInfo readMoreSiteInfo">&gt;&gt;&nbsp;Read more</a> </div>	
							<%			
									}else if(assessmntVersionLangMap.containsKey("es")){
							%>
										<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=coutry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Incdate %></span></div> <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> <div>
										
						       <%if(rating.equals("Significant Concern")){ %>
																
								<span class="ratingStatusSignificantConcern"><%=rating %></span>
								
								<%}else if(rating.equals("Critical")){ %>
								
								<span class="ratingStatusCritical"><%=rating %></span>
								
								<%}else if(rating.equals("Data Deficient")){ %>
								
								<span class="ratingStatusDataDeficient"><%=rating %></span>
																
								<%}else if(rating.equals("Good with some concerns")){ %>
								
								<span class="ratingStatusGoodWithSomeConcerns"><%=rating %></span>
								
								<%}else if(rating.equals("Good")){ %>
																
								<span class="ratingStatusGood"><%=rating %></span>
								
								<%} %>
										
										
										</div> <a href="<%=rowURL_Final%>"  class="moreSiteInfo readMoreSiteInfo">&gt;&gt;&nbsp;Read more</a> </div>
							
							<%}	%>	
							
 				         <%} %>	
									
								
								<%if(searchType.equalsIgnoreCase("keywordSearch")&&!(assessmntVersionLangMap.containsKey("en"))&&!(assessmntVersionLangMap.containsKey("fr"))&&!(assessmntVersionLangMap.containsKey("es"))){ %>

									
									<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=coutry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Incdate %></span></div> <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> <div>
										
							   <%if(rating.equals("Significant Concern")){ %>
																
								<span class="ratingStatusSignificantConcern"><%=rating %></span>
								
								<%}else if(rating.equals("Critical")){ %>
								
								<span class="ratingStatusCritical"><%=rating %></span>
								
								<%}else if(rating.equals("Data Deficient")){ %>
								
								<span class="ratingStatusDataDeficient"><%=rating %></span>
																
								<%}else if(rating.equals("Good with some concerns")){ %>
								
								<span class="ratingStatusGoodWithSomeConcerns"><%=rating %></span>
								
								<%}else if(rating.equals("Good")){ %>
																
								<span class="ratingStatusGood"><%=rating %></span>
								
								<%} %>
										
										</div> <span class="comingsoon">Coming soon</span><%-- <a href="<%=rowURL_en%>" class="moreSiteInfo readMoreSiteInfo">&gt;&gt;Read more</a> --%> </div>
							<%		
									}
							%>
							
							
							<%if(searchType.equalsIgnoreCase("advanceSearch")&&!(assessmntVersionLangMap.containsKey("en"))&&!(assessmntVersionLangMap.containsKey("fr"))&&!(assessmntVersionLangMap.containsKey("es"))){ %>

									
									<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=coutry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Incdate %></span></div> <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> <div>
										
							   <%if(rating.equals("Significant Concern")){ %>
																
								<span class="ratingStatusSignificantConcern"><%=rating %></span>
								
								<%}else if(rating.equals("Critical")){ %>
								
								<span class="ratingStatusCritical"><%=rating %></span>
								
								<%}else if(rating.equals("Data Deficient")){ %>
								
								<span class="ratingStatusDataDeficient"><%=rating %></span>
																
								<%}else if(rating.equals("Good with some concerns")){ %>
								
								<span class="ratingStatusGoodWithSomeConcerns"><%=rating %></span>
								
								<%}else if(rating.equals("Good")){ %>
																
								<span class="ratingStatusGood"><%=rating %></span>
								
								<%} %>
										
										</div> <span class="comingsoon">Coming soon</span><%-- <a href="<%=rowURL_en%>" class="moreSiteInfo readMoreSiteInfo">&gt;&gt;Read more</a> --%> </div>
							<%		
									}
							%>
							
							<%-- <div class="siteNameWrapper"><span><%=siteNamefirst%></span></div> --%>
							<div class="editIconsPublicPagesWrapper">
								<a href="<%=unesco_url1%>" class="editIconsPublicPages icon1" target="_blank"></a> 
								<a href="<%=ppnet_url1%>" class="editIconsPublicPages icon2" target="_blank"></a>								
							</div>
						</div>

					</liferay-ui:search-container-row>
					<liferay-ui:search-iterator />
				</liferay-ui:search-container>
				</div>
			
<script type="text/javascript">
	$(document).ready(function(){
		$('tr:even').css('background-color','#f2fafc');
		$('tr:odd').css('background-color','#fff');
		$("#backHref").show();
		
	});
</script>
