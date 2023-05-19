package Calculator_Program;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import Calculator_Program.Server;

public class Program extends JFrame {

	// 계산 버튼
	static JButton Plus = new JButton();	// 더하기
	static JButton Minus = new JButton();	// 빼기 
	static JButton Multiply = new JButton();// 곱하기
	static JButton Devide = new JButton();	// 나누기
	static JButton Percent = new JButton();	// 퍼센트 (0.01 곱함)
	static JButton Total = new JButton();	// 합계
	static JButton Delete = new JButton();	// 지우기
	static JButton Reset = new JButton();	// 리셋
	static JButton Dot = new JButton();		// 점 찍기 (소수만들기)
	
	// 숫자 버튼
	static JButton Num1 = new JButton();
	static JButton Num2 = new JButton();
	static JButton Num3 = new JButton();
	static JButton Num4 = new JButton();
	static JButton Num5 = new JButton();
	static JButton Num6 = new JButton();
	static JButton Num7 = new JButton();
	static JButton Num8 = new JButton();
	static JButton Num9 = new JButton();
	static JButton Num0 = new JButton();
	
	
	// 계산 버튼 이미지 생성
	private ImageIcon total = new ImageIcon(Server.class.getResource("../Image/Total.png"));
	private ImageIcon total_click = new ImageIcon(Server.class.getResource("../Image/Total2.png"));
	private ImageIcon plus = new ImageIcon(Server.class.getResource("../Image/Plus.png"));
	private ImageIcon plus_click = new ImageIcon(Server.class.getResource("../Image/Plus2.png"));
	private ImageIcon minus = new ImageIcon(Server.class.getResource("../Image/Minus.png"));
	private ImageIcon minus_click = new ImageIcon(Server.class.getResource("../Image/Minus2.png"));
	private ImageIcon multiply = new ImageIcon(Server.class.getResource("../Image/Multiply.png"));
	private ImageIcon multiply_click = new ImageIcon(Server.class.getResource("../Image/Multiply2.png"));
	private ImageIcon devide = new ImageIcon(Server.class.getResource("../Image/Devide.png"));
	private ImageIcon devide_click = new ImageIcon(Server.class.getResource("../Image/Devide2.png"));
	private ImageIcon percent = new ImageIcon(Server.class.getResource("../Image/Percent.png"));
	private ImageIcon percent_click = new ImageIcon(Server.class.getResource("../Image/Percent2.png"));
	private ImageIcon delete = new ImageIcon(Server.class.getResource("../Image/Delete.png"));
	private ImageIcon delete_click = new ImageIcon(Server.class.getResource("../Image/Delete2.png"));
	private ImageIcon reset = new ImageIcon(Server.class.getResource("../Image/Reset.png"));
	private ImageIcon reset_click = new ImageIcon(Server.class.getResource("../Image/Reset2.png"));
	private ImageIcon dot = new ImageIcon(Server.class.getResource("../Image/Dot.png"));
	private ImageIcon dot_click = new ImageIcon(Server.class.getResource("../Image/Dot2.png"));
	
	// 숫자 버튼 이미지 생성
	private ImageIcon num1 = new ImageIcon(Server.class.getResource("../Num_Image/Num1.png"));
	private ImageIcon num1_click = new ImageIcon(Server.class.getResource("../Num_Image/Num1_2.png"));
	private ImageIcon num2 = new ImageIcon(Server.class.getResource("../Num_Image/Num2.png"));
	private ImageIcon num2_click = new ImageIcon(Server.class.getResource("../Num_Image/Num2_2.png"));
	private ImageIcon num3 = new ImageIcon(Server.class.getResource("../Num_Image/Num3.png"));
	private ImageIcon num3_click = new ImageIcon(Server.class.getResource("../Num_Image/Num3_2.png"));
	private ImageIcon num4 = new ImageIcon(Server.class.getResource("../Num_Image/Num4.png"));
	private ImageIcon num4_click = new ImageIcon(Server.class.getResource("../Num_Image/Num4_2.png"));
	private ImageIcon num5 = new ImageIcon(Server.class.getResource("../Num_Image/Num5.png"));
	private ImageIcon num5_click = new ImageIcon(Server.class.getResource("../Num_Image/Num5_2.png"));
	private ImageIcon num6 = new ImageIcon(Server.class.getResource("../Num_Image/Num6.png"));
	private ImageIcon num6_click = new ImageIcon(Server.class.getResource("../Num_Image/Num6_2.png"));
	private ImageIcon num7 = new ImageIcon(Server.class.getResource("../Num_Image/Num7.png"));
	private ImageIcon num7_click = new ImageIcon(Server.class.getResource("../Num_Image/Num7_2.png"));
	private ImageIcon num8 = new ImageIcon(Server.class.getResource("../Num_Image/Num8.png"));
	private ImageIcon num8_click = new ImageIcon(Server.class.getResource("../Num_Image/Num8_2.png"));
	private ImageIcon num9 = new ImageIcon(Server.class.getResource("../Num_Image/Num9.png"));
	private ImageIcon num9_click = new ImageIcon(Server.class.getResource("../Num_Image/Num9_2.png"));
	private ImageIcon num0 = new ImageIcon(Server.class.getResource("../Num_Image/Num0.png"));
	private ImageIcon num0_click = new ImageIcon(Server.class.getResource("../Num_Image/Num0_2.png"));
	
