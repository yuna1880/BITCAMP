package view;

import java.awt.Color;import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame implements ActionListener {

	JButton button[] = null;
	
	
	public MenuView() {
		
		super("menu");
		
		setLayout(null);
		
		JLabel label = new JLabel("Menu");
		label.setHorizontalAlignment(JLabel.CENTER);  // 가운데 정렬!!
		label.setFont(new Font("돋움", Font.BOLD, 48));
		label.setBounds(210, 40, 200, 50);
		add(label);
		
		//타이틀 배열로 저장해두기.???
		String btnTitle[] = { "insert", "delete", "search", "update", "save" };
		button = new JButton[btnTitle.length]; //버튼의 개수
		
		for (int i = 0; i < btnTitle.length; i++) {
			button[i] = new JButton(btnTitle[i]);
			button[i].setBounds(180, 120 + 60 * i, 260, 50);
			button[i].addActionListener(this);
			add(button[i]);
		}
		
		
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object btn = e.getSource();
		
		if(btn == button[0]) {      //선수 추가
			
			new InsertView();
			this.dispose();
			
			
		} else if(btn == button[1]) {   // 선수 삭제
			
			new DeleteView();
			this.dispose();
			
		} else if(btn == button[2]) {  // 선수 검색
			
			new SearchView();
			this.dispose();
			
		}else if(btn == button[3]) {  // 선수 수정
			
			new UpdateView();
			this.dispose();
			
		}

	}

}
