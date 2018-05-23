package date_26_04_2018;
import java.util.Scanner;
public class binnery extends fill
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to search");
		int s=sc.nextInt();
		fill ob=new fill();
		ob.Fill();
		int l=ob.ar.length;
		int arr[]=ob.ar;
		int min=0,max=l-1;
		int f=0;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if (arr[mid]==s)
			{
				System.out.println("number found "+ s);
				f=1;
				break;
			}
			else if(s>arr[mid])
			{
				min=mid+1;
			}
			else
			{
				max=mid-1;
			}
			
		}
		if (f==0)
		{
			System.out.println("not found"+ s);
		}
	}
}