package searching;

import java.util.Scanner;

public class linear_searching {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        int a[]={5,6,4,3,1,7,8};
        System.out.print("Enter the key element to find :");
        int key=sc.nextInt();
        int i;
        for(i=0;i<a.length;i++)
        {
            if(key==a[i])
            {
                System.out.print("Found");
                break;
            }
        }
        if(i==a.length)
        {
            System.out.print("Element Not Found");
        }
    }
}
