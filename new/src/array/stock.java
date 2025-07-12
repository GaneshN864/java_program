public class stock {
    public static void main(String[] args)
    {
        int a[]={7,1,5,3,6,4};

        int max=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
               int newmax=a[j]-a[i];
               if(max<newmax)
               {
                   max=newmax;
               }
            }
        }
        System.out.print(max);
    }
}
