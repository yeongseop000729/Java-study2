package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc03_statement01 {
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String dbId = "square";
		String dbPwd = "1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("1. 드라이버 로드 성공!");
			
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 커넥션 객체 생성 성공!");
			
			// 3. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 
			//	  Statement 객체 얻음
			stmt = con.createStatement();
			System.out.println("3. stmt 객체 생성 성공 : " + stmt);
			
			// 4. 생성한 statment 객체를 통해서 쿼리하기 위한
			//    SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			String sql = "select * from orders";
			
			// 5. Statment 객체의 executeQuery() 메소드를 통해서 쿼리 실행
			//    데이터 베이스에서 조회된 결과가 ResultSet 객체에 담겨옴
			rs = stmt.executeQuery(sql);
			//System.out.println("5. sql명령어 성공적으로 실행됨!! 결과 존재? :" + rs.next());
			System.out.println();
			
			while(rs.next()) {
				System.out.println(rs.getInt("order_id") + "\t" + rs.getInt("cust_id") + "\t" + rs.getInt("book_id") +
						 "\t" + rs.getInt("saleprice") + "\t" + rs.getDate("order_date"));
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
				if (stmt != null) {
					stmt.close();
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