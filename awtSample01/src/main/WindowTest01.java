package main;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest01 implements WindowListener { //윈도우 리스너 상속!!!!!

	public WindowTest01() {
		
		//프레임 상속 안하고 불러오는 법!
		Frame frame = new Frame();
		
		frame.setSize(800, 600);
		frame.setLocation(100, 100);
		frame.setVisible(true); //시각화~!
		frame.setTitle("제목"); //타이틀 바
		frame.setBackground(Color.BLUE); //배경 컬러
		
	
		frame.addWindowListener(this);
		
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
