<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="bootstrap-3.3.2-dist//css/bootstrap.min.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
수정 페이지 modify.jsp<br />

<form action="modify">
	<input type="hidden" name="code" value="${modify.code}" />
	<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td >id</td>
				<td><input type="text" name="id" value="${modify.id}" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" value="${modify.title}" /></td>
			</tr>
			<tr>
				<td>content</td>
				<td><input type="text" name="content" value="${modify.content}" /></td>
			</tr>
			<tr >
				<td colspan="2">
					<input type="submit" value="수정"> &nbsp;&nbsp;  
					<a href="list">목록보기</a> &nbsp;&nbsp; 
					<a href="delete?code=${modify.code}">삭제</a> &nbsp;&nbsp; 
					<a href="reply_view?code=${modify.code}">답변</a>
					</td>
			</tr>
		
	</table>
</form>
	
</body>
</html>