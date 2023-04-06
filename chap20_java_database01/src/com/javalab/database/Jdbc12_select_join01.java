package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc12_select_join01 {

	public static void main(String[] args) {
		
		// 3. 주문 테이블과 도서 테이블을 조인해서 주문정보 + 도서정보가 나오도록 조회하세요. (2테이블 조인)
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String dbId = "square";
		String dbPwd = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		String sql;
		
		try {
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");
			
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공!");
			
			sql = "SELECT O.ORDER_ID, O.CUST_ID, O.BOOK_ID,";
			sql += " O.ORDER_DATE, B.BOOK_NAME, B.PUBLISHER, B.PRICE";
			sql += " FROM ORDERS O, BOOK B";
			sql += " WHERE O.BOOK_ID = B.BOOK_ID";
			sql += " ORDER BY O.ORDER_ID ASC";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("3. 주문 테이블과 도서 테이블을 조인해서 주문정보");
			
			while(rs.next()) {
				System.out.println(rs.getInt("ORDER_ID") + "\t"
											+ rs.getInt("CUST_ID") + "\t"
											+ rs.getInt("BOOK_ID") + "\t"
											+ rs.getDate("ORDER_DATE") + "\t" // 날짜는 getDate로 사용
											+ rs.getString("BOOK_NAME") + "\t" 
											+ rs.getString("PUBLISHER") + "\t" 
											+ rs.getInt("PRICE"));
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
