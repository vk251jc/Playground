import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    for(int i=0;i<((n/2)-1);i++)
    {
      for(int j=0;j<((n/2)-1-i);j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    
    for(int i=0;i<n-1;i++)
    {
      for(int j=((n/2));j<n-1;j++)
      {
        if(arr[j]<arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for(int k=0;k<n;k++)
    {
    System.out.print(arr[k]+" ");
    }
        
    }
    
  }
