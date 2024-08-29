import java.util.*;
// import java.io.*;
public class PrintReverseStringStringBuilder{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        StringBuilder string1=new StringBuilder(string);
        string1=string1.reverse();
        System.out.print(string1);
        in.close();
    }
}