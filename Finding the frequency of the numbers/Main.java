import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
     int k=in.nextInt(); 
    int arr[] = new int[n];
    for(int idx = 0; idx <= n - 1; idx++)
    {
      arr[idx] = in.nextInt();
    }
    for(int i=1;i<=k;i++)
    {
      System.out.println(i+" "+freq(n,arr,i));
    }
      
    }
  public static int freq(int n,int arr[],int k)
  {
   
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]==k)
      {
       count++;
      }
    
   
    }
    return count;
  }
}