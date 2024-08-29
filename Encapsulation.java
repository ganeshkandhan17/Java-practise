public class Encapsulation {
    public static void main(String args[]){
        car obj=new car();
        obj.model=1;
        obj.name="ford";
        System.out.println();
        obj.printname();
    }
}
class car{
    int model;
    String name;
    void printname(){
        System.out.print(name);
    }
}
