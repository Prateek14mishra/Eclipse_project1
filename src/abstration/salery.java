package abstration; 

public class salery extends employee
{
	private double sallery;
	public double getSalery() {
		return sallery;
		
	}

	public void setSalery(double sallery) {
		if(sallery<=0.0)
		{
		this.sallery = sallery;
		}
	}
	salery (String name,String address,String mobile,double sallery){
		super(name,address,mobile);
		this.sallery=sallery;
	}
	public void details ()
	{
		System.out.println("user derails");
		System.out.println("employee name:-"+ getHome());
		System.out.println("employee address:-"+ getAddress());
		System.out.println("employee mobile:-"+ getMobile());
		System.out.println("employee salery:-"+ getSalery());
	}
}
