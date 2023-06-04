package LabreportQuestion;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        int num=sc.nextInt();
        Show(num);
    }
    public static void Show(int num){
        int count=0;
                int i;
        for(i=1;i<=num;i++){
            if(num%i==0) {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime="+num);
        }
        else if(count==1){
            System.out.println("nor prime or composite="+num);
        }
        else{
            System.out.println("composite="+num);
        }

    }
}

