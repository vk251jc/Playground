import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<=(n-1);i++)
  {
    arr[i]=in.nextInt();
  }
 pb(arr,n);
  }
  public static void pb(int arr[],int n)
  {
    int num=0;
    int bsum=arr[0]+arr[1]+arr[2];
    for(int i=3;i<=(n-1);i=i+3)
    {
      int csum=arr[i]+arr[i+1]+arr[i+2];
      if(csum==bsum)
      {
        num=1;
      }
    }
    if(num==1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}