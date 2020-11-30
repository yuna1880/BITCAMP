package main;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	
	
	//select option  swing에서는 -> JComboBox
	Choice choice; 
	
	Label label;
	
	public WindowTest() {
		
		
		
		
		setLayout(new FlowLayout());
		
		//선택하는 창..
		choice = new Choice();
		choice.add("배");
		choice.add("사과");
		choice.add("바나나");
		choice.add("포도");
		choice.add("샤인머스캣");
		choice.add("오렌지");
		
		
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText( choice.getSelectedItem() ); //선택한 아이템의 텍스트. 라벨로 가져오기.
				
			}
		});
		add(choice); // 
		
		
		label = new Label("---");
		add(label); //뭘 선택했는지 보기 위함.
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	
	
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
