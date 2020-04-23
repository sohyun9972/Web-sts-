<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상세조회</title>
<c:set var="ctx">${pageContext.request.contextPath} </c:set>

<link href="${ctx}/views/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx}/views/resources/css/style.css" rel="stylesheet">
</head>
<body>
   <input id="lectureId" name="lectureId" type="hidden"
      value="${lecture.id}">
   <a href="list.do">강좌목록</a>
   <h3>상세조회</h3>
   <table class="table">
      <colgroup>
         <col width="150">
         <col width="*">
      </colgroup>
      <tr>
         <th>강좌명</th>
         <td><input id="lectureName" name="lectureName"
            class="form-control" type="text" value="SpringMVC"
            readonly></td>
      </tr>
      <tr>
         <th>교수명</th>
         <td><input id="instructorName" name="instructorName"
            class="form-control" type="text" value="NEXTREE"
            readonly></td>
      </tr>
      <tr>
         <th>강좌소개</th>
         <td><textarea id="lectureIntroduce" name="lectureIntroduce"
               class="form-control" rows="7" readonly>스프링MVC를 이용하여 MVC패턴의 웹프로그래밍을 배워봅니다.</textarea></td>
      </tr>
   </table>
   <br>

</body>
</html>