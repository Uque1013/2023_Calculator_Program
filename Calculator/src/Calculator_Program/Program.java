package Calculator_Program;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import Calculator_Program.Server;

public class Program extends JFrame {
	// JFrame Calculator = new JFrame("계산기");
	
	static JButton Plus = new JButton();	// 더하기
	static JButton Minus = new JButton();	// 빼기 
	static JButton Multiply = new JButton();// 곱하기
	static JButton Devide = new JButton();	// 나누기
	static JButton Remain = new JButton();	// 나머지
	static JButton Total = new JButton();	// 합계
	static JButton Delete = new JButton();	// 지우기
	
	// 버튼 이미지 생성
	private ImageIcon total = new ImageIcon(Server.class.getResource("../Image/Total.png"));
	private ImageIcon total_click = new ImageIcon(Server.class.getResource("../Image/Total2.png"));
	
	public Program() {
		Calculator();			// 계산기 화면 함수
		Button();				// 버튼 함수
	} // Program
	
	public void Calculator() {	// 계산기 화면
		setTitle("계산기");		// 화면 타이틀
		setSize(480,600);		// 화면 크기
		setVisible(true);		// 화면이 보이는 코드
		setLayout(null);		// 레이아웃 사용자 마음대로 설정 가능하게 함
		setResizable(false);	// 창의 크기 변경 X
		setLocationRelativeTo(null);	// 창의 위치가 화면 중앙으로 나오게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 정상적으로 종료될 수 있게 함
	} // Calculator()
	
	public void Button() {
		Total.setLayout(null);
		Total.setIcon(total);	// 기본 이미지 설정
		Total.setBorderPainted(false);	// 버튼 테두리 해제
		Total.setBounds(345, 300, 120, 120);	// 버튼 위치 설정
		Total.setRolloverIcon(total_click);
		
		add(Total);
	} // Button()
	
	
} // JFrame

