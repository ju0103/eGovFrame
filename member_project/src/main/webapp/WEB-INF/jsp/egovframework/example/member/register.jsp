<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
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
	<form method="post" action="register_ok.do">
		<table>
			<tr>
				<th colspan="2" align="center">
					<h1>회원 가입 신청</h1>
					<p>'*' 표시 항목은 필수 입력 항목입니다.</p>
				</th>
			</tr>
			<tr>
				<th>사용자 ID</th>
				<td><input type="text" name="mem_uid">*</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="mem_pwd">*</td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="mem_name">*</td>
			</tr>
			<tr>
				<th colspan="2" align="center">
					<input type="submit" value="등록">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>