public class ThreadPriority extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error occurs at timeout");
            }
        }
    }
    
    public static void main(String[] args) {
        ThreadPriority td1=new ThreadPriority();
        ThreadPriority td2=new ThreadPriority();
        td1.setPriority(MAX_PRIORITY);
        td2.setPriority(MIN_PRIORITY);
        td2.start();
        td1.start();
    }
}
