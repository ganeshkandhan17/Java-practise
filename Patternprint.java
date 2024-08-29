public class Patternprint{
	public static void main(String[] args) {
		int n=5;
		int i, j, k; 
  
        for (k = 0; k < n; k++) { 
            for (i = n; i > 0; i--) { 
                for (j = 0; j < n - k; j++) { 
                    System.out.print(i + " "); 
                } 
            } 
            System.out.print("$"); 
        } 
	}
}