public class constructor1{
    int c,d;
    public constructor1(int a,int b){
       c=a;
       d=b;  
       System.out.println(a);  
       }

       void ab() {
        int a=10;
        System.out.println(a);
       }
       
       

        public static void main(String[] args) {
            constructor1 con=new constructor1(2,2);
            con.ab();
            System.out.printf("%d %d" , con.c  ,con.d);
        }
}