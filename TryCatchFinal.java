public class TryCatchFinal{
	public static void main(String args[]){
	int arr[]=new int[5];
	try{
	int a=arr[6];
	System.out.print(a);
	}
	catch(ArrayIndexOutOfBoundsException err){
	System.out.println("Array Size Exceed Error Found = "+err);
	}
	finally{
	System.out.println("Final Block as Executed");
	}
     }
}