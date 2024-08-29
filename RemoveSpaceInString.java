import java.util.Scanner;
public class RemoveSpaceInString {

    public static void main(String[] args) {
        //A Simple Hello World
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        String t = obj.next();
        String rem="";
        char[] temp=t.toCharArray();
        for(char temp1:temp){
            if(temp1!=' '){
                 rem=rem+temp1;
            }
           
        }
     
        System.out.print(rem);
    }
}
