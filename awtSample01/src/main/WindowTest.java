package main;

import java.awt.Frame; //awt의 프레임 상속받는다.
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {  // WindowListener 언제 사건이 일어날지 모른다!
																   // 반응이 언제 올지 몰라서 ...추가 
	public WindowTest() {
		
		setSize(640, 480); //기준 사이즈 // window의 폭, 높이 설정.
		setLocation(0, 0); //(좌, 우) // window의 위치.
		setVisible(true); // window의 시각화 (실행시켜주는 것)
		
		addWindowListener(this); //현재 클래스에 listener가 추가가 되어있다고 알려주는 것.
	}

	
	
	@Override
	public void windowActivated(WindowEvent e) { //윈도우가 꺼졌다가 켜졌을때.
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); //강제종료.
	}

	@Override
	public void windowDeactivated(WindowEvent e) { //앱 실행중 전화오면 잠시 deactivated.
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
