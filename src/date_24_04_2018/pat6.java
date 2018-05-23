package date_24_04_2018;

public class pat6
{
	public static void main(String[] args)
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int m=i;m>=1;m--)
			{
				if(m%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			System.out.println("");
		}
	}
}