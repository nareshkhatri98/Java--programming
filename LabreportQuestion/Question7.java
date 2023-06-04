package LabreportQuestion;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        int num;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
       num=  sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println( num*i);
        }

    }
}



