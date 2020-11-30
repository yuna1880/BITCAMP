package main;


import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTwo extends Frame implements WindowListener, ActionListener {

	
	
	Button btn;
	
	//버튼 1개.
	
	
	public FrameTwo() {
		
		setLayout(null);
		
		btn = new Button("two button");
		btn.setBounds(100, 100, 100, 100);
		btn.addActionListener(this);
		add(btn);
		
		
		setBounds(0, 0, 800, 600);
		setVisible(true);
		setBackground(Color.blue);
		
		addWindowListener(this);
		
	}
	

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose(); //this로 dispose
		
		new FrameOne(); //두번째 창 꺼지면서 첫번째 창 생성.
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

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}





	
}
