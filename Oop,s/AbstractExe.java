abstract class Arithmatic 
{
	abstract int addition(int num1,int num2);
	abstract int substraction(int num1,int num2);
	abstract int multiplication(int num1,int num2);
	abstract int division(int num1,int num2);
	abstract int modulus(int num1,int num2);
}

class ArithmaticImplementation extends Arithmatic
{
	int addition(int num1,int num2)
	{
		return (num1+num2);
	}

	int substraction(int num1,int num2)
	{
		return (num1-num2);
	}

	int multiplication(int num1,int num2)
	{
		return (num1*num2);
	}

	int division(int num1,int num2)
	{
		return (num1/num2);
	}

	int modulus(int num1,int num2)
	{
		return (num1%num2);
	}
}

class ArithmaticDriver
{
	public static void main(String[] args) 
	{
		ArithmaticImplementation obj = new ArithmaticImplementation();
		System.out.println("Addition : "+obj.addition(10,20));
		System.out.println("Substraction : "+obj.substraction(10,20));
		System.out.println("Multiplication : "+obj.multiplication(10,20));
		System.out.println("Division : "+obj.division(20,10));
		System.out.println("Modulus : "+obj.modulus(10,20));

	}
}
