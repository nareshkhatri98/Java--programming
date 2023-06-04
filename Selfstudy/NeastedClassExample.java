package Selfstudy;
class Outer {
    class Inner {
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
}
public class NeastedClassExample {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();

        // Calling show() method over above object created
        in.show();
    }
}
