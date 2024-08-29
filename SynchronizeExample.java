class SyncExample{
    synchronized void printNum(int n){
        for(int i=1;i<5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Error occurs");
            }
        }
    }
}

class Thread1 extends Thread{
    SyncExample sync;
    Thread1(SyncExample sync){
        this.sync=sync;
    }
    public void run(){
        sync.printNum(5);
    }
}

class Thread2 extends Thread{
    SyncExample sync;
    Thread2(SyncExample sync){
        this.sync=sync;
    }
    public void run(){
        sync.printNum(100);
    }
}


public class SynchronizeExample {
    public static void main(String[] args){
        SyncExample obj=new SyncExample();
        Thread1 td1=new Thread1(obj);
        Thread2 td2=new Thread2(obj);
        td1.start();
        td2.start();
    }
}
