package sec02;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/bookInsert")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String no = request.getParameter("book-no");
		String name = request.getParameter("book-name");
		String author = request.getParameter("book-author");
		String price = request.getParameter("book-price");
		String year = request.getParameter("book-year");
		String month = request.getParameter("book-month");
		String day = request.getParameter("book-day");
		String stock = request.getParameter("book-stock");
		String publisher = request.getParameter("book-publisher");
		
		// 발행일 format처리
		String pubDate = year + "-" + month + "-" + day;
		
		System.out.println("도서번호 : "+ no);
		System.out.println("도서명 : "+ name);
		System.out.println("저자 : "+ author);
		System.out.println("가격 : "+ price);
		System.out.println("발행일 : "+ pubDate);
		System.out.println("재고 : "+ stock);
		System.out.println("출판사번호 : "+ publisher);
	}

}
