import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class test1 extends JFrame{
	public test1() {
		setTitle("은행 입출금 프로그램"); //프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우닫을시 프로그램 종료설정
		
		Container c = getContentPane(); //컨텐트 팬을 알아낸다.
		c.setBackground(Color.cyan); // 컨텐트 팬 색상
		c.setLayout(null); //컨텐트 팬에 배치관리자 삭제
		
		JButton b1 = new JButton("메뉴");
		b1.setLocation(250,300);
		b1.setSize(100,20);
		b1.setBackground(Color.GRAY);
		c.add(b1);
		
		JButton b2 = new JButton("계좌 생성");
		b2.setLocation(100,300);
		b2.setSize(100,20);
		b2.setBackground(Color.GRAY);
		c.add(b2);
		
		JButton b3 = new JButton("수정");
		b3.setLocation(400,300);
		b3.setSize(100,20);
		b3.setBackground(Color.GRAY);
		c.add(b3);
		
		
		setSize(600,700); //프레임 크기
		setVisible(true); // 프레임 출력
	}
	
	public static void main(String[] args) {
		new test1();
	}
}
