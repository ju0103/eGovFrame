<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>코드 목록</title>
	<style type="text/css">
		table {
			width: 500px;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid #ccc;
			padding: 5px;
		}
	</style>
	<script type="text/javascript">
		function confirmDelete(code) {
			var result = confirm("정말로 삭제하시겠습니까?");
			
			if (result == true) {
				location.href = "deleteCode.do?code=" + code;
			}
		}
	</script>
</head>
<body>
	<p>Total: ${total}개</p>
	<table>
		<caption>코드 목록</caption>
		<colgroup>
			<col width="10%">
			<col width="30%">
			<col width="30%">
			<col width="20%">
		</colgroup>
		<tr>
			<th>번호</th>
			<th>그룹명</th>
			<th>코드명</th>
			<th>구분</th>
		</tr>
		<c:set var="count" value="1" />
		<c:forEach var="list" items="${codeList}">
			<tr align="center">
				<td><c:out value="${count}"></c:out></td>
				<td>${list.gid}</td>
				<td>${list.name}</td>
				<td><button type="button" onclick="confirmDelete(${list.code}); false;">삭제</button></td>
			</tr>
			<c:set var="count" value="${count+1}" />
		</c:forEach>
	</table>
</body>
</html>