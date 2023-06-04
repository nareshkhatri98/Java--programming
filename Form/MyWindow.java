package com.Form;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    private JLabel heading;
   private  Font font=new Font("",Font.BOLD,30);
   private JPanel mainPanel;
   private JLabel nameLabel,passwordLabel;
   private JTextField nameTextField,passwordTextField;
   private JButton Button1,Button2;
    MyWindow(){
        super.setTitle("My first form");
        super.setSize(500,500);
        super.setLocation(100,100);
        super.setVisible(true);
        this.CreateGui();
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void CreateGui(){
        //create our gui..
        this.setLayout(new BorderLayout());
        heading=new JLabel("my first form...");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading, BorderLayout.NORTH);
     // work in gui..
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));
        nameLabel=new JLabel("Enter your name");
        nameLabel.setFont(font);
        passwordLabel=new JLabel("Enter your password");
        passwordLabel.setFont(font);

        nameTextField=new JTextField();
        nameTextField.setFont(font);

        passwordTextField=new JTextField("");
        passwordTextField.setFont(font);

        Button1=new JButton("submit");
        Button1.setFont(font);

        Button2=new JButton("Reset");
        Button2.setFont(font);

        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);

        mainPanel.add(passwordLabel);
        mainPanel.add(passwordTextField);

        mainPanel.add(Button1);
        mainPanel.add(Button2);

        this.add(mainPanel,BorderLayout.CENTER);
    }

}
