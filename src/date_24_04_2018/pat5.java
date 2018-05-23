package date_24_04_2018;

public class pat5
{
	public static void main(String[] args)
	{
		int sp=0;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<=sp;k++)
			{
				System.out.print("-");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println("");
			sp+=2;
		}
		sp=6;
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<=sp;k++)
			{
				System.out.print("-");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println("");
			sp-=2;
		}
	}
}