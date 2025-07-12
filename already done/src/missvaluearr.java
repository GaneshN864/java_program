// import java.util.*;
public class missvaluearr
{
    public static void main(String[] args)
    {
        int[] a={0,1,3,4,5};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=i)
            {
                System.out.println(i);
                break;
            }
        }
    }
}