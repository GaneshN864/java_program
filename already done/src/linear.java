import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[]={1,2,3,4,5};
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int result = linearSearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
            System.out.println("position of the element: " + (result+1));
        }
    }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1;  
    }
}
