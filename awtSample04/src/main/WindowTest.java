package main;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;



//채팅창

public class WindowTest extends JFrame /* implements ActionListener */ {

	JTextField textField;
	JTextArea textArea;
	
	JButton btn1, btn2;
	
	public WindowTest() {
	
		super("타이틀바"); //상단 제목
		
		
		/*
		
			Panel
			window 위에 window
			
			TextField, TextArea
			//카톡 및에 문자입력
		
		*/
		
		
		
		JPanel panel =  new JPanel(); //첫번째 도화지
		
		textArea = new JTextArea(); // textarea올리기. // 그 옆에 스크롤바
		textArea.setLineWrap(true); //자동 줄바꿈?
		
		JScrollPane scrPane =  new JScrollPane(textArea); //스크롤
		scrPane.setPreferredSize(new Dimension(400, 300));
		panel.add(scrPane);
		
		
		
		JPanel botpan = new JPanel(); //두번째 도화지
		textField = new JTextField(30);
		
		btn1 = new JButton("next insert");
		//btn1.addActionListener(this);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("next insert");
				
				String msg = textField.getText() + "\n";
				textArea.append(msg);
				
				
			}
			
		});
		
		
		btn2 = new JButton("prev insert");
		//btn2.addActionListener(this);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String msg = textField.getText() + "\n";
				
				try {
					textArea.insert(msg,textArea.getLineStartOffset(0));
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		botpan.add(textField);
		botpan.add(btn1);
		botpan.add(btn2);
		
		Container contentPane = getContentPane();
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
		
		setBounds(100, 100, 640, 480);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
	
		JButton btn = (JButton)e.getSource();
		String btnlabel = btn.getLabel();
				
		if(btnlabel.equals("nest insert")) {
			System.out.println("next insert");
			
		}else if(btnlabel.equals("prev insert")) {
			System.out.println("prev insert");
		}
				
		*/		
			
	}
	
	
	
	


