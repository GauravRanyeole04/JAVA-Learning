class Decrement
{
	public static void main(String[] args) 
	{
		int a=4;
		System.out.print(++a + a-- + a++ + --a);  //18
	}
}

class Decrement1
{
	public static void main(String[] args) 
	{
		int a=2;
		int b=a--;
		int c=++a;
		System.out.print(a+b+c);  //6
	}
}

class Decrement2
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=++a;
		int c=--b;
		System.out.print(++a + a-- + b-- + --c);  //15
	} 
}
class Decrement3
{
	public static void main(String[] args) 
	{
		int a='a';
		int b=--a;
		int c='a';
		System.out.print(a++ + 'a' + --b + --c);  //384
	}
}

class Decrement4
{
	public static void main(String[] args) 
	{
		char ch='a';
		int a=++ch;
		int b=--ch;
		int c=ch++;
		System.out.print(ch++ + a + b-- + --c +c);  //485
	}
}

class Decrement5
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=--a;
		int c=--b;
		int d=--a;
		System.out.print(a-- -  --b  - d - c--); //-1
	}
}

class Decrement6
{
	public static void main(String[] args) 
	{
		int a=2;
		int b=--a;
		int c=++a;
		int d=a++;
		System.out.print(++a + ++c + b++ + d);  //10
	}
}