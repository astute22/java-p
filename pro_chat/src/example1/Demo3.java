package example1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo3 extends JFrame{

	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	public Demo3() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Demo3();
	}
}
