package dao.impl;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import main.menuView;

public class InsertView extends JFrame {

	
	
	
	JLabel label, label1, label2, label3, label4;
	
	JButton btn1, btn2, btn3, btn4;
	
	JTextField tf , tf1, tf2, ft3;
	
	public InsertView() {
		
		
		setTitle("Insert");
		
		Font f1 = new Font("Dialog", Font.BOLD, 25);
		
		setLayout(null);
		
		
		//라벨
		JLabel label = new JLabel("선수 추가");
		label.setBounds(250, 40, 200, 50);
		label.setFont(f1);
		add(label);
		
		
		////////////////////////////////////////포지션 선택
		
		
		JLabel label1 = new JLabel(" 포지션 선택 : ");
		label1.setBounds(150, 80, 100, 50);
		add(label1);
		
		
		//라디오버튼
		JRadioButton rb1 = new JRadioButton("투수");
		JRadioButton rb2 = new JRadioButton("타자");
		
		rb1.setBounds(260, 80, 100, 50);
		rb2.setBounds(360, 80, 100, 50);
		
		rb1.setSelected(true);
		
		ButtonGroup rbGroup1 = new ButtonGroup();
		
		rbGroup1.add(rb1);
		rbGroup1.add(rb2);
		
		
		this.add(rb1);
		this.add(rb2);
		
		
		////////////////////////////////////////선수 이름 입력
		
		
		JLabel label2= new JLabel("선수 이름 : ");
		label2.setBounds(200, 150, 100, 30);
		add(label2);
		
		
		tf = new JTextField(30);
		tf.setBounds(270, 150, 100, 30);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		add(tf);
		
		////////////////////////////////////////선수 나이 입력
		
		JLabel label3= new JLabel("선수 나이 : ");
		label3.setBounds(200, 200, 100, 30);
		add(label3);
		
		tf1 = new JTextField(30);
		tf1.setBounds(270, 200, 100, 30);
		tf1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(tf1);
		
		
		////////////////////////////////////////선수 키 입력
		
		JLabel label4= new JLabel("선수 신장 : ");
		label4.setBounds(200, 250, 100, 30);
		add(label4);
		
		tf2 = new JTextField(30);
		tf2.setBounds(270, 250, 100, 30);
		tf2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(tf2);
		
		
		//////////////////////////////////////// 버튼
		
		btn1 = new JButton("추가");
		btn1.setBounds(190, 500, 100, 30);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		add(btn1);
		
		btn2 = new JButton("이전으로");
		btn2.setBounds(320, 500, 100, 30);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				new menuView();
				
			}
		});
		add(btn2);
		
		
		
		
		setSize(640, 600);
		setLocation(100, 100);
		setVisible(true);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
	}
	
}
	