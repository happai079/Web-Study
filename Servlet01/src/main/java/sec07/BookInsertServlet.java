package sec07;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookInsertServlet
 */
@WebServlet("/bookInsert2")
public class BookInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String no = request.getParameter("book-no");
		String name = request.getParameter("book-name");
		String author = request.getParameter("book-author");
		int price = Integer.parseInt(request.getParameter("book-price"));
		String year = request.getParameter("book-year");
		String month = request.getParameter("book-month");
		String day = request.getParameter("book-day");
		String pubNo = request.getParameter("book-publisher");
		
		String BookDate = year+"-"+month+"-"+day;		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = null;
		try {
			date = sdf.parse(BookDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		BookVO  vo = new BookVO(no, name, author, price, date, price, pubNo);
		
		BookDAO dao = new BookDAO();
		dao.bookInsert(vo);
		
		// select 결과 페이지로 포워딩
		response.sendRedirect("bookSelect2");
	}
}
