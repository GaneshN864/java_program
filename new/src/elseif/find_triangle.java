import java.util.*;
public class find_triangle {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the len 1: ");
            int a= sc.nextInt();
            System.out.print("Enter the len 2: ");
            int b= sc.nextInt();
            System.out.print("Enter the len 3: ");
            int c= sc.nextInt();
            if((a==b)&&(b==c))
                System.out.println("Equilateral triangle");
            else if((a==b)||(b==c)||(a==c))
                System.out.println("Isosceles triangle");
            else
                System.out.println("Scalene triangle");


        }

}
