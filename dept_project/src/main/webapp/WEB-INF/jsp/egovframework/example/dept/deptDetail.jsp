<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>부서 상세 내역</title>
	<style type="text/css">
		table {
			width: 400px;
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
		<tr>
			<th>부서번호</th>
			<td>${deptDetail.deptno}</td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td>${deptDetail.dname}</td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td>${deptDetail.loc}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button">수정</button>
				<button type="button">삭제</button>
			</td>
		</tr>
	</table>
</body>
</html>