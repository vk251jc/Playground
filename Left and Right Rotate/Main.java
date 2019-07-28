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
    int nor=in.nextInt();
    lre(n,arr,nor);
    rro(n,arr,nor);
     for(int i=0;i<=(n-1);i++)
      {
        System.out.print(arr[i]+" ");
      }
  }
    
    public static void lre(int n,int arr[],int nor)
    {
      int fei=1;
      int lei;
      if(n%2==0)
      {
        lei=(n-1);
      }
      else
      {
        lei=(n-2);
      }
      for(int r=1;r<=nor;r++)
      {
      int temp=arr[fei];
      for(int i=3;i<n;i=i+2)
      {
        arr[i-2]=arr[i];
      }
      arr[lei]=temp;
      }
    }
    public static void rro(int n,int arr[],int nor)
    {
      int foi=0;
      int loi;
      if(n%2==1)
      {
        loi=(n-1);
      }
      else
      {
        loi=(n-2);
      }
      for(int r=1;r<=nor;r++)  
      {
        int temp=arr[loi];
       for(int i=(loi-2);i>=0;i=i-2)
      {
        arr[i+2]=arr[i];
       }
      arr[foi]=temp;
       }
    }
        
  	
}