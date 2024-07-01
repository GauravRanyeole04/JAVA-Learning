interface Artithmatic 
{
	int add(int a,int b);
	int multi(int a,int b);
}

class ArithmaticImplementation implements Artithmatic
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int multi(int a,int b)
	{
		return a*b;
	}
}

class Driver 
{
	public static void main(String[] args) 
	{
		ArithmaticImplementation obj = new ArithmaticImplementation();
		System.out.println("Addition : "+obj.add(10,20));
		System.out.println("Multiplication : "+obj.multi(2,3));
	}
}