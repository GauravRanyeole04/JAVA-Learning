class Prime 
{
	public static void main(String[] args) 
	{
		for (int i=2;i<=20;i++)
		{
		isPrime(i);			
		}
	}

	public static void isPrime(int num)
	{
		boolean flag=true;

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}		
		// System.out.println((flag)?(i+" -Prime "):(i+" -Not a Prime Number "));
		if(flag){
			System.out.println(num+" -Prime ");
		}else{
			System.out.println(num+" -Not Prime");
		}
	}
}
