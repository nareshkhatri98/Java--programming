package Main;
class Demo{
    void show(){
        System.out.println("hello");
    }
}
public class Methodoverrid extends Demo {
    void show(){
        System.out.println("hii");
    }

    public static void main(String[] args) {
        Methodoverrid M=new Methodoverrid();
        M.show();
        Demo d1=new Demo();
        Demo obj;
        obj=d1;
        obj.show();
    }
}
