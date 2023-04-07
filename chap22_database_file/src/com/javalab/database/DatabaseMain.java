package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMain {
	
	// [멤버 변수]
	/** database 관련 문자열 상수 선언 **/
	// 1. oracle 드라이버 이름 문자열 상수
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	// 2. oracle 데이터베이스 접속 경로 문자열 상수
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";

	/** database 관련 객체 선언 **/
	// 1. 데이터베이스 접속 객체
	public static Connection con = null;
	// 2. query 실행 객체
	public static Statement stmt = null;
	public static PreparedStatement pstmt = null;
	// 3. selcet 결과 저장 객체
	public static ResultSet rs = null;

	/** 그 외 필요한 객체, 변수 선언 **/
	// 4. oracle 계정(id/pwd)
	public static String oracleId = "tempdb";
	// 5. oracle Password
	public static String oraclePwd = "1234";
	
	/*
	 * 메인 메소드
	 * [주의]한단계를 진행하고 커넥션 객체를 닫기 때문에 실행한 기능은
	 * 		주석처리를 하고 다음 단계로 진행할것.
	 */
	public static void main(String[] args) {

		//// 각 메소드 호출
		// 1. 디비 접속 메소드 호출
		connectDB();
		
		// 2. 전 상품의 카테고리명과 상품명, 가격, 입고일자를 출력 메소드 호출
		selectAllProducts();
		
		// 3. 카테고리가 전자제품인 상품들의 카테고리명, 상품명 가격을 조회
		String categoryName = "전자제품";
		selectProductsByCategory(categoryName);
		
		// 4. 가격이 25,000원 이상인 상품들의 이름과 가격을 조회하시오.
		selectProductGatherThan();
		
		// 5. 카테고리별로 카테고리명과 가격의 합계금액을 조회하되 금액이 큰 순서로 정렬
		selectProductGroupByCategory();
		
		// 6. 상품 추가 카테고리:식료품 / 상품ID : 기존 번호+1 / 상품명 : 양배추 / 가격 : 2000 / 입고일 : 2022/07/10
		insertProduct();
		
		// 7. 상품 가격 변경(수정) 탱크로리 상품의 가격을  600000 으로 수정
		updateProduct();
		
		// 8. 자원 반납
		closeResource();
		
	} // end main()

	private static void selectProductsByCategory(String categoryName) {
		// TODO Auto-generated method stub
		
	}

	// 드라이버 로딩과 커넥션 객체 생성 메소드
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
	} //end connectDB()
	
	// 1. 전 상품의 카테고리명과 상품명, 가격, 입고일자를 출력하되 카테고리로 오름차순 정렬하시오.
	// 커넥션 객체는 이미 connectDB()메소드에서 만들었기 때문에 사용만 하면됨.
	private static void selectAllProducts() {
		String sql = "";
		try {
			// 3. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 
			//	  Statement 객체 얻음
			stmt = con.createStatement();
			System.out.println("3. stmt 객체 생성 성공 : ");
			
			// 4. 생성한 statment 객체를 통해서 쿼리하기 위한
			//    SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			sql = "select c.category_id, c.category_name, p.product_id, p.product_name,";
				sql += " p.price, to_char(receipt_date, 'yyyy-mm-dd') as receipt_date";
				sql += " from category c left outer join product p on c.category_id = p.category_id";
				sql += " order by c.category_id";
			
			// 5. Statment 객체의 executeQuery() 메소드를 통해서 쿼리 실행
			//    데이터 베이스에서 조회된 결과가 ResultSet 객체에 담겨옴
			rs = stmt.executeQuery(sql);
			
			System.out.println("1. 전 상품의 카테고리명과 상품명, 가격, 입고일자를 출력하되 카테고리로 오름차순 정렬");
			// 6. rs.next() 만큼 반복
			// 6.1 제목
			System.out.println("category_id" + " " 
								+ "category_name" + " "
								+ "product_id" + " "
								+ "product_name" + " "
								+ "price" + " "
								+ "receipt_date" + " "
								+ "category_name" 					
					);
			while(rs.next()) {	// 3건(왜냐하면 위에서 rs.next()해서 한번 사용)
				System.out.println(
						rs.getString("category_id") + "\t" 
						+ rs.getString("category_name") + "\t"
						+ rs.getString("product_id") + "\t" 
						+ rs.getString("product_name") + "\t"
						+ rs.getString("price") + "\t"
						+ rs.getString("receipt_date")
				);
			}
			System.out.println();			
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
//				if (con != null) {
//					con.close();
//				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		} // end selectAllMember()	
	}
	
	// 2. 카테고리 이름으로 조회(전자제품)
	private static void selectProductGatherThan() {
		String sql = "";
		try {
			// 3. 조회조건(카테고리 중에서 전자제품)
			String categoryName = "전자제품";
			
			// 4. 생성한 PreparedStatement 객체를 통해서 쿼리하기 위한
			//    SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			sql = "select c.category_name, p.product_name, p.price ";
				sql += " from category c inner join product p on c.category_id = p.category_id";
				sql += " where c.category_name = ?";
			
			// 5. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 
			//	  PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, categoryName);	// 쿼리문에 인자 전달

			// 6. PreparedStatement 객체의 executeQuery() 메소드를 통해서 쿼리 실행
			//    데이터 베이스에서 처리된 결과 반환됨
			rs = pstmt.executeQuery();
			
			// 7. rs.next()의 의미 설명
			System.out.println("2.카테고리가 전자제품인 상품들");
			while(rs.next()) {
				System.out.println(
						rs.getString("category_name") + "\t"
						+ rs.getString("product_name") + "\t"
						+ rs.getString("price") + "\t"
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
//				if (con != null) {
//					con.close();
//				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		}
	} // end selectProductByCategoryName()
	
	// 3. 카테고리가 '전자제품' 인 상품들의 카테고리명, 상품명 가격을 조회
	private static void selectProductByCategory() {
		String sql = "";
		try {
			// 3. 조회조건(카테고리 중에서 전자제품)
			String categoryName = "전자제품";
			
			// 4. 생성한 PreparedStatement 객체를 통해서 쿼리하기 위한
			//    SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			sql = "select c.category_name, p.product_name, p.price ";
				sql += " from category c inner join product p on c.category_id = p.category_id";
				sql += " where c.category_name = ?";
			
			// 5. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 
			//	  PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, categoryName);	// 쿼리문에 인자 전달

			// 6. PreparedStatement 객체의 executeQuery() 메소드를 통해서 쿼리 실행
			//    데이터 베이스에서 처리된 결과 반환됨
			rs = pstmt.executeQuery();
			
			// 7. rs.next()의 의미 설명
			System.out.println("3.카테고리가 전자제품인 상품들");
			while(rs.next()) {
				System.out.println(
						rs.getString("category_name") + "\t"
						+ rs.getString("product_name") + "\t"
						+ rs.getString("price") + "\t"
				);
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
//				if (con != null) {
//					con.close();
//				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		}
	} // end selectProductByCategoryName()	

	
	// 카테고리별로 카테고리명과 가격의 합계금액을 조회하되 금액이 큰 순서로 정렬
	private static void selectProductGroupByCategory() {
		String sql = "";
		try {
			// 3. 생성한 PreparedStatement 객체를 통해서 쿼리하기 위한
			//    SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			sql = "select c.category_name, sum(p.price) as price ";
				sql += " from category c inner join product p on c.category_id = p.category_id";
				sql += " group by c.category_name";
				sql += " order by sum(p.price) desc";
			
			// 5. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 
			//	  PreparedStatement 객체 얻음
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			// 7. rs.next()의 의미 설명
			System.out.println("4. 카테고리별로 카테고리명과 합계금액을 조회하되 금액이 큰 순서  정렬");
			while(rs.next()) {
				System.out.println(
						rs.getString("category_name") + "\t"
						+ rs.getString("price") + "\t"
				);
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
//				if (con != null) {
//					con.close();
//				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		}
	} // end selectProductGroupByCategory()	
	
	// 카테고리 이름으로 조회(전자제품)
	private static void insertProduct() {
		String sql = "";
		try {
			// 3. 저장할 상품 관련 변수
			int product_id = 22;
			String product_name = "양배추";
			int price = 2000;
			int category_id = 5;
			String receiptDate = "20220710";
			
			// 4. PreparedStatement 객체에 사용할 SQL문 생성
			sql = "insert into product values(?, ?, ?, ?, ?)";
			
			// 5. 조회조건이 넘어가면 무조건 PreparedStatement 객체 
			//	  PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			
			// 5.1 쿼리문에 인자 전달
			pstmt.setInt(1, product_id); 
			pstmt.setString(2, product_name);	
			pstmt.setInt(3, price);	
			pstmt.setInt(4, category_id);	
			pstmt.setString(5, receiptDate);	

			// 6. PreparedStatement 객체의 executeQuery() 메소드를 통해서 쿼리 실행
			//    데이터 베이스에서 처리된 결과 반환됨
			int resultRows = pstmt.executeUpdate();
			if(resultRows > 0) {
				System.out.println("저장 성공");
			}else {
				System.out.println("저장 실패");
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
//				if (con != null) {
//					con.close();
//				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			}
		}
	} // end insertProduct()	
	
	// 상품 가격 변경(수정) 탱크로리 상품의 가격을  600000 으로 수정하시오.
	private static void updateProduct() {
		String sql = "";
		try {
			// 3. 수정할 상품 관련 변수
			String product_name = "탱크로리";
			int price = 600000;
			
			// 4. PreparedStatement 객체에 사용할 SQL문 생성
			sql = "update product set price = ?";
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
//				if (con != null) {
//					con.close();
//				}
			} catch (SQLException e) {
				System.out.println("자원해제 ERR! : " + e.getMessage());
			} 
		}
	} // end updateProduct()
	private static void closeResource() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	}
	
	private static void closeResource(PreparedStatement pstmt, ResultSet rs) {
	      try {
	         if (rs != null) {
	            rs.close();
	         }
	         if (pstmt != null) {
	            pstmt.close();
	         }
	      } catch (SQLException e) {
	         System.out.println("자원해제 ERR! : " + e.getMessage());
	      }
	}
}
