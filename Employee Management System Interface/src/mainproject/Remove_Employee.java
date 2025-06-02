package mainproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Remove_Employee implements ActionListener{
    JFrame f;
    JTextField t,t1,t2,t3,t4;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2,b3;

    Remove_Employee(){
        f=new JFrame("View");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        l1.setIcon(img);


        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.BLACK);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        l1.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l1.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            JOptionPane.showMessageDialog(null,"Already Not in Database");
            f.setVisible(false);
            details d=new details();
        }
    }
    
    public static void main(String[]ar){
        new Remove_Employee();
    }
}