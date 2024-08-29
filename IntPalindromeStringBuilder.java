// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
// import java.io.*;
public class IntPalindromeStringBuilder{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        String temp1=" "+num1;
        temp1=temp1.trim();
        StringBuilder numb1=new StringBuilder(temp1);
        String Final1=numb1.toString();
        StringBuilder numb2=new StringBuilder(numb1.reverse());
        String Final2=numb2.toString();
        if(Final1.equals(Final2)){
            System.out.print("yes");
        }
        else{
            System.out.print("NO");
        }

        in.close();
    }
}