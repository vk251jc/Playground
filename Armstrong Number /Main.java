import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=0,r,temp;
      temp=n;
      while(n!=0)
      {
        r=n%10;
        s=s+r*r*r;
        n=n/10;
      }
      n=temp;
      if(n==s)
        System.out.println("Armstrong Number");
      else
       System.out.println("Not a Armstrong Number");  
        
      
        
	}
}