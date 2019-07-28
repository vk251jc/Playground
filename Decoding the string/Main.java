import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int sl=sb.length();
    int k=in.nextInt();
    for(int i=0;i<sl;i++)
    {
      char ch=sb.charAt(i);
      if(ch>='a'&&ch<='z')
      {
        ch=(char)(ch-k);
        if(ch<'a')
        {
          ch=(char)(ch+26);
        }
      }
      else if(ch>='A'&&ch<='Z')
      {
        ch=(char)(ch-k);
        if(ch<'A')
        {
          ch=(char)(ch+26);
        }
      }
      sb.setCharAt(i,ch);
    }
    System.out.print(sb);
  }
}