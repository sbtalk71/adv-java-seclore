<%@ page errorPage="/error.jsp" %>

<jsp:useBean id="techSupportBean" scope="session" class="com.techsupport.TechSupportBean" />
<jsp:setProperty name="techSupportBean" property="*"/>

<% techSupportBean.registerCustomer(); %>

<jsp:forward page="response.jsp"/>
