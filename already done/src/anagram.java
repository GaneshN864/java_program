import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the string 2: ");
        String s2 = sc.nextLine();
        String x1 = s1.replaceAll("\\s", "").toLowerCase();
        String x2 = s2.replaceAll("\\s", "").toLowerCase();
        char[] c1 = x1.toCharArray();
        char[] c2 = x2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
