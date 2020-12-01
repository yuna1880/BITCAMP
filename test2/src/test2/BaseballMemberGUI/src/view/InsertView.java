package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import panel.BatterPanel;
import panel.PitcherPanel;

public class InsertView extends JFrame implements ActionListener {
	
	Container containerPane;
	
	JRadioButton radio1, radio2;
	
	ButtonGroup group;
	
	
	
	public InsertView() {
		
		super("Insert");
		
		JLabel label = new JLabel("insert");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(250, 30, 200, 30);
		add(label);
		
		
		radio1 = new JRadioButton("투수");
		radio1.setSelected(true); //하나 선택되게해놓기.
		radio1.addActionListener(this);
		
		
		radio2 = new JRadioButton("타자");
		radio2.setSelected(false);
		radio2.addActionListener(this);
		
		group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		
		
		JPanel panel = new JPanel(); // radio, label 넣어줄 라벨!
		panel.setBackground(Color.green);
		panel.add(label);
		panel.add(radio1);
		panel.add(radio2);
		
		
		PitcherPanel pp = new PitcherPanel(this);  //현재 자신이 가지고있는 주소값 넘겨받음 this
		BatterPanel bb = new BatterPanel(this);
		
		containerPane = getContentPane();
		containerPane.add(panel,BorderLayout.NORTH); //투수or타자 선택 위치
		containerPane.add(pp, BorderLayout.CENTER);
		
		
		setBounds(0, 0, 640, 480);
		//setBackground(Color.green); //백그라운드 컬러 적용 검색해보기!
		getContentPane().setBackground(Color.green);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		containerPane = getContentPane();
		containerPane.remove(1); //첫번째 부분 지워라! (투수, 타자)
		
		
		if(radio1.isSelected()) { // 투수 클릭했을때.
			containerPane.add(new PitcherPanel(this), BorderLayout.CENTER);
			
		}else { // 타자
			
			containerPane.add(new BatterPanel(this), BorderLayout.CENTER);
		}
		
		revalidate(); //라디오버튼 선택할때마다 창이 바뀐다.
		
	}
	
	
	
	

}
