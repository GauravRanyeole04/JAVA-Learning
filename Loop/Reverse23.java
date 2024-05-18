import java.util.*;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int rev=0;

		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
	}
}

class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		int num=sc.nextInt();
		String rev=" ";

		while (num>0)
		{
			int rem=num%10;
			rev=rev+rem;
			num/=10;
		}
		System.out.println(rev);
	}
}

class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;

		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.print((dup==rev)?dup+" is a Palindrome Number":dup+" is a Not Palindrome Number ");
	}
}

class NumberToWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		String word="";

		while(num>0)
		{
			int rem=num%10;
			switch(rem)
			{
			case 0:word="Zero "+word;break;
			case 1:word="One "+word;break;
			case 2:word="Two "+word;break;
			case 3:word="Three "+word;break;
			case 4:word="Four "+word;break;
			case 5:word="Five "+word;break;
			case 6:word="Six "+word;break;
			case 7:word="Seven "+word;break;
			case 8:word="Eight "+word;break;
			case 9:word="Nine "+word;break;
			}
			num/=10;

		}
		System.out.println(word);
	}
}

class SumOfDigits 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.print(sum);
	}
}

class LeapYear 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Year : ");
		int year=sc.nextInt();

		// System.out.print(" Enter the Number of Days in this year : ");
		// int days=sc.nextInt();
		// System.out.print((days==366)?year +" is a Leap Year":year+" is NOT a Leap Year");

		if(year%4!=0)
		{
			System.out.print(year +" is Not a Leap Year.");
		}
		else
			System.out.print(year + " is a Leap Year."); 
	}
}

// class Length 
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print(" Enter Number : ");
// 		int num=sc.nextInt();
// 		int length=0;
// 		for (int i=num;i>0;i/=10)
// 		{
// 			length++;
// 		}
// 		System.out.println(length);
// 	}
// }