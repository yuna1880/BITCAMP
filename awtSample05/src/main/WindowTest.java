package main;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JRadioButton;

//아이템리스너 -> 아이템 쓸때.
public class WindowTest extends Frame implements ActionListener, WindowListener, ItemListener  {

	
	Checkbox cb1, cb2, cb3, cb4, cb5;
	Label label1, label2; //무엇을 선택했는지 출력! 되는 부분
	
	Checkbox exitCheck; //종료하는 체크박스
	
	//JRadioButton radioBtn; //jframe에는 따로 있다..
	
	public WindowTest() {
		
		/*
		 
		  Radio Button / awt 에는 없고  swing에는 있다.
		    선택은 반드시 1개
		    
		  Check Box
		    다수의 선택이 가능하다.
		    
		 
		 */
		
		CheckboxGroup cbg1 = new CheckboxGroup(); //첫번째 그룹만들기
		cb1 = new Checkbox("사과", cbg1, true); // 사과 버튼이 선택되어있다.
		cb2 = new Checkbox("배", cbg1, false); // 버튼이 선택되어있지 않다.
		cb3 = new Checkbox("바나나", cbg1, false);
		
		
		CheckboxGroup cbg2 = new CheckboxGroup();
		
		cb4 = new Checkbox("빵강", cbg2, false);
		cb5 = new Checkbox("파랑", cbg2, true);
		
		exitCheck = new Checkbox("exit"); //종료
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		
		add(exitCheck);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		
		exitCheck.addItemListener(this); //아이템 리스너 추가 !! 한개씩!
		
		
		label1 = new Label("label1");
		label2 = new Label("label2");
		
		add(label1);
		add(label2);
		
		setLayout(new FlowLayout()); //옆으로만 쭉 나오는 레이아웃!
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		Object obj = e.getSource();
		
		//check Box
		if(obj == exitCheck) { 
			Checkbox cb = (Checkbox)obj;
			if(cb.getState() == true) { //exitCheck 체크 되었을때 종료!
				System.exit(0);
				
			}else { // exitCheck 체크 안되었을때.
				
				
			}
		}
		
		
		//Radio Button (좋아하는 과일)
		if(obj == cb1 || obj == cb2 || obj == cb3) {
			Checkbox cb = (Checkbox)obj;
			if(cb.getState() == true) {
				
				String name = cb.getLabel(); 
				label1.setText(name); //체크박스로 선택한 이름 label로 올려주기!
				
			}
			
		}
		
		if(obj == cb4 || obj == cb5 ) {
			Checkbox cb = (Checkbox)obj;
			if(cb.getState() == true) {
				
				String name = cb.getLabel(); 
				label2.setText(name); //체크박스로 선택한 이름 label로 올려주기!
				
			}
			
		}
		
		
		
		
	}
	
	
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}


	

}
