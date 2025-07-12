import java.sql.SQLOutput;
import java.util.Scanner;

public class divisible_2_and_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a=sc.nextInt();
        if(a%2==0 && a%3==0)
            System.out.println("A is divisible by both 2 and 3");
        else if(a%2==0)
            System.out.println("A is divisible by 2");
        else if(a%3==0)
            System.out.println("A is divisible by 3");
        else
            System.out.println("Number is not divisible by 2 and 3");

    }
}
