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
	${message}
<h1>Welocme Employee Registration</h1>
	<pre>
	<form:form action="saveEmp" method="post" modelAttribute="employee">
	
	ID :	<form:input path="empId"/>
	
	NAME :	<form:input path="empName"/>
	EMAIL :	<form:input path="empEmail"/>
	MOBILE NUMBER :	<form:input path="empMobile"/>
	DESIGNATION :	<form:select path="empDesiganation">
			<form:option value="">-SELECT-</form:option>
			<form:option value="SOFTWARE ENGNEER">SOFTWARE ENGNEER</form:option>
			<form:option value="MANAGER">MANAGER</form:option>
			<form:option value="HR">HR</form:option>
		</form:select>
	PAN NUMER :	<form:input path="empPan"/>
	DEPARTMENT : <form:select path="empDeprt">
	<form:option value="">-SELECT-</form:option>
					<form:option value="IT">IT</form:option>
					<form:option value="NON-IT">NON-IT</form:option>
					</form:select>
	SALARY BAISC :<form:input path="salary.baisc"/>
	HOUSE REST :<form:input path="salary.houseRent"/>
	MEDICAL ALLOWENCE :<form:input path="salary.medical"/>
	SPECIAL ALLOWENCE :<form:input path="salary.special"/>
	OTHERS :<form:input path="salary.others"/>
	<input type="submit" value="register"/>
	
	</form:form>
	</pre>
</center>
</body>
</html>