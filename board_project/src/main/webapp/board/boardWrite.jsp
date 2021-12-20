<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 등록</title>
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
	<script type="text/javascript">
		function func_submit() {
			if (document.writeForm.title.value == "") {
				alert("제목을 입력해 주세요.");
				document.writeForm.name.focus();
				return false;
			}
			if (document.writeForm.pwd.value == "") {
				alert("암호를 입력해 주세요.");
				document.writeForm.name.focus();
				return false;
			}
			if (document.writeForm.name.value == "") {
				alert("이름을 입력해 주세요.");
				document.writeForm.name.focus();
				return false;
			}
			if (document.writeForm.content.value == "") {
				alert("내용을 입력해 주세요.");
				document.writeForm.name.focus();
				return false;
			}
			document.writeForm.submit();
		}
	</script>
</head>
<body>
	<form name="writeForm" method="post" action="boardWriteSave.do">
		<table>
			<caption>게시물 등록</caption>
			<tr>
				<th width="20%">제목</th>
				<td width="80%"><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea cols="100" rows="10" name="content"></textarea></td>
			</tr>
			<tr>
				<th colspan="2" align="center">
					<button type="submit" onclick="func_submit(); return false;">저장</button>
					<button type="reset">취소</button>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>