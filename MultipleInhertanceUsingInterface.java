interface One{
    void sum1();
}
interface Two{
    void mul1();
}

class MultipleInhertanceUsingInterface implements One,Two{
    public void sum1(){
        System.out.println("Its an Sum function");
    }
    public void mul1(){
        System.out.println("Its an Multiple function");
    }
    public static void main(String args[]){
        MultipleInhertanceUsingInterface obj=new MultipleInhertanceUsingInterface();
        obj.sum1();
        obj.mul1();
    }
}