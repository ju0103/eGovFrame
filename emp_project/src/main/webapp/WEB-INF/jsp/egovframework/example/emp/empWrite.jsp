<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사원 등록</title>
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
	<form method="post" action="empWriteSave.do">
		<table>
			<tr>
				<th>사원번호</th>
				<td><input type="number" name="empno"></td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td><input type="number" name="deptno"></td>
			</tr>
			<tr>
				<th colspan="2">
					<button type="submit">저장</button>	
				</th>
			</tr>
		</table>
	</form>
</body>
</html>