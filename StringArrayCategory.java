import java.util.*;
public class StringArrayCategory{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String arr[]=new String[n];
        String anaarr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }
        for(int i=0;i<n;i++){
            char sort[]=arr[i].toCharArray();
            Arrays.sort(sort);
            System.out.println(sort[i]);
        }
        for(String word1:anaarr){
            System.out.println(word1+" ");
        }
    }
}