import java.util.Scanner;
class SwitchEx
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value ");
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("hello 1");break;
		case 2 : System.out.println("hello 2");break;
		case 3 : System.out.println("hello 3");break;
		case 4 : System.out.println("hello 4");break;
		case 5 : System.out.println("hello 5");break;
		default:System.out.println("default block");
		}
	}
}

class SwitchEx1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value ");
		byte a=sc.nextByte();
		// byte a=127;
		switch(a+0)
		{
		case 1 : System.out.println("hello 1");break;
		case 2 : System.out.println("hello 2");break;
		case 3 : System.out.println("hello 3");break;
		case 4 : System.out.println("hello 4");break;
		case 5 : System.out.println("hello 5");break;
		case 128: System.out.println("hello 128");break;
		default:System.out.println("default block");
		}
	}
}

// class hello
//  {
//  	public static void main(String[] args) {
//  		int a=1;
//  		switch(a)
//  		{ 
//  		case 1:System.out.println(" case 1");break;
//  			System.out.print("hello");
//  		}
 		

//  	}
//  }

class Switchfinal
 {
 	public static void main(String[] args) 
 	{
 		int a=10;
 		final int b=65;
 		switch(a)
 		{
 		case 1:System.out.print("case 1");break;
 		case 2:System.out.print("case 2");break;
 		case 10:System.out.print("case 10");break;
 		case 'b':System.out.print("case B");break;
 		case 66:System.out.print("case A");break;
 		}
 	}
 }

class Example 
{
	public static void main(String[] args) {
		byte a=1;
		switch (a+0)
		{
		case 1: System.out.print(" case 1");
		case 2: System.out.print(" case 2");break;
		case 3: System.out.print(" case 3");break;
		case 128: System.out.print(" case 128");break;
		default: System.out.print(" default value ");
		}
	}
}

class SwitchExample 
{
	public static void main(String[] args) {
		byte a=1;
		switch (a+1)
		{
		case 1:System.out.print(" Hello 1");break;
		case 'b':System.out.print(" Hello b");break;
		case 'c':System.out.print(" Hello B");break;
		default:System.out.println(" default");break;
		}
		
	}
}