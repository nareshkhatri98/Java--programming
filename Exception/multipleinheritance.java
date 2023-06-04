package Exception;
interface A{
    void add();
}
interface B{
    void sub();
}
 class multipleinheritance implements A,B {
    public void add(){
        int a=12;
        int b=13;
        int c=a+b;
        System.out.println(c);
    }
    public void sub(){
        int a=1;
        int b=3;
        int c=a-b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        multipleinheritance m=new multipleinheritance();
        m.add();
        m.sub();
    }
}
