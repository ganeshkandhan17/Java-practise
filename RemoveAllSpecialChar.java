import java.util.*;
public class RemoveAllSpecialChar {
    public static void main(String args[]){
        System.out.println();
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String rmstr=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(rmstr);
    }
}
