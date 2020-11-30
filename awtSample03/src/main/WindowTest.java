package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener { //ActionListener 버튼같은것들 감지.

	
	Label label;
	
	Button button1, button2;
	
	public WindowTest(){
		
		setLayout(null);
		
		
		label = new Label("label");
		label.setBounds(100, 100, 300, 30);
		label.setBackground(Color.yellow);
		add(label);
		
		
		button1 = new Button();
		button1.setLabel("one button"); //첫번째 버튼 
		button1.setBounds(100, 160, 150, 30);
		button1.addActionListener(this);    //버튼 액션리스너 달아주기
		add(button1);
		
		button2 = new Button();
		button2.setLabel("two button");
		button2.setBounds(300, 160, 150, 30);
		button2.addActionListener(this);  //버튼 액션리스너 달아주기 -> 콘솔에서 버튼이 반응한다.
		add(button2);
		
		
		setBounds(100, 100, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) { //버튼눌렀을때!
		
		System.out.println("버튼클릭");
		
		//JOptionPane.showMessageDialog(null, "버튼 클릭");
		
				//버튼 구분?
				
				Button btn = (Button)e.getSource(); //버튼으로 캐스트변환!
				String btnTitle = btn.getLabel(); //라벨로 구분~!
				
				
				if(btnTitle.equals("one button")) {//버튼 클릭시 one button click으로 라벨이 변경.
					//JOptionPane.showMessageDialog(null, "one"); 
					
					label.setText("one button click");
					
				}else if(btnTitle.equals("two button")) {//버튼 클릭시 two button click으로 라벨이 변경.
					//JOptionPane.showMessageDialog(null, "two");
					
					label.setText("two button click");
				}
		
		
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
