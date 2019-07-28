import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int l=0;
      int r=n-1;
      int num=0;
      
      while(l<r)
      {
        if(arr[l]==arr[r])
        {
          l++;
          r--;
        }
        else
        {
          num=1;
          break;
        }
      }
      if(num==0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
      
    }
}
