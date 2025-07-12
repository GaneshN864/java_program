import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1="race",s2="cae";
        s1.trim();
        s2.trim();
        char[] c1=s1.toCharArray(),c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        {
            System.out.println("anaGram");
        }
        else
        {
            System.out.println("Not a anagram");
        }

    }
}
