public class TryCatch{
	public static void main(String args[]){
	try{
	int a=10/0;
	System.out.print(a);
	}
	catch(Exception err){
		System.out.println();
	System.out.print("Error Occurs in Execution = "+err);
	}
     }
}