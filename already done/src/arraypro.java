import java.util.*;
public class arraypro {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the k value");
        int k=sc.nextInt();
        System.out.print("Enter the array length");
        int l=sc.nextInt();
        System.out.print("Enter the array value");
        int a[]=new int[l];
        for (int i = 0; i < l; i++)
        {
            a[i]=sc.nextInt();
        }
        int c;
        for (int i = 0; i < l-1; i++)
        {
            for (int j = i+1; j < l; j++)
            {
                c=a[i]+a[j];
                if(k==c)
                {
                    System.out.print(a[i]);
                    System.out.print(" " +a[j] +" " );
                }
            }
        }
    }
    
}
