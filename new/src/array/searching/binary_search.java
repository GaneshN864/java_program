package searching;

import java.util.Arrays;

public class binary_search {
    public static void main(String[]args)
    {
        int a[]={2,56,4,23,6,7,8};
        int key=3;
        Arrays.sort(a);
        if(binary(a,key))
            System.out.print("Found");
        else
            System.out.print("Not Found");
    }
    public static boolean binary(int a[],int key)
    {
        int start=0,end=a.length-1;
        while(start<=end)
        {
            int mid = (start+end) / 2;
            if (a[mid] == key) {
                return true;
            } else if (a[mid] > key) {
                end = mid - 1;

            } else if (a[mid] < key) {
                start = mid + 1;
            }
        }
        return false;
    }
}
