import java.util.*;
class Prime
{
	static int num;
	static int i=2;
	static boolean flag=true;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter a Number : ");
		num=sc.nextInt();
		isPrime();
		System.out.print(flag?num+"- Prime": num+"- Not a prime Number");
		
	}

	public static void isPrime()
	{
		if(i==num)
			return;

		if (num%i==0)
		{
			flag=false;
			return;
		}
		i++;
		isPrime();
	}
} 