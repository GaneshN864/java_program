import java.util.*;
public class find_largest_no {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value 1:");
        int a=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the value 2:");
        int b=sc.nextInt();
        find(a,b);
        find(10,20);

    }
    public static void find(int a,int b)
    {
        System.out.println((a>b)?"a is greater":"B is greater");
    }
}
