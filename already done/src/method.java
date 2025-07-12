public class method{
    static int add(int a, int b){
        int c;
        c=a+b;
        return c;
    
    }
    int sub(int a, int b){
        int d;
        d=a-b;
        return d;
    
    }
    
    public static void main(String[] args) {

        int d=add(12,23);
        System.out.println(d);

        method m=new method();
        int f=m.sub(12,23);
        System.out.println(f);
    }
}