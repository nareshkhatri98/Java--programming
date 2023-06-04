package Interf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;

    public Login() {
        l1 = new JLabel("RollNo:");
        l1.setBounds(15, 20, 70, 20);

        t1 = new JTextField();
        t1.setBounds(100, 20, 150, 20);

        l2 = new JLabel("Name:");
        l2.setBounds(15, 50, 70, 20);

        t2 = new JTextField("");
        t2.setBounds(100, 50, 150, 20);

        l3 = new JLabel("Email:");
        l3.setBounds(15, 80, 70, 20);

        t3 = new JTextField("");
        t3.setBounds(100, 80, 150, 20);

        l4 = new JLabel("Age:");
        l4.setBounds(15, 110, 150, 20);

        t4 = new JTextField("");
        t4.setBounds(100, 110, 150, 20);

        l5 = new JLabel("Phone:");
        l5.setBounds(15, 140, 150, 20);

        t5 = new JTextField("");
        t5.setBounds(100, 140, 150, 20);

        b1 = new JButton("Insert");
        b1.setBounds(100, 160, 90, 20);

        b2 = new JButton("Delete");
        b2.setBounds(100, 180, 90, 20);

        b3 = new JButton("Display");
        b3.setBounds(100, 200, 90, 20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b1);
        add(b2);
        add(b3);
        setSize(280, 190);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int RollNo=Integer.parseInt(t1.getText());
               int Age=Integer.parseInt(t4.getText());
               int phone=Integer.parseInt(t5.getText());
               String name=t2.getText();
               String email=t3.getText();

               try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
                   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcafile","root","");
                   Statement stmt = conn.createStatement();
                   String sql = "INSERT INTO std_info VALUES ("+RollNo+",'"+name+"','"+email+"',"+Age+","+phone+");";
                   stmt.executeUpdate(sql);
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
               int RollNo=Integer.parseInt(t1.getText());
               int Age=Integer.parseInt(t4.getText());
               int phone=Integer.parseInt(t5.getText());
               String name=t2.getText();
               String email=t3.getText();

               try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
                   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bcafile","root","");
                   Statement stmt=conn.createStatement();
                   String sql="delete from std_info where Rollno="+RollNo+"";
                   JOptionPane.showMessageDialog(b2,"delete successfully");
                   conn.close();
               }
               catch(Exception ex){
                   ex.printStackTrace();
               }
           }
       });
       b3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
                   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bcafile","root","");
                   Statement stmt= conn.createStatement();

                   ResultSet Rs=stmt.executeQuery("Select *From std_info");
                   while(Rs.next()){
                       int Rollno=Rs.getInt("Rollno");
                       int Age=Rs.getInt("Age");
                       int phone=Rs.getInt("phone");
                       String name=Rs.getString("name");
                       String email=Rs.getString("email");

                       System.out.println(Rollno +"\t" +name+ "\t" +email+ "\t" +Age+ "\t" +phone);
                   }
               }
               catch(Exception xy)
               {
                   xy.printStackTrace();
               }
           }
       });

    }
    public  static void main(String []args)
    {
        new Login();
    }
}
