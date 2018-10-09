<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" />
<link href="${pageContext.request.contextPath}/resources/bootstrap/css/custom.css" rel="stylesheet" />

</head>
<body>
	<h1 class="text-center"> 로그인 완료 </h1>
	<div class="form-group" style="clear: both; width: 60%; margin: auto;">
		<p align="center">
		 	${login.id}님 환영합니다. <br />
			회원님의 아이디는 <mark>${login.id}</mark>,<br />
			등록하신 이메일 주소는 <mark>${login.email}</mark> 입니다.<br /><br /><br />
			
			로그인 완료
			<a class="btn btn-default" href="${pageContext.request.contextPath}/board/list">MAIN</a>
		</p>
		
	</div>
	
</body>
</html>
