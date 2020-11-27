package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.JOptionPane;

public class mainClass {

	//메인클래스
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new box();
   }

}





class box extends Frame implements WindowListener{
   public int count;
   
   Label label;
   Button button1, button2;
   TextField tf = new TextField();
   
   
   
   public box() {
      setLayout(null);
         
//      label = new Label("label");
//      label.setBounds(100, 100, 300, 30);
//      label.setBackground(Color.gray);
//      add(label);
      
      tf = new TextField();
      tf.setBounds(100,100,200,30);
      add(tf);
      
      button1 = new Button();
      button1.setLabel("set");
      button1.setBounds(30,160,150,30);
      button1.addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {
            try{
               count = Integer.parseInt(tf.getText());
            }catch(NumberFormatException ee)
            {}
            catch(Exception ee)
            {}
         }
      });
      
      add(button1);
      button2 = new Button();
      button2.setLabel("start");
      button2.setBounds(220,160,150,30);
      button2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println(count);
            new box2(count);
         }
      });
      add(button2);
         
               
      setBounds(100,100, 400,250);
      setVisible(true);      
      addWindowListener(this);
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
      // TODO Auto-generated method stub
      
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
   
   public void setCount(int count) {
      this.count = count;
   }

   public Integer getCount() {
      return count;
   }
   
}




//두번째박스 ! 1-9, reset

class box2 extends Frame implements WindowListener{
   
	box b = new box();
   Button[] button = null; //버튼을 배열으로
   
   
   public box2(int c) {
     
	  System.out.println(c);
      button = new Button[c];
      
      System.out.println(button.length);
      
      int x[] = {50, 150, 250};
      int y = 50;
      
      
   
      setLayout(null);
      //c = b.getCount();
      
      int d = c/3;
      int e = c%3;
      
      int butnum = 0;
      for (int i = 0; i < d; i++) {
         for (int j = 0; j < 3; j++) {
            button[butnum] = new Button();
            button[butnum].setLabel((butnum+1) + "");
            button[butnum].setBounds(x[j],y,50,50);
            add(button[butnum]);
            
            butnum++;
         }
         y = y + 50;
      }
      for (int i = 0; i < e; i++) {
         button[butnum] = new Button();
         button[butnum].setLabel((butnum+1) + "");
         button[butnum].setBounds(x[i],y,50,50);
         add(button[butnum]);
         
         butnum++;
      }
      
      int x1 = (int) (Math.random()*c);
      
      button[x1].addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "당신이 범인 입니다.");
         }
      });
      add(button[x1]);
      
      setBounds(100,100, 800,680);
      setVisible(true);
      addWindowListener(this);
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
      // TODO Auto-generated method stub
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
}