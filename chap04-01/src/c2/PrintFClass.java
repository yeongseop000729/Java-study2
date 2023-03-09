package c2;

import sun.print.resources.serviceui;

//**
 //* printf문
 //* @author magic
 //*
//*/
public class PrintFClass {
	
	public static void main(String[] args) {
		//// printf 문에 사용하는 타입
		// String type : %s
		System.out.printf("이름 %s", "홍길동"); // 이름 : 홍길동
		// decimal : %d
		System.out.printf(" 나이 %d 세", 28); // 나이 : 28세
		
		//순서정하기
		System.out.println(""); // 한 줄 띄움
		System.out.printf("이름: %1$s, 나이 %2$d세, 결혼유무: %3$s ", "홍길동", 28, "미혼");
		
		// 정수 숫자 자릿수
		System.out.println(""); // 한줄 띄움
		System.out.printf("%d", 123456);
		
		System.out.println(""); // 한줄띄움
		System.out.printf("6d : %6d", 12);
		
		//실수 자릿수                                       // "%10.2f"   // "10.2f : %10.2f"
		System.out.println(""); // 한줄 띄움
		System.out.printf("%d", 1234567890);
		System.out.println(""); // 한줄 띄움
		System.out.printf("10.2f : %10.2f", 1234.56); // 총10자리, 소숫점2자리, 마침표1개
		
		System.out.println(""); // 한줄 띄움    // %10 (10자리) .2f (2자리)
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 :%10.2f", 10, area);
	}

}
