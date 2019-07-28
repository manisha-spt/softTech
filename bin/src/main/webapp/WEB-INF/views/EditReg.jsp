<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	
<h1>Welocme Edit Employee Page</h1>
	<pre>
	<form:form action="saveEmp" method="post" modelAttribute="employee">
	
	ID :	<form:input path="empId" readonly="true"/>
	
	NAME :	<form:input path="empName"/>
	EMAIL :	<form:input path="empEmail" readonly="true"/>
	MOBILE NUMBER :	<form:input path="empMobile"/>
	DESIGNATION :	<form:select path="empDesiganation" readonly="true">
			<form:option value="">-SELECT-</form:option>
			<form:option value="SOFTWARE ENGNEER">SOFTWARE ENGNEER</form:option>
			<form:option value="MANAGER">MANAGER</form:option>
			<form:option value="HR">HR</form:option>
		</form:select>
	PAN NUMER :	<form:input path="empPan" readonly="true" />
	DEPARTMENT : <form:select path="empDeprt" readonly="true">
	<form:option value="">-SELECT-</form:option>
					<form:option value="IT">IT</form:option>
					<form:option value="NON-IT">NON-IT</form:option>
					</form:select>
	SALARY BAISC :<form:input path="salary.baisc" readonly="true"/>
	HOUSE REST :<form:input path="salary.houseRent" readonly="true"/>
	MEDICAL ALLOWENCE :<form:input path="salary.medical" readonly="true"/>
	SPECIAL ALLOWENCE :<form:input path="salary.special" readonly="true"/>
	OTHERS :<form:input path="salary.others" readonly="true"/>
	<input type="submit" value="Update"/>
	
	</form:form>
	</pre>
</center>
</body>
</html>