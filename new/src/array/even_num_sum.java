import java.util.Arrays;

public class even_num_sum
{

    public static void main(String[] args)
    {
            int a[]={123,24,17,13,18};
            int b[]=new int[a.length];
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                {
                    while (a[i]>0)
                    {
                        b[i]=(a[i]%10)+b[i];
                        a[i]/=10;
                    }
                }
                else
                    b[i]=a[i];
            }
            System.out.print(Arrays.toString(b));
    }
}

