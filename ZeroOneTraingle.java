public class ZeroOneTraingle {
    public static void main(String args[]){
        int n=6;
        int num=0;
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(num%2==0){
                    System.out.print(1);
                    num++;
                }
                else{
                    System.out.print(0);
                    num++;
                }
            }
            System.out.println();
        }
    }
}
