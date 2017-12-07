<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Role List page</h3>
	<a href="${pageContext.request.contextPath}/product/list">Add Role</a>
	<table style="cellspacing: 2; cellpadding: 2; border: 1;">
		<thead>
			<tr class="listHeading">
				<th>Part ID</th>
				<th>Description</th>
				<th>Unit Price</th>
				<th>In Stock</th>
				<th>Shelf Location</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="productList" items="${productList}">
				<tr class="listHeading">
					<td>${productList.partID}</td>
					<td>${productList.description}</td>
					<td>${productList.unitPrice}</td>
					<td>${productList.unitInStock}</td>
					<td>${productList.shelfLocation}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>