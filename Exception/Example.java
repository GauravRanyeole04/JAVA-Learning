import java.util.Scanner ;
class Example 
{
	public static void main(String[] args) 
	{
		System.out.println("Hii");
		try{
			System.out.println("outer try");
			try{
					System.out.println("Inner try");
					System.out.println(10/0);
			}
			catch(NullPointerException e)
			{
				System.out.println("Inner Catch Block");
			}
		}
		catch(ArithmeticException i){
			System.out.println("AE Handle Catch");
		}
		catch(Exception i)
		{
			System.out.println("Outer Catch");
		}
	}
}

class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		try{
			System.out.println(num/0);
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
	}
}