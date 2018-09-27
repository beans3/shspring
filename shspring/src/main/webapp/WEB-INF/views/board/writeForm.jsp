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

<h1 class="text-center"> 글쓰기 페이지 </h1>

<form action="write" method="post">
		<div style="clear: both; width: 60%; margin: auto;">
				<div>
					<label>id</label>
					<input type="text" class="form-control" placeholder="Text input" name="id" />
				</div>
				<div>
					<label>title</label>
					<input type="text" class="form-control" placeholder="Text input" name="title" />
				</div>
				<div>
					<label>content</label>
					<textarea class="form-control" name="content" rows="3"></textarea>
				</div>
				<div>
					<input class="btn btn-default" type="submit" value="입력"><a class="btn btn-default" href="list">목록보기</a>
				</div>
		</div>
</form>
</body>
</html>