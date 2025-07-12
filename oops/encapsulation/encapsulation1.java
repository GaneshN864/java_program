package encapsulation;

public class encapsulation1 {
    public static void main(String[] args) {
        encapsulation2 en=new encapsulation2();
//        System.out.println(en.a);   because private cannot access in another method in directly
        System.out.println(en.b);
        int a=en.getnumber(); // indirect method to get the value in private method
        System.out.println(a);

        en.setnumber(30);
        a=en.getnumber(); // indirect method to SET the value in private method
        System.out.println(a);
    }
}
