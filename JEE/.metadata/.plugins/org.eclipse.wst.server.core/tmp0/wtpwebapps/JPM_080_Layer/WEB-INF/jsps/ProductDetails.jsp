<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome Mr./Mrs ${sessionScope.userFullName }
	<a href="logout.do">Logout</a>
	<table border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Category</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<tr>
			<td>${requestScope.productDetails.productId }</td>
			<td>${requestScope.productDetails.productCategory }</td>
			<td>${requestScope.productDetails.productName }</td>
			<td>${requestScope.productDetails.productPrice}</td>
			<td><a href="updateProductDetails.do?id=${productDetails.productId }">Update</a></td>
			<td><a href="deleteProduct.do?id=${productDetails.productId }">Delete</a></td>
		</tr>
	</table>
	
	<a href="productList.do">Go Gack to list</a>
</body>
</html>