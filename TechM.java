import java.util.Scanner;
class TechM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num : ");
	    int num=sc.nextInt();
		int sum=0;

		while(num!=0)
		{
			int rem=num%10;
			if(isPrime(rem))
			{
				sum+=rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int num)
	{
		boolean flag=true;

		if(num<2)
		{
			return false;
		}

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}	
		return flag;
	}
}