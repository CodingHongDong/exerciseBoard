<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fitness Board</title>
<!-- 부트스트랩, 제이쿼리 -->
<meta name="viewport" content="with=divice-width,initial-scale=1">
<link rel="stylesheet" 
		href="<c:url value="/resources/user/css/bootstrap.min.css" />">
<link rel="stylesheet" 
		href="<c:url value="/resources/user/css/bootstrap.css" />">
<script src="http://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript">
$(function() {
	$(".dataRow").click(function() {
		var no = $(this).find(".no").text();
		location = "view.do?no=" + no + "&inc=1"
				+ "&page=${pageObject.page}"
				+ "&perPageNum=${pageObject.perPageNum}"
	});
	
	$(".img").click(function() {
		location = "home.do"
	});
	
});
</script>
<style type="text/css">
body {
	background-color: #afe0b3;
}

footer {
	background-color: black;
	padding: 25px;
	color: #ddd;
}

.dataRow:hover {
	background: #eee;
	cursor: pointer;
	}

img {
	margin: 10px;
	height: 100px;
	width: 100px;
	float: none;
}
</style>
</head>
<body>
<!-- 로고 -->
<header>
	<h1 class="text-center">
		<img class="img" src="<c:url value="/resources/user/dog.jpg"/>">
	</h1>
</header>

<div class="container">
<h2>Fitness 게시판 > 리스트</h2>
<table class="table">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	
	<c:forEach items="${vo}" var="vo">
	<tr class="dataRow">
		<td class="no">${vo.no}</td>
		<td>${vo.title}</td>
		<td>${vo.memberId}</td>
		<td><fmt:formatDate value="${vo.regDate}" pattern="yyyy-MM-dd"/> </td>
		<td>${vo.hit}</td>
	</tr>
	</c:forEach>
	
	<c:if test="${pageObject.totalPage > 1 }">
	<!-- 전체 페이지가 2페이지 이상이면 보여주는 부분 -->
		<tr>
			<td colspan="5">
				<pageNav:pageNav listURI="list.do" 
					pageObject="${pageObject }" />
			</td>
		</tr>
	</c:if>
	
	
	<tr>
		<td colspan="5">
			<a href="write.do?perPageNum=${pageObject.perPageNum}" class="btn btn-default">글쓰기</a>
		</td>
	</tr>
</table>
</div>
	
	<!-- footer -->
	<footer class="container-fluid text-center navbar navbar-inverse navbar-fixed-bottom">
		<p>CodingHongDong</p>
	</footer>
	
</body>
</html>