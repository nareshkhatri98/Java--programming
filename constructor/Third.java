package constructor;
//find area and volume of rectangle using default constructor

public class Third {
    int length;
    int breadth;
    int height;
    Third() {
        System.out.println("Details of rectangle");
        length = 12;
        breadth = 2;
        height=1;
    }
    int Area(){
        return length*breadth;
    }
    int Volume()
    {
        return length*breadth*height;
    }
    public static void main(String args[])
    {
        Third T=new Third();
        int V= T.Volume();
        int A=T.Area();
        System.out.println("Area="+A);
        System.out.println("volume="+V);
    }

    }

