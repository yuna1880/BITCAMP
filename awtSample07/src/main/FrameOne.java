package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameOne extends Frame implements WindowListener {

	
	public FrameOne() {
		
		setLayout(null);
		
		
		Button btn =  new Button("change frame");
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				dispose();
				new FrameTwo(); //자기 창 꺼주면서 frame2를 실행해준다.
				
				
			}
		});
		add(btn);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		setBackground(Color.red);
		
		addWindowListener(this);
		
	}
	

	

	@Override
	public void windowActivated(WindowEvent e) {
		
		
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
