import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
       Scanner in=new Scanner(System.in);
   String s1=in.nextLine();
   String s2=in.nextLine();
   StringBuilder sb1=new StringBuilder(s1);
   StringBuilder sb2=new StringBuilder(s2);
   StringBuilder temp=new StringBuilder("");
   int sl1=sb1.length();
   int sl2=sb2.length();
   for(int i=0;i<sl1;i++)
   {
     char ch=sb1.charAt(i);
     temp.append(ch);
   }
    for(int i=0;i<sl1;i++)
   {
     char ch=sb1.charAt(i);
     temp.append(ch);
   }
   int tl=temp.length();
   int n=substring(temp,tl,sb2,sl2);
   if(n!=-1)
   {
     System.out.print("Yes");
   }
   else
   {
      System.out.print("No");
   }
 }
  public static int substring(StringBuilder sb1,int sl1,StringBuilder sb2,int sl2)
  {
    int mi=-1;
    for(int i=0;i<(sl1-sl2+1);i++)
    {
      int num=1;
      for(int j=0;j<sl2;j++)
      {
        if(sb1.charAt(i+j)!=sb2.charAt(j))
        {
          num=0;
        }
      }
      if(num==1)
      {
        mi=i;
        break;
      }
    }
      return mi;
      
          
    }
                      
     
}


