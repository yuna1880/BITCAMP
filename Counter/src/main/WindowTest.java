package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener, ActionListener {

	Label label1, label2;
	
	Button button1, button2, button3;
	
	private int count = 0;
	
	public WindowTest() {
		
		setLayout(null);
		
		label1 = new Label("카운터");
		label1.setBounds(100, 100, 500, 30);
		label1.setBackground(Color.yellow);
		add(label1);
		
		
		label2 = new Label("" + count);
		label2.setBounds(100, 160, 500, 30);
		label2.setBackground(Color.yellow);
		add(label2);
		
		
		button1 = new Button();
		button1.setLabel("+");
		button1.setBounds(100, 220, 200, 30);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button();
		button2.setLabel("-");
		button2.setBounds(350, 220, 200, 30);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new Button();
		button3.setLabel("reset");
		button3.setBounds(100, 300, 200, 30);
		button3.addActionListener(this);
		add(button3);
		
		
		
		setTitle("Yuna Counter");
		setBounds(100, 100, 640, 480);
		setVisible(true);
		addWindowListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		if(btnTitle.equals("+")) {
			
			count++;
		
			
		}else if(btnTitle.equals("-")) {
			
			if(count > 0) { // count가 0보다 작을때만 --;
				
				count--;
			}
			
		}else {
			
			count = 0;
		}
		
		label2.setText(count + "");
		
		
		
		
		
		
		/*
		if(e.getSource() == button1) {
			
			count++;
			label2.setText(count + "");
		
		}else if(e.getSource() == button2) {
			
			count--;
			label2.setText(count + "");
			
		}else {
			
			count = 0;
			label2.setText(count + "");
			
		}
		*/
		

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
