public class IncreasingNumberPyramidReverse {
    public static void main(String args[]){
        int n=6;
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
