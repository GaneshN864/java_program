package multi_dimensional_array;

import java.util.Arrays;

public class ADD_TWO_ARRAYS {
    public static void main(String[] args) {
        int a[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int b[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int c[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }

        }
        for (int i = 0; i < a.length; i++)
            System.out.print(Arrays.toString(c[i]));
    }
}