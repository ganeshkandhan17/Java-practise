import java.util.Scanner;
public class EvenWord {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String arr[]=str.split(" ");
        for(String word:arr){
            if(word.length()%2==0){
                System.out.println(word);
            }
        }

    }
}
