package encapsulation;

public class example {
    static int a;
    static
    {
        System.out.println(a);
        a=200;
        System.out.println(a);
    }

    {
        System.out.print(a);
    }
    public void ex()
    {
        int a=20;
        a=30;
        System.out.println(a);
    }
    public void ex1()
    {
        System.out.println(a);
    }
    {

        System.out.print(a);
    }

    public static void main(String[] args) {
        example e=new example();
        e.ex();
        e.ex1();
    }
}
