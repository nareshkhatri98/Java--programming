package Selfstudy;
abstract class Information{
     int a=12;
     int b=13;
    void Display()
    {
        System.out.println("This is abstract class");
    }

    }

class Show extends Information{

    public void add(){
        int sum=a+b;
        System.out.println(sum);

    }
}
public class ExampleOfAbstractClass {
    public static void main(String[] args){
       // Information I=new Show();
        Show s=new Show();
        s.add();
        s.Display();
    }
}
