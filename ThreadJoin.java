public class ThreadJoin extends Thread {
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("Thread is running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error occurs at running the program");
            }
        }
        
    }
    public static void main(String[] args) {
        ThreadJoin obj=new ThreadJoin();
        System.out.println();
        obj.start();
        try {
            obj.join();
        } catch (Exception e) {
            System.out.println("Error occus");
        }
        System.out.println("Final");
    }
}
