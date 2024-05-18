import java.util.*;
class ReturnEx1
{
	public static void main(String[] args) 
	{
		m1();
	}
	public static void m1()
	{
		System.out.println(" TASK 1");
		System.out.println(" TASK 2");
		System.out.println(" TASK 3");
	}
}


// class ReturnEx2
// {
// 	public static void main(String[] args)     //unreachable statement
// 	{
// 		m1();
// 	}
// 	public static void m1()
// 	{
// 		System.out.println(" TASK 1");
// 		System.out.println(" TASK 2");
// 		return;
// 		System.out.println(" TASK 3");
// 	}
// }


class ReturnEx3
{
	public static void main(String[] args) 
	{
		int num=7;
		m1(num);
	}

	public static void m1(int num)
	{
		if (num%2==0)
		{
			System.out.println(num+" is a Even Number.");
			// return;
		}
		else 
		{
			System.out.println(num+" is a Odd Number.");
			return;
		}

		System.out.println(" Execution Stop");
	}
}


class ReturnEx4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		m1(num);
	}

	public static void m1(int num)
	{
		if (num%2==0)
		{
			System.out.println(num+" is a Even Number.");
			return;
		}
		else 
		{
			System.out.println(num+" is a Odd Number.");
		}

		System.out.println(" Execution Stop");
	}
}