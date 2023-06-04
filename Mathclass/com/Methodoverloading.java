package Mathclass.com;
class Adder{
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void add(int x ,int y, int z){
        int X=x+y+z;
        System.out.println(x);
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        Adder Ad=new Adder();
        Ad.add(12,13);
        Ad.add(1,2,3);
    }
}
