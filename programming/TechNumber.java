class TechNumber
{
	public static void main(String[] args) 
	{
		int num=45;
		int sqr=num*num;
		int dup=num;
		int length=0;
		int div=1;

		while(sqr!=0)
		{
			length++;
			sqr/=10;
		}

		if(length%2==0)
		{
			for (int i=1;i<=length/2;i++ ) 
			{
				div=div*10;
			}

			int firsthalf=sqr/div;
			int secondhalf=sqr%div;
			int sum=firsthalf+secondhalf;
			System.out.print((sum==sqr)?dup+" is a Tech Number":dup+" is not a Tech Number");
		} 
		else{
			System.out.print(dup+" is can't Seperate , not a Tech Number");
		}
	}
}
		