public class ThreadSleep extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Error Occurs at Sleep in Thread");
            }
        }
    }
    public static void main(String args[]){
        ThreadSleep td=new ThreadSleep();
        td.start();
    }
}
