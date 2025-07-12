package sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int a[]={5,3,2,14,4};
        for (int i = 1; i <a.length ; i++)
        {
            int r=a[i];
            int l=i-1;
            while(l>=0 && a[l]>r)
            {
                a[l+1]=a[l];
                l--;
            }
            a[l+1]=r;
        }
        System.out.println(Arrays.toString(a));
    }
}
