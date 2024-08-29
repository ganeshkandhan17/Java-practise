import java.util.Scanner;
public class HelloWorld {
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
        System.out.print("Enter Your Name: ");
        String name=in.nextLine();
        System.out.print("Hello "+name);
        in.close();
    }
}
