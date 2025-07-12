public class water_trapping {
    public static void main(String[] args) {
        int a[]={0,2,0,3,2,5},count=0;
        for (int i = 1; i <a.length-1 ; i++)
        {
            int lmax=0,rmax=0;
            for (int j = 0; j <a.length ; j++)
            {
                if(j<=i)
                {
                    lmax=Math.max(a[j],lmax);
                }
                else
                {
                    rmax=Math.max(a[j],rmax);
                }
            }
            count=(Math.min(lmax,rmax)-a[i])+count;
        }
        System.out.print(count);
    }
}
