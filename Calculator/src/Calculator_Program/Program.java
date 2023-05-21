package Calculator_Program;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import Calculator_Program.Server;

public class Program extends JFrame {
	
	private JTextField inputSpace;
	private String num = "";
	private ArrayList<String> equation = new ArrayList<String>();
	public Program() {
		setLayout(null);
		
		inputSpace = new JTextField();
		inputSpace.setEditable(false);	// 편집가능여부 : X (버튼만 사용하여야 함)
		inputSpace.setBackground(Color.WHITE);	// background 색상 설정
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);	// 정렬위치 설정
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));	// font 설정
		inputSpace.setBounds(8, 15, 450, 120);	// x, y, width, height
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(4, 4, 10, 15));	// 격자형태 레이아웃 (가로 칸수, 세로 칸수, 좌우 간격, 위아래 간격)
		btnPanel.setBounds(8, 160, 450, 300);	
		
		String btn_names[] = {"C", "÷", "=", "×", 
				"7", "8", "9", "-",
				"4", "5", "6", "+",
				"1", "2", "3", "0"};
		JButton btn[] = new JButton[btn_names.length];	// 버튼들 배열
		
		//배열을 이용하여 버튼 생성
		for (int i = 0; i < btn_names.length; i++) {
			btn[i] = new JButton(btn_names[i]);
			btn[i].setFont(new Font("Arial", Font.BOLD, 25));	// Font
			
			//버튼 색 지정
			if (btn_names[i] == "C") 
				btn[i].setBackground(Color.BLUE);
			else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14)) 
				btn[i].setBackground(Color.DARK_GRAY);
			else 
				btn[i].setBackground(Color.GRAY);
			
			// font 색 지정	
			btn[i].setForeground(Color.WHITE);
			btn[i].setBorderPainted(false);	// 테두리 제거
			btn[i].addActionListener(new Calculator_ActionListener());
			btnPanel.add(btn[i]);
		}
		
		add(inputSpace);
		add(btnPanel);
		
		setTitle("계산기");	// 타이틀 설정
		setSize(480, 520);	// 프레임 크기 설정
		setVisible(true);	// 프레임 보이게 설정
		setResizable(false);	// 프레임 크기 변경 X
		setLocationRelativeTo(null);	// 프레임이 센터로 오도록함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame을 정상적으로 종료
	} // Program()
	
	class Calculator_ActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();	// 어떤 키가 눌렸는지 알 수 있음
			
			if (operation.equals("C"))	// C가 눌리면 계산식 내용 지움
				inputSpace.setText("");
			else if (operation.equals("=")) {	// =이 눌리면 계산값이 나옴
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			}
			else	// 나머지 버튼 누룰 시 계산식 추가
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());
		} // actionPerformed
	} // Calculator_ActionListener
	
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		for(int i = 0; i < inputText.length(); i++) {	// 계산식의 글자를 하나씩 다 거쳐감
			char ch = inputText.charAt(i);
			
			if(ch == '-' || ch == '+' || ch == '×' || ch == '÷') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			}
			else
				num = num + ch;
		} // for i
		equation.add(num);
	} // fullTextParsing
	
	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		double prev = 0;
		double current = 0;
		String mode = "";
		
		for(String s : equation) {	// 각 연산버튼에 맞춰서 기능 추가
			if(s.equals("+"))
				mode = "add";
			else if(s.equals("-"))
				mode = "sub";
			else if(s.equals("×"))
				mode = "mul";
			else if(s.equals("÷"))
				mode = "div";
			else {	// 숫자이면 문자열을 Double로 형변환
				current = Double.parseDouble(s);
				
				if(mode.equals("add"))
					prev += current;
				else if(mode.equals("sub"))
					prev -= current;
				else if(mode.equals("mul"))
					prev *= current;
				else if(mode.equals("div"))
					prev /= current;
				else
					prev = current;
			}
		} // for s
		return prev;
	}
	
} // JFrame	

	