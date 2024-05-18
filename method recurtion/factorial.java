import java.util.*;
class factorial
{
	static int num;
	static int fact=1;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		num=sc.nextInt();
		factorial();
		System.out.println(fact);
	}

	public static void factorial()
	{
		fact=fact*num;
		num--;
		if (num==0)
			return;
		factorial();
	}
}