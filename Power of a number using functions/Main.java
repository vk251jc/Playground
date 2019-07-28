import java.util.Scanner;
class Main{
 public static int p(int b,int e)
 {
   int r=1;
   while(e>=1)
   {
     r=r*b;
     e--;
   }
   return r;
 }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
     int n2=in.nextInt();
    System.out.println(p(n1,n2));
  }
}