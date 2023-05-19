package Calculator_Program;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import Calculator_Program.Server;

public class Program extends JFrame {

	static JButton Plus = new JButton();	// 더하기
	static JButton Minus = new JButton();	// 빼기 
	static JButton Multiply = new JButton();// 곱하기
	static JButton Devide = new JButton();	// 나누기
	static JButton Total = new JButton();	// 합계
	static JButton Delete = new JButton();	// 지우기
	static JButton Reset = new JButton();	// 리셋
	
	// 버튼 이미지 생성
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
	
	public Program() {
		Calculator();			// 계산기 화면 함수
		Button();				// 버튼 함수
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
	
	public void Button() {
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
		
		add(Devide);
		add(Multiply);
		add(Minus);
		add(Total);
		add(Plus);
	} // Button()
	
	
} // JFrame

