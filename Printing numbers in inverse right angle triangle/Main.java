import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      int num=n;
	    for(int curr_row = 1; curr_row <= n; ++curr_row)
	    {
            // Handle space for each row
	        
            // Handle stars for each row
	        for(int curr_col = num; curr_col >=1; --curr_col)
	        {
	            System.out.print(curr_col);
              
	        }
          num=num-1;
	        System.out.println();
	    }
	}
}