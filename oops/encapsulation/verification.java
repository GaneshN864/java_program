
package encapsulation;
import java.util.*;
class verificationprocess {
    static Scanner sc=new Scanner(System.in);
    private String name;
    private String email;
    private int age;
    private long contact;

    verificationprocess(String nname,String nemail,int nage,long ncontact)
    {
        name=nname;
        email=nemail;
        age=nage;
        contact=ncontact;
    }
    public String getname()
    {
        return name;
    }
    public String getemail()
    {
        return email;
    }
    public int getage()
    {
        return age;
    }
    public long getcontact()
    {
        return contact;
    }
    public void setName(String a)
    {
        if(validation())
        {
            System.out.print("Updatation of name : ");
            name=a;
            System.out.print("Successfully updated");
            System.out.println(name);
        }
        else
        {
            print();
        }

    }
    public void setemail(String a)
    {
        System.out.println("Updatation of email: ");
        if(validation())
        {
            email=a;
            System.out.print("Successfully updated");
            System.out.println(email);
        }
        else
        {
            print();
        }

    }
    public void setage(int a)
    {
        System.out.print("Updatation of age: ");
        if(validation())
        {
            age=a;
            System.out.print("Successfully updated");
            System.out.println(age);
        }
        else
        {
            print();
        }

    }


    public boolean validation()
    {
        System.out.print("Enter the registered contact number:");
        long ncontact=sc.nextLong();
        if(contact==ncontact)
        {
            int otp=new Random().nextInt(100000,999999);
            System.out.println("Your OTP is: "+otp );
            System.out.print("Enter the OTP");
            int uotp=sc.nextInt();
            if(otp==uotp)
            {
                return true;
            }
        }
        return false;
    }

    public void print()
    {
        System.out.println("Verification Failed..........");
    }
}



class verification
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        String name,email;
        int age;
        long contact;
        System.out.print("Enter Your Name: ");
        name=sc.nextLine();
        System.out.print("Enter Your Email: ");
        email=sc.nextLine();
        System.out.print("Enter Your age: ");
        age=sc.nextInt();
        System.out.print("Enter Your Contact: ");
        contact=sc.nextLong();
        verificationprocess v=new verificationprocess(name,email,age,contact);
        System.out.println(v.getname());
        System.out.println(v.getemail());
        System.out.println(v.getage());
        System.out.println(v.getcontact());
boolean flag=true;
do {
    System.out.println("Enter number if you want to do any modification in the details:");
    System.out.println("\t1-name\n\t2-email\n\t3.age\n\t4Exit");
    int option = sc.nextInt();
    switch (option) {
        case 1 -> {
            System.out.print("Enter the name to update: ");
            String uname = sc.nextLine();
            v.setName(uname);
            System.out.println("continoue upade press one:");
            if(1!=sc.nextInt())
            {
                flag=false;
            }
        }
        case 2 -> {
            System.out.print("Enter the email to update: ");
            String uname = sc.nextLine();
            v.setemail(uname);
        }
        case 3 -> {
            System.out.print("Enter the Age to update: ");
            int uname = sc.nextInt();
            v.setage(uname);
        }
        default -> {
            System.out.println(v.getname());
            System.out.println(v.getemail());
            System.out.println(v.getage());
            System.out.println(v.getcontact());
        }
    }
}while(flag);
    }
}