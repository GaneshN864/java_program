import java.util.Scanner;

public class own 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array length");
        int len =sc.nextInt();
        int[] a =new int[len];
        sc.nextLine();
        System.out.println("Enter array values");
        for(int i=0;i< len ;i++)
        {
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        
    }
}
