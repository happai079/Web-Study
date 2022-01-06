package sec02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewMemberServlet
 */
@WebServlet("/newMember")
public class NewMemberServlet extends HttpServlet {
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
		// 한글 인코딩
		request.setCharacterEncoding("utf-8");
		
		// input 값 받아오기
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String hp1 = request.getParameter("hp1");
		String hp2 = request.getParameter("hp2");
		String hp3 = request.getParameter("hp3");
		String year = request.getParameter("year");
		String[] interest = request.getParameterValues("interest");
		String department = request.getParameter("department");

		String phone = hp1 + "-"+ hp2 + "-"+ hp3;
		
		// 출력
		System.out.println("성명 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pwd);
		System.out.println("휴대폰 번호 : " + phone);
		System.out.println("학년 : " + year);
		
		System.out.print("관심분야 : ");
		for(String inter : interest) {
			System.out.print(inter + " ");
		}
		System.out.println("");
		
		System.out.println("학과 : " + department);
	}
}
