package mian;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopupClass2 extends JFrame {
	
public PopupClass2() {
		
		setTitle("Game Result");
		
		
		JPanel panel = new JPanel();
		
		setContentPane(panel);
		
		
		JLabel message = new JLabel("범인이 아닙니다!");
		
		panel.add(message);
		
		
		setSize(300,100);
		setVisible(true);
		
	}


}
