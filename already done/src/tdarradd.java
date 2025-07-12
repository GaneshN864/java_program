
import java.util.Scanner;

public class tdarradd 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row and column");
        int r=sc.nextInt();
        int co=sc.nextInt();
        System.out.println("Enter the values of A matrix");
        int a[][]=new int[r][co];
        int b[][]=new int[r][co];
        int c[][]=new int[r][co];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < co; j++) 
            {
                a[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println("Enter the values of B matrix");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < co; j++) 
            {
                b[i][j]=sc.nextInt();
                
            }
            
        }
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < co; j++) 
            {
                c[i][j]=a[i][j]+b[i][j];
                
            }
            
        }
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < co; j++) 
            {
                System.out.print(c[i][j] + "\t");
                
            }
            System.out.println("\n");
            
        }
    }
}
