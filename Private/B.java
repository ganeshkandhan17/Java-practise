package Private;

class A {
    private String pvt="Its an Private Variable"; 
    private void msg(){
        System.out.println(pvt);
    }
    
}
public class B{
    public static void main(String args[]){
        A obj=new A();
        obj.msg();
    }
}

