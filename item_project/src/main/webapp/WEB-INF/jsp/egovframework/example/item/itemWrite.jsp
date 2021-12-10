<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 등록</title>
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
	<form method="post" action="writeResult.do">
		<table>
			<tr>
				<th>상품명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="number" name="price"></td>
			</tr>
			<tr>
				<th>설명</th>
				<td><input type="text" name="description"></td>
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