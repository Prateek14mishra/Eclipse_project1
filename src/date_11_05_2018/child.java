package date_11_05_2018;
import java.util.Scanner;
public class child extends parent
{
	Scanner abc= new Scanner(System.in);
	public static void main(String[] args)
	{
//		System.out.println("enter the number 1");
//		int a=abc.nextInt();
//		System.out.println("enter the number 2");
//		int b=abc.nextInt();
		parent ob= new child();
		ob.fill();
		ob.a=10;
		ob.b=20;
		
	}
}