import java.util.*;
// import java.io.*;
public class PrintReverseInt {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0){
            int n1=n%10;
            n=n/10;
            System.out.print(n1);
        }
        in.close();
    }
}