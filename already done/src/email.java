import java.util.Scanner;
public class email{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.flush();

        System.out.println("Enter your name");
        String str=s.nextLine();

        System.out.println("Enter your Email");
        String em=s.nextLine();

        System.out.println("Enter your Phone no");
        String st=s.nextLine();

        System.out.println(str +em  +st);
        s.close();
    }
}
