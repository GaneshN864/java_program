import java.util.Scanner;

public class elif {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int a=sc.nextInt();
        if(a==0)
        System.out.println("a is zero");
        else if(a>0)
            System.out.println("a is possitive");
        else
            System.out.println("a is negative");
    }
}

