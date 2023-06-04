package Threads;

public class Example1 extends Thread{
      public void run(){
          System.out.println("this is example of extending java Thread by thread class...");
          int a=12;
          int b=13;
          int c=a+b;
          System.out.println(c);
      }
    public static void main(String[] args) {
          Example1 e=new Example1();
          e.start();

    }
}
