<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 목록</title>
	<style type="text/css">
		table {
			width: 800px;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid #ccc;
			padding: 5px;
		}
	</style>
</head>
<body>
	<table>
		<caption>상품 목록</caption>
		<tr>
			<th>상품명</th>
			<th>가격</th>
			<th>설명</th>
		</tr>
		<c:forEach var="item" items="${itemList}">
			<tr>
				<td>${item.name}</td>
				<td>${item.price}</td>
				<td>${item.description}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>