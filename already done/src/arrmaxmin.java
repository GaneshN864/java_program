import java.util.Arrays;
import java.util.Scanner;

public class arrmaxmin {
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the array value");
        for (int i = 0; i < l; i++) 
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int c=a[0]+a[1];
        int d=a[l-1]+a[l-2];
        System.out.println("Minimum value of array is " +c );
        System.out.println("maximum value of array is " +d );
    
}
}
