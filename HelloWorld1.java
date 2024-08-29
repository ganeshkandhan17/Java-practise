// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=in.nextInt();
        try{
            int a=10/n;
        }
        catch(ArithmeticException e){
            System.out.print("Error Occrus");
        }
    }
}