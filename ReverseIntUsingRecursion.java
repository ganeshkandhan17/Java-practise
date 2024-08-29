import java.util.*;
public class ReverseIntUsingRecursion {
    public static void reverse(int n){
        if(n==0){
        }
        else{
            System.out.print(n%10);
            reverse(n/10);
        }

    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter an number to revers = ");
        int n=in.nextInt();
        reverse(n);
        in.close();
    }

}
