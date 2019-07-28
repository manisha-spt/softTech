<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
	<style type="text/css">
		body{
			background-color: #125602;
		}
		th,td,h1{
			color:white;
		}
		tr{
			align-content: center;
		}
	</style>
</head>
<body>
	<center>
			<h1>Employee Data</h1><hr>
		<c:choose>
			<c:when test="${empty employee}">
				<h1>NO EMPLOYEE DATA </h1>
			</c:when>
			<c:otherwise>
				<table>
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>EMAIL</th>
						<th>MBILE NUMBER</th>
						<th>DESIGNATION</th>
						<th>PAN NO</th>
						<th>DEPARTMENT</th>
						<th>BAISC SALARY</th>
						<th>GROSS SALARY</th>
						<th>TACK HOME</th>
						<th colspan="2">OPERATION</th>
						
					</tr>
					<c:forEach items="${employee}" var="emp">
					<tr>
						<td><c:out value="${emp.empId}"/> </td>
						<td><c:out value="${emp.empName}"/></td>
						<td><c:out value="${emp.empEmail}"/></td>
						<td><c:out value="${emp.empMobile}"/></td>
						<td><c:out value="${emp.empDesiganation}"/></td>
						<td><c:out value="${emp.empPan}"/></td>
						<td><c:out value="${emp.empDeprt}"/></td>
						<td><c:out value="${emp.salary.baisc}"/></td>
						<td><c:out value="${emp.salary.grossSal}"/></td>
						<td><c:out value="${emp.salary.total}"/></td>
						<td><a href="edit?id=${emp.empId}">EDIT</a></td>
						<td><a href="delete?id=${emp.empId}">DELETE</a></td>
						</tr>		
					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>
	</center>
</body>
</html>