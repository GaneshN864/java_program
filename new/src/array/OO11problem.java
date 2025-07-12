import java.util.Arrays;

public class OO11problem {
    public static void main(String []args)
    {
        int a[]={0,1,0,1,1,0};
        int b[]=new int[a.length];
        Arrays.fill(b,1);
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count++;
            }

        }
        for(int j=0;j<count;j++)
        {
            b[j]=0;
        }
        System.out.print(Arrays.toString(b));
    }
}
