<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>

<c:set var = "ctx">${pageContext.request.contextPath }</c:set>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<link href="${ctx }/views/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/views/resources/css/style.css" rel="stylesheet">
<!-- 강좌등록 페이지는 list.jsp에서  RegisterServlet을 거쳐서 오기 때문에  
contextPath를 경로에 넣어줘야함 -->

</head>
<body>
   <input id="lectureId" name="lectureId" type="hidden" value="">
   <a href="${ctx }/list.do">강좌목록</a>
   <h3>로그인</h3>
   
   <br>
   <form action="${ctx }/login.do" method="post" >
      <table class="table">
            <colgroup>
                <col width="300">
            </colgroup>
         <tr>
            <th>아이디</th>
            <td><input id="loginId"  name="loginId" class="form-control" type="text" value="" placeholder="ID를 입력해 주세요."></td>
         </tr>
         <tr>
            <th>비밀번호</th>
            <td><input id="password" name="password" class="form-control" type="text" value="" placeholder="비밀번호를 입력해주세요."></td>
         </tr>
       
      </table>
        <br>
      <div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="로그인"></div>
   </form>
   <br>
</body>
</html>