package com.javalab.awt.pkg01;

import javax.swing.*;
/**
 * [ 생성자에서 만들기 ]
 * JFrame, JButton 및 메소드 호출을 생성하는 모든 코드를
 * Java 생성자 내부에 작성할 수 있습니다.
 */

public class CreateSwing02 {
	// 필드
	JFrame frame; // 프레임
	
	// 생성자
	public CreateSwing02() {
		frame = new JFrame(); // 프레임 생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("click"); // 버튼 생성
		b.setBounds(130, 100, 100, 40); // 버튼의 위치를 설정
		
		frame.add(b); // 버튼을 프레임에 부착
		
		frame.setSize(400, 500); // 프레임 크기 설정
		frame.setLayout(null); // 프레임에 별도의 레이아웃 적용  안함
		frame.setVisible(true); // 프레임 (보이기/안보이기) 설정
	}

	// main 메소드에서 객체 생성
	public static void main(String[] args) {
		new CreateSwing02();
	}
}
