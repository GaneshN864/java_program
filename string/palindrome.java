public class palindrome {
    public static void main(String[] args) {
        String str="abba"; //"" "a" is also a palindrome
        int i=0,j=str.length()-1;
        while (i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                System.out.print("Not a palindrome");
                break;
            }
        }
        if(j<=i)
        {
            System.out.println("Palindrome");
        }
    }
}
