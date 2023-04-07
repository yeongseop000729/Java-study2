package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database03_Select {

	public static void main(String[] args) {
		
		// 2. 카테고리가 "전자제품"인 상품들의 정보를 출력하세요.
		// 출력할 컬럼 : 상품ID, 상품명, 가격, 입고일, 카테고리ID, 카테고리명
		// 가격순 정렬
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String dbId = "tempdb";
		String dbPwd = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");
			
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공");
			
			String categoryName = "전자제품";
			
			// SQL 쿼리 문장 만들기(삽입, 수정, 삭제, 조회)
			String sql = "SELECT P.PRODUCT_ID, P.PRODUCT_NAME, P.PRICE,";
			sql += " P.RECEIPT_DATE, C.CATEGORY_ID, C.CATEGORY_NAME";
			sql += " FROM CATEGORY C, PRODUCT P";
			sql += " WHERE P.CATEGORY_ID = C.CATEGORY_ID";
			sql += " AND C.CATEGORY_NAME = ?";
			sql += " ORDER BY P.PRICE DESC";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, categoryName);
			rs = pstmt.executeQuery();
			
			System.out.println("2. 카테고리가 전자제품인 상품들의 정보를 출력하세요.");
			
			while(rs.next()) {
				System.out.println(rs.getString("CATEGORY_ID") + "\t" 
						+ rs.getString("PRODUCT_ID") + "\t"
						+ rs.getString("CATEGORY_NAME") + "\t" 
						+ rs.getInt("PRICE") + "\t"
						+ rs.getString("PRODUCT_NAME") + "\t" 
						+ rs.getDate("RECEIPT_DATE"));
			}
		} catch(ClassNotFoundException e) {
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
