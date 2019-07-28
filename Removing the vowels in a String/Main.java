import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int sl=sb.length();
    StringBuilder r=new StringBuilder("");
    for(int i=0;i<sl;i++)
    {
     
       if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
     {
       char ch=sb.charAt(i+1);
         r.append(ch);
         i++;
       }
      else 
      {
        r.append(sb.charAt(i));
      }
      
    }
    System.out.print(r);
  }
  }
