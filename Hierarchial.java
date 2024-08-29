class level1{
    String a="Its an Hierarchial Inhertance";
}
class level2 extends level1{

}

class level3 extends level1{

}
public class Hierarchial {
    public static void main(String args[]){
        level2 obj1=new level2();
        level3 obj2=new level3();
        System.out.println();
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
