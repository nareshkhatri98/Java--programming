package Labreport;
import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        num=scan.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        if( num%2==0)
        {
            System.out.println("even="+num);
        }
        else{
            System.out.println("odd="+num);
        }
    }
}
