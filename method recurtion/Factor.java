import java.util.*;
class Factor
{
	static int num;
	static int fact=1;
	static int i=1;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter a Number : ");
		num=sc.nextInt();
		isFactor();
	}

	public static void isFactor()
	{
		fact=i*num;
		if(num%i==0)
		{
			System.out.println(i+" ");
		}
		i++;
		if (i>num)
			return;
		isFactor(	);
	}
} 