<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="with=divice-width,initial-scale=1">
<link rel="stylesheet" 
		href="<c:url value="/resources/user/css/bootstrap.min.css" />">
<script src="http://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="UTF-8">
<style type="text/css">
body {
	background-color: #F7FFD9;
}
</style>
<title>Fitness Board View</title>
</head>
<body>
<div class="container">
<h2>Fitness 게시판 > 글보기</h2>
<table class="table">
	<tr>
		<th>번호</th>
		<td>${vo.no}</td>
	</tr>
	
	<tr>
		<th>제목</th>
		<td>${vo.title }</td>
	</tr>
	
	<tr>
		<th>내용</th>
		<td>${vo.content}</td>
	</tr>
	
	<tr>
		<th>작성자</th>
		<td>${vo.memberId}</td>
	</tr>
	
	<tr>
		<th>작성일</th>
		<td><fmt:formatDate value="${vo.regDate}" pattern="yyyy-MM-dd"/></td>
	</tr>
	
	<tr>
		<th>조회수</th>
		<td>${vo.hit}</td>
	</tr>
	
</table>
<br>
	<a href="update.do?no=${vo.no}" class="btn btn-default">수정</a>
	<a href="delete.do?no=${vo.no}"	class="btn btn-default">삭제</a>
	<a href="list.do" class="btn btn-default">리스트</a>
</div>
</body>
</html>