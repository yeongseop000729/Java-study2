package com.javalab.fileio.pkg01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream 예제
 * - 1byte 단위로 데이터를 읽어드림.
 */

public class FileInputStreamExam02 {
	public static void main(String[] args) {
		
		// FileInputStream을 try문 밖으로 뺌.
		FileInputStream fis = null;
		
		try {
			// 자바 프로그램 에서 사용할 파일 객체 생성
			// File객체의 생성자에 "파일이 위치한 경로와 파일명 전달"
			File file = new File("C:\\filetest\\123.txt"); // "C:/filetest/123.txt" = 가능하다
			
			// 파일을 읽어들이는 기본 클래스인 FileInputStream 객체를 생성
			// FileInputStream의 생성자에 위에서 만든 File 객체 전달
			//InputStream is = new FileInputStream(file); // 읽어들이는 빨대가 파일에 꽂힘
			fis = new FileInputStream(file);
			
			// read()메소드에 파라미터로 전달됨
			byte[] data = new byte[100];
			
			while (true) {
				int num = fis.read(data); // 100byte를 한꺼번에 읽어들임. 읽은 갯수를 num에 저장
				if(num == -1) break;// 계속 읽어들이다가 -1(즉, 파일의 끝)이 오면 종료
				
				for (int i = 0; i<num; i++) {
					System.out.print((char)data[i]);
				}
			}
			// 지원 종료
			//fis.close()
		} catch (FileNotFoundException e) { // 혹시 파일이 존재하지 않을 경우의 오류 대비
			e.printStackTrace();
		} catch (IOException e) { // 파일을 읽어들이다가 생길지 모르는 오류 대비(예외 처리)
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("파일의 자원을 닫다가 오류남 : " + e.getMessage());
				}
			}
		}
	}

}
