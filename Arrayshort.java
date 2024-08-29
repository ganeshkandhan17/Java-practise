import java.util.Arrays;

public class Arrayshort{
    public static void main(String args[]){
        int arr[]={2,4,6,6,2,4,2,7,4,567,234,76};
        Arrays.sort(arr);
        int n=0;
        while(n<arr.length){
            System.out.print(" "+arr[n]);
            n++;
        }

    }
}