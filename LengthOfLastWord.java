import java.util.Scanner;
public class LengthOfLastWord {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        str=str.trim();
        String arr[]=str.split(" ");
        int length=arr[arr.length-1].length();
        System.out.println(length);
    }
}
