import java.util.Scanner;

public class addnew {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter the value of a and b");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        
        int[] c = new int[5];
        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:	
                    c[i] = a + b;
                    System.out.println("The added value is " + c[i]);
                    break;
                case 1:
                    c[i] = a - b;
                    System.out.println("The subtracted value is " + c[i]);
                    break;
                case 2:
                    c[i] = a * b;
                    System.out.println("The multiplied value is " + c[i]);
                    break;
                case 3:
                    if (b != 0) {
                        c[i] = a / b;
                        System.out.println("The divided value is " + c[i]);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 4:
                    if (b != 0) {
                        c[i] = a % b;
                        System.out.println("The modulus value is " + c[i]);
                    } else {
                        System.out.println("Modulus by zero is not allowed.");
                    }
                    break;
            }
        }
        
        scan.close();
    }
}
