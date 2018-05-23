package date_09_05_2018;

import java.util.Scanner;

public class magic {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the arrey");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				arr[i][j]=0;
			}
			//System.out.print("1");
		}		
		if(n%2!=0)
		{
			int i,j,k;
			i=0;
			j=n/2;
			k=1;
			while(k<=(n*n))
			{
				
				arr[i][j]=k++;
				i--;
				j++;
				if(i<0  &&  j>n-1)
				{
					i+=2;
					j--;
					//System.out.print("1");
				}
				if(i<0) 
				{
					i=n-1;
				//System.out.print("2");
				}
			
				if(j>n-1)
				{
					j=0;
					//System.out.print("3");
				}
				if(arr[i][j]!=0)
				{
					i+=2;
					j--;
					//System.out.print("4");
				}
		
			}
		}
	}
}
	
