package implementationofStack;
import javax.swing.*;
import java.awt.*;


public class Test {
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;

    Test(){
        f=new JFrame("Naresh laude");
        l1=new JLabel("ID");
        l1.setBounds(50 , 50 , 50, 50);

        t1=new JTextField();
        t1.setBounds(100 , 50 , 100, 50);

        l2=new JLabel("Name");
        l2.setBounds(50 , 100 , 50, 50);

        t2=new JTextField();
        t2.setBounds(100 , 100 , 100, 50);

        l3=new JLabel("Email");
        l3.setBounds(50 , 150 , 50, 50);

        t3=new JTextField();
        t3.setBounds(100 , 150 , 100, 50);

        l4=new JLabel("age");
        l4.setBounds(50 , 200 , 50, 50);

        t4=new JTextField();
        t4.setBounds(100, 200 , 100, 50);

        l5=new JLabel("Phone");
        l5.setBounds(50 , 250 , 50, 50);

        t5=new JTextField();
        t5.setBounds(100 , 250 , 100, 50);

        b1=new JButton("Insert");
        b1.setBounds(75, 300 , 50, 50);

        b2=new JButton("Delete");
        b2.setBounds(100 , 300 , 50, 50);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(b1);
        f.add(b2);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Test myboj=new Test();
    }
}
