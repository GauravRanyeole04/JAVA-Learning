class Info 
{
	String name ;
	String batch;
	int yop;

	Info()
	{
		super();
		System.out.println("Gaurav ");// this will execute first 
	}


	void myInfo()
	{
		System.out.println(" Name : "+name);
		System.out.println("Batch : "+batch);
		System.out.println("Year Of Passout : "+yop);
	}
}

class InfoDriver
{
	public static void main(String[] args) 
	{
		Info obj=new Info();
		obj.myInfo();
	}
}