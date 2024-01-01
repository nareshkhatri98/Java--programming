import java.util.*;
public class Areaofrectangle { // this is header file.
    public static void main(String[]args)
    {
     // we take input from the user.
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of rectangle:");
     float l=sc.nextFloat();
     System.out.println("enter the breadth of rectngle:");
     float b=sc.nextFloat();
     //calculate the area

     float Area=l*b;
    //Display the output

     System.out.println(Area);
    }

}
