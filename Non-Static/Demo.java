class Demo
{
	public static void main(String[] args) 
	{
		System.out.println(" hello from main ()");
		Demo obj=new Demo();
		obj.m1();
	}

	public void m1()
	{
		System.out.println(" Hello From Demo m1()");
		Demo1 obj =new Demo1();
		obj.m2();
	}
}