/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui1;

/**
 *
 * @author jawaher
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui1 extends JFrame implements ActionListener{
    JLabel j1,j2,l3;
     JTextField num1,num2,num3;
    JButton sum,sub;
    public Gui1(){
      
      setTitle("test");
      setSize(300,300);
      setVisible(true);
      setLocation(150,250);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Container c =getContentPane() ;
      c.setLayout(new GridLayout (3, 2) );
      j1=new JLabel("enter first number");
      j2=new JLabel("enter second number");
       l3=new JLabel("");
       num1=new JTextField(10);
        num2=new JTextField(10);
        num3=new JTextField(10);
        sum=new  JButton("result");
        sub=new  JButton("result2");
        sum.addActionListener(this);
         sub.addActionListener(this);
        num2.addActionListener(this);
        c.add(j1);
        c.add(num1);
        c.add(j2);
        c.add(num2);
        c.add(sum);
        c.add(sub);
        c.add(num3);
        c.add(l3);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  String n1,n2;
       n1=JOptionPane.showInputDialog("enter first number");
        n2=JOptionPane.showInputDialog("enter secound number");
        int n11,n22,sum=0;
        n11=Integer.parseInt(n1);
         n22=Integer.parseInt(n2);
         sum=n11+n22;
         JOptionPane.showMessageDialog(null,"the sum is:"+sum);*/
   Gui1  j=new Gui1();
   
     JOptionPane.showMessageDialog(j, "THSIS IS PROGRAM TO SUM TO NUMBER","jjojo",JOptionPane.INFORMATION_MESSAGE);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1,n2 ,n3 = 0;
        n1=Integer.parseInt (num1.getText () ) ;
n2=Integer.parseInt (num2.getText() ) ;
//n3=n1+n2;
if(e.getSource()instanceof JButton)
    if(e.getSource()==sum)
        n3=n1+n2;
   
else
        n3=n1+n2;
if(e.getSource()==sub)
         n3=n1-n2;
else
     n3=n1-n2;
   // JOptionPane.showMessageDialog(null, "sorry try again");
        num3.setText(""+n3);

    }
    
    
}
