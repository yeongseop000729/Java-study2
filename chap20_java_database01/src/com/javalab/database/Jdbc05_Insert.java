package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * PreparedStatement 통한 데이터 삽입
 */
public class Jdbc05_Insert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String dbId = "square";
		String dbPwd = "1234";
		
		Connection con = null;
		// PreparedStatement 객체 변수 pstmt를 선언
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select의 결과 객체 저장
		
		String sql; // SQL문을 저장할 변수 선언
		
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");
			
			// 2. 데이터베이스 커넥션 연결
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공!");
			
			// 3. 테이블에 ? 문자가 포함된 INSERT 문에 넣을 인자 생성
			int bookId = 14;
			String bookName = "오라클 함수 알아보기";
			String publish = "한빛미디어";
			int price = 28000;
			
			// 4. 저장 SQL문 생성하기(여러개의 ?가 있음)
			sql = "insert into book values(?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			pstmt.setString(2, bookName);
			pstmt.setString(3, publish);
			pstmt.setInt(4, price);
			
			int result = pstmt.executeUpdate();
			System.out.println("저장된 갯수 : " + result);
			
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 ERR : " + e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close(); // PrepareStatement 객체를 메모리에
				}
				if (con != null) {
					con.close();
				}
				
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		} // finally 끝
	}
}
