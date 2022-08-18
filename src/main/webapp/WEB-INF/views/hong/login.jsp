<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 부트스트랩, 제이쿼리 -->
<meta name="viewport" content="with=divice-width,initial-scale=1">
<link rel="stylesheet" 
		href="<c:url value="/resources/user/css/bootstrap.min.css" />">
<script src="http://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>
<script type="text/javascript">
var msg = '${msg}';
console.log(msg);
if(msg != null && msg != ""){
alert(msg);
}
</script>

<title>로그인 폼</title>
</head>
<body>
<!-- login form -->
<div class="container">
	<div class="col-lg-4"></div>
	<div class="col-lg-4">
	<div class="jumbotron" style="padding-top: 20px;">
	<form action="login.do" method="post">
	<br>
	<div class="form-group">
		<input type="text" class="form-control" placeholder="id" name="id">
	</div>
	<div class="form-group">
		<input type="text" class="form-control" placeholder="pw" name="pw">
	</div>
	
	<div class="form-group">
		<input type="submit" class="form-control" style="background-color: #2983a6; color: white;" value="로그인">
	</div>
	<div class="from-group">
		<a href="register.do" class="form-control" style="background-color: #2983a6; text-align: center; color: white;">회원가입</a>
	</div>
	</form>
	</div>
	</div>
</div>
</body>
</html>