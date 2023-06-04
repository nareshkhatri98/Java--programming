package Selfstudy;
  class A{
      static int a=10;// static variable
      public void Display()
      {
          int b=10;// local variable
          System.out.println(a+" "+b);
          ++a;
          ++b;
      }
  }
public class Comparevariable {
      public static void main(String args[]) {
          A a = new A();
          a.Display();
          a.Display();

      }
  }
