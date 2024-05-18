class This
{
	This ()
	{
		this(10);
		System.out.println("()");
	}
	This(int a)
	{
		this("gaurav");
		System.out.println("int a");
	}
	This(String b)
	{
		this(68,"Gaurav");
		System.out.println("string b");
	}

	This(int a, String b)
	{
		System.out.println("int a, String b ");
	}

	public static void main(String[] args) 
	{
		This a=new This();
	}
} 