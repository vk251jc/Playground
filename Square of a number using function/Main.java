import java.util.Scanner;
class Main
{
 public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     
      int sq1=s(n);
      
      System.out.print(sq1);
	}  
	public static int s(int a)
{
  int sq=(a*a);
  return sq;
}
	
}