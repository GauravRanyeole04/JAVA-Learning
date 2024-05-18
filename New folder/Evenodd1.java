import java.util.Scanner;
class Evenodd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num=sc.nextInt();
		//System.out.print(((num/2)*2==num)?"Even":"Odd");
		System.out.print((num/2.0)==(num/2)?"Even":"odd");
	}
}

class Alphabet
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch=sc.next().charAt(0);
		System.out.print(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>=65&&ch<=95)?"uppeercase":"lowercase"):"Not an Alphabet");
	}
}

class MinValue
{
	public static void main(String[] args) 
	{
	 	int num1=2;
	 	int num2=5;
	 	int num3=-2;
	 	System.out.print((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3)));
	}
}

class MaxValue
{
	public static void main(String[] args) {
		int num1=-55;
		int num2=188888;
		int num3=999999999;
		System.out.print((num1>num2)?(num1):(num2>num3)?(num2):(num3>num1)?(num3):(num1));
	}
}