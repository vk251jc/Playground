import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
     String str2=in.nextLine();
    int slen1=str1.length();
     
    int slen2=str2.length();
    int count=0;
    for(int i=0;i<(slen1-slen2+1);i++)
    {
      int num=1;
      for(int j=0;j<slen2;j++)
      {
        if(str1.charAt(i+j)!=(str2.charAt(j)))
           {
             num=0;
           }
           
           }   
     if(num==1)
     {
       count++;
     }
           
           }
      System.out.println(count);                     
  } 
}