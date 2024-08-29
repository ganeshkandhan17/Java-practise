class CounterThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("CounterThread ="+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception err){
                System.out.println("error occurs in application = "+err);
            }
        }
    }
}

class CounterRunnable implements Runnable{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println("CounterRunnable ="+i);
            try {
                Thread.sleep(1000);
            } catch (Exception err) {
                System.out.println("error occurs in application = "+err);
            }
        }
    }
}

public class MultiThreadingApplication{
    public static void main(String args[]){
        System.out.println();
        CounterThread td1=new CounterThread();
        CounterRunnable obj=new CounterRunnable();
        Thread td2=new Thread(obj);
        td1.start();
        td2.start();
        try{
            td2.join();
        }
        catch(Exception err){
            System.out.println("error occurs in application = "+err);
        }
        System.out.println("Both Thread are Finished");
    }
}