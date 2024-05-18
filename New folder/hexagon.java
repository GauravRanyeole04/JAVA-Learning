import java.util.Scanner;
class hexagon
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Side : ");
		Double s=sc.nextDouble();
		// double a=Math.sqrt(3);
		// double area=(3*a/2)*(s*s);
		double area=2.598*(s*s);
		System.out.print("The Area of hexagon is : "+area); 
	}
}

class annualint
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter balance : ");
		double balance=sc.nextDouble();
		System.out.print(" Enter annual Interest Rate : ");
		double annual=sc.nextDouble();
		// double Interest=balance*(annual/1200);
		System.out.print("The Interest is : " + balance*(annual/1200));
	}
}

class Driving
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the driving distance : ");
		double dist=sc.nextDouble();
		System.out.print(" Enter miles per gallon : ");
		double miles=sc.nextDouble();
		System.out.print(" Enter price per gallon : ");
		double price=sc.nextDouble();
		// int s=(dist*price/miles);
		System.out.print(" The cost of driving is $"+(dist*price/miles));
	}
}


class Bmi
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter weight in pound : ");	
		double weight=sc.nextDouble();
		System.out.print(" Enter height in inches : ");
		double height=sc.nextDouble();
		double p= 0.45359237;
		double i= 0.0254;
		double bmi=((p*weight)/((i*height)*(i*height)));
		System.out.print(" BMI is "+bmi);
	}
}


class InvestmentValue
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter investment amount :  ");
		float invest=sc.nextFloat();
		System.out.print(" Enter annual Interest rate in percentage : ");
		float rate=sc.nextFloat();
		System.out.print(" Enter number of Month : ");
		int month=sc.nextInt();
		float accumulated=(invest*(1+rate/100)*(month));
		System.out.println(" Accumulated Value is "+accumulated);
	}
}

class Addition 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number : "); 
		int s=sc.nextInt();
		int numb1=0;
		int numb1=s%10;
		int numb1=s/10;
		int numb1=s%10;
		System.out.println(numb1);
	}
}
