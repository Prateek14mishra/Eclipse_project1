package date_15_04_2018;
import java.util.Scanner;
public class cal
{
	Scanner sc= new Scanner(System.in);
	int a,b,r=0;
 	void add()
 	{
 		System.out.println("enter number 1 to Add");
		a=sc.nextInt();
		System.out.println("enter number 2 to Add");
		b=sc.nextInt();
		r=a+b;
		System.out.println("Sum ="+r);
 	}
 	void sub()
 	{
 		System.out.println("enter number 1 to Sub");
		a=sc.nextInt();
		System.out.println("enter number 2 to Sub");
		b=sc.nextInt();
		r=a-b;
		System.out.println("Result ="+r);
 	}
 	void multi()
 	{
		System.out.println("enter number 1 to Multiply");
		a=sc.nextInt();
		System.out.println("enter number 2 to multiply");
		b=sc.nextInt();
		r=a*b;
		System.out.println("Result ="+r);
 	}
 	void divide()
 	{		
 		System.out.println("enter number 1 to Divide");
		a=sc.nextInt();
		System.out.println("enter number 2 to Divide");
		b=sc.nextInt();
		r=a/b;
		System.out.println("Result ="+r);
 	}
}