	public Program() {
		Calculator();			// 계산기 화면 함수
		Calculation_Button();	// 계산 버튼 함수
		Num_Button();			// 숫자 버튼 함수
	} // Program()
	
	public void Calculator() {	// 계산기 화면
		setTitle("계산기");		// 화면 타이틀
		setSize(480,600);		// 화면 크기
		setVisible(true);		// 화면이 보이는 코드
		setLayout(null);		// 레이아웃 사용자 마음대로 설정 가능하게 함
		setResizable(false);	// 창의 크기 변경 X
		setLocationRelativeTo(null);	// 창의 위치가 화면 중앙으로 나오게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 정상적으로 종료될 수 있게 함
	} // Calculator()
	
	public void Calculation_Button() {
		Total.setLayout(null);
		Total.setIcon(total);					// 기본 이미지 설정
		Total.setBorderPainted(false);			// 버튼 테두리 해제
		Total.setBounds(345, 492, 120, 70);		// 버튼 위치 설정
		Total.setRolloverIcon(total_click);		// 마우스 올리면 버튼 색상 변경
		
		Plus.setLayout(null);
		Plus.setIcon(plus);
		Plus.setBorderPainted(false);
		Plus.setBounds(345, 422, 120, 70);
		Plus.setRolloverIcon(plus_click);
		
		Minus.setLayout(null);
		Minus.setIcon(minus);
		Minus.setBorderPainted(false);
		Minus.setBounds(345, 352, 120, 70);
		Minus.setRolloverIcon(minus_click);
		
		Multiply.setLayout(null);
		Multiply.setIcon(multiply);
		Multiply.setBorderPainted(false);
		Multiply.setBounds(345, 282, 120, 70);
		Multiply.setRolloverIcon(multiply_click);
		
		Devide.setLayout(null);
		Devide.setIcon(devide);
		Devide.setBorderPainted(false);
		Devide.setBounds(345, 212, 120, 70);
		Devide.setRolloverIcon(devide_click);
		
		Percent.setLayout(null);
		Percent.setIcon(percent);
		Percent.setBorderPainted(false);
		Percent.setBounds(115, 212, 120, 70);
		Percent.setRolloverIcon(percent_click);
		
		Delete.setLayout(null);
		Delete.setIcon(delete);
		Delete.setBorderPainted(false);
		Delete.setBounds(225, 212, 120, 70);
		Delete.setRolloverIcon(delete_click);
		
		Reset.setLayout(null);
		Reset.setIcon(reset);
		Reset.setBorderPainted(false);
		Reset.setBounds(0, 212, 120, 70);
		Reset.setRolloverIcon(reset_click);
		
		Dot.setLayout(null);
		Dot.setIcon(dot);
		Dot.setBorderPainted(false);
		Dot.setBounds(225, 492, 120, 70);
		Dot.setRolloverIcon(dot_click);
		
		add(Dot);
		add(Reset);
		add(Delete);
		add(Percent);
		add(Devide);
		add(Multiply);
		add(Minus);
		add(Total);
		add(Plus);
	} // Calculation_Button()
	
	public void Num_Button() {
		Num1.setLayout(null);
		Num1.setIcon(num1);
		Num1.setBorderPainted(false);
		Num1.setBounds(0, 422, 120, 70);
		Num1.setRolloverIcon(num1_click);
		
		Num2.setLayout(null);
		Num2.setIcon(num2);
		Num2.setBorderPainted(false);
		Num2.setBounds(115, 422, 120, 70);
		Num2.setRolloverIcon(num2_click);
		
		Num3.setLayout(null);
		Num3.setIcon(num3);
		Num3.setBorderPainted(false);
		Num3.setBounds(225, 422, 120, 70);
		Num3.setRolloverIcon(num3_click);
		
		Num4.setLayout(null);
		Num4.setIcon(num4);
		Num4.setBorderPainted(false);
		Num4.setBounds(0, 352, 120, 70);
		Num4.setRolloverIcon(num4_click);
		
		Num5.setLayout(null);
		Num5.setIcon(num5);
		Num5.setBorderPainted(false);
		Num5.setBounds(115, 352, 120, 70);
		Num5.setRolloverIcon(num5_click);
		
		Num6.setLayout(null);
		Num6.setIcon(num6);
		Num6.setBorderPainted(false);
		Num6.setBounds(225, 352, 120, 70);
		Num6.setRolloverIcon(num6_click);
		
		Num7.setLayout(null);
		Num7.setIcon(num7);
		Num7.setBorderPainted(false);
		Num7.setBounds(0, 282, 120, 70);
		Num7.setRolloverIcon(num7_click);
		
		Num8.setLayout(null);
		Num8.setIcon(num8);
		Num8.setBorderPainted(false);
		Num8.setBounds(115, 282, 120, 70);
		Num8.setRolloverIcon(num8_click);
		
		Num9.setLayout(null);
		Num9.setIcon(num9);
		Num9.setBorderPainted(false);
		Num9.setBounds(225, 282, 120, 70);
		Num9.setRolloverIcon(num9_click);
		
		Num0.setLayout(null);
		Num0.setIcon(num0);
		Num0.setBorderPainted(false);
		Num0.setBounds(0, 492, 240, 70);
		Num0.setRolloverIcon(num0_click);
		
		add(Num1);
		add(Num2);
		add(Num3);
		add(Num4);
		add(Num5);
		add(Num6);
		add(Num7);
		add(Num8);
		add(Num9);
		add(Num0);
	} // Num_Button()
	
	
} // JFrame

