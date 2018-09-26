<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 <!-- Bootstrap CSS -->
    <link href="bootstrap-3.3.2-dist//css/bootstrap.min.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
게시판 목록 board/list.jsp

<table width="500" cellpadding="0" cellspacing="0" border="1">
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
<p><a href="writeForm">글작성</a></p>
</body>
</html>