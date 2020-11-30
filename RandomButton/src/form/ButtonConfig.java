package form;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//버튼 개수 결정, 다음창으로 넘어가게 하기.
public class ButtonConfig extends JFrame implements ActionListener, WindowListener {

	
	TextField tf;
	Button setBtn, startBtn;
	
	int buttonCount;
	
	
	public ButtonConfig() {
		
		super("설정"); //버튼개수 설정하는 곳
		
		
		setLayout(null); //레이아웃 잡기.
		
		buttonCount = 2;
		
		Label label = new Label("Button Count");
		label.setBounds(30, 30, 240, 30);
		add(label);
		
		tf = new TextField(2);               //텍스트 입력하는 곳
		tf.setBounds(30, 80, 240, 20);
		add(tf);
		
		//버튼
		setBtn = new Button("set");
		setBtn.setBounds(30, 120, 100, 30);
		setBtn.addActionListener(this);
		add(setBtn);
		
		startBtn = new Button("start");
		startBtn.setBounds(160, 120, 100, 30);
		startBtn.addActionListener(this);
		add(startBtn);
		
		
		setSize(320, 240);
		setLocation(100, 100);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	
	
	
	
	
	
	//버튼 개수 결정, 다음창으로 넘어가게 하기.
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Button btn =  (Button)e.getSource();
		String btnLabel = btn.getLabel();
		
		if(btnLabel.equals("set")) {
			
			buttonCount = Integer.parseInt(tf.getText()); //정수의 값 .
			//JOptionPane.showMessageDialog(null, tf.getText());  //텍스트 창에 입력한 값이 나오도록!!
			
			
		}else if(btnLabel.equals("start")) {
			
			this.dispose(); //화면 꺼지고 MainFrame이 나온다. 프레임 변경~!
			
			new MainFrame(buttonCount); //입력값 mainframe메소드 buttonCount에 넘겨준다. -> 
			
		}

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
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	

}
