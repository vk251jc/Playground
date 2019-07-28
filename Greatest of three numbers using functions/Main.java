import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
     int n2=in.nextInt(); 
      int n3=in.nextInt();
      System.out.println(grt(n1,n2,n3));
	}
  public static int grt(int a,int b,int c)
  {
    int r=0;
    if(a>b&&a>c)
    {
       r=a;
    }
    else if(b>c)
    {
       r=b;
    }
    else
    {
       r=c;
    }
    return r;
  }
}