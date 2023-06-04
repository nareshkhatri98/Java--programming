package Selfstudy;

public class ExampleOfOverloading {
    ExampleOfOverloading(){
        System.out.println("this is default .........");
    }
    ExampleOfOverloading(int a, int b ){
        int sum=a+b;
        System.out.println("sum="+sum);
    }
    ExampleOfOverloading(int a,int b, int c){
        int mul=a*b*c;
        System.out.println("mul="+mul);
    }
    public static void main(String[] args) {
        ExampleOfOverloading E1=new ExampleOfOverloading();
        ExampleOfOverloading E2=new ExampleOfOverloading(1,2);
        ExampleOfOverloading E3=new ExampleOfOverloading(1,2,3);
    }
}
