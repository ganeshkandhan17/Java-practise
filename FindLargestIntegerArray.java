import java.util.*;
// import java.io.*;
public class FindLargestIntegerArray {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Total Number= ");
        int n=in.nextInt();
        int num[]=new int[n];
         int i, tlargest=0, largest=0, slargest=0;
        for(i=0;i<n;i++){
            System.out.print("Enter Number"+(i+1)+"= ");
            num[i]=in.nextInt();
            if(largest<num[i]){
                tlargest=slargest;
                slargest=largest;
                largest=num[i];
            }
            else if(slargest<num[i]){
                tlargest=slargest;
                slargest=num[i];
            }
            else if(tlargest<num[i]){
                tlargest=num[i];
            }
        }
        System.out.println("Largest Number= "+largest);
        System.out.println("Second Largest Number= "+slargest);
        System.out.println("Third Largest Number="+tlargest);
        in.close();
            
    }
}
