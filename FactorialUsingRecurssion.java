import java.util.*;
// import java.io.*;
public class FactorialUsingRecurssion{
    public static int findfactorial(int n){
        if(n==1){
            return 1; 
        }
        else{
            return n+findfactorial(n-1);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(findfactorial(n));
        in.close();
    }
}