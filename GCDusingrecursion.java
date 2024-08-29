import java.util.*;
public class GCDusingrecursion{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number 1 = ");
        int a=in.nextInt();
        System.out.print("Enter The 2nd Number = ");
        int b=in.nextInt();
        System.out.print(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(b!=0){
            return gcd(b,b%a);
            
        }
        else{
            return a;
        }
    }
}