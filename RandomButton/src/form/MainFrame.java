package form;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//jframe 윈도우리스너 필요없음.
public class MainFrame extends JFrame implements ActionListener {

	JButton button[] = null; //버튼 개수 많으니 배열로 잡음.
	
	
	int randomNum; //랜덤넘버 받는 것
	
	//ArrayList<Button>list = new ArrayList<button>(); 이것도 가능.
	
	
	public MainFrame(int count) { // 텍스트창에 입력한 값 넘겨받기.
		
		super("main");
		
		setLayout(null);
		
		// JOptionPane.showMessageDialog(null, count + ""); //확인용!
		
		randomNum = (int)(Math.random() * count) + 1;
		
		JOptionPane.showMessageDialog(null, "randomNum" + randomNum );  //랜덤넘버 확인용
		
		
	
		//버튼만들기!
		
		button = new JButton[count]; // 선언.
		
		int x = 0;   //가로
		int y = 0;	//세로
		for (int i = 0; i < button.length; i++) { //버튼의 개수만큼 돌리기
			
			button[i] = new JButton((i + 1) + "");
			button[i].setBounds(160 + (x * 90), 150 + (y * 90), 80, 80); //012? //버튼 3개씩 배치
			button[i].addActionListener(this);
			add(button[i]);
			
			if( i % 3 == 2) y++; //다음칸으로 넘어간다. // 2일때 세로 다음칸으로 넘어간다.
			
			if(x == 2) x = 0; // 2일때 가로 다시 처음 위치로.
			else x++;
			
		}
		
		
		
		setBounds(200, 100, 580, 480);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		String btnNum = btn.getLabel();
		
		
		for (int i = 0; i < button.length; i++) {
			if(btnNum.equals((i + 1) + "")){ //어떤 버튼이 클릭되었을때? 넘버 확인.
				
			//JOptionPane.showMessageDialog(null, (i + 1) + "버튼 클릭");	 //버튼 클릭 확인용.
			
			if(randomNum == (i + 1)) {
				JOptionPane.showMessageDialog(null,"당신이 걸렸습니다");
				button[i].setEnabled(false);
				
				this.dispose(); //버튼 창 꺼주고
				
				new ButtonConfig(); // 버튼입력창 다시 켜주기. (다시 시도할 수 있도록!)
				
				
			}else {
				// 버튼 비활성화
				button[i].setEnabled(false); //못눌러지게
				
				// 버튼 비시각화
				//button[i].setVisible(false); // 안보이도록
			}
			
			}
		}
		
		
		

	}

}
