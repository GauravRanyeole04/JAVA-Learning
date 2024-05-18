class Demo
{
	String str = " hi i am from demo class ";

	public static void main(String[] args) 
	{
		System.out.println(" Hi from Main()");
		Demo1 obj=new Demo1();
		obj.m1();

	}
}

class Demo1
{
	static Demo obj=new Demo();
	void m1()
	{
		System.out.println(" Hi from m1()");
		System.out.println(obj.str);
		m2();

	}

	void m2()
	{
		System.out.println(" hi from m2()");
		System.out.println(obj.str);
		m3();
	}

	static void m3()
	{
		System.out.println(" hi from m3()");
		System.out.println(obj.str);
	}
}