package multi_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class transpose_matrix {
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
        trans(a);
    }
    public static void trans(int a[][])
    {
        int[][] trans=new int[a[0].length][a.length];
        for (int i = 0; i <a[0].length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                trans[j][i]=a[i][j];
            }

        }
        for (int i = 0; i <trans.length ; i++) {
            System.out.println(Arrays.toString(trans[i]));
        }

    }
}