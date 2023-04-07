package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 상품 가격 변경(수정)
 * 탱크로리 상품의 가격을  505000 으로 수정하세오.
 * 기존에 바꿔놓았으면 다시 원래대로 500,000으로 수정하세요.
 */

public class Database05_Update {
	
	public static void main(String[] args) {
		// 오라클 드라이버 로딩 문자열
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 데이터베이스 연결 문자열
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		// 데이터베이스명(계정명)
		String dbId = "tempdb";
		// 데이터베이스 비밀번호
		String dbPwd = "1234";
		
		// 데이터베이스 연결 객체
		Connection con = null;	
		//커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 객체
		PreparedStatement pstmt = null;
		// 실행된 쿼리문의 결과를 반환 받는 객체
		ResultSet rs = null;	
		
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");

			// 2. 데이터베이스 커넥션(연결)
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공!");
			
			// 3. 수정할 상품 관련 변수
			String product_name = "탱크로리";
			int price = 500000;
			
			// 4. PreparedStatement 객체에 사용할 SQL문 생성
			String sql = "update product set price = ?";
				sql += " where product_name = ?";
			
			// 5. 조회조건이 넘어가면 무조건 PreparedStatement 객체 
			//	  PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			
			// 5.1 쿼리문에 인자 전달
			pstmt.setInt(1, price);		// 가격 인자 전달	
			pstmt.setString(2, product_name);	// 조회조건 상품명 전달 

			// 6. PreparedStatement 객체의 executeQuery() 메소드를 통해서 쿼리 실행
			//    데이터 베이스에서 처리된 결과 반환됨
			int resultRows = pstmt.executeUpdate();
			if(resultRows > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
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
