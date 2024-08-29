interface Laptop{
    void DisplaySize();
}

class Lenovo implements Laptop{
     public void DisplaySize(){
        System.out.println("Display Size was 12 Inch");
    }
}

class HP implements Laptop{
    public void DisplaySize(){
	System.out.println("Display Size was 13 Inch");
    }    
}

public class HireachialInterface{
    public static void main(String args[]){
        Laptop obj=new HP();
        obj.DisplaySize();
    }
}