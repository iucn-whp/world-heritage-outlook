
<%@include file="init.jsp" %>

<%
List<country_lkp> countryLkp = country_lkpLocalServiceUtil.getAllCountries();
%>

<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Coountry Added successfully!" /> 

<portlet:actionURL name="viewSiteCountry" var="viewSiteCountryURL"/>
	<aui:form action="<%= viewSiteCountryURL.toString() %>" method="post">
		<aui:select name="Country">
			<aui:option value="-1">
				<liferay-ui:message key="please-choose" />
			</aui:option>
			<%
				for (country_lkp countryLkps : countryLkp) {
			%>
			<aui:option
				value="<%= countryLkps.getCountryid() %>">
				<%= countryLkps.getName() %>
			</aui:option>
			<%
			}
			%>
		</aui:select>
		</aui:form>
<%-- 	</aui:form> --%>


