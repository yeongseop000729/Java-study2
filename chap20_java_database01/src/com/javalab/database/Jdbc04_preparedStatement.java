package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* PreparedStatement 사용 예제 */
public class Jdbc04_preparedStatement {
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
			int bookId = 5; // bookId가 5인 도서 조회
			sql = "select * from book where book_id = ?";
			
			// 쿼리문에 인자를 전달해서 SQL 구문을 실행해주는 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			rs = pstmt.executeQuery();
			
			System.out.println("3. 조회하신 도서는?");
			
			while(rs.next()) {
				System.out.println(rs.getInt("book_id") + "\t" + rs.getString("book_name") + "\t" + rs.getInt("price"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 ERR! : " + e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	}
}
