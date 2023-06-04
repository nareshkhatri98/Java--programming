package LabreportQuestion;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        String name;
        String address;
        int roll;
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("enter marks of five subject");
        float sub1=sc.nextFloat();
        float sub2=sc.nextFloat();
        float sub3=sc.nextFloat();
        float sub4=sc.nextFloat();
        float sub5=sc.nextFloat();

        System.out.println("enter name:");
        name=scan.nextLine();
        System.out.println("enter roll:");
        roll=sc.nextInt();
        System.out.println("enter address:");
        address=scan.nextLine();

        float total=sub1+sub2+sub3+sub4+sub5;
        float percentage=(float)(total/500)*100;
         
        if(percentage>=80 && percentage<=100){
            System.out.println("Distinction");
        }
        else if(percentage>=70 && percentage<=80){
            System.out.println("First Division");
        }
        else if(percentage>=60 && percentage<=70){
            System.out.println("Second division");
        }
        else if(percentage>=50 && percentage<=60){
            System.out.println("Third division");
        }
        else if (percentage>=40 && percentage<=50){
            System.out.println("just pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println(name);
        System.out.println(roll);
        System.out.println(address);
        System.out.println(total);
        System.out.println(percentage);
    }
}
