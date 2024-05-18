class Increment

{
	public static void main(String[] args)
	{
		int a=15;
		int b=20;
		int c=a++;
		int d=++b;
		int e=c++;
		int f=++e;
		System.out.print( c++ + d++ - e++ + ++f + d++ +a++ + b++ +e+ ++d );
		// System.out.print(a );	
	}
}
class example 
{
	public static void main(String[] args) {
		int a=4;
		int b=++a;
		System.out.print(a+ ++a +b);
	}
}

class Example3
{
	public static void main(String[] args) {
		int a=15;
		int b=20;
		int c=a++;
		int d=++b;
		int e=c++;
		int f=++a;
		System.out.print( c++ + d++ - e++ + ++f + d++ +a++ + d++ +e+ ++d );
	}
}