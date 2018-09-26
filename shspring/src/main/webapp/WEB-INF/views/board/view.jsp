<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
</head>
<body>
글 보기 페이지 board/view.jsp <br />

<form>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td >id</td>
				<td><input type="text" name="id" value="${view.id}" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" value="${view.title}" /></td>
			</tr>
			<tr>
				<td>content</td>
				<td><input type="text" name="content" value="${view.content}" /></td>
			</tr>
			<%-- <input type="hidden" name="code" value="${view.code}" /> --%>
			<tr >
				<td colspan="2">
				<!-- <input type="submit" value="수정"> &nbsp;&nbsp;  -->
					<a href="modify_view?code=${view.code}" target="_blank">수정</a>
					<a href="list">목록보기</a> &nbsp;&nbsp; 
					<a href="delete?code=${view.code}">삭제</a> &nbsp;&nbsp; 
					<a href="reply_view?code=${view.code}">답변</a>
					</td>
			</tr>	
	</table>
</form>
	
</body>
</html>