package date_26_04_2018;
import java.util.Scanner;
public class find
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the arrey");
		int sz=sc.nextInt();
		int ar[]= new int[sz],f=0;
		System.out.println("Input Number to find");
		int s= sc.nextInt();
		for (int i=0;i<sz;i++)
		{
			if(ar[i]==s)
			{
				System.out.println("number found"+ s);
				f=1;
				break;
			}
			if (f==0)
			{
				System.out.println("not found"+ s);
			}
		}
	}
}
