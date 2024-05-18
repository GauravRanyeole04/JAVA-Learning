import java.util.*;

class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count==0?"prime": "not a prime");
	}
}

