package Imple;
import Encplu.*;
import Interf.*;

public class StdImple implements StdInterf {

  public  void add (StdEncp E) {
     int sum=E.getA()+E.getB();
     System.out.println("Addition="+sum);
 }

 public int subb( StdEncp E)
 {
     int diff=E.getA()-E.getB();
     return diff;
 }
}
