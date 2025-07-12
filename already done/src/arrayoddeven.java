import java.util.Scanner;

public class arrayoddeven {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int len=sc.nextInt();
        sc.nextLine();
        int a[]=new int[len];
        System.out.println("Enter array values");
        for (int i = 0; i < len; i++) 
        {
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        int odd=0,even=0;
        for (int i = 0; i < len; i++) 
        {
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("The odd count is " +odd +"\n" +"The Even count is " +even );
    
    }
}
