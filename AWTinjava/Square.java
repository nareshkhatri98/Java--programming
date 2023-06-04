package AWTinjava;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square extends JFrame{
    JFrame j;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    Square() {


        l1 = new JLabel("Enter number");
        l1.setBounds(100, 100, 100, 100);
        add(l1);
        t1=new JTextField("");
        t1.setBounds(100,50,150,50);
        add(t1);
        l2=new JLabel("square of number");
        l2.setBounds(50,100,50,50);
        add(l2);
        t2=new JTextField("");
        t2.setBounds(100,50,100,50);
        add(t2);
        b1=new JButton("Calculate");
        b1.setBounds(100,200,50,50);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                 int square=a*a;
                 String result=String.valueOf(square);
                 t2.setText(result);
            }
        });
       setSize(1000,100);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Square s=new Square();
    }
}
