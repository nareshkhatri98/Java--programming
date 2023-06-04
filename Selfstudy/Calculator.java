package Selfstudy;
 import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
public class Calculator {
    JFrame f;
    JLabel l;
    JTextField T;
    JButton b1,n,n1,n2,n3,n4,n5,n6,n7,n8,n9,add,sub,mul,div,clr,equal;
    Calculator()
    {
        f=new JFrame("My calculator");
        l=new JLabel("MY calculator");
        l.setBounds(100,50,50,50);
        f.add(l);

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        Calculator obj=new Calculator();
    }
}
