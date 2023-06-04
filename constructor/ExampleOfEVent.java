package constructor;
import javax.swing.*;
public class ExampleOfEVent {
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField T1,T2,T3,T4,T5;
    JButton b1,b2;
    ExampleOfEVent()
    {
        f=new JFrame("Form");
        l1=new JLabel("ID");
        l1.setBounds(50 ,10 ,50,50);
        T1=new JTextField();
        T1.setBounds(100,50,150,50);

        l2=new JLabel("Name");
        l2.setBounds(50 , 100 , 150, 50);

        T2=new JTextField();
        T2.setBounds(100 , 100 , 150, 50);

        l3=new JLabel("Email");
        l3.setBounds(50 , 150 , 50, 50);

        T3=new JTextField();
        T3.setBounds(100 , 200 , 150, 50);

        l4=new JLabel("age");
        l4.setBounds(50 , 200 , 50, 50);

        T4=new JTextField();
        T4.setBounds(100, 200 , 100, 50);

        l5=new JLabel("Phone");
        l5.setBounds(100 , 250 , 100, 50);

        T5=new JTextField();
        T5.setBounds(100 , 250 , 150, 50);

        b1=new JButton("Insert");
        b1.setBounds(100, 300 , 50, 50);

        b2=new JButton("Delete");
        b2.setBounds(150 , 350 , 50, 50);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(T1);
        f.add(T2);
        f.add(T3);
        f.add(T4);
        f.add(T5);
        f.add(b1);
        f.add(b2);




        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String args[])
    {
        ExampleOfEVent E=new ExampleOfEVent();
    }
}
