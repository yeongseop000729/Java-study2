package com.javalab.database;

/** 오라클 JDBC 드라이버 로딩 **/
public class Jdbc01_DriverLoad {
	
	public static void main(String[] args) {
		
		// 오라클 jdbc 드라이버 클래스의 완전한 풀 네임
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			/**
			 * Class.forName("문자열") : 문자열로 주어진 JDBC 클래스를 빌드 패스에서 찾아서 로딩
			 * 해당 클래스가 없으면 ClassNotFoundException 예외 발생
			 */
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류 " + e.getMessage());
		}
	}
}