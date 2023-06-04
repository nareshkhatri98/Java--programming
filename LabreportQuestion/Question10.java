package LabreportQuestion;
//constructor overload
public class Question10 {
    int id;
    String name;
    Question10(){
        System.out.println("default Constructor");
    }
    Question10(int  i,String n){
        id=i;
        name=n;
    }
    void Display()
    {
        System.out.println(id+ " " +name);
    }

    public static void main(String[] args) {
        Question10 Q=new Question10(12,"Naresh");
        Question10 Q1=new Question10(13, "Bisham");
        Q.Display();
        Q1.Display();
    }
}
