package date_15_04_2018;

import java.util.Scanner;
public class Greater
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Input 2 Number to find the greater Number");
		System.out.println("Input Number 1");
		a= sc.nextInt();
		System.out.println("Input Number 2");
		b= sc.nextInt();
		if( a>b )
		{
			System.out.println(a+" is greater than "+ b);
		}
		else if(a==b)
		{
			System.out.println(a+" is equal to "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+ a);
		}
	}
}