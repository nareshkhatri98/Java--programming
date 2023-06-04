package implementationofStack;

import javax.swing.*;

public class Calculation {
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4 ,t5,t6;
    JButton b1;
    Calculation(){
        f=new JFrame("Naresh laude");
        l1=new JLabel("no 1");
        l1.setBounds(50 , 50 , 50, 50);

        t1=new JTextField();
        t1.setBounds(100 , 50 , 150, 50);

        l2=new JLabel("no 2");
        l2.setBounds(50 , 100 , 50, 50);

        t2=new JTextField();
        t2.setBounds(100 , 100 , 150, 50);

        l3=new JLabel("Addition");
        l3.setBounds(50 , 150 , 50, 50);

         t3=new JTextField();
        t3.setBounds(100 , 150 , 150, 50);

        l4=new JLabel("Subtraction");
        l4.setBounds(50,200,50,50);

        t4=new JTextField();
        t4.setBounds(100,200,150,50);

         t5=new JTextField();
         t5.setBounds(100,250,300,50);

         l5=new JLabel("Multiply");
         l5.setBounds(100,3000,200,50);

         t6=new JTextField();
         t6.setBounds(150,300,300,50);

         l6=new JLabel("Divide");
         l6.setBounds(100,300,50,50);
    b1=new JButton("Calculate");
    b1.setBounds(100, 300 , 80, 50);





        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(b1);


        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    public static void main(String args[]){
        Calculation  myobj=new  Calculation();
    }
}
