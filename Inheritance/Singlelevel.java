package Inheritance;
class rectangle{
    int l;int b;int area;
    public void Area(int l, int b)
    {
        area=l*b;
        System.out.println("Area="+area);
    }
}
class Square extends rectangle{
    public void Area1(int L,int B)
    {
        int area1=L*B;
        System.out.println(area1);
    }
}

public class Singlelevel
{
    public static void main(String args[]){
        Square s=new Square();
        s.Area(12,3);
        s.Area1(12,2);
    }
}
