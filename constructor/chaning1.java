class chaning1
{
	static int num=1;

	void oddNumber()
	{
			if (num%2!=0)
			System.out.print(num+" ");
			num++;	
			if (num>=100)
				return;
			hello();	
			oddNumber();
	}

	void hello ()
	{
		System.out.println();
	}
	public static void main(String[] args) 
	{
		chaning1 obj=new chaning1();
		obj.oddNumber();		
	}
}