public class array_simple {
    public static void main(String[] args) {
        int a[]={2,6,4,8,10};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print(a[i]+""+a[j]+"  ");
            }
            System.out.println();
        }
    }
}
