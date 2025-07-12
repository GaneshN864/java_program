import java.util.Arrays;

public class no_palindrome {
    public static void main(String []args)
    {
        int a[]=new int[]{21,121,1221,56};
        for(int i=0;i<a.length;i++)
        {
           if(palindrome(a[i]))
           {
               a[i]=-1;
           }
        }
        System.out.println(Arrays.toString(a));
    }
    public static boolean palindrome(int a)
    {
        int b=0,c=a;
        while(a>0)
        {
            b*=10;
            b=(a%10)+b;
            a/= 10;
        }
       if(b==c)
           return true;
       else
           return false;
    }
}
