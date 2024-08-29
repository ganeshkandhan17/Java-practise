public class Fix2decimal {
    public static void main(String args[]){
        int A[]={2,55,85,656,52,554,545,5,2};
        int sum=0;
        float avg=0;
        int len=A.length;
        for(int i=0;i<len;i++){
            sum=sum+A[i];
        }
        avg=(float)sum/len;
        String result= String.format("%.2f",avg);
        System.out.println(sum);
        System.out.println(avg);
        System.out.print(result);
    }
}
