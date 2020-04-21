<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>강좌등록</title>


<c:set var = "ctx">${pageContext.request.contextPath }</c:set>

<link href="${ctx }/views/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/views/resources/css/style.css" rel="stylesheet">
<!-- 강좌등록 페이지는 list.jsp에서  RegisterServlet을 거쳐서 오기 때문에  
contextPath를 경로에 넣어줘야함 -->

</head>
<body>
   <input id="lectureId" name="lectureId" type="hidden" value="">
   <a href="${ctx }/list.do">강좌목록</a>
   <h3>강좌등록</h3>
   
   <br>
   <form action="register.do" method="post" >
      <table class="table">
            <colgroup>
                <col width="150">
                <col width="*">
            </colgroup>
         <tr>
            <th>강좌명</th>
            <td><input id="lectureName"  name="lectureName" class="form-control" type="text" value=""></td>
         </tr>
         <tr>
            <th>교수명</th>
            <td><input id="instructorName" name="instructorName" class="form-control" type="text" value=""></td>
         </tr>
         <tr>
            <th>강좌소개</th>
            <td><textarea id="lectureIntroduce" name="lectureIntroduce" class="form-control" rows="7"></textarea>
         </tr>
      </table>
        <br>
      <div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="저장"></div>
   </form>
   <br>
</body>
</html>