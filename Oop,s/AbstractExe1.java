abstract class Parent 
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("m3() imp from Parent");
	}
}

abstract class Child1 extends Parent
{
	void m2()
	{
		System.out.println("m2() imp from Child 1");
	}
	abstract void m4();
}

class SubChild extends Child1
{
	void m1()
	{
		System.out.println("m1() imp from SubChild");
	}
	void m4()
	{
		System.out.println("m4() imp from SubChild");
	}
}

class Child2 extends Parent
{
	void m1()
	{
		System.out.println();
		System.out.println("m1() imp from Child 2");
	}

	void m2()
	{
		System.out.println("m2() imp from child 2 ");
	}
	void m5()
	{
		System.out.println("m5() imp from child 2");
	}
}

class AbstractExe1Driver 
{
	public static void main(String[] args) 
	{
		SubChild obj = new SubChild();
		System.out.println();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

		Child2 obj1 = new Child2();
		obj1.m1();
		obj1.m2();
		obj1.m5();
		obj1.m3();

	}
}