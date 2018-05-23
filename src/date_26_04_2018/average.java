package date_26_04_2018;
import java.util.Scanner;
public class average
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int ar[]= new int[10],s=0;
		double arg1=0;
		System.out.println("Input 10 Number to find the Average");
		for (int i=0;i<10;i++)
		{
			System.out.println("Input Number"+(i+1));
			ar[i]= sc.nextInt();
			s+=ar[i];
		}
		arg1=(double)s/10;
		System.out.println("Average = "+ arg1);
	}
}
