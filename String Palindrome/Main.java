import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int slen=str.length();
      int front=0;
      int end=slen-1;
      int num=1;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
       num=0;
          break;
        }
          front++;
          end--;
      }
    if(num==1)
    {
      System.out.println("Yes");
    }
        else
        {
         System.out.println("No"); 
        }
      
    
    
     }
}