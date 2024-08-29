class Computer1{
    int cno;
    String company;
}

public class DefaultConstructor {
    public static void main(String args[]){
        Computer1 comp1=new Computer1();
        comp1.cno=1;
        comp1.company="Lenovo";
        System.out.println(comp1.cno);
        System.out.println(comp1.company);
    }
}

