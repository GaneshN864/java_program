import java.util.*;
public class pangram 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        int arr[]=new int[26];
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int x = c-'a';
            arr[x]=1;
        }
        int f=0;
        for(int i=0;i<26;i++){
            if(arr[i]==1){
                f=1;
            }
            else{
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.println("it is an pangram");
        }
        else{
            System.out.println("Not an pangram");
        }
        
    }
}
