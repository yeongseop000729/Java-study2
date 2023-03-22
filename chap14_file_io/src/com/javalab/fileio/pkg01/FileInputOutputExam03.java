package com.javalab.fileio.pkg01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream과 FileOutputStream을 통한 이미지 복사(copy)
 */

public class FileInputOutputExam03 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = null; // 데이터 읽어들일 스트림
		FileOutputStream fos = null; // 데이터를 쓸 스트림
		
		try {
			// 원본 파일
			File file = new File("C:/filetest/bird02.png");
			// 복사될 파일
			File newFile = new File("C:/filetest/bird03.png");
			
			fis = new FileInputStream(file); // 입력 스트림 객체 생성(빨대 꽂음)
			fos = new FileOutputStream(newFile); // 출력 스트림 객체 생성
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = fis.read(data);
				if(num == -1) break;
				fos.write(data, 0, num); // 0개 부터 읽어들인 갯수만큼 출력(씀)
			}
			fos.flush(); // 잔류된 데이터 마저 쓰기
			
			System.out.println("복사가 잘 되었습니다.");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("FileInput Strem close Exception : "
														+ e.getMessage());
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println("FileOutput Stream close Exception : " 
																+ e.getMessage());		
				}
			}
		}
	}

}
