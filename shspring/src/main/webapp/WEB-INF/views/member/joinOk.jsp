<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<c:set var="context" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> MEMBER JOIN OK </h1>
	
 	ID : ${member.id} <br />
	PW : ${member.password} <br />
	Mail : ${member.email} <br />
	
	<P> Join Success </P>
	
	<a href="${context}/member/joinForm"> MAIN </a>
</body>
</html>
