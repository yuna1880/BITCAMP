package mian;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowTest extends JFrame {
	
	
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
	
	int rand_num;
	
	
	//버튼이 들어갈 메인클래스
	
	public WindowTest() {

		
		setTitle("Yuna Game");
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		rand_num = 
		
		
		
		//1번버튼
		btn1 = new JButton("1");
		btn1.setBounds(30, 30, 50, 50);
		add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton btn1 = (JButton)e.getSource();
				String btn1label = btn1.getLabel();
				
				if(btn1label.equals("1")) {
					
					btn1.setEnabled(false);
					new PopupClass();
	
				}
			
			}
		});
		
		
		btn2 = new JButton("2");		
		setBounds(30, 70, 50, 50);
		add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton btn2 = (JButton)e.getSource();
				String btn2label = btn2.getLabel();
				
				if(btn2label.equals("2")) {
					
					btn2.setEnabled(false);
					new PopupClass2();
	
				}
			
			}
		});
		
		
		
		
		
		
		panel.add(btn1);
		
		setSize(500,500);
		setVisible(true);
		
		setLocation(100, 100);
		
		
	}
	
	
	
	
	
	
	

}
