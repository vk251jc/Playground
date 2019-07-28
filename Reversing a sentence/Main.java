import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int slen=sb.length();
      int front=0;
      int end=slen-1;
      rev(sb,front,end);
      for(int i=0;i<slen;i++)
      {
        if(sb.charAt(i)==' ')
        {
          rev(sb,front,i-1);
          front=i+1;
        }
        else if(i==(slen-1))
        {
          rev(sb,front,i);
          front=i+1;
        }
      }
      System.out.println(sb);
    }
     public static void rev(StringBuilder sb,int front,int end)
     {
       while(front<end)
         
       {
         char ch=sb.charAt(front);
         sb.setCharAt(front,sb.charAt(end));
          sb.setCharAt(end,ch);
         front++;
         end--;
    }
     }
}