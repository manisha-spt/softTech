<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<center>
					${message}
				<h1> Enter Employee Details </h1><hr>
				<pre>
					<form action="findEmpDetails" method="get">
						Enter Employee(ID/EMAIL/DESINATION) : <input type="text" name="data"/>
									<input type="submit" value="search"/>
					</form>
			</pre>
			</center>
</body>
</html>