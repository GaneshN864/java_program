import java.util.Arrays;

public class char_to_ascii {
    public static void main(String[]args)
    {
        char c[]=new char[]{'A','b'};
        int a[]=new int[c.length];
        for(int i=0;i<c.length;i++)
        {
            a[i]=(int)c[i];
        }
        System.out.print(Arrays.toString(a));
        for(int i=0;i<c.length;i++)
        {
            String str;
            System.out.print(a[i]);
        }

    }
}
