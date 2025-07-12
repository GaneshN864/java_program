import java.util.*;
import java.util.Arrays;
public class arrayreverse {

    public static void reverse(int b[])
    {
        int l=0, r=b.length-1;
        while(l < r)
        {
            int temp=b[l];
            b[l]=b[r];
            b[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args)
    {
        int a[]={4,5,6,7};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
