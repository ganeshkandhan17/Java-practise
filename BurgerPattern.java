public class BurgerPattern {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4,5},{11,12,13,14,15},{16,17,18,19,20},{6,7,8,9,10}};
        int r=4;
        int c=5;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(i==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(i==3){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(i==1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(i==2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
