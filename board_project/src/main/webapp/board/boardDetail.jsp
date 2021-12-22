<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 상세 내용</title>
	<style type="text/css">
		table {
			width: 600px;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid #ccc;
			padding: 5px;
		}
	</style>
	<script src="/board_project/script/jquery.js"></script>
	<script type="text/javascript">
		function func_delete(bno) {
			var pwd = prompt("비밀번호를 입력하세요.", "");
			
			if (pwd == '${boardDetail.pwd}') {
				console.log(pwd);
				$.ajax({
					type: "post",
					data: bno,
					url: "deleteBoard.do?bno=" + bno,
					dataType: "text",
					success: function(data) {
						if (data == "ok") {
							alert("삭제 성공");
							location.href = "boardList.do";
						} else {
							alert("삭제 실패");
						}
					},
					error: function() {
						alert("오류 발생");
					}
				});
			} else {
				alert("비밀번호 오류");
			}
		}
	</script>
</head>
<body>
	<div>
		<button type="button" onclick="javascript:location='boardList.do'">목록으로</button>
	</div>
	<table>
		<caption>${boardDetail.title}</caption>
		<tr>
			<th>작성자</th>
			<td>${boardDetail.name}</td>
			<th>작성일</th>
			<td><fmt:formatDate value="${boardDetail.regdate}" pattern="yyyy-MM-dd hh:mm"/></td>
			<th>조회수</th>
			<td>${boardDetail.hits}</td>
		</tr>
		<tr>
			<td colspan="6"><pre>${boardDetail.content}</pre></td>
		</tr>
	</table>
	<div style="margin-top: 10px; text-align: right; width: 600px;">
		<button type="button" onclick="location='modifyBoard.do?bno=${boardDetail.bno}'">수정</button>
		<button type="button" onclick="func_delete(${boardDetail.bno}); return false;">삭제</button>
	</div>
</body>
</html>