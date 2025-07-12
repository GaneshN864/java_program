public class number1to4 {
    public static void main(String []args)
    {
        int a=5,b=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(b++);
                if(b==5)
                    b=1;
            }
            System.out.println();
        }
    }
}
