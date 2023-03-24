package com.javalab.awt.pkg01;

import javax.swing.*;
/**
 * 버튼(Button) 만들기
 * - 하나의 버튼을 생성하고 이를 JFrame 객체 추가
 * - setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 프레임닫기
 */

public class CreateSwing01 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // 프레임 생성(윈도우 창)
		
		// 창이 닫히지만 JVM에는 남아 있음. 그래서 창을 완전하게 닫아줌.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("click"); // 버튼생성
		b.setBounds(130, 100, 100, 40); // x axis, y axis, width, height
		
		f.add(b); // 버튼을 프레임에 추가
		
		f.setSize(400, 500); // 400 width and 500 height
		f.setLayout(null); // 별도의 레이아웃은 없음으로 설정
		f.setVisible(true); // 보이기
	}

}
