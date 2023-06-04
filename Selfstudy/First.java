package Selfstudy;
class Box{
   int length;
    int breadth;
 int height;

    public void Setdata(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public int FindArea()
    {
        return length*breadth;
    }
    public int FindVolumn()
    {
        return length*breadth*height;
    }
}
public class First {
    public static void main(String args[]){
      Box b1=new Box();
      b1.Setdata(2,3, 4);
        System.out.println("area="+b1.FindArea());
        System.out.println("volum="+b1.FindVolumn());
    }


}
