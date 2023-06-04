package Selfstudy;

public class Variable {
    static  int a=12;// static variable
    int b=12;// instance variable
    public static void main(String args[]){
        int c=12;// local variable.
        Variable v=new Variable();
        int d=a+c+v.b;
        System.out.println(d);
    }
}
