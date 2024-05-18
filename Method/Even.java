class Even
{
	public static void main(String[] args) 
	{
		for(int num=1;num<=50;num++)
		{
		myMethod(num);			
		}
	}
	public static int myMethod(int num)
	{		
			if(num%2==0)
			{
				System.out.println(num+" -Even");
			}
			else {
				System.out.println(num+" -odd");
			}
			return num;
	}
}
