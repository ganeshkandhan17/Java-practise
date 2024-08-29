public class ArrayOutBondTryCatch{
	public static void main(String args[]){
	int arr[]=new int[5];
	try{
	int a=arr[6];
	System.out.print(a);
	}
	catch(ArrayIndexOutOfBoundsException err){
	System.out.print("Array Size Exceed Error Found = "+err);
	}
     }
}