public class methodinvoke{
     int len;
     int brt;
     //method without argument with parameter
     int vol(){
        int v=len*brt;
        return v;
     }
     public static void main(String[] args){
        methodinvoke me=new methodinvoke();
        me.len=10;
        me.brt=12;
        int c=me.vol();
        System.out.println("The Volume is "+c);

     }

}
