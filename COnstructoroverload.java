package Labreport;

public class COnstructoroverload {//10

        int id;
        String name;
        COnstructoroverload(int i,String n)
        {
            id=i;
            name=n;
        }
        void dispaly(){
            System.out.println(id+ " " +name);
        }
        public static void main(String args[]){
        COnstructoroverload d1=new COnstructoroverload(12,"Naresh");
        COnstructoroverload d2=new COnstructoroverload(13,"Bisham");
            d1.dispaly();
            d2.dispaly();
        }
    }

