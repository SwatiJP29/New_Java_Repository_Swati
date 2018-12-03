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
	
	<a href="mainMenu.do">Go Gack to Main Menu</a>
	<%-- ${requestScope.empList} --%>
	<table border="1">
		<tr>
			<th>Employee ID </th>
			<th> View Details </th>
		</tr>
		<c:forEach items="${requestScope.itemList }" var="item">
			<tr>
			<td>${item.itemId }</td>
			<td>${item.name }</td>
			<td><a href="itemDetails.do?id=${item.itemId }">Show Details</a></td>
			<td><a href="addToCart.do?id=${item.itemId }">Add to Cart</a></td>
			
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>