package Labreport;
//11
    public class Student
    {
        String name="Naresh";
        //public  Student()
      //  {
       //     System.out.println("unknown name");
       // }

        public static void main(String args[])
        {

            Student s1=new Student();
            System.out.println("Student name="+s1.name);
        }
        public  Student()
        {
            System.out.println("unknown name");
        }
}
