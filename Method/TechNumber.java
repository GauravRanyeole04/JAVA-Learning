import java.util.*;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();

		sqrt(num);
		length(sqrt(num));
		int sqrt=sqrt(num);
		int a=length(sqrt);
		int div=1;

		if(a%2==0)
		{
			for(int i=1;i<=a/2;i++)
			{
			    div=div*10;
			}
			int firsthalf=sqrt%div;
			int secondhalf=sqrt/div;
			int sum=firsthalf+secondhalf;
			System.out.print((sum==num)?" Tech Number": " Not a Tech Number");
		}
		else 
		{
			System.out.print(num+" is Not a Tech Number.");
		}

	}

	public static int sqrt(int num)
	{
		int sqrt=num*num;
		return sqrt;
	}

	public static int length(int sqrt)
	{
		int length=0;
		while (sqrt>0)
		{
			length++;
			sqrt/=10;
		}
		return length;
	}
}