package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dto.Batter;
import dto.Human;
import singleton.SingletonCls;
import view.InsertView;
import view.MenuView;

public class BatterPanel extends JPanel {
	
	InsertView insertV;
	
	JLabel label[] = new JLabel[6];
	JTextField textField[] = new JTextField[6];
	
	JButton menuBtn, insertBtn;
	
	
	public BatterPanel(InsertView k) {
		
		setLayout(null);
		
		this.insertV = k;
		
		String title[] = {"이름 :", "나이 :", "신장 :", "타수 :", "안타수 :", "타율 :"};
		
		for (int i = 0; i < title.length; i++) {
			label[i] = new JLabel();
			label[i].setText(title[i]);
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
				
				k.dispose(); // k-> insertview 를 가르킴. insertview 꺼준다.
				new MenuView();
				
			}
		});
		add(menuBtn);
		
		insertBtn = new JButton("추가");
		insertBtn.setBounds(320, 320, 150, 50);
		insertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				SingletonCls si = SingletonCls.getInstance();
				Human human = null;
				
				for (int i = 0; i < textField.length; i++) {
					
					if(textField[i].getText().trim().equals("")) {
						
						JOptionPane.showMessageDialog(null, "모두 작성해 주십시오.");
						return;
					}
				}
				
				
				String name = textField[0].getText();
				int age = Integer.parseInt(textField[1].getText());
				double height = Double.parseDouble(textField[2].getText());
				int batcount = Integer.parseInt(textField[3].getText());
				int hit = Integer.parseInt(textField[4].getText());
				double hitAvg = Double.parseDouble(textField[5].getText());
				
				human = new Batter(0, name, age, height, batcount, hit, hitAvg);
				
				
				boolean b = si.dao.insert(human); // dao - insert 메소드에 넣어줘서  넘버 저장 후 리스트 저장해준다.
				
				if(b == true) {
					
					JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
					
					for (int j = 0; j < textField.length; j++) {
						textField[j].setText("");
					}
					
				}else {
					
					JOptionPane.showMessageDialog(null, "추가되지 않았습니다.");
				}
			
			}
		});
		add(insertBtn);
		
		
		setBounds(0, 0, 640, 450);
		setBackground(Color.green);
		
	}

	
}
