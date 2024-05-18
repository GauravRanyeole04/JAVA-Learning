class Variable1
{
public static void main(String[]args)
	{
	int a=10;
	int b=a;
	System.out.println(a);
	System.out.println(b);
	}
}


class Variable2
{
public static void main (String[]args)
	{
		String a ="local ver fro method block";
		if(true)
		{
		String b ="lv from 1st if block";
		System.out.println(b);
		System.out.println(a);
		}
			if (true)
			{
			int c =10;
			System.out.println(c);
			System.out.println(a);
			//System.out.println(b);
			}
	}
}

class VariableEx
{
public static void main(String[]args)
	{
		int a;
		int b;
		if(true)
		{
		a=30;
		}
		else
		{
		b=20; System.out.println(b);
		}
		System.out.println("a="+a);
		
	}
}



class Variable3
{
		static int a=10;
		public static void main(String[]args)
	{
		System.out.println(a);
		if(true)
		{
		System.out.println(a);
		}
		if(true)
		{
		System.out.println(a);
		m1();
		}
	}
		public static void m1()
			{
			System.out.println(a);
			
			}
}

class Variable4
{
static Byte a;
static short b;
static int c;
static long d;
static float e;
static double f;
static char g;
static boolean h;
static String i;

	public static void main (String[]args)
{
System.out.println("byte = "+a);
System.out.println("short = "+b);
System.out.println("int = "+c);
System.out.println("long = "+d);
System.out.println("float = "+e);
System.out.println("double = "+f);
System.out.println("char = "+g);
System.out.println("boolean = "+h);
System.out.println("String = "+i);
}
}

class Sunnybaba
{
static short a=10;
public static void main(String[]args)
	{
	System.out.println(a);
	}
}































