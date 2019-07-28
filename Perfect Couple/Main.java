import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      p(n,arr,value);
      }
     public static void p(int n,int arr[],int value)
  {
    for(int j=0;j<=n-1;j++)
    {
      for(int k=j+1;k<=n-1;k++)
      {
        int sum=arr[j]+arr[k];
       
        if(sum==value)
         {
          System.out.println(arr[j]+","+" "+arr[k]);
         }
       }
      
     }
   }
}