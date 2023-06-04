package Selfstudy;

public class ExampleOfParameterized {
      ExampleOfParameterized(int a ,int b)
      {
          int sum=a+b;
          System.out.println("sum="+sum);
      }

    public static void main(String[] args) {
        ExampleOfParameterized P1=new ExampleOfParameterized(1 , 2);

    }
}
