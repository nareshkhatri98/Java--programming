package Interface;
import java.util.Scanner;
interface Client {
    void input();

    void output();
}
class Naresh implements Client{
    String name;
    double Salary;
    int roll;

public void input()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the user name:");
    name=sc.nextLine();
    System.out.println("enter salary");
    Salary=sc.nextDouble();
    System.out.println("enter roll:");
    roll=sc.nextInt();

}
public void output()
{
    System.out.println("details are.......................");
    System.out.println(name);
    System.out.println(Salary);
    System.out.println(roll);
}
}
public interface InterfaceDEmo {
    public static void main(String args[]){
Client c=new Naresh();
c.input();
c.output();
    }
}
