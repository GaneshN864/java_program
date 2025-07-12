public class pangram {
    public static void main(String[] args) {
        boolean a[]=new boolean[26];
        String s="The Quick Brown Fox Jumps over the lazy dog";
        s=s.toLowerCase();
        if(pangram(a,s))
        {
            System.out.println("Pangram");
        }
        else
            System.out.println("Not Pangram");
    }
    public static boolean pangram(boolean[] a, String s)
    {
        char c[]=s.toCharArray();

        for (int i = 0; i <c.length ; i++)
        {
            if(c[i]!=' ')
                a[c[i]-97]=true;
        }
        for (int i = 0; i <a.length ; i++)
        {
            if(!a[i])
                return false;
        }
        return true;
    }
}
