package lecture.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("views/loginForm.jsp");
//		request.getRequestDispatcher("/views/loginForm.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		// request로 부터 파라미터를 꺼내옴 (loginForm.jsp에서 name으로 지정한것)
	    String loginId = request.getParameter("loginId");
//	    String password = request.getParameter("password");
	    
	    // 세션 생성
	    HttpSession session = request.getSession();
	    // 세션에 id 넣기
	    session.setAttribute("userId", loginId);
	    // 세션에서 id 확인하고 등록
	    session.setAttribute("isAdmin", isAdminUser(loginId));
	    // request 객체 다시 보냄
	    response.sendRedirect(request.getContextPath());
	    
	    
	}
	
	private boolean isAdminUser(String loginId) {
		List<String> adminUsers = new ArrayList<String>();
		
		adminUsers.add("admin");
		adminUsers.add("kim");
		// 임의로 admin,kim 이라는 유저를 리스트에 저장
		
		return adminUsers.contains(loginId);

	}
	
}
