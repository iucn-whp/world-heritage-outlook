<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portlet.journal.model.JournalArticle"%>
<%@page import="com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.whp_sites_countryUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page	import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page	import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.sites.utils"%>
<%@page import="com.iucn.whp.dbservice.model.country_lkp"%>
<%@page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.Locale"%>
<%@page import="com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil"%>
<%@include file="/init.jsp"%>

<%@page import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@page import="com.liferay.portal.PortalException"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.liferay.portal.kernel.portlet.*"%>
<%@page import="javax.portlet.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<portlet:defineObjects />
<liferay-theme:defineObjects /> 

	
		
		
	<portlet:defineObjects />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style_Psa.css" />
<!-- style_IUCN_site_assessment -->

<script type="text/javascript">
	$(document).ready(function() {
		/*table rows color*/
		$('tr:even').css('background-color', '#f2fafc');
		$('tr:odd').css('background-color', '#fff');
		$('.breadCrumb li:last a').css('color', '#868686');
		$('.portlet-layout tr').css('background','transparent');
		$('.multiSelectContainer select option').addClass('optionDefault');
		});
</script>

	<!-- Wrapper Starts here
	<div id="wrapper"> -->
	
	<div class="gaugeHolder"></div>
		<div class="sitesHeaderText">
		<%
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long lGroupId = themeDisplay.getLayout().getGroupId();
		JournalArticle publicPageHeaderArticle = null;
		String sArticleId = "";
		try
		{
			publicPageHeaderArticle = JournalArticleLocalServiceUtil.getLatestArticleByUrlTitle(lGroupId,"sites-page-header-description",WorkflowConstants.STATUS_APPROVED);
			sArticleId = publicPageHeaderArticle.getArticleId();
		}catch (Exception ex){
			sArticleId = "";
		}
		%>
		<liferay-ui:journal-article articleId="<%=sArticleId%>" groupId="<%= lGroupId %>"/>
	</div>
	<div id="sitesearchDiv">
			<%@include file="/search.jsp" %>
		</div> 
		
			<div id="sitesearchDiv">
			<%@include file="/custom_search.jsp" %>
		</div>
		
		<!--bodyContent starts here-->
		
		
		 <!-- <div class="bodyContent"> -->
			<!-- <div class="bodyContentHeader">World Heritage Sites Names</div> -->
			<%
			List<whp_sites> lst_whp_sites=new ArrayList<whp_sites>();
			//// for pageURL in search Container ... 
			
			String isSearch=ParamUtil.getString(request, "isSearch");
			
			
			
		
			
			   PortletURL whp_sitesSearchURL=null;
			   List resultsList = null;
				String pageUrl="N";
				String ppnetLink="";
				String unescoLink="";
			
			String siteIds = "";
			if(isSearch==null || isSearch.isEmpty() || isSearch.equalsIgnoreCase("N")){

				lst_whp_sites = whp_sitesLocalServiceUtil.getAllActiveSites();
				
				 ppnetLink = "http://www.protectedplanet.net/sites/";
				 unescoLink = "http://whc.unesco.org/en/list/";
				
				
			}else
			{
				lst_whp_sites= (List<whp_sites>)session.getAttribute("lst_whp_sites");
				pageUrl="Y";
			}
			//setting value of iterator of search container
		 
			
		    whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
		    whp_sitesSearchURL.setParameter("jspPage", "/view.jsp");
		    whp_sitesSearchURL.setParameter("isSearch", pageUrl);
		    whp_sitesSearchURL.setWindowState(WindowState.MAXIMIZED);
		    
		    //portletURL.setWindowState(WindowState.MAXIMIZED);
		    

				
			%>
			
			
			
      <!--      showing total sites count............. -->
      
        
			<div id="listViewDiv">
			<% 
		if(isSearch==null || isSearch.isEmpty() || isSearch.equalsIgnoreCase("N")){ 
  				lst_whp_sites = whp_sitesLocalServiceUtil.getAllActiveSites();

			%>
			         <span class="totalSites">
			         
			         <span class="resultsText">Results:</span>
			         <span class="sitesResultCount"> <%=lst_whp_sites.size() %> Sites</span>
			         
			         <a class="clearAnchor" onClick="self.location = '<portlet:renderURL><portlet:param name="view" value="" /></portlet:renderURL>';">Clear Search</a>
			         
			         </span>
			         
			         
			         <%}else{
  	 lst_whp_sites= (List<whp_sites>)session.getAttribute("lst_whp_sites");
   	//if the page is redirected from a page other than public site assessment page results will be null
   	//in this case all request should be redirected to default filter page.without the clear filter option
   	
   	if (lst_whp_sites==null)
   	{
   		lst_whp_sites = whp_sitesLocalServiceUtil.getAllActiveSites();
   		%>
        <span class="totalSites">
        
        <span class="resultsText">Results:</span>
        <span class="sitesResultCount"> <%=lst_whp_sites.size() %> Sites</span>
        
        <%-- <a class="clearAnchor" onClick="self.location = '<portlet:renderURL><portlet:param name="view" value="" /></portlet:renderURL>';">Clear Search</a> --%>
        
        </span>
        <%
   	}else
   	{
			     %>
			     
			          <span class="totalSites">
			          <span class="resultsText">Results:</span>
			          <span class="sitesResultCount"> <%=lst_whp_sites.size() %> Sites</span>
			        
	  <a class="clearAnchor" onClick="self.location = '<portlet:renderURL><portlet:param name="view" value="" /></portlet:renderURL>';">Clear Search</a>
			           
			          </span>
			          <%}} %> 
			      
				<liferay-ui:search-container
					emptyResultsMessage="there-are-no-Sites" iteratorURL="<%=whp_sitesSearchURL %>" delta="30">

					<liferay-ui:search-container-results>
						<%
							results = ListUtil.subList(lst_whp_sites, searchContainer.getStart(), searchContainer.getEnd());
							total = lst_whp_sites.size();
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
									String ppnet_url1 = ppnetLink + String.valueOf(wdpa_id_first_site);
									String unesco_url1 = unescoLink	+ String.valueOf(unesco_id_first_site);
									String temp = "<a href='" + ppnet_url1 + "' target='blank' />";
									List<country_lkp> lkpcountry=whp_sitesLocalServiceUtil.getCountryListBySiteId(tempSiteID);
									
									String cntry_name="";
									
									for(int i=0;i<lkpcountry.size();i++)
									{
										cntry_name=lkpcountry.get(i).getName();
									}
									
									whp_sites objwhp_siteBasic=null;
									objwhp_siteBasic=whp_sitesLocalServiceUtil.getwhp_sites(tempSiteID);
									     
									
								//String Indate=	objwhp_siteBasic.getInscription_date().toString().substring(23);
								String Indate="";
										 SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");
										 Indate = DATE_FORMAT.format( objwhp_siteBasic.getInscription_date());
										 
								
								
								
								
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
								
									//for lang check
									/* commented by alok */
