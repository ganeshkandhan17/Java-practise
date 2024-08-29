interface Printable{
	void print();
}

class A implements Printable{
	public void print(){
	 System.out.print("Print method is Invoked");
	}
}

public class Document{
public static void main(String args[]){
	 Printable obj=new A();
	 obj.print();
	}
}