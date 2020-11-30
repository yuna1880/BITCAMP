package dao;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteView extends JFrame {

	
	
	JLabel label, label1, label2, label3, label4;
	
	JButton btn1, btn2, btn3, btn4;
	
	JTextField tf , tf1, tf2, ft3;
	
	
	public DeleteView() {
		
		
		setTitle("Delete");
		
		Font f1 = new Font("Dialog", Font.BOLD, 25);
		
		setLayout(null);
		
		
		//라벨
		JLabel label = new JLabel("선수 삭제");
		label.setBounds(250, 40, 230, 50);
		label.setFont(f1);
		add(label);
		
		
		
		
		
		
		setSize(640, 600);
		setLocation(100, 100);
		setVisible(true);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
	}
	
	
}
