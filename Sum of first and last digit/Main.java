import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int l_digit=n%10;
      while(n>10)
      {
        n=n/10;
      }
      int sum=l_digit+n;
      System.out.println(sum);
	}
}