
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrpro 
{
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
        int totalPairs = (l * (l - 1)) / 2;
        int[] b = new int[totalPairs];
        int c = 0;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                b[c] = a[i] + a[j];
                c++;
            }
        }
        Arrays.sort(b);
        int x= b.length;
        System.out.println(b[0]);
        System.out.println(b[x-1]);
    }
}
