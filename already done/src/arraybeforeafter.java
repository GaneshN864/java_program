
import java.util.Scanner;

public class arraybeforeafter 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the values");
        int a[]=new int[l];
        for (int i = 0; i < l; i++) 
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for (int j = 1; j < l-1; j++) 
        {
            if(a[j-1]<a[j] && a[j]>a[j+1])
            {
                c++;
            }
            
        }
        System.out.println("Count is " +c);
    }
}
