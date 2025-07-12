
public class dynamicbinbing {
    public static void main(String[] args) 
    {
        vehi v=new car();
        mecha m=new mecha();
        m.display(v); 
    }
    
}
class vehi{
    void ride()
    {
        System.out.println("Vehi");
    }
}
class car extends vehi{
    
   public void ride()
    {
        System.out.println("car");
    }
}
class mecha{
    void display(vehi v)
    {
        v.ride();
    }
}