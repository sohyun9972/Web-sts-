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

@WebServlet("/detail.do")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 파라미터 세팅
		String id = request.getParameter("id");
//		if(id == null || id.)
		
		LectureService service = new LectureServiceLogic();
		Lecture lecture = service.find(id);
		
		request.setAttribute("lecture", lecture);
		
		request.getRequestDispatcher("views/detail.jsp").forward(request,  response);
	}

}
