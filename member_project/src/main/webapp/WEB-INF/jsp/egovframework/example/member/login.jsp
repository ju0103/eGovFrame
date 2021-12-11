<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<style type="text/css">
		table {
			width: 300px;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid #ccc;
			padding: 5px;
		}
	</style>
</head>
<body>
	<form method="post" action="login_ok.do">
		<table>
			<tr>
				<th>사용자 ID</th>
				<td><input type="text" name="mem_uid"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="mem_pwd"></td>
			</tr>
			<tr>
				<th colspan="2" align="center">
					<input type="submit" value="로그인">
					<a href="register.do">회원가입</a>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>