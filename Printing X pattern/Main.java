import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int i = 1; i <= n; ++i)
	    {
             // Handle stars for each row
	         for(int j = 1; j <= n; ++j)
	         {
                
	                // When row no and col no are equal, print "*"
                    // Otherwise print space
	                if((i ==j) ||
	                  (i + j == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}