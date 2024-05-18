class PrintNumber
{
	static int number=1;
	public static void main(String[] args) 
	{
		printNumber();
	}
	public static void printNumber ()
	{

		System.out.println(number+" ");
		if (number==10)          //based condition 
			return;
		number++;
		
		printNumber();
	}
}
