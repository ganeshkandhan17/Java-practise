class temp{
    String instance="Its an instance variable";
    static String staticvar="Its an Static varible";
    void method(){
        String localvar="Its an local variable";
        System.out.println(instance);
        System.out.println(localvar);
    }
}
public class Variables {
    public static void main(String args[]){
        System.out.println();
        temp obj=new temp();
        System.out.println(temp.staticvar);
        obj.method();
    }
}
