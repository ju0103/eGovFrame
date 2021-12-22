<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 목록</title>
	<style type="text/css">
		table {
			width: 800px;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid #ccc;
			padding: 5px;
		}
		tbody tr:hover {
			background-color: #f5f5f5;
		}
	</style>
</head>
<body>
	<table>
		<caption>게시물 목록</caption>
		<colgroup>
			<col width="10%">
			<col width="40%">
			<col width="20%">
			<col width="20%">
			<col width="10%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>등록일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:set var="count" value="1"></c:set>
			<c:forEach items="${boardList}" var="list">
				<tr onclick="javascript:location='boardDetail.do?bno=${list.bno}'">
					<td align="center">${count}</td>
					<td align="left">${list.title}</td>
					<td align="center">${list.name}</td>
					<td align="center">${list.regdate}</td>
					<td align="center">${list.hits}</td>
				</tr>
				<c:set var="count" value="${count+1}"></c:set>
			</c:forEach>
		</tbody>
	</table>
	<div style="margin-top: 5px; text-align: right; width: 800px;">
		<button type="submit" onclick="javascript:location='boardWrite.do'">글쓰기</button>
	</div>
</body>
</html>