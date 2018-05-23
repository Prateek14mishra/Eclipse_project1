package date_26_04_2018;
import java.util.Scanner;
public class sum
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the arrey");
		int sz=sc.nextInt();
		int ar[]= new int[sz];
		int s=0;
		for (int i=0;i<sz;i++)
		{
			System.out.println("Input Number"+(i+1));
			ar[i]= sc.nextInt();
			s+=ar[i];
		}
			System.out.println("Sum ="+ s);
	}
}
