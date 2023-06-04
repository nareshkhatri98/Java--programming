package constructor;

public class Constructoroverload {
    String name;
    int roll;
    int age;
    Constructoroverload(String a,int R,int A)
    {
        name=a;
        roll=R;
        age=A;
    }
    Constructoroverload(String N,int R)
    {
        name=N;
        roll=R;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
    }

    public static void main(String args[])
    {
        Constructoroverload C=new Constructoroverload("Naresh",1,20);
        Constructoroverload C1=new Constructoroverload("hari",2,13);
        C.display();
        System.out.println(".......................................");
        C1.display();
    }
}
