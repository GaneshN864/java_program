package sorting;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int a[]={1,41,5,6,60,2};
        int s;
        for (int i = 0; i <a.length-1 ; i++) {
            s = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[s])
                {
                    s=j;
                }
            }
            int temp = a[i];
            a[i] = a[s];
            a[s]= temp;
        }
        System.out.println(Arrays.toString(a));
        }
    }
