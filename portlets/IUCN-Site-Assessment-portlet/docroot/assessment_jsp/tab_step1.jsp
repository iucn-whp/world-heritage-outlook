<%@page import="com.iucn.whp.dto.SiteAssessmentValues"%>
<%@include file="/init.jsp" %>
<!--mainBlock Starts Here-->
  <%
  String currAssmentIdforFill=String.valueOf(request.getAttribute("assesmentId"));
  %>
<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper tableWrapperSiteInfoContacts">
	<div class="infoSection">

		<h2 class="siteAssessmentSubHeadings">Identifying And Describing Values
		<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/site1_ind_popup.jsp','','Identifying And Describing Values ',event);return false;" class="addBtn hideAdminAction">+Add Values</a>
		</h2>
		<div class="tipsSection">
		<p class="tiptext">Add Values of selected heritage site by clicking on Add Values link. Value is  identified, described in detail and then cross-referenced to the relevant World Heritage criterion/criteria . Other important biodiversity values grouped and described separately. </p>
		</div>
		
		<div id="indDiv" class="infoSectionContent">
		<jsp:include page="/assessment_jsp/innerJsp/step1_ind.jsp"></jsp:include>
		</div>
	</div>

	<div class="infoSection">
		<h2 class="siteAssessmentSubHeadings">Other Important Biodiversity Values
		<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/site1_bio_popup.jsp','','Other Important Biodiversity Values',event);return false;" class="addBtn hideAdminAction">+Add Values</a>
		</h2>
		<div class="tipsSection">
		<!-- <p class="tiptext">Addendum -Other Important Biodiversity Values (if applicable)</p> -->
		</div>
		
		<div id="oibDiv" class="infoSectionContent">
		<jsp:include page="/assessment_jsp/innerJsp/step1_oib.jsp"></jsp:include>
		</div>
	</div>
	
</div>

<div class="wizardFooter">
<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step2').click();"><span>Next &#62;&#62;</span></a>
</div>


</div>
<div class="buttonsSiteAssessment hideAdminAction">
	<!-- <input type="button" value="Submit for Review" onClick="javascript: submitForReview();"/>
	<input type="button" value="Approve" />
	<input type="button" value="Review Completed" />
	 -->
	<input type="button" value="Fill from previous assessment" onClick="javascript:fillfrompreviouspopup('/assessment_jsp/workflow_jsp/fill_from_previous.jsp','<%=currAssmentIdforFill %>','Fill from previous assessment',event);return false;" />
	
	<input type="button" value="View Differences" onClick="javascript: viewDiff_1();"/>
	<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_1();"/>
	<jsp:include page="/assessment_jsp/tab_buttons.jsp" />
	<%-- <input type="button" value="Next" onclick="javascript:validateStep_1('${versionId}');"/> --%>
</div>
<script type="text/javascript">

	function dynamicPopup(renderJSPURL,id,popupTitle,e) {
		
		var strVersionId = <c:out value="${versionId}"/>
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='versionIdVal' value='versionValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var tempSiteId = tempUrl.replace("versionValue",strVersionId); 
	    var finalUrl=tempSiteId.replace("jspURL",renderJSPURL); 
	   
	    Liferay.Util.openWindow(
				{
					cache: false,
					
					dialog: {
						modal:true,
						align: Liferay.Util.Window.ALIGN_CENTER,
						after: {
							render: function(event) {
								this.set('y', this.get('y') + 150);
							}
						},
						//width: 475,
						resizable:false
						
					},
					dialogIframe: {
						id: 'My_Iframe',
						uri: finalUrl
					},
					title: popupTitle,
					uri: finalUrl
				}
			);
	
	['liferay-util-window']


	}
	
