import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix2[i][j] = sc.nextInt();
      }
    }
    
 int f=0;
    for(int i = 0; i <= matrix1.length - 1; i++){
      for(int j = 0; j <= matrix1[i].length - 1; j++)
      {
       
        if(matrix1[i][j]==matrix2[i][j])
        {
          f=1;
        }
        else
        {
          f=0;
        }
      }
    }
  
  if(f==1)
  {
      
        System.out.print("Yes");
      }
    else
    {
      System.out.println("No");
    }
  }
}