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
<link rel="stylesheet" 
		href="<c:url value="/resources/user/css/bootstrap.css" />">
<script src="http://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript">
$(function() {
	$(".dataRow").click(function() {
		var no = $(this).find(".no").text();
		location = "view.do?no=" + no
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
	
	<div class="row">
		<div class="col-sm-4 col-md-4"></div>
		<div class="col-sm-4 col-md-4">
			<ul class="btn-group pagination" style="margin-left: 50%">
				<c:if test="${pagenation.prev}">
					<li>
						<a href='<c:url value="/fitnessboard/list?page=${pagenation.startPage -1 }"/>'><i class="fa fa-chevron-left"></i></a>
					</li>
				</c:if>
				<c:forEach begin="${pagenation.startPage}" end="${pagenation.endPage}" var="pageNum">
					<li>
						<a href='<c:url value="/fitenssboard/list/page=${pageNum}"/>'><i class="fa">${pageNum}</i></a>
					</li>
				</c:forEach>
				<c:if test="${pagenation.next && pagenation.endPage > 0}">
					<li>
						<a href='<c:url value="/fitnessboard/list/page=${pagenation.endPage + 1}"'><i class="fa fa-chevron-right"></i></a>
					</li>
				</c:if>
			</ul>		
		</div>
		<div class="col-sm-4 col-md-4"></div>
	</div>
	
	<tr>
		<td colspan="5">
			<a href="write.do" class="btn btn-default">글쓰기</a>
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