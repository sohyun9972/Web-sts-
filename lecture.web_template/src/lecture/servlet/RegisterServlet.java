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


@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/views/registerForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  // Client로부터 받은 데이터 추출
	      String lectureName = request.getParameter("lectureName");
	      String instructorName = request.getParameter("instructorName");
	      String lectureIntroduce = request.getParameter("lectureIntroduce");
	      
	      // 새로운 강좌 생성
	      Lecture lecture = new Lecture(lectureName, instructorName, lectureIntroduce);
	      
	      // 서비스 호출
	      LectureService service = new LectureServiceLogic();
	      service.register(lecture);
	      
	      response.sendRedirect(request.getContextPath());
	}

}
