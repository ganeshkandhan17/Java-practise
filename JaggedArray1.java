import java.util.*;
public class JaggedArray1 {
    public static void main(String[] args) {
        System.out.println();
        int arr[][]=new int[4][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[5];
        arr[3]=new int[1];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=++temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
            // for(int j=0;j<arr[i].length;j++){
            //     System.out.print(arr[])
            // }
        }
        
    }
}
