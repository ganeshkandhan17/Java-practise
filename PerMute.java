import java.util.*;
public class PerMute {
    public static void permute(String str,String ans){
        if(str.length()==0){
            System.out.print(ans);
            
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String remstr=str.substring(0,i)+str.substring(i, 1)
        }
    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        // char arr[]=str.toCharArray();
        // int n=3;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         for(int k=0;k<n;k++){
        //             if(i!=j && i!=k && j!=k ){
        //                 System.out.println(arr[i]+""+arr[j]+""+arr[k]);
        //             }
                    
        //         }
        //     }
        // }
    }
    
}
