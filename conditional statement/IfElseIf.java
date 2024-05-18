import java.util.Scanner;
class Eligibilty1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Your Age: ");
		int age=sc.nextInt();
		
		System.out.print(" Enter Your property: ");
		double property=sc.nextDouble();
		if (age>=21&&property>=10000000)
			{
				System.out.println(" you are eligible for marry  "); 
			}
			else if (age<=21 && property<=10000000)
			{
				System.out.println("You are NOT eligibel for marry ");
				System.out.println(" Try with your Sirname..");
				System.out.print(" Enter Your surname: ");
				String surname=sc.next().toUpperCase();	
			    if(surname.equals("AMBANI"))
				{	 
				System.out.println(" you are Eligible");
				}
			else 
				{
				System.out.print("you are NOT eligibel for marry ");
				}
			}
		}
	}	

class IfElseIfStatement
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.print("hello");
		}
		else if(false)
		{
			System.out.print("Hello From else if block 1");
		}
		else if(false)
		{
			System.out.print("Hello from else if block 2");
		}
		else {
		 	System.out.print("HEllo from else block ");
		}
	}
}

