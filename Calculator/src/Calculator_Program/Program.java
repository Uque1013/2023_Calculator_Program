package Calculator_Program;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import Calculator_Program.Server;

public class Program extends JFrame {
	
	public Program() {
		setTitle("계산기");	// 타이틀 설정
		setSize(480, 600);	// 프레임 크기 설정
		setVisible(true);	// 프레임 보이게 설정
		setResizable(false);	// 프레임 크기 변경 X
		setLocationRelativeTo(null);	// 프레임이 센터로 오도록함
		setLayout(null);	// 레이아웃을 내 마음대로 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame을 정상적으로 종료
	} // Program() 
	
} // JFrame

	