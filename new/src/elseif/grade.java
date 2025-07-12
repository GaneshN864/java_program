import java.util.Scanner;

public class grade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        if(p<=50)
            System.out.println("sorry, you are Fail💔");
        else if(p>=91&&p<=100)
            System.out.println("A");
        else if (p>=81&&p<91)
        {
            System.out.println("B");
        }
        else if(p>=71&&p<81)
            System.out.println("C");
        else if(p>=61&&p<71)
            System.out.println("D");
        else if(p>=51&&p<61)
            System.out.println("E");
        else
            System.out.println("enter the percentage between 0 to 100");

    }
}
