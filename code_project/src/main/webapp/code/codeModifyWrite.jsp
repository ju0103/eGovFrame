<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>코드 수정</title>
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
	<script type="text/javascript">
		function func_submit() {
			if (document.writeForm.name.value == "") {
				alert("코드명을 입력해 주세요.");
				document.writeForm.name.focus();
				return false;
			}
			document.writeForm.submit();
		}
	</script>
</head>
<body>
	<form name="writeForm" method="post" action="modifyCodeSave.do">
		<input type="hidden" name="code" value="${codeVo.code}">
		<table>
			<tr>
				<th>분류</th>
				<td>
					<select name="gid">
						<option value="1" <c:if test="${codeVo.gid == '1'}">selected</c:if> >Job(업무)</option>
						<option value="2" <c:if test="${codeVo.gid == '2'}">selected</c:if> >Hobby(취미)</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>코드명</th>
				<td><input type="text" name="name" value="${codeVo.name}"></td>
			</tr>
			<tr>
				<th colspan="2" align="center">
					<button type="submit" onclick="func_submit(); return false;">저장</button>
					<button type="button" onclick="javascript:location='codeList.do'">취소</button>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>