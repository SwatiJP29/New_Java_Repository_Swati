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
	<p color="red" > ${message }</p>
	<form action="submitProduct.do" method="POST">
		<table>
			<tr>
				<th>Product ID</th>
				<td><input type="text" name="productId"></td>
			</tr>
			<tr>
				<th>Product Category</th>
				<td><input type="text" name="productCategory"></td>
			</tr>
			<tr>
				<th>Product Name</th>
				<td><input type="text" name="productName"></td>
			</tr>
			<tr>
				<th>Product Price</th>
				<td><input type="text" name="productPrice"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="GO"/></td>
			</tr>	
		</table>
	</form>
	
	<a href="mainMenu.do">Go Gack to Main Menu</a>
</body>
</html>