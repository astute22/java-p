package example1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1 extends JFrame{
	//JFrame은 타이틀바, 최소화, 최대화, 닫기, 윈도우를 갖추고있는 클래스
	
	JButton btn = new JButton("버튼");
	public void run() {
		// TODO Auto-generated constructor stub
		//타이틀 지정
		setTitle("첨 만들어보는 윈도우");
		
		//위치, 사이즈 지정
		setBounds(500,500,400,300);
		
		add(btn);
		
		//화면에 표시하기
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.run();
	}
	
}
