import java.util.*;
public class addtwo {
    public static void main(String args[])
    {
        int a,b,c;
        
        
        Scanner scan=new Scanner(System.in);
        System.out.flush();
        
        System.out.println("Enter a and b value");
        a=scan.nextInt();
        scan.nextLine();
        b=scan.nextInt();
        c=a+b;
        int e=a+b + a++ + b++ + ++a + ++b;
      int d= 100;
        d+=100;
        System.out.println("The value is "  +  c);
         System.out.println("The d value is "  +  d);
             System.out.println("The e value is "  +  e);
        scan.close();
    }
}