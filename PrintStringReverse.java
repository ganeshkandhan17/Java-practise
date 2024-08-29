import java.util.*;
// import java.io.*;
public class PrintStringReverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        int len=string.length();
        while(len>0){
            System.out.print(string.charAt(len-1));
            len=len-1;
        }
        in.close();
    }
}
