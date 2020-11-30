package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	
	
	public WindowTest() {
		
	//	setLayout(new FlowLayout()); //레이블 둘 다 나오도록 하는 것!
		
		//그리드 레이아웃 (격자 레이아웃)
	//	setLayout(new GridLayout(3,1)); // 가로,세로로 나눈값 (3개의 줄칸 1칸)
		
		setLayout(null); //레이아웃 사용 x !! (다 겹쳐서 안나온다) -> setBounds로 위치,정해준다
		
		
		
		
		// Label
		Label label = new Label();
		label.setText("Label");
		label.setBounds(150, 30, 50, 30);
		add(label);
		
		
		Label label1 = new Label("레이블입니다.");
		label1.setBackground(Color.yellow);
		label1.setBounds(150, 80, 70, 30);
		add(label1);
		
		
		Button button = new Button();
		button.setLabel("버튼");
		button.setBounds(150, 150, 50, 50);
		add(button);
		
		
		
		setSize(640, 480);
		setLocation(100, 100);
		
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
