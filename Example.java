package Labreport;

import java.util.Scanner;

//12
class Addition{
        int a,b;

        public int getA() {
            return a;
        }
        public int getB()
        {
            return b;
        }
        public void setA(int a)
        {
            this.a=a;
        }
        public void setB(int b)
        {
            this.b=b;
        }
    }
    public class Example {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
           Addition c=new Addition();
            System.out.println("enter a:");
            c.setA(scan.nextInt());
            System.out.println("enter b");
            c.setB(scan.nextInt());
            int add= c.getA()+ c.getB();
            int sub=c.getA()-c.getB();
            System.out.println("addition="+add);

            System.out.println("subtraction="+sub);
        }

}
