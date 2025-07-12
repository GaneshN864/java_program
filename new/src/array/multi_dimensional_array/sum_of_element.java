package multi_dimensional_array;

public class sum_of_element {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                sum+=a[i][j];
            }

        }
        System.out.println(sum);
    }
}
