package multi_dimensional_array;

import java.util.Scanner;

public class identity_matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the row :");
        int r = sc.nextInt();
        System.out.print("Enter the columns :");
        int c = sc.nextInt();
        create(r, c);
    }

    public static void create(int r, int c) {
        int a[][] = new int[r][c];
        System.out.println("Enter the values");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        identity(a);
    }
//    public static void identity(int a[][])
//    {
//        int i;
//        outer:
//        for (i = 0; i <a.length ; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (i == j && a[i][j] == 1) {
//                    break outer;
//                } else if (i != j && a[i][j] == 0) {
//                    break outer;
//                }
//            }
//        }
//            if(i==a.length)
//            {
//                System.out.print("not Identity");
//            }
//            else
//            {
//                System.out.print("Identity");
//            }
//
//    }
public static void identity(int a[][]) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
                System.out.println("Not Identity");
                return;
            }
        }
    }
    System.out.println("Identity");
}

}