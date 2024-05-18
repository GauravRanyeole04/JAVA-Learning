import java.util.*;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		int prdt=1;

		while (num>0)
		{
			int rem=num%10;
			sum=rem+sum;
			prdt=prdt*rem;
			num/=10;
		}
		System.out.println((sum==prdt)?dup+" is a Spy Number":dup+" is Not a Spy Number");
	}
}
