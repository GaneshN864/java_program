import java.util.*;
public class arraysort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int len=sc.nextInt();
        sc.nextLine();
        int a[]=new int[len];
        System.out.println("Enter array values");
        for (int i = 0; i < len; i++) 
        {
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < len; i++) 
        {
            for (int j = 0; j < len; j++) 
            {
                if(a[j]<a[i])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        for (int i = len-1; i >=0; i--) 
        {
            System.out.println(a[i]);
        }
    }    
}
