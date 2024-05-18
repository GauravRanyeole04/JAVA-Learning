class IfStatement 
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");	
		if (true)
		{
			System.out.println(" Hello From If Block");
		}
		System.out.print(" Execution End");
	}
}

class IfStatement1
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");
		if(false)
		{
			System.out.println(" Hello From If Block ");
		}
		System.out.println(" Execution End");
	}
}

class IfStatement2
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");
		final boolean b = false;
		if(b)
		{
			System.out.println(" Hello From If Block ");
		}
		System.out.println(" Execution End");
	}
}

class IfStatement3
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");
		if(false)
			System.out.println(" Execution Start From If Block");
		System.out.println(" Execution End");
	}
}

class IfStatement4				
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");
		int a;
		if(true)
		 a=10;
		System.out.println(" Hello From If Block ");
		System.out.println(" Execution End "+a);
	}
}

class IfStatement5              //CTE
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");
		if(false)
		//int a=10;
		System.out.println(" Hello From If Block ");
		//System.out.println(" Execution End"+a);	
	}
}

class IfStatement6               //CTE
{
	public static void main(String[] args) 
	{
		System.out.println(" Execution Start");
		if(true)
		//int a=10;
		System.out.println(" Hello From If Block ");
		//System.out.println(" Execution End"+a);	
	}
}

class ExampleIf
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("Hello");
		if (true)
			//int LocalVariable=20;
		//System.out.print(LocalVariable);
		System.out.println(a);
		System.out.print("BYE");
	}
}

