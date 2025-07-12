import java.util.Scanner;
public class equalatortri {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int m=n*2;
        for (int i = 0; i < n; i++) 
        {
            for(int j=0; j<=m;j++)
            {
                if(j<n)
                System.out.print(" ");
                else
                {
                    System.out.print("*");
                    for(int k=0;k<i;k++)
                    {
                        System.out.print("*");
                    }
                    System.err.print("\n");
                }
                
            }
        }

    }
}
