package date_24_04_2018;
public class pat2
{
	public static void main(String[] args)
	{
		int sp= 3;
		for(int i=1;i<=4;i++)
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