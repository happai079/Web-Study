package sec03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewMemberServlet
 */
@WebServlet("/newMember2")
public class NewMemberServlet2 extends HttpServlet {
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
		
		// 응답처리
		response.setContentType("text/html;charset=utf-8");
		
		// 화면에 출력
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		out.println("<h2>등록한 회원정보</h2>");
		out.println("<table border=1>");
		out.println("<tr><td>성명</td><td>" + name + "</td></tr>");
		out.println("<tr><td>아이디</td><td>" + id + "</td></tr>");
		out.println("<tr><td>비밀번호</td><td>" + pwd + "</td></tr>");
		out.println("<tr><td>휴대폰 번호</td><td>" + phone + "</td></tr>");
		out.println("<tr><td>학년</td><td>" + year + "</td></tr>");
		
		out.print("<tr><td>관심분야</td><td>");
		for(String inter : interest) {
			out.print(inter + " ");
		}
		out.println("</td></tr>");
			
		out.println("<tr><td>학과</td><td>" + department + "</td></tr>");
		out.println("</table></body></html>");
	}
}
