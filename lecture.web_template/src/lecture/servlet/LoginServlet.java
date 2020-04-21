package lecture.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.domain.Lecture;
import lecture.service.LectureService;
import lecture.service.LectureServiceLogic;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/views/loginForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		// Client로부터 받은 데이터 추출
	    String id = request.getParameter("id");
	    String password = request.getParameter("password");
	      	      
	   
	    
	    response.sendRedirect(request.getContextPath());
		
	}

}
