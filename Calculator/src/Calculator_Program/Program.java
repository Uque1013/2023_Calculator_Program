package Calculator_Program;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import Calculator_Program.Server;

public class Program extends JFrame {
	
	private JTextField inputSpace;	// 계산식이 들어가는 창을 나타냄
	private String num = "";		// 계산식의 숫자를 담을 변수
	private ArrayList<String> equation = new ArrayList<String>();	// 계산 기능을 구현하기 위해
	// ArrayList에 숫자와 연산 기호를 하나씩 구분해 넣음
	
	public Program() {

		inputSpace = new JTextField();
		inputSpace.setEditable(false);	// 편집가능여부 : X (버튼만 사용하여야 함)
		inputSpace.setBackground(Color.WHITE);	// background 색상 설정
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);	// 정렬위치 설정
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));	// font 설정
		inputSpace.setBounds(8, 10, 450, 100);	// x, y, width, height

		setTitle("계산기");	// 타이틀 설정
		setSize(480, 600);	// 프레임 크기 설정
		setVisible(true);	// 프레임 보이게 설정
		setResizable(false);	// 프레임 크기 변경 X
		setLocationRelativeTo(null);	// 프레임이 센터로 오도록함
		setLayout(null);	// 레이아웃을 내 마음대로 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame을 정상적으로 종료

		add(inputSpace);
	} // Program() 
	
	
} // JFrame	

	