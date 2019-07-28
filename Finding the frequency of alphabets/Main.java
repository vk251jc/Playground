import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder sb=new StringBuilder(s);
      int sl=sb.length();
      int arr[]=new int[26];
      for(int i=0;i<26;i++)
      {
        arr[i]=0;
      }
      for(int i=0;i<sl;i++)
      {
        if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
        {
          int offset=sb.charAt(i)-'A';
          char ch=(char)('a'+offset);
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
        {
          
          arr[sb.charAt(i)-'a']++;
        }
        
      }
      for(int i=0;i<sl;i++)
      {
   if( arr[sb.charAt(i)-'a']!=0)
   {
     
           
          System.out.print(sb.charAt(i)+""+arr[sb.charAt(i)-'a']+" ");
        arr[sb.charAt(i)-'a']=0;
      }
      }





      
    }
}