

<%@include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>


<portlet:resourceURL var="autocompleteURL">
	<portlet:param name="ACTION_CMD" value="AUTOCOMPLETE"/>
</portlet:resourceURL>	


<portlet:resourceURL var="contact_searchURL">
<portlet:param name="ACTION_CMD" value="CONTACT_SEARCH"/>
 <portlet:param name="jspPageDiv" value="/contact_jsp/search/search_resourse.jsp" />
  <portlet:param name="resetCur" value="true" />
</portlet:resourceURL>




	<!-- ------------------Search Start Here------------ -->
	<div class="" >
	
	
		<aui:form action="<%= contact_searchURL.toString() %>" method="post"
			name="fmsitesearch" id="fmsitesearch"
			onSubmit="javascript:contactSearch();">


	<aui:input
	        name="searchType"
	        id="searchType"
	        type="hidden"
	    />

			<aui:layout>
			
			
			
		<aui:column columnWidth="30" cssClass="inputHolderCS">
		
		<div id="autoComplete">
               <aui:input cssClass="inputAutoComplete" type="text" name="sitename" id="sitename" label="Site Name"/>
         </div>
 				 
		</aui:column>
				
				
				<aui:column columnWidth="30" cssClass="selectHolder">
				
				
						<aui:select label="Type : " id="typeid" name="typeid">
						<aui:option value="" cssClass="selectCSearch">Select Category</aui:option>
						
						

					<%
					List<contact_category> lstContactCategory= null;
					try{
						//unescoRegionList = unesco_regionLocalServiceUtil.getAllRegionNames();
						 lstContactCategory = contact_categoryLocalServiceUtil.getContactCategory();
					}catch(Exception ex){
						System.out.print("EX: "+ ex.getMessage());
					}
					if(lstContactCategory != null){
					for (contact_category tempcategory : lstContactCategory) {
										%>
											<aui:option label="<%=  tempcategory.getCategory_name() %>"  value="<%=tempcategory.getContact_category_id() %>" />
										<%
										}
					}
										%>
				</aui:select>				
															
						</aui:column>
						
					
				
				
			
				<aui:column columnWidth="25" cssClass="btnHolderCS">
					
					
					<aui:button name="search" onClick="javascript:contactSearch();"  value="search" />
					
					
				</aui:column>
				
				
				
			</aui:layout>
			
			
			
		</aui:form>

	</div>




	<!-- ------------------Search END Here------------ -->


		
	
<script type="text/javascript">

AUI().use('aui-autocomplete', function(A) {
		var dataSource = new A.DataSource.IO(
		    {
		        source: '<%=autocompleteURL %>'
		    }
		);
		
		var autoComplete = new A.AutoComplete(
		    {
		        dataSource: dataSource,
		        delimChar: '',
		        contentBox: '#autoComplete',
		        input:'#<portlet:namespace/>sitename',
		        matchKey: 'name',
		        schema: {
		            resultListLocator: 'response',
		            resultFields: ['key','name','description', 'type', 'wdpaId']
		        },
		        uniqueName:'keyword',
		        schemaType:'json',
		        typeAhead: false,
		        cssClass: 'ac_input'
		    }
		 );
		
		autoComplete.generateRequest = function(query) {
		    return {
		    	
		        request: '&keys=' + query
		    };
		}
		
	 autoComplete.on('itemSelect',function(event,data) {   
				
		 contactSearch();
		}); 
		
		autoComplete.render();
		
	
});
</script>

<script>
		function contactSearch() {
	
			
		
	AUI().use('aui-io-request', function(A) {
	   A.io.request('<%=contact_searchURL %>', {
	    
	      method: 'GET',
	      
	      data:{
	    	  
	    	 
	    	 sitename: document.getElementById("<portlet:namespace/>sitename").value, 
	    	 typeid:document.getElementById("<portlet:namespace/>typeid").value  
	      },
	      on: {
	          success : function() { 
/* 	          alert(this.get('responseData'));
 */	        	 $('#contactDiv').html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}
	
	</script>
		

<script>
$(document).keypress(function(e) {
	  if(e.which == 13) {
   
/* 		  alert("hi hi hi hih i");
 */		  
		  return false; 
	  }
	})
</script> 




