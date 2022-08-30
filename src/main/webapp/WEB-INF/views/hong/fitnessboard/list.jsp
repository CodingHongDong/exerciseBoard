<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fitness Board</title>
<!-- 부트스트랩, 제이쿼리 -->
<meta name="viewport" content="with=divice-width,initial-scale=1">
<link rel="stylesheet" 
		href="<c:url value="/resources/user/css/bootstrap.min.css" />">
<script src="http://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>
</head>
<body>
<div class="container">
<h2>Fitness 게시판 > 리스트</h2>
${list }
<table class="table">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	
	<c:forEach items="${list}" var="vo">
	<tr class="dataRow">
		<td class="no">${vo.no }</td>
		<td>${vo.title }</td>
		<td>${vo.memberId }</td>
		<td><fmt:formatDate value="${vo.regDate }" pattern="yyyy-MM-dd"/> </td>
		<td>${vo.hit}</td>
	</tr>
	</c:forEach>
	
	<tr>
		<td colspan="5">
			<a href="write.do" class="btn btn-default">글쓰기</a>
		</td>
	</tr>
</table>
</div>
</body>
</html>