import java.util.Scanner;
public class FirstOccuranceString {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String str2=in.next();
        int result=-1;
        if(!str.contains(str2)){
            System.out.print(result);
        }
        else{
            int len=str2.length();
            for(int i=0;i<=str.length()-len;i++){
                String temp=str.substring(i,i+len);
                if(temp.equals(str2)){
                    result=i;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}
