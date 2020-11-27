package main;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowTest extends JFrame implements ActionListener {

	
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
	
	int rand_num;
	
	
	public WindowTest() {
		
		setTitle("Yuna Game");
		setLayout(null);
		
		rand_num = (int)(Math.random()* 9) +1; //1-10까지 출력
		
		btn1 = new JButton();
		btn1.setLabel("1");
		btn1.setBounds(10, 10, 100, 100);
		btn1.addActionListener(this);
		add(btn1);
		
		btn2 = new JButton();
		btn2.setLabel("2");
		btn2.setBounds(130, 10, 100, 100);
		btn2.addActionListener(this);
		add(btn2);
		
		btn3 = new JButton();
		btn3.setLabel("3");
		btn3.setBounds(250, 10, 100, 100);
		btn3.addActionListener(this);
		add(btn3);
		
		btn4 = new JButton();
		btn4.setLabel("4");
		btn4.setBounds(10, 130, 100, 100);
		btn4.addActionListener(this);
		add(btn4);
		
		btn5 = new JButton();
		btn5.setLabel("5");
		btn5.setBounds(130, 130, 100, 100);
		btn5.addActionListener(this);
		add(btn5);
		
		btn6 = new JButton();
		btn6.setLabel("6");
		btn6.setBounds(250, 130, 100, 100);
		btn6.addActionListener(this);
		add(btn6);
		
		btn7 = new JButton();
		btn7.setLabel("7");
		btn7.setBounds(10, 250, 100, 100);
		btn7.addActionListener(this);
		add(btn7);
		
		btn8 = new JButton();
		btn8.setLabel("8");
		btn8.setBounds(130, 250, 100, 100);
		btn8.addActionListener(this);
		add(btn8);
		
		btn9 = new JButton();
		btn9.setLabel("9");
		btn9.setBounds(250, 250, 100, 100);
		btn9.addActionListener(this);
		add(btn9);
		
		btn10 = new JButton("reset");
		btn10.setBounds(10, 400, 340, 100);
		btn9.addActionListener(this);
		add(btn10);
		
		
		setSize(400, 600);
		setLocation(100,100);
		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton jbtn = (JButton)e.getSource();
		String title = jbtn.getLabel();

		if(title.equals("1")) {
			btn1.setEnabled(false);
		}else if(title.equals("2")) {
			btn2.setEnabled(false);
		}else if(title.equals("3")) {
			btn3.setEnabled(false);
		}else if(title.equals("4")) {
			btn4.setEnabled(false);
		}else if(title.equals("5")) {
			btn5.setEnabled(false);
		}else if(title.equals("6")) {
			btn6.setEnabled(false);
		}else if(title.equals("7")) {
			btn7.setEnabled(false);
		}else if(title.equals("8")) {
			btn8.setEnabled(false);
		}else if(title.equals("9")) {
			btn9.setEnabled(false);
		}else if(title.equals("reset")) {
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
			btn4.setEnabled(true);
			btn5.setEnabled(true);
			btn6.setEnabled(true);
			btn7.setEnabled(true);
			btn8.setEnabled(true);
			btn9.setEnabled(true);
		
		if(title.equals(rand_num + "")) {
			
			btn1.setEnabled(false);
			
			JOptionPane.showMessageDialog(null, "당신이 범인입니다");
		
		
			}
		}
		
	}

}
