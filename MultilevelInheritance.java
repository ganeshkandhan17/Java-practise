class Level1{
    int a=10;
   

}
class Level2 extends Level1{

}
class Level3 extends Level2{

}
public class MultilevelInheritance extends Level3 {
    public static void main(String[] args) {
        MultilevelInheritance l3 =new MultilevelInheritance();
        System.out.println();
        System.out.println(l3.a);
    }
}
