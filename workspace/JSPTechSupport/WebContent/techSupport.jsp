<%@ page errorPage="/error.jsp" %>

<jsp:useBean id="techSupportBean" scope="session" class="com.techsupport.TechSupportBean" />
<jsp:setProperty name="techSupportBean" property="*"/>

<%techSupportBean.registerSupportRequest();%>

<% if (techSupportBean.isRegistered()) { %>
     <jsp:forward page="response.jsp"/>
<% } else { %>
     <jsp:forward page="regform.jsp"/>
<% } %>
