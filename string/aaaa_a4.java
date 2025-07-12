public class aaaa_a4 {
    public static void main(String[] args) {
        String a="aaaabbbbcccddddaa";
        char c[]=a.toCharArray();
        int count=1;
        for (int i = 0; i <c.length-1 ; i++)
        {
            if(c[i]==c[i+1])
            {
                count++;
            }
            else
            {
                System.out.println(c[i]+" "+count);
                count=1;
            }
        }
        System.out.println(c[c.length-1]+" "+count);
    }
}
