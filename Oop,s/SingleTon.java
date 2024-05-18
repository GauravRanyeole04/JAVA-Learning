class Singleton    //single obj created 
{
	String name;
	String branch;
	private static Singleton object;

	private Singleton(String name,String branch)
	{
		this.name=name ;
		this.branch=branch;
	}
	public static Singleton getInstance(String name,String branch)
	{
		if (object==null)
		{
			object=new Singleton(name,branch);
			return object;
		}else{
			return object;
		}
	}

	public static void main(String[] args) 
	{
		Singleton obj=getInstance("Gaurav","CSE");
		System.out.println(obj.name);
		Singleton obj1=getInstance("Sunny","CSE");
		System.out.println(obj1.name);
	}
}