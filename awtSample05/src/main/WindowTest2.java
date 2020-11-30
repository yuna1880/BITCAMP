package main;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


//Jframe으로 라디오버튼 만들기~!

public class WindowTest2 extends JFrame implements ActionListener, ItemListener {

	
	
	
	public WindowTest2() {
		
		setTitle("라디오 버튼");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new FlowLayout());
		
		
		
		JRadioButton rb1 = new JRadioButton("유나");
		JRadioButton rb2 = new JRadioButton("낭낭");
		JRadioButton rb3 = new JRadioButton("상진");
		
		rb3.setSelected(true);

		//라디오 그룹!
		ButtonGroup rbGroup1 = new ButtonGroup();
		
		//그룹에 저장!
		rbGroup1.add(rb1);
		rbGroup1.add(rb2);
		rbGroup1.add(rb3);
		
		this.add(rb1);
		this.add(rb2);
		this.add(rb3);
		
		JLabel lb1 = new JLabel("yunayuna");
		this.add(lb1);
		
		
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	

	}




	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
