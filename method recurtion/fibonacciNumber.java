import java.util.*;
class fibonacciNumber 
{
	static int num;
	static  int num1=1;
	static 	int num2=1;
	static 	int i=1;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter Number for find fibonacci Number series : ");
		num=sc.nextInt();
		fibonacciNum();
	}

	public static void fibonacciNum()
	{  
		if (i>num)
			return;

			System.out.print(num1+" ");		
			int num3=num1+num2;
			num1=num2 ;
			num2=num3;
			i++;		
			fibonacciNum();
	}
}
