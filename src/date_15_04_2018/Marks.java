package date_15_04_2018;
import java.util.Scanner;
class Marks
{
	public static void main(String arg[])
	{
		Scanner Sc= new Scanner(System.in);
		int m;
		System.out.println("Enter the Marks to find out the grades");
		m=Sc.nextInt();
		if( m>=90 )
		{
			System.out.println("A+");
		}
		else if(m>=80 && m<90)
		{
			System.out.println("A");
		}
		else if(m>=70 && m<80)
		{
			System.out.println("B");
		}
		else if(m>=60 && m<70)
		{
			System.out.println("C");
		}
		else if(m>=50 && m<60)
		{
			System.out.println("D");
		}
		else if(m>=40 && m<50)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
		}
	}
}