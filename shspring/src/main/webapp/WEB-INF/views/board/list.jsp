<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" />
<link href="${pageContext.request.contextPath}/resources/bootstrap/css/custom.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="${pageContext.request.contextPath}/resouces/bootstrap/js/bootstrap.min.js"></script>

<h1 class="text-center"> 게시판 </h1>

<div style="clear: both; width: 70%; margin: auto;">
	<a class="btn btn-default" href="modifyForm">회원정보수정</a></button>
	<table class="table">
		<tr>
			<td>코드</td>
			<td>아이디</td>
			<td>날짜</td>
			<td>제목</td>
			<td>내용</td>
			<td>조회수</td>
			<td>삭제</td>		
		<tr>
		<c:forEach items="${list}" var="board">
		<tr>
			<td>${board.code}</td>
			<td>${board.id}</td>
			<td>${board.regDate}</td>
			<td>
					<c:forEach begin="1" end="${board.commentIndent}">-</c:forEach>
					<a href="view?code=${board.code}">${board.title}</a>
					</td>
			<td>${board.content}</td>
			<td>${board.hit}</td>
			<td><a href="delete?code=${board.code}">X</a></td>
		<tr>
		</c:forEach>
	</table>
	<a class="btn btn-default" href="writeForm">글작성</a></button>
</div>

</body>
</html>