class Parent
{
	String str2="Hi from Parent class";
	void m1()
	{
		System.out.println("Hello from Parent m1()");
	}

	static void m3()
	{
		System.out.println("Hello from Parent m3() STATIC");
	}
}

class Child extends Parent
{
	String str1="Hi from Child class";

	void m2()
	{
		System.out.println("Hello from Child m2()");
		// System.out.println(str);
		// System.out.println(super.str);
	}

	static void m4()
	{
		System.out.println("Hello from Parent m4() STATIC");
	}
}

class inheritenceDriver 
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		System.out.println(obj.str1);
		System.out.println(obj.str2);
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
	
}