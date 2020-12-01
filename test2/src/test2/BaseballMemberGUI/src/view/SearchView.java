package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

public class SearchView extends JFrame implements ActionListener {

	
	
	
	Container containerPane;
	
	JTextField textField;
	JTextArea textArea;
	
	JButton menuBtn, deleteBtn, searchBtn;
	
	
	
	public SearchView() {
		
		super("Search");
		
		JLabel label = new JLabel("선수 정보 검색");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(250, 30, 200, 30);
		label.setFont(new Font("돋움", Font.BOLD, 18));
		add(label);
		
		
		JPanel panel = new JPanel();
		panel.add(label);
		
		
		JLabel label1 = new JLabel("이름 :");
		label1.setFont(new Font("돋움", Font.BOLD, 18));
		add(label1);
		
		
		JTextField textField = new JTextField(20);
		add(textField);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		//textArea.setPreferredSize(new Dimension(400,300));
		textArea.setBounds(130, 100, 400, 200);
		add(textArea);
		
		
		
		//////////////////////////////////////////////////////검색 버튼 클릭
		JButton searchBtn = new JButton("검색");
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				SingletonCls si = SingletonCls.getInstance();
				Human human = null;
				
				
				textArea.setText("");
				
				String name = textField.getText();
				
				if(name.trim().equals("")) {
					
					JOptionPane.showMessageDialog(null, "모두 작성해주세요.");
					return;
				}
				
				
				List<Integer> indexList = UtilCls.searchAll(name, si.dao.getList());
				
				if(indexList.size() == 0) {
					
					JOptionPane.showMessageDialog(null, "입력하신 이름이 선수명단에 없습니다.");
					return;
					
				}
				
				for (int i = 0; i < indexList.size(); i++) {
					
					Human h = si.dao.getList().get(indexList.get(i));
					
					
					String msg = h.toString() + "\n";
					textArea.append(msg);
					
					
					boolean b = si.dao.search(msg);
					
					
					if(b == true) {
						
						JOptionPane.showMessageDialog(null, "성공적으로 검색되었습니다.");     
						
						//textArea.setText("");
						
					}
					
					
					
				}
				
				
				
				//search // 이름값 가져오기.
				
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
		
		/////////////////////////////////////////////////////삭제 버튼 클릭
		
		
		
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		panel1.add(textField);
		panel1.add(searchBtn);
		
	
		
		containerPane = getContentPane();
		containerPane.add(panel,BorderLayout.NORTH);
		containerPane.add(panel1,BorderLayout.CENTER);
		
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
