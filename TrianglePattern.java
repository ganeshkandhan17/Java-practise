public class TrianglePattern {
    public static void main(String[] args) {
        int row=4;
        System.out.println();
        for(int i=0;i<=row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=row;k>=i;k--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
