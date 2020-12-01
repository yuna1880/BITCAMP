package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dto.Human;
import singleton.SingletonCls;
import util.UtilCls;

public class UpdateView extends JFrame implements ActionListener {
	
	Container containerPane;
	
	JTextField textField;
	
	JButton menuBtn, updateBtn, searchBtn;
	
	
	
	public UpdateView() {
		
		super("Update");
		
		JLabel label = new JLabel("선수 정보 수정");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(250, 30, 200, 30);
		label.setFont(new Font("돋움", Font.BOLD, 18));
		add(label);
		
		JPanel panel = new JPanel();  //1도화지
		panel.add(label);
		
		
		
		JLabel label1 = new JLabel("이름 :");
		label1.setFont(new Font("돋움", Font.BOLD, 18));
		add(label1);
		
		
		JTextField textField = new JTextField(20);
		add(textField);
		
		JButton searchBtn = new JButton("검색");
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				SingletonCls si = SingletonCls.getInstance();
				Human human = null;
				
				String name = textField.getText();
				
				if(name.trim().equals("")) {
					
					JOptionPane.showMessageDialog(null, "이름을 정확히 작성해주세요.");
					return;
				}
				
				int index = UtilCls.search(name, si.dao.getList());
				
				if(index == -1) {
					
					JOptionPane.showMessageDialog(null, "입력하신 이름이 선수명단에 없습니다.");
					return;
					
					}
				}
			});
			add(searchBtn);
				
				
				menuBtn = new JButton("메뉴");
				menuBtn.setBounds(150, 360, 150, 50);
				menuBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						dispose(); //메뉴로 돌아가도록!
						new MenuView();
						
					}
				});
				add(menuBtn);
				
				
				/////////////////////////////////////////////수정버튼
			
			
		
				
				
				JPanel panel1 = new JPanel();
				panel1.add(label1);
				panel1.add(textField);
				panel1.add(searchBtn);
				
				containerPane = getContentPane();
				containerPane.add(panel,BorderLayout.NORTH);
				containerPane.add(panel1,BorderLayout.CENTER);
		
		
		
		
				
				setBounds(0, 0, 640, 480);
				//getContentPane().setBackground(Color.green);
				setVisible(true);
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
				}



			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

	
}
	
	
	
	


