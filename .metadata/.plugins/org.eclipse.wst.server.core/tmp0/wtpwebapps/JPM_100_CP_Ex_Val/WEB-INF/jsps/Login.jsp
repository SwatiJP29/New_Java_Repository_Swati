<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<div color=red> ${ message } </div><!-- here message is coming from the request.setAttribute  in Front Controller line number 72-->
		<form action="authenticate.do" method='POST'> <!-- For any JSP we need to give name with.do to go to Front Controller -->
			User Name: <input type="text" name="username"></br>
			Password : <input type="password" name="password"></br>
			<input type="submit" value="Submit">
		</form>
	</body>
</html>