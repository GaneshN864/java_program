package admin.ganesh.day2;

import java.util.Scanner;

public class addenw {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
	    System.out.println("Enter the value of a and b");
	    Scanner scan=new Scanner(System.in);
	    a=scan.nextInt();
	    scan.nextLine();
	    b=scan.nextInt();
		int[] c=new int[5] ;
		for(int i=0;i<=4;i++)
		{
			switch (i) {

		case 0:	
	    c[i]=a+b;
	    System.out.println("The added value is " + c[i]);
		break;
		case 1:
		c[i]=a-b;
	    System.out.println("The sub value is " + c[i]);
		break;
		case 2:
		c[i]=a*b;
	    System.out.println("The mul value is " + c[i]);
		break;
		case 3:
		c[i]=a/b;
	    System.out.println("The div value is " + c[i]);
		break;
		case 4:
		c[i]=a%b;
	    System.out.println("The mod value is " + c[i]);
		break;
		}
	}
	}


}
