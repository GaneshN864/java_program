import java.util.Scanner;
public class nearby10{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=scan.nextInt();
        int b=a%10;
        a=a-b;
        System.out.println("\"The nearby value of ten is\" " + a);
         System.out.println("The nearby value of ten is" + a );
    }
}