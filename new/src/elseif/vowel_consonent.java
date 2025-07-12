import java.util.Scanner;

public class vowel_consonent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if((a=='a')||(a=='E')||(a=='I')||(a=='O')||(a=='U')||(a=='A')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
            System.out.println("Vowels");
        else
            System.out.println("Consonant");
    }
}
