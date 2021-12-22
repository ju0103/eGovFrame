<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 수정</title>
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
			if ($("#content").val() == "") {
				alert("내용을 입력해 주세요.");
				$("#content").focus();
				return false;
			}
			
			var formData = $("#modifyForm").serialize();
			
			$.ajax({
				type: "post",
				data: formData,
				url: "modifyBoardSave.do",
				dataType: "text",
				success: function(data) {
					if (data == "ok") {
						alert("수정 완료");
						location = "boardList.do";
					} else {
						alert("수정 실패");
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
	<div>
		<button type="button" onclick="javascript:location='boardList.do'">목록으로</button>
	</div>
	<form id="modifyForm">
		<input type="hidden" name="bno" value="${boardDetail.bno}">
		<table>
			<caption>게시물 등록</caption>
			<tr>
				<th width="20%"><label for="title">제목</label></th>
				<td width="30%"><input type="text" name="title" id="title" value="${boardDetail.title}"></td>
				<th width="20%">글쓴이</th>
				<td width="30%">${boardDetail.name}</td>
			</tr>
			<tr>
				<th><label for="content">내용</label></th>
				<td colspan="3"><textarea cols="100" rows="10" name="content" id="content" value="${boardDetail.content}">${boardDetail.content}</textarea></td>
			</tr>
		</table>
	</form>
	<div style="margin-top: 10px; text-align: right; width: 800px;">
		<button type="button" onclick="func_submit(); return false;">저장</button>
		<button type="reset">다시 작성</button>
	</div>
</body>
</html>