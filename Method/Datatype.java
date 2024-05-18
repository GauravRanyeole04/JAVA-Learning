// class Example
// {
// 	public static void main(String[] args) 			//30
// 	{
// 		byte a=10;
// 		byte b=21;
// 		add(a,b);
// 	}

// 	public static void add(byte a ,byte b)
// 	{
// 		int add=a+b;
// 		System.out.print(add);
// 	}
// }

// class Example1 
// {
// 	public static void main(String []args )			//method add(byte,int) is already defined
// 	{
// 		byte a=10;
// 		add(a,20);
// 	}

// 	public static void add(byte a ,int b )
// 	{
// 		System.out.print("byte ,int");
// 	}

// 	public static void add(byte a ,int b )
// 	{
// 		System.out.print("byte ,int");
// 	}
// }

// class Example2 
// {
// 	public static void main(String []args )		//method add(byte,int) is already defined	
// 	{
// 		byte a=10;								//also when we give diff. Return type 
// 		add(a,20);
// 	}

// 	public static void add(byte a ,int b )
// 	{
// 		System.out.print("byte ,int");
// 	}

// 	public static int add(byte a ,int b )
// 	{
// 		System.out.print("byte ,int");
// 		return 0;
// 	}
// }

class Example3
{
	public static void main(String[] args)    // byte ,int 
	{
		byte a=10;
		byte b=20;
		add(a,b+0);
	}
	public static void add(byte a ,int b )
	{
		System.out.print("byte ,int");
	}
	public static void add(int a ,int b )
	{
		System.out.print("int ,int");
	}
}

class Example4 
{
	public static void main(String[] args)    //int 
	{
		int ch='A';
		demo(ch);
	}

	public static void demo(byte a)
	{
		System.out.print(" byte ");
	}

	public static void demo(short a)
	{
		System.out.print(" short ");
	}

	public static void demo(int a)
	{
		System.out.print(" int ");
	}
}

class Example5
{
	public static void main(String[] args)      //char
	{
		char ch='A';
		demo(ch);
	}

	public static void demo(byte a)
	{
		System.out.print(" byte ");
	}

	public static void demo(short a)
	{
		System.out.print(" short ");
	}

	public static void demo(int a)
	{
		System.out.print(" int ");
	}

	public static void demo(char a)
	{
		System.out.print(" char ");
	}
}

