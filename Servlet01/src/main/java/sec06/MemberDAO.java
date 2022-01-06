package sec06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con = null;
	private DataSource dataSource = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 생성자에서 DB 연결 설정
	public MemberDAO() {
		try {
			Context init = new InitialContext();
			dataSource = (DataSource) init.lookup("java:comp/env/jdbc/mysql");
			System.out.println("DB 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원 정보 조회
	public ArrayList<MemberVO> memberSelect() {
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();
	
		try {
			con = dataSource.getConnection();
			
			String query = "select * from member";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) { // 결과 세트에서 한 행씩 처리
				// 한 행(회원 1명당) 처리 
				String id = rs.getString("memId");
				String pwd = rs.getString("memPwd");
				String name = rs.getString("memName");
				String email = rs.getString("memEmail");
				Date joinDate = rs.getDate("memJoinDate");
				
				// 한 행 정보 가져와서 MemberVO에 저장 : setter 메소드 사용
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				// 각 MemberVO를 ArrayList에 추가(저장)
				memList.add(vo);				
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				con.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return memList;
	}
	
	
	// 회원 정보 등록
	public void memberInsert(MemberVO vo) {
		try {
			con = dataSource.getConnection();
			
			String query = "insert into member values(?,?,?,?,default)";
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			 
			int result = pstmt.executeUpdate();
			
			if(result > 0) System.out.println("member 등록 성공");
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
	
	
	// 회원 정보 삭제
	public void memberDelete(String id) {
		try {
			con = dataSource.getConnection();
			
			String query = "delete from member where memId=?";
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			 
			int result = pstmt.executeUpdate();
			
			if(result > 0) System.out.println("member 삭제 성공");
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
