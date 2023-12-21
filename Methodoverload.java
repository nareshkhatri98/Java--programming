package Labreport;
class Adder{//9
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
}
public class Methodoverload {
    public static void main(String args[]) {

    Adder Ad = new Adder();
        System.out.println(Ad.add(12,13));
        System.out.println(Ad.add(1,2,3));
}
}
