class MyInfo   //getter,setter
{
	private String name,nativePlace,branch;
	MyInfo(String name,String nativePlace,String branch)
	{
		this.name=name;
		this.nativePlace=nativePlace;
		this.branch=branch;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String uName)
	{
		name=uName;
	}

	public String getnativePlace()
	{
		return nativePlace;
	}
	public void setNativePlace(String uNativePlace)
	{
		nativePlace=uNativePlace;
	}

	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String uBranch)
	{
		branch=uBranch;
	}
}


class MyInfoDriver 
{
	public static void main(String[] args) 
	{
		MyInfo obj=new MyInfo("Gaurav","Chh.Sambhajinagar","CSE");

		// System.out.println(obj.getName());
		obj.setName("Sunny");
		System.out.println(obj.getName());

		// System.out.println(obj.getnativePlace());
		obj.setNativePlace("Chatrapati Sambhji Maharaj Nagar");
		System.out.println(obj.getnativePlace());

		// System.out.println(obj.getBranch());
		obj.setBranch("Aeronautical Engineering");
		System.out.println(obj.getBranch());
	}
}