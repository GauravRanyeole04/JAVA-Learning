class Ramesh 
{
	public static void gretting ()
	{
		System.out.println("Good Morning");
	}
}
class Suresh extends Ramesh 
{
	public static void gretting ()
	{
		System.out.println("Good Afternoon");
	} 
}
class MethodShadowing 
{
	public static void main(String[] args) 
	{
		Suresh obj = new Suresh();
		obj.gretting();
	}
}

class Parent 
{
	public static Object m1()
	{
		System.out.println("gaurav");
		return null;
	}
}
class Child extends Parent
{
	public static String m1()
	{
		System.out.println("Sunny");
		return null;
	}
}
class ParentChild 
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m1();
	}
}