public class even_no_sum {
    public static void main(String[] args)
    {
        int a[]=new int[]{2,3,4,5,6,7,6};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
