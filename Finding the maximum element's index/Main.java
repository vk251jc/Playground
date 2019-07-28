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
    int max_i;
    if(arr[0]>arr[1])
    {
      max_i=0;
    }
    else
    {
      max_i=1;
    }
    for(int i=2;i<=(n-1);i++)
    {
      if(arr[max_i]<arr[i])
      {
        max_i=i;
      }
    }
    System.out.println(max_i);
  
      
  }
}