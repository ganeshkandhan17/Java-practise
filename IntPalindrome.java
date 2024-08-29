import java.util.*;
// import java.io.*;
public class IntPalindrome{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int reversed=0;
        while(n>0){
            int n1=n%10;
            reversed=reversed*10+n1;
            n=n/10;
        }
        if(n==reversed){
            System.out.print("Its an palindrome");
        }
        else{
            System.out.print("Its not an palindrome");
        }
        in.close();
    }
}