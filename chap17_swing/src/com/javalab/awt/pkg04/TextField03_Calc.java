package com.javalab.awt.pkg04;

import javax.swing.*;
import java.awt.event.*;

/*
 *  텍스트 필드와 버튼을 사용한 초간단 계산기
 */
public class TextField03_Calc implements ActionListener {
	JTextField tf1, tf2, tf3;
	JButton b1, b2;
	
	// 기본 생성자
	public TextField03_Calc() {
		JFrame f = new JFrame(); // 프레임 객체 생성
		
		tf1= new JTextField(); // 텍스트 필드 객체 생성
		tf1.setBounds(50, 50, 150, 20);
	}

}
