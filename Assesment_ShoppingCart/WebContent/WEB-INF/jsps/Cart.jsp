<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<p>${message }</p>
		
		<table border="1">
			<tr>
				<th>Item ID</th>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<c:forEach items="${requestScope.cart }" var="item">
			<tr>
			<td>${item.itemId }</td>
			<td>${item.name }</td>
			<td>${item.category }</td>
			<td>${item.price }</td>
			<td>1</td>
		</tr>
		</c:forEach>
		</table>
	</body>
</html>