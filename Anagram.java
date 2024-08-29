import java.util.*;
public class Anagram {
    public static void main(String args[]){
        System.out.println();
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String str1=in.next();
        char arr[]=str.toCharArray();
        char arr1[]=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        boolean result=true;
        if(arr.length!=arr1.length){
            result=false;
        }

        else{
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+"="+arr1[i]);
                if(arr[i]!=arr1[i]){
                    result=false;
                    break;
                }
            }
        }
        System.out.println(result);
        
    }
}
