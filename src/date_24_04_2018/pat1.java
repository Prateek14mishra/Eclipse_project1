package date_24_04_2018;
public class pat1
{
	public static void main(String[] args)
	{
		int sp= 4;
		for(int i=1;i<=5;i++)
		{
			for (int j=sp;j>=1;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for (int m=i-1;m>=1;m--)
			{
				System.out.print(m);
			}	
			System.out.println();
			sp--;
		}
	}
}