package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** 
 * 1. book 테이블에서 "굿스포크" 출판사의 모든 책을 조회하세요.
 */
public class Jdbc11_select_cond {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String dbId = "square";
		String dbPwd = "1234";
		
		Connection con = null;

		// 쿼리문에 인자를 전달해서 SQL 구문을 실행해주는 객체
		PreparedStatement pstmt = null; 
		ResultSet rs = null; // select의 결과 객체 저장

		String sql;

		try {
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");

			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공!");

			// 쿼리문에 인자 전달
			String title = "역도";	// bookId가 5인 도서 조회
			int price = 10000;
			
			sql = "SELECT B.BOOK_ID, B.BOOK_NAME, B.PRICE, B.PUBLISHER ";
			sql += " FROM BOOK B ";
			sql += " WHERE B.BOOK_NAME LIKE CONCAT('%' || ? , '%')";
			sql += " AND B.PRICE >= ?";
			
			// 쿼리문에 인자를 전달해서 SQL 구문을 실행해주는 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			rs = pstmt.executeQuery();
			
			System.out.println("3. " + title + " 관련 도서중에서 10,000원이 넘는 도서는 다음과 같습니다.");
			
			while(rs.next()) {
				System.out.println(rs.getInt("book_id") + "\t" 
								+ rs.getString("book_name") + "\t" 
								+ rs.getInt("price"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 ERR! : " + e.getMessage());

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}				
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		}
	}
}
