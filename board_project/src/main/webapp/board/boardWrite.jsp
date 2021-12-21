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
	<script src="/board_project/script/jquery.js"></script>
	<script type="text/javascript">
		function func_submit() {
			if ($.trim($("#title").val()) == "") {
				alert("제목을 입력해 주세요.");
				$("#title").focus();
				return false;
			}
			if ($("#pwd").val() == "") {
				alert("암호를 입력해 주세요.");
				$("#pwd").focus();
				return false;
			}
			if ($("#name").val() == "") {
				alert("이름을 입력해 주세요.");
				$("#name").focus();
				return false;
			}
			if ($("#content").val() == "") {
				alert("내용을 입력해 주세요.");
				$("#content").focus();
				return false;
			}
			// 동기 방식
			// document.writeForm.submit();
			
			var formData = $("#writeForm").serialize();
			
			// 비동기 방식
			$.ajax({
				type: "post",
				data: formData,
				url: "boardWriteSave.do",
				dataType: "text",
				success: function(data) {
					if (data == "ok") {
						// alert("저장 완료");
						location.href = "boardList.do";
					} else {
						alert("저장 실패");
					}
				},
				error: function() {
					alert("오류 발생");
				}
			});
		}
	</script>
</head>
<body>
	<form id="writeForm" method="post" action="boardWriteSave.do">
		<table>
			<caption>게시물 등록</caption>
			<tr>
				<th width="20%"><label for="title">제목</label></th>
				<td width="80%"><input type="text" name="title" id="title"></td>
			</tr>
			<tr>
				<th><label for="pwd">비밀번호</label></th>
				<td><input type="password" name="pwd" id="pwd"></td>
			</tr>
			<tr>
				<th><label for="name">글쓴이</label></th>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<th><label for="content">내용</label></th>
				<td><textarea cols="100" rows="10" name="content" id="content"></textarea></td>
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