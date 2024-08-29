public class ThreadExtends extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        ThreadExtends obj=new ThreadExtends();
        System.out.println();
        obj.start();
    }
}
