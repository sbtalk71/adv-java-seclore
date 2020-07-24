<jsp:useBean id="techSupportBean" scope="session" class="com.techsupport.TechSupportBean" />

<hr>
Current User: 
<jsp:getProperty name="techSupportBean" property="firstName" />
<jsp:getProperty name="techSupportBean" property="lastName" />
<hr>
XYZ Corporation, Customer Service at 1.800.xyz.corp.<br>
