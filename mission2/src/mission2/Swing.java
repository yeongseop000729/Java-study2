package mission2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing extends JFrame {

	private JTextField inputSpace;
	private String num = "";
	private String prev_operation = "";
	private ArrayList<String> equation = new ArrayList<String>();

	public Swing() {
		setLayout(null);

		inputSpace = new JTextField(); // 필드 선언
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.white); // 결과값 배경 색상 
		inputSpace.setHorizontalAlignment(JTextField.RIGHT); // 결과값 오른쪽에서 왼쪽으로 출력
		inputSpace.setFont(new Font("Arial", Font.BOLD, 40));
		inputSpace.setBounds(0, 10, 380, 110);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 2, 2));
		buttonPanel.setBounds(0, 130, 380, 300);

		String button_names[] = { "0", "÷", "×", "C", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "=" };
		JButton buttons[] = new JButton[button_names.length];

		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
			if (button_names[i] == "C")
				buttons[i].setBackground(Color.gray);
			else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14))
				buttons[i].setBackground(Color.white);
			else
				buttons[i].setBackground(Color.WHITE);
			buttons[i].setForeground(Color.black);
			buttons[i].setBorderPainted(false);
			buttons[i].addActionListener(new PadActionListener());
			buttonPanel.add(buttons[i]);
		}

		add(inputSpace);
		add(buttonPanel);

		setTitle("계산기");
		setVisible(true);
		setSize(396, 469);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class PadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();

			if (operation.equals("C")) {
				inputSpace.setText("");
			} else if (operation.equals("=")) {
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			} else if (operation.equals("+") || operation.equals("-") || operation.equals("×")
					|| operation.equals("÷")) {
				if (inputSpace.getText().equals("") && operation.equals("-")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
				} else if (!inputSpace.getText().equals("") && !prev_operation.equals("+")
						&& !prev_operation.equals("-") && !prev_operation.equals("×") && !prev_operation.equals("÷")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
				}
			} else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());
			}
			prev_operation = e.getActionCommand();
		}
	}

	private void fullTextParsing(String inputText) {
		equation.clear();

		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);

			if (ch == '-' || ch == '+' || ch == '×' || ch == '÷') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		equation.add(num);
		equation.remove("");
	}

	public double calculate(String inputText) {
		fullTextParsing(inputText);

		double prev = 0;
		double current = 0;
		String mode = "";

		for (int i = 0; i < equation.size(); i++) {
			String s = equation.get(i);

			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("×")) {
				mode = "mul";
			} else if (s.equals("÷")) {
				mode = "div";
			} else {
				if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("×")
						&& !s.equals("÷")) {
					Double one = Double.parseDouble(equation.get(i - 2));
					Double two = Double.parseDouble(equation.get(i));
					Double result = 0.0;

					if (mode.equals("mul")) {
						result = one * two;
					} else if (mode.equals("div")) {
						result = one / two;
					}

					equation.add(i + 1, Double.toString(result));

					for (int j = 0; j < 3; j++) {
						equation.remove(i - 2);
					}

					i -= 2; 
				}
			}
		} 

		for (String s : equation) {
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else {
				current = Double.parseDouble(s);
				if (mode.equals("add")) {
					prev += current;
				} else if (mode.equals("sub")) {
					prev -= current;
				} else {
					prev = current;
				}
			}
			prev = Math.round(prev * 100000) / 100000.0;
		}

		return prev;
	}

	public static void main(String[] args) {
		new Swing();

	}

}