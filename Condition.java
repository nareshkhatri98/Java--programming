import java.util.*;

public class Condition {
    public static void main(String[]args)
    {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age:");
    int x=sc.nextInt();

    if(x>18)
    {
        System.out.println("Your are eligible for drive");
    }

    else
    {
        System.out.println("you are not eligible for driver");
    }
    }
    
}
