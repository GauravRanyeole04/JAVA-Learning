import java.util.Scanner;

class ScannerEx
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Name : ");
	String name = sc.next().toLowerCase();
	char ch = name.charAt(0);
	System.out.println("hi my name is "+ name +" and my 1st Char of name is : "+ ch);
	
	if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("Character "+ ch + " is vowel");
		}
	else
		{
			System.out.print("Character "+ ch + " is consonent");
		}
	}
}


class Subtotal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Subtaotal value : ");
		double subTotal=sc.nextDouble();
		System.out.print("Enter Tip %  : ");
		double tipRate=sc.nextDouble();

		double Total=(subTotal+ ((subTotal/100)*tipRate));
		System.out.print("your Subtotal value is "+subTotal+" and tip rate is "+tipRate+" overall bill = "+Total);
	}
}


class Feet
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a  value for feet : ");
		double feet=sc.nextDouble();

		double meters=feet*0.305;
		System.out.print(feet+" feet is " +meters+" meters");


	}
}


class Pounds
{
	public static void main (String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print(" Enter a number in pounds :");
	double pound=sc.nextDouble();
	double kg=pound*0.454;
	System.out.print(  pound +" pounds is "+kg+" kilograms");
	}
}


class SumDigits // Addition of given number
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value between 0 and 1000 : ");
		int num =sc.nextInt();
		int dup =num;
		int sum =0;
		sum = sum+num%10;
		num =num/10;
		sum = sum+num%10;
		num =num/10;
		sum = sum+num%10;		
		System.out.print(" The Sum of the digit is : " +sum +" and number is " + dup);
	}
}


class NoOfYear // calculate the year and dates from given minutes 	
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);           
		System.out.print(" Enter the Number of minutes : ");
		int min=sc.nextInt();
		
		int year=min/525600;
		int days=(min-year*525600)/(24*60);
		
		System.out.println(min +"  minutes is approximately "+ year+" year and  "+days+" days. ");
	}
}






