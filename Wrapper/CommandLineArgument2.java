import java.util.Arrays;
class CommandLineArgument2   //we have to pass the data at run time of program 
{
	public static void main(String[] args) 
	{
		int num1 =Integer.parseInt(args[0]);
		int num2 =Integer.parseInt(args[1]);

		int add=num1+num2;
		System.out.println("Addition is : "+add);
	}
}