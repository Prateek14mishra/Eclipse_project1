package date_26_04_2018;
import java.util.Scanner;
public class fill 
{
	Scanner sc= new Scanner(System.in);
	
	
	int ar[];
	void Fill()
	{
		int sz=sc.nextInt();
		ar=new int[sz];
		for (int i=0;i<sz;i++)
		{
			System.out.println("Input Number"+(i+1));
			ar[i]= sc.nextInt();
		}
	}
}