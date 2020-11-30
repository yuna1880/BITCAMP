package main;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dao.DeleteView;
import dao.impl.InsertView;

public class menuView extends JFrame implements ActionListener {

	
	JLabel label;
	
	JButton btn1, btn2, btn3, btn4;
	
	
	public menuView() {
		
		
		super("counter");		
		setTitle("Baseball Program");
		
		Font f1 = new Font("Dialog", Font.BOLD, 25);
		
		
		setLayout(null);
		
		//라벨
		JLabel label = new JLabel("Baseball Member");
		label.setBounds(195, 40, 230, 50);
		label.setFont(f1);
		add(label);
		
		
		//버튼
		btn1 = new JButton();
		btn1.setLabel("Insert (선수등록)");
		btn1.setBounds(200, 120, 200, 40);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new InsertView();
				
			}
		});
		add(btn1);
		
		btn2 = new JButton();
		btn2.setLabel("Delete (선수삭제)");
		btn2.setBounds(200, 180, 200, 40);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new DeleteView();
				
			}
		});
		add(btn2);
		
		btn3 = new JButton();
		btn3.setLabel("Select (선수검색)");
		btn3.setBounds(200, 240, 200, 40);
		add(btn3);
		
		btn4 = new JButton();
		btn4.setLabel("Update (선수수정)");
		btn4.setBounds(200, 300, 200, 40);
		add(btn4);
		
		
		
		setSize(640, 600);
		setLocation(100, 100);
		setVisible(true);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
