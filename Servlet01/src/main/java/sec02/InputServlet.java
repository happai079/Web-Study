package sec02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String emailRcv = request.getParameter("emailRcv");
		
		// 체크박스 - 동일한 name으로 여러 개의 값이 전달되는 경우 배열로 받음
		String[] subject = request.getParameterValues("subject");
		
		// 출력
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pw);
		System.out.println("이메일 수신 여부: " + emailRcv);
		
		System.out.print("선택한 과목: ");
		for(String sub : subject) {
			System.out.print(sub+" ");
		}
		System.out.println("");
	}

}
