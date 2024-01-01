package Databsseconnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Student {

    // drive load..
    public void CreateDatabse()
    {
        try
    {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String Dbname = "Example";
        String username = "root";
        String password = "";


        Connection conn = DriverManager.getConnection(url+Dbname, username, password);
        Statement stm = conn.createStatement();
        System.out.println("connection successfully..");
        String query = "create database Example";
        stm.execute(query);
        System.out.println("data base created.");
        conn.close();

    }catch(Exception e) {

            e.printStackTrace();
        }
    }

    public static void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String dbname = "Example";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url+dbname, username, password);
            Statement stm = conn.createStatement();

            String query = "CREATE TABLE Student (sid INT(30), name VARCHAR(200), age INT(20), phone VARCHAR(20))";
            stm.execute(query);

            System.out.println("Table created successfully...");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void InsertData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String dbname = "Example";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url + dbname, username, password);


            System.out.println("Data inserted successfully...");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  void DisplayData()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String dbname = "Example";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url + dbname, username, password);
            Statement stm = conn.createStatement();

            String query = "SELECT *from Student";
             ResultSet res =stm.executeQuery(query);
             while(res.next())
             {
                 System.out.println("id :" +res.getInt(1));
                 System.out.println("Name :" +res.getString(2));
                 System.out.println("Age : " +res.getInt(3));
                 System.out.println("Phone :" +res.getString(4));
             }

            System.out.println(" Data read successfully...");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UpdateData()
            {
                try {
                    String url = "jdbc:mysql://localhost:3306/";
                    String dbname = "Example";
                    String username = "root";
                    String password = "";

                    Connection conn = DriverManager.getConnection(url + dbname, username, password);
                    Statement stm = conn.createStatement();

                    String query = "UPDATE Student  set name = 'Hari Khatri' where sid =1";
                    stm.execute(query);

                    System.out.println(" Data update successfully...");

                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            public static  void DeleteData()
            {


                    try {
                        String url = "jdbc:mysql://localhost:3306/";
                        String dbname = "Example";
                        String username = "root";
                        String password = "";

                        Connection conn = DriverManager.getConnection(url + dbname, username, password);
                        Statement stm = conn.createStatement();
                       String query ="DELETE from Student where sid =2";
                        stm.execute(query);

                        System.out.println(" Data Delete successfully...");

                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }


    public  static void InputDataFromUser()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String dbname = "Example";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url+dbname, username, password);
            Statement stm = conn.createStatement();

            String query = "INSERT into Student (name,age,phone) VALUES(?,?,?)";

            PreparedStatement pstms = conn.prepareStatement(query);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name::");
            String Name = br.readLine();
            System.out.println("Enter your age::");
            int Age = Integer.parseInt(br.readLine());
            System.out.println("Enter  Your Phone:::");
            String Phone = br.readLine();


         pstms.setString(1,Name);
         pstms.setInt(2,Age);
         pstms.setString(3,Phone);
         pstms.execute();

            System.out.println("Data Inserted...");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






