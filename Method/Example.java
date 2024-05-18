class Example
{
	public static void main(String[] args) 
	{
		System.out.println(" Hello from Main");
		m3();
		System.out.println(" Bye From Main ");
	}

	public static void m1()
	{
		System.out.println(" Hello from M1");
		m2();
		System.out.println(" Bye From M1 ");
	}

	public static void m2()
	{
		System.out.println(" Hello from M2");
		System.out.println(" Bye From M2 ");
	}

	public static void m3()
	{
		System.out.println(" Hello from M3");
		System.out.println(" Bye From M3 ");
		m1();
	}
}