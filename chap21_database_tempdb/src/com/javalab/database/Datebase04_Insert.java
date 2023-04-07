package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * product 테이블에 상품 추가
 * 카테고리 : 식료품 / 상품ID : 21 / 상품명 : 시금치 / 가격 : 3500 / 입고일 : 2023/02/01
 */
public class Datebase04_Insert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String dbId = "tempdb";
		String dbPwd = "1234";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql;
		
		try {
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");
			
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공");
			
			int categoryId = 5;
			int productId = 21;
			String productName = "시금치";
			int price = 3500;
			String receiptDate = "2023/02/10";
			
			sql = "insert into product values(?, ?, ?, ?, to_date(?, 'YYYY/MM/DD'))";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, productId);
			pstmt.setString(2, productName);
			pstmt.setInt(3, price);
			pstmt.setInt(4, categoryId);
			pstmt.setString(5, receiptDate);
			
			int resultRows = pstmt.executeUpdate();
			if(resultRows > 0) {
				System.out.println("저장 성공");
			} else {
				System.out.println("저장 실패");
			}
			
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
