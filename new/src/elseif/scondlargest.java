import java.util.Scanner;

public class scondlargest {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A value");
        int a=sc.nextInt();
        System.out.println("Enter B value");
        int b=sc.nextInt();
        System.out.println("Enter C value");
        int c=sc.nextInt();
        if(((a>b)&&(a<c))||((a<b)&&(a>c)))
            System.out.println("A");
        else if(((b>a)&&(b<c))||((b<a)&&(b>c)))
            System.out.println("B");
        else
            System.out.println("C");
    }
}
