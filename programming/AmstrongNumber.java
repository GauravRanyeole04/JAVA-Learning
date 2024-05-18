import java.util.*;
class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int dup1=num;

		int length=0;
		int sum=0;

		while (num>0)
		{
			length++;
			num/=10;
		}
		while(dup>0)
		{
			int rem=dup%10;
			int power=1;

			for (int i=1;i<=length;i++)
			{
				power=power*rem;
			}
			sum+=power;
			dup/=10;
		}
		if (dup1==sum)
		{
			System.out.print(dup1+" is a Amstrong Number");
		}
		else {
			System.out.print(dup1+" is not a Amstrong Number");
		}
	}
}

