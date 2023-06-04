package Threads;

public class Example2 implements Runnable{
    public void run(){
        System.out.println("this is example of extending thread by Runnable interface.....");
    }

    public static void main(String[] args) {
        Example2 e=new Example2();
        Thread t=new Thread(e);
        t.start();
    }
}
