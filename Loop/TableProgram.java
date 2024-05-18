import java.util.*;
class TableProgram                    //22-03-2024
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Number To create a Table: ");
		int num=sc.nextInt();
		for (int i=1;i<=10;i++ ) 
		{
			System.out.println(num+"*"+i+"= "+(num*i));
		}
	}
}

class LengthOfNumber
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print(" Enter the Number : ");
	int num=sc.nextInt();
	int length=0;
		for (int i=num;i>0 ;i/=10 ) 
		{
			length++;
		}
	System.out.println(num+" no. length is "+length);
	}
}

