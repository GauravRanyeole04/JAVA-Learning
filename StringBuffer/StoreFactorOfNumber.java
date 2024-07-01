import java.util.Scanner;
class StoreFactorOfNumber
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();

		StringBuffer factors = new StringBuffer();

		for(int i=1;i<=num;i++)
		{

			if(num%i==0)
			{
				factors.append(i+"\n");
			}
		}
		System.out.println(factors);
	}
} 