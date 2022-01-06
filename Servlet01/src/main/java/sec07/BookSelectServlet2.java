package sec07;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sec05.BookDAO;
import sec05.BookVO;

/**
 * Servlet implementation class BookSelectServlet2
 */
@WebServlet("/bookSelect2")
public class BookSelectServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> bookList = dao.bookSelect();
		
		out.print("<html><head></head><body>");
		out.print("<table border=1><tr align='center' bgcolor='gold'>");
		out.print("<td>도서번호</td><td>도서명</td><td>저자</td>"
				+"<td>가격</td><td>발행일</td><td>출판사번호</td><td>삭제</td></tr>");
		
		for(int i=0; i<bookList.size(); i++) {
			BookVO vo = (BookVO) bookList.get(i);
			String bookNo = vo.getBookNo();
			String bookName = vo.getBookName();
			String bookAuthor = vo.getBookAuthor();
			int bookPrice = vo.getBookPrice();
			Date bookDate = vo.getBooDate();
			String pubNo = vo.getPubNo();
			
			out.print("<tr><td>" + bookNo + "</td><td>"
					             + bookName + "</td><td>"
					             + bookAuthor + "</td><td>"
					             + bookPrice + "</td><td>"
					             + bookDate + "</td><td>"
					             + pubNo + "</td><td>"
					             +"<a href='/Servlet01/bookDelete?bookNo=" + bookNo + "'>삭제</a></td></tr>");
		}
		
		out.print("</table></body></html>");
	}

}
