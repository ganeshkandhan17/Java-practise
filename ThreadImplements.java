public class ThreadImplements implements Runnable {
    public void run(){
        System.out.println("Thread is running through Interface");
    }
    public static void main(String args[]){
        System.out.println();
        ThreadImplements obj=new ThreadImplements();
        Thread td=new Thread(obj);
        td.start();
    }
}









