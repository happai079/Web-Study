package sec06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MemberInsert
 */
@WebServlet("/memberInsert")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// (1) 요청 받음
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");

		// (2) 비즈니스 로직 처리
		MemberVO vo = new MemberVO(id, pw, name, email);  // vo 초기화
		MemberDAO dao = new MemberDAO();
		dao.memberInsert(vo);
		
		// (3) 응답 처리
		out.print("<html><head></head><body><h1>회원가입 성공!</h1></body></html>");
		
	}
}
