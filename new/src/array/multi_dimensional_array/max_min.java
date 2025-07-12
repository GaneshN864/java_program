package multi_dimensional_array;

public class max_min {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int a[][]={{-1,2,4},{23,45,67},{1,2,3}};
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                max = Math.max(max, a[i][j]);
                min = Math.min(min, a[i][j]);
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
    }
}
