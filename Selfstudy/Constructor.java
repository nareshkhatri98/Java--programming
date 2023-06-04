package Selfstudy;

public class Constructor {
    String name="Naresh";
    public void Display(){
        System.out.println(name);
    }
    Constructor()
    {
        System.out.println("unknown");
    }
    public static void main(String args[]){
        Constructor c =new Constructor();
        c.Display();

    }
}
