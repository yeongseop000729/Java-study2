package sec03;

//**
 //* 자바 주석
 //* 기본형<----> 문자열(String) 변환
 //* 한줄 주석 : //
 //*
public class PrimitiveAndStringConversion {
	
	public static void main(String[] args) {
		// 정수 문자열 "10"을 int 형으로 변환
		int value1 = Integer.parseInt("10");   // *제일 많이 사용*
		// 실수 문자열 "3.14"를 double 형으로 변환
		double value2 = Double.parseDouble("3.14");
		// boolean 문자열 "true"를 boolean 형으로 변환
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		// 숫자를 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
	

}


