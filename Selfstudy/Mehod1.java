package Selfstudy;

public class Mehod1 {
    int num1,num2;
    public void add(int num1,int num2){
        int c=num1+num2;
        System.out.println(c);
    }
    public void diff(int num1, int num2){
        int d=num1-num2;
        System.out.println(d);
    }
    public static void main(String args[]){
        Mehod1 m1=new Mehod1();
        m1.add(12 ,13);
        m1.diff(12,11);

    }
}
