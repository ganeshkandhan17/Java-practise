abstract class mech{
    abstract void run();
    abstract void method1();
}

class Abstract extends mech {
    void run(){
        System.out.println("Running safely");
    }
    void method1(){
        System.out.println("Method 1 called");
    }
    public static void main(String args[]){
        mech obj=new Abstract();
        System.out.println();
        obj.run();
    }
}


