<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
글쓰기 페이지 write.jsp <br />

<form action="write" method="post">
	<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td >id</td>
				<td> <input type="text" name="id" size = "50"></td>
			</tr>
			<tr>
				<td>title</td>
				<td> <input type="text" name="title" size = "150" > </td>
			</tr>
			<tr>
				<td>content</td>
				<td> <input type="text" name="content" size = "500" > </td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
	</table>
</form>
</body>
</html>