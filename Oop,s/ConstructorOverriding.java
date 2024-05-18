class ConstructorOverriding
{
	ConstructorOverriding()
	{
		System.out.println("No args");
	}
	ConstructorOverriding(int a)
	{
		System.out.println("1 args");
	}
	ConstructorOverriding(int a,int b)
	{
		System.out.println("2 args");
	}

	public static void main(String[] args) 
	{
		ConstructorOverriding obj = new ConstructorOverriding(10,5);
	}
}

class Gaurav 
{
	Gaurav()
	{
		System.out.println("hello");
	}
	public void m1()
	{
		System.out.println("Gaurav");
	}
}

class Sunny extends Gaurav
{
	Sunny()
	{
		System.out.println("heeii");
	}

	void Gaurav(int a)
	{
		System.out.println("int a");
	}

	public  void m1()
	{
		System.out.println("byee");
	}
	 public static void main(String[] args) 
	 {
	 	Sunny obj = new Sunny();
	 	obj.m1();
	 }
}

// class ConstructorOverriding1 
// {
// 	public ConstructorOverriding1()
// 	{
// 		//CTE 
// 	}

// 	private ConstructorOverriding1()
// 	{
// 		//CTE
// 	}
// }