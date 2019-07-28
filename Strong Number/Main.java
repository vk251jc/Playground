import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int s=0;
      while(n!=0)
      {
        int r=n%10;
        int fact=1;
        for(int i=1;i<=r;i++)
        {
          fact=fact*i;
        }
        s=s+fact;
        n=n/10;
      }
      n=temp;
      if(n==s)
        System.out.println("Yes");
      else
       System.out.println("No"); 
        
        
      
	}
}