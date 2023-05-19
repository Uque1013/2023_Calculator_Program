package Calculator_Program;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import Calculator_Program.Server;

public class Program extends JFrame {
	// JFrame Calculator = new JFrame("계산기");
	
	public Program() {
		Calculator();			// 계산기 화면 함수
	} // Program
	
	public void Calculator() {	// 계산기 화면
		setTitle("계산기");		// 화면 타이틀
		setSize(480,600);		// 화면 크기
		setVisible(true);		// 화면이 보이는 코드
		setLayout(null);		// 레이아웃 사용자 마음대로 설정 가능하게 함
		setResizable(false);	// 창의 크기 변경 X
		setLocationRelativeTo(null);	// 창의 위치가 화면 중앙으로 나오게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 정상적으로 종료될 수 있게 함
	} // Calculator
	
	
	
} // JFrame

