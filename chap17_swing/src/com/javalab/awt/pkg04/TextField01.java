package com.javalab.awt.pkg04;

import java.awt.event.*;
import javax.swing.*;
/**
 * 텍스트 필드(입력 필드)
 * - JTextField : 입력 받는 칸
 * - https://www.javatpoint.com/java-jtextfield
 */

public class TextField01 extends JFrame implements ActionListener {
	// 필드
	// 윈도우창 JFrame
	static JFrame frame;
	//텍스트 필드
	static JTextField textField;
	// 버튼 객체
	static JButton button;
	static JButton button2;
	// 레이블
	static JLabel labelObj;
	
	// 기본 생성자(default constructor)
	TextField01() {
	}
	
	// main 메소드
	public static void main(String[] args) {
		// 텍스트 필드와 버튼을 저장할(담을) 프레임 생성
		frame = new JFrame("프레임 타이틀");
		
		// 텍스트를 보여줄 레이블 객체 생성
		labelObj = new JLabel("nothing entered");
		
		// 버튼 객체 생성
		button = new JButton("submit");
		button2 = new JButton("submit2");
		
		// 본 클래스의 객체 생성(create a object of the text class)
		TextField01 st = new TextField01();
		
		// [버튼 액션 리스너 설정] 버튼 클릭시 할 행동 정의 메소드 호출
		// 여기는 static main()메소드이므로 객체 생성해서 그 객체를 전달
		button.addActionListener(st);
		button2.addActionListener(st);
		
		// 입력칸이 16개인 텍스트 필드 생성
		textField = new JTextField(16);
		
		// 버튼과 텍스트 필드를 추가할 패널 만들기
		JPanel panel = new JPanel();
		
		// 버튼과 텍스트를 패널에 추가
		panel.add(textField);
		panel.add(button);
		panel.add(button2);
		panel.add(labelObj);
		
		// 패널을 프레임에 추가(add panel to frame)
		// 생성자 내부이면 그냥 add()해도 되는데 여기는 main()메소드이므로
		frame.add(panel);
		
		// 프레임 사이즈 설정(set the size of frame)
		frame.setSize(300, 300);
		
		// 프레임 보이기
		frame.show();
		
	}
		
		// [버튼 액션 리스너-이벤트 처리기] 버튼이 눌렀을 경우 처리할 작업 기술
		// ActionListener에 있는 추상 메소드 이름과 같아야 함. 바꿀수 없음
		// ActionEvent에는 이벤트가 발생한 컴포넌트(버튼, 텍스트필드, 레이블)에 대한 정보가 있음
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand(); // submit
			
			System.out.println("command : " + command);
			if (command.equals("submit")) {
				
				/**
				 * 텍스트 필드의 내용을 레이블의 텍스트로 설정
				 * textField.getText() : 텍스트 필드에 입력된 값 추출
				 * labelObj.setText() : 레이블의 텍스트에 값 설정
				 */
				String tempStr = textField.getText();
				labelObj.setText(tempStr);
				
				// 텍스트 필드의 값을 " "로 클리어
				textField.setText(" ");
			}
			
		}

}
