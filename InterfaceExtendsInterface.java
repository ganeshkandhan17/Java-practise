interface One{
    void example();
}

class InterfaceExample implements One{
    public void example(){
        System.out.println("Its an example interface program");
    }
    public static void main(String args[]){
        InterfaceExample obj=new InterfaceExample();
        obj.example();
    }
}