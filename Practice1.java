class A{
    void print1(){
        System.out.println("Hello");
    }
}

class B extends A{
    void print1(){
        System.out.println("World");
    }
}

public class Practice1{
    public static void main(String[] args) {
        A obj=new B();
        obj.print1();
    }
}