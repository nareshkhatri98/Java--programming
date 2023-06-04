package implementationofStack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1;

    Addition(){
        f=new JFrame("Naresh ");
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

/*    l5=new JLabel("Multiply");
        l5.setBounds(50,250,150,50);
        t5=new JTextField();
        t5.setBounds(100,250,150,50);

        l6=new JLabel("Divide");
        l6.setBounds(50,300,150,50);
        t6=new JTextField();
    t6.setBounds(100,300,150,50);
    */
        b1=new JButton("calculate");
        b1.setBounds(100, 350, 150, 50);


        b1.addActionListener(new ActionListener()



        {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int sum=a+b;
                int diff=a-b;
                String result=String.valueOf(sum);
                String calc=String.valueOf(diff);
                t3.setText(result);
                t4.setText(calc);
            }

        }
        );
      /*  b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int sub=a-b;
                String result=String.valueOf(sub);
                t4.setText(result);
            }
        });
      b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int mul=a*b;
               String result=String.valueOf(mul);
                t5.setText(result);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(t1.getText());
                double b=Double.parseDouble(t2.getText());
                double div=a/b;
                String result=String.valueOf(div);
                t6.setText(result);
            }
        });


*/

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
      //  f.add(l5);
        //f.add(l6);

        f.add(t1);
        f.add(t2);
        f.add(t3);
       f.add(t4);
       //f.add(t5);
       // f.add(t6);
        f.add(b1);


        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Addition myobj=new Addition();
    }
}