package main;

import javax.swing.JFrame;

public class WindowTestSwing extends JFrame{

	
	public WindowTestSwing() {
		
		setSize(1024, 768); //해상도
		setLocation(0, 0);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이거 해주면 윈도우버튼 자동으로 꺼지게 해준다~!
		
	}
	
	
	
	
}
