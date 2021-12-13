<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>코드 등록</title>
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
	<form method="post" action="codeWriteSave.do">
		<table>
			<tr>
				<th>분류</th>
				<td>
					<select name="gid">
						<option value="1">Job(업무)</option>
						<option value="2">Hobby(취미)</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>코드명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th colspan="2" align="center">
					<input type="submit" value="저장">
					<input type="reset" value="취소">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>