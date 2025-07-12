package sorting;

import java.util.Arrays;

public class bubble_sort
{
    public static void main(String[] args)
    {
        int a[]={3,2,4,1};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
