import java.util.*;
class Wait extends Thread{
    public void run(){
        System.out.println("Downloading...");
        try{
            Thread.sleep(3000);
            System.out.println("Download Completed");
            System.out.println("Exit");
        }
        catch(Exception e){
            System.out.println("Error occurs at running the Application");
        }
    }
} 

public class ThreadPractice {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Wait td=new Wait();
        int loop=0;
        while(loop==0){
            System.out.println("1. Download");
            System.out.println("2. Exit");
            System.out.print("Enter the number =");
            loop=in.nextInt();
            if(loop>2){
                System.out.println("Enter the valid number");
                loop=0;
            }
            else if(loop==1){
                td.start();
            }
        }
    }
}
