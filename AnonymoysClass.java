public class AnonymoysClass {
    void method(int a){
        System.out.print("given number is "+a);
    }
    public static void main(String args[]){
        System.out.println();
        new AnonymoysClass().method(3);
    }
}
