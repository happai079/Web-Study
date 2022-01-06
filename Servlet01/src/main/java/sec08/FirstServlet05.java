package sec08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet02
 */
@WebServlet("/first05")
public class FirstServlet05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// dispatch 방식 - url 바뀌지 않음
		RequestDispatcher dispatch = request.getRequestDispatcher("second05?name=lee");
		dispatch.forward(request, response);
	}

}
