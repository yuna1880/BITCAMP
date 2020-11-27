package mian;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopupClass extends JFrame {
	
	
	public PopupClass() {
		
		setTitle("Game Result");
		
		
		JPanel panel = new JPanel();
		
		setContentPane(panel);
		
		
		JLabel message = new JLabel("범인 입니다!");
		
		panel.add(message);
		
		
		setSize(300,100);
		setVisible(true);
		
	}
	
	
	
	
	
	

}
