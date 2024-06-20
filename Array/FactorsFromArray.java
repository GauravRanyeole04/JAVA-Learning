import java.util.*;
class FactorsFromArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find factors : ");
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
				// System.out.println(i);
			}
		}

		int []factorArray = new int[count];
		int itt1=0;
		for (int j=1;j<=number;j++) 
		{
			if(number%j==0)
			{
				factorArray[itt1++]=j;
			}
		}
		System.out.println(Arrays.toString(factorArray));
	}
}