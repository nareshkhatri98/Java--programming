
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Example1 extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2,b3;

    Example1()
    {
        l1 = new JLabel("ID");
        l1.setBounds(15,20,70,20);;
        add(l1);
        t1 = new JTextField();
        t1.setBounds(100,20,150,20);
        add(t1);

        l2 = new JLabel("Username");
        l2.setBounds(15,50,70,20);;
        add(l2);
        t2 = new JTextField();
        t2.setBounds(100,50,150,20);
        add(t2);

        l3 = new JLabel("Password");
        l3.setBounds(15,80,70,20);;
        add(l3);
        p1 = new JPasswordField();
        p1.setBounds(100,80,150,20);
        add(p1);

        b1 = new JButton("Insert");
        b1.setBounds(60,115,70,20);
        add(b1);
        b2 = new JButton("Delete");
        b2.setBounds(150,115,70,20);
        add(b2);

        b3=new JButton("display");
        b3.setBounds(150,140,90,20);
        add(b3);

        setSize(280,200);


        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(t1.getText());
                String username = t2.getText();
                String password = p1.getText();

                try{

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcafile","root","");

                    Statement stmt = conn.createStatement();
                    String sql = "insert into studentinfo values('"+id+"','"+username+"','"+password+"')";
                    stmt.execute(sql);
                    JOptionPane.showMessageDialog(b1,"inserted Successfully");
                    conn.close();
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(t1.getText());
                String username = t2.getText();
                String password = p1.getText();

                try{

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcafile","root","");

                    Statement stmt = conn.createStatement();
                    String sql = "delete from studentinfo where id="+id+"";
                    stmt.execute(sql);
                    JOptionPane.showMessageDialog(b1,"deleted Successfully");
                    conn.close();
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcafile","root","");
                    Statement stmt = conn.createStatement();

                    ResultSet rs = stmt.executeQuery("Select * From studentinfo;");
                    while(rs.next()){
                        int id = rs.getInt("id");
                        String uname = rs.getString("username");
                        String password = rs.getString("password");
                        System.out.println(id + "\t" + uname + "\t" + password);
                    }

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }


    public static void main(String[] args) {

        new Example1();
    }

}
