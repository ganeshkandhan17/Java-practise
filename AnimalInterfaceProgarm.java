interface Animal{
	public void sound();
}

class Dog implements Animal{
	public void sound(){
	 System.out.println("Dog barks");
	}
}

class Cat implements Animal{
	public void sound(){
	 System.out.println("Cat will not bark");
	}
}

public class AnimalInterfaceProgarm{
	public static void main(String args[]){
	Animal dog=new Dog();
	dog.sound();
	Animal cat=new Cat();
	cat.sound(); 
	}
	
}