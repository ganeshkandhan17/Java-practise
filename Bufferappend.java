import java.util.*;
public class Bufferappend{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        StringBuffer welcome=new StringBuffer("Hello");
        System.out.print("Enter Your Name = ");
        String name=in.next();
        name=" "+name;
        welcome.append(name);
        System.out.print(welcome);
    }
}