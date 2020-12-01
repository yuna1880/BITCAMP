package panel;

import java.awt.Color;import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dto.Human;
import dto.Pitcher;
import singleton.SingletonCls;
import view.InsertView;
import view.MenuView;

public class PitcherPanel extends JPanel {

	//Jpanel 빼놓기. // panel통해서 값 들어온다.
	
	
	InsertView insertV;
	
	JLabel label[] = new JLabel[6];
	JTextField textField[] = new JTextField[6]; //입력받을 값 6개.
	
	JButton menuBtn, insertBtn;
	
	public PitcherPanel(InsertView k) {
		
		setLayout(null);
		
		this.insertV = k;  // pitcherpanel(insert)를 호출할 수 있도록.
		
		String title[] = {"이름 :", "나이 :", "신장 :", "승 :", "패 :", "방어율 :"};
		
		for (int i = 0; i < title.length; i++) {
			label[i] = new JLabel();
			label[i].setText(title[i]); //title 배열의 텍스트 불러오기.
			label[i].setFont(new Font("돋움", Font.BOLD, 18));
			label[i].setBounds(80, 50 + 40 * i, 100, 30);
			add(label[i]);
			
			textField[i] = new JTextField();
			textField[i].setBounds(180, 50 + 40 * i, 200, 30);
			add(textField[i]);
		}
		
		
		menuBtn = new JButton("메뉴");
		menuBtn.setBounds(150, 320, 150, 50);
		menuBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				k.dispose(); //메뉴로 돌아가도록!
				new MenuView();
				
			}
		});
		add(menuBtn);
		
		
		insertBtn = new JButton("추가");
		insertBtn.setBounds(320, 320, 150, 50);
		insertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				SingletonCls si = SingletonCls.getInstance(); //싱글톤 얻어오기.
				Human human = null; //휴먼 일단 비워놓기.
				
				
				for (int i = 0; i < textField.length; i++) {
					if(textField[i].getText().trim().equals("")){ // 입력창이 비어있을때..
						
						JOptionPane.showMessageDialog(null, "모두 작성해 주십시오.");
						return;
					}
				}
				
				//입력했을때. 값 저장.
				
				String name = textField[0].getText();
				int age = Integer.parseInt(textField[1].getText());
				double height = Double.parseDouble(textField[2].getText());
				int win = Integer.parseInt(textField[3].getText());
				int lose = Integer.parseInt(textField[4].getText());
				double defence = Double.parseDouble(textField[5].getText()); // 입력창에서 받은 값 넘겨주기.
				
				
				
				human = new Pitcher(0, name, age, height, win, lose, defence);
							//number는 memberdao에서 넣어주니 0으로
						
				
				boolean b = si.dao.insert(human); //?
				
				
				if(b == true) {
					JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
					
					for (int i = 0; i < textField.length; i++) {
						
						textField[i].setText(""); //추가 후 텍스트필드 비워주기.
						
					}
					
				}else {
					
					JOptionPane.showMessageDialog(null, "추가되지 않았습니다.");
				}
				
				
				}
		});
		add(insertBtn);
		
		
		
		
		
		setBounds(0, 0, 640, 450);
		setBackground(Color.lightGray);
	}
	
	
}
