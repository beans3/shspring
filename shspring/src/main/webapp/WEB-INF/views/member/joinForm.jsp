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
	<h1 class="text-center">회원가입</h1>
	
	<form action="join">
		<div class="form-group" style="clear: both; width: 60%; margin: auto;"> 
			<div>
				<label>ID</label>
				<input class="form-control" type="text" name="id" />
			</div>
			<div>
				<label>PW</label>
				<input class="form-control" type="password" name="password" />
			</div>
			<div>
				<label>MAIL</label>
				<td><input class="form-control" type="text" name="email" /></td>
			</div>
			<div>
				<div class="form-group">
					<input class="btn btn-default" type="submit" value="Join" >
					<input class="btn btn-default" type="reset" value="Cancel" >
					<a class="btn btn-default" href="${pageContext.request.contextPath}/board/list">MAIN</a>
				</div>
			</div>
		</div>
	</form>
	
</body>
</html>