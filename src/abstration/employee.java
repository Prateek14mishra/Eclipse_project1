package abstration;

public abstract class employee
{
		@Override
	public String toString()
		{
		return "employee [home=" + home + ", address=" + address + ", mobile=" + mobile + "]";
	}

		private String home,address,mobile;

		public String getHome()
		{
			return home;
		}

		public void setHome(String home)
		{
			this.home = home;
		}

		public String getAddress()
		{
			return address;
		}

		public void setAddress(String address)
		{
			this.address = address;
		}

		public String getMobile()
		{
			return mobile;
		}

		public void setMobile(String mobile)
		{
			this.mobile = mobile;
		}

		public employee(String home, String address, String mobile)
		{
			System.out.println("construtor of Employee");
			this.home = home;
			this.address = address;
			this.mobile = mobile;
		}
		public void details ()
		{
			System.out.println("user derails");
			System.out.println("employee name:-"+ getHome());
			System.out.println("employee address:-"+ getAddress());
			System.out.println("employee mobile:-"+ getMobile());
			//System.out.println("employee salery:-"+ getSalery());
		}
	
}