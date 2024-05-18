class Even 
{
	static int num=1;
	
	public static void main(String[] args) 
	{
		evenNumber();	
	}

	public static void evenNumber()
	{
		if (num%2==0)
		{
			System.out.print(num+"  ");
		}
		num++;
		if (num>100)
			return;
		evenNumber();
	}
}