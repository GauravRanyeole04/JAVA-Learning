import java.util.*;
class WhileLength
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int length=0;
		while(num>0)
		{
			length++;
			num/=10;
		}
		System.out.println(length);
	}
}

class WhilePower
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int length=0;
		int power=1;
		while(num>0)
		{
			length++;
			num/=10;
		}
		for (int i=1;i<=length ;i++ ) 
		{
			power=power*dup;
		}
		System.out.println(power);
	}
}


