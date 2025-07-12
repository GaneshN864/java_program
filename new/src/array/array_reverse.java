import java.util.Arrays;

public class array_reverse {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b=a.length/2,end=a.length-1;

        for(int i=0;i<b;i++,end--)
        {
            int temp=a[i];
            a[i]=a[end];
            a[end]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
