package lecture.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.domain.Lecture;
import lecture.service.LectureService;
import lecture.service.LectureServiceLogic;


@WebServlet("/list.do")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ListServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Hello Servlet!! ").append(request.getContextPath());
		
		// 서비스 호출
		LectureService service = new LectureServiceLogic();
		List<Lecture> lectures = service.findAll();
		// service의 findAll을 호출하면 store의 readAll이 호출되고 거기서 저장소의 값을 리턴한다.
		
		// 결과값 셋팅
		request.setAttribute("lectures", lectures);
		
		// 화면 전환
		// 결과 위임(ListServlet->list.jsp)
		request.getRequestDispatcher("/views/list.jsp").forward(request, response);
		
		
		
	}

}
