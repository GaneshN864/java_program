import java.util.*;
public class String_swap_without_symbol {
    public static void main(String[] args) {
        String s="hi@how#you";
        int first=0,last=s.length()-1;
        char c[]=s.toCharArray();
        for (int i = 0; i <=c.length/2 ; i++)
        {
            if(Character.isLetterOrDigit(c[first])&& Character.isLetterOrDigit(c[last]))
            {
                char temp=c[first];
                c[first]=c[last];
                c[last]=temp;
                first++;
                last--;
            }
            else if(!(Character.isLetterOrDigit(c[first]))&& !(Character.isLetterOrDigit(c[last])))
            {
               last--;
               first++;
            }

            else if (Character.isLetterOrDigit(c[first])) {
                last--;
            }
            else {
                first++;
            }
        }
        s=String.valueOf(c);
        System.out.println(s);
    }
}
