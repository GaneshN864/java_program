public class Subarray_sum_min_max
{
        public static void main(String [] args)
        {
            int a[] = {2,6,4,8,10};
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for (int i=0;i<a.length;i++)
            {
                int count=0;
                for (int j=i;j<a.length;j++)
                {
                        count += a[j];
                        max=Math.max(count,max);
                        min=Math.min(count,min);
                }

            }
            System.out.print(max+"  "+min);
         }
}
