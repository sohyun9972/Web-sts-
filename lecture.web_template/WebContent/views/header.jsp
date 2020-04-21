<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
	<c:when test="${ userId eq null}">
		<a href="${ctx }/login.do">로그인</a> | <a href="#">회원가입</a>
	</c:when>
	<c:otherwise>
		<b>${userId }</b>님!! 환영합니다. [<a href="${ctx }/logout.do">로그아웃</a>]
	</c:otherwise>
</c:choose>
