import java.util.*;
// import java.io.*;
public class JavaStringSplitWithSpace{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String arr[]=input.split(" ");
        for(String temp:arr){
            System.out.println(temp);
        }
        in.close();
    }
}