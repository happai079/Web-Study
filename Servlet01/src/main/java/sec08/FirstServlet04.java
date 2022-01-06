package sec08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet02
 */
@WebServlet("/first04")
public class FirstServlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// location을 이용한 포워딩
	// 자바스크립트의 location 객체 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("second04?name=hong");
	}

}
