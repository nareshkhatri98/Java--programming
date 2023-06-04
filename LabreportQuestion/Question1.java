package LabreportQuestion;
import java.util.Scanner;
public class Question1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        dispaly(num);
    }
    public  static void dispaly(int num){
        if(num%2==0)
        {
            System.out.println("even="+num);
        }
        else
        {
            System.out.println("odd="+num);
        }
    }
}
