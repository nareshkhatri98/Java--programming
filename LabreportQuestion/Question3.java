package LabreportQuestion;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        if(num%3==0 && num%7==0)
        {
            System.out.println("divisible by 3 and 7 ");
        }
        else if(num%7==0)
        {
            System.out.println("divisible by 7");
        }
        else if(num%3==0){
            System.out.println("divisible by 3");
        }
        else{
            System.out.println("not divisible by 7 or 3");
        }
    }
}
