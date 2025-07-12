import java.util.*;
abstract class shapes
{
    abstract void area();
    Scanner scan=new Scanner(System.in);
    int ar;
    void print()
    {
      System.out.println(ar);
    }
   

}
class rec extends shapes
{
    void area()
    {
        System.out.println("Enter the length and breath");
        int l=scan.nextInt();
        scan.nextLine();
        int b=scan.nextInt();
        ar=l * b;
        print();
       
    }
}
class cir extends shapes
{
    void area()
    {
        System.out.println("Enter the radius ");
        int r=scan.nextInt();
        scan.nextLine();
        ar= r*r;
        print();
    }
}



public class abstra
{
    public static void main(String[] args) {
        shapes[] s=new shapes[3];
        s[0]=new rec();
        s[1]=new cir();
        s[2]=new cir();

        s[0].area();
        s[1].area();
        s[2].area();

        
    }
}

