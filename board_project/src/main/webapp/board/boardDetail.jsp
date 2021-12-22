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
		<button type="button">삭제</button>
	</div>
</body>
</html>