package date_09_05_2018;
import java.util.Scanner;
public class multi_arrey 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("enter the size of the arrey");
		//int sz=sc.nextInt();
		int a[][]=new int[2][3];
		int b[][]=new int[3][2];
		int c[][]=new int[2][2];
		for (int i=0;i<2;i++)
		{
			System.out.println("Enter the number in the first arrey");
			for (int j=0;j<3;j++)
			{
				System.out.println("enter the number in arrey A postion of "+i+"*"+j+" the arrey");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.println("enter the number in arrey B postion of "+i+"*"+j+" the arrey");
				b[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				c[i][j]=0;
			}
		}
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				for (int k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"    ");
			}
			System.out.println();
		}
	}
}