/* 									List<site_assessment> lst_site_assessment = new ArrayList<site_assessment>();
									Map<String, Long> assessmntVersionLangMap = new HashMap<String, Long>();
									if (tempSiteID != 0 || tempSiteID != -1) {

										lst_site_assessment = site_assessmentLocalServiceUtil
												.getActiveAssessmentBySiteId(tempSiteID);
										if (!lst_site_assessment.isEmpty()) {
											site_assessment obj_site_assessment = lst_site_assessment
													.get(0);
											long assessmentId = obj_site_assessment
													.getAssessment_id();
											List<assessment_lang_version> assessment_lang_versionlist = assessment_lang_versionLocalServiceUtil
													.findByAssessmentId(assessmentId);

											if (!assessment_lang_versionlist.isEmpty()) {
												for (assessment_lang_version objassessment_lang_version : assessment_lang_versionlist) {
													if (objassessment_lang_version
															.getPublished()) {
														String lang = assessment_lang_lkpMap
																.get(objassessment_lang_version
																		.getLanguageid());
														assessmntVersionLangMap
																.put(lang,
																		objassessment_lang_version
																				.getAssessment_version_id());
													}
												}
											}
										}
									} */
									
									Map<String, Long> assessmntVersionLangMap = new HashMap<String, Long>();
									assessmntVersionLangMap = utils.getLangVersionDetails(tempSiteID);
									
									PortletURL rowURL_en = liferayPortletResponse.createRenderURL();
									PortletURL rowURL_fr = liferayPortletResponse.createRenderURL();
									PortletURL rowURL_sp = liferayPortletResponse.createRenderURL();
									PortletURL rowURL_Final = liferayPortletResponse
									.createRenderURL();
									if (!assessmntVersionLangMap.isEmpty()) {
										if (assessmntVersionLangMap.containsKey("en")) {
											rowURL_en.setParameter("jspPage", "/site_asssessment_summary.jsp");
											rowURL_en.setParameter("language","en" + "");
											rowURL_en.setParameter("wdpaid", wdpa_id_first_site + "");
											rowURL_Final = rowURL_en;
										}
										if (assessmntVersionLangMap.containsKey("fr")) {
											rowURL_fr.setParameter("jspPage", "/site_asssessment_summary.jsp");
											rowURL_fr.setParameter("language","fr" + "");
											rowURL_fr.setParameter("wdpaid", wdpa_id_first_site + "");
											rowURL_Final = rowURL_fr;
										}
										if (assessmntVersionLangMap.containsKey("es")) {
											rowURL_sp.setParameter("jspPage","/site_asssessment_summary.jsp");
											rowURL_sp.setParameter("language","es" + "");
											rowURL_sp.setParameter("wdpaid", wdpa_id_first_site + "");
											rowURL_Final = rowURL_sp;
										}
									}
						%>
					<div class="sitePopupRow">
						<div class="sitePopup">
								<div class="siteThumbnail">
									<%-- <img src="${pageContext.request.contextPath}/images/3_thumb.jpg" /> --%>
									
									 <%
										String thumbnailUrl = "";
										if(sites.getThumbnailid_small() != 0 && sites.getThumbnailid_small()>0){
											//ThemeDisplay themeDisplay = new ThemeDisplay();
											long thumbnailID = sites.getThumbnailid_small();
											try{
												if(DLAppServiceUtil.getFileEntry(thumbnailID)!=null){
													FileEntry fe = DLAppServiceUtil.getFileEntry(thumbnailID); 
													thumbnailUrl = DLUtil.getThumbnailSrc(fe, null,themeDisplay);
													boolean boolImg_En = false;
													if(assessmntVersionLangMap.containsKey("en")){
														boolImg_En = true;
												%>
														<a href="<%=rowURL_Final%>"><img src="<%=thumbnailUrl %>"/></a>
												<%					
													}else if(assessmntVersionLangMap.containsKey("fr")){
												%>
														<a href="<%=rowURL_Final%>"><img src="<%=thumbnailUrl %>"/></a>
												<%		
													}else if(assessmntVersionLangMap.containsKey("es")){
												%>
														<a href="<%=rowURL_Final%>"><img src="<%=thumbnailUrl %>"/></a>
												<%	
													}else{
												%>
														<img src="<%=thumbnailUrl %>" />
												<%		
													}
												%>
													<%-- <img src="<%=thumbnailUrl %>" /> --%>
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
												<%-- <img src="${pageContext.request.contextPath}/images/3_thumb.jpg" /> --%>
												<div class="ImageNotAvailableBox">
												</div>
									<%				
											}
									%>		
									<%
										} else{
									%>
											<%-- <img src="${pageContext.request.contextPath}/images/3_thumb.jpg" /> --%>
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
								<%-- <div class="siteNameWrapper"><span><a href="<%=rowURL_en%>"><%=siteNamefirst%></a></span></div> --%>
								
								
								
								
								<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=cntry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Indate %></span></span></div> <div class="criteria">Criteria  <%=finalcriteria %></div> 
								<div class="ratingHolder">
								
								

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
								
								

								</div> <a href="<%=rowURL_Final%>"  class="moreLink">&gt;&gt;&nbsp;Read more</a> </div>
								
							<%		
								} 
							%>
							
							<%
								if(!boolName_En){
									if(assessmntVersionLangMap.containsKey("fr")){
							%>
									<%-- 	<div class="siteNameWrapper"><span><a href="<%=rowURL_fr%>"><%=siteNamefirst%></a></span></div> --%>
										
										<div class="siteInfo"> <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=cntry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Indate %></span></div> <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> 
										
										<div class="ratingHolder">
										
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
										
										
										</div> <a href="<%=rowURL_Final%>"   class="moreLink">&gt;&gt;&nbsp;Read more</a> </div>
										
											
							<%			
									}else if(assessmntVersionLangMap.containsKey("es")){
							%>
									<%-- 	<div class="siteNameWrapper"><span><a href="<%=rowURL_sp%>"><%=siteNamefirst%></a></span></div> --%>
										
										
										
										
										<div class="siteInfo">
										 <div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div>
										  <div class="country"><%=cntry_name %></div> 
										  <div><span class="nominationYr"></span><span>Nomination Year <%=Indate %></span></span></div>
										   <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div>
                                             
                                             <div class="ratingHolder">
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
								
								
								</div>
								
                                             
										     <a href="<%=rowURL_Final%>"  class="moreLink">&gt;&gt;&nbsp;Read more</a>
										      </div>
							<%			
									}else{
							%>	
										<%-- <div class="siteNameWrapper"><span><%=siteNamefirst%></span></div> --%>
										
										<div class="siteInfo"><div class="siteName" Title="<%=titlesiteNamefirst%>"><%=siteNamefirst%></div> <div class="country"><%=cntry_name %></div> <div><span class="nominationYr"></span><span>Inscribed in <%=Indate %></span></span></div>  <div class="criteria"><span class="criteriaText">Criteria</span>  <%=finalcriteria %></div> <span class="comingsoon">Coming soon</span> </div>
							<%		
									}
							%>
							<%		
								}
							%>
							
							
							<%-- <div class="siteNameWrapper"><span><%=siteNamefirst%></span></div> --%>
							<div class="editIconsPublicPagesWrapper">
								<a href="<%=unesco_url1%>" class="editIconsPublicPages icon1" target="_blank"></a> 
								<a href="<%=ppnet_url1%>" class="editIconsPublicPages icon2" target="_blank"></a>

								<!-- Not required ...comment on 19thMar2013 -->

								<%-- <%
									boolean boolEn = false;
									if (assessmntVersionLangMap.containsKey("en")) {
											boolEn = true;
								%>
									<a href="<%=rowURL_en%>" class="editIconsPublicPages summary_en"></a>
								<%
									}
								%>
								
								<%
									if(!boolEn){
										if(assessmntVersionLangMap.containsKey("fr")){
								%>
											<a href="<%=rowURL_fr%>" class="editIconsPublicPages summary_fr"></a>	
								<%			
										}else if(assessmntVersionLangMap.containsKey("es")){
								%>
											<a href="<%=rowURL_sp%>" class="editIconsPublicPages summary_sp"></a>
								<%			
										}
								%>
								<%		
									}
								%> --%>

							</div>
						</div>
						</div>

					</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
				
				</liferay-ui:search-container>
			</div>
			
<script>
	$(document).ready(function(){
			$('.portlet-body').css('margin','0 auto');
			$('table.taglib-search-iterator th').css({'color':'#1a1a1a','word-wrap':'normal','white-space':'nowrap','text-align':'center'});
			$('th.col-actions').css('width','100px');
			$('.lfr-actions').css('margin-right','3px');
			$('.delta-selector').addClass('deltaSelectorWidth').css({'width':'139px','margin-top':'0.3em'});
			$('.page-selector').addClass('pageSelectorWidth').css({'width':'108px','margin-top':'0.3em'});
			$('.page-links').css('margin-top','0.4em');
			$('.aui-field-label-inline-label').css('margin','0.2em 0 0 0');
			$('table.taglib-search-iterator tr:odd').css('background-color','#ffffff');
			$('table.taglib-search-iterator tr:even').css('background-color','#f2fafc');
			$('.taglib-page-iterator').css({'padding':'0 0 0.6em 0','background-color':'#e7e7e7','border-top':'1px solid #c4c4c4'});
			$('.search-results').css('margin', '1em 0 0 1em') ;
			$('.taglib-page-iterator .search-pages').css('margin','0.5em 1em 0 0');
			$('.aui-field-element').css('float','left');
			$('.advanceSearchBtn').css('padding','0 0.4em');
			$('.aui-field-input').css({'float':'left','margin-left':'0.2em'});
			$('.aui-suffix').css({'display':'inline-block','margin':'0.2em 0 0 0.2em'});
			$('#footer').css('height','none');
			//#f2fafc
			//f5f8fb

			<%-- <%
			if(isSearch.equalsIgnoreCase("Y")) {%>
			  $("#backHref").show();
		  <%} %> --%>
	});
</script>

