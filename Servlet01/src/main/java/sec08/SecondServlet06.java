package sec08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet01
 */
@WebServlet("/second06")
public class SecondServlet06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String address = (String) request.getAttribute("address");
		
		out.print("<html><body>");
		out.print("주소: " + address); // null -> redirect 방식으로는 바인딩 불가능!
		out.print("<br> redirect 이용한 바인딩");
		out.print("</body></html>");
	}
}