function fillfrompreviouspopup(renderJSPURL,id,popupTitle,e) {
		
		var strVersionId = <c:out value="${versionId}"/>
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='versionIdVal' value='versionValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var tempSiteId = tempUrl.replace("versionValue",strVersionId); 
	    var finalUrl=tempSiteId.replace("jspURL",renderJSPURL); 
	    
	    
	    var left = (screen.width/2-350);
	    var top = (screen.height/2-200);
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		    	 
		           modal: true,
		           resizable: true,
		           draggable: true,
		           xy: [left, top]
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        
		        dialog.show();
		        
		  }); 
	   
	} 

	function mouseY(evt) {
		if (evt.pageY) return evt.pageY;
		else if (evt.clientY)
		   return evt.clientY + (document.documentElement.scrollTop ?
		   document.documentElement.scrollTop :
		   document.body.scrollTop);
		else return null;
		}
	
	function deletePopup(refreshURL,currentDiv,id,popupTitle) {
		//creating url
		
		var strVersionId = <c:out value="${versionId}"/>
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='refreshPage' value='refURL' /><portlet:param name='divVal' value='divValue' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='versionIdVal' value='versionIdValue' /><portlet:param name='tableName' value='tableNameValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var tempDiv=tempUrl.replace("divValue",currentDiv);
	    var temptabName = tempDiv.replace("tableNameValue", popupTitle);
	    var tempSiteId = temptabName.replace("versionIdValue",strVersionId);
	    var refreshPageUrl=tempSiteId.replace("jspURL","/assessment_jsp/popup/delete_records.jsp");
	    var finalUrl=refreshPageUrl.replace("refURL",refreshURL);
	    
	    popupWindow = Liferay.Util.openWindow(
				{
					cache: false,
					dialog: {
						modal:true,
						align: Liferay.Util.Window.ALIGN_CENTER,
						after: {
							render: function(event) {
								this.set('y', this.get('y') + 50);
							}
						},
						width: 350,
						resizable:false
					},
					dialogIframe: {
						id: 'My_Iframe',
						uri: finalUrl
					},
					title: popupTitle,
					uri: finalUrl
				}
			);
	
	['liferay-util-window']

	}
	
	
   function viewDiff_1(){
		
	
		<%
		List<assessment_whvalues> lstwhValues=null;
		List<assessment_whvalues> lstPrevwhValues=null;
		List<biodiversity_values> lstCurbioValues=null;
		List<biodiversity_values> lstPrevbioValues=null;
		long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
		long prevAssesmentVersionId=0;
		List<SiteAssessmentValues> lstCurrentSiteAssessment = new ArrayList<SiteAssessmentValues>();
		List<SiteAssessmentValues> lstPreviousSiteAssessment = new ArrayList<SiteAssessmentValues>();
		
		try{
			
			prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
			if(prevAssesmentVersionId>0){
				lstwhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(assesmentVersionId);
				lstCurbioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assesmentVersionId);
				SiteAssessmentValues siteAssessmentValues = null;
				if(lstwhValues!=null){
					for(int i=0;i<lstwhValues.size();i++){
						try{
					    		
							siteAssessmentValues=new SiteAssessmentValues();
				    		
							siteAssessmentValues.setWhvalues(lstwhValues.get(i));
				    		
							List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(lstwhValues.get(i).getWhvalues_id());
							String str = null;
							Collections.sort(lstwhvalues_whcriterion,new Comparator<assessment_whvalues_whcriterion>(){
							    public int compare(assessment_whvalues_whcriterion one, assessment_whvalues_whcriterion other) {
							        return String.valueOf(one.getCriterion()).compareTo(String.valueOf(other.getCriterion()));
							    }
							});
	
							for(int j=0;j<lstwhvalues_whcriterion.size();j++){
								long criteriaTemp = lstwhvalues_whcriterion.get(j).getCriterion();
								inscription_criteria_lkp insCriteria=inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(Integer.parseInt(criteriaTemp+""));
								String strCriteria =insCriteria.getCriteria();
								if(str==null) str = strCriteria;
								else str = str+","+strCriteria;
							}
				    		
							siteAssessmentValues.setStrwhvalues_whcriterion(str) ;       		
							lstCurrentSiteAssessment.add(siteAssessmentValues);
				    	}catch(Exception ex){
				    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
				    	}
	
				    } 
				}
				lstPrevwhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(prevAssesmentVersionId);
				lstPrevbioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(prevAssesmentVersionId);
				if(lstPrevwhValues!=null){
				 	for(int i=0;i<lstPrevwhValues.size();i++){
						try{
				    		
							siteAssessmentValues=new SiteAssessmentValues();
				    		
							siteAssessmentValues.setWhvalues(lstPrevwhValues.get(i));
				    		
							List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(lstPrevwhValues.get(i).getWhvalues_id());
							Collections.sort(lstwhvalues_whcriterion,new Comparator<assessment_whvalues_whcriterion>(){
							    public int compare(assessment_whvalues_whcriterion one, assessment_whvalues_whcriterion other) {
							        return String.valueOf(one.getCriterion()).compareTo(String.valueOf(other.getCriterion()));
							    }
							});
							String str = null;
							for(int j=0;j<lstwhvalues_whcriterion.size();j++){
								long criteriaTemp = lstwhvalues_whcriterion.get(j).getCriterion();
								inscription_criteria_lkp insCriteria=inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(Integer.parseInt(criteriaTemp+""));
								String strCriteria =insCriteria.getCriteria();
								if(str==null) str = strCriteria;
								else str = str+","+strCriteria;
							}
				    		
							siteAssessmentValues.setStrwhvalues_whcriterion(str) ;       		
							lstPreviousSiteAssessment.add(siteAssessmentValues);
				    	}catch(Exception ex){
				    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
				    	}
				 	}
				}
			 List<String> trval = new ArrayList<String>();
			 List<String> tdval = new ArrayList<String>();
	    
			 for (SiteAssessmentValues currSiteAssessment : lstCurrentSiteAssessment) {
				 int j=0;
				 boolean isSimilar_val=false;
				
				 		for (SiteAssessmentValues prevSiteAssessment :lstPreviousSiteAssessment ) {
		        		
				        	if (prevSiteAssessment.getWhvalues().getValues().trim().equalsIgnoreCase(currSiteAssessment.getWhvalues().getValues().trim())) {
				        		
				        		isSimilar_val=true;
				        		
				        		if (!prevSiteAssessment.getWhvalues().getDescription().trim().equalsIgnoreCase(currSiteAssessment.getWhvalues().getDescription().trim())) {
				        			
				        			tdval.add(currSiteAssessment.getWhvalues().getWhvalues_id()+"_DES_TD");
				        		}
				        		
								
							 if (!prevSiteAssessment.getStrwhvalues_whcriterion().trim().equalsIgnoreCase(currSiteAssessment.getStrwhvalues_whcriterion().trim())) {
				        			
									tdval.add(currSiteAssessment.getWhvalues().getWhvalues_id()+"_DES_TD");
				        		}  
				        		break;
				        }
		        	}
			 		if(!isSimilar_val) {
						trval.add(currSiteAssessment.getWhvalues().getWhvalues_id()+"_WH_TR");
					}
		        }
			 if(lstCurbioValues!=null && lstPrevbioValues!=null){
				 for (biodiversity_values currSiteAssessment : lstCurbioValues) {
					boolean isSimilar_val=false;
					for (biodiversity_values prevSiteAssessment :lstPrevbioValues ) {
		        		
			        	if (prevSiteAssessment.getValue().trim().equalsIgnoreCase(currSiteAssessment.getValue().trim())) {
			        		
			        		isSimilar_val=true;
			        		
			        		if (!prevSiteAssessment.getDescription().trim().equalsIgnoreCase(currSiteAssessment.getDescription().trim())) {
			        			
			        			tdval.add(currSiteAssessment.getId()+"_BDS_TD");
			        		}
							
			        		break;
			            }
		        	}
			 		if(!isSimilar_val) {
						trval.add(currSiteAssessment.getId()+"_BD_TR");
					}
			     }
			 }
			 if(trval.isEmpty() && tdval.isEmpty()){
				  double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 1 with its previous version "+ <%= version_code%>+".");
				<% 
			 }
			 else {
				 if(trval.size()>0){
			 
				 //TRgreen
				
				 for (String val : trval) {
					%>
						$('#indDiv tr:gt(0) td').css("background-color", "#acdfa7");
						 $("tr[id='"+'<%=val%>'+"']").css("background-color", "#acdfa7");
						 
					<%
				}
				 			 
			 }
			 if(tdval.size()>0){
				 //TDorange
				
				 for (String val : tdval) {				 
					 %>
					 
					 $("td[id='"+'<%=val%>'+"']").css("background-color", "#FFCC66");
					 $("th[id='"+'<%=val%>'+"']").css("background-color", "#FFCC66");
					 <%
					 
				}
				 
			 }
			 }
			}else{
				%>
				alert("No Previous version available.");
				<%
			}
			
		}catch(Exception e){
			
		}
		
		
		
			  
		
		%>
	}
	
	function removeDiff_1(){
		$('#indDiv tr:gt(0)').css("background", "none");
		$('#indDiv tr:gt(0) td').css("background", "none");
		$('#oibDiv tr:gt(0)').css("background", "none");
		$('#oibDiv tr:gt(0) td').css("background", "none");
	}
</script>
  