public class ExceptionHandle{
	public static void main(String args[]){
	int arr[]=new int[5]; 
	try{
	
	int a=arr[6];
	System.out.print(a);
	
	}
	catch(ArrayIndexOutOfBoundsException err){
	System.out.println("Array Size Exceed Error Found = "+err);
	}

	try{
	String name=null; 
	System.out.print(name.length());
	}
	catch(Exception err){
	System.out.println("Null Pointer Exception occurs = "+err);
	}
     }
}