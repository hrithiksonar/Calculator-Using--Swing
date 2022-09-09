package com.monocept.model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	private JFrame frmMyfirstcalculator;
	private JTextField txtNull;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmMyfirstcalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	private void initialize() {
		frmMyfirstcalculator = new JFrame("Calculator");
		frmMyfirstcalculator.setForeground(Color.MAGENTA);
		frmMyfirstcalculator.setBackground(Color.BLUE);
		frmMyfirstcalculator.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frmMyfirstcalculator.setTitle("MyFirstCalculator");
		frmMyfirstcalculator.setBounds(100, 100, 337, 360);
		frmMyfirstcalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyfirstcalculator.getContentPane().setLayout(null);

		txtNull = new JTextField();
		txtNull.setBackground(Color.LIGHT_GRAY);
		txtNull.setForeground(Color.RED);
		txtNull.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		txtNull.setBounds(10, 0, 305, 67);
		frmMyfirstcalculator.getContentPane().add(txtNull);
		txtNull.setColumns(10);

		JButton btnNewButton = new JButton("/");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "/";
					txtNull.setText(temp);

				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(141, 76, 89, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("CLEAR");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNull.setText("");
			}
		});
		btnNewButton_2.setBounds(10, 76, 121, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "7";
					txtNull.setText(temp);

				} else {
					txtNull.setText("7");
				}
			}
		});
		btnNewButton_3.setBounds(10, 134, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "8";
					txtNull.setText(temp);

				} else {
					txtNull.setText("8");
				}
			}
		});
		btnNewButton_5.setBounds(59, 134, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "9";
					txtNull.setText(temp);

				} else {
					txtNull.setText("9");
				}
			}
		});
		btnNewButton_4.setBounds(108, 134, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "4";
					txtNull.setText(temp);

				} else {
					txtNull.setText("4");
				}
			}
		});
		btnNewButton_6.setBounds(10, 181, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!(txtNull.equals(""))) {
					String temp = txtNull.getText();
					temp = temp + "5";
					txtNull.setText(temp);

				} else {
					txtNull.setText("5");
				}
			}
		});
		btnNewButton_7.setBounds(59, 181, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "6";
					txtNull.setText(temp);

				} else {
					txtNull.setText("6");
				}
			}
		});
		btnNewButton_8.setBounds(108, 181, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "1";
					txtNull.setText(temp);

				} else {
					txtNull.setText("1");
				}
			}
		});
		btnNewButton_9.setBounds(10, 228, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("2");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "2";
					txtNull.setText(temp);

				} else {
					txtNull.setText("2");
				}
			}
		});
		btnNewButton_10.setBounds(59, 228, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("3");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "3";
					txtNull.setText(temp);

				} else {
					txtNull.setText("3");
				}
			}
		});
		btnNewButton_11.setBounds(108, 228, 50, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "0";
					txtNull.setText(temp);

				} else {
					txtNull.setText("0");
				}
			}
		});
		btnNewButton_12.setBounds(44, 277, 89, 30);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("X");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "X";
					txtNull.setText(temp);

				}
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_13.setBounds(186, 134, 89, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(txtNull.equals(""))) {
					String temp = txtNull.getText();
					temp = temp + "-";
					txtNull.setText(temp);

				}
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_14.setBounds(186, 181, 89, 45);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_14);

		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtNull.equals("")) {
					String temp = txtNull.getText();
					temp = temp + "+";
					txtNull.setText(temp);

				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button.setBounds(186, 228, 89, 45);
		frmMyfirstcalculator.getContentPane().add(button);

		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float result = CalculationClass.calculate(txtNull.getText());
				String ans=String.format("%.1f",result);
				txtNull.setText(ans);

			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.setForeground(Color.GREEN);
		btnNewButton_15.setBounds(240, 82, 62, 30);
		frmMyfirstcalculator.getContentPane().add(btnNewButton_15);
	}

	public void setTxtNull(String txtNull) {
		this.txtNull.setText(txtNull);
	}

	public JFrame getFrame() {
		return frmMyfirstcalculator;
	}
	
	
   
	
}

class CalculationClass {
	public static float calculate(String s) {
		Stack<Integer> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!='+' && ch!='-' && ch!='/' && ch!='X') {
				int j = i;
				StringBuilder sb = new StringBuilder();
				while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
					sb.append(s.charAt(j));
					j++;
				}
				i = j - 1;
				operands.push(Integer.parseInt(sb.toString()));
			} else if (operators.size() > 0 && priority(ch) <= priority(operators.peek())) {
				while (operators.size() > 0 && priority(ch) <= priority(operators.peek())) {
					int val2 = operands.pop();
					int val1 = operands.pop();
					char op = operators.pop();
					operands.push(evaluate(val1, val2, op));
				}
				operators.push(ch);
			} else {
				operators.push(ch);
			}
		}
		while (operators.size() > 0) {
			int val2 = operands.pop();
			int val1 = operands.pop();
			char op = operators.pop();
			operands.push(evaluate(val1, val2, op));
		}
		return operands.pop();
	}

	public static int priority(char op) {
		if (op == '+' || op == '-') {
			return 1;
		} else {
			return 2;
		}
	}

	public static int evaluate(int val1, int val2, char op) {
		if (op == '+') {
			return val1 + val2;
		} else if (op == '-') {
			return val1 - val2;
		} else if (op == 'X') {
			return val1 * val2;
		} else {
			if(val2==0) {
				new Calculator().setTxtNull("Cannot divide by 0");
				new Calculator().getFrame().dispose();
				System.exit(0);
			}
			return val1 / val2;
		}
	}
}

