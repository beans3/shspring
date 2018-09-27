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

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="${pageContext.request.contextPath}/resouces/bootstrap/js/bootstrap.min.js"></script>

<h1 class="text-center"> 게시판 </h1>

<form action="write" method="post">
		<div style="clear: both; width: 60%; margin: auto;">
				<div>
					<label>id</label>
					<p>${view.id}</p>
				</div>
				<div>
					<label>title</label>
					<p>${view.title}</p>
				</div>
				<div>
					<label>content</label>
					<p>${view.content}</p>
				</div>
				<div>
					<a class="btn btn-default" href="modify_view?code=${view.code}">수정</a>
					<a class="btn btn-default" href="list">목록보기</a>
					<a class="btn btn-default" href="delete?code=${view.code}">삭제</a>
					<a class="btn btn-default" href="reply_view?code=${view.code}">답변</a>
				</div>
		</div>
			
</form>
	
</body>
</html>