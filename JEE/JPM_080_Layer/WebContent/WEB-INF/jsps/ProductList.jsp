<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "com.jp.hr.entities.Employee, java.util.ArrayList" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Head01.jsp"></jsp:include>
		
	<a href="mainMenu.do">Go Gack to Main Menu</a>
	Welcome Mr./Mrs ${sessionScope.userFullName }
	<a href="logout.do">Logout</a>
	<table border="1">
		<tr>
			<th>Product ID </th>
			<th> View Product Details </th>
		</tr>
		<c:forEach items="${requestScope.productList }" var="product">
			<tr>
			<td>${product.productId}</td>
			<td><a href="productDetails.do?id=${product.productId}">View</a></td>
			
		</tr>
		</c:forEach>
	</table>

</body>
</html>