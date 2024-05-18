class Demo1
{
	String str ="Hi i am Global";

	void m1()
	{
		System.out.println("Hi from Demo1 m1()");
	}

	void add (int num1,int num2)
	{
		System.out.println("Addition is : "+(num1+num2));
	}

	static void m2()
	{
		System.out.println("Hi From Demo1 m2()");
	}

	void exeControl()
	{
		String str = "Hi i am local";
		this.add(20,10);
		this.m2();
		m1();
		System.out.println(str);
		System.out.println(this.str);
	}

	public static void main (String []args)
	{
		Demo1 obj=new Demo1();
		obj.exeControl();
	}
}