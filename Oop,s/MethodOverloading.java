class MethodOverloading
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.add(10,20,30,40);
	}
}

class Gaurav 
{
	public void gretting()
	{
		System.out.println("Good Morning");
	}
}

class Sunny extends Gaurav
{
	public void gretting()
	{
		System.out.println("Good Afternoon");
	}
	public static void main(String[] args) 
	{
		Sunny obj=new Sunny();
		obj.gretting();
	}
}

class Example 
{
	public void m1(int a)
	{
		System.out.println("hello");
	}
	public void m1(byte b)
	{
		System.out.println("hii");
	}

	public static void main(String[] args) 
	{
		Example obj=new Example();
		obj.m1((byte)2);
	}

}