public class MethodOverRaiding {
    public static void main(String args[]){
        System.out.println();
        dog obj1=new dog();
        obj1.sound();
        obj1.like();
        cat obj2=new cat();
        obj2.sound();
        obj2.like();
    }
}
class dog{
    void sound(){
        System.out.println("Dog barks");
    }
    void like(){
        System.out.println("Dog like biscute");
    }
}

class cat extends dog{
    void sound(){
        System.out.println("Cat Meyaaavu");
    }
    void like(){
        System.out.println("Cat like Milk");
    }
}