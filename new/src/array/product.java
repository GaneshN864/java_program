import java.util.Arrays;

public class product {
    public static void main(String[] args)
    {
        int a[]={2,4,6};
        int productarr[]=new int[a.length];
        Arrays.fill(productarr,1);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i!=j)
                {
                    productarr[i]*=a[j];
                }
            }

        }
        System.out.print(Arrays.toString(productarr));
    }
}
