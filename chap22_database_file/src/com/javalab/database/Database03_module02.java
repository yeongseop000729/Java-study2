package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [static 전역변수]
 *  - JDBC 프로그래밍을 위한 요소들을 모두 멤버변수 즉, 필드 위치로 뽑아올림.
 *   본 클래스 어디서라도 사용가능한 전역변수가 됨.
 * [모듈화]
 *  - 데이터베이스 커넥션 + PreparedStatement + 쿼리실행 작업 모듈
 *  - 실제로 쿼리를 실행하고 결과를 받아오는 부분 모듈
 *  [미션]
 *   - 전체 상품의 정보를 조회하세요.(카테고리명이 나오도록)
 */
public class Database03_module02 {
	// [멤버 변수]
	// 1. oracle 드라이버 이름 문자열 상수
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	// 2. oracle 데이터베이스 접속 경로(url) 문자열 상수
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";

	// 3. 데이터베이스 접속 객체
	public static Connection con = null;
	// 4. query 실행 객체
	public static PreparedStatement pstmt = null;
	// 5. selcet 결과 저장 객체
	public static ResultSet rs = null;

	// 6. oracle 계정(id/pwd)
	public static String oracleId = "tempdb";
	// 7. oracle Password
	public static String oraclePwd = "1234";

	/*
	 * main 메소드가 간결해짐.
	 */
	public static void main(String[] args) {

		// 1. 디비 접속 메소드 호출
		connectDB();

		// 2. 쿼리문 실행 메소드 호출
		// - (여기서는 커넥션 객체 자원을 반납하지 않는다.)
		selectAllProducts();

		// 3. 특정 카테고리에 소속된 상품들만 조회하는 메소드
		// - (여기서는 커넥션 객체 자원을 반납한다.)
		String categoryName = "전자제품";
		selectProductsByCategory(categoryName);
		
		
	}// end main

	/**
	 * 드라이버 로딩과 커넥션 객체 생성 메소드
	 *  - finally로 커넥션 객체를 닫지 않는다. 닫으면 다음 쿼리문에서 사용불가
	 */
	private static void connectDB() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("1. 드라이버 로드 성공!");

			con = DriverManager.getConnection(DB_URL, oracleId, oraclePwd);
			System.out.println("2. 커넥션 객체 생성 성공!");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 ERR! : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		}
	} // end connectDB()	
	
	/**
	 * 모든 상품을 조회해주는 메소드
	 * 드라이버 로딩과 커넥션 객체 생성 메소드
	 *  - finally로 커넥션 객체를 닫지 않는다. 닫으면 다음 쿼리문에서 사용불가
	 */	
	private static void selectAllProducts() {
		try {
			// 3. 쿼리문
			String sql = "select c.category_id, c.category_name, p.product_id, p.product_name,";
			sql += " p.price, to_char(receipt_date, 'yyyy-mm-dd') as receipt_date";
			sql += " from category c left outer join product p on c.category_id = p.category_id";
			sql += " order by c.category_id, p.product_id desc";

			// 4. prepareStatement 객체 얻음
			// 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는
			pstmt = con.prepareStatement(sql);
			System.out.println("3. stmt 객체 생성 성공 : ");

			// 5. 쿼리 실행
			// - 조회된 결과가 ResultSet 객체에 담겨옴
			rs = pstmt.executeQuery();
			System.out.println();

			// 6. rs.next()의 의미 설명
			System.out.println("1. 전체 상품들은 다음과 같습니다.");
			while (rs.next()) {
				System.out.println(rs.getString("category_id") + "\t" + rs.getString("category_name") + "\t"
						+ rs.getString("product_id") + "\t" + rs.getString("product_name") + "\t"
						+ rs.getString("price") + "\t" + rs.getString("receipt_date"));
			}
			System.out.println();
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
				/* [커넥션 객체는 계속해서 다음 메소드에서 써야되기 때문에 닫지 않음.]
				 * if (con != null) {
				 * 	   con.close();
				 * }
				 * */
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		}
	} // end selectProduct

	// 카테고리 이름으로 상품 조회하는 메소드
	private static void selectProductsByCategory(String categoryName) {
		try {
			
			// 1. SQL 쿼리 문장 만들기(파라미터로 전달받은 값으로 조회)
			String sql = "select p.product_id, p.product_name, p.price, ";
				sql += " p.receipt_date, c.category_id, c.category_name ";
				sql += " from product p left outer join category c on p.category_id = c.category_id";
				sql += " where c.category_name = ?";
				sql += " order by p.price desc";
			
			// 2. PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, categoryName);	// 쿼리문에 인자 전달

			// 3. 쿼리를 실행하고 결과를 ResultSet으로 반환받음.
			rs = pstmt.executeQuery();
			
			// 4. ResultSet에서 한개씩 추출
			System.out.println("2.카테고리가 " + categoryName + " 상품들은 다음과 같습니다.");
			while(rs.next()) {
				System.out.println(
						rs.getInt("product_id") + "\t"
						+ rs.getString("product_name") + "\t"
						+ rs.getInt("price") + "\t"
						+ rs.getString("category_name") + "\t"
						+ rs.getDate("receipt_date") + "\t"
				);
			}
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
	} // end selectProductsByCategory

}
