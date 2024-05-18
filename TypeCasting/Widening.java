class ByteExe
{
	public static void main(String[] args) 
	{
		byte a=1;
		short b=a;
		int c=a;
		long d=a;
		float e=a;
		double f=a;
		// char g=a; //CTE (PLC BYTE TO CHAR)
	}
}

class ShortExe
{
	public static void main(String[] args) 
	{
		short a=1;
		// byte b=a;  //CTE (PLC SHORT TO BYTE)
		int c=a;
		long d=a;
		float e=a;
		double f=a;
		// char g=a; //CTE (PLC SHORT TO CHAR)
	}
}

class IntExe
{
	public static void main(String[] args) 
	{
		int a=1;
		// byte b=a;  //CTE (PLC SHORT TO BYTE)
		// short c=a; //CTE (PLC INT TO SHORT)
		long d=a;
		float e=a;
		double f=a;
		// char g=a; //CTE (PLC SHORT TO CHAR)
	}
}

class longExe
{
	public static void main(String[] args) 
	{
		long a=1;
		// byte b=a;  //CTE (PLC LONG TO BYTE)
		// short c=a; //CTE (PLC LONG TO SHORT)
		// int d=a; //CTE (PLC LONG TO INT) 
		float e=a;
		// double f=a;
		// char g=a; //CTE (PLC LONG TO CHAR)
	}
}

class FloatExe
{
	public static void main(String[] args) 
	{
		float a=1;
		// byte b=a;  //CTE (PLC FLOAT TO BYTE)
		// short c=a; //CTE (PLC FLOAT TO SHORT)
		// int d=a; //CTE (PLC FLONGTO INT) 
		// long e=a; //CTE (PLC FLOAT TO LONG)
		double f=a;
		// char g=a; //CTE (PLC FLOAT TO CHAR)
	}
}

class DoubleExe 
{
	public static void main(String[] args) 
	{
		double a=1;
		// short b=a; //CTE (PLC DOUBLE TO SHORT)
		// int c=a;   //CTE (PLC DOUBLE TO INT)
		// long d=a;  //CTE (PLC DOUBLE TO LONG)
		// float e=a; //CTE (PLC DOUBLE TO FLOAT)
		// byte f=a;  //CTE (PLC DOUBLE TO BYTE)
		// char g=a;  //CTE (PLC CHAR TO CHAR)
	}
}

class CharExe 
{
	public static void main(String[] args) 
	{
		char a=1;
		// byte b=a;   //CTE (PLC CHAR TO BYTE)
		// short c=a;  //CTE (PLC CHAR TO SHORT)
		int d=a;
		long e=a;
		float f=a;
		double g=a;

	}
}


