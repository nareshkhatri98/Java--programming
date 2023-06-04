package LabreportQuestion;
import javax.swing.*;
import java.awt.*;
public class Login {
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2;
    JPasswordField p;
    JButton Submit;
    Login(){
        f=new JFrame("login form");
        l1=new JLabel("username");
        l1.setBounds(10,10,90,30);
        f.add(l1);
        t1=new JTextField("");
        t1.setBounds(80,10,200,30);
        f.add(t1);
         l2=new JLabel("Password");
         l2.setBounds(10,50,90,30);
        f.add(l2);
        p=new JPasswordField();
        p.setBounds(80,50,200,30);
        f.add(p);
        Submit=new JButton("Submit");
        Submit.setBounds(115,100,90,30);
        f.add(Submit);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(320,190);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Login();
    }
}
