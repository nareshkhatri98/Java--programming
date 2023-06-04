package Selfstudy;
//using class member
  class B{
     public int length;
    private int breadth;
    public void SetData(int l, int b)
    {
        length=l;
        breadth=b;
    }
    public int FindArea()
    {
        return length*breadth;
    }
    public int FindParemeter(){
        return 2*(length+breadth);
    }
}
public class MainBOx {
      public static void main(String args[]){
       B obj=new B();
       obj.SetData(12,13);
       System.out.println("area="+obj.FindArea());
       System.out.println("parameter="+obj.FindParemeter());
      }
}
