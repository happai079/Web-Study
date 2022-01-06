package sec07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BookDAO {
	private Connection con = null;
	private DataSource dataSource = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 생성자에서 DB 연결 설정
	public BookDAO() {
		try {
			Context init = new InitialContext();
			dataSource = (DataSource) init.lookup("java:comp/env/jdbc/mysql");
			System.out.println("DB 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 도서 정보 조회 메서드
	public ArrayList<BookVO> bookSelect() {
		ArrayList<BookVO> bookList = new ArrayList<BookVO>();
		
		try {
			con = dataSource.getConnection();
			
			String query =  "select * from book";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString("bookNo");
				String bookName = rs.getString("bookName");
				String bookAuthor = rs.getString("bookAuthor");
				int bookPrice = rs.getInt("bookPrice");
				Date bookDate = rs.getDate("bookDate");
				String pubNo = rs.getString("pubNo");
				
				BookVO vo = new BookVO();
				vo.setBookNo(bookNo);
				vo.setBookName(bookName);
				vo.setBookAuthor(bookAuthor);
				vo.setBookPrice(bookPrice);
				vo.setBookDate(bookDate);
				vo.setPubNo(pubNo);
				
				bookList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}
	
	
	// 도서 정보 등록 메서드
	public void bookInsert(BookVO vo) {
		try {
			con = dataSource.getConnection();
			
			String query = "insert into book values(?,?,?,?,?,null,?)";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String newDate = sdf.format(vo.getBookDate());
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getBookNo());
			pstmt.setString(2, vo.getBookName());
			pstmt.setString(3, vo.getBookAuthor());
			pstmt.setInt(4, vo.getBookPrice());
			pstmt.setString(5, newDate.toString());
			pstmt.setString(6, vo.getPubNo());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) System.out.println("도서 정보 등록 성공!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 도서 정보 삭제
	public void bookDelete(String bookNo) {
		try {
			con = dataSource.getConnection();
			
			String query = "delete from book where bookNo=?";
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bookNo);
			 
			int result = pstmt.executeUpdate();
			
			if(result > 0) System.out.println("도서 정보 삭제 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
