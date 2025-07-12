import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class example {

//    static void eg()
//    {
//        int a=20;
//        System.out.println(a);
//    }
//    int a;
//
    static int a;
    static
    {
        System.out.println("HI hello");
    }
    static
    {
        System.out.println(a);
        System.out.println("HI hello");
    }
    public static void main(String[] args)
    {
        int a=10;
        System.out.println(a);
        System.out.println("Main");

//        int a=10;
//        eg();
//        System.out.println(a);


//        String s="123";
//        long a=Integer.valueOf(s);
//        String s1=Long.toString(a);
//
//        char c[]={'a','b','c'};
//        String s2=String.valueOf(c);
//        System.out.println(s2);
//        System.out.println(s2.charAt(0));
//        System.out.println(Character.isDigit(s1.charAt(1)));

//        ArrayList<Integer> a=new ArrayList<>();
//
//        a.add(100);
//        a.add(200);
//        System.out.println(a);
//        System.out.println(a.get(1));
//        a.remove(0);
//        System.out.println(a);
//        System.out.println(a.get(0));



//        int a[]={1,2};
//        String str=Arrays.toString(a);
//        a[1]=34;
//        for (int i = 0; i <a.length ; i++) {
//            System.out.print(a[i]);
//        }
//        System.out.println(str);
////
////        Integer num=new Integer(59);
////        Integer num2=new Integer(59);
////        System.out.println(num==num2);
////        System.out.println(num.equals(num2));
//
////
////        int a[]={1,2,3};
////        int b[]={1,2,3};
////        System.out.println(a==b);
////        System.out.print(Arrays.equals(a,b));
//
//
////        example a=new example();
////        example e1=new example();
////        a.a=10;
////        e1.a=10;
////        System.out.println(a.a==e1.a);
////        System.out.println(Objects.equals(a.a, e1.a));
//
//
////        int a[]={0,0};
////        int b[]=a;
////        a[1]=2;
////        System.out.println(b[1]);
////
////
////        int c[]={0,0};
////        int d[]= Arrays.copyOf(c,c.length);
////        c[1]=2;
////        System.out.println(d[1]);
////
////
////        int e[]={1,2,3};
////        int f[]={1,2,3};
////        e[2]=10;
////        System.out.println(f[2]);
////
////
////        String name="name";
////        String bname=name;
////        name="ganesh";
////        System.out.println(name);
////        System.out.println(bname);
//
////
////        String name1="ganesh";
////        String name2="ganesh";
////        String name3=name1;
////        System.out.println(name1==name2);
////        System.out.println(name2==name3);
////        name1="dinesh";
////        System.out.println(name1==name2);
////
////
////        String one=new String("Ganesh");
////        String second=new String("Ganesh");
////        System.out.println(one==second);
////        System.out.print(one.equals(second));
    }
}
