import java.util.*;
class MethodExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		int num=sc.nextInt();
		myMethod1(num);
	}


		public static void myMethod1(int num)
		{
			if (num%2==0)
			{
				System.out.print(num+" is a even Number ");
			}else {
				System.out.println(num+" is a Odd Number");
			}
		}
}

