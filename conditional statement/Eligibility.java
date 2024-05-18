import java.util.Scanner;
class Eligibility
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print(" Enter your Age : ");
		int age=sc.nextInt();
		System.out.print(" Enter Your Property : ");
		double property=sc.nextDouble();
		sc.nextLine();
		System.out.print( " Enter Your Surname : ");
		String surname=sc.next().toUpperCase();

		if(((age>=21 && property>=10000000) || surname.equals("AMBANI")))
		{
			System.out.println( " Eligibel for marrige");
		}	
		else
		{
			System.out.println( " Not Eligibel for Marrige");
		}
	}
}

class Salary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Your last Month Salary : ");
		double salary=sc.nextDouble();
		System.out.print( " Enter Your Target Score in a Month : ");
		double score=sc.nextDouble();
		double percent=(salary/100);
		if(score>=90)
		{
			System.out.println(" Your Salary increased By 3% ");
			System.out.print(" now you get " + (salary+percent*3));
		}
		else
		{
			System.out.println(" you increased by 1% ");
			System.out.print(" now you get "+(salary+percent));
		}
	}
}

class Interview
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Your Name : ");
		String name=sc.nextLine().toUpperCase();
		System.out.print(" Enter Your Percentage : ");
		double percent=sc.nextDouble();
		if(percent>=60)
		{
			System.out.println(" Student is Eligible For Interview ");
		}
		else 
		{
			System.out.println(" Student is NOT Eligible For Interview");
		}
	}
}

class IdentifyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		if((num%2)==0)
		{
			System.out.println(" The num is Even ");
		}
		else
		{
			System.out.println(" The Number is ODD ");
		}
	}
}

class PositiveNegative
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int  num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" Number is Positive ");
		}
		else if(num==0)
		{
			System.out.println(num+" Number is Nutral");
		}
		else
		{
			System.out.print(num+" Number is Negative");
		}

	}
